// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.lib.utils;

import com.google.common.base.Preconditions;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor.Type;
import com.google.protobuf.FieldMask;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Message;
import java.util.Objects;

/** Utility methods for working with field masks. */
public class FieldMasks {

  /**
   * Compares two protobuf message objects and computes a FieldMask based on the differences between
   * the two objects. This method can be used to help construct the FieldMask object required by
   * some API methods.
   *
   * <p>Example usage:
   *
   * <pre><code>
   * Foo originalFoo = client.getFoo();
   * Foo updatedFoo = originalFoo.toBuilder().setBar("new-bar").build();
   * FieldMask fieldMask = FieldMasks.compare(originalFoo, updatedFoo);
   * client.updateFoo(updatedFoo, fieldMask);
   * </code></pre>
   *
   * @param original The original protobuf message object.
   * @param modified The modified protobuf message object.
   * @return A FieldMask reflecting the changes between the original and modified objects.
   */
  public static <T extends GeneratedMessageV3> FieldMask compare(T original, T modified) {
    Preconditions.checkNotNull(original, "original is null");
    Preconditions.checkNotNull(modified, "modified is null");

    FieldMask.Builder mask = FieldMask.newBuilder();
    compare(mask, "", original, modified);
    return mask.build();
  }

  /**
   * Computes a FieldMask based on all of the fields of message that have been set.
   *
   * <p>For a message object {@code foo}, {@code FieldMasks.allSetFieldsOf(foo)} is equivalent to
   * {@code FieldMasks.compare(foo.getDefaultInstanceForType(), foo)}
   */
  public static <T extends GeneratedMessageV3> FieldMask allSetFieldsOf(T message) {
    Preconditions.checkNotNull(message, "message is null");
    return compare((T) message.getDefaultInstanceForType(), message);
  }

  private static void compare(
      FieldMask.Builder mask, String currentField, Message original, Message modified) {
    Descriptor descriptor = original.getDescriptorForType();
    for (FieldDescriptor field : descriptor.getFields()) {
      String fieldName = getFieldName(currentField, field);
      Object originalValue = original.getField(field);
      Object modifiedValue = modified.getField(field);
      if (field.isRepeated()) {
        if (!Objects.equals(originalValue, modifiedValue)) {
          mask.addPaths(fieldName);
        }
      } else {
        switch (field.getJavaType()) {
          case MESSAGE:
            // Because getField never returns null, we use hasField to distinguish null
            // from empty message when getType() == MESSAGE
            if (original.hasField(field) != modified.hasField(field)
                || !Objects.equals(originalValue, modifiedValue)) {
              if (isWrapperType(field.getMessageType())) {
                // For wrapper types, just emit the field name.
                mask.addPaths(fieldName);
              } else if (!original.hasField(field)) {
                // New value? Emit the field names for all known fields in the message,
                // recursing for nested messages.
                addNewFields(mask, fieldName, (Message) modifiedValue);
              } else if (!modified.hasField(field)) {
                // Just emit the deleted field name
                mask.addPaths(fieldName);
              } else {
                // Recursively compare to find different values
                compare(mask, fieldName, (Message) originalValue, (Message) modifiedValue);
              }
            }
            break;
          case INT:
          case LONG:
          case FLOAT:
          case DOUBLE:
          case BOOLEAN:
          case STRING:
          case BYTE_STRING:
          case ENUM:
            // Handle all java types except MESSAGE
            if (!Objects.equals(originalValue, modifiedValue)) {
              mask.addPaths(fieldName);
            }
            break;
          default:
            throw new IllegalArgumentException(
                "Unexpected java type "
                    + field.getJavaType()
                    + " encountered for field "
                    + fieldName);
        }
      }
    }
  }

  private static String getFieldName(String currentField, FieldDescriptor field) {
    if (currentField.isEmpty()) {
      return field.getName();
    } else {
      return currentField + "." + field.getName();
    }
  }

  /**
   * Recursively add field names for a new message. Repeated fields, primitive fields and
   * unpopulated single message fields are included just by name; populated single message fields
   * are processed recursively, only including leaf nodes. For wrapper types, the 'value' leaf
   * node is excluded.
   */
  private static void addNewFields(FieldMask.Builder mask, String currentField, Message message) {
    Descriptor descriptor = message.getDescriptorForType();
    if (isWrapperType(descriptor)) {
      // For wrapper types, don't recurse over the fields of the message.
      mask.addPaths(currentField);
    } else {
      for (FieldDescriptor field : descriptor.getFields()) {
        String name = getFieldName(currentField, field);
        // For single message fields, recurse if there's a value; otherwise just add the field name.
        if (!field.isRepeated() && field.getType() == Type.MESSAGE && message.hasField(field)) {
          Message value = (Message) message.getField(field);
          addNewFields(mask, name, value);
        } else {
          mask.addPaths(name);
        }
      }
    }
  }

  private static boolean isWrapperType(Descriptor descriptor) {
    return descriptor.getFile().getPackage().equals("google.protobuf")
        && descriptor.getFile().getFullName().equals("google/protobuf/wrappers.proto");
  }
}
