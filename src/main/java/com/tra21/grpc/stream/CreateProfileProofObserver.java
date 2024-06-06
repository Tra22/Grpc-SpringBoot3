package com.tra21.grpc.stream;

import com.tra21.grpc.CreateProfile;
import com.tra21.grpc.ProfileDto;
import com.tra21.grpc.mappers.ProfileMapper;
import com.tra21.grpc.services.IProfileService;
import io.grpc.stub.StreamObserver;

public class CreateProfileProofObserver  implements StreamObserver<CreateProfile> {
    private com.tra21.grpc.dtos.requests.CreateProfile createProfile;
    private final StreamObserver<ProfileDto> responseObserver;
    private final IProfileService profileService;
    private final ProfileMapper profileMapper;

    public CreateProfileProofObserver(StreamObserver<ProfileDto> responseObserver, IProfileService profileService, ProfileMapper profileMapper) {
         this.responseObserver = responseObserver;
        this.profileService = profileService;
        this.profileMapper = profileMapper;
    }

    @Override
    public void onNext(CreateProfile value) {
        this.createProfile = this.profileMapper.mapCreateProfileGrpcReverse(value);
    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onCompleted() {
        ProfileDto response = profileMapper.mapProfileGrpc(profileService.createProfile(this.createProfile));
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
