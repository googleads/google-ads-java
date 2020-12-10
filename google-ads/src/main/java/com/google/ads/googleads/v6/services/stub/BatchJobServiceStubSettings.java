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

package com.google.ads.googleads.v6.services.stub;

import static com.google.ads.googleads.v6.services.BatchJobServiceClient.ListBatchJobResultsPagedResponse;

import com.google.ads.googleads.v6.resources.BatchJob;
import com.google.ads.googleads.v6.services.AddBatchJobOperationsRequest;
import com.google.ads.googleads.v6.services.AddBatchJobOperationsResponse;
import com.google.ads.googleads.v6.services.BatchJobResult;
import com.google.ads.googleads.v6.services.GetBatchJobRequest;
import com.google.ads.googleads.v6.services.ListBatchJobResultsRequest;
import com.google.ads.googleads.v6.services.ListBatchJobResultsResponse;
import com.google.ads.googleads.v6.services.MutateBatchJobRequest;
import com.google.ads.googleads.v6.services.MutateBatchJobResponse;
import com.google.ads.googleads.v6.services.RunBatchJobRequest;
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
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

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
 * <p>For example, to set the total timeout of mutateBatchJob to 30 seconds:
 *
 * <pre>{@code
 * BatchJobServiceStubSettings.Builder batchJobServiceSettingsBuilder =
 *     BatchJobServiceStubSettings.newBuilder();
 * batchJobServiceSettingsBuilder
 *     .mutateBatchJobSettings()
 *     .setRetrySettings(
 *         batchJobServiceSettingsBuilder
 *             .mutateBatchJobSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * BatchJobServiceStubSettings batchJobServiceSettings = batchJobServiceSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class BatchJobServiceStubSettings extends StubSettings<BatchJobServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/adwords").build();

  private final UnaryCallSettings<MutateBatchJobRequest, MutateBatchJobResponse>
      mutateBatchJobSettings;
  private final UnaryCallSettings<GetBatchJobRequest, BatchJob> getBatchJobSettings;
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
              return payload.getResultsList() == null
                  ? ImmutableList.<BatchJobResult>of()
                  : payload.getResultsList();
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

  /** Returns the object with the settings used for calls to getBatchJob. */
  public UnaryCallSettings<GetBatchJobRequest, BatchJob> getBatchJobSettings() {
    return getBatchJobSettings;
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

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
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
    getBatchJobSettings = settingsBuilder.getBatchJobSettings().build();
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
    private final UnaryCallSettings.Builder<GetBatchJobRequest, BatchJob> getBatchJobSettings;
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

      mutateBatchJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getBatchJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listBatchJobResultsSettings =
          PagedCallSettings.newBuilder(LIST_BATCH_JOB_RESULTS_PAGE_STR_FACT);
      runBatchJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      runBatchJobOperationSettings = OperationCallSettings.newBuilder();
      addBatchJobOperationsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              mutateBatchJobSettings,
              getBatchJobSettings,
              listBatchJobResultsSettings,
              runBatchJobSettings,
              addBatchJobOperationsSettings);
      initDefaults(this);
    }

    protected Builder(BatchJobServiceStubSettings settings) {
      super(settings);

      mutateBatchJobSettings = settings.mutateBatchJobSettings.toBuilder();
      getBatchJobSettings = settings.getBatchJobSettings.toBuilder();
      listBatchJobResultsSettings = settings.listBatchJobResultsSettings.toBuilder();
      runBatchJobSettings = settings.runBatchJobSettings.toBuilder();
      runBatchJobOperationSettings = settings.runBatchJobOperationSettings.toBuilder();
      addBatchJobOperationsSettings = settings.addBatchJobOperationsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              mutateBatchJobSettings,
              getBatchJobSettings,
              listBatchJobResultsSettings,
              runBatchJobSettings,
              addBatchJobOperationsSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .mutateBatchJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getBatchJobSettings()
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

    // NEXT_MAJOR_VER: remove 'throws Exception'.
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

    /** Returns the builder for the settings used for calls to mutateBatchJob. */
    public UnaryCallSettings.Builder<MutateBatchJobRequest, MutateBatchJobResponse>
        mutateBatchJobSettings() {
      return mutateBatchJobSettings;
    }

    /** Returns the builder for the settings used for calls to getBatchJob. */
    public UnaryCallSettings.Builder<GetBatchJobRequest, BatchJob> getBatchJobSettings() {
      return getBatchJobSettings;
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
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
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
