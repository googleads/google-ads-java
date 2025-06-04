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

import com.google.ads.googleads.v20.services.GenerateConversionRatesRequest;
import com.google.ads.googleads.v20.services.GenerateConversionRatesResponse;
import com.google.ads.googleads.v20.services.GenerateReachForecastRequest;
import com.google.ads.googleads.v20.services.GenerateReachForecastResponse;
import com.google.ads.googleads.v20.services.ListPlannableLocationsRequest;
import com.google.ads.googleads.v20.services.ListPlannableLocationsResponse;
import com.google.ads.googleads.v20.services.ListPlannableProductsRequest;
import com.google.ads.googleads.v20.services.ListPlannableProductsResponse;
import com.google.ads.googleads.v20.services.ListPlannableUserListsRequest;
import com.google.ads.googleads.v20.services.ListPlannableUserListsResponse;
import com.google.api.core.ApiFunction;
import com.google.api.core.ObsoleteApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ReachPlanServiceStub}.
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
 * ReachPlanServiceStubSettings.Builder reachPlanServiceSettingsBuilder =
 *     ReachPlanServiceStubSettings.newBuilder();
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
 * ReachPlanServiceStubSettings reachPlanServiceSettings = reachPlanServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class ReachPlanServiceStubSettings extends StubSettings<ReachPlanServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/adwords").build();

  private final UnaryCallSettings<GenerateConversionRatesRequest, GenerateConversionRatesResponse>
      generateConversionRatesSettings;
  private final UnaryCallSettings<ListPlannableLocationsRequest, ListPlannableLocationsResponse>
      listPlannableLocationsSettings;
  private final UnaryCallSettings<ListPlannableProductsRequest, ListPlannableProductsResponse>
      listPlannableProductsSettings;
  private final UnaryCallSettings<GenerateReachForecastRequest, GenerateReachForecastResponse>
      generateReachForecastSettings;
  private final UnaryCallSettings<ListPlannableUserListsRequest, ListPlannableUserListsResponse>
      listPlannableUserListsSettings;

  /** Returns the object with the settings used for calls to generateConversionRates. */
  public UnaryCallSettings<GenerateConversionRatesRequest, GenerateConversionRatesResponse>
      generateConversionRatesSettings() {
    return generateConversionRatesSettings;
  }

  /** Returns the object with the settings used for calls to listPlannableLocations. */
  public UnaryCallSettings<ListPlannableLocationsRequest, ListPlannableLocationsResponse>
      listPlannableLocationsSettings() {
    return listPlannableLocationsSettings;
  }

  /** Returns the object with the settings used for calls to listPlannableProducts. */
  public UnaryCallSettings<ListPlannableProductsRequest, ListPlannableProductsResponse>
      listPlannableProductsSettings() {
    return listPlannableProductsSettings;
  }

  /** Returns the object with the settings used for calls to generateReachForecast. */
  public UnaryCallSettings<GenerateReachForecastRequest, GenerateReachForecastResponse>
      generateReachForecastSettings() {
    return generateReachForecastSettings;
  }

  /** Returns the object with the settings used for calls to listPlannableUserLists. */
  public UnaryCallSettings<ListPlannableUserListsRequest, ListPlannableUserListsResponse>
      listPlannableUserListsSettings() {
    return listPlannableUserListsSettings;
  }

  public ReachPlanServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcReachPlanServiceStub.create(this);
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
            "gapic", GaxProperties.getLibraryVersion(ReachPlanServiceStubSettings.class))
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

  protected ReachPlanServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    generateConversionRatesSettings = settingsBuilder.generateConversionRatesSettings().build();
    listPlannableLocationsSettings = settingsBuilder.listPlannableLocationsSettings().build();
    listPlannableProductsSettings = settingsBuilder.listPlannableProductsSettings().build();
    generateReachForecastSettings = settingsBuilder.generateReachForecastSettings().build();
    listPlannableUserListsSettings = settingsBuilder.listPlannableUserListsSettings().build();
  }

  /** Builder for ReachPlanServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<ReachPlanServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<
            GenerateConversionRatesRequest, GenerateConversionRatesResponse>
        generateConversionRatesSettings;
    private final UnaryCallSettings.Builder<
            ListPlannableLocationsRequest, ListPlannableLocationsResponse>
        listPlannableLocationsSettings;
    private final UnaryCallSettings.Builder<
            ListPlannableProductsRequest, ListPlannableProductsResponse>
        listPlannableProductsSettings;
    private final UnaryCallSettings.Builder<
            GenerateReachForecastRequest, GenerateReachForecastResponse>
        generateReachForecastSettings;
    private final UnaryCallSettings.Builder<
            ListPlannableUserListsRequest, ListPlannableUserListsResponse>
        listPlannableUserListsSettings;
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

      generateConversionRatesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listPlannableLocationsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listPlannableProductsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      generateReachForecastSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listPlannableUserListsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              generateConversionRatesSettings,
              listPlannableLocationsSettings,
              listPlannableProductsSettings,
              generateReachForecastSettings,
              listPlannableUserListsSettings);
      initDefaults(this);
    }

    protected Builder(ReachPlanServiceStubSettings settings) {
      super(settings);

      generateConversionRatesSettings = settings.generateConversionRatesSettings.toBuilder();
      listPlannableLocationsSettings = settings.listPlannableLocationsSettings.toBuilder();
      listPlannableProductsSettings = settings.listPlannableProductsSettings.toBuilder();
      generateReachForecastSettings = settings.generateReachForecastSettings.toBuilder();
      listPlannableUserListsSettings = settings.listPlannableUserListsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              generateConversionRatesSettings,
              listPlannableLocationsSettings,
              listPlannableProductsSettings,
              generateReachForecastSettings,
              listPlannableUserListsSettings);
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
          .generateConversionRatesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listPlannableLocationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listPlannableProductsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .generateReachForecastSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listPlannableUserListsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

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

    /** Returns the builder for the settings used for calls to generateConversionRates. */
    public UnaryCallSettings.Builder<
            GenerateConversionRatesRequest, GenerateConversionRatesResponse>
        generateConversionRatesSettings() {
      return generateConversionRatesSettings;
    }

    /** Returns the builder for the settings used for calls to listPlannableLocations. */
    public UnaryCallSettings.Builder<ListPlannableLocationsRequest, ListPlannableLocationsResponse>
        listPlannableLocationsSettings() {
      return listPlannableLocationsSettings;
    }

    /** Returns the builder for the settings used for calls to listPlannableProducts. */
    public UnaryCallSettings.Builder<ListPlannableProductsRequest, ListPlannableProductsResponse>
        listPlannableProductsSettings() {
      return listPlannableProductsSettings;
    }

    /** Returns the builder for the settings used for calls to generateReachForecast. */
    public UnaryCallSettings.Builder<GenerateReachForecastRequest, GenerateReachForecastResponse>
        generateReachForecastSettings() {
      return generateReachForecastSettings;
    }

    /** Returns the builder for the settings used for calls to listPlannableUserLists. */
    public UnaryCallSettings.Builder<ListPlannableUserListsRequest, ListPlannableUserListsResponse>
        listPlannableUserListsSettings() {
      return listPlannableUserListsSettings;
    }

    @Override
    public ReachPlanServiceStubSettings build() throws IOException {
      return new ReachPlanServiceStubSettings(this);
    }
  }
}
