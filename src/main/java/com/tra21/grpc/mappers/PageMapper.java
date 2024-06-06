package com.tra21.grpc.mappers;

import com.tra21.grpc.dtos.global.requests.PaginationReq;
import com.tra21.grpc.dtos.global.responses.PaginationRes;
import com.tra21.grpc.dtos.responses.ProfileDto;
import com.tra21.grpc.dtos.responses.ProfilePage;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper(componentModel = "spring", uses = { ProfileMapper.class })
public abstract class PageMapper {
    @Autowired
    private ProfileMapper profileMapper;
    public abstract PaginationReq mapPage(com.tra21.grpc.PaginationReq paginationReq);
    public abstract com.tra21.grpc.PaginationRes mapPageResponse(PaginationRes paginationRes);
    public ProfilePage mapPageList(Page<ProfileDto> profileDtoPage){
        return ProfilePage.builder()
                .data(profileDtoPage.getContent())
                .paginationRes(
                        new PaginationRes(
                                profileDtoPage.getNumber(),
                                profileDtoPage.getSize(),
                                profileDtoPage.getTotalElements(),
                                profileDtoPage.getTotalPages()
                        )
                )
                .build();
    }
    public com.tra21.grpc.ProfilePage mapPageGrpcList(ProfilePage profilePage){
        List<com.tra21.grpc.ProfileDto> profilesDto = this.profileMapper.mapProfilesGrpc(profilePage.getData());
        return com.tra21.grpc.ProfilePage.newBuilder()
                .addAllData(profilesDto)
                .setPaginationRes(this.mapPageResponse(profilePage.getPaginationRes()))
                .build();
    };
}
