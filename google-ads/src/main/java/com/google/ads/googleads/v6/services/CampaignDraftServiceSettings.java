/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services;

import static com.google.ads.googleads.v6.services.CampaignDraftServiceClient.ListCampaignDraftAsyncErrorsPagedResponse;

import com.google.ads.googleads.v6.resources.CampaignDraft;
import com.google.ads.googleads.v6.services.stub.CampaignDraftServiceStubSettings;
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
 * Settings class to configure an instance of {@link CampaignDraftServiceClient}.
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
 * <p>For example, to set the total timeout of getCampaignDraft to 30 seconds:
 *
 * <pre>{@code
 * CampaignDraftServiceSettings.Builder campaignDraftServiceSettingsBuilder =
 *     CampaignDraftServiceSettings.newBuilder();
 * campaignDraftServiceSettingsBuilder
 *     .getCampaignDraftSettings()
 *     .setRetrySettings(
 *         campaignDraftServiceSettingsBuilder
 *             .getCampaignDraftSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * CampaignDraftServiceSettings campaignDraftServiceSettings =
 *     campaignDraftServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class CampaignDraftServiceSettings extends ClientSettings<CampaignDraftServiceSettings> {

  /** Returns the object with the settings used for calls to getCampaignDraft. */
  public UnaryCallSettings<GetCampaignDraftRequest, CampaignDraft> getCampaignDraftSettings() {
    return ((CampaignDraftServiceStubSettings) getStubSettings()).getCampaignDraftSettings();
  }

  /** Returns the object with the settings used for calls to mutateCampaignDrafts. */
  public UnaryCallSettings<MutateCampaignDraftsRequest, MutateCampaignDraftsResponse>
      mutateCampaignDraftsSettings() {
    return ((CampaignDraftServiceStubSettings) getStubSettings()).mutateCampaignDraftsSettings();
  }

  /** Returns the object with the settings used for calls to promoteCampaignDraft. */
  public UnaryCallSettings<PromoteCampaignDraftRequest, Operation> promoteCampaignDraftSettings() {
    return ((CampaignDraftServiceStubSettings) getStubSettings()).promoteCampaignDraftSettings();
  }

  /** Returns the object with the settings used for calls to promoteCampaignDraft. */
  public OperationCallSettings<PromoteCampaignDraftRequest, Empty, Empty>
      promoteCampaignDraftOperationSettings() {
    return ((CampaignDraftServiceStubSettings) getStubSettings())
        .promoteCampaignDraftOperationSettings();
  }

  /** Returns the object with the settings used for calls to listCampaignDraftAsyncErrors. */
  public PagedCallSettings<
          ListCampaignDraftAsyncErrorsRequest,
          ListCampaignDraftAsyncErrorsResponse,
          ListCampaignDraftAsyncErrorsPagedResponse>
      listCampaignDraftAsyncErrorsSettings() {
    return ((CampaignDraftServiceStubSettings) getStubSettings())
        .listCampaignDraftAsyncErrorsSettings();
  }

  public static final CampaignDraftServiceSettings create(CampaignDraftServiceStubSettings stub)
      throws IOException {
    return new CampaignDraftServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return CampaignDraftServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return CampaignDraftServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return CampaignDraftServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return CampaignDraftServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return CampaignDraftServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return CampaignDraftServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return CampaignDraftServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected CampaignDraftServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for CampaignDraftServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<CampaignDraftServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(CampaignDraftServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(CampaignDraftServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(CampaignDraftServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(CampaignDraftServiceStubSettings.newBuilder());
    }

    public CampaignDraftServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((CampaignDraftServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to getCampaignDraft. */
    public UnaryCallSettings.Builder<GetCampaignDraftRequest, CampaignDraft>
        getCampaignDraftSettings() {
      return getStubSettingsBuilder().getCampaignDraftSettings();
    }

    /** Returns the builder for the settings used for calls to mutateCampaignDrafts. */
    public UnaryCallSettings.Builder<MutateCampaignDraftsRequest, MutateCampaignDraftsResponse>
        mutateCampaignDraftsSettings() {
      return getStubSettingsBuilder().mutateCampaignDraftsSettings();
    }

    /** Returns the builder for the settings used for calls to promoteCampaignDraft. */
    public UnaryCallSettings.Builder<PromoteCampaignDraftRequest, Operation>
        promoteCampaignDraftSettings() {
      return getStubSettingsBuilder().promoteCampaignDraftSettings();
    }

    /** Returns the builder for the settings used for calls to promoteCampaignDraft. */
    public OperationCallSettings.Builder<PromoteCampaignDraftRequest, Empty, Empty>
        promoteCampaignDraftOperationSettings() {
      return getStubSettingsBuilder().promoteCampaignDraftOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listCampaignDraftAsyncErrors. */
    public PagedCallSettings.Builder<
            ListCampaignDraftAsyncErrorsRequest,
            ListCampaignDraftAsyncErrorsResponse,
            ListCampaignDraftAsyncErrorsPagedResponse>
        listCampaignDraftAsyncErrorsSettings() {
      return getStubSettingsBuilder().listCampaignDraftAsyncErrorsSettings();
    }

    @Override
    public CampaignDraftServiceSettings build() throws IOException {
      return new CampaignDraftServiceSettings(this);
    }
  }
}
