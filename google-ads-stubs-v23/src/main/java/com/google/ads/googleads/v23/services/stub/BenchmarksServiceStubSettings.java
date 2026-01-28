/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v23.services.stub;

import com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsRequest;
import com.google.ads.googleads.v23.services.GenerateBenchmarksMetricsResponse;
import com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesRequest;
import com.google.ads.googleads.v23.services.ListBenchmarksAvailableDatesResponse;
import com.google.ads.googleads.v23.services.ListBenchmarksLocationsRequest;
import com.google.ads.googleads.v23.services.ListBenchmarksLocationsResponse;
import com.google.ads.googleads.v23.services.ListBenchmarksProductsRequest;
import com.google.ads.googleads.v23.services.ListBenchmarksProductsResponse;
import com.google.ads.googleads.v23.services.ListBenchmarksSourcesRequest;
import com.google.ads.googleads.v23.services.ListBenchmarksSourcesResponse;
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
 * Settings class to configure an instance of {@link BenchmarksServiceStub}.
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
 * of listBenchmarksAvailableDates:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * BenchmarksServiceStubSettings.Builder benchmarksServiceSettingsBuilder =
 *     BenchmarksServiceStubSettings.newBuilder();
 * benchmarksServiceSettingsBuilder
 *     .listBenchmarksAvailableDatesSettings()
 *     .setRetrySettings(
 *         benchmarksServiceSettingsBuilder
 *             .listBenchmarksAvailableDatesSettings()
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
 * BenchmarksServiceStubSettings benchmarksServiceSettings =
 *     benchmarksServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://docs.cloud.google.com/java/docs/client-retries) for additional support in setting
 * retries.
 */
@Generated("by gapic-generator-java")
public class BenchmarksServiceStubSettings extends StubSettings<BenchmarksServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/adwords").build();

  private final UnaryCallSettings<
          ListBenchmarksAvailableDatesRequest, ListBenchmarksAvailableDatesResponse>
      listBenchmarksAvailableDatesSettings;
  private final UnaryCallSettings<ListBenchmarksLocationsRequest, ListBenchmarksLocationsResponse>
      listBenchmarksLocationsSettings;
  private final UnaryCallSettings<ListBenchmarksProductsRequest, ListBenchmarksProductsResponse>
      listBenchmarksProductsSettings;
  private final UnaryCallSettings<ListBenchmarksSourcesRequest, ListBenchmarksSourcesResponse>
      listBenchmarksSourcesSettings;
  private final UnaryCallSettings<
          GenerateBenchmarksMetricsRequest, GenerateBenchmarksMetricsResponse>
      generateBenchmarksMetricsSettings;

  /** Returns the object with the settings used for calls to listBenchmarksAvailableDates. */
  public UnaryCallSettings<
          ListBenchmarksAvailableDatesRequest, ListBenchmarksAvailableDatesResponse>
      listBenchmarksAvailableDatesSettings() {
    return listBenchmarksAvailableDatesSettings;
  }

  /** Returns the object with the settings used for calls to listBenchmarksLocations. */
  public UnaryCallSettings<ListBenchmarksLocationsRequest, ListBenchmarksLocationsResponse>
      listBenchmarksLocationsSettings() {
    return listBenchmarksLocationsSettings;
  }

  /** Returns the object with the settings used for calls to listBenchmarksProducts. */
  public UnaryCallSettings<ListBenchmarksProductsRequest, ListBenchmarksProductsResponse>
      listBenchmarksProductsSettings() {
    return listBenchmarksProductsSettings;
  }

  /** Returns the object with the settings used for calls to listBenchmarksSources. */
  public UnaryCallSettings<ListBenchmarksSourcesRequest, ListBenchmarksSourcesResponse>
      listBenchmarksSourcesSettings() {
    return listBenchmarksSourcesSettings;
  }

  /** Returns the object with the settings used for calls to generateBenchmarksMetrics. */
  public UnaryCallSettings<GenerateBenchmarksMetricsRequest, GenerateBenchmarksMetricsResponse>
      generateBenchmarksMetricsSettings() {
    return generateBenchmarksMetricsSettings;
  }

  public BenchmarksServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcBenchmarksServiceStub.create(this);
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
            "gapic", GaxProperties.getLibraryVersion(BenchmarksServiceStubSettings.class))
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

  protected BenchmarksServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listBenchmarksAvailableDatesSettings =
        settingsBuilder.listBenchmarksAvailableDatesSettings().build();
    listBenchmarksLocationsSettings = settingsBuilder.listBenchmarksLocationsSettings().build();
    listBenchmarksProductsSettings = settingsBuilder.listBenchmarksProductsSettings().build();
    listBenchmarksSourcesSettings = settingsBuilder.listBenchmarksSourcesSettings().build();
    generateBenchmarksMetricsSettings = settingsBuilder.generateBenchmarksMetricsSettings().build();
  }

  /** Builder for BenchmarksServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<BenchmarksServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<
            ListBenchmarksAvailableDatesRequest, ListBenchmarksAvailableDatesResponse>
        listBenchmarksAvailableDatesSettings;
    private final UnaryCallSettings.Builder<
            ListBenchmarksLocationsRequest, ListBenchmarksLocationsResponse>
        listBenchmarksLocationsSettings;
    private final UnaryCallSettings.Builder<
            ListBenchmarksProductsRequest, ListBenchmarksProductsResponse>
        listBenchmarksProductsSettings;
    private final UnaryCallSettings.Builder<
            ListBenchmarksSourcesRequest, ListBenchmarksSourcesResponse>
        listBenchmarksSourcesSettings;
    private final UnaryCallSettings.Builder<
            GenerateBenchmarksMetricsRequest, GenerateBenchmarksMetricsResponse>
        generateBenchmarksMetricsSettings;
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

      listBenchmarksAvailableDatesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listBenchmarksLocationsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listBenchmarksProductsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listBenchmarksSourcesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      generateBenchmarksMetricsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listBenchmarksAvailableDatesSettings,
              listBenchmarksLocationsSettings,
              listBenchmarksProductsSettings,
              listBenchmarksSourcesSettings,
              generateBenchmarksMetricsSettings);
      initDefaults(this);
    }

    protected Builder(BenchmarksServiceStubSettings settings) {
      super(settings);

      listBenchmarksAvailableDatesSettings =
          settings.listBenchmarksAvailableDatesSettings.toBuilder();
      listBenchmarksLocationsSettings = settings.listBenchmarksLocationsSettings.toBuilder();
      listBenchmarksProductsSettings = settings.listBenchmarksProductsSettings.toBuilder();
      listBenchmarksSourcesSettings = settings.listBenchmarksSourcesSettings.toBuilder();
      generateBenchmarksMetricsSettings = settings.generateBenchmarksMetricsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listBenchmarksAvailableDatesSettings,
              listBenchmarksLocationsSettings,
              listBenchmarksProductsSettings,
              listBenchmarksSourcesSettings,
              generateBenchmarksMetricsSettings);
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
          .listBenchmarksAvailableDatesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listBenchmarksLocationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listBenchmarksProductsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listBenchmarksSourcesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .generateBenchmarksMetricsSettings()
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

    /** Returns the builder for the settings used for calls to listBenchmarksAvailableDates. */
    public UnaryCallSettings.Builder<
            ListBenchmarksAvailableDatesRequest, ListBenchmarksAvailableDatesResponse>
        listBenchmarksAvailableDatesSettings() {
      return listBenchmarksAvailableDatesSettings;
    }

    /** Returns the builder for the settings used for calls to listBenchmarksLocations. */
    public UnaryCallSettings.Builder<
            ListBenchmarksLocationsRequest, ListBenchmarksLocationsResponse>
        listBenchmarksLocationsSettings() {
      return listBenchmarksLocationsSettings;
    }

    /** Returns the builder for the settings used for calls to listBenchmarksProducts. */
    public UnaryCallSettings.Builder<ListBenchmarksProductsRequest, ListBenchmarksProductsResponse>
        listBenchmarksProductsSettings() {
      return listBenchmarksProductsSettings;
    }

    /** Returns the builder for the settings used for calls to listBenchmarksSources. */
    public UnaryCallSettings.Builder<ListBenchmarksSourcesRequest, ListBenchmarksSourcesResponse>
        listBenchmarksSourcesSettings() {
      return listBenchmarksSourcesSettings;
    }

    /** Returns the builder for the settings used for calls to generateBenchmarksMetrics. */
    public UnaryCallSettings.Builder<
            GenerateBenchmarksMetricsRequest, GenerateBenchmarksMetricsResponse>
        generateBenchmarksMetricsSettings() {
      return generateBenchmarksMetricsSettings;
    }

    @Override
    public BenchmarksServiceStubSettings build() throws IOException {
      return new BenchmarksServiceStubSettings(this);
    }
  }
}
