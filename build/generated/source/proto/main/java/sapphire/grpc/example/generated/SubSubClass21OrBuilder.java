// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rmi_via_grpc.proto

package sapphire.grpc.example.generated;

public interface SubSubClass21OrBuilder extends
    // @@protoc_insertion_point(interface_extends:invoker.SubSubClass21)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.invoker.SubClass2 super = 1;</code>
   */
  boolean hasSuper();
  /**
   * <code>.invoker.SubClass2 super = 1;</code>
   */
  sapphire.grpc.example.generated.SubClass2 getSuper();
  /**
   * <code>.invoker.SubClass2 super = 1;</code>
   */
  sapphire.grpc.example.generated.SubClass2OrBuilder getSuperOrBuilder();

  /**
   * <pre>
   * Example primitive type;
   * </pre>
   *
   * <code>int32 bar = 2;</code>
   */
  int getBar();

  /**
   * <pre>
   * Example direct reference to an instance of a non-base class.
   * </pre>
   *
   * <code>.invoker.SubSubClass11 sub11 = 3;</code>
   */
  boolean hasSub11();
  /**
   * <pre>
   * Example direct reference to an instance of a non-base class.
   * </pre>
   *
   * <code>.invoker.SubSubClass11 sub11 = 3;</code>
   */
  sapphire.grpc.example.generated.SubSubClass11 getSub11();
  /**
   * <pre>
   * Example direct reference to an instance of a non-base class.
   * </pre>
   *
   * <code>.invoker.SubSubClass11 sub11 = 3;</code>
   */
  sapphire.grpc.example.generated.SubSubClass11OrBuilder getSub11OrBuilder();

  /**
   * <pre>
   * Example reference via a parent type.
   * </pre>
   *
   * <code>.invoker.SubClass1 sub1 = 4;</code>
   */
  boolean hasSub1();
  /**
   * <pre>
   * Example reference via a parent type.
   * </pre>
   *
   * <code>.invoker.SubClass1 sub1 = 4;</code>
   */
  sapphire.grpc.example.generated.SubClass1 getSub1();
  /**
   * <pre>
   * Example reference via a parent type.
   * </pre>
   *
   * <code>.invoker.SubClass1 sub1 = 4;</code>
   */
  sapphire.grpc.example.generated.SubClass1OrBuilder getSub1OrBuilder();
}