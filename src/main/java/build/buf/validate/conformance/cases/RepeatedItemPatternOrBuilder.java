// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/repeated.proto

package build.buf.validate.conformance.cases;

public interface RepeatedItemPatternOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.RepeatedItemPattern)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return A list containing the val.
   */
  java.util.List<java.lang.String>
      getValList();
  /**
   * <code>repeated string val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return The count of val.
   */
  int getValCount();
  /**
   * <code>repeated string val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The val at the given index.
   */
  java.lang.String getVal(int index);
  /**
   * <code>repeated string val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the val at the given index.
   */
  com.google.protobuf.ByteString
      getValBytes(int index);
}
