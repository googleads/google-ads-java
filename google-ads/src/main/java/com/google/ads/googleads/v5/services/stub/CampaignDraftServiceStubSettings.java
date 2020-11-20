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
package com.google.ads.googleads.v5.services.stub;

import static com.google.ads.googleads.v5.services.CampaignDraftServiceClient.ListCampaignDraftAsyncErrorsPagedResponse;

import com.google.ads.googleads.v5.resources.CampaignDraft;
import com.google.ads.googleads.v5.services.GetCampaignDraftRequest;
import com.google.ads.googleads.v5.services.ListCampaignDraftAsyncErrorsRequest;
import com.google.ads.googleads.v5.services.ListCampaignDraftAsyncErrorsResponse;
import com.google.ads.googleads.v5.services.MutateCampaignDraftsRequest;
import com.google.ads.googleads.v5.services.MutateCampaignDraftsResponse;
import com.google.ads.googleads.v5.services.PromoteCampaignDraftRequest;
import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.rpc.Status;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link CampaignDraftServiceStub}.
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
 * <pre>
 * <code>
 * CampaignDraftServiceStubSettings.Builder campaignDraftServiceSettingsBuilder =
 *     CampaignDraftServiceStubSettings.newBuilder();
 * campaignDraftServiceSettingsBuilder
 *     .getCampaignDraftSettings()
 *     .setRetrySettings(
 *         campaignDraftServiceSettingsBuilder.getCampaignDraftSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * CampaignDraftServiceStubSettings campaignDraftServiceSettings = campaignDraftServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CampaignDraftServiceStubSettings
    extends StubSettings<CampaignDraftServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().build();

  private final UnaryCallSettings<GetCampaignDraftRequest, CampaignDraft> getCampaignDraftSettings;
  private final UnaryCallSettings<MutateCampaignDraftsRequest, MutateCampaignDraftsResponse>
      mutateCampaignDraftsSettings;
  private final UnaryCallSettings<PromoteCampaignDraftRequest, Operation>
      promoteCampaignDraftSettings;
  private final OperationCallSettings<PromoteCampaignDraftRequest, Empty, Empty>
      promoteCampaignDraftOperationSettings;
  private final PagedCallSettings<
          ListCampaignDraftAsyncErrorsRequest,
          ListCampaignDraftAsyncErrorsResponse,
          ListCampaignDraftAsyncErrorsPagedResponse>
      listCampaignDraftAsyncErrorsSettings;

  /** Returns the object with the settings used for calls to getCampaignDraft. */
  public UnaryCallSettings<GetCampaignDraftRequest, CampaignDraft> getCampaignDraftSettings() {
    return getCampaignDraftSettings;
  }

  /** Returns the object with the settings used for calls to mutateCampaignDrafts. */
  public UnaryCallSettings<MutateCampaignDraftsRequest, MutateCampaignDraftsResponse>
      mutateCampaignDraftsSettings() {
    return mutateCampaignDraftsSettings;
  }

  /** Returns the object with the settings used for calls to promoteCampaignDraft. */
  public UnaryCallSettings<PromoteCampaignDraftRequest, Operation> promoteCampaignDraftSettings() {
    return promoteCampaignDraftSettings;
  }

  /** Returns the object with the settings used for calls to promoteCampaignDraft. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<PromoteCampaignDraftRequest, Empty, Empty>
      promoteCampaignDraftOperationSettings() {
    return promoteCampaignDraftOperationSettings;
  }

  /** Returns the object with the settings used for calls to listCampaignDraftAsyncErrors. */
  public PagedCallSettings<
          ListCampaignDraftAsyncErrorsRequest,
          ListCampaignDraftAsyncErrorsResponse,
          ListCampaignDraftAsyncErrorsPagedResponse>
      listCampaignDraftAsyncErrorsSettings() {
    return listCampaignDraftAsyncErrorsSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CampaignDraftServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcCampaignDraftServiceStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "googleads.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(CampaignDraftServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
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

  protected CampaignDraftServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    getCampaignDraftSettings = settingsBuilder.getCampaignDraftSettings().build();
    mutateCampaignDraftsSettings = settingsBuilder.mutateCampaignDraftsSettings().build();
    promoteCampaignDraftSettings = settingsBuilder.promoteCampaignDraftSettings().build();
    promoteCampaignDraftOperationSettings =
        settingsBuilder.promoteCampaignDraftOperationSettings().build();
    listCampaignDraftAsyncErrorsSettings =
        settingsBuilder.listCampaignDraftAsyncErrorsSettings().build();
  }

  private static final PagedListDescriptor<
          ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse, Status>
      LIST_CAMPAIGN_DRAFT_ASYNC_ERRORS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse, Status>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListCampaignDraftAsyncErrorsRequest injectToken(
                ListCampaignDraftAsyncErrorsRequest payload, String token) {
              return ListCampaignDraftAsyncErrorsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListCampaignDraftAsyncErrorsRequest injectPageSize(
                ListCampaignDraftAsyncErrorsRequest payload, int pageSize) {
              return ListCampaignDraftAsyncErrorsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListCampaignDraftAsyncErrorsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListCampaignDraftAsyncErrorsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Status> extractResources(ListCampaignDraftAsyncErrorsResponse payload) {
              return payload.getErrorsList() != null
                  ? payload.getErrorsList()
                  : ImmutableList.<Status>of();
            }
          };

  private static final PagedListResponseFactory<
          ListCampaignDraftAsyncErrorsRequest,
          ListCampaignDraftAsyncErrorsResponse,
          ListCampaignDraftAsyncErrorsPagedResponse>
      LIST_CAMPAIGN_DRAFT_ASYNC_ERRORS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListCampaignDraftAsyncErrorsRequest,
              ListCampaignDraftAsyncErrorsResponse,
              ListCampaignDraftAsyncErrorsPagedResponse>() {
            @Override
            public ApiFuture<ListCampaignDraftAsyncErrorsPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListCampaignDraftAsyncErrorsRequest, ListCampaignDraftAsyncErrorsResponse>
                    callable,
                ListCampaignDraftAsyncErrorsRequest request,
                ApiCallContext context,
                ApiFuture<ListCampaignDraftAsyncErrorsResponse> futureResponse) {
              PageContext<
                      ListCampaignDraftAsyncErrorsRequest,
                      ListCampaignDraftAsyncErrorsResponse,
                      Status>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_CAMPAIGN_DRAFT_ASYNC_ERRORS_PAGE_STR_DESC,
                          request,
                          context);
              return ListCampaignDraftAsyncErrorsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  /** Builder for CampaignDraftServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<CampaignDraftServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<GetCampaignDraftRequest, CampaignDraft>
        getCampaignDraftSettings;
    private final UnaryCallSettings.Builder<
            MutateCampaignDraftsRequest, MutateCampaignDraftsResponse>
        mutateCampaignDraftsSettings;
    private final UnaryCallSettings.Builder<PromoteCampaignDraftRequest, Operation>
        promoteCampaignDraftSettings;
    private final OperationCallSettings.Builder<PromoteCampaignDraftRequest, Empty, Empty>
        promoteCampaignDraftOperationSettings;
    private final PagedCallSettings.Builder<
            ListCampaignDraftAsyncErrorsRequest,
            ListCampaignDraftAsyncErrorsResponse,
            ListCampaignDraftAsyncErrorsPagedResponse>
        listCampaignDraftAsyncErrorsSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_1_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.DEADLINE_EXCEEDED)));
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(5000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(3600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(3600000L))
              .setTotalTimeout(Duration.ofMillis(3600000L))
              .build();
      definitions.put("retry_policy_1_params", settings);
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(3600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(3600000L))
              .setTotalTimeout(Duration.ofMillis(3600000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      getCampaignDraftSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      mutateCampaignDraftsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      promoteCampaignDraftSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      promoteCampaignDraftOperationSettings = OperationCallSettings.newBuilder();

      listCampaignDraftAsyncErrorsSettings =
          PagedCallSettings.newBuilder(LIST_CAMPAIGN_DRAFT_ASYNC_ERRORS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getCampaignDraftSettings,
              mutateCampaignDraftsSettings,
              promoteCampaignDraftSettings,
              listCampaignDraftAsyncErrorsSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .getCampaignDraftSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .mutateCampaignDraftsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .promoteCampaignDraftSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .listCampaignDraftAsyncErrorsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));
      builder
          .promoteCampaignDraftOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<PromoteCampaignDraftRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Empty.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    protected Builder(CampaignDraftServiceStubSettings settings) {
      super(settings);

      getCampaignDraftSettings = settings.getCampaignDraftSettings.toBuilder();
      mutateCampaignDraftsSettings = settings.mutateCampaignDraftsSettings.toBuilder();
      promoteCampaignDraftSettings = settings.promoteCampaignDraftSettings.toBuilder();
      promoteCampaignDraftOperationSettings =
          settings.promoteCampaignDraftOperationSettings.toBuilder();
      listCampaignDraftAsyncErrorsSettings =
          settings.listCampaignDraftAsyncErrorsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getCampaignDraftSettings,
              mutateCampaignDraftsSettings,
              promoteCampaignDraftSettings,
              listCampaignDraftAsyncErrorsSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to getCampaignDraft. */
    public UnaryCallSettings.Builder<GetCampaignDraftRequest, CampaignDraft>
        getCampaignDraftSettings() {
      return getCampaignDraftSettings;
    }

    /** Returns the builder for the settings used for calls to mutateCampaignDrafts. */
    public UnaryCallSettings.Builder<MutateCampaignDraftsRequest, MutateCampaignDraftsResponse>
        mutateCampaignDraftsSettings() {
      return mutateCampaignDraftsSettings;
    }

    /** Returns the builder for the settings used for calls to promoteCampaignDraft. */
    public UnaryCallSettings.Builder<PromoteCampaignDraftRequest, Operation>
        promoteCampaignDraftSettings() {
      return promoteCampaignDraftSettings;
    }

    /** Returns the builder for the settings used for calls to promoteCampaignDraft. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<PromoteCampaignDraftRequest, Empty, Empty>
        promoteCampaignDraftOperationSettings() {
      return promoteCampaignDraftOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listCampaignDraftAsyncErrors. */
    public PagedCallSettings.Builder<
            ListCampaignDraftAsyncErrorsRequest,
            ListCampaignDraftAsyncErrorsResponse,
            ListCampaignDraftAsyncErrorsPagedResponse>
        listCampaignDraftAsyncErrorsSettings() {
      return listCampaignDraftAsyncErrorsSettings;
    }

    @Override
    public CampaignDraftServiceStubSettings build() throws IOException {
      return new CampaignDraftServiceStubSettings(this);
    }
  }
}
