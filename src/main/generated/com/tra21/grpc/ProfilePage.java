// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: profile.proto

package com.tra21.grpc;

/**
 * Protobuf type {@code com.tra21.grpc.ProfilePage}
 */
public  final class ProfilePage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.tra21.grpc.ProfilePage)
    ProfilePageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProfilePage.newBuilder() to construct.
  private ProfilePage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProfilePage() {
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProfilePage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProfilePage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.tra21.grpc.PaginationRes.Builder subBuilder = null;
            if (paginationRes_ != null) {
              subBuilder = paginationRes_.toBuilder();
            }
            paginationRes_ = input.readMessage(com.tra21.grpc.PaginationRes.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(paginationRes_);
              paginationRes_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              data_ = new java.util.ArrayList<com.tra21.grpc.ProfileDto>();
              mutable_bitField0_ |= 0x00000001;
            }
            data_.add(
                input.readMessage(com.tra21.grpc.ProfileDto.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        data_ = java.util.Collections.unmodifiableList(data_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tra21.grpc.Profile.internal_static_com_tra21_grpc_ProfilePage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tra21.grpc.Profile.internal_static_com_tra21_grpc_ProfilePage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tra21.grpc.ProfilePage.class, com.tra21.grpc.ProfilePage.Builder.class);
  }

  public static final int PAGINATION_RES_FIELD_NUMBER = 1;
  private com.tra21.grpc.PaginationRes paginationRes_;
  /**
   * <code>.com.tra21.grpc.PaginationRes pagination_res = 1;</code>
   * @return Whether the paginationRes field is set.
   */
  public boolean hasPaginationRes() {
    return paginationRes_ != null;
  }
  /**
   * <code>.com.tra21.grpc.PaginationRes pagination_res = 1;</code>
   * @return The paginationRes.
   */
  public com.tra21.grpc.PaginationRes getPaginationRes() {
    return paginationRes_ == null ? com.tra21.grpc.PaginationRes.getDefaultInstance() : paginationRes_;
  }
  /**
   * <code>.com.tra21.grpc.PaginationRes pagination_res = 1;</code>
   */
  public com.tra21.grpc.PaginationResOrBuilder getPaginationResOrBuilder() {
    return getPaginationRes();
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private java.util.List<com.tra21.grpc.ProfileDto> data_;
  /**
   * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
   */
  public java.util.List<com.tra21.grpc.ProfileDto> getDataList() {
    return data_;
  }
  /**
   * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
   */
  public java.util.List<? extends com.tra21.grpc.ProfileDtoOrBuilder> 
      getDataOrBuilderList() {
    return data_;
  }
  /**
   * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
   */
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
   */
  public com.tra21.grpc.ProfileDto getData(int index) {
    return data_.get(index);
  }
  /**
   * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
   */
  public com.tra21.grpc.ProfileDtoOrBuilder getDataOrBuilder(
      int index) {
    return data_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (paginationRes_ != null) {
      output.writeMessage(1, getPaginationRes());
    }
    for (int i = 0; i < data_.size(); i++) {
      output.writeMessage(2, data_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (paginationRes_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPaginationRes());
    }
    for (int i = 0; i < data_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, data_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tra21.grpc.ProfilePage)) {
      return super.equals(obj);
    }
    com.tra21.grpc.ProfilePage other = (com.tra21.grpc.ProfilePage) obj;

    if (hasPaginationRes() != other.hasPaginationRes()) return false;
    if (hasPaginationRes()) {
      if (!getPaginationRes()
          .equals(other.getPaginationRes())) return false;
    }
    if (!getDataList()
        .equals(other.getDataList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPaginationRes()) {
      hash = (37 * hash) + PAGINATION_RES_FIELD_NUMBER;
      hash = (53 * hash) + getPaginationRes().hashCode();
    }
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tra21.grpc.ProfilePage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tra21.grpc.ProfilePage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tra21.grpc.ProfilePage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tra21.grpc.ProfilePage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tra21.grpc.ProfilePage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tra21.grpc.ProfilePage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tra21.grpc.ProfilePage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tra21.grpc.ProfilePage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tra21.grpc.ProfilePage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tra21.grpc.ProfilePage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tra21.grpc.ProfilePage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tra21.grpc.ProfilePage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tra21.grpc.ProfilePage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.tra21.grpc.ProfilePage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.tra21.grpc.ProfilePage)
      com.tra21.grpc.ProfilePageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tra21.grpc.Profile.internal_static_com_tra21_grpc_ProfilePage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tra21.grpc.Profile.internal_static_com_tra21_grpc_ProfilePage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tra21.grpc.ProfilePage.class, com.tra21.grpc.ProfilePage.Builder.class);
    }

    // Construct using com.tra21.grpc.ProfilePage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (paginationResBuilder_ == null) {
        paginationRes_ = null;
      } else {
        paginationRes_ = null;
        paginationResBuilder_ = null;
      }
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tra21.grpc.Profile.internal_static_com_tra21_grpc_ProfilePage_descriptor;
    }

    @java.lang.Override
    public com.tra21.grpc.ProfilePage getDefaultInstanceForType() {
      return com.tra21.grpc.ProfilePage.getDefaultInstance();
    }

    @java.lang.Override
    public com.tra21.grpc.ProfilePage build() {
      com.tra21.grpc.ProfilePage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tra21.grpc.ProfilePage buildPartial() {
      com.tra21.grpc.ProfilePage result = new com.tra21.grpc.ProfilePage(this);
      int from_bitField0_ = bitField0_;
      if (paginationResBuilder_ == null) {
        result.paginationRes_ = paginationRes_;
      } else {
        result.paginationRes_ = paginationResBuilder_.build();
      }
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tra21.grpc.ProfilePage) {
        return mergeFrom((com.tra21.grpc.ProfilePage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tra21.grpc.ProfilePage other) {
      if (other == com.tra21.grpc.ProfilePage.getDefaultInstance()) return this;
      if (other.hasPaginationRes()) {
        mergePaginationRes(other.getPaginationRes());
      }
      if (dataBuilder_ == null) {
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
      } else {
        if (!other.data_.isEmpty()) {
          if (dataBuilder_.isEmpty()) {
            dataBuilder_.dispose();
            dataBuilder_ = null;
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataFieldBuilder() : null;
          } else {
            dataBuilder_.addAllMessages(other.data_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.tra21.grpc.ProfilePage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tra21.grpc.ProfilePage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.tra21.grpc.PaginationRes paginationRes_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tra21.grpc.PaginationRes, com.tra21.grpc.PaginationRes.Builder, com.tra21.grpc.PaginationResOrBuilder> paginationResBuilder_;
    /**
     * <code>.com.tra21.grpc.PaginationRes pagination_res = 1;</code>
     * @return Whether the paginationRes field is set.
     */
    public boolean hasPaginationRes() {
      return paginationResBuilder_ != null || paginationRes_ != null;
    }
    /**
     * <code>.com.tra21.grpc.PaginationRes pagination_res = 1;</code>
     * @return The paginationRes.
     */
    public com.tra21.grpc.PaginationRes getPaginationRes() {
      if (paginationResBuilder_ == null) {
        return paginationRes_ == null ? com.tra21.grpc.PaginationRes.getDefaultInstance() : paginationRes_;
      } else {
        return paginationResBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.tra21.grpc.PaginationRes pagination_res = 1;</code>
     */
    public Builder setPaginationRes(com.tra21.grpc.PaginationRes value) {
      if (paginationResBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        paginationRes_ = value;
        onChanged();
      } else {
        paginationResBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.tra21.grpc.PaginationRes pagination_res = 1;</code>
     */
    public Builder setPaginationRes(
        com.tra21.grpc.PaginationRes.Builder builderForValue) {
      if (paginationResBuilder_ == null) {
        paginationRes_ = builderForValue.build();
        onChanged();
      } else {
        paginationResBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.tra21.grpc.PaginationRes pagination_res = 1;</code>
     */
    public Builder mergePaginationRes(com.tra21.grpc.PaginationRes value) {
      if (paginationResBuilder_ == null) {
        if (paginationRes_ != null) {
          paginationRes_ =
            com.tra21.grpc.PaginationRes.newBuilder(paginationRes_).mergeFrom(value).buildPartial();
        } else {
          paginationRes_ = value;
        }
        onChanged();
      } else {
        paginationResBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.tra21.grpc.PaginationRes pagination_res = 1;</code>
     */
    public Builder clearPaginationRes() {
      if (paginationResBuilder_ == null) {
        paginationRes_ = null;
        onChanged();
      } else {
        paginationRes_ = null;
        paginationResBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.tra21.grpc.PaginationRes pagination_res = 1;</code>
     */
    public com.tra21.grpc.PaginationRes.Builder getPaginationResBuilder() {
      
      onChanged();
      return getPaginationResFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.tra21.grpc.PaginationRes pagination_res = 1;</code>
     */
    public com.tra21.grpc.PaginationResOrBuilder getPaginationResOrBuilder() {
      if (paginationResBuilder_ != null) {
        return paginationResBuilder_.getMessageOrBuilder();
      } else {
        return paginationRes_ == null ?
            com.tra21.grpc.PaginationRes.getDefaultInstance() : paginationRes_;
      }
    }
    /**
     * <code>.com.tra21.grpc.PaginationRes pagination_res = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tra21.grpc.PaginationRes, com.tra21.grpc.PaginationRes.Builder, com.tra21.grpc.PaginationResOrBuilder> 
        getPaginationResFieldBuilder() {
      if (paginationResBuilder_ == null) {
        paginationResBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tra21.grpc.PaginationRes, com.tra21.grpc.PaginationRes.Builder, com.tra21.grpc.PaginationResOrBuilder>(
                getPaginationRes(),
                getParentForChildren(),
                isClean());
        paginationRes_ = null;
      }
      return paginationResBuilder_;
    }

    private java.util.List<com.tra21.grpc.ProfileDto> data_ =
      java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        data_ = new java.util.ArrayList<com.tra21.grpc.ProfileDto>(data_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tra21.grpc.ProfileDto, com.tra21.grpc.ProfileDto.Builder, com.tra21.grpc.ProfileDtoOrBuilder> dataBuilder_;

    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public java.util.List<com.tra21.grpc.ProfileDto> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public com.tra21.grpc.ProfileDto getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public Builder setData(
        int index, com.tra21.grpc.ProfileDto value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
      } else {
        dataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public Builder setData(
        int index, com.tra21.grpc.ProfileDto.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public Builder addData(com.tra21.grpc.ProfileDto value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(value);
        onChanged();
      } else {
        dataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public Builder addData(
        int index, com.tra21.grpc.ProfileDto value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(index, value);
        onChanged();
      } else {
        dataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public Builder addData(
        com.tra21.grpc.ProfileDto.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public Builder addData(
        int index, com.tra21.grpc.ProfileDto.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends com.tra21.grpc.ProfileDto> values) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, data_);
        onChanged();
      } else {
        dataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public Builder removeData(int index) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.remove(index);
        onChanged();
      } else {
        dataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public com.tra21.grpc.ProfileDto.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public com.tra21.grpc.ProfileDtoOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);  } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public java.util.List<? extends com.tra21.grpc.ProfileDtoOrBuilder> 
         getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public com.tra21.grpc.ProfileDto.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          com.tra21.grpc.ProfileDto.getDefaultInstance());
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public com.tra21.grpc.ProfileDto.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(
          index, com.tra21.grpc.ProfileDto.getDefaultInstance());
    }
    /**
     * <code>repeated .com.tra21.grpc.ProfileDto data = 2;</code>
     */
    public java.util.List<com.tra21.grpc.ProfileDto.Builder> 
         getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tra21.grpc.ProfileDto, com.tra21.grpc.ProfileDto.Builder, com.tra21.grpc.ProfileDtoOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tra21.grpc.ProfileDto, com.tra21.grpc.ProfileDto.Builder, com.tra21.grpc.ProfileDtoOrBuilder>(
                data_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.tra21.grpc.ProfilePage)
  }

  // @@protoc_insertion_point(class_scope:com.tra21.grpc.ProfilePage)
  private static final com.tra21.grpc.ProfilePage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tra21.grpc.ProfilePage();
  }

  public static com.tra21.grpc.ProfilePage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProfilePage>
      PARSER = new com.google.protobuf.AbstractParser<ProfilePage>() {
    @java.lang.Override
    public ProfilePage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProfilePage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProfilePage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProfilePage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tra21.grpc.ProfilePage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

