// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: profile.proto

package com.tra21.grpc;

public final class Profile {
  private Profile() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tra21_grpc_CreateProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tra21_grpc_CreateProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tra21_grpc_UpdateProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tra21_grpc_UpdateProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tra21_grpc_ProfileDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tra21_grpc_ProfileDto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tra21_grpc_PaginationReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tra21_grpc_PaginationReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tra21_grpc_PaginationRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tra21_grpc_PaginationRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tra21_grpc_ProfilePage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tra21_grpc_ProfilePage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tra21_grpc_ProfileId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tra21_grpc_ProfileId_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rprofile.proto\022\016com.tra21.grpc\"J\n\rCreat" +
      "eProfile\022\022\n\nfirst_name\030\001 \001(\t\022\021\n\tlast_nam" +
      "e\030\002 \001(\t\022\022\n\nimage_file\030\003 \001(\014\"V\n\rUpdatePro" +
      "file\022\n\n\002id\030\001 \001(\005\022\022\n\nfirst_name\030\002 \001(\t\022\021\n\t" +
      "last_name\030\003 \001(\t\022\022\n\nimage_file\030\004 \001(\014\"S\n\nP" +
      "rofileDto\022\n\n\002id\030\001 \001(\005\022\022\n\nfirst_name\030\002 \001(" +
      "\t\022\021\n\tlast_name\030\003 \001(\t\022\022\n\nimage_path\030\004 \001(\t" +
      "\"+\n\rPaginationReq\022\014\n\004page\030\001 \001(\005\022\014\n\004size\030" +
      "\002 \001(\005\"X\n\rPaginationRes\022\014\n\004page\030\001 \001(\005\022\014\n\004" +
      "size\030\002 \001(\005\022\026\n\016total_elements\030\003 \001(\005\022\023\n\013to" +
      "tal_pages\030\004 \001(\005\"n\n\013ProfilePage\0225\n\016pagina" +
      "tion_res\030\001 \001(\0132\035.com.tra21.grpc.Paginati" +
      "onRes\022(\n\004data\030\002 \003(\0132\032.com.tra21.grpc.Pro" +
      "fileDto\"\027\n\tProfileId\022\n\n\002id\030\001 \001(\0052\316\002\n\016Pro" +
      "fileService\022K\n\013GetProfiles\022\035.com.tra21.g" +
      "rpc.PaginationReq\032\033.com.tra21.grpc.Profi" +
      "lePage\"\000\022E\n\nGetProfile\022\031.com.tra21.grpc." +
      "ProfileId\032\032.com.tra21.grpc.ProfileDto\"\000\022" +
      "S\n\022CreateProfileProof\022\035.com.tra21.grpc.C" +
      "reateProfile\032\032.com.tra21.grpc.ProfileDto" +
      "\"\000(\001\022S\n\022UpdateProfileProof\022\035.com.tra21.g" +
      "rpc.UpdateProfile\032\032.com.tra21.grpc.Profi" +
      "leDto\"\000(\001B\022\n\016com.tra21.grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_tra21_grpc_CreateProfile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_tra21_grpc_CreateProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tra21_grpc_CreateProfile_descriptor,
        new java.lang.String[] { "FirstName", "LastName", "ImageFile", });
    internal_static_com_tra21_grpc_UpdateProfile_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_tra21_grpc_UpdateProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tra21_grpc_UpdateProfile_descriptor,
        new java.lang.String[] { "Id", "FirstName", "LastName", "ImageFile", });
    internal_static_com_tra21_grpc_ProfileDto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_tra21_grpc_ProfileDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tra21_grpc_ProfileDto_descriptor,
        new java.lang.String[] { "Id", "FirstName", "LastName", "ImagePath", });
    internal_static_com_tra21_grpc_PaginationReq_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_tra21_grpc_PaginationReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tra21_grpc_PaginationReq_descriptor,
        new java.lang.String[] { "Page", "Size", });
    internal_static_com_tra21_grpc_PaginationRes_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_tra21_grpc_PaginationRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tra21_grpc_PaginationRes_descriptor,
        new java.lang.String[] { "Page", "Size", "TotalElements", "TotalPages", });
    internal_static_com_tra21_grpc_ProfilePage_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_tra21_grpc_ProfilePage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tra21_grpc_ProfilePage_descriptor,
        new java.lang.String[] { "PaginationRes", "Data", });
    internal_static_com_tra21_grpc_ProfileId_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_tra21_grpc_ProfileId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tra21_grpc_ProfileId_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
