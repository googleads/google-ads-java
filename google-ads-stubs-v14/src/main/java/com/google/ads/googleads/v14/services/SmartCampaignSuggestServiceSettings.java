/*
 * Copyright 2023 Google LLC
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

package com.google.ads.googleads.v14.services;

import com.google.ads.googleads.v14.services.stub.SmartCampaignSuggestServiceStubSettings;
import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
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
 * Settings class to configure an instance of {@link SmartCampaignSuggestServiceClient}.
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
 * <p>For example, to set the total timeout of suggestSmartCampaignBudgetOptions to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SmartCampaignSuggestServiceSettings.Builder smartCampaignSuggestServiceSettingsBuilder =
 *     SmartCampaignSuggestServiceSettings.newBuilder();
 * smartCampaignSuggestServiceSettingsBuilder
 *     .suggestSmartCampaignBudgetOptionsSettings()
 *     .setRetrySettings(
 *         smartCampaignSuggestServiceSettingsBuilder
 *             .suggestSmartCampaignBudgetOptionsSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * SmartCampaignSuggestServiceSettings smartCampaignSuggestServiceSettings =
 *     smartCampaignSuggestServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class SmartCampaignSuggestServiceSettings
    extends ClientSettings<SmartCampaignSuggestServiceSettings> {

  /** Returns the object with the settings used for calls to suggestSmartCampaignBudgetOptions. */
  public UnaryCallSettings<
          SuggestSmartCampaignBudgetOptionsRequest, SuggestSmartCampaignBudgetOptionsResponse>
      suggestSmartCampaignBudgetOptionsSettings() {
    return ((SmartCampaignSuggestServiceStubSettings) getStubSettings())
        .suggestSmartCampaignBudgetOptionsSettings();
  }

  /** Returns the object with the settings used for calls to suggestSmartCampaignAd. */
  public UnaryCallSettings<SuggestSmartCampaignAdRequest, SuggestSmartCampaignAdResponse>
      suggestSmartCampaignAdSettings() {
    return ((SmartCampaignSuggestServiceStubSettings) getStubSettings())
        .suggestSmartCampaignAdSettings();
  }

  /** Returns the object with the settings used for calls to suggestKeywordThemes. */
  public UnaryCallSettings<SuggestKeywordThemesRequest, SuggestKeywordThemesResponse>
      suggestKeywordThemesSettings() {
    return ((SmartCampaignSuggestServiceStubSettings) getStubSettings())
        .suggestKeywordThemesSettings();
  }

  public static final SmartCampaignSuggestServiceSettings create(
      SmartCampaignSuggestServiceStubSettings stub) throws IOException {
    return new SmartCampaignSuggestServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return SmartCampaignSuggestServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return SmartCampaignSuggestServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return SmartCampaignSuggestServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return SmartCampaignSuggestServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return SmartCampaignSuggestServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return SmartCampaignSuggestServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return SmartCampaignSuggestServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected SmartCampaignSuggestServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for SmartCampaignSuggestServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<SmartCampaignSuggestServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(SmartCampaignSuggestServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(SmartCampaignSuggestServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(SmartCampaignSuggestServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(SmartCampaignSuggestServiceStubSettings.newBuilder());
    }

    public SmartCampaignSuggestServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((SmartCampaignSuggestServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to suggestSmartCampaignBudgetOptions. */
    public UnaryCallSettings.Builder<
            SuggestSmartCampaignBudgetOptionsRequest, SuggestSmartCampaignBudgetOptionsResponse>
        suggestSmartCampaignBudgetOptionsSettings() {
      return getStubSettingsBuilder().suggestSmartCampaignBudgetOptionsSettings();
    }

    /** Returns the builder for the settings used for calls to suggestSmartCampaignAd. */
    public UnaryCallSettings.Builder<SuggestSmartCampaignAdRequest, SuggestSmartCampaignAdResponse>
        suggestSmartCampaignAdSettings() {
      return getStubSettingsBuilder().suggestSmartCampaignAdSettings();
    }

    /** Returns the builder for the settings used for calls to suggestKeywordThemes. */
    public UnaryCallSettings.Builder<SuggestKeywordThemesRequest, SuggestKeywordThemesResponse>
        suggestKeywordThemesSettings() {
      return getStubSettingsBuilder().suggestKeywordThemesSettings();
    }

    @Override
    public SmartCampaignSuggestServiceSettings build() throws IOException {
      return new SmartCampaignSuggestServiceSettings(this);
    }
  }
}
