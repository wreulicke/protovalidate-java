// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/wkt_duration.proto

package build.buf.validate.conformance.cases;

public interface DurationFieldWithOtherFieldsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.DurationFieldWithOtherFields)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Duration duration_val = 1 [json_name = "durationVal", (.buf.validate.field) = { ... }</code>
   * @return Whether the durationVal field is set.
   */
  boolean hasDurationVal();
  /**
   * <code>.google.protobuf.Duration duration_val = 1 [json_name = "durationVal", (.buf.validate.field) = { ... }</code>
   * @return The durationVal.
   */
  com.google.protobuf.Duration getDurationVal();
  /**
   * <code>.google.protobuf.Duration duration_val = 1 [json_name = "durationVal", (.buf.validate.field) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationValOrBuilder();

  /**
   * <code>int32 int_val = 2 [json_name = "intVal", (.buf.validate.field) = { ... }</code>
   * @return The intVal.
   */
  int getIntVal();
}
