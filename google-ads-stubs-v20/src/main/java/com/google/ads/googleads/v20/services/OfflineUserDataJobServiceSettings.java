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

package com.google.ads.googleads.v20.services;

import com.google.ads.googleads.v20.resources.OfflineUserDataJobMetadata;
import com.google.ads.googleads.v20.services.stub.OfflineUserDataJobServiceStubSettings;
import com.google.api.core.ApiFunction;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
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
 * Settings class to configure an instance of {@link OfflineUserDataJobServiceClient}.
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
 * of createOfflineUserDataJob:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * OfflineUserDataJobServiceSettings.Builder offlineUserDataJobServiceSettingsBuilder =
 *     OfflineUserDataJobServiceSettings.newBuilder();
 * offlineUserDataJobServiceSettingsBuilder
 *     .createOfflineUserDataJobSettings()
 *     .setRetrySettings(
 *         offlineUserDataJobServiceSettingsBuilder
 *             .createOfflineUserDataJobSettings()
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
 * OfflineUserDataJobServiceSettings offlineUserDataJobServiceSettings =
 *     offlineUserDataJobServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for runOfflineUserDataJob:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * OfflineUserDataJobServiceSettings.Builder offlineUserDataJobServiceSettingsBuilder =
 *     OfflineUserDataJobServiceSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * offlineUserDataJobServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class OfflineUserDataJobServiceSettings
    extends ClientSettings<OfflineUserDataJobServiceSettings> {

  /** Returns the object with the settings used for calls to createOfflineUserDataJob. */
  public UnaryCallSettings<CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>
      createOfflineUserDataJobSettings() {
    return ((OfflineUserDataJobServiceStubSettings) getStubSettings())
        .createOfflineUserDataJobSettings();
  }

  /** Returns the object with the settings used for calls to addOfflineUserDataJobOperations. */
  public UnaryCallSettings<
          AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
      addOfflineUserDataJobOperationsSettings() {
    return ((OfflineUserDataJobServiceStubSettings) getStubSettings())
        .addOfflineUserDataJobOperationsSettings();
  }

  /** Returns the object with the settings used for calls to runOfflineUserDataJob. */
  public UnaryCallSettings<RunOfflineUserDataJobRequest, Operation>
      runOfflineUserDataJobSettings() {
    return ((OfflineUserDataJobServiceStubSettings) getStubSettings())
        .runOfflineUserDataJobSettings();
  }

  /** Returns the object with the settings used for calls to runOfflineUserDataJob. */
  public OperationCallSettings<RunOfflineUserDataJobRequest, Empty, OfflineUserDataJobMetadata>
      runOfflineUserDataJobOperationSettings() {
    return ((OfflineUserDataJobServiceStubSettings) getStubSettings())
        .runOfflineUserDataJobOperationSettings();
  }

  public static final OfflineUserDataJobServiceSettings create(
      OfflineUserDataJobServiceStubSettings stub) throws IOException {
    return new OfflineUserDataJobServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return OfflineUserDataJobServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return OfflineUserDataJobServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return OfflineUserDataJobServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return OfflineUserDataJobServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return OfflineUserDataJobServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return OfflineUserDataJobServiceStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return OfflineUserDataJobServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected OfflineUserDataJobServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for OfflineUserDataJobServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<OfflineUserDataJobServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(OfflineUserDataJobServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(OfflineUserDataJobServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(OfflineUserDataJobServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(OfflineUserDataJobServiceStubSettings.newBuilder());
    }

    public OfflineUserDataJobServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((OfflineUserDataJobServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to createOfflineUserDataJob. */
    public UnaryCallSettings.Builder<
            CreateOfflineUserDataJobRequest, CreateOfflineUserDataJobResponse>
        createOfflineUserDataJobSettings() {
      return getStubSettingsBuilder().createOfflineUserDataJobSettings();
    }

    /** Returns the builder for the settings used for calls to addOfflineUserDataJobOperations. */
    public UnaryCallSettings.Builder<
            AddOfflineUserDataJobOperationsRequest, AddOfflineUserDataJobOperationsResponse>
        addOfflineUserDataJobOperationsSettings() {
      return getStubSettingsBuilder().addOfflineUserDataJobOperationsSettings();
    }

    /** Returns the builder for the settings used for calls to runOfflineUserDataJob. */
    public UnaryCallSettings.Builder<RunOfflineUserDataJobRequest, Operation>
        runOfflineUserDataJobSettings() {
      return getStubSettingsBuilder().runOfflineUserDataJobSettings();
    }

    /** Returns the builder for the settings used for calls to runOfflineUserDataJob. */
    public OperationCallSettings.Builder<
            RunOfflineUserDataJobRequest, Empty, OfflineUserDataJobMetadata>
        runOfflineUserDataJobOperationSettings() {
      return getStubSettingsBuilder().runOfflineUserDataJobOperationSettings();
    }

    @Override
    public OfflineUserDataJobServiceSettings build() throws IOException {
      return new OfflineUserDataJobServiceSettings(this);
    }
  }
}
