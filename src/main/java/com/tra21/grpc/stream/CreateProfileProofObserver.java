package com.tra21.grpc.stream;

import com.tra21.grpc.CreateProfile;
import com.tra21.grpc.ProfileDto;
import com.tra21.grpc.dtos.global.requests.UploadImagesDto;
import com.tra21.grpc.dtos.global.responses.FileDto;
import com.tra21.grpc.dtos.global.responses.ImageDto;
import com.tra21.grpc.mappers.ProfileMapper;
import com.tra21.grpc.services.IProfileService;
import com.tra21.grpc.services.upload.interf.IUploadService;
import com.tra21.grpc.utils.CustomFileUtils;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
public class CreateProfileProofObserver  implements StreamObserver<CreateProfile> {
    private com.tra21.grpc.dtos.requests.CreateProfile createProfile;
    private ByteArrayOutputStream imageBytes = new ByteArrayOutputStream();

    private final StreamObserver<ProfileDto> responseObserver;
    private final IProfileService profileService;
    private final IUploadService uploadService;
    private final ProfileMapper profileMapper;

    @Override
    public void onNext(CreateProfile value) {
        this.createProfile = this.profileMapper.mapCreateProfileGrpcReverse(value);
        if (value.hasField(CreateProfile.getDescriptor().findFieldByName("image_file"))) {
            try {
                // Append the received bytes from the Image file
                imageBytes.write(value.getImageFile().toByteArray());
            } catch (IOException ignored) {
            }
        }
    }

    @Override
    public void onError(Throwable t) {
    }

    @Override
    public void onCompleted() {
        FileDto fileDto = CustomFileUtils.getFileMimeTypeFromBaseByteArray(imageBytes.toByteArray());
        ImageDto imageDto = uploadService.uploadImage(UploadImagesDto.builder()
                .byteArrayOutputStream(this.imageBytes)
                .file(fileDto).build()
        );
        this.createProfile.setProfileImage(imageDto.getPathFile());
        ProfileDto response = profileMapper.mapProfileGrpc(profileService.createProfile(this.createProfile));
        response = response.toBuilder().setImagePath(imageDto.getPathFile()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
