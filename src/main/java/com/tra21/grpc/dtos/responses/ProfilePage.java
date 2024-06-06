package com.tra21.grpc.dtos.responses;

import com.tra21.grpc.dtos.global.responses.PageRes;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class ProfilePage extends PageRes<ProfileDto> {
}
