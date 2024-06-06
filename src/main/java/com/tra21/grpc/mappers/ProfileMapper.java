package com.tra21.grpc.mappers;

import com.tra21.grpc.dtos.requests.CreateProfile;
import com.tra21.grpc.dtos.requests.UpdateProfile;
import com.tra21.grpc.dtos.responses.ProfileDto;
import com.tra21.grpc.models.Profile;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class ProfileMapper {
    public abstract Profile map(ProfileDto profileDto);
    public abstract ProfileDto mapReverse(Profile profile);
    public abstract com.tra21.grpc.ProfileDto mapProfileGrpc(ProfileDto profileDto);
    public abstract List<com.tra21.grpc.ProfileDto> mapProfilesGrpc(List<ProfileDto> profileDtos);
    public abstract CreateProfile mapCreateProfileGrpcReverse(com.tra21.grpc.CreateProfile createProfile);
    public abstract UpdateProfile mapUpdateProfileGrpcReverse(com.tra21.grpc.UpdateProfile updateProfile);
    public abstract List<Profile> maps(List<ProfileDto> profileDtos);
    public abstract List<ProfileDto> mapsReverse(List<Profile> profiles);
    @Mapping(source = "profileImage", target = "profileImage", ignore = true)
    @Mapping(target="id", ignore = true)
    public abstract Profile mapCreate(CreateProfile createProfile);
    @Mappings({
            @Mapping(target="id", ignore = true),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "profileImage", target = "profileImage", ignore = true),
    })
    public abstract Profile mapUpdate(@MappingTarget Profile profile, UpdateProfile updateProfile);
}
