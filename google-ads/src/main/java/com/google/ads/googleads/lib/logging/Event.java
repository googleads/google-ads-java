// Copyright 2019 Google LLC
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

package com.google.ads.googleads.lib.logging;

import com.google.ads.googleads.lib.stubs.exceptions.BaseGoogleAdsException.Factory;
import com.google.ads.googleads.lib.catalog.ApiCatalog;
import com.google.ads.googleads.lib.catalog.Version;
import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.Status.Code;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/** Base class with common fields logged in all event cases. */
abstract class Event {

  /** The gRPC response status. */
  @Nullable
  public abstract Status getResponseStatus();

  /** True if the request succeeded, false otherwise. */
  public abstract boolean isSuccess();

  /** The RPC method invoked in the request. */
  @Nullable
  public abstract String getMethodName();

  /** The endpoint requests where requests were sent. */
  @Nullable
  public abstract String getEndpoint();

  /** The code associated with the response status, or null if not present. */
  public Code getResponseCode() {
    return getResponseStatus() == null ? null : getResponseStatus().getCode();
  }

  /** The description associates with the response status, or null if not present. */
  public String getResponseDescription() {
    return getResponseStatus() == null ? null : getResponseStatus().getDescription();
  }

  /** A summary of the RPC, specifying only customer ID and request ID. */
  @AutoValue
  abstract static class Summary extends Event {

    /** Create a new summary event builder. */
    public static Builder builder() {
      return new AutoValue_Event_Summary.Builder();
    }

    /** Customer ID if specified in the request object, otherwise null. */
    @Nullable
    public abstract String getCustomerId();

    /** Request ID if returned by the server, null otherwise. */
    @Nullable
    public abstract String getRequestId();

    @AutoValue.Builder
    abstract static class Builder {

      public abstract Summary build();

      public abstract Builder setResponseStatus(Status responseStatus);

      public abstract Builder setSuccess(boolean isSuccess);

      public abstract Builder setMethodName(String methodName);

      public abstract Builder setCustomerId(String customerId);

      public abstract Builder setEndpoint(String endpoint);

      public abstract Builder setRequestId(String requestId);
    }
  }

  /**
   * A detailed event description, including the request/response headers and the messages
   * exchanged.
   */
  @AutoValue
  abstract static class Detail extends Event {

    /** Create a new Detail event builder. */
    public static Detail.Builder builder() {
      return new AutoValue_Event_Detail.Builder();
    }

    /** The raw request headers. */
    @Nullable
    public abstract ImmutableMap<String, String> getRawRequestHeaders();

    /**
     * A scrubbed version of the headers, sanitized to remove developer token, authorization etc.
     */
    public abstract ImmutableMap<String, String> getScrubbedRequestHeaders();

    /** Any response headers that were received. */
    @Nullable
    public abstract Metadata getResponseHeaderMetadata();

    /** Any response trailers that were received. */
    @Nullable
    public abstract Metadata getResponseTrailerMetadata();

    /** A response object, if one was received. */
    @Nullable
    public abstract Object getResponse();

    /** A request object, if one was sent. */
    @Nullable
    public abstract Object getRequest();

    /** The response message as a string, or null if not present. */
    public String getResponseAsText() {
      return getResponse() == null ? null : getResponse().toString();
    }

    /**
     * Attempts to read the GoogleAdsFailure from the response, if present. This is a relatively
     * expensive operation when the proto is present, so call this method judiciously.
     *
     * @return an empty Optional if no GoogleAdsFailure was found.
     * @throws InvalidProtocolBufferException if a failure was present but could not be read.
     */
    public Optional<Message> deserializeFailureMessage() throws InvalidProtocolBufferException {
      Metadata trailers = getResponseTrailerMetadata();
      if (trailers != null) {
        for (Version version : ApiCatalog.getDefault().getSupportedVersions()) {
          Factory exceptionFactory = version.getExceptionFactory();
          Metadata.Key<byte[]> trailerKey = exceptionFactory.getTrailerKey();
          if (trailers.containsKey(trailerKey)) {
            return Optional.ofNullable(
                exceptionFactory.createGoogleAdsFailure(trailers.get(trailerKey)));
          }
        }
      }
      return Optional.empty();
    }

    @AutoValue.Builder
    abstract static class Builder {
      public abstract Detail build();

      public abstract Builder setResponseStatus(Status responseStatus);

      public abstract Builder setSuccess(boolean isSuccess);

      public abstract Builder setMethodName(String methodName);

      public abstract Builder setRawRequestHeaders(Map<String, String> rawRequestHeaders);

      public abstract Builder setScrubbedRequestHeaders(Map<String, String> scrubbedRequestHeaders);

      public abstract Builder setEndpoint(String endpoint);

      public abstract Builder setRequest(Object request);

      public abstract Builder setResponseHeaderMetadata(Metadata responseHeaders);

      public abstract Builder setResponseTrailerMetadata(Metadata responseTrailers);

      public abstract Builder setResponse(Object response);
    }
  }
}
