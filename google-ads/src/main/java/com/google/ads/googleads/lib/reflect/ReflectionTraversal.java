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

import com.google.ads.googleads.lib.logging.scrub.FieldDescriptorCache;
import com.google.protobuf.Descriptors.FieldDescriptor;
import java.util.List;
import java.util.Optional;

/**
 * Implements a tree traversal for protobuf messages. The path to a field can be specified as a .
 * delimited string and a callback will be run for the value at the end of the path.
 *
 * <p>For example, a SearchGoogleAdsStreamResponse message with a path of results.campaign.budget
 * would visit all campaign budget references in all GoogleAdsRow instances.
 */
class ReflectionTraversal {

  private static final FieldDescriptorCache FIELD_DESCRIPTOR_CACHE =
      FieldDescriptorCache.getDefault();

  /** Defines a visitor interface to be invoked for fields being traversed. */
  interface Visitor<TreeNodeType extends ImmutableTreeNode> {

    /** Visits a unary (aka not repeated) field. */
    void visitUnaryField(TreeNodeType currentBuilder, FieldDescriptor fieldDescriptor);

    /** Visits a repeated field. */
    void visitRepeatedField(TreeNodeType currentBuilder, FieldDescriptor fieldDescriptor);
  }

  /**
   * Traverses a tree of protobuf messages based on a list of field path elements.
   *
   * @param node the starting node.
   * @param fieldPathElements the path to traverse through the tree.
   * @param visitor a callback which should be made for the value at the end of the traversed path.
   */
  public static <TreeNodeType extends ImmutableTreeNode> void visitFieldPath(
      TreeNodeType node, List<String> fieldPathElements, Visitor<TreeNodeType> visitor) {
    TreeNodeType currentNode = node;
    // Steps through the field path elements, updating the fieldDescriptor
    for (int fieldIndex = 0; fieldIndex < fieldPathElements.size(); ++fieldIndex) {
      FieldDescriptor fieldDescriptor =
          lookupFieldDescriptor(fieldPathElements, currentNode, fieldIndex);
      // Checks if the field is present (repeated fields are always present).
      if (!fieldDescriptor.isRepeated() && !currentNode.hasField(fieldDescriptor)) {
        return;
      }
      // Consumes the value if we're on the last field path element.
      if (fieldIndex == fieldPathElements.size() - 1) {
        if (fieldDescriptor.isRepeated()) {
          visitor.visitRepeatedField(currentNode, fieldDescriptor);
        } else {
          visitor.visitUnaryField(currentNode, fieldDescriptor);
        }
        return;
      }
      // Since we're not at the end of the path, then we must be on a Message field.
      if (fieldDescriptor.getType() != FieldDescriptor.Type.MESSAGE) {
        throw new IllegalStateException(
            "Unable to access subfield of " + fieldDescriptor + " which is not a Message");
      }
      // Processes the next path element.
      if (fieldDescriptor.isRepeated()) {
        // Continues processing repeated messages recursively.
        recurseIntoRepeatedMessage(
            currentNode,
            fieldDescriptor,
            visitor,
            fieldPathElements.subList(fieldIndex + 1, fieldPathElements.size()));
        // Returns early since the value will have been consumed recursively.
        return;
      } else {
        // Otherwise we're still in the middle of processing the path, so get the next builder and
        // continue.
        currentNode = (TreeNodeType) currentNode.getChildNode(fieldDescriptor);
      }
    }
  }

  /**
   * Visits all of the repeated messages of currentNode in fieldDescriptor.
   *
   * @param currentNode the node containing the repeated field to visit recursively.
   * @param fieldDescriptor the repeated field in currentNode to visit recursively.
   * @param visitor the visitor callback.
   * @param remainingFieldPathElements the field path elements to be visited.
   */
  private static void recurseIntoRepeatedMessage(
      ImmutableTreeNode currentNode,
      FieldDescriptor fieldDescriptor,
      Visitor visitor,
      List<String> remainingFieldPathElements) {
    int numRepeatedValues = currentNode.getRepeatedFieldCount(fieldDescriptor);
    for (int i = 0; i < numRepeatedValues; ++i) {
      visitFieldPath(
          currentNode.getRepeatedMessageNode(fieldDescriptor, i),
          remainingFieldPathElements,
          visitor);
    }
  }

  /**
   * Looks up and validates a FieldDescriptor from the cache.
   *
   * @throws IllegalStateException if the descriptor was not found.
   */
  private static FieldDescriptor lookupFieldDescriptor(
      List<String> fieldPathElements, ImmutableTreeNode currentNode, int fieldIndex) {
    String fieldName = fieldPathElements.get(fieldIndex);
    Optional<FieldDescriptor> fieldDescriptorLookup =
        FIELD_DESCRIPTOR_CACHE.lookupField(fieldName, currentNode.getMessageOrBuilder());
    if (!fieldDescriptorLookup.isPresent()) {
      throw new IllegalStateException(
          "Unknown field " + fieldName + " in " + currentNode.getClass());
    }
    return fieldDescriptorLookup.get();
  }
}
