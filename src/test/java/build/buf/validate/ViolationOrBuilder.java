// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/expression.proto

package build.buf.validate;

public interface ViolationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.Violation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `field_path` is a machine-readable identifier that points to the specific field that failed the validation.
   * This could be a nested field, in which case the path will include all the parent fields leading to the actual field that caused the violation.
   * </pre>
   *
   * <code>string field_path = 1 [json_name = "fieldPath"];</code>
   * @return The fieldPath.
   */
  java.lang.String getFieldPath();
  /**
   * <pre>
   * `field_path` is a machine-readable identifier that points to the specific field that failed the validation.
   * This could be a nested field, in which case the path will include all the parent fields leading to the actual field that caused the violation.
   * </pre>
   *
   * <code>string field_path = 1 [json_name = "fieldPath"];</code>
   * @return The bytes for fieldPath.
   */
  com.google.protobuf.ByteString
      getFieldPathBytes();

  /**
   * <pre>
   * `constraint_id` is the unique identifier of the `Constraint` that was not fulfilled.
   * This is the same `id` that was specified in the `Constraint` message, allowing easy tracing of which rule was violated.
   * </pre>
   *
   * <code>string constraint_id = 2 [json_name = "constraintId"];</code>
   * @return The constraintId.
   */
  java.lang.String getConstraintId();
  /**
   * <pre>
   * `constraint_id` is the unique identifier of the `Constraint` that was not fulfilled.
   * This is the same `id` that was specified in the `Constraint` message, allowing easy tracing of which rule was violated.
   * </pre>
   *
   * <code>string constraint_id = 2 [json_name = "constraintId"];</code>
   * @return The bytes for constraintId.
   */
  com.google.protobuf.ByteString
      getConstraintIdBytes();

  /**
   * <pre>
   * `message` is a human-readable error message that describes the nature of the violation.
   * This can be the default error message from the violated `Constraint`, or it can be a custom message that gives more context about the violation.
   * </pre>
   *
   * <code>string message = 3 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * `message` is a human-readable error message that describes the nature of the violation.
   * This can be the default error message from the violated `Constraint`, or it can be a custom message that gives more context about the violation.
   * </pre>
   *
   * <code>string message = 3 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
