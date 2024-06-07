package com.tra21.grpc.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UpdateProfile {
   private Long id;
   private String firstName;
   private String lastName;
   private String profileImage;
}
