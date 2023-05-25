// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/validate.proto

package build.buf.validate;

/**
 * <pre>
 * BoolRules describes the constraints applied to `bool` values. These rules
 * may also be applied to the `google.protobuf.BoolValue` Well-Known-Type.
 * </pre>
 *
 * Protobuf type {@code buf.validate.BoolRules}
 */
public final class BoolRules extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.BoolRules)
    BoolRulesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BoolRules.newBuilder() to construct.
  private BoolRules(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BoolRules() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BoolRules();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.ValidateProto.internal_static_buf_validate_BoolRules_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.ValidateProto.internal_static_buf_validate_BoolRules_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.BoolRules.class, build.buf.validate.BoolRules.Builder.class);
  }

  private int bitField0_;
  public static final int CONST_FIELD_NUMBER = 1;
  private boolean const_ = false;
  /**
   * <pre>
   *`const` requires the field value to exactly match the specified boolean value.
   *If the field value doesn't match, an error message is generated.
   *
   *```proto
   *message MyBool {
   *  // value must equal true
   *   bool value = 1 [(buf.validate.field).bool.const = true];
   *}
   *```
   * </pre>
   *
   * <code>optional bool const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the const field is set.
   */
  @java.lang.Override
  public boolean hasConst() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   *`const` requires the field value to exactly match the specified boolean value.
   *If the field value doesn't match, an error message is generated.
   *
   *```proto
   *message MyBool {
   *  // value must equal true
   *   bool value = 1 [(buf.validate.field).bool.const = true];
   *}
   *```
   * </pre>
   *
   * <code>optional bool const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
   * @return The const.
   */
  @java.lang.Override
  public boolean getConst() {
    return const_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(1, const_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, const_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof build.buf.validate.BoolRules)) {
      return super.equals(obj);
    }
    build.buf.validate.BoolRules other = (build.buf.validate.BoolRules) obj;

    if (hasConst() != other.hasConst()) return false;
    if (hasConst()) {
      if (getConst()
          != other.getConst()) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasConst()) {
      hash = (37 * hash) + CONST_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getConst());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.BoolRules parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.BoolRules parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.BoolRules parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.BoolRules parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.BoolRules parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.BoolRules parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.BoolRules parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.BoolRules parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.BoolRules parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.BoolRules parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.BoolRules parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.BoolRules parseFrom(
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
  public static Builder newBuilder(build.buf.validate.BoolRules prototype) {
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
   * <pre>
   * BoolRules describes the constraints applied to `bool` values. These rules
   * may also be applied to the `google.protobuf.BoolValue` Well-Known-Type.
   * </pre>
   *
   * Protobuf type {@code buf.validate.BoolRules}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.BoolRules)
      build.buf.validate.BoolRulesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.ValidateProto.internal_static_buf_validate_BoolRules_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.ValidateProto.internal_static_buf_validate_BoolRules_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.BoolRules.class, build.buf.validate.BoolRules.Builder.class);
    }

    // Construct using build.buf.validate.BoolRules.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      const_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.ValidateProto.internal_static_buf_validate_BoolRules_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.BoolRules getDefaultInstanceForType() {
      return build.buf.validate.BoolRules.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.BoolRules build() {
      build.buf.validate.BoolRules result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.BoolRules buildPartial() {
      build.buf.validate.BoolRules result = new build.buf.validate.BoolRules(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.BoolRules result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.const_ = const_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.BoolRules) {
        return mergeFrom((build.buf.validate.BoolRules)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.BoolRules other) {
      if (other == build.buf.validate.BoolRules.getDefaultInstance()) return this;
      if (other.hasConst()) {
        setConst(other.getConst());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              const_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private boolean const_ ;
    /**
     * <pre>
     *`const` requires the field value to exactly match the specified boolean value.
     *If the field value doesn't match, an error message is generated.
     *
     *```proto
     *message MyBool {
     *  // value must equal true
     *   bool value = 1 [(buf.validate.field).bool.const = true];
     *}
     *```
     * </pre>
     *
     * <code>optional bool const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
     * @return Whether the const field is set.
     */
    @java.lang.Override
    public boolean hasConst() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     *`const` requires the field value to exactly match the specified boolean value.
     *If the field value doesn't match, an error message is generated.
     *
     *```proto
     *message MyBool {
     *  // value must equal true
     *   bool value = 1 [(buf.validate.field).bool.const = true];
     *}
     *```
     * </pre>
     *
     * <code>optional bool const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
     * @return The const.
     */
    @java.lang.Override
    public boolean getConst() {
      return const_;
    }
    /**
     * <pre>
     *`const` requires the field value to exactly match the specified boolean value.
     *If the field value doesn't match, an error message is generated.
     *
     *```proto
     *message MyBool {
     *  // value must equal true
     *   bool value = 1 [(buf.validate.field).bool.const = true];
     *}
     *```
     * </pre>
     *
     * <code>optional bool const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
     * @param value The const to set.
     * @return This builder for chaining.
     */
    public Builder setConst(boolean value) {

      const_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *`const` requires the field value to exactly match the specified boolean value.
     *If the field value doesn't match, an error message is generated.
     *
     *```proto
     *message MyBool {
     *  // value must equal true
     *   bool value = 1 [(buf.validate.field).bool.const = true];
     *}
     *```
     * </pre>
     *
     * <code>optional bool const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearConst() {
      bitField0_ = (bitField0_ & ~0x00000001);
      const_ = false;
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


    // @@protoc_insertion_point(builder_scope:buf.validate.BoolRules)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.BoolRules)
  private static final build.buf.validate.BoolRules DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.BoolRules();
  }

  public static build.buf.validate.BoolRules getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BoolRules>
      PARSER = new com.google.protobuf.AbstractParser<BoolRules>() {
    @java.lang.Override
    public BoolRules parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<BoolRules> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BoolRules> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.BoolRules getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

