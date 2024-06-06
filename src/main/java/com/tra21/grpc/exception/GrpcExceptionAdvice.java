package com.tra21.grpc.exception;

import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StatusException;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;

@GrpcAdvice
public class GrpcExceptionAdvice {
    @GrpcExceptionHandler(IllegalArgumentException.class)
    public StatusException handleInvalidArgument(IllegalArgumentException e) {
        return handleExceptionAsGlobal(e);
    }
    @GrpcExceptionHandler(NotFoundException.class)
    public StatusException handleResourceNotFoundException(NotFoundException e){
        return handleExceptionAsGlobal(e);
    }

    @GrpcExceptionHandler(RuntimeException.class)
    public StatusException handleUnexpectedException(RuntimeException e) {
        return handleExceptionAsGlobal(e);
    }
    private StatusException handleExceptionAsGlobal(Throwable throwable) {
        Status status = Status.UNKNOWN.withDescription("Unexpected Error!");
        if(throwable instanceof NotFoundException notFoundException){
            status = Status.UNAVAILABLE.withDescription(notFoundException.getMessage()).withCause(notFoundException);
        }else if (throwable instanceof IllegalArgumentException illegalArgumentException){
            status = Status.INVALID_ARGUMENT.withDescription("Invalid Argument").withCause(illegalArgumentException);
        }
        else if(throwable instanceof RuntimeException runtimeException){
            status = Status.INTERNAL.withDescription("Server Error!");
        }
        return status.asException();
    }
}
