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
import com.google.protobuf.Message;

/** Provides a mutable tree node so that changes can be made to the underlying Message.Builder. */
class MutableTreeNode extends ImmutableTreeNode {

  private final Message.Builder builder;

  public MutableTreeNode(Message.Builder builder) {
    super(builder);
    this.builder = builder;
  }

  @Override
  MutableTreeNode getChildNode(FieldDescriptor fieldDescriptor) {
    return new MutableTreeNode(builder.getFieldBuilder(fieldDescriptor));
  }

  @Override
  MutableTreeNode getRepeatedMessageNode(FieldDescriptor fieldDescriptor, int repeatedIndex) {
    return new MutableTreeNode(builder.getRepeatedFieldBuilder(fieldDescriptor, repeatedIndex));
  }

  /** Sets the value of fieldDescriptor to toSet. */
  public void setField(FieldDescriptor fieldDescriptor, String toSet) {
    builder.setField(fieldDescriptor, toSet);
  }

  /** Sets the value of a fieldDescriptor[index] to toSet. */
  public void setRepeatedField(FieldDescriptor fieldDescriptor, int index, String toSet) {
    builder.setRepeatedField(fieldDescriptor, index, toSet);
  }
}
