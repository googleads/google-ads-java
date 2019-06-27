/*
 * Copyright 2019 Google LLC
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
package com.google.ads.googleads.v2.services;

import com.google.ads.googleads.v2.resources.AdGroupCriterionLabel;
import com.google.ads.googleads.v2.services.stub.AdGroupCriterionLabelServiceStubSettings;
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
 * Settings class to configure an instance of {@link AdGroupCriterionLabelServiceClient}.
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
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of getAdGroupCriterionLabel to 30 seconds:
 *
 * <pre>
 * <code>
 * AdGroupCriterionLabelServiceSettings.Builder adGroupCriterionLabelServiceSettingsBuilder =
 *     AdGroupCriterionLabelServiceSettings.newBuilder();
 * adGroupCriterionLabelServiceSettingsBuilder.getAdGroupCriterionLabelSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * AdGroupCriterionLabelServiceSettings adGroupCriterionLabelServiceSettings = adGroupCriterionLabelServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AdGroupCriterionLabelServiceSettings
    extends ClientSettings<AdGroupCriterionLabelServiceSettings> {
  /** Returns the object with the settings used for calls to getAdGroupCriterionLabel. */
  public UnaryCallSettings<GetAdGroupCriterionLabelRequest, AdGroupCriterionLabel>
      getAdGroupCriterionLabelSettings() {
    return ((AdGroupCriterionLabelServiceStubSettings) getStubSettings())
        .getAdGroupCriterionLabelSettings();
  }

  /** Returns the object with the settings used for calls to mutateAdGroupCriterionLabels. */
  public UnaryCallSettings<
          MutateAdGroupCriterionLabelsRequest, MutateAdGroupCriterionLabelsResponse>
      mutateAdGroupCriterionLabelsSettings() {
    return ((AdGroupCriterionLabelServiceStubSettings) getStubSettings())
        .mutateAdGroupCriterionLabelsSettings();
  }

  public static final AdGroupCriterionLabelServiceSettings create(
      AdGroupCriterionLabelServiceStubSettings stub) throws IOException {
    return new AdGroupCriterionLabelServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return AdGroupCriterionLabelServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return AdGroupCriterionLabelServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return AdGroupCriterionLabelServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return AdGroupCriterionLabelServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return AdGroupCriterionLabelServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return AdGroupCriterionLabelServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return AdGroupCriterionLabelServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected AdGroupCriterionLabelServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for AdGroupCriterionLabelServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<AdGroupCriterionLabelServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(AdGroupCriterionLabelServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(AdGroupCriterionLabelServiceStubSettings.newBuilder());
    }

    protected Builder(AdGroupCriterionLabelServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(AdGroupCriterionLabelServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public AdGroupCriterionLabelServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((AdGroupCriterionLabelServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to getAdGroupCriterionLabel. */
    public UnaryCallSettings.Builder<GetAdGroupCriterionLabelRequest, AdGroupCriterionLabel>
        getAdGroupCriterionLabelSettings() {
      return getStubSettingsBuilder().getAdGroupCriterionLabelSettings();
    }

    /** Returns the builder for the settings used for calls to mutateAdGroupCriterionLabels. */
    public UnaryCallSettings.Builder<
            MutateAdGroupCriterionLabelsRequest, MutateAdGroupCriterionLabelsResponse>
        mutateAdGroupCriterionLabelsSettings() {
      return getStubSettingsBuilder().mutateAdGroupCriterionLabelsSettings();
    }

    @Override
    public AdGroupCriterionLabelServiceSettings build() throws IOException {
      return new AdGroupCriterionLabelServiceSettings(this);
    }
  }
}
