// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: profile.proto

package com.tra21.grpc;

/**
 * Protobuf type {@code com.tra21.grpc.PaginationRes}
 */
public  final class PaginationRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.tra21.grpc.PaginationRes)
    PaginationResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaginationRes.newBuilder() to construct.
  private PaginationRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaginationRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PaginationRes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PaginationRes(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            page_ = input.readInt32();
            break;
          }
          case 16: {

            size_ = input.readInt32();
            break;
          }
          case 24: {

            totalElements_ = input.readInt32();
            break;
          }
          case 32: {

            totalPages_ = input.readInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tra21.grpc.Profile.internal_static_com_tra21_grpc_PaginationRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tra21.grpc.Profile.internal_static_com_tra21_grpc_PaginationRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tra21.grpc.PaginationRes.class, com.tra21.grpc.PaginationRes.Builder.class);
  }

  public static final int PAGE_FIELD_NUMBER = 1;
  private int page_;
  /**
   * <code>int32 page = 1;</code>
   * @return The page.
   */
  public int getPage() {
    return page_;
  }

  public static final int SIZE_FIELD_NUMBER = 2;
  private int size_;
  /**
   * <code>int32 size = 2;</code>
   * @return The size.
   */
  public int getSize() {
    return size_;
  }

  public static final int TOTAL_ELEMENTS_FIELD_NUMBER = 3;
  private int totalElements_;
  /**
   * <code>int32 total_elements = 3;</code>
   * @return The totalElements.
   */
  public int getTotalElements() {
    return totalElements_;
  }

  public static final int TOTAL_PAGES_FIELD_NUMBER = 4;
  private int totalPages_;
  /**
   * <code>int32 total_pages = 4;</code>
   * @return The totalPages.
   */
  public int getTotalPages() {
    return totalPages_;
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
    if (page_ != 0) {
      output.writeInt32(1, page_);
    }
    if (size_ != 0) {
      output.writeInt32(2, size_);
    }
    if (totalElements_ != 0) {
      output.writeInt32(3, totalElements_);
    }
    if (totalPages_ != 0) {
      output.writeInt32(4, totalPages_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (page_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, page_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, size_);
    }
    if (totalElements_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, totalElements_);
    }
    if (totalPages_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, totalPages_);
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
    if (!(obj instanceof com.tra21.grpc.PaginationRes)) {
      return super.equals(obj);
    }
    com.tra21.grpc.PaginationRes other = (com.tra21.grpc.PaginationRes) obj;

    if (getPage()
        != other.getPage()) return false;
    if (getSize()
        != other.getSize()) return false;
    if (getTotalElements()
        != other.getTotalElements()) return false;
    if (getTotalPages()
        != other.getTotalPages()) return false;
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
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (37 * hash) + TOTAL_ELEMENTS_FIELD_NUMBER;
    hash = (53 * hash) + getTotalElements();
    hash = (37 * hash) + TOTAL_PAGES_FIELD_NUMBER;
    hash = (53 * hash) + getTotalPages();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tra21.grpc.PaginationRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tra21.grpc.PaginationRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tra21.grpc.PaginationRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tra21.grpc.PaginationRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tra21.grpc.PaginationRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tra21.grpc.PaginationRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tra21.grpc.PaginationRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tra21.grpc.PaginationRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tra21.grpc.PaginationRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tra21.grpc.PaginationRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tra21.grpc.PaginationRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tra21.grpc.PaginationRes parseFrom(
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
  public static Builder newBuilder(com.tra21.grpc.PaginationRes prototype) {
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
   * Protobuf type {@code com.tra21.grpc.PaginationRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.tra21.grpc.PaginationRes)
      com.tra21.grpc.PaginationResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tra21.grpc.Profile.internal_static_com_tra21_grpc_PaginationRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tra21.grpc.Profile.internal_static_com_tra21_grpc_PaginationRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tra21.grpc.PaginationRes.class, com.tra21.grpc.PaginationRes.Builder.class);
    }

    // Construct using com.tra21.grpc.PaginationRes.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      page_ = 0;

      size_ = 0;

      totalElements_ = 0;

      totalPages_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tra21.grpc.Profile.internal_static_com_tra21_grpc_PaginationRes_descriptor;
    }

    @java.lang.Override
    public com.tra21.grpc.PaginationRes getDefaultInstanceForType() {
      return com.tra21.grpc.PaginationRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tra21.grpc.PaginationRes build() {
      com.tra21.grpc.PaginationRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tra21.grpc.PaginationRes buildPartial() {
      com.tra21.grpc.PaginationRes result = new com.tra21.grpc.PaginationRes(this);
      result.page_ = page_;
      result.size_ = size_;
      result.totalElements_ = totalElements_;
      result.totalPages_ = totalPages_;
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
      if (other instanceof com.tra21.grpc.PaginationRes) {
        return mergeFrom((com.tra21.grpc.PaginationRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tra21.grpc.PaginationRes other) {
      if (other == com.tra21.grpc.PaginationRes.getDefaultInstance()) return this;
      if (other.getPage() != 0) {
        setPage(other.getPage());
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
      }
      if (other.getTotalElements() != 0) {
        setTotalElements(other.getTotalElements());
      }
      if (other.getTotalPages() != 0) {
        setTotalPages(other.getTotalPages());
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
      com.tra21.grpc.PaginationRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tra21.grpc.PaginationRes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int page_ ;
    /**
     * <code>int32 page = 1;</code>
     * @return The page.
     */
    public int getPage() {
      return page_;
    }
    /**
     * <code>int32 page = 1;</code>
     * @param value The page to set.
     * @return This builder for chaining.
     */
    public Builder setPage(int value) {
      
      page_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPage() {
      
      page_ = 0;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <code>int32 size = 2;</code>
     * @return The size.
     */
    public int getSize() {
      return size_;
    }
    /**
     * <code>int32 size = 2;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(int value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      
      size_ = 0;
      onChanged();
      return this;
    }

    private int totalElements_ ;
    /**
     * <code>int32 total_elements = 3;</code>
     * @return The totalElements.
     */
    public int getTotalElements() {
      return totalElements_;
    }
    /**
     * <code>int32 total_elements = 3;</code>
     * @param value The totalElements to set.
     * @return This builder for chaining.
     */
    public Builder setTotalElements(int value) {
      
      totalElements_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 total_elements = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalElements() {
      
      totalElements_ = 0;
      onChanged();
      return this;
    }

    private int totalPages_ ;
    /**
     * <code>int32 total_pages = 4;</code>
     * @return The totalPages.
     */
    public int getTotalPages() {
      return totalPages_;
    }
    /**
     * <code>int32 total_pages = 4;</code>
     * @param value The totalPages to set.
     * @return This builder for chaining.
     */
    public Builder setTotalPages(int value) {
      
      totalPages_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 total_pages = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalPages() {
      
      totalPages_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:com.tra21.grpc.PaginationRes)
  }

  // @@protoc_insertion_point(class_scope:com.tra21.grpc.PaginationRes)
  private static final com.tra21.grpc.PaginationRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tra21.grpc.PaginationRes();
  }

  public static com.tra21.grpc.PaginationRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaginationRes>
      PARSER = new com.google.protobuf.AbstractParser<PaginationRes>() {
    @java.lang.Override
    public PaginationRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PaginationRes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PaginationRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaginationRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tra21.grpc.PaginationRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

