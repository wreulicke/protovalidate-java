// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tests/example/v1/validations.proto

package build.tests.example.v1;

public final class ValidationsProto {
  private ValidationsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tests_example_v1_HasMsgExprs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tests_example_v1_HasMsgExprs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tests_example_v1_SelfRecursive_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tests_example_v1_SelfRecursive_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tests_example_v1_LoopRecursiveA_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tests_example_v1_LoopRecursiveA_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tests_example_v1_LoopRecursiveB_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tests_example_v1_LoopRecursiveB_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tests_example_v1_MsgHasOneof_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tests_example_v1_MsgHasOneof_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tests_example_v1_MsgHasRepeated_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tests_example_v1_MsgHasRepeated_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tests_example_v1_MsgHasMap_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tests_example_v1_MsgHasMap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tests_example_v1_MsgHasMap_Int32mapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tests_example_v1_MsgHasMap_Int32mapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tests_example_v1_MsgHasMap_StringMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tests_example_v1_MsgHasMap_StringMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tests_example_v1_MsgHasMap_MessageMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tests_example_v1_MsgHasMap_MessageMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"tests/example/v1/validations.proto\022\020te" +
      "sts.example.v1\032\033buf/validate/validate.pr" +
      "oto\"\220\002\n\013HasMsgExprs\022\200\001\n\001x\030\001 \001(\005Br\372\367\030n\272\001\'" +
      "\n\006x_even\022\016x must be even\032\rthis % 2 == 0\272" +
      "\001A\n\013x_coprime_3\0322this % 3 != 0 ? \'\': \'x " +
      "must not be divisible by 3\'R\001x\022\014\n\001y\030\002 \001(" +
      "\005R\001y:p\372\367\030l\0320\n\006x_lt_y\022\025x must be less tha" +
      "n y\032\017this.x < this.y\0328\n\007y_gt_42\032-this.y " +
      "> 42 ? \'\': \'y must be greater than 42\'\"\200" +
      "\002\n\rSelfRecursive\022\014\n\001x\030\001 \001(\005R\001x\022\216\001\n\006turtl" +
      "e\030\002 \001(\0132\037.tests.example.v1.SelfRecursive" +
      "BU\372\367\030Q\272\001N\n\024non_zero_baby_turtle\022*embedde" +
      "d turtle\'s x value must not be zero\032\nthi" +
      "s.x > 0R\006turtle:P\372\367\030L\032J\n\016unique_turtles\022" +
      "\037adjacent turtles must be unique\032\027this.x" +
      " != this.turtle.x\"@\n\016LoopRecursiveA\022.\n\001b" +
      "\030\001 \001(\0132 .tests.example.v1.LoopRecursiveB" +
      "R\001b\"@\n\016LoopRecursiveB\022.\n\001a\030\001 \001(\0132 .tests" +
      ".example.v1.LoopRecursiveAR\001a\"\377\001\n\013MsgHas" +
      "Oneof\022\033\n\001x\030\001 \001(\tB\013\372\367\030\007r\005:\003fooH\000R\001x\022\030\n\001y\030" +
      "\002 \001(\005B\010\372\367\030\004\032\002 \000H\000R\001y\0221\n\003msg\030\003 \001(\0132\035.test" +
      "s.example.v1.HasMsgExprsH\000R\003msg:y\372\367\030u\032\\\n" +
      "\006test x\032Rthis.x == \'\' ? \'\' : \n!this.x.st" +
      "artsWith(\'foo\') ? \'does not have prefix " +
      "`foo`\' : \'\'\032\025\n\006text y\032\013this.y >= 0B\013\n\001o\022" +
      "\006\372\367\030\002\010\001\"\241\001\n\016MsgHasRepeated\022@\n\001x\030\001 \003(\002B2\372" +
      "\367\030.\222\001+\010\001\020\003\030\001\"#\n\005%\000\000\000\000\272\001\031\022\021intentional fa" +
      "lse\032\004trueR\001x\022\025\n\001y\030\002 \003(\tB\007\372\367\030\003\222\001\000R\001y\0226\n\001z" +
      "\030\003 \003(\0132\035.tests.example.v1.HasMsgExprsB\t\372" +
      "\367\030\005\222\001\002\020\002R\001z\"\364\003\n\tMsgHasMap\022\\\n\010int32map\030\001 " +
      "\003(\0132).tests.example.v1.MsgHasMap.Int32ma" +
      "pEntryB\025\372\367\030\021\232\001\016\010\003\"\004\032\002 \000*\004\032\002\020\000R\010int32map\022" +
      "T\n\nstring_map\030\002 \003(\0132*.tests.example.v1.M" +
      "sgHasMap.StringMapEntryB\t\372\367\030\005\232\001\002\020\001R\tstri" +
      "ngMap\022W\n\013message_map\030\003 \003(\0132+.tests.examp" +
      "le.v1.MsgHasMap.MessageMapEntryB\t\372\367\030\005\232\001\002" +
      "\010\002R\nmessageMap\032;\n\rInt32mapEntry\022\020\n\003key\030\001" +
      " \001(\005R\003key\022\024\n\005value\030\002 \001(\005R\005value:\0028\001\032<\n\016S" +
      "tringMapEntry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value" +
      "\030\002 \001(\tR\005value:\0028\001\032_\n\017MessageMapEntry\022\020\n\003" +
      "key\030\001 \001(\003R\003key\0226\n\005value\030\002 \001(\0132 .tests.ex" +
      "ample.v1.LoopRecursiveAR\005value:\0028\001B\214\001\n\026b" +
      "uild.tests.example.v1B\020ValidationsProtoP" +
      "\001\242\002\003TEX\252\002\020Tests.Example.V1\312\002\020Tests\\Examp" +
      "le\\V1\342\002\034Tests\\Example\\V1\\GPBMetadata\352\002\022T" +
      "ests::Example::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_tests_example_v1_HasMsgExprs_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tests_example_v1_HasMsgExprs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tests_example_v1_HasMsgExprs_descriptor,
        new java.lang.String[] { "X", "Y", });
    internal_static_tests_example_v1_SelfRecursive_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tests_example_v1_SelfRecursive_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tests_example_v1_SelfRecursive_descriptor,
        new java.lang.String[] { "X", "Turtle", });
    internal_static_tests_example_v1_LoopRecursiveA_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tests_example_v1_LoopRecursiveA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tests_example_v1_LoopRecursiveA_descriptor,
        new java.lang.String[] { "B", });
    internal_static_tests_example_v1_LoopRecursiveB_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tests_example_v1_LoopRecursiveB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tests_example_v1_LoopRecursiveB_descriptor,
        new java.lang.String[] { "A", });
    internal_static_tests_example_v1_MsgHasOneof_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tests_example_v1_MsgHasOneof_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tests_example_v1_MsgHasOneof_descriptor,
        new java.lang.String[] { "X", "Y", "Msg", "O", });
    internal_static_tests_example_v1_MsgHasRepeated_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tests_example_v1_MsgHasRepeated_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tests_example_v1_MsgHasRepeated_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
    internal_static_tests_example_v1_MsgHasMap_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tests_example_v1_MsgHasMap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tests_example_v1_MsgHasMap_descriptor,
        new java.lang.String[] { "Int32Map", "StringMap", "MessageMap", });
    internal_static_tests_example_v1_MsgHasMap_Int32mapEntry_descriptor =
      internal_static_tests_example_v1_MsgHasMap_descriptor.getNestedTypes().get(0);
    internal_static_tests_example_v1_MsgHasMap_Int32mapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tests_example_v1_MsgHasMap_Int32mapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tests_example_v1_MsgHasMap_StringMapEntry_descriptor =
      internal_static_tests_example_v1_MsgHasMap_descriptor.getNestedTypes().get(1);
    internal_static_tests_example_v1_MsgHasMap_StringMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tests_example_v1_MsgHasMap_StringMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tests_example_v1_MsgHasMap_MessageMapEntry_descriptor =
      internal_static_tests_example_v1_MsgHasMap_descriptor.getNestedTypes().get(2);
    internal_static_tests_example_v1_MsgHasMap_MessageMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tests_example_v1_MsgHasMap_MessageMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    registry.add(build.buf.validate.ValidateProto.message);
    registry.add(build.buf.validate.ValidateProto.oneof);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    build.buf.validate.ValidateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
