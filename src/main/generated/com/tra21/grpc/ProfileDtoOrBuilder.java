// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: profile.proto

package com.tra21.grpc;

public interface ProfileDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.tra21.grpc.ProfileDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string first_name = 2;</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 2;</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 3;</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 3;</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>bytes image_file = 4;</code>
   * @return The imageFile.
   */
  com.google.protobuf.ByteString getImageFile();
}
