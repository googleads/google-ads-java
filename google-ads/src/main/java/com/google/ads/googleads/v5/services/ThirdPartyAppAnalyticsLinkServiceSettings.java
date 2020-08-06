/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v5.services;

import com.google.ads.googleads.v5.resources.ThirdPartyAppAnalyticsLink;
import com.google.ads.googleads.v5.services.stub.ThirdPartyAppAnalyticsLinkServiceStubSettings;
import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link ThirdPartyAppAnalyticsLinkServiceClient}.
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
 * <p>For example, to set the total timeout of getThirdPartyAppAnalyticsLink to 30 seconds:
 *
 * <pre>
 * <code>
 * ThirdPartyAppAnalyticsLinkServiceSettings.Builder thirdPartyAppAnalyticsLinkServiceSettingsBuilder =
 *     ThirdPartyAppAnalyticsLinkServiceSettings.newBuilder();
 * thirdPartyAppAnalyticsLinkServiceSettingsBuilder
 *     .getThirdPartyAppAnalyticsLinkSettings()
 *     .setRetrySettings(
 *         thirdPartyAppAnalyticsLinkServiceSettingsBuilder.getThirdPartyAppAnalyticsLinkSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ThirdPartyAppAnalyticsLinkServiceSettings thirdPartyAppAnalyticsLinkServiceSettings = thirdPartyAppAnalyticsLinkServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ThirdPartyAppAnalyticsLinkServiceSettings
    extends ClientSettings<ThirdPartyAppAnalyticsLinkServiceSettings> {
  /** Returns the object with the settings used for calls to getThirdPartyAppAnalyticsLink. */
  public UnaryCallSettings<GetThirdPartyAppAnalyticsLinkRequest, ThirdPartyAppAnalyticsLink>
      getThirdPartyAppAnalyticsLinkSettings() {
    return ((ThirdPartyAppAnalyticsLinkServiceStubSettings) getStubSettings())
        .getThirdPartyAppAnalyticsLinkSettings();
  }

  /** Returns the object with the settings used for calls to regenerateShareableLinkId. */
  public UnaryCallSettings<RegenerateShareableLinkIdRequest, RegenerateShareableLinkIdResponse>
      regenerateShareableLinkIdSettings() {
    return ((ThirdPartyAppAnalyticsLinkServiceStubSettings) getStubSettings())
        .regenerateShareableLinkIdSettings();
  }

  public static final ThirdPartyAppAnalyticsLinkServiceSettings create(
      ThirdPartyAppAnalyticsLinkServiceStubSettings stub) throws IOException {
    return new ThirdPartyAppAnalyticsLinkServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return ThirdPartyAppAnalyticsLinkServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return ThirdPartyAppAnalyticsLinkServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return ThirdPartyAppAnalyticsLinkServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return ThirdPartyAppAnalyticsLinkServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return ThirdPartyAppAnalyticsLinkServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return ThirdPartyAppAnalyticsLinkServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ThirdPartyAppAnalyticsLinkServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected ThirdPartyAppAnalyticsLinkServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for ThirdPartyAppAnalyticsLinkServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<ThirdPartyAppAnalyticsLinkServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(ThirdPartyAppAnalyticsLinkServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(ThirdPartyAppAnalyticsLinkServiceStubSettings.newBuilder());
    }

    protected Builder(ThirdPartyAppAnalyticsLinkServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(ThirdPartyAppAnalyticsLinkServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public ThirdPartyAppAnalyticsLinkServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((ThirdPartyAppAnalyticsLinkServiceStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to getThirdPartyAppAnalyticsLink. */
    public UnaryCallSettings.Builder<
            GetThirdPartyAppAnalyticsLinkRequest, ThirdPartyAppAnalyticsLink>
        getThirdPartyAppAnalyticsLinkSettings() {
      return getStubSettingsBuilder().getThirdPartyAppAnalyticsLinkSettings();
    }

    /** Returns the builder for the settings used for calls to regenerateShareableLinkId. */
    public UnaryCallSettings.Builder<
            RegenerateShareableLinkIdRequest, RegenerateShareableLinkIdResponse>
        regenerateShareableLinkIdSettings() {
      return getStubSettingsBuilder().regenerateShareableLinkIdSettings();
    }

    @Override
    public ThirdPartyAppAnalyticsLinkServiceSettings build() throws IOException {
      return new ThirdPartyAppAnalyticsLinkServiceSettings(this);
    }
  }
}
