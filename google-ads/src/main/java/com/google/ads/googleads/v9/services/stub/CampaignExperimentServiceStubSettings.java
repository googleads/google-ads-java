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

package com.google.ads.googleads.v9.services.stub;

import static com.google.ads.googleads.v9.services.CampaignExperimentServiceClient.ListCampaignExperimentAsyncErrorsPagedResponse;

import com.google.ads.googleads.v9.resources.CampaignExperiment;
import com.google.ads.googleads.v9.services.CreateCampaignExperimentMetadata;
import com.google.ads.googleads.v9.services.CreateCampaignExperimentRequest;
import com.google.ads.googleads.v9.services.EndCampaignExperimentRequest;
import com.google.ads.googleads.v9.services.GetCampaignExperimentRequest;
import com.google.ads.googleads.v9.services.GraduateCampaignExperimentRequest;
import com.google.ads.googleads.v9.services.GraduateCampaignExperimentResponse;
import com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsRequest;
import com.google.ads.googleads.v9.services.ListCampaignExperimentAsyncErrorsResponse;
import com.google.ads.googleads.v9.services.MutateCampaignExperimentsRequest;
import com.google.ads.googleads.v9.services.MutateCampaignExperimentsResponse;
import com.google.ads.googleads.v9.services.PromoteCampaignExperimentRequest;
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
 * Settings class to configure an instance of {@link CampaignExperimentServiceStub}.
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
 * CampaignExperimentServiceStubSettings.Builder campaignExperimentServiceSettingsBuilder =
 *     CampaignExperimentServiceStubSettings.newBuilder();
 * campaignExperimentServiceSettingsBuilder
 *     .getCampaignExperimentSettings()
 *     .setRetrySettings(
 *         campaignExperimentServiceSettingsBuilder
 *             .getCampaignExperimentSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * CampaignExperimentServiceStubSettings campaignExperimentServiceSettings =
 *     campaignExperimentServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class CampaignExperimentServiceStubSettings
    extends StubSettings<CampaignExperimentServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/adwords").build();

  private final UnaryCallSettings<GetCampaignExperimentRequest, CampaignExperiment>
      getCampaignExperimentSettings;
  private final UnaryCallSettings<CreateCampaignExperimentRequest, Operation>
      createCampaignExperimentSettings;
  private final OperationCallSettings<
          CreateCampaignExperimentRequest, Empty, CreateCampaignExperimentMetadata>
      createCampaignExperimentOperationSettings;
  private final UnaryCallSettings<
          MutateCampaignExperimentsRequest, MutateCampaignExperimentsResponse>
      mutateCampaignExperimentsSettings;
  private final UnaryCallSettings<
          GraduateCampaignExperimentRequest, GraduateCampaignExperimentResponse>
      graduateCampaignExperimentSettings;
  private final UnaryCallSettings<PromoteCampaignExperimentRequest, Operation>
      promoteCampaignExperimentSettings;
  private final OperationCallSettings<PromoteCampaignExperimentRequest, Empty, Empty>
      promoteCampaignExperimentOperationSettings;
  private final UnaryCallSettings<EndCampaignExperimentRequest, Empty>
      endCampaignExperimentSettings;
  private final PagedCallSettings<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
          ListCampaignExperimentAsyncErrorsPagedResponse>
      listCampaignExperimentAsyncErrorsSettings;

  private static final PagedListDescriptor<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
          Status>
      LIST_CAMPAIGN_EXPERIMENT_ASYNC_ERRORS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
              Status>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListCampaignExperimentAsyncErrorsRequest injectToken(
                ListCampaignExperimentAsyncErrorsRequest payload, String token) {
              return ListCampaignExperimentAsyncErrorsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListCampaignExperimentAsyncErrorsRequest injectPageSize(
                ListCampaignExperimentAsyncErrorsRequest payload, int pageSize) {
              return ListCampaignExperimentAsyncErrorsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListCampaignExperimentAsyncErrorsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListCampaignExperimentAsyncErrorsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Status> extractResources(
                ListCampaignExperimentAsyncErrorsResponse payload) {
              return payload.getErrorsList() == null
                  ? ImmutableList.<Status>of()
                  : payload.getErrorsList();
            }
          };

  private static final PagedListResponseFactory<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
          ListCampaignExperimentAsyncErrorsPagedResponse>
      LIST_CAMPAIGN_EXPERIMENT_ASYNC_ERRORS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
              ListCampaignExperimentAsyncErrorsPagedResponse>() {
            @Override
            public ApiFuture<ListCampaignExperimentAsyncErrorsPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListCampaignExperimentAsyncErrorsRequest,
                        ListCampaignExperimentAsyncErrorsResponse>
                    callable,
                ListCampaignExperimentAsyncErrorsRequest request,
                ApiCallContext context,
                ApiFuture<ListCampaignExperimentAsyncErrorsResponse> futureResponse) {
              PageContext<
                      ListCampaignExperimentAsyncErrorsRequest,
                      ListCampaignExperimentAsyncErrorsResponse, Status>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_CAMPAIGN_EXPERIMENT_ASYNC_ERRORS_PAGE_STR_DESC,
                          request,
                          context);
              return ListCampaignExperimentAsyncErrorsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to getCampaignExperiment. */
  public UnaryCallSettings<GetCampaignExperimentRequest, CampaignExperiment>
      getCampaignExperimentSettings() {
    return getCampaignExperimentSettings;
  }

  /** Returns the object with the settings used for calls to createCampaignExperiment. */
  public UnaryCallSettings<CreateCampaignExperimentRequest, Operation>
      createCampaignExperimentSettings() {
    return createCampaignExperimentSettings;
  }

  /** Returns the object with the settings used for calls to createCampaignExperiment. */
  public OperationCallSettings<
          CreateCampaignExperimentRequest, Empty, CreateCampaignExperimentMetadata>
      createCampaignExperimentOperationSettings() {
    return createCampaignExperimentOperationSettings;
  }

  /** Returns the object with the settings used for calls to mutateCampaignExperiments. */
  public UnaryCallSettings<MutateCampaignExperimentsRequest, MutateCampaignExperimentsResponse>
      mutateCampaignExperimentsSettings() {
    return mutateCampaignExperimentsSettings;
  }

  /** Returns the object with the settings used for calls to graduateCampaignExperiment. */
  public UnaryCallSettings<GraduateCampaignExperimentRequest, GraduateCampaignExperimentResponse>
      graduateCampaignExperimentSettings() {
    return graduateCampaignExperimentSettings;
  }

  /** Returns the object with the settings used for calls to promoteCampaignExperiment. */
  public UnaryCallSettings<PromoteCampaignExperimentRequest, Operation>
      promoteCampaignExperimentSettings() {
    return promoteCampaignExperimentSettings;
  }

  /** Returns the object with the settings used for calls to promoteCampaignExperiment. */
  public OperationCallSettings<PromoteCampaignExperimentRequest, Empty, Empty>
      promoteCampaignExperimentOperationSettings() {
    return promoteCampaignExperimentOperationSettings;
  }

  /** Returns the object with the settings used for calls to endCampaignExperiment. */
  public UnaryCallSettings<EndCampaignExperimentRequest, Empty> endCampaignExperimentSettings() {
    return endCampaignExperimentSettings;
  }

  /** Returns the object with the settings used for calls to listCampaignExperimentAsyncErrors. */
  public PagedCallSettings<
          ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
          ListCampaignExperimentAsyncErrorsPagedResponse>
      listCampaignExperimentAsyncErrorsSettings() {
    return listCampaignExperimentAsyncErrorsSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CampaignExperimentServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcCampaignExperimentServiceStub.create(this);
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
            "gapic", GaxProperties.getLibraryVersion(CampaignExperimentServiceStubSettings.class))
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

  protected CampaignExperimentServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    getCampaignExperimentSettings = settingsBuilder.getCampaignExperimentSettings().build();
    createCampaignExperimentSettings = settingsBuilder.createCampaignExperimentSettings().build();
    createCampaignExperimentOperationSettings =
        settingsBuilder.createCampaignExperimentOperationSettings().build();
    mutateCampaignExperimentsSettings = settingsBuilder.mutateCampaignExperimentsSettings().build();
    graduateCampaignExperimentSettings =
        settingsBuilder.graduateCampaignExperimentSettings().build();
    promoteCampaignExperimentSettings = settingsBuilder.promoteCampaignExperimentSettings().build();
    promoteCampaignExperimentOperationSettings =
        settingsBuilder.promoteCampaignExperimentOperationSettings().build();
    endCampaignExperimentSettings = settingsBuilder.endCampaignExperimentSettings().build();
    listCampaignExperimentAsyncErrorsSettings =
        settingsBuilder.listCampaignExperimentAsyncErrorsSettings().build();
  }

  /** Builder for CampaignExperimentServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<CampaignExperimentServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<GetCampaignExperimentRequest, CampaignExperiment>
        getCampaignExperimentSettings;
    private final UnaryCallSettings.Builder<CreateCampaignExperimentRequest, Operation>
        createCampaignExperimentSettings;
    private final OperationCallSettings.Builder<
            CreateCampaignExperimentRequest, Empty, CreateCampaignExperimentMetadata>
        createCampaignExperimentOperationSettings;
    private final UnaryCallSettings.Builder<
            MutateCampaignExperimentsRequest, MutateCampaignExperimentsResponse>
        mutateCampaignExperimentsSettings;
    private final UnaryCallSettings.Builder<
            GraduateCampaignExperimentRequest, GraduateCampaignExperimentResponse>
        graduateCampaignExperimentSettings;
    private final UnaryCallSettings.Builder<PromoteCampaignExperimentRequest, Operation>
        promoteCampaignExperimentSettings;
    private final OperationCallSettings.Builder<PromoteCampaignExperimentRequest, Empty, Empty>
        promoteCampaignExperimentOperationSettings;
    private final UnaryCallSettings.Builder<EndCampaignExperimentRequest, Empty>
        endCampaignExperimentSettings;
    private final PagedCallSettings.Builder<
            ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
            ListCampaignExperimentAsyncErrorsPagedResponse>
        listCampaignExperimentAsyncErrorsSettings;
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
              .setInitialRpcTimeout(Duration.ofMillis(3600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(3600000L))
              .setTotalTimeout(Duration.ofMillis(3600000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      getCampaignExperimentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createCampaignExperimentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createCampaignExperimentOperationSettings = OperationCallSettings.newBuilder();
      mutateCampaignExperimentsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      graduateCampaignExperimentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      promoteCampaignExperimentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      promoteCampaignExperimentOperationSettings = OperationCallSettings.newBuilder();
      endCampaignExperimentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listCampaignExperimentAsyncErrorsSettings =
          PagedCallSettings.newBuilder(LIST_CAMPAIGN_EXPERIMENT_ASYNC_ERRORS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getCampaignExperimentSettings,
              createCampaignExperimentSettings,
              mutateCampaignExperimentsSettings,
              graduateCampaignExperimentSettings,
              promoteCampaignExperimentSettings,
              endCampaignExperimentSettings,
              listCampaignExperimentAsyncErrorsSettings);
      initDefaults(this);
    }

    protected Builder(CampaignExperimentServiceStubSettings settings) {
      super(settings);

      getCampaignExperimentSettings = settings.getCampaignExperimentSettings.toBuilder();
      createCampaignExperimentSettings = settings.createCampaignExperimentSettings.toBuilder();
      createCampaignExperimentOperationSettings =
          settings.createCampaignExperimentOperationSettings.toBuilder();
      mutateCampaignExperimentsSettings = settings.mutateCampaignExperimentsSettings.toBuilder();
      graduateCampaignExperimentSettings = settings.graduateCampaignExperimentSettings.toBuilder();
      promoteCampaignExperimentSettings = settings.promoteCampaignExperimentSettings.toBuilder();
      promoteCampaignExperimentOperationSettings =
          settings.promoteCampaignExperimentOperationSettings.toBuilder();
      endCampaignExperimentSettings = settings.endCampaignExperimentSettings.toBuilder();
      listCampaignExperimentAsyncErrorsSettings =
          settings.listCampaignExperimentAsyncErrorsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getCampaignExperimentSettings,
              createCampaignExperimentSettings,
              mutateCampaignExperimentsSettings,
              graduateCampaignExperimentSettings,
              promoteCampaignExperimentSettings,
              endCampaignExperimentSettings,
              listCampaignExperimentAsyncErrorsSettings);
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
          .getCampaignExperimentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createCampaignExperimentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .mutateCampaignExperimentsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .graduateCampaignExperimentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .promoteCampaignExperimentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .endCampaignExperimentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listCampaignExperimentAsyncErrorsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createCampaignExperimentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateCampaignExperimentRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  CreateCampaignExperimentMetadata.class))
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

      builder
          .promoteCampaignExperimentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<PromoteCampaignExperimentRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
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

    /** Returns the builder for the settings used for calls to getCampaignExperiment. */
    public UnaryCallSettings.Builder<GetCampaignExperimentRequest, CampaignExperiment>
        getCampaignExperimentSettings() {
      return getCampaignExperimentSettings;
    }

    /** Returns the builder for the settings used for calls to createCampaignExperiment. */
    public UnaryCallSettings.Builder<CreateCampaignExperimentRequest, Operation>
        createCampaignExperimentSettings() {
      return createCampaignExperimentSettings;
    }

    /** Returns the builder for the settings used for calls to createCampaignExperiment. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            CreateCampaignExperimentRequest, Empty, CreateCampaignExperimentMetadata>
        createCampaignExperimentOperationSettings() {
      return createCampaignExperimentOperationSettings;
    }

    /** Returns the builder for the settings used for calls to mutateCampaignExperiments. */
    public UnaryCallSettings.Builder<
            MutateCampaignExperimentsRequest, MutateCampaignExperimentsResponse>
        mutateCampaignExperimentsSettings() {
      return mutateCampaignExperimentsSettings;
    }

    /** Returns the builder for the settings used for calls to graduateCampaignExperiment. */
    public UnaryCallSettings.Builder<
            GraduateCampaignExperimentRequest, GraduateCampaignExperimentResponse>
        graduateCampaignExperimentSettings() {
      return graduateCampaignExperimentSettings;
    }

    /** Returns the builder for the settings used for calls to promoteCampaignExperiment. */
    public UnaryCallSettings.Builder<PromoteCampaignExperimentRequest, Operation>
        promoteCampaignExperimentSettings() {
      return promoteCampaignExperimentSettings;
    }

    /** Returns the builder for the settings used for calls to promoteCampaignExperiment. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<PromoteCampaignExperimentRequest, Empty, Empty>
        promoteCampaignExperimentOperationSettings() {
      return promoteCampaignExperimentOperationSettings;
    }

    /** Returns the builder for the settings used for calls to endCampaignExperiment. */
    public UnaryCallSettings.Builder<EndCampaignExperimentRequest, Empty>
        endCampaignExperimentSettings() {
      return endCampaignExperimentSettings;
    }

    /** Returns the builder for the settings used for calls to listCampaignExperimentAsyncErrors. */
    public PagedCallSettings.Builder<
            ListCampaignExperimentAsyncErrorsRequest, ListCampaignExperimentAsyncErrorsResponse,
            ListCampaignExperimentAsyncErrorsPagedResponse>
        listCampaignExperimentAsyncErrorsSettings() {
      return listCampaignExperimentAsyncErrorsSettings;
    }

    @Override
    public CampaignExperimentServiceStubSettings build() throws IOException {
      return new CampaignExperimentServiceStubSettings(this);
    }
  }
}
