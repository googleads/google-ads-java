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

import com.google.ads.googleads.v2.resources.CampaignCriterionSimulation;
import com.google.ads.googleads.v2.services.stub.CampaignCriterionSimulationServiceStubSettings;
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
 * Settings class to configure an instance of {@link CampaignCriterionSimulationServiceClient}.
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
 * example, to set the total timeout of getCampaignCriterionSimulation to 30 seconds:
 *
 * <pre>
 * <code>
 * CampaignCriterionSimulationServiceSettings.Builder campaignCriterionSimulationServiceSettingsBuilder =
 *     CampaignCriterionSimulationServiceSettings.newBuilder();
 * campaignCriterionSimulationServiceSettingsBuilder.getCampaignCriterionSimulationSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * CampaignCriterionSimulationServiceSettings campaignCriterionSimulationServiceSettings = campaignCriterionSimulationServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CampaignCriterionSimulationServiceSettings
    extends ClientSettings<CampaignCriterionSimulationServiceSettings> {
  /** Returns the object with the settings used for calls to getCampaignCriterionSimulation. */
  public UnaryCallSettings<GetCampaignCriterionSimulationRequest, CampaignCriterionSimulation>
      getCampaignCriterionSimulationSettings() {
    return ((CampaignCriterionSimulationServiceStubSettings) getStubSettings())
        .getCampaignCriterionSimulationSettings();
  }

  public static final CampaignCriterionSimulationServiceSettings create(
      CampaignCriterionSimulationServiceStubSettings stub) throws IOException {
    return new CampaignCriterionSimulationServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return CampaignCriterionSimulationServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return CampaignCriterionSimulationServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return CampaignCriterionSimulationServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return CampaignCriterionSimulationServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return CampaignCriterionSimulationServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return CampaignCriterionSimulationServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return CampaignCriterionSimulationServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected CampaignCriterionSimulationServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for CampaignCriterionSimulationServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<CampaignCriterionSimulationServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(CampaignCriterionSimulationServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(CampaignCriterionSimulationServiceStubSettings.newBuilder());
    }

    protected Builder(CampaignCriterionSimulationServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(CampaignCriterionSimulationServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public CampaignCriterionSimulationServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((CampaignCriterionSimulationServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to getCampaignCriterionSimulation. */
    public UnaryCallSettings.Builder<
            GetCampaignCriterionSimulationRequest, CampaignCriterionSimulation>
        getCampaignCriterionSimulationSettings() {
      return getStubSettingsBuilder().getCampaignCriterionSimulationSettings();
    }

    @Override
    public CampaignCriterionSimulationServiceSettings build() throws IOException {
      return new CampaignCriterionSimulationServiceSettings(this);
    }
  }
}
