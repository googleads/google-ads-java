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

import com.google.ads.googleads.lib.logging.scrub.FieldAccessor;
import com.google.ads.googleads.lib.reflect.ReflectionTraversal.Visitor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/** Sets values on a protobuf object based on a string representation of the path to the value. */
public class ReflectionFieldAccessor implements FieldAccessor {

  private final List<String> fieldNames;

  public ReflectionFieldAccessor(String path) {
    this.fieldNames = Arrays.asList(path.split("\\."));
  }

  @Override
  public Message setFieldIfPresent(final Message input, String toSet) {
    Message.Builder builder = input.toBuilder();
    ReflectionTraversal.visitFieldPath(
        new MutableTreeNode(builder), fieldNames, new SetIfPresentVisitor(toSet));
    return builder.build();
  }

  @Override
  public <T> List<T> getValues(Message input) {
    GetValueVisitor visitor = new GetValueVisitor();
    ReflectionTraversal.visitFieldPath(new ImmutableTreeNode(input), fieldNames, visitor);
    return (List<T>) visitor.getValues();
  }

  private static class SetIfPresentVisitor implements Visitor<MutableTreeNode> {

    private final String toSet;

    public SetIfPresentVisitor(String toSet) {
      this.toSet = toSet;
    }

    @Override
    public void visitUnaryField(MutableTreeNode currentBuilder, FieldDescriptor fieldDescriptor) {
      // Sets the value for primitive fields.
      currentBuilder.setField(fieldDescriptor, toSet);
    }

    @Override
    public void visitRepeatedField(
        MutableTreeNode currentBuilder, FieldDescriptor fieldDescriptor) {
      // Sets the value for primitive repeated fields.
      // Currently unused since we don't need to scrub repeated fields, but provides a sensible
      // implementation in case we need to in future.
      int numRepeatedValues = currentBuilder.getRepeatedFieldCount(fieldDescriptor);
      for (int i = 0; i < numRepeatedValues; ++i) {
        currentBuilder.setRepeatedField(fieldDescriptor, i, toSet);
      }
    }
  }

  private static class GetValueVisitor implements Visitor<ImmutableTreeNode> {

    private final List<Object> values = new ArrayList();

    @Override
    public void visitUnaryField(ImmutableTreeNode currentBuilder, FieldDescriptor fieldDescriptor) {
      values.add(currentBuilder.getFieldValue(fieldDescriptor));
    }

    @Override
    public void visitRepeatedField(
        ImmutableTreeNode currentBuilder, FieldDescriptor fieldDescriptor) {
      values.addAll((Collection<Object>) currentBuilder.getFieldValue(fieldDescriptor));
    }

    public List<Object> getValues() {
      return Collections.unmodifiableList(values);
    }
  }
}
