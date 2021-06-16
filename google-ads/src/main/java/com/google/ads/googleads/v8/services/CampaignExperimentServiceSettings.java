/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v8.services;

import static com.google.ads.googleads.v8.services.CampaignExperimentServiceClient.ListCampaignExperimentAsyncErrorsPagedResponse;

import com.google.ads.googleads.v8.resources.CampaignExperiment;
import com.google.ads.googleads.v8.services.stub.CampaignExperimentServiceStubSettings;
import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link CampaignExperimentServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (googleads.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getCampaignExperiment to 30 seconds:
 *
 * <pre>{@code
 * CampaignExperimentServiceSettings.Builder campaignExperimentServiceSettingsBuilder =
 *     CampaignExperimentServiceSettings.newBuilder();
 * campaignExperimentServiceSettingsBuilder
 *     .getCampaignExperimentSettings()
 *     .setRetrySettings(
 *         campaignExperimentServiceSettingsBuilder
 *             .getCampaignExperimentSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * CampaignExperimentServiceSettings campaignExperimentServiceSettings =
 *     campaignExperimentServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class CampaignExperimentServiceSettings
    extends ClientSettings<CampaignExperimentServiceSettings> {

  /** Returns the object with the settings used for calls to getCampaignExperiment. */
  public UnaryCallSettings<GetCampaignExperimentRequest, CampaignExperiment>
      getCampaignExperimentSettings() {
    return ((CampaignExperimentServiceStubSettings) getStubSettings())
        .getCampaignExperimentSettings();
  }

  /** Returns the object with the settings used for calls to createCampaignExperiment. */
  public UnaryCallSettings<CreateCampaignExperimentRequest, Operation>
      createCampaignExperimentSettings() {
    return ((CampaignExperimentServiceStubSettings) getStubSettings())
        .createCampaignExperimentSettings();
  }

  /** Returns the object with the settings used for calls to createCampaignExperiment. */
  public OperationCallSettings<
          CreateCampaignExperimentRequest, Empty, CreateCampaignExperimentMetadata>
      createCampaignExperimentOperationSettings() {
    return ((CampaignExperimentServiceStubSettings) getStubSettings())
        .createCampaignExperimentOperationSettings();
  }

  /** Returns the object with the settings used for calls to mutateCampaignExperiments. */
  public UnaryCallSettings<MutateCampaignExperimentsRequest, MutateCampaignExperimentsResponse>
      mutateCampaignExperimentsSettings() {
    return ((CampaignExperimentServiceStubSettings) getStubSettings())
        .mutateCampaignExperimentsSettings();
  }

  /** Returns the object with the settings used for calls to graduateCampaignExperiment. */
  public UnaryCallSettings<GraduateCampaignExperimentRequest, GraduateCampaignExperimentResponse>
      graduateCampaignExperimentSettings() {
    return ((CampaignExperimentServiceStubSettings) getStubSettings())
        .graduateCampaignExperimentSettings();
  }

  /** Returns the object with the settings used for calls to promoteCampaignExperiment. */
  public UnaryCallSettings<PromoteCampaignExperimentRequest, Operation>
      promoteCampaignExperimentSettings() {
    return ((CampaignExperimentServiceStubSettings) getStubSettings())
        .promoteCampaignExperimentSettings();
  }

  /** Returns the object with the settings used for calls to promoteCampaignExperiment. */
  public OperationCallSettings<PromoteCampaignExperimentRequest, Empty, Empty>
      promoteCampaignExperimentOperationSettings() {
    return ((CampaignExperimentServiceStubSettings) getStubSettings())
        .promoteCampaignExperimentOperationSettings();
  }

  /** Returns the object with the settings used for calls to endCampaignExperiment. */
  public UnaryCallSettings<EndCampaignExperimentRequest, Empty> endCampaignExperimentSettings() {
    return ((CampaignExperimentServiceStubSettings) getStubSettings())
        .endCampaignExperimentSettings();
  }

  /** Returns the object with the settings used for calls to listCampaignExperimentAsyncErrors. */
  public PagedCallSettings<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
          ListCampaignExperimentAsyncErrorsPagedResponse>
      listCampaignExperimentAsyncErrorsSettings() {
    return ((CampaignExperimentServiceStubSettings) getStubSettings())
        .listCampaignExperimentAsyncErrorsSettings();
  }

  public static final CampaignExperimentServiceSettings create(
      CampaignExperimentServiceStubSettings stub) throws IOException {
    return new CampaignExperimentServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return CampaignExperimentServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return CampaignExperimentServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return CampaignExperimentServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return CampaignExperimentServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return CampaignExperimentServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return CampaignExperimentServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return CampaignExperimentServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected CampaignExperimentServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for CampaignExperimentServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<CampaignExperimentServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(CampaignExperimentServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(CampaignExperimentServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(CampaignExperimentServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(CampaignExperimentServiceStubSettings.newBuilder());
    }

    public CampaignExperimentServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((CampaignExperimentServiceStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
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

    /** Returns the builder for the settings used for calls to getCampaignExperiment. */
    public UnaryCallSettings.Builder<GetCampaignExperimentRequest, CampaignExperiment>
        getCampaignExperimentSettings() {
      return getStubSettingsBuilder().getCampaignExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to createCampaignExperiment. */
    public UnaryCallSettings.Builder<CreateCampaignExperimentRequest, Operation>
        createCampaignExperimentSettings() {
      return getStubSettingsBuilder().createCampaignExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to createCampaignExperiment. */
    public OperationCallSettings.Builder<
            CreateCampaignExperimentRequest, Empty, CreateCampaignExperimentMetadata>
        createCampaignExperimentOperationSettings() {
      return getStubSettingsBuilder().createCampaignExperimentOperationSettings();
    }

    /** Returns the builder for the settings used for calls to mutateCampaignExperiments. */
    public UnaryCallSettings.Builder<
            MutateCampaignExperimentsRequest, MutateCampaignExperimentsResponse>
        mutateCampaignExperimentsSettings() {
      return getStubSettingsBuilder().mutateCampaignExperimentsSettings();
    }

    /** Returns the builder for the settings used for calls to graduateCampaignExperiment. */
    public UnaryCallSettings.Builder<
            GraduateCampaignExperimentRequest, GraduateCampaignExperimentResponse>
        graduateCampaignExperimentSettings() {
      return getStubSettingsBuilder().graduateCampaignExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to promoteCampaignExperiment. */
    public UnaryCallSettings.Builder<PromoteCampaignExperimentRequest, Operation>
        promoteCampaignExperimentSettings() {
      return getStubSettingsBuilder().promoteCampaignExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to promoteCampaignExperiment. */
    public OperationCallSettings.Builder<PromoteCampaignExperimentRequest, Empty, Empty>
        promoteCampaignExperimentOperationSettings() {
      return getStubSettingsBuilder().promoteCampaignExperimentOperationSettings();
    }

    /** Returns the builder for the settings used for calls to endCampaignExperiment. */
    public UnaryCallSettings.Builder<EndCampaignExperimentRequest, Empty>
        endCampaignExperimentSettings() {
      return getStubSettingsBuilder().endCampaignExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to listCampaignExperimentAsyncErrors. */
    public PagedCallSettings.Builder<
            ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
            ListCampaignExperimentAsyncErrorsPagedResponse>
        listCampaignExperimentAsyncErrorsSettings() {
      return getStubSettingsBuilder().listCampaignExperimentAsyncErrorsSettings();
    }

    @Override
    public CampaignExperimentServiceSettings build() throws IOException {
      return new CampaignExperimentServiceSettings(this);
    }
  }
}
