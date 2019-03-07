// Copyright 2019 Google LLC
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

package com.google.ads.googleads.v1.utils;

import com.google.ads.googleads.v1.errors.ErrorLocation.FieldPathElement;
import com.google.ads.googleads.v1.errors.GoogleAdsError;
import com.google.ads.googleads.v1.errors.GoogleAdsFailure;
import com.google.protobuf.Any;
import com.google.protobuf.Int64Value;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.rpc.Status;
import java.util.ArrayList;
import java.util.List;

/** Contains utility methods for handling partial failure of operations. */
public class ErrorUtils {

  /**
   * Gets a list of all partial failure error messages for a given response. Operations are indexed
   * from 0.
   *
   * <p>For example, given the following GoogleAdsFailure:
   *
   * <pre>
   *   <code>
   *     errors {
   *       message: "Too low."
   *       location {
   *         field_path_elements {
   *           field_name: "operations"
   *           index {
   *             value: 1
   *           }
   *         }
   *         field_path_elements {
   *           field_name: "create"
   *         }
   *         field_path_elements {
   *           field_name: "campaign"
   *         }
   *       }
   *     }
   *     errors {
   *       message: "Too low."
   *       location {
   *         field_path_elements {
   *           field_name: "operations"
   *           index {
   *             value: 2
   *           }
   *         }
   *         field_path_elements {
   *           field_name: "create"
   *         }
   *         field_path_elements {
   *           field_name: "campaign"
   *         }
   *       }
   *     }
   *   </code>
   * </pre>
   *
   * A single GoogleAdsError instance would be returned for operation index 1 and 2, and an empty
   * list otherwise.
   *
   * @param operationIndex the index of the operation, starting from 0.
   * @param partialFailureStatus a partialFailure status, with the detail list containing
   *     GoogleAdsFailure instances.
   * @return a list containing the GoogleAdsError instances for a given operation index.
   * @throws InvalidProtocolBufferException if GoogleAdsFailure is not able to unpack the protocol
   *     buffer. This is most likely due to using the wrong version of ErrorUtils being used.
   */
  public static List<GoogleAdsError> getGoogleAdsErrors(
      long operationIndex, Status partialFailureStatus) throws InvalidProtocolBufferException {
    List<GoogleAdsError> result = new ArrayList();
    for (Any detail : partialFailureStatus.getDetailsList()) {
      GoogleAdsFailure failure = getGoogleAdsFailure(detail);
      result.addAll(getGoogleAdsErrors(operationIndex, failure));
    }
    return result;
  }

  /**
   * Return a list of GoogleAdsError instances for a given operation index.
   *
   * @see #getGoogleAdsErrors(long, Status)
   */
  public static List<GoogleAdsError> getGoogleAdsErrors(
      long operationIndex, GoogleAdsFailure failure) {
    List<GoogleAdsError> result = new ArrayList();
    // Searches all the errors for one relating to the specified operation.
    for (GoogleAdsError error : failure.getErrorsList()) {
      List<FieldPathElement> pathElements = error.getLocation().getFieldPathElementsList();
      if (!pathElements.isEmpty()) {
        FieldPathElement element = pathElements.get(0);
        String fieldName = element.getFieldName();
        Int64Value index = element.getIndex();
        // Checks if the first element is operations with the requested index.
        if (fieldName.equals("operations")
            && element.hasIndex()
            && index.getValue() == operationIndex) {
          result.add(error);
        }
      }
    }
    return result;
  }

  /**
   * Unpacks a single GoogleAdsFailure from an Any instance.
   *
   * @throws InvalidProtocolBufferException if GoogleAdsFailure is not able to unpack the protocol
   *     buffer. This is most likely due to using the wrong version of ErrorUtils being used.
   */
  public static GoogleAdsFailure getGoogleAdsFailure(Any any)
      throws InvalidProtocolBufferException {
    return any.unpack(GoogleAdsFailure.class);
  }

  /**
   * Unpacks GoogleAdsFailure from the partial failure Status.
   *
   * @throws InvalidProtocolBufferException if GoogleAdsFailure is not able to unpack the protocol
   *     buffer. This is most likely due to using the wrong version of ErrorUtils has been used.
   */
  public static List<GoogleAdsFailure> getGoogleAdsFailure(Status status)
      throws InvalidProtocolBufferException {
    List<GoogleAdsFailure> result = new ArrayList(status.getDetailsCount());
    for (Any any : status.getDetailsList()) {
      result.add(getGoogleAdsFailure(any));
    }
    return result;
  }

  /** Checks if a result in a mutate response is a partial failure. */
  public static <T extends Message> boolean isPartialFailureResult(T message) {
    return message.getSerializedSize() == 0;
  }
}
