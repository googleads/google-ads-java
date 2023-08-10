/*
 * Copyright 2023 Google LLC
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

package com.google.ads.googleads.v14.services;

import static com.google.ads.googleads.v14.services.ExperimentServiceClient.ListExperimentAsyncErrorsPagedResponse;

import com.google.ads.googleads.v14.services.stub.ExperimentServiceStubSettings;
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
 * Settings class to configure an instance of {@link ExperimentServiceClient}.
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
 * ExperimentServiceSettings.Builder experimentServiceSettingsBuilder =
 *     ExperimentServiceSettings.newBuilder();
 * experimentServiceSettingsBuilder
 *     .mutateExperimentsSettings()
 *     .setRetrySettings(
 *         experimentServiceSettingsBuilder
 *             .mutateExperimentsSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ExperimentServiceSettings experimentServiceSettings = experimentServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class ExperimentServiceSettings extends ClientSettings<ExperimentServiceSettings> {

  /** Returns the object with the settings used for calls to mutateExperiments. */
  public UnaryCallSettings<MutateExperimentsRequest, MutateExperimentsResponse>
      mutateExperimentsSettings() {
    return ((ExperimentServiceStubSettings) getStubSettings()).mutateExperimentsSettings();
  }

  /** Returns the object with the settings used for calls to endExperiment. */
  public UnaryCallSettings<EndExperimentRequest, Empty> endExperimentSettings() {
    return ((ExperimentServiceStubSettings) getStubSettings()).endExperimentSettings();
  }

  /** Returns the object with the settings used for calls to listExperimentAsyncErrors. */
  public PagedCallSettings<
          ListExperimentAsyncErrorsRequest,
          ListExperimentAsyncErrorsResponse,
          ListExperimentAsyncErrorsPagedResponse>
      listExperimentAsyncErrorsSettings() {
    return ((ExperimentServiceStubSettings) getStubSettings()).listExperimentAsyncErrorsSettings();
  }

  /** Returns the object with the settings used for calls to graduateExperiment. */
  public UnaryCallSettings<GraduateExperimentRequest, Empty> graduateExperimentSettings() {
    return ((ExperimentServiceStubSettings) getStubSettings()).graduateExperimentSettings();
  }

  /** Returns the object with the settings used for calls to scheduleExperiment. */
  public UnaryCallSettings<ScheduleExperimentRequest, Operation> scheduleExperimentSettings() {
    return ((ExperimentServiceStubSettings) getStubSettings()).scheduleExperimentSettings();
  }

  /** Returns the object with the settings used for calls to scheduleExperiment. */
  public OperationCallSettings<ScheduleExperimentRequest, Empty, ScheduleExperimentMetadata>
      scheduleExperimentOperationSettings() {
    return ((ExperimentServiceStubSettings) getStubSettings())
        .scheduleExperimentOperationSettings();
  }

  /** Returns the object with the settings used for calls to promoteExperiment. */
  public UnaryCallSettings<PromoteExperimentRequest, Operation> promoteExperimentSettings() {
    return ((ExperimentServiceStubSettings) getStubSettings()).promoteExperimentSettings();
  }

  /** Returns the object with the settings used for calls to promoteExperiment. */
  public OperationCallSettings<PromoteExperimentRequest, Empty, PromoteExperimentMetadata>
      promoteExperimentOperationSettings() {
    return ((ExperimentServiceStubSettings) getStubSettings()).promoteExperimentOperationSettings();
  }

  public static final ExperimentServiceSettings create(ExperimentServiceStubSettings stub)
      throws IOException {
    return new ExperimentServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return ExperimentServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return ExperimentServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return ExperimentServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return ExperimentServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return ExperimentServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return ExperimentServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ExperimentServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected ExperimentServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for ExperimentServiceSettings. */
  public static class Builder extends ClientSettings.Builder<ExperimentServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(ExperimentServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(ExperimentServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(ExperimentServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(ExperimentServiceStubSettings.newBuilder());
    }

    public ExperimentServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((ExperimentServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to mutateExperiments. */
    public UnaryCallSettings.Builder<MutateExperimentsRequest, MutateExperimentsResponse>
        mutateExperimentsSettings() {
      return getStubSettingsBuilder().mutateExperimentsSettings();
    }

    /** Returns the builder for the settings used for calls to endExperiment. */
    public UnaryCallSettings.Builder<EndExperimentRequest, Empty> endExperimentSettings() {
      return getStubSettingsBuilder().endExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to listExperimentAsyncErrors. */
    public PagedCallSettings.Builder<
            ListExperimentAsyncErrorsRequest,
            ListExperimentAsyncErrorsResponse,
            ListExperimentAsyncErrorsPagedResponse>
        listExperimentAsyncErrorsSettings() {
      return getStubSettingsBuilder().listExperimentAsyncErrorsSettings();
    }

    /** Returns the builder for the settings used for calls to graduateExperiment. */
    public UnaryCallSettings.Builder<GraduateExperimentRequest, Empty>
        graduateExperimentSettings() {
      return getStubSettingsBuilder().graduateExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to scheduleExperiment. */
    public UnaryCallSettings.Builder<ScheduleExperimentRequest, Operation>
        scheduleExperimentSettings() {
      return getStubSettingsBuilder().scheduleExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to scheduleExperiment. */
    public OperationCallSettings.Builder<
            ScheduleExperimentRequest, Empty, ScheduleExperimentMetadata>
        scheduleExperimentOperationSettings() {
      return getStubSettingsBuilder().scheduleExperimentOperationSettings();
    }

    /** Returns the builder for the settings used for calls to promoteExperiment. */
    public UnaryCallSettings.Builder<PromoteExperimentRequest, Operation>
        promoteExperimentSettings() {
      return getStubSettingsBuilder().promoteExperimentSettings();
    }

    /** Returns the builder for the settings used for calls to promoteExperiment. */
    public OperationCallSettings.Builder<PromoteExperimentRequest, Empty, PromoteExperimentMetadata>
        promoteExperimentOperationSettings() {
      return getStubSettingsBuilder().promoteExperimentOperationSettings();
    }

    @Override
    public ExperimentServiceSettings build() throws IOException {
      return new ExperimentServiceSettings(this);
    }
  }
}
