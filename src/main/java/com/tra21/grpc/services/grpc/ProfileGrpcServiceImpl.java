package com.tra21.grpc.services.grpc;

import com.tra21.grpc.CreateProfile;
import com.tra21.grpc.PaginationReq;
import com.tra21.grpc.ProfileDto;
import com.tra21.grpc.ProfileId;
import com.tra21.grpc.ProfilePage;
import com.tra21.grpc.ProfileServiceGrpc.ProfileServiceImplBase;
import com.tra21.grpc.UpdateProfile;
import com.tra21.grpc.mappers.PageMapper;
import com.tra21.grpc.mappers.ProfileMapper;
import com.tra21.grpc.services.IProfileService;
import com.tra21.grpc.stream.CreateProfileProofObserver;
import com.tra21.grpc.stream.UpdateProfileProofObserver;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@RequiredArgsConstructor
public class ProfileGrpcServiceImpl extends ProfileServiceImplBase {
    private final IProfileService profileService;
    private final ProfileMapper profileMapper;
    private final PageMapper pageMapper;

    @Override
    public void getProfiles(PaginationReq paginationReq, StreamObserver<ProfilePage> responseObserver){
        ProfilePage response = pageMapper.mapPageGrpcList(
                pageMapper.mapPageList(
                        profileService.pageOfProfiles(pageMapper.mapPage(paginationReq))
                )
        );
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getProfile(ProfileId profileId, StreamObserver<ProfileDto> responseObserver) {
        ProfileDto response = profileMapper.mapProfileGrpc(profileService.getProfile((long) profileId.getId()));
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public StreamObserver<CreateProfile> createProfileProof(StreamObserver<ProfileDto> responseObserver){
        return new CreateProfileProofObserver(responseObserver, profileService, profileMapper);
    }
    @Override
    public StreamObserver<UpdateProfile> updateProfileProof(StreamObserver<ProfileDto> responseObserver){
        return new UpdateProfileProofObserver(responseObserver, profileService, profileMapper);
    }
}
