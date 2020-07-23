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
package com.google.ads.googleads.v1.services;

import static com.google.ads.googleads.v1.services.MutateJobServiceClient.ListMutateJobResultsPagedResponse;

import com.google.ads.googleads.v1.resources.MutateJob;
import com.google.ads.googleads.v1.resources.MutateJob.MutateJobMetadata;
import com.google.ads.googleads.v1.services.stub.MutateJobServiceStubSettings;
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
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link MutateJobServiceClient}.
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
 * <p>For example, to set the total timeout of createMutateJob to 30 seconds:
 *
 * <pre>
 * <code>
 * MutateJobServiceSettings.Builder mutateJobServiceSettingsBuilder =
 *     MutateJobServiceSettings.newBuilder();
 * mutateJobServiceSettingsBuilder
 *     .createMutateJobSettings()
 *     .setRetrySettings(
 *         mutateJobServiceSettingsBuilder.createMutateJobSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * MutateJobServiceSettings mutateJobServiceSettings = mutateJobServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class MutateJobServiceSettings extends ClientSettings<MutateJobServiceSettings> {
  /** Returns the object with the settings used for calls to createMutateJob. */
  public UnaryCallSettings<CreateMutateJobRequest, CreateMutateJobResponse>
      createMutateJobSettings() {
    return ((MutateJobServiceStubSettings) getStubSettings()).createMutateJobSettings();
  }

  /** Returns the object with the settings used for calls to getMutateJob. */
  public UnaryCallSettings<GetMutateJobRequest, MutateJob> getMutateJobSettings() {
    return ((MutateJobServiceStubSettings) getStubSettings()).getMutateJobSettings();
  }

  /** Returns the object with the settings used for calls to listMutateJobResults. */
  public PagedCallSettings<
          ListMutateJobResultsRequest, ListMutateJobResultsResponse,
          ListMutateJobResultsPagedResponse>
      listMutateJobResultsSettings() {
    return ((MutateJobServiceStubSettings) getStubSettings()).listMutateJobResultsSettings();
  }

  /** Returns the object with the settings used for calls to runMutateJob. */
  public UnaryCallSettings<RunMutateJobRequest, Operation> runMutateJobSettings() {
    return ((MutateJobServiceStubSettings) getStubSettings()).runMutateJobSettings();
  }

  /** Returns the object with the settings used for calls to runMutateJob. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<RunMutateJobRequest, Empty, MutateJobMetadata>
      runMutateJobOperationSettings() {
    return ((MutateJobServiceStubSettings) getStubSettings()).runMutateJobOperationSettings();
  }

  /** Returns the object with the settings used for calls to addMutateJobOperations. */
  public UnaryCallSettings<AddMutateJobOperationsRequest, AddMutateJobOperationsResponse>
      addMutateJobOperationsSettings() {
    return ((MutateJobServiceStubSettings) getStubSettings()).addMutateJobOperationsSettings();
  }

  public static final MutateJobServiceSettings create(MutateJobServiceStubSettings stub)
      throws IOException {
    return new MutateJobServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return MutateJobServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return MutateJobServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return MutateJobServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return MutateJobServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return MutateJobServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return MutateJobServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return MutateJobServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected MutateJobServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for MutateJobServiceSettings. */
  public static class Builder extends ClientSettings.Builder<MutateJobServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(MutateJobServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(MutateJobServiceStubSettings.newBuilder());
    }

    protected Builder(MutateJobServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(MutateJobServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public MutateJobServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((MutateJobServiceStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to createMutateJob. */
    public UnaryCallSettings.Builder<CreateMutateJobRequest, CreateMutateJobResponse>
        createMutateJobSettings() {
      return getStubSettingsBuilder().createMutateJobSettings();
    }

    /** Returns the builder for the settings used for calls to getMutateJob. */
    public UnaryCallSettings.Builder<GetMutateJobRequest, MutateJob> getMutateJobSettings() {
      return getStubSettingsBuilder().getMutateJobSettings();
    }

    /** Returns the builder for the settings used for calls to listMutateJobResults. */
    public PagedCallSettings.Builder<
            ListMutateJobResultsRequest, ListMutateJobResultsResponse,
            ListMutateJobResultsPagedResponse>
        listMutateJobResultsSettings() {
      return getStubSettingsBuilder().listMutateJobResultsSettings();
    }

    /** Returns the builder for the settings used for calls to runMutateJob. */
    public UnaryCallSettings.Builder<RunMutateJobRequest, Operation> runMutateJobSettings() {
      return getStubSettingsBuilder().runMutateJobSettings();
    }

    /** Returns the builder for the settings used for calls to runMutateJob. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<RunMutateJobRequest, Empty, MutateJobMetadata>
        runMutateJobOperationSettings() {
      return getStubSettingsBuilder().runMutateJobOperationSettings();
    }

    /** Returns the builder for the settings used for calls to addMutateJobOperations. */
    public UnaryCallSettings.Builder<AddMutateJobOperationsRequest, AddMutateJobOperationsResponse>
        addMutateJobOperationsSettings() {
      return getStubSettingsBuilder().addMutateJobOperationsSettings();
    }

    @Override
    public MutateJobServiceSettings build() throws IOException {
      return new MutateJobServiceSettings(this);
    }
  }
}
