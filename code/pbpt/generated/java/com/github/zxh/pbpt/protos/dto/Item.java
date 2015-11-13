// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dto/item.proto

package com.github.zxh.pbpt.protos.dto;

public final class Item {
  private Item() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ItemDtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ItemDto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required uint32 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>required uint32 id = 1;</code>
     */
    int getId();

    /**
     * <code>required uint32 count = 2;</code>
     */
    boolean hasCount();
    /**
     * <code>required uint32 count = 2;</code>
     */
    int getCount();

    /**
     * <code>required .ItemTypeEnum type = 3;</code>
     */
    boolean hasType();
    /**
     * <code>required .ItemTypeEnum type = 3;</code>
     */
    com.github.zxh.pbpt.protos.enums.ItemType.ItemTypeEnum getType();
  }
  /**
   * Protobuf type {@code ItemDto}
   */
  public static final class ItemDto extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ItemDto)
      ItemDtoOrBuilder {
    // Use ItemDto.newBuilder() to construct.
    private ItemDto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ItemDto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ItemDto defaultInstance;
    public static ItemDto getDefaultInstance() {
      return defaultInstance;
    }

    public ItemDto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ItemDto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              count_ = input.readUInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              com.github.zxh.pbpt.protos.enums.ItemType.ItemTypeEnum value = com.github.zxh.pbpt.protos.enums.ItemType.ItemTypeEnum.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                type_ = value;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.zxh.pbpt.protos.dto.Item.internal_static_ItemDto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.zxh.pbpt.protos.dto.Item.internal_static_ItemDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.zxh.pbpt.protos.dto.Item.ItemDto.class, com.github.zxh.pbpt.protos.dto.Item.ItemDto.Builder.class);
    }

    public static com.google.protobuf.Parser<ItemDto> PARSER =
        new com.google.protobuf.AbstractParser<ItemDto>() {
      public ItemDto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ItemDto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ItemDto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>required uint32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required uint32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int COUNT_FIELD_NUMBER = 2;
    private int count_;
    /**
     * <code>required uint32 count = 2;</code>
     */
    public boolean hasCount() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint32 count = 2;</code>
     */
    public int getCount() {
      return count_;
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private com.github.zxh.pbpt.protos.enums.ItemType.ItemTypeEnum type_;
    /**
     * <code>required .ItemTypeEnum type = 3;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .ItemTypeEnum type = 3;</code>
     */
    public com.github.zxh.pbpt.protos.enums.ItemType.ItemTypeEnum getType() {
      return type_;
    }

    private void initFields() {
      id_ = 0;
      count_ = 0;
      type_ = com.github.zxh.pbpt.protos.enums.ItemType.ItemTypeEnum.EQUIPMENT;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, count_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, type_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, count_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.github.zxh.pbpt.protos.dto.Item.ItemDto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.zxh.pbpt.protos.dto.Item.ItemDto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.zxh.pbpt.protos.dto.Item.ItemDto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.zxh.pbpt.protos.dto.Item.ItemDto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.zxh.pbpt.protos.dto.Item.ItemDto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.github.zxh.pbpt.protos.dto.Item.ItemDto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.github.zxh.pbpt.protos.dto.Item.ItemDto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.github.zxh.pbpt.protos.dto.Item.ItemDto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.github.zxh.pbpt.protos.dto.Item.ItemDto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.github.zxh.pbpt.protos.dto.Item.ItemDto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.github.zxh.pbpt.protos.dto.Item.ItemDto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ItemDto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ItemDto)
        com.github.zxh.pbpt.protos.dto.Item.ItemDtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.github.zxh.pbpt.protos.dto.Item.internal_static_ItemDto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.github.zxh.pbpt.protos.dto.Item.internal_static_ItemDto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.github.zxh.pbpt.protos.dto.Item.ItemDto.class, com.github.zxh.pbpt.protos.dto.Item.ItemDto.Builder.class);
      }

      // Construct using com.github.zxh.pbpt.protos.dto.Item.ItemDto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        count_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = com.github.zxh.pbpt.protos.enums.ItemType.ItemTypeEnum.EQUIPMENT;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.github.zxh.pbpt.protos.dto.Item.internal_static_ItemDto_descriptor;
      }

      public com.github.zxh.pbpt.protos.dto.Item.ItemDto getDefaultInstanceForType() {
        return com.github.zxh.pbpt.protos.dto.Item.ItemDto.getDefaultInstance();
      }

      public com.github.zxh.pbpt.protos.dto.Item.ItemDto build() {
        com.github.zxh.pbpt.protos.dto.Item.ItemDto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.github.zxh.pbpt.protos.dto.Item.ItemDto buildPartial() {
        com.github.zxh.pbpt.protos.dto.Item.ItemDto result = new com.github.zxh.pbpt.protos.dto.Item.ItemDto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.count_ = count_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.github.zxh.pbpt.protos.dto.Item.ItemDto) {
          return mergeFrom((com.github.zxh.pbpt.protos.dto.Item.ItemDto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.github.zxh.pbpt.protos.dto.Item.ItemDto other) {
        if (other == com.github.zxh.pbpt.protos.dto.Item.ItemDto.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasCount()) {
          setCount(other.getCount());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        if (!hasCount()) {
          
          return false;
        }
        if (!hasType()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.github.zxh.pbpt.protos.dto.Item.ItemDto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.github.zxh.pbpt.protos.dto.Item.ItemDto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>required uint32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required uint32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>required uint32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private int count_ ;
      /**
       * <code>required uint32 count = 2;</code>
       */
      public boolean hasCount() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint32 count = 2;</code>
       */
      public int getCount() {
        return count_;
      }
      /**
       * <code>required uint32 count = 2;</code>
       */
      public Builder setCount(int value) {
        bitField0_ |= 0x00000002;
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 count = 2;</code>
       */
      public Builder clearCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        count_ = 0;
        onChanged();
        return this;
      }

      private com.github.zxh.pbpt.protos.enums.ItemType.ItemTypeEnum type_ = com.github.zxh.pbpt.protos.enums.ItemType.ItemTypeEnum.EQUIPMENT;
      /**
       * <code>required .ItemTypeEnum type = 3;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required .ItemTypeEnum type = 3;</code>
       */
      public com.github.zxh.pbpt.protos.enums.ItemType.ItemTypeEnum getType() {
        return type_;
      }
      /**
       * <code>required .ItemTypeEnum type = 3;</code>
       */
      public Builder setType(com.github.zxh.pbpt.protos.enums.ItemType.ItemTypeEnum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .ItemTypeEnum type = 3;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = com.github.zxh.pbpt.protos.enums.ItemType.ItemTypeEnum.EQUIPMENT;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ItemDto)
    }

    static {
      defaultInstance = new ItemDto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ItemDto)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ItemDto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ItemDto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016dto/item.proto\032\025enums/item_type.proto\"" +
      "A\n\007ItemDto\022\n\n\002id\030\001 \002(\r\022\r\n\005count\030\002 \002(\r\022\033\n" +
      "\004type\030\003 \002(\0162\r.ItemTypeEnumB \n\036com.github" +
      ".zxh.pbpt.protos.dto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.github.zxh.pbpt.protos.enums.ItemType.getDescriptor(),
        }, assigner);
    internal_static_ItemDto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ItemDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ItemDto_descriptor,
        new java.lang.String[] { "Id", "Count", "Type", });
    com.github.zxh.pbpt.protos.enums.ItemType.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}