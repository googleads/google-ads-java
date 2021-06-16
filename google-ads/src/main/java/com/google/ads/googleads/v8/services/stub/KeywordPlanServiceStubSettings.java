/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v8.services.stub;

import com.google.ads.googleads.v8.resources.KeywordPlan;
import com.google.ads.googleads.v8.services.GenerateForecastCurveRequest;
import com.google.ads.googleads.v8.services.GenerateForecastCurveResponse;
import com.google.ads.googleads.v8.services.GenerateForecastMetricsRequest;
import com.google.ads.googleads.v8.services.GenerateForecastMetricsResponse;
import com.google.ads.googleads.v8.services.GenerateForecastTimeSeriesRequest;
import com.google.ads.googleads.v8.services.GenerateForecastTimeSeriesResponse;
import com.google.ads.googleads.v8.services.GenerateHistoricalMetricsRequest;
import com.google.ads.googleads.v8.services.GenerateHistoricalMetricsResponse;
import com.google.ads.googleads.v8.services.GetKeywordPlanRequest;
import com.google.ads.googleads.v8.services.MutateKeywordPlansRequest;
import com.google.ads.googleads.v8.services.MutateKeywordPlansResponse;
import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
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
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link KeywordPlanServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (googleads.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getKeywordPlan to 30 seconds:
 *
 * <pre>{@code
 * KeywordPlanServiceStubSettings.Builder keywordPlanServiceSettingsBuilder =
 *     KeywordPlanServiceStubSettings.newBuilder();
 * keywordPlanServiceSettingsBuilder
 *     .getKeywordPlanSettings()
 *     .setRetrySettings(
 *         keywordPlanServiceSettingsBuilder
 *             .getKeywordPlanSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * KeywordPlanServiceStubSettings keywordPlanServiceSettings =
 *     keywordPlanServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class KeywordPlanServiceStubSettings extends StubSettings<KeywordPlanServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/adwords").build();

  private final UnaryCallSettings<GetKeywordPlanRequest, KeywordPlan> getKeywordPlanSettings;
  private final UnaryCallSettings<MutateKeywordPlansRequest, MutateKeywordPlansResponse>
      mutateKeywordPlansSettings;
  private final UnaryCallSettings<GenerateForecastCurveRequest, GenerateForecastCurveResponse>
      generateForecastCurveSettings;
  private final UnaryCallSettings<
          GenerateForecastTimeSeriesRequest, GenerateForecastTimeSeriesResponse>
      generateForecastTimeSeriesSettings;
  private final UnaryCallSettings<GenerateForecastMetricsRequest, GenerateForecastMetricsResponse>
      generateForecastMetricsSettings;
  private final UnaryCallSettings<
          GenerateHistoricalMetricsRequest, GenerateHistoricalMetricsResponse>
      generateHistoricalMetricsSettings;

  /** Returns the object with the settings used for calls to getKeywordPlan. */
  public UnaryCallSettings<GetKeywordPlanRequest, KeywordPlan> getKeywordPlanSettings() {
    return getKeywordPlanSettings;
  }

  /** Returns the object with the settings used for calls to mutateKeywordPlans. */
  public UnaryCallSettings<MutateKeywordPlansRequest, MutateKeywordPlansResponse>
      mutateKeywordPlansSettings() {
    return mutateKeywordPlansSettings;
  }

  /** Returns the object with the settings used for calls to generateForecastCurve. */
  public UnaryCallSettings<GenerateForecastCurveRequest, GenerateForecastCurveResponse>
      generateForecastCurveSettings() {
    return generateForecastCurveSettings;
  }

  /** Returns the object with the settings used for calls to generateForecastTimeSeries. */
  public UnaryCallSettings<GenerateForecastTimeSeriesRequest, GenerateForecastTimeSeriesResponse>
      generateForecastTimeSeriesSettings() {
    return generateForecastTimeSeriesSettings;
  }

  /** Returns the object with the settings used for calls to generateForecastMetrics. */
  public UnaryCallSettings<GenerateForecastMetricsRequest, GenerateForecastMetricsResponse>
      generateForecastMetricsSettings() {
    return generateForecastMetricsSettings;
  }

  /** Returns the object with the settings used for calls to generateHistoricalMetrics. */
  public UnaryCallSettings<GenerateHistoricalMetricsRequest, GenerateHistoricalMetricsResponse>
      generateHistoricalMetricsSettings() {
    return generateHistoricalMetricsSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public KeywordPlanServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcKeywordPlanServiceStub.create(this);
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
            "gapic", GaxProperties.getLibraryVersion(KeywordPlanServiceStubSettings.class))
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

  protected KeywordPlanServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    getKeywordPlanSettings = settingsBuilder.getKeywordPlanSettings().build();
    mutateKeywordPlansSettings = settingsBuilder.mutateKeywordPlansSettings().build();
    generateForecastCurveSettings = settingsBuilder.generateForecastCurveSettings().build();
    generateForecastTimeSeriesSettings =
        settingsBuilder.generateForecastTimeSeriesSettings().build();
    generateForecastMetricsSettings = settingsBuilder.generateForecastMetricsSettings().build();
    generateHistoricalMetricsSettings = settingsBuilder.generateHistoricalMetricsSettings().build();
  }

  /** Builder for KeywordPlanServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<KeywordPlanServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<GetKeywordPlanRequest, KeywordPlan>
        getKeywordPlanSettings;
    private final UnaryCallSettings.Builder<MutateKeywordPlansRequest, MutateKeywordPlansResponse>
        mutateKeywordPlansSettings;
    private final UnaryCallSettings.Builder<
            GenerateForecastCurveRequest, GenerateForecastCurveResponse>
        generateForecastCurveSettings;
    private final UnaryCallSettings.Builder<
            GenerateForecastTimeSeriesRequest, GenerateForecastTimeSeriesResponse>
        generateForecastTimeSeriesSettings;
    private final UnaryCallSettings.Builder<
            GenerateForecastMetricsRequest, GenerateForecastMetricsResponse>
        generateForecastMetricsSettings;
    private final UnaryCallSettings.Builder<
            GenerateHistoricalMetricsRequest, GenerateHistoricalMetricsResponse>
        generateHistoricalMetricsSettings;
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

      getKeywordPlanSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      mutateKeywordPlansSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      generateForecastCurveSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      generateForecastTimeSeriesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      generateForecastMetricsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      generateHistoricalMetricsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getKeywordPlanSettings,
              mutateKeywordPlansSettings,
              generateForecastCurveSettings,
              generateForecastTimeSeriesSettings,
              generateForecastMetricsSettings,
              generateHistoricalMetricsSettings);
      initDefaults(this);
    }

    protected Builder(KeywordPlanServiceStubSettings settings) {
      super(settings);

      getKeywordPlanSettings = settings.getKeywordPlanSettings.toBuilder();
      mutateKeywordPlansSettings = settings.mutateKeywordPlansSettings.toBuilder();
      generateForecastCurveSettings = settings.generateForecastCurveSettings.toBuilder();
      generateForecastTimeSeriesSettings = settings.generateForecastTimeSeriesSettings.toBuilder();
      generateForecastMetricsSettings = settings.generateForecastMetricsSettings.toBuilder();
      generateHistoricalMetricsSettings = settings.generateHistoricalMetricsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getKeywordPlanSettings,
              mutateKeywordPlansSettings,
              generateForecastCurveSettings,
              generateForecastTimeSeriesSettings,
              generateForecastMetricsSettings,
              generateHistoricalMetricsSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .getKeywordPlanSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .mutateKeywordPlansSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .generateForecastCurveSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .generateForecastTimeSeriesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .generateForecastMetricsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .generateHistoricalMetricsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

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

    /** Returns the builder for the settings used for calls to getKeywordPlan. */
    public UnaryCallSettings.Builder<GetKeywordPlanRequest, KeywordPlan> getKeywordPlanSettings() {
      return getKeywordPlanSettings;
    }

    /** Returns the builder for the settings used for calls to mutateKeywordPlans. */
    public UnaryCallSettings.Builder<MutateKeywordPlansRequest, MutateKeywordPlansResponse>
        mutateKeywordPlansSettings() {
      return mutateKeywordPlansSettings;
    }

    /** Returns the builder for the settings used for calls to generateForecastCurve. */
    public UnaryCallSettings.Builder<GenerateForecastCurveRequest, GenerateForecastCurveResponse>
        generateForecastCurveSettings() {
      return generateForecastCurveSettings;
    }

    /** Returns the builder for the settings used for calls to generateForecastTimeSeries. */
    public UnaryCallSettings.Builder<
            GenerateForecastTimeSeriesRequest, GenerateForecastTimeSeriesResponse>
        generateForecastTimeSeriesSettings() {
      return generateForecastTimeSeriesSettings;
    }

    /** Returns the builder for the settings used for calls to generateForecastMetrics. */
    public UnaryCallSettings.Builder<
            GenerateForecastMetricsRequest, GenerateForecastMetricsResponse>
        generateForecastMetricsSettings() {
      return generateForecastMetricsSettings;
    }

    /** Returns the builder for the settings used for calls to generateHistoricalMetrics. */
    public UnaryCallSettings.Builder<
            GenerateHistoricalMetricsRequest, GenerateHistoricalMetricsResponse>
        generateHistoricalMetricsSettings() {
      return generateHistoricalMetricsSettings;
    }

    @Override
    public KeywordPlanServiceStubSettings build() throws IOException {
      return new KeywordPlanServiceStubSettings(this);
    }
  }
}
