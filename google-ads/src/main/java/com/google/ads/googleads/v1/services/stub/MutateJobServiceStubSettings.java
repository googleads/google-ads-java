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
package com.google.ads.googleads.v1.services.stub;

import static com.google.ads.googleads.v1.services.MutateJobServiceClient.ListMutateJobResultsPagedResponse;

import com.google.ads.googleads.v1.resources.MutateJob;
import com.google.ads.googleads.v1.resources.MutateJob.MutateJobMetadata;
import com.google.ads.googleads.v1.services.AddMutateJobOperationsRequest;
import com.google.ads.googleads.v1.services.AddMutateJobOperationsResponse;
import com.google.ads.googleads.v1.services.CreateMutateJobRequest;
import com.google.ads.googleads.v1.services.CreateMutateJobResponse;
import com.google.ads.googleads.v1.services.GetMutateJobRequest;
import com.google.ads.googleads.v1.services.ListMutateJobResultsRequest;
import com.google.ads.googleads.v1.services.ListMutateJobResultsResponse;
import com.google.ads.googleads.v1.services.MutateJobResult;
import com.google.ads.googleads.v1.services.RunMutateJobRequest;
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

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link MutateJobServiceStub}.
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
 * example, to set the total timeout of createMutateJob to 30 seconds:
 *
 * <pre>
 * <code>
 * MutateJobServiceStubSettings.Builder mutateJobServiceSettingsBuilder =
 *     MutateJobServiceStubSettings.newBuilder();
 * mutateJobServiceSettingsBuilder.createMutateJobSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * MutateJobServiceStubSettings mutateJobServiceSettings = mutateJobServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class MutateJobServiceStubSettings extends StubSettings<MutateJobServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().build();

  private final UnaryCallSettings<CreateMutateJobRequest, CreateMutateJobResponse>
      createMutateJobSettings;
  private final UnaryCallSettings<GetMutateJobRequest, MutateJob> getMutateJobSettings;
  private final PagedCallSettings<
          ListMutateJobResultsRequest, ListMutateJobResultsResponse,
          ListMutateJobResultsPagedResponse>
      listMutateJobResultsSettings;
  private final UnaryCallSettings<RunMutateJobRequest, Operation> runMutateJobSettings;
  private final OperationCallSettings<RunMutateJobRequest, Empty, MutateJobMetadata>
      runMutateJobOperationSettings;
  private final UnaryCallSettings<AddMutateJobOperationsRequest, AddMutateJobOperationsResponse>
      addMutateJobOperationsSettings;

  /** Returns the object with the settings used for calls to createMutateJob. */
  public UnaryCallSettings<CreateMutateJobRequest, CreateMutateJobResponse>
      createMutateJobSettings() {
    return createMutateJobSettings;
  }

  /** Returns the object with the settings used for calls to getMutateJob. */
  public UnaryCallSettings<GetMutateJobRequest, MutateJob> getMutateJobSettings() {
    return getMutateJobSettings;
  }

  /** Returns the object with the settings used for calls to listMutateJobResults. */
  public PagedCallSettings<
          ListMutateJobResultsRequest, ListMutateJobResultsResponse,
          ListMutateJobResultsPagedResponse>
      listMutateJobResultsSettings() {
    return listMutateJobResultsSettings;
  }

  /** Returns the object with the settings used for calls to runMutateJob. */
  public UnaryCallSettings<RunMutateJobRequest, Operation> runMutateJobSettings() {
    return runMutateJobSettings;
  }

  /** Returns the object with the settings used for calls to runMutateJob. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<RunMutateJobRequest, Empty, MutateJobMetadata>
      runMutateJobOperationSettings() {
    return runMutateJobOperationSettings;
  }

  /** Returns the object with the settings used for calls to addMutateJobOperations. */
  public UnaryCallSettings<AddMutateJobOperationsRequest, AddMutateJobOperationsResponse>
      addMutateJobOperationsSettings() {
    return addMutateJobOperationsSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public MutateJobServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcMutateJobServiceStub.create(this);
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
    return InstantiatingGrpcChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(MutateJobServiceStubSettings.class))
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

  protected MutateJobServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createMutateJobSettings = settingsBuilder.createMutateJobSettings().build();
    getMutateJobSettings = settingsBuilder.getMutateJobSettings().build();
    listMutateJobResultsSettings = settingsBuilder.listMutateJobResultsSettings().build();
    runMutateJobSettings = settingsBuilder.runMutateJobSettings().build();
    runMutateJobOperationSettings = settingsBuilder.runMutateJobOperationSettings().build();
    addMutateJobOperationsSettings = settingsBuilder.addMutateJobOperationsSettings().build();
  }

  private static final PagedListDescriptor<
          ListMutateJobResultsRequest, ListMutateJobResultsResponse, MutateJobResult>
      LIST_MUTATE_JOB_RESULTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListMutateJobResultsRequest, ListMutateJobResultsResponse, MutateJobResult>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListMutateJobResultsRequest injectToken(
                ListMutateJobResultsRequest payload, String token) {
              return ListMutateJobResultsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListMutateJobResultsRequest injectPageSize(
                ListMutateJobResultsRequest payload, int pageSize) {
              return ListMutateJobResultsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListMutateJobResultsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListMutateJobResultsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<MutateJobResult> extractResources(
                ListMutateJobResultsResponse payload) {
              return payload.getResultsList() != null
                  ? payload.getResultsList()
                  : ImmutableList.<MutateJobResult>of();
            }
          };

  private static final PagedListResponseFactory<
          ListMutateJobResultsRequest, ListMutateJobResultsResponse,
          ListMutateJobResultsPagedResponse>
      LIST_MUTATE_JOB_RESULTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListMutateJobResultsRequest, ListMutateJobResultsResponse,
              ListMutateJobResultsPagedResponse>() {
            @Override
            public ApiFuture<ListMutateJobResultsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListMutateJobResultsRequest, ListMutateJobResultsResponse> callable,
                ListMutateJobResultsRequest request,
                ApiCallContext context,
                ApiFuture<ListMutateJobResultsResponse> futureResponse) {
              PageContext<
                      ListMutateJobResultsRequest, ListMutateJobResultsResponse, MutateJobResult>
                  pageContext =
                      PageContext.create(
                          callable, LIST_MUTATE_JOB_RESULTS_PAGE_STR_DESC, request, context);
              return ListMutateJobResultsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for MutateJobServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<MutateJobServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<CreateMutateJobRequest, CreateMutateJobResponse>
        createMutateJobSettings;
    private final UnaryCallSettings.Builder<GetMutateJobRequest, MutateJob> getMutateJobSettings;
    private final PagedCallSettings.Builder<
            ListMutateJobResultsRequest, ListMutateJobResultsResponse,
            ListMutateJobResultsPagedResponse>
        listMutateJobResultsSettings;
    private final UnaryCallSettings.Builder<RunMutateJobRequest, Operation> runMutateJobSettings;
    private final OperationCallSettings.Builder<RunMutateJobRequest, Empty, MutateJobMetadata>
        runMutateJobOperationSettings;
    private final UnaryCallSettings.Builder<
            AddMutateJobOperationsRequest, AddMutateJobOperationsResponse>
        addMutateJobOperationsSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createMutateJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getMutateJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listMutateJobResultsSettings =
          PagedCallSettings.newBuilder(LIST_MUTATE_JOB_RESULTS_PAGE_STR_FACT);

      runMutateJobSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      runMutateJobOperationSettings = OperationCallSettings.newBuilder();

      addMutateJobOperationsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createMutateJobSettings,
              getMutateJobSettings,
              listMutateJobResultsSettings,
              runMutateJobSettings,
              addMutateJobOperationsSettings);

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
          .createMutateJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getMutateJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listMutateJobResultsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .runMutateJobSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .addMutateJobOperationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));
      builder
          .runMutateJobOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<RunMutateJobRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(MutateJobMetadata.class))
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

    protected Builder(MutateJobServiceStubSettings settings) {
      super(settings);

      createMutateJobSettings = settings.createMutateJobSettings.toBuilder();
      getMutateJobSettings = settings.getMutateJobSettings.toBuilder();
      listMutateJobResultsSettings = settings.listMutateJobResultsSettings.toBuilder();
      runMutateJobSettings = settings.runMutateJobSettings.toBuilder();
      runMutateJobOperationSettings = settings.runMutateJobOperationSettings.toBuilder();
      addMutateJobOperationsSettings = settings.addMutateJobOperationsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createMutateJobSettings,
              getMutateJobSettings,
              listMutateJobResultsSettings,
              runMutateJobSettings,
              addMutateJobOperationsSettings);
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

    /** Returns the builder for the settings used for calls to createMutateJob. */
    public UnaryCallSettings.Builder<CreateMutateJobRequest, CreateMutateJobResponse>
        createMutateJobSettings() {
      return createMutateJobSettings;
    }

    /** Returns the builder for the settings used for calls to getMutateJob. */
    public UnaryCallSettings.Builder<GetMutateJobRequest, MutateJob> getMutateJobSettings() {
      return getMutateJobSettings;
    }

    /** Returns the builder for the settings used for calls to listMutateJobResults. */
    public PagedCallSettings.Builder<
            ListMutateJobResultsRequest, ListMutateJobResultsResponse,
            ListMutateJobResultsPagedResponse>
        listMutateJobResultsSettings() {
      return listMutateJobResultsSettings;
    }

    /** Returns the builder for the settings used for calls to runMutateJob. */
    public UnaryCallSettings.Builder<RunMutateJobRequest, Operation> runMutateJobSettings() {
      return runMutateJobSettings;
    }

    /** Returns the builder for the settings used for calls to runMutateJob. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<RunMutateJobRequest, Empty, MutateJobMetadata>
        runMutateJobOperationSettings() {
      return runMutateJobOperationSettings;
    }

    /** Returns the builder for the settings used for calls to addMutateJobOperations. */
    public UnaryCallSettings.Builder<AddMutateJobOperationsRequest, AddMutateJobOperationsResponse>
        addMutateJobOperationsSettings() {
      return addMutateJobOperationsSettings;
    }

    @Override
    public MutateJobServiceStubSettings build() throws IOException {
      return new MutateJobServiceStubSettings(this);
    }
  }
}
