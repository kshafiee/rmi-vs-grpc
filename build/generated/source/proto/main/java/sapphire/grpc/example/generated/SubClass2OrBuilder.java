// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rmi_via_grpc.proto

package sapphire.grpc.example.generated;

public interface SubClass2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:invoker.SubClass2)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Equivalent to java 'super'.  Refers to parent in inheritance hierarchy.
   * </pre>
   *
   * <code>.invoker.Base super = 1;</code>
   */
  boolean hasSuper();
  /**
   * <pre>
   * Equivalent to java 'super'.  Refers to parent in inheritance hierarchy.
   * </pre>
   *
   * <code>.invoker.Base super = 1;</code>
   */
  sapphire.grpc.example.generated.Base getSuper();
  /**
   * <pre>
   * Equivalent to java 'super'.  Refers to parent in inheritance hierarchy.
   * </pre>
   *
   * <code>.invoker.Base super = 1;</code>
   */
  sapphire.grpc.example.generated.BaseOrBuilder getSuperOrBuilder();

  /**
   * <pre>
   * Note: masks parent class's field.
   * </pre>
   *
   * <code>double value = 2;</code>
   */
  double getValue();

  /**
   * <code>int32 Shortval = 3;</code>
   */
  int getShortval();

  /**
   * <code>.invoker.SubSubClass21 subsubclass21 = 4;</code>
   */
  boolean hasSubsubclass21();
  /**
   * <code>.invoker.SubSubClass21 subsubclass21 = 4;</code>
   */
  sapphire.grpc.example.generated.SubSubClass21 getSubsubclass21();
  /**
   * <code>.invoker.SubSubClass21 subsubclass21 = 4;</code>
   */
  sapphire.grpc.example.generated.SubSubClass21OrBuilder getSubsubclass21OrBuilder();

  /**
   * <code>.invoker.SubSubClass22 subsubclass22 = 5;</code>
   */
  boolean hasSubsubclass22();
  /**
   * <code>.invoker.SubSubClass22 subsubclass22 = 5;</code>
   */
  sapphire.grpc.example.generated.SubSubClass22 getSubsubclass22();
  /**
   * <code>.invoker.SubSubClass22 subsubclass22 = 5;</code>
   */
  sapphire.grpc.example.generated.SubSubClass22OrBuilder getSubsubclass22OrBuilder();

  public sapphire.grpc.example.generated.SubClass2.SubClassesCase getSubClassesCase();
}
