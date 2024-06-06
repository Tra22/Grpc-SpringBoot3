package com.tra21.grpc.stream;

import com.tra21.grpc.ProfileDto;
import com.tra21.grpc.UpdateProfile;
import com.tra21.grpc.mappers.ProfileMapper;
import com.tra21.grpc.services.IProfileService;
import io.grpc.stub.StreamObserver;

public class UpdateProfileProofObserver implements StreamObserver<UpdateProfile> {
    private com.tra21.grpc.dtos.requests.UpdateProfile updateProfile;
    private final StreamObserver<ProfileDto> responseObserver;
    private final IProfileService profileService;
    private final ProfileMapper profileMapper;

    public UpdateProfileProofObserver(StreamObserver<ProfileDto> responseObserver, IProfileService profileService, ProfileMapper profileMapper) {
         this.responseObserver = responseObserver;
        this.profileService = profileService;
        this.profileMapper = profileMapper;
    }

    @Override
    public void onNext(UpdateProfile value) {
        this.updateProfile = this.profileMapper.mapUpdateProfileGrpcReverse(value);

    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onCompleted() {
        ProfileDto response = profileMapper.mapProfileGrpc(profileService.updateProfile(this.updateProfile.id(), this.updateProfile));
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
