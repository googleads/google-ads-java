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

import com.google.ads.googleads.v20.services.stub.ReachPlanServiceStubSettings;
import com.google.api.core.ApiFunction;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ReachPlanServiceClient}.
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
 * of generateConversionRates:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ReachPlanServiceSettings.Builder reachPlanServiceSettingsBuilder =
 *     ReachPlanServiceSettings.newBuilder();
 * reachPlanServiceSettingsBuilder
 *     .generateConversionRatesSettings()
 *     .setRetrySettings(
 *         reachPlanServiceSettingsBuilder
 *             .generateConversionRatesSettings()
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
 * ReachPlanServiceSettings reachPlanServiceSettings = reachPlanServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class ReachPlanServiceSettings extends ClientSettings<ReachPlanServiceSettings> {

  /** Returns the object with the settings used for calls to generateConversionRates. */
  public UnaryCallSettings<GenerateConversionRatesRequest, GenerateConversionRatesResponse>
      generateConversionRatesSettings() {
    return ((ReachPlanServiceStubSettings) getStubSettings()).generateConversionRatesSettings();
  }

  /** Returns the object with the settings used for calls to listPlannableLocations. */
  public UnaryCallSettings<ListPlannableLocationsRequest, ListPlannableLocationsResponse>
      listPlannableLocationsSettings() {
    return ((ReachPlanServiceStubSettings) getStubSettings()).listPlannableLocationsSettings();
  }

  /** Returns the object with the settings used for calls to listPlannableProducts. */
  public UnaryCallSettings<ListPlannableProductsRequest, ListPlannableProductsResponse>
      listPlannableProductsSettings() {
    return ((ReachPlanServiceStubSettings) getStubSettings()).listPlannableProductsSettings();
  }

  /** Returns the object with the settings used for calls to generateReachForecast. */
  public UnaryCallSettings<GenerateReachForecastRequest, GenerateReachForecastResponse>
      generateReachForecastSettings() {
    return ((ReachPlanServiceStubSettings) getStubSettings()).generateReachForecastSettings();
  }

  /** Returns the object with the settings used for calls to listPlannableUserLists. */
  public UnaryCallSettings<ListPlannableUserListsRequest, ListPlannableUserListsResponse>
      listPlannableUserListsSettings() {
    return ((ReachPlanServiceStubSettings) getStubSettings()).listPlannableUserListsSettings();
  }

  public static final ReachPlanServiceSettings create(ReachPlanServiceStubSettings stub)
      throws IOException {
    return new ReachPlanServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return ReachPlanServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return ReachPlanServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return ReachPlanServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return ReachPlanServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return ReachPlanServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return ReachPlanServiceStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ReachPlanServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected ReachPlanServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for ReachPlanServiceSettings. */
  public static class Builder extends ClientSettings.Builder<ReachPlanServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(ReachPlanServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(ReachPlanServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(ReachPlanServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(ReachPlanServiceStubSettings.newBuilder());
    }

    public ReachPlanServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((ReachPlanServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to generateConversionRates. */
    public UnaryCallSettings.Builder<
            GenerateConversionRatesRequest, GenerateConversionRatesResponse>
        generateConversionRatesSettings() {
      return getStubSettingsBuilder().generateConversionRatesSettings();
    }

    /** Returns the builder for the settings used for calls to listPlannableLocations. */
    public UnaryCallSettings.Builder<ListPlannableLocationsRequest, ListPlannableLocationsResponse>
        listPlannableLocationsSettings() {
      return getStubSettingsBuilder().listPlannableLocationsSettings();
    }

    /** Returns the builder for the settings used for calls to listPlannableProducts. */
    public UnaryCallSettings.Builder<ListPlannableProductsRequest, ListPlannableProductsResponse>
        listPlannableProductsSettings() {
      return getStubSettingsBuilder().listPlannableProductsSettings();
    }

    /** Returns the builder for the settings used for calls to generateReachForecast. */
    public UnaryCallSettings.Builder<GenerateReachForecastRequest, GenerateReachForecastResponse>
        generateReachForecastSettings() {
      return getStubSettingsBuilder().generateReachForecastSettings();
    }

    /** Returns the builder for the settings used for calls to listPlannableUserLists. */
    public UnaryCallSettings.Builder<ListPlannableUserListsRequest, ListPlannableUserListsResponse>
        listPlannableUserListsSettings() {
      return getStubSettingsBuilder().listPlannableUserListsSettings();
    }

    @Override
    public ReachPlanServiceSettings build() throws IOException {
      return new ReachPlanServiceSettings(this);
    }
  }
}
