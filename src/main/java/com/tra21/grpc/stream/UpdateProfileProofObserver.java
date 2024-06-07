package com.tra21.grpc.stream;

import com.tra21.grpc.ProfileDto;
import com.tra21.grpc.UpdateProfile;
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

@RequiredArgsConstructor
public class UpdateProfileProofObserver implements StreamObserver<UpdateProfile> {
    private com.tra21.grpc.dtos.requests.UpdateProfile updateProfile;
    private ByteArrayOutputStream imageBytes = null;
    private final StreamObserver<ProfileDto> responseObserver;
    private final IProfileService profileService;
    private final IUploadService uploadService;
    private final ProfileMapper profileMapper;

    @Override
    public void onNext(UpdateProfile value) {
        this.updateProfile = this.profileMapper.mapUpdateProfileGrpcReverse(value);
        if (value.hasField(UpdateProfile.getDescriptor().findFieldByName("image_file"))) {
            try {
                if(!value.getImageFile().isEmpty()) {
                    this.imageBytes = new ByteArrayOutputStream();
                    // Append the received bytes from the Image file
                    imageBytes.write(value.getImageFile().toByteArray());
                }
            } catch (IOException ignored) {
            }
        }
    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onCompleted() {
        ImageDto imageDto = null;
        if(this.imageBytes != null) {
            FileDto fileDto = CustomFileUtils.getFileMimeTypeFromBaseByteArray(imageBytes.toByteArray());
            imageDto = uploadService.uploadImage(UploadImagesDto.builder()
                    .byteArrayOutputStream(this.imageBytes)
                    .file(fileDto).build()
            );
            this.updateProfile.setProfileImage(imageDto.getPathFile());
        }
        ProfileDto response = profileMapper.mapProfileGrpc(profileService.updateProfile(this.updateProfile.getId(), this.updateProfile));
        response = response.toBuilder().setImagePath(imageDto == null ? null : imageDto.getPathFile()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
