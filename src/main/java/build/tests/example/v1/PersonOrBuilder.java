// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tests/example/v1/example.proto

package build.tests.example.v1;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tests.example.v1.Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string email = 2 [json_name = "email", (.buf.validate.field) = { ... }</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 2 [json_name = "email", (.buf.validate.field) = { ... }</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string name = 3 [json_name = "name", (.buf.validate.field) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3 [json_name = "name", (.buf.validate.field) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.tests.example.v1.Coordinates home = 4 [json_name = "home"];</code>
   * @return Whether the home field is set.
   */
  boolean hasHome();
  /**
   * <code>.tests.example.v1.Coordinates home = 4 [json_name = "home"];</code>
   * @return The home.
   */
  build.tests.example.v1.Coordinates getHome();
  /**
   * <code>.tests.example.v1.Coordinates home = 4 [json_name = "home"];</code>
   */
  build.tests.example.v1.CoordinatesOrBuilder getHomeOrBuilder();
}
