/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v20.services.stub;

import static com.google.ads.googleads.v20.services.BatchJobServiceClient.ListBatchJobResultsPagedResponse;

import com.google.ads.googleads.v20.resources.BatchJob;
import com.google.ads.googleads.v20.services.AddBatchJobOperationsRequest;
import com.google.ads.googleads.v20.services.AddBatchJobOperationsResponse;
import com.google.ads.googleads.v20.services.BatchJobResult;
import com.google.ads.googleads.v20.services.ListBatchJobResultsRequest;
import com.google.ads.googleads.v20.services.ListBatchJobResultsResponse;
import com.google.ads.googleads.v20.services.MutateBatchJobRequest;
import com.google.ads.googleads.v20.services.MutateBatchJobResponse;
import com.google.ads.googleads.v20.services.RunBatchJobRequest;
import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ObsoleteApi;
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
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link BatchJobServiceStub}.
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
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of mutateBatchJob:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * BatchJobServiceStubSettings.Builder batchJobServiceSettingsBuilder =
 *     BatchJobServiceStubSettings.newBuilder();
 * batchJobServiceSettingsBuilder
 *     .mutateBatchJobSettings()
 *     .setRetrySettings(
 *         batchJobServiceSettingsBuilder
 *             .mutateBatchJobSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofSeconds(1))
 *             .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
 *             .setMaxAttempts(5)
 *             .setMaxRetryDelayDuration(Duration.ofSeconds(30))
 *             .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
 *             .setRetryDelayMultiplier(1.3)
 *             .setRpcTimeoutMultiplier(1.5)
 *             .setTotalTimeoutDuration(Duration.ofSeconds(300))
 *             .build());
 * BatchJobServiceStubSettings batchJobServiceSettings = batchJobServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for runBatchJob:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * BatchJobServiceStubSettings.Builder batchJobServiceSettingsBuilder =
 *     BatchJobServiceStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * batchJobServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class BatchJobServiceStubSettings extends StubSettings<BatchJobServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/adwords").build();

  private final UnaryCallSettings<MutateBatchJobRequest, MutateBatchJobResponse>
      mutateBatchJobSettings;
  private final PagedCallSettings<
          ListBatchJobResultsRequest, ListBatchJobResultsResponse, ListBatchJobResultsPagedResponse>
      listBatchJobResultsSettings;
  private final UnaryCallSettings<RunBatchJobRequest, Operation> runBatchJobSettings;
  private final OperationCallSettings<RunBatchJobRequest, Empty, BatchJob.BatchJobMetadata>
      runBatchJobOperationSettings;
  private final UnaryCallSettings<AddBatchJobOperationsRequest, AddBatchJobOperationsResponse>
      addBatchJobOperationsSettings;

  private static final PagedListDescriptor<
          ListBatchJobResultsRequest, ListBatchJobResultsResponse, BatchJobResult>
      LIST_BATCH_JOB_RESULTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListBatchJobResultsRequest, ListBatchJobResultsResponse, BatchJobResult>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListBatchJobResultsRequest injectToken(
                ListBatchJobResultsRequest payload, String token) {
              return ListBatchJobResultsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListBatchJobResultsRequest injectPageSize(
                ListBatchJobResultsRequest payload, int pageSize) {
              return ListBatchJobResultsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListBatchJobResultsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListBatchJobResultsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<BatchJobResult> extractResources(ListBatchJobResultsResponse payload) {
              return payload.getResultsList();
            }
          };

  private static final PagedListResponseFactory<
          ListBatchJobResultsRequest, ListBatchJobResultsResponse, ListBatchJobResultsPagedResponse>
      LIST_BATCH_JOB_RESULTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListBatchJobResultsRequest,
              ListBatchJobResultsResponse,
              ListBatchJobResultsPagedResponse>() {
            @Override
            public ApiFuture<ListBatchJobResultsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListBatchJobResultsRequest, ListBatchJobResultsResponse> callable,
                ListBatchJobResultsRequest request,
                ApiCallContext context,
                ApiFuture<ListBatchJobResultsResponse> futureResponse) {
              PageContext<ListBatchJobResultsRequest, ListBatchJobResultsResponse, BatchJobResult>
                  pageContext =
                      PageContext.create(
                          callable, LIST_BATCH_JOB_RESULTS_PAGE_STR_DESC, request, context);
              return ListBatchJobResultsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to mutateBatchJob. */
  public UnaryCallSettings<MutateBatchJobRequest, MutateBatchJobResponse> mutateBatchJobSettings() {
    return mutateBatchJobSettings;
  }

  /** Returns the object with the settings used for calls to listBatchJobResults. */
  public PagedCallSettings<
          ListBatchJobResultsRequest, ListBatchJobResultsResponse, ListBatchJobResultsPagedResponse>
      listBatchJobResultsSettings() {
    return listBatchJobResultsSettings;
  }

  /** Returns the object with the settings used for calls to runBatchJob. */
  public UnaryCallSettings<RunBatchJobRequest, Operation> runBatchJobSettings() {
    return runBatchJobSettings;
  }

  /** Returns the object with the settings used for calls to runBatchJob. */
  public OperationCallSettings<RunBatchJobRequest, Empty, BatchJob.BatchJobMetadata>
      runBatchJobOperationSettings() {
    return runBatchJobOperationSettings;
  }

  /** Returns the object with the settings used for calls to addBatchJobOperations. */
  public UnaryCallSettings<AddBatchJobOperationsRequest, AddBatchJobOperationsResponse>
      addBatchJobOperationsSettings() {
    return addBatchJobOperationsSettings;
  }

  public BatchJobServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcBatchJobServiceStub.create(this);
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
  @ObsoleteApi("Use getEndpoint() instead")
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
            "gapic", GaxProperties.getLibraryVersion(BatchJobServiceStubSettings.class))
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

  protected BatchJobServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    mutateBatchJobSettings = settingsBuilder.mutateBatchJobSettings().build();
    listBatchJobResultsSettings = settingsBuilder.listBatchJobResultsSettings().build();
    runBatchJobSettings = settingsBuilder.runBatchJobSettings().build();
    runBatchJobOperationSettings = settingsBuilder.runBatchJobOperationSettings().build();
    addBatchJobOperationsSettings = settingsBuilder.addBatchJobOperationsSettings().build();
  }

  /** Builder for BatchJobServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<BatchJobServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<MutateBatchJobRequest, MutateBatchJobResponse>
        mutateBatchJobSettings;
    private final PagedCallSettings.Builder<
            ListBatchJobResultsRequest,
            ListBatchJobResultsResponse,
            ListBatchJobResultsPagedResponse>
        listBatchJobResultsSettings;
    private final UnaryCallSettings.Builder<RunBatchJobRequest, Operation> runBatchJobSettings;
    private final OperationCallSettings.Builder<
            RunBatchJobRequest, Empty, BatchJob.BatchJobMetadata>
        runBatchJobOperationSettings;
    private final UnaryCallSettings.Builder<
            AddBatchJobOperationsRequest, AddBatchJobOperationsResponse>
        addBatchJobOperationsSettings;
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
              .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(60000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(14400000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(14400000L))
              .setTotalTimeoutDuration(Duration.ofMillis(14400000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      mutateBatchJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listBatchJobResultsSettings =
          PagedCallSettings.newBuilder(LIST_BATCH_JOB_RESULTS_PAGE_STR_FACT);
      runBatchJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      runBatchJobOperationSettings = OperationCallSettings.newBuilder();
      addBatchJobOperationsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              mutateBatchJobSettings,
              listBatchJobResultsSettings,
              runBatchJobSettings,
              addBatchJobOperationsSettings);
      initDefaults(this);
    }

    protected Builder(BatchJobServiceStubSettings settings) {
      super(settings);

      mutateBatchJobSettings = settings.mutateBatchJobSettings.toBuilder();
      listBatchJobResultsSettings = settings.listBatchJobResultsSettings.toBuilder();
      runBatchJobSettings = settings.runBatchJobSettings.toBuilder();
      runBatchJobOperationSettings = settings.runBatchJobOperationSettings.toBuilder();
      addBatchJobOperationsSettings = settings.addBatchJobOperationsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              mutateBatchJobSettings,
              listBatchJobResultsSettings,
              runBatchJobSettings,
              addBatchJobOperationsSettings);
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
          .mutateBatchJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listBatchJobResultsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .runBatchJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .addBatchJobOperationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .runBatchJobOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<RunBatchJobRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  BatchJob.BatchJobMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
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

    /** Returns the builder for the settings used for calls to mutateBatchJob. */
    public UnaryCallSettings.Builder<MutateBatchJobRequest, MutateBatchJobResponse>
        mutateBatchJobSettings() {
      return mutateBatchJobSettings;
    }

    /** Returns the builder for the settings used for calls to listBatchJobResults. */
    public PagedCallSettings.Builder<
            ListBatchJobResultsRequest,
            ListBatchJobResultsResponse,
            ListBatchJobResultsPagedResponse>
        listBatchJobResultsSettings() {
      return listBatchJobResultsSettings;
    }

    /** Returns the builder for the settings used for calls to runBatchJob. */
    public UnaryCallSettings.Builder<RunBatchJobRequest, Operation> runBatchJobSettings() {
      return runBatchJobSettings;
    }

    /** Returns the builder for the settings used for calls to runBatchJob. */
    public OperationCallSettings.Builder<RunBatchJobRequest, Empty, BatchJob.BatchJobMetadata>
        runBatchJobOperationSettings() {
      return runBatchJobOperationSettings;
    }

    /** Returns the builder for the settings used for calls to addBatchJobOperations. */
    public UnaryCallSettings.Builder<AddBatchJobOperationsRequest, AddBatchJobOperationsResponse>
        addBatchJobOperationsSettings() {
      return addBatchJobOperationsSettings;
    }

    @Override
    public BatchJobServiceStubSettings build() throws IOException {
      return new BatchJobServiceStubSettings(this);
    }
  }
}
