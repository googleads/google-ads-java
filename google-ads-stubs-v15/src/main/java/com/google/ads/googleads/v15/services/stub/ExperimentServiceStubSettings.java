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

package com.google.ads.googleads.v15.services.stub;

import static com.google.ads.googleads.v15.services.ExperimentServiceClient.ListExperimentAsyncErrorsPagedResponse;

import com.google.ads.googleads.v15.services.EndExperimentRequest;
import com.google.ads.googleads.v15.services.GraduateExperimentRequest;
import com.google.ads.googleads.v15.services.ListExperimentAsyncErrorsRequest;
import com.google.ads.googleads.v15.services.ListExperimentAsyncErrorsResponse;
import com.google.ads.googleads.v15.services.MutateExperimentsRequest;
import com.google.ads.googleads.v15.services.MutateExperimentsResponse;
import com.google.ads.googleads.v15.services.PromoteExperimentMetadata;
import com.google.ads.googleads.v15.services.PromoteExperimentRequest;
import com.google.ads.googleads.v15.services.ScheduleExperimentMetadata;
import com.google.ads.googleads.v15.services.ScheduleExperimentRequest;
import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
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
 * Settings class to configure an instance of {@link ExperimentServiceStub}.
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
 * <p>For example, to set the total timeout of mutateExperiments to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ExperimentServiceStubSettings.Builder experimentServiceSettingsBuilder =
 *     ExperimentServiceStubSettings.newBuilder();
 * experimentServiceSettingsBuilder
 *     .mutateExperimentsSettings()
 *     .setRetrySettings(
 *         experimentServiceSettingsBuilder
 *             .mutateExperimentsSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ExperimentServiceStubSettings experimentServiceSettings =
 *     experimentServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class ExperimentServiceStubSettings extends StubSettings<ExperimentServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/adwords").build();

  private final UnaryCallSettings<MutateExperimentsRequest, MutateExperimentsResponse>
      mutateExperimentsSettings;
  private final UnaryCallSettings<EndExperimentRequest, Empty> endExperimentSettings;
  private final PagedCallSettings<
          ListExperimentAsyncErrorsRequest,
          ListExperimentAsyncErrorsResponse,
          ListExperimentAsyncErrorsPagedResponse>
      listExperimentAsyncErrorsSettings;
  private final UnaryCallSettings<GraduateExperimentRequest, Empty> graduateExperimentSettings;
  private final UnaryCallSettings<ScheduleExperimentRequest, Operation> scheduleExperimentSettings;
  private final OperationCallSettings<ScheduleExperimentRequest, Empty, ScheduleExperimentMetadata>
      scheduleExperimentOperationSettings;
  private final UnaryCallSettings<PromoteExperimentRequest, Operation> promoteExperimentSettings;
  private final OperationCallSettings<PromoteExperimentRequest, Empty, PromoteExperimentMetadata>
      promoteExperimentOperationSettings;

  private static final PagedListDescriptor<
          ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse, Status>
      LIST_EXPERIMENT_ASYNC_ERRORS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse, Status>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListExperimentAsyncErrorsRequest injectToken(
                ListExperimentAsyncErrorsRequest payload, String token) {
              return ListExperimentAsyncErrorsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListExperimentAsyncErrorsRequest injectPageSize(
                ListExperimentAsyncErrorsRequest payload, int pageSize) {
              return ListExperimentAsyncErrorsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListExperimentAsyncErrorsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListExperimentAsyncErrorsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Status> extractResources(ListExperimentAsyncErrorsResponse payload) {
              return payload.getErrorsList() == null
                  ? ImmutableList.<Status>of()
                  : payload.getErrorsList();
            }
          };

  private static final PagedListResponseFactory<
          ListExperimentAsyncErrorsRequest,
          ListExperimentAsyncErrorsResponse,
          ListExperimentAsyncErrorsPagedResponse>
      LIST_EXPERIMENT_ASYNC_ERRORS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListExperimentAsyncErrorsRequest,
              ListExperimentAsyncErrorsResponse,
              ListExperimentAsyncErrorsPagedResponse>() {
            @Override
            public ApiFuture<ListExperimentAsyncErrorsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse>
                    callable,
                ListExperimentAsyncErrorsRequest request,
                ApiCallContext context,
                ApiFuture<ListExperimentAsyncErrorsResponse> futureResponse) {
              PageContext<
                      ListExperimentAsyncErrorsRequest, ListExperimentAsyncErrorsResponse, Status>
                  pageContext =
                      PageContext.create(
                          callable, LIST_EXPERIMENT_ASYNC_ERRORS_PAGE_STR_DESC, request, context);
              return ListExperimentAsyncErrorsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to mutateExperiments. */
  public UnaryCallSettings<MutateExperimentsRequest, MutateExperimentsResponse>
      mutateExperimentsSettings() {
    return mutateExperimentsSettings;
  }

  /** Returns the object with the settings used for calls to endExperiment. */
  public UnaryCallSettings<EndExperimentRequest, Empty> endExperimentSettings() {
    return endExperimentSettings;
  }

  /** Returns the object with the settings used for calls to listExperimentAsyncErrors. */
  public PagedCallSettings<
          ListExperimentAsyncErrorsRequest,
          ListExperimentAsyncErrorsResponse,
          ListExperimentAsyncErrorsPagedResponse>
      listExperimentAsyncErrorsSettings() {
    return listExperimentAsyncErrorsSettings;
  }

  /** Returns the object with the settings used for calls to graduateExperiment. */
  public UnaryCallSettings<GraduateExperimentRequest, Empty> graduateExperimentSettings() {
    return graduateExperimentSettings;
  }

  /** Returns the object with the settings used for calls to scheduleExperiment. */
  public UnaryCallSettings<ScheduleExperimentRequest, Operation> scheduleExperimentSettings() {
    return scheduleExperimentSettings;
  }

  /** Returns the object with the settings used for calls to scheduleExperiment. */
  public OperationCallSettings<ScheduleExperimentRequest, Empty, ScheduleExperimentMetadata>
      scheduleExperimentOperationSettings() {
    return scheduleExperimentOperationSettings;
  }

  /** Returns the object with the settings used for calls to promoteExperiment. */
  public UnaryCallSettings<PromoteExperimentRequest, Operation> promoteExperimentSettings() {
    return promoteExperimentSettings;
  }

  /** Returns the object with the settings used for calls to promoteExperiment. */
  public OperationCallSettings<PromoteExperimentRequest, Empty, PromoteExperimentMetadata>
      promoteExperimentOperationSettings() {
    return promoteExperimentOperationSettings;
  }

  public ExperimentServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcExperimentServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "googleads";
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

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ExperimentServiceStubSettings.class))
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

  protected ExperimentServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    mutateExperimentsSettings = settingsBuilder.mutateExperimentsSettings().build();
    endExperimentSettings = settingsBuilder.endExperimentSettings().build();
    listExperimentAsyncErrorsSettings = settingsBuilder.listExperimentAsyncErrorsSettings().build();
    graduateExperimentSettings = settingsBuilder.graduateExperimentSettings().build();
    scheduleExperimentSettings = settingsBuilder.scheduleExperimentSettings().build();
    scheduleExperimentOperationSettings =
        settingsBuilder.scheduleExperimentOperationSettings().build();
    promoteExperimentSettings = settingsBuilder.promoteExperimentSettings().build();
    promoteExperimentOperationSettings =
        settingsBuilder.promoteExperimentOperationSettings().build();
  }

  /** Builder for ExperimentServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<ExperimentServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<MutateExperimentsRequest, MutateExperimentsResponse>
        mutateExperimentsSettings;
    private final UnaryCallSettings.Builder<EndExperimentRequest, Empty> endExperimentSettings;
    private final PagedCallSettings.Builder<
            ListExperimentAsyncErrorsRequest,
            ListExperimentAsyncErrorsResponse,
            ListExperimentAsyncErrorsPagedResponse>
        listExperimentAsyncErrorsSettings;
    private final UnaryCallSettings.Builder<GraduateExperimentRequest, Empty>
        graduateExperimentSettings;
    private final UnaryCallSettings.Builder<ScheduleExperimentRequest, Operation>
        scheduleExperimentSettings;
    private final OperationCallSettings.Builder<
            ScheduleExperimentRequest, Empty, ScheduleExperimentMetadata>
        scheduleExperimentOperationSettings;
    private final UnaryCallSettings.Builder<PromoteExperimentRequest, Operation>
        promoteExperimentSettings;
    private final OperationCallSettings.Builder<
            PromoteExperimentRequest, Empty, PromoteExperimentMetadata>
        promoteExperimentOperationSettings;
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

      mutateExperimentsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      endExperimentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listExperimentAsyncErrorsSettings =
          PagedCallSettings.newBuilder(LIST_EXPERIMENT_ASYNC_ERRORS_PAGE_STR_FACT);
      graduateExperimentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      scheduleExperimentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      scheduleExperimentOperationSettings = OperationCallSettings.newBuilder();
      promoteExperimentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      promoteExperimentOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              mutateExperimentsSettings,
              endExperimentSettings,
              listExperimentAsyncErrorsSettings,
              graduateExperimentSettings,
              scheduleExperimentSettings,
              promoteExperimentSettings);
      initDefaults(this);
    }

    protected Builder(ExperimentServiceStubSettings settings) {
      super(settings);

      mutateExperimentsSettings = settings.mutateExperimentsSettings.toBuilder();
      endExperimentSettings = settings.endExperimentSettings.toBuilder();
      listExperimentAsyncErrorsSettings = settings.listExperimentAsyncErrorsSettings.toBuilder();
      graduateExperimentSettings = settings.graduateExperimentSettings.toBuilder();
      scheduleExperimentSettings = settings.scheduleExperimentSettings.toBuilder();
      scheduleExperimentOperationSettings =
          settings.scheduleExperimentOperationSettings.toBuilder();
      promoteExperimentSettings = settings.promoteExperimentSettings.toBuilder();
      promoteExperimentOperationSettings = settings.promoteExperimentOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              mutateExperimentsSettings,
              endExperimentSettings,
              listExperimentAsyncErrorsSettings,
              graduateExperimentSettings,
              scheduleExperimentSettings,
              promoteExperimentSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .mutateExperimentsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .endExperimentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listExperimentAsyncErrorsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .graduateExperimentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .scheduleExperimentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .promoteExperimentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .scheduleExperimentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ScheduleExperimentRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  ScheduleExperimentMetadata.class))
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
          .promoteExperimentOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<PromoteExperimentRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  PromoteExperimentMetadata.class))
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

    /** Returns the builder for the settings used for calls to mutateExperiments. */
    public UnaryCallSettings.Builder<MutateExperimentsRequest, MutateExperimentsResponse>
        mutateExperimentsSettings() {
      return mutateExperimentsSettings;
    }

    /** Returns the builder for the settings used for calls to endExperiment. */
    public UnaryCallSettings.Builder<EndExperimentRequest, Empty> endExperimentSettings() {
      return endExperimentSettings;
    }

    /** Returns the builder for the settings used for calls to listExperimentAsyncErrors. */
    public PagedCallSettings.Builder<
            ListExperimentAsyncErrorsRequest,
            ListExperimentAsyncErrorsResponse,
            ListExperimentAsyncErrorsPagedResponse>
        listExperimentAsyncErrorsSettings() {
      return listExperimentAsyncErrorsSettings;
    }

    /** Returns the builder for the settings used for calls to graduateExperiment. */
    public UnaryCallSettings.Builder<GraduateExperimentRequest, Empty>
        graduateExperimentSettings() {
      return graduateExperimentSettings;
    }

    /** Returns the builder for the settings used for calls to scheduleExperiment. */
    public UnaryCallSettings.Builder<ScheduleExperimentRequest, Operation>
        scheduleExperimentSettings() {
      return scheduleExperimentSettings;
    }

    /** Returns the builder for the settings used for calls to scheduleExperiment. */
    public OperationCallSettings.Builder<
            ScheduleExperimentRequest, Empty, ScheduleExperimentMetadata>
        scheduleExperimentOperationSettings() {
      return scheduleExperimentOperationSettings;
    }

    /** Returns the builder for the settings used for calls to promoteExperiment. */
    public UnaryCallSettings.Builder<PromoteExperimentRequest, Operation>
        promoteExperimentSettings() {
      return promoteExperimentSettings;
    }

    /** Returns the builder for the settings used for calls to promoteExperiment. */
    public OperationCallSettings.Builder<PromoteExperimentRequest, Empty, PromoteExperimentMetadata>
        promoteExperimentOperationSettings() {
      return promoteExperimentOperationSettings;
    }

    @Override
    public ExperimentServiceStubSettings build() throws IOException {
      return new ExperimentServiceStubSettings(this);
    }
  }
}
