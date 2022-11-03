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

package com.google.ads.googleads.v11.services.stub;

import static com.google.ads.googleads.v11.services.CampaignDraftServiceClient.ListCampaignDraftAsyncErrorsPagedResponse;

import com.google.ads.googleads.v11.services.ListCampaignDraftAsyncErrorsRequest;
import com.google.ads.googleads.v11.services.ListCampaignDraftAsyncErrorsResponse;
import com.google.ads.googleads.v11.services.MutateCampaignDraftsRequest;
import com.google.ads.googleads.v11.services.MutateCampaignDraftsResponse;
import com.google.ads.googleads.v11.services.PromoteCampaignDraftRequest;
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

// AUTO-GENERATED DOCUMENTATION AND CLASS.
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
 * <p>For example, to set the total timeout of mutateCampaignDrafts to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CampaignDraftServiceStubSettings.Builder campaignDraftServiceSettingsBuilder =
 *     CampaignDraftServiceStubSettings.newBuilder();
 * campaignDraftServiceSettingsBuilder
 *     .mutateCampaignDraftsSettings()
 *     .setRetrySettings(
 *         campaignDraftServiceSettingsBuilder
 *             .mutateCampaignDraftsSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * CampaignDraftServiceStubSettings campaignDraftServiceSettings =
 *     campaignDraftServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class CampaignDraftServiceStubSettings
    extends StubSettings<CampaignDraftServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/adwords").build();

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
              return payload.getErrorsList() == null
                  ? ImmutableList.<Status>of()
                  : payload.getErrorsList();
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

  public CampaignDraftServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcCampaignDraftServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "googleads.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "googleads.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
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

    mutateCampaignDraftsSettings = settingsBuilder.mutateCampaignDraftsSettings().build();
    promoteCampaignDraftSettings = settingsBuilder.promoteCampaignDraftSettings().build();
    promoteCampaignDraftOperationSettings =
        settingsBuilder.promoteCampaignDraftOperationSettings().build();
    listCampaignDraftAsyncErrorsSettings =
        settingsBuilder.listCampaignDraftAsyncErrorsSettings().build();
  }

  /** Builder for CampaignDraftServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<CampaignDraftServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
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
          "retry_policy_0_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.DEADLINE_EXCEEDED)));
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
              .setInitialRpcTimeout(Duration.ofMillis(14400000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(14400000L))
              .setTotalTimeout(Duration.ofMillis(14400000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      mutateCampaignDraftsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      promoteCampaignDraftSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      promoteCampaignDraftOperationSettings = OperationCallSettings.newBuilder();
      listCampaignDraftAsyncErrorsSettings =
          PagedCallSettings.newBuilder(LIST_CAMPAIGN_DRAFT_ASYNC_ERRORS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              mutateCampaignDraftsSettings,
              promoteCampaignDraftSettings,
              listCampaignDraftAsyncErrorsSettings);
      initDefaults(this);
    }

    protected Builder(CampaignDraftServiceStubSettings settings) {
      super(settings);

      mutateCampaignDraftsSettings = settings.mutateCampaignDraftsSettings.toBuilder();
      promoteCampaignDraftSettings = settings.promoteCampaignDraftSettings.toBuilder();
      promoteCampaignDraftOperationSettings =
          settings.promoteCampaignDraftOperationSettings.toBuilder();
      listCampaignDraftAsyncErrorsSettings =
          settings.listCampaignDraftAsyncErrorsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              mutateCampaignDraftsSettings,
              promoteCampaignDraftSettings,
              listCampaignDraftAsyncErrorsSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .mutateCampaignDraftsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .promoteCampaignDraftSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listCampaignDraftAsyncErrorsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .promoteCampaignDraftOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<PromoteCampaignDraftRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Empty.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
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
