// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rmi_via_grpc.proto

package sapphire.grpc.example.generated;

public final class InvokerProto {
  private InvokerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_invoker_Base_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_invoker_Base_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_invoker_SubClass1_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_invoker_SubClass1_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_invoker_SubClass2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_invoker_SubClass2_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_invoker_SubSubClass11_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_invoker_SubSubClass11_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_invoker_SubSubClass12_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_invoker_SubSubClass12_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_invoker_SubSubClass21_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_invoker_SubSubClass21_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_invoker_SubSubClass22_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_invoker_SubSubClass22_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_invoker_InvokeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_invoker_InvokeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_invoker_InvokeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_invoker_InvokeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022rmi_via_grpc.proto\022\007invoker\"\236\001\n\004Base\022\034" +
      "\n\005super\030\001 \001(\0132\r.invoker.Base\022\014\n\004name\030\002 \001" +
      "(\t\022\r\n\005value\030\003 \001(\t\022\'\n\tsubclass1\030\004 \001(\0132\022.i" +
      "nvoker.SubClass1H\000\022\'\n\tsubclass2\030\005 \001(\0132\022." +
      "invoker.SubClass2H\000B\t\n\007Derived\"\267\001\n\tSubCl" +
      "ass1\022\034\n\005super\030\001 \001(\0132\r.invoker.Base\022\016\n\006am" +
      "ount\030\002 \001(\002\022\014\n\004ages\030\003 \003(\014\022/\n\rsubsubclass1" +
      "1\030\004 \001(\0132\026.invoker.SubSubClass11H\000\022/\n\rsub" +
      "subclass12\030\005 \001(\0132\026.invoker.SubSubClass12" +
      "H\000B\014\n\nSubClasses\"\272\001\n\tSubClass2\022\034\n\005super\030" +
      "\001 \001(\0132\r.invoker.Base\022\r\n\005value\030\002 \001(\001\022\020\n\010S" +
      "hortval\030\003 \001(\005\022/\n\rsubsubclass21\030\004 \001(\0132\026.i" +
      "nvoker.SubSubClass21H\000\022/\n\rsubsubclass22\030" +
      "\005 \001(\0132\026.invoker.SubSubClass22H\000B\014\n\nSubCl" +
      "asses\"\321\001\n\rSubSubClass11\022!\n\005super\030\001 \001(\0132\022" +
      ".invoker.SubClass1\022-\n\006corpus\030\002 \001(\0162\035.inv" +
      "oker.SubSubClass11.Corpus\022\022\n\nisThisDumb\030" +
      "\003 \001(\010\"Z\n\006Corpus\022\r\n\tUNIVERSAL\020\000\022\007\n\003WEB\020\001\022" +
      "\n\n\006IMAGES\020\002\022\t\n\005LOCAL\020\003\022\010\n\004NEWS\020\004\022\014\n\010PROD" +
      "UCTS\020\005\022\t\n\005VIDEO\020\006\"?\n\rSubSubClass12\022!\n\005su" +
      "per\030\001 \001(\0132\022.invoker.SubClass1\022\013\n\003foo\030\002 \001" +
      "(\005\"\210\001\n\rSubSubClass21\022!\n\005super\030\001 \001(\0132\022.in" +
      "voker.SubClass2\022\013\n\003bar\030\002 \001(\005\022%\n\005sub11\030\003 " +
      "\001(\0132\026.invoker.SubSubClass11\022 \n\004sub1\030\004 \001(" +
      "\0132\022.invoker.SubClass1\"_\n\rSubSubClass22\022!" +
      "\n\005super\030\001 \001(\0132\022.invoker.SubClass2\022\013\n\003baz" +
      "\030\002 \001(\005\022\036\n\007anyType\030\003 \001(\0132\r.invoker.Base\"?" +
      "\n\rInvokeRequest\022\022\n\nmethodName\030\001 \001(\t\022\032\n\003a" +
      "rg\030\002 \003(\0132\r.invoker.Base\"g\n\016InvokeRespons" +
      "e\022$\n\013returnValue\030\001 \001(\0132\r.invoker.BaseH\000\022" +
      "\036\n\005threw\030\002 \001(\0132\r.invoker.BaseH\000B\017\n\rRetur" +
      "nOrThrow2F\n\007Invoker\022;\n\006Invoke\022\026.invoker." +
      "InvokeRequest\032\027.invoker.InvokeResponse\"\000" +
      "B7\n\037sapphire.grpc.example.generatedB\014Inv" +
      "okerProtoP\001\242\002\003HLWb\006proto3"
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
        }, assigner);
    internal_static_invoker_Base_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_invoker_Base_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_invoker_Base_descriptor,
        new java.lang.String[] { "Super", "Name", "Value", "Subclass1", "Subclass2", "Derived", });
    internal_static_invoker_SubClass1_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_invoker_SubClass1_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_invoker_SubClass1_descriptor,
        new java.lang.String[] { "Super", "Amount", "Ages", "Subsubclass11", "Subsubclass12", "SubClasses", });
    internal_static_invoker_SubClass2_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_invoker_SubClass2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_invoker_SubClass2_descriptor,
        new java.lang.String[] { "Super", "Value", "Shortval", "Subsubclass21", "Subsubclass22", "SubClasses", });
    internal_static_invoker_SubSubClass11_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_invoker_SubSubClass11_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_invoker_SubSubClass11_descriptor,
        new java.lang.String[] { "Super", "Corpus", "IsThisDumb", });
    internal_static_invoker_SubSubClass12_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_invoker_SubSubClass12_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_invoker_SubSubClass12_descriptor,
        new java.lang.String[] { "Super", "Foo", });
    internal_static_invoker_SubSubClass21_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_invoker_SubSubClass21_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_invoker_SubSubClass21_descriptor,
        new java.lang.String[] { "Super", "Bar", "Sub11", "Sub1", });
    internal_static_invoker_SubSubClass22_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_invoker_SubSubClass22_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_invoker_SubSubClass22_descriptor,
        new java.lang.String[] { "Super", "Baz", "AnyType", });
    internal_static_invoker_InvokeRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_invoker_InvokeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_invoker_InvokeRequest_descriptor,
        new java.lang.String[] { "MethodName", "Arg", });
    internal_static_invoker_InvokeResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_invoker_InvokeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_invoker_InvokeResponse_descriptor,
        new java.lang.String[] { "ReturnValue", "Threw", "ReturnOrThrow", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}