package com.tra21.grpc.services;

import com.tra21.grpc.dtos.global.requests.PaginationReq;
import com.tra21.grpc.dtos.requests.CreateProfile;
import com.tra21.grpc.dtos.responses.ProfileDto;
import com.tra21.grpc.dtos.requests.UpdateProfile;
import org.springframework.data.domain.Page;

public interface IProfileService {
    Page<ProfileDto> pageOfProfiles(PaginationReq paginationReq);
    ProfileDto getProfile(Long id);
    ProfileDto createProfile(CreateProfile createProfile);
    ProfileDto updateProfile(Long id, UpdateProfile updateProfile);
}
