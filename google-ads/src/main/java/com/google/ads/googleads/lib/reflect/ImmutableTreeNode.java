// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.lib.reflect;

import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.MessageOrBuilder;

/**
 * Defines a tree node based on a {@link MessageOrBuilder}. This type of node is used for immutable
 * cases, e.g. to read the value from a tree. To traverse a mutable version of the protobuf message,
 * use {@link MutableTreeNode}.
 *
 * <p>Wraps MessageOrBuilder so that we can provide additional methods in sub-classes without having
 * to inherit MessageOrBuilder (and implement all methods). For example, this lets {@link
 * MutableTreeNode} add set() methods which are not present on {@link MessageOrBuilder}.
 */
class ImmutableTreeNode {

  private final MessageOrBuilder messageOrBuilder;

  public ImmutableTreeNode(MessageOrBuilder messageOrBuilder) {
    this.messageOrBuilder = messageOrBuilder;
  }

  /** Gets the {@link MessageOrBuilder} object represented by this tree node. */
  MessageOrBuilder getMessageOrBuilder() {
    return messageOrBuilder;
  }

  /**
   * Checks if the {@link MessageOrBuilder} has the field. Note: repeated fields are always present
   * even if empty.
   */
  boolean hasField(FieldDescriptor fieldDescriptor) {
    return messageOrBuilder.hasField(fieldDescriptor);
  }

  /** Gets the value of a field */
  Object getFieldValue(FieldDescriptor fieldDescriptor) {
    return messageOrBuilder.getField(fieldDescriptor);
  }

  /**
   * Gets a node that is the value of calling getField(fieldDescriptor) on the {@link
   * MessageOrBuilder} in this node.
   */
  ImmutableTreeNode getChildNode(FieldDescriptor fieldDescriptor) {
    return new ImmutableTreeNode((MessageOrBuilder) getFieldValue(fieldDescriptor));
  }

  /** Gets the number of values in a repeated field. */
  int getRepeatedFieldCount(FieldDescriptor fieldDescriptor) {
    return messageOrBuilder.getRepeatedFieldCount(fieldDescriptor);
  }

  /**
   * Gets a value from a repeated field.
   *
   * @throws ClassCastException if FieldDescriptor.getType() != FieldType.MESSAGE.
   */
  ImmutableTreeNode getRepeatedMessageNode(FieldDescriptor fieldDescriptor, int repeatedIndex) {
    return new ImmutableTreeNode(
        (MessageOrBuilder) messageOrBuilder.getRepeatedField(fieldDescriptor, repeatedIndex));
  }
}
