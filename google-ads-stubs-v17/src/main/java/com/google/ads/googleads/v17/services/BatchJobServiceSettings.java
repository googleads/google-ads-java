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

package com.google.ads.googleads.v17.services;

import static com.google.ads.googleads.v17.services.BatchJobServiceClient.ListBatchJobResultsPagedResponse;

import com.google.ads.googleads.v17.resources.BatchJob;
import com.google.ads.googleads.v17.services.stub.BatchJobServiceStubSettings;
import com.google.api.core.ApiFunction;
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
 * Settings class to configure an instance of {@link BatchJobServiceClient}.
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
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * BatchJobServiceSettings.Builder batchJobServiceSettingsBuilder =
 *     BatchJobServiceSettings.newBuilder();
 * batchJobServiceSettingsBuilder
 *     .mutateBatchJobSettings()
 *     .setRetrySettings(
 *         batchJobServiceSettingsBuilder
 *             .mutateBatchJobSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * BatchJobServiceSettings batchJobServiceSettings = batchJobServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class BatchJobServiceSettings extends ClientSettings<BatchJobServiceSettings> {

  /** Returns the object with the settings used for calls to mutateBatchJob. */
  public UnaryCallSettings<MutateBatchJobRequest, MutateBatchJobResponse> mutateBatchJobSettings() {
    return ((BatchJobServiceStubSettings) getStubSettings()).mutateBatchJobSettings();
  }

  /** Returns the object with the settings used for calls to listBatchJobResults. */
  public PagedCallSettings<
          ListBatchJobResultsRequest, ListBatchJobResultsResponse, ListBatchJobResultsPagedResponse>
      listBatchJobResultsSettings() {
    return ((BatchJobServiceStubSettings) getStubSettings()).listBatchJobResultsSettings();
  }

  /** Returns the object with the settings used for calls to runBatchJob. */
  public UnaryCallSettings<RunBatchJobRequest, Operation> runBatchJobSettings() {
    return ((BatchJobServiceStubSettings) getStubSettings()).runBatchJobSettings();
  }

  /** Returns the object with the settings used for calls to runBatchJob. */
  public OperationCallSettings<RunBatchJobRequest, Empty, BatchJob.BatchJobMetadata>
      runBatchJobOperationSettings() {
    return ((BatchJobServiceStubSettings) getStubSettings()).runBatchJobOperationSettings();
  }

  /** Returns the object with the settings used for calls to addBatchJobOperations. */
  public UnaryCallSettings<AddBatchJobOperationsRequest, AddBatchJobOperationsResponse>
      addBatchJobOperationsSettings() {
    return ((BatchJobServiceStubSettings) getStubSettings()).addBatchJobOperationsSettings();
  }

  public static final BatchJobServiceSettings create(BatchJobServiceStubSettings stub)
      throws IOException {
    return new BatchJobServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return BatchJobServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return BatchJobServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return BatchJobServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return BatchJobServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return BatchJobServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return BatchJobServiceStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return BatchJobServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected BatchJobServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for BatchJobServiceSettings. */
  public static class Builder extends ClientSettings.Builder<BatchJobServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(BatchJobServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(BatchJobServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(BatchJobServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(BatchJobServiceStubSettings.newBuilder());
    }

    public BatchJobServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((BatchJobServiceStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to mutateBatchJob. */
    public UnaryCallSettings.Builder<MutateBatchJobRequest, MutateBatchJobResponse>
        mutateBatchJobSettings() {
      return getStubSettingsBuilder().mutateBatchJobSettings();
    }

    /** Returns the builder for the settings used for calls to listBatchJobResults. */
    public PagedCallSettings.Builder<
            ListBatchJobResultsRequest,
            ListBatchJobResultsResponse,
            ListBatchJobResultsPagedResponse>
        listBatchJobResultsSettings() {
      return getStubSettingsBuilder().listBatchJobResultsSettings();
    }

    /** Returns the builder for the settings used for calls to runBatchJob. */
    public UnaryCallSettings.Builder<RunBatchJobRequest, Operation> runBatchJobSettings() {
      return getStubSettingsBuilder().runBatchJobSettings();
    }

    /** Returns the builder for the settings used for calls to runBatchJob. */
    public OperationCallSettings.Builder<RunBatchJobRequest, Empty, BatchJob.BatchJobMetadata>
        runBatchJobOperationSettings() {
      return getStubSettingsBuilder().runBatchJobOperationSettings();
    }

    /** Returns the builder for the settings used for calls to addBatchJobOperations. */
    public UnaryCallSettings.Builder<AddBatchJobOperationsRequest, AddBatchJobOperationsResponse>
        addBatchJobOperationsSettings() {
      return getStubSettingsBuilder().addBatchJobOperationsSettings();
    }

    @Override
    public BatchJobServiceSettings build() throws IOException {
      return new BatchJobServiceSettings(this);
    }
  }
}
