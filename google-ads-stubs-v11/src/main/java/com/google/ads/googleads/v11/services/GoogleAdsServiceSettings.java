/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v11.services;

import static com.google.ads.googleads.v11.services.GoogleAdsServiceClient.SearchPagedResponse;

import com.google.ads.googleads.v11.services.stub.GoogleAdsServiceStubSettings;
import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.ServerStreamingCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link GoogleAdsServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (googleads.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of mutate to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * GoogleAdsServiceSettings.Builder googleAdsServiceSettingsBuilder =
 *     GoogleAdsServiceSettings.newBuilder();
 * googleAdsServiceSettingsBuilder
 *     .mutateSettings()
 *     .setRetrySettings(
 *         googleAdsServiceSettingsBuilder.mutateSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * GoogleAdsServiceSettings googleAdsServiceSettings = googleAdsServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class GoogleAdsServiceSettings extends ClientSettings<GoogleAdsServiceSettings> {

  /** Returns the object with the settings used for calls to search. */
  public PagedCallSettings<SearchGoogleAdsRequest, SearchGoogleAdsResponse, SearchPagedResponse>
      searchSettings() {
    return ((GoogleAdsServiceStubSettings) getStubSettings()).searchSettings();
  }

  /** Returns the object with the settings used for calls to searchStream. */
  public ServerStreamingCallSettings<SearchGoogleAdsStreamRequest, SearchGoogleAdsStreamResponse>
      searchStreamSettings() {
    return ((GoogleAdsServiceStubSettings) getStubSettings()).searchStreamSettings();
  }

  /** Returns the object with the settings used for calls to mutate. */
  public UnaryCallSettings<MutateGoogleAdsRequest, MutateGoogleAdsResponse> mutateSettings() {
    return ((GoogleAdsServiceStubSettings) getStubSettings()).mutateSettings();
  }

  public static final GoogleAdsServiceSettings create(GoogleAdsServiceStubSettings stub)
      throws IOException {
    return new GoogleAdsServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return GoogleAdsServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return GoogleAdsServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return GoogleAdsServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleAdsServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return GoogleAdsServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return GoogleAdsServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return GoogleAdsServiceStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected GoogleAdsServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for GoogleAdsServiceSettings. */
  public static class Builder extends ClientSettings.Builder<GoogleAdsServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(GoogleAdsServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(GoogleAdsServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(GoogleAdsServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(GoogleAdsServiceStubSettings.newBuilder());
    }

    public GoogleAdsServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((GoogleAdsServiceStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to search. */
    public PagedCallSettings.Builder<
            SearchGoogleAdsRequest, SearchGoogleAdsResponse, SearchPagedResponse>
        searchSettings() {
      return getStubSettingsBuilder().searchSettings();
    }

    /** Returns the builder for the settings used for calls to searchStream. */
    public ServerStreamingCallSettings.Builder<
            SearchGoogleAdsStreamRequest, SearchGoogleAdsStreamResponse>
        searchStreamSettings() {
      return getStubSettingsBuilder().searchStreamSettings();
    }

    /** Returns the builder for the settings used for calls to mutate. */
    public UnaryCallSettings.Builder<MutateGoogleAdsRequest, MutateGoogleAdsResponse>
        mutateSettings() {
      return getStubSettingsBuilder().mutateSettings();
    }

    @Override
    public GoogleAdsServiceSettings build() throws IOException {
      return new GoogleAdsServiceSettings(this);
    }
  }
}
