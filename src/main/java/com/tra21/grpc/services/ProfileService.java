package com.tra21.grpc.services;

import com.tra21.grpc.dtos.global.requests.PaginationReq;
import com.tra21.grpc.dtos.requests.CreateProfile;
import com.tra21.grpc.dtos.requests.UpdateProfile;
import com.tra21.grpc.dtos.responses.ProfileDto;
import com.tra21.grpc.exception.NotFoundException;
import com.tra21.grpc.mappers.ProfileMapper;
import com.tra21.grpc.models.Profile;
import com.tra21.grpc.repositories.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileService implements IProfileService  {
    private final ProfileRepository profileRepository;
    private final ProfileMapper profileMapper;

    @Override
    public Page<ProfileDto> pageOfProfiles(PaginationReq paginationReq) {
        Pageable pageable = PageRequest.of(paginationReq.page(), paginationReq.size(), Sort.by("id").ascending());
        Page<Profile> pageOfProfiles = profileRepository.findAll(pageable);
        return new PageImpl<>(profileMapper.mapsReverse(pageOfProfiles.getContent()), pageable, pageOfProfiles.getTotalElements());
    }

    @Override
    public ProfileDto getProfile(Long id) {
        return profileMapper.mapReverse(getProfileByIdWithThrow(id));
    }

    @Override
    public ProfileDto createProfile(CreateProfile createProfile) {
        Profile profile = profileMapper.mapCreate(createProfile);
        profileRepository.save(profile);
        return profileMapper.mapReverse(profile);
    }

    @Override
    public ProfileDto updateProfile(Long id, UpdateProfile updateProfile) {
        Profile profileOri = getProfileByIdWithThrow(id);
        Profile profile = profileMapper.mapUpdate(profileOri, updateProfile);
        profileRepository.save(profile);
        return profileMapper.mapReverse(profile);
    }
    private Profile getProfileByIdWithThrow(Long id){
        return profileRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Profile Not Found."));
    }
}
