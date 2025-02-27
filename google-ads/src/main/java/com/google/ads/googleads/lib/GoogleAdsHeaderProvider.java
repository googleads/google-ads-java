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

package com.google.ads.googleads.lib;

import com.google.ads.googleads.v19.services.stub.GoogleAdsServiceStubSettings;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.auto.value.AutoValue;
import com.google.auto.value.extension.memoized.Memoized;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.annotation.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A provider for setting the Google Ads API specific headers.
 *
 * <p>Credentials are not provided by this header set, rather these are handled by gRPC.
 */
@AutoValue
public abstract class GoogleAdsHeaderProvider implements HeaderProvider {

  private static final Logger logger = LoggerFactory.getLogger(GoogleAdsHeaderProvider.class);

  /** Returns a new builder for {@link GoogleAdsHeaderProvider} with only default values set. */
  public static Builder newBuilder() {
    return new AutoValue_GoogleAdsHeaderProvider.Builder();
  }

  /** Returns the configured developer token. */
  @Nullable
  public abstract String getDeveloperToken();

  /** Returns the configured login customer ID. */
  @Nullable
  public abstract Long getLoginCustomerId();

  /** Returns the configured linked customer ID. */
  @Nullable
  public abstract Long getLinkedCustomerId();

  @Override
  @Memoized
  public ImmutableMap<String, String> getHeaders() {
    Map<String, String> headers = new HashMap<>();
    if (getDeveloperToken() != null) {
      headers.put("developer-token", getDeveloperToken());
    }
    if (getLoginCustomerId() != null) {
      headers.put("login-customer-id", String.valueOf(getLoginCustomerId()));
    }
    if (getLinkedCustomerId() != null) {
      headers.put("linked-customer-id", String.valueOf(getLinkedCustomerId()));
    }
    // Add the x-goog-api-client header which is usually added by the stub settings. However,
    // this doesn't happen. Once we add headers, needsHeaders() is false, so GAX's
    // ClientContext.java doesn't add the additional headers.
    ApiClientHeaderProvider apiClient =
        ApiClientHeaderProvider.newBuilder()
            .setGeneratedLibToken(
                "gapic", GaxProperties.getLibraryVersion(GoogleAdsServiceStubSettings.class))
            .setTransportToken(
                GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion())
            .setClientLibToken("gccl", getLibraryVersion())
            .build();
    // Adds all the headers from the provider.
    headers.putAll(apiClient.getHeaders());

    // Adds the "pb/x.y.z" string to the API client header key with the runtime version of the
    // protobuf-java dependency.
    String protobufVersion = getProtobufVersion();
    if (protobufVersion != null) {
      // Gets the original value for the header.
      String apiClientHeader = headers.get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey());
      // Appends the protobuf version with the "pb/" prefix.
      apiClientHeader =
          Joiner.on(' ').skipNulls().join(apiClientHeader, String.format("pb/%s", protobufVersion));
      // Updates the entry for the header.
      headers.put(ApiClientHeaderProvider.getDefaultApiClientHeaderKey(), apiClientHeader);
    }
    return ImmutableMap.copyOf(headers);
  }

  private static String getLibraryVersion() {
    String implementationVersion =
        GoogleAdsHeaderProvider.class.getPackage().getImplementationVersion();
    return implementationVersion == null ? "0.0.0" : implementationVersion;
  }

  private static String getProtobufVersion() {
    // Tries to get the implementation version from the protobuf Message interface.
    String protobufImplVersion = Message.class.getPackage().getImplementationVersion();
    if (protobufImplVersion != null) {
      return protobufImplVersion;
    }
    // If the implementation version isn't available, attempts to retrieve the protobuf version from
    // the pom.properties file packaged in the protobuf-java JAR file.
    try (InputStream in =
        Message.class.getResourceAsStream(
            "/META-INF/maven/com.google.protobuf/protobuf-java/pom.properties")) {
      if (in != null) {
        Properties props = new Properties();
        props.load(in);
        return props.getProperty("version");
      }
    } catch (IOException e) {
      // Ignores exception reading from the file, as this is expected if the file does not exist.
    }
    return null;
  }

  @AutoValue.Builder
  public abstract static class Builder {

    /** Sets the developer token. */
    public abstract Builder setDeveloperToken(String developerToken);

    /** Sets the login customer ID. */
    public abstract Builder setLoginCustomerId(Long loginCustomerId);

    /** Sets the linked customer ID. */
    public abstract Builder setLinkedCustomerId(Long linkedCustomerId);

    /** Constructs a provider from the currently configured values. */
    public abstract GoogleAdsHeaderProvider build();
  }
}
