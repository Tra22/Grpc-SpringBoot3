package com.tra21.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: profile.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProfileServiceGrpc {

  private ProfileServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.tra21.grpc.ProfileService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tra21.grpc.PaginationReq,
      com.tra21.grpc.ProfilePage> getGetProfilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProfiles",
      requestType = com.tra21.grpc.PaginationReq.class,
      responseType = com.tra21.grpc.ProfilePage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tra21.grpc.PaginationReq,
      com.tra21.grpc.ProfilePage> getGetProfilesMethod() {
    io.grpc.MethodDescriptor<com.tra21.grpc.PaginationReq, com.tra21.grpc.ProfilePage> getGetProfilesMethod;
    if ((getGetProfilesMethod = ProfileServiceGrpc.getGetProfilesMethod) == null) {
      synchronized (ProfileServiceGrpc.class) {
        if ((getGetProfilesMethod = ProfileServiceGrpc.getGetProfilesMethod) == null) {
          ProfileServiceGrpc.getGetProfilesMethod = getGetProfilesMethod =
              io.grpc.MethodDescriptor.<com.tra21.grpc.PaginationReq, com.tra21.grpc.ProfilePage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProfiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tra21.grpc.PaginationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tra21.grpc.ProfilePage.getDefaultInstance()))
              .setSchemaDescriptor(new ProfileServiceMethodDescriptorSupplier("GetProfiles"))
              .build();
        }
      }
    }
    return getGetProfilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tra21.grpc.ProfileId,
      com.tra21.grpc.ProfileDto> getGetProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProfile",
      requestType = com.tra21.grpc.ProfileId.class,
      responseType = com.tra21.grpc.ProfileDto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tra21.grpc.ProfileId,
      com.tra21.grpc.ProfileDto> getGetProfileMethod() {
    io.grpc.MethodDescriptor<com.tra21.grpc.ProfileId, com.tra21.grpc.ProfileDto> getGetProfileMethod;
    if ((getGetProfileMethod = ProfileServiceGrpc.getGetProfileMethod) == null) {
      synchronized (ProfileServiceGrpc.class) {
        if ((getGetProfileMethod = ProfileServiceGrpc.getGetProfileMethod) == null) {
          ProfileServiceGrpc.getGetProfileMethod = getGetProfileMethod =
              io.grpc.MethodDescriptor.<com.tra21.grpc.ProfileId, com.tra21.grpc.ProfileDto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tra21.grpc.ProfileId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tra21.grpc.ProfileDto.getDefaultInstance()))
              .setSchemaDescriptor(new ProfileServiceMethodDescriptorSupplier("GetProfile"))
              .build();
        }
      }
    }
    return getGetProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tra21.grpc.CreateProfile,
      com.tra21.grpc.ProfileDto> getCreateProfileProofMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProfileProof",
      requestType = com.tra21.grpc.CreateProfile.class,
      responseType = com.tra21.grpc.ProfileDto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.tra21.grpc.CreateProfile,
      com.tra21.grpc.ProfileDto> getCreateProfileProofMethod() {
    io.grpc.MethodDescriptor<com.tra21.grpc.CreateProfile, com.tra21.grpc.ProfileDto> getCreateProfileProofMethod;
    if ((getCreateProfileProofMethod = ProfileServiceGrpc.getCreateProfileProofMethod) == null) {
      synchronized (ProfileServiceGrpc.class) {
        if ((getCreateProfileProofMethod = ProfileServiceGrpc.getCreateProfileProofMethod) == null) {
          ProfileServiceGrpc.getCreateProfileProofMethod = getCreateProfileProofMethod =
              io.grpc.MethodDescriptor.<com.tra21.grpc.CreateProfile, com.tra21.grpc.ProfileDto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProfileProof"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tra21.grpc.CreateProfile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tra21.grpc.ProfileDto.getDefaultInstance()))
              .setSchemaDescriptor(new ProfileServiceMethodDescriptorSupplier("CreateProfileProof"))
              .build();
        }
      }
    }
    return getCreateProfileProofMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tra21.grpc.UpdateProfile,
      com.tra21.grpc.ProfileDto> getUpdateProfileProofMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProfileProof",
      requestType = com.tra21.grpc.UpdateProfile.class,
      responseType = com.tra21.grpc.ProfileDto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.tra21.grpc.UpdateProfile,
      com.tra21.grpc.ProfileDto> getUpdateProfileProofMethod() {
    io.grpc.MethodDescriptor<com.tra21.grpc.UpdateProfile, com.tra21.grpc.ProfileDto> getUpdateProfileProofMethod;
    if ((getUpdateProfileProofMethod = ProfileServiceGrpc.getUpdateProfileProofMethod) == null) {
      synchronized (ProfileServiceGrpc.class) {
        if ((getUpdateProfileProofMethod = ProfileServiceGrpc.getUpdateProfileProofMethod) == null) {
          ProfileServiceGrpc.getUpdateProfileProofMethod = getUpdateProfileProofMethod =
              io.grpc.MethodDescriptor.<com.tra21.grpc.UpdateProfile, com.tra21.grpc.ProfileDto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProfileProof"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tra21.grpc.UpdateProfile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tra21.grpc.ProfileDto.getDefaultInstance()))
              .setSchemaDescriptor(new ProfileServiceMethodDescriptorSupplier("UpdateProfileProof"))
              .build();
        }
      }
    }
    return getUpdateProfileProofMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProfileServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfileServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfileServiceStub>() {
        @java.lang.Override
        public ProfileServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfileServiceStub(channel, callOptions);
        }
      };
    return ProfileServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProfileServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfileServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfileServiceBlockingStub>() {
        @java.lang.Override
        public ProfileServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfileServiceBlockingStub(channel, callOptions);
        }
      };
    return ProfileServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProfileServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProfileServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProfileServiceFutureStub>() {
        @java.lang.Override
        public ProfileServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProfileServiceFutureStub(channel, callOptions);
        }
      };
    return ProfileServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getProfiles(com.tra21.grpc.PaginationReq request,
        io.grpc.stub.StreamObserver<com.tra21.grpc.ProfilePage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProfilesMethod(), responseObserver);
    }

    /**
     */
    default void getProfile(com.tra21.grpc.ProfileId request,
        io.grpc.stub.StreamObserver<com.tra21.grpc.ProfileDto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProfileMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.tra21.grpc.CreateProfile> createProfileProof(
        io.grpc.stub.StreamObserver<com.tra21.grpc.ProfileDto> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateProfileProofMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.tra21.grpc.UpdateProfile> updateProfileProof(
        io.grpc.stub.StreamObserver<com.tra21.grpc.ProfileDto> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUpdateProfileProofMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProfileService.
   */
  public static abstract class ProfileServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProfileServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProfileService.
   */
  public static final class ProfileServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProfileServiceStub> {
    private ProfileServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfileServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProfiles(com.tra21.grpc.PaginationReq request,
        io.grpc.stub.StreamObserver<com.tra21.grpc.ProfilePage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProfilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProfile(com.tra21.grpc.ProfileId request,
        io.grpc.stub.StreamObserver<com.tra21.grpc.ProfileDto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.tra21.grpc.CreateProfile> createProfileProof(
        io.grpc.stub.StreamObserver<com.tra21.grpc.ProfileDto> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreateProfileProofMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.tra21.grpc.UpdateProfile> updateProfileProof(
        io.grpc.stub.StreamObserver<com.tra21.grpc.ProfileDto> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUpdateProfileProofMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProfileService.
   */
  public static final class ProfileServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProfileServiceBlockingStub> {
    private ProfileServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfileServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tra21.grpc.ProfilePage getProfiles(com.tra21.grpc.PaginationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProfilesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tra21.grpc.ProfileDto getProfile(com.tra21.grpc.ProfileId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProfileMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProfileService.
   */
  public static final class ProfileServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProfileServiceFutureStub> {
    private ProfileServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProfileServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tra21.grpc.ProfilePage> getProfiles(
        com.tra21.grpc.PaginationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProfilesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tra21.grpc.ProfileDto> getProfile(
        com.tra21.grpc.ProfileId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROFILES = 0;
  private static final int METHODID_GET_PROFILE = 1;
  private static final int METHODID_CREATE_PROFILE_PROOF = 2;
  private static final int METHODID_UPDATE_PROFILE_PROOF = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROFILES:
          serviceImpl.getProfiles((com.tra21.grpc.PaginationReq) request,
              (io.grpc.stub.StreamObserver<com.tra21.grpc.ProfilePage>) responseObserver);
          break;
        case METHODID_GET_PROFILE:
          serviceImpl.getProfile((com.tra21.grpc.ProfileId) request,
              (io.grpc.stub.StreamObserver<com.tra21.grpc.ProfileDto>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PROFILE_PROOF:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createProfileProof(
              (io.grpc.stub.StreamObserver<com.tra21.grpc.ProfileDto>) responseObserver);
        case METHODID_UPDATE_PROFILE_PROOF:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.updateProfileProof(
              (io.grpc.stub.StreamObserver<com.tra21.grpc.ProfileDto>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetProfilesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tra21.grpc.PaginationReq,
              com.tra21.grpc.ProfilePage>(
                service, METHODID_GET_PROFILES)))
        .addMethod(
          getGetProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tra21.grpc.ProfileId,
              com.tra21.grpc.ProfileDto>(
                service, METHODID_GET_PROFILE)))
        .addMethod(
          getCreateProfileProofMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.tra21.grpc.CreateProfile,
              com.tra21.grpc.ProfileDto>(
                service, METHODID_CREATE_PROFILE_PROOF)))
        .addMethod(
          getUpdateProfileProofMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.tra21.grpc.UpdateProfile,
              com.tra21.grpc.ProfileDto>(
                service, METHODID_UPDATE_PROFILE_PROOF)))
        .build();
  }

  private static abstract class ProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProfileServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tra21.grpc.Profile.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProfileService");
    }
  }

  private static final class ProfileServiceFileDescriptorSupplier
      extends ProfileServiceBaseDescriptorSupplier {
    ProfileServiceFileDescriptorSupplier() {}
  }

  private static final class ProfileServiceMethodDescriptorSupplier
      extends ProfileServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProfileServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProfileServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProfileServiceFileDescriptorSupplier())
              .addMethod(getGetProfilesMethod())
              .addMethod(getGetProfileMethod())
              .addMethod(getCreateProfileProofMethod())
              .addMethod(getUpdateProfileProofMethod())
              .build();
        }
      }
    }
    return result;
  }
}
