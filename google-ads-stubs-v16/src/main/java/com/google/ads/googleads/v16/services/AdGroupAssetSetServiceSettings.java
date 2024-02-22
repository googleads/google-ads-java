/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v16.services;

import com.google.ads.googleads.v16.services.stub.AdGroupAssetSetServiceStubSettings;
import com.google.api.core.ApiFunction;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link AdGroupAssetSetServiceClient}.
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
 * <p>For example, to set the total timeout of mutateAdGroupAssetSets to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AdGroupAssetSetServiceSettings.Builder adGroupAssetSetServiceSettingsBuilder =
 *     AdGroupAssetSetServiceSettings.newBuilder();
 * adGroupAssetSetServiceSettingsBuilder
 *     .mutateAdGroupAssetSetsSettings()
 *     .setRetrySettings(
 *         adGroupAssetSetServiceSettingsBuilder
 *             .mutateAdGroupAssetSetsSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * AdGroupAssetSetServiceSettings adGroupAssetSetServiceSettings =
 *     adGroupAssetSetServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class AdGroupAssetSetServiceSettings extends ClientSettings<AdGroupAssetSetServiceSettings> {

  /** Returns the object with the settings used for calls to mutateAdGroupAssetSets. */
  public UnaryCallSettings<MutateAdGroupAssetSetsRequest, MutateAdGroupAssetSetsResponse>
      mutateAdGroupAssetSetsSettings() {
    return ((AdGroupAssetSetServiceStubSettings) getStubSettings())
        .mutateAdGroupAssetSetsSettings();
  }

  public static final AdGroupAssetSetServiceSettings create(AdGroupAssetSetServiceStubSettings stub)
      throws IOException {
    return new AdGroupAssetSetServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return AdGroupAssetSetServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return AdGroupAssetSetServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return AdGroupAssetSetServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return AdGroupAssetSetServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return AdGroupAssetSetServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return AdGroupAssetSetServiceStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return AdGroupAssetSetServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected AdGroupAssetSetServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for AdGroupAssetSetServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<AdGroupAssetSetServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(AdGroupAssetSetServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(AdGroupAssetSetServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(AdGroupAssetSetServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(AdGroupAssetSetServiceStubSettings.newBuilder());
    }

    public AdGroupAssetSetServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((AdGroupAssetSetServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to mutateAdGroupAssetSets. */
    public UnaryCallSettings.Builder<MutateAdGroupAssetSetsRequest, MutateAdGroupAssetSetsResponse>
        mutateAdGroupAssetSetsSettings() {
      return getStubSettingsBuilder().mutateAdGroupAssetSetsSettings();
    }

    @Override
    public AdGroupAssetSetServiceSettings build() throws IOException {
      return new AdGroupAssetSetServiceSettings(this);
    }
  }
}
