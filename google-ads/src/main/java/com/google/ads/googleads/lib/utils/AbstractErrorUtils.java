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

package com.google.ads.googleads.lib.utils;

import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.rpc.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/** Contains utility methods for handling partial failure of operations. */
public abstract class AbstractErrorUtils<
    GoogleAdsFailureT extends Message,
    GoogleAdsErrorT extends Message,
    FieldPathElementT extends Message> {

  /**
   * Gets a list of all partial failure error messages for a given response. Operations are indexed
   * from 0.
   *
   * <p>For example, given the following Failure:
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
   * A single {@link GoogleAdsErrorT} instance would be returned for operation index 1 and 2, and an
   * empty list otherwise.
   *
   * @param operationIndex the index of the operation, starting from 0.
   * @param partialFailureStatus a partialFailure status, with the detail list containing {@link
   *     GoogleAdsFailureT} instances.
   * @return a list containing the {@link GoogleAdsErrorT} instances for a given operation index.
   * @throws InvalidProtocolBufferException if not able to unpack the protocol buffer. This is most
   *     likely due to using the wrong version of ErrorUtils being used with the API response.
   */
  public List<GoogleAdsErrorT> getGoogleAdsErrors(long operationIndex, Status partialFailureStatus)
      throws InvalidProtocolBufferException {
    List<GoogleAdsErrorT> result = new ArrayList();
    for (Any detail : partialFailureStatus.getDetailsList()) {
      GoogleAdsFailureT failure = getGoogleAdsFailure(detail);
      result.addAll(getGoogleAdsErrors(operationIndex, failure));
    }
    return result;
  }

  /**
   * Return a list of {@link GoogleAdsErrorT} instances for a given operation index.
   *
   * @see #getGoogleAdsErrors(long, Status)
   */
  public List<GoogleAdsErrorT> getGoogleAdsErrors(
      long operationIndex, GoogleAdsFailureT googleAdsFailure) {
    List<GoogleAdsErrorT> result = new ArrayList();
    // Searches all the errors for one relating to the specified operation.
    for (ErrorPath<GoogleAdsErrorT> path : getErrorPaths(googleAdsFailure)) {
      if (("operations".equals(path.getFieldName())
              || "mutate_operations".equals(path.getFieldName()))
          && path.getIndex().isPresent()
          && path.getIndex().get() == operationIndex) {
        GoogleAdsErrorT error = path.getError();
        if (!result.contains(error)) {
          result.add(path.getError());
        }
      }
    }
    return result;
  }

  /**
   * Unpacks a single {@link GoogleAdsFailureT} from an {@link Any} instance.
   *
   * @throws InvalidProtocolBufferException if {@link GoogleAdsFailureT} is not able to unpack the
   *     protocol buffer. This is most likely due to using the wrong version of <code>ErrorUtils
   *     </code> being used.
   */
  public GoogleAdsFailureT getGoogleAdsFailure(Any detail) throws InvalidProtocolBufferException {
    return detail.unpack(getGoogleAdsFailureClass());
  }

  /** Checks if a result in a mutate response is a partial failure. */
  public boolean isPartialFailureResult(Message message) {
    return message.getSerializedSize() == 0;
  }

  /**
   * Extracts an {@link ErrorPath} for each <code>GoogleAdsError</code> in <code>
   * googleAdsFailure</code>.
   *
   * @param googleAdsFailure the failure from which to extract {@link ErrorPath}s.
   * @return all error paths found
   */
  protected Iterable<ErrorPath> getErrorPaths(GoogleAdsFailureT googleAdsFailure) {
    List<ErrorPath> errorPaths = new ArrayList<>();
    for (GoogleAdsErrorT googleAdsError : getGoogleAdsErrors(googleAdsFailure)) {
      List<FieldPathElementT> fieldPathElement = getFieldPathElements(googleAdsError);
      if (!fieldPathElement.isEmpty()) {
        errorPaths.add(createErrorPath(googleAdsError, fieldPathElement.get(0)));
      }
    }
    return errorPaths;
  }

  /**
   * Extracts the {@link FieldPathElementT} instances from the {@link GoogleAdsErrorT}.
   *
   * @param googleAdsError the error from which to extract field paths.
   * @return the available field paths.
   */
  public abstract List<FieldPathElementT> getFieldPathElements(GoogleAdsErrorT googleAdsError);

  /**
   * Extracts the {@link GoogleAdsErrorT} instances from {@link GoogleAdsFailureT}.
   *
   * @param googleAdsFailure the failure from which to extract.
   * @return the errors extracted.
   */
  public abstract List<GoogleAdsErrorT> getGoogleAdsErrors(GoogleAdsFailureT googleAdsFailure);

  /** Returns the {@link Class} instance for {@link GoogleAdsFailureT}. */
  public abstract Class<GoogleAdsFailureT> getGoogleAdsFailureClass();

  /** Creates an {@link ErrorPath} from a {@link GoogleAdsErrorT} and {@link FieldPathElementT}. */
  protected abstract ErrorPath<GoogleAdsErrorT> createErrorPath(
      GoogleAdsErrorT error, FieldPathElementT errorLocation);

  /**
   * Wrapper around a (@link GoogleAdsErrorT} specifying the location the error occurred, if
   * available.
   *
   * <p>Although multiple field paths are possible in a GoogleAdsError, this object only contains
   * the first FieldPathElement. Currently this is the only element required to identify which
   * operation caused the failure, though future updates may expand on this class to provide
   * additional information from the <code>FieldPathElement</code>s.
   */
  protected static class ErrorPath<GoogleAdsErrorType extends Message> {
    private final GoogleAdsErrorType error;
    private final String fieldName;
    private final Optional<Long> index;

    public ErrorPath(
        GoogleAdsErrorType error, String fieldName, Optional<Long> index) {
      this.error = error;
      this.fieldName = fieldName;
      this.index = index;
    }

    public GoogleAdsErrorType getError() {
      return error;
    }

    public String getFieldName() {
      return fieldName;
    }

    public Optional<Long> getIndex() {
      return index;
    }
  }
}
