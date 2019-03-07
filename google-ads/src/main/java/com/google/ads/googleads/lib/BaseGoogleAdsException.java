// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.lib;

import com.google.api.gax.rpc.ApiException;
import com.google.common.annotations.VisibleForTesting;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import io.grpc.Metadata;
import io.grpc.Status;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base class for GoogleAdsException. Provides a generic holder for GoogleAdsFailures which can be
 * replaced with statically typed subclasses for a specific version of GoogleAdsFailure.
 */
public abstract class BaseGoogleAdsException extends ApiException {

  private static final Logger logger = LoggerFactory.getLogger(BaseGoogleAdsException.class);
  private static final Metadata.Key<String> REQUEST_ID_HEADER_KEY =
      Metadata.Key.of("request-id", Metadata.ASCII_STRING_MARSHALLER);
  private final Metadata metadata;
  private final Message failure;

  /** Create from ApiException, GoogleAdsFailure (as Message) and metadata. */
  public <T extends Message> BaseGoogleAdsException(
      ApiException original, T failure, Metadata metadata) {
    super(original.getCause(), original.getStatusCode(), original.isRetryable());
    this.metadata = metadata;
    this.failure = failure;
  }

  /**
   * Get the request id returned in the RPC trailers. Returns null if the RPC has not completed or
   * no request id was received.
   */
  public String getRequestId() {
    return getHeader(REQUEST_ID_HEADER_KEY);
  }

  /**
   * Get a string value from the trailers returned by the RPC. If the given key is not present,
   * returns null.
   */
  <T> T getHeader(Metadata.Key<T> headerKey) {
    if (metadata == null) {
      return null;
    }
    return metadata.get(headerKey);
  }

  /**
   * Return the decoded GoogleAdsFailure. Subclasses can override this method to return version
   * specific types.
   */
  public Message getGoogleAdsFailure() {
    return failure;
  }

  /**
   * Optionally create a GoogleAdsException from a ApiException.
   *
   * <p>Returns an Optional containing the underlying GoogleAdsException if the ApiException
   * contains the appropriate metadata.
   *
   * <p>Returns an empty Optional if the required metadata is not present or is not parsable.
   */
  public abstract static class Factory<T extends BaseGoogleAdsException, U extends Message> {
    public Optional<T> createGoogleAdsException(ApiException source) {
      if (source == null) {
        return Optional.empty();
      }
      Throwable cause = source.getCause();
      if (cause == null) {
        return Optional.empty();
      }
      Metadata metadata = Status.trailersFromThrowable(cause);
      if (metadata == null) {
        return Optional.empty();
      }
      byte[] protoData = metadata.get(getTrailerKey());
      if (protoData == null) {
        return Optional.empty();
      }
      try {
        return Optional.of(createException(source, protoData, metadata));
      } catch (InvalidProtocolBufferException e) {
        logger.error("Failed to decode GoogleAdsFailure", e);
        return Optional.empty();
      }
    }

    protected abstract T createException(
        ApiException source, byte[] protoData, Metadata metadata)
        throws InvalidProtocolBufferException;

    /**
     * Returns a Metadata.Key representing the key which the GoogleAdsFailure is returned in the
     * metadata.
     */
    public abstract Metadata.Key<byte[]> getTrailerKey();

    /** Create an empty GoogleAdsFailure instance for this version. */
    @VisibleForTesting
    public abstract U createDefaultFailure();

    protected static Metadata.Key<byte[]> createKey(String trailerKey) {
      return Metadata.Key.of(trailerKey, Metadata.BINARY_BYTE_MARSHALLER);
    }
  }
}
