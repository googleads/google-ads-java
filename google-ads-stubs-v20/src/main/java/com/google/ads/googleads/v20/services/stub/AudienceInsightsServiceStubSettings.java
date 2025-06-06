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

import com.google.ads.googleads.v20.services.GenerateAudienceCompositionInsightsRequest;
import com.google.ads.googleads.v20.services.GenerateAudienceCompositionInsightsResponse;
import com.google.ads.googleads.v20.services.GenerateAudienceOverlapInsightsRequest;
import com.google.ads.googleads.v20.services.GenerateAudienceOverlapInsightsResponse;
import com.google.ads.googleads.v20.services.GenerateInsightsFinderReportRequest;
import com.google.ads.googleads.v20.services.GenerateInsightsFinderReportResponse;
import com.google.ads.googleads.v20.services.GenerateSuggestedTargetingInsightsRequest;
import com.google.ads.googleads.v20.services.GenerateSuggestedTargetingInsightsResponse;
import com.google.ads.googleads.v20.services.GenerateTargetingSuggestionMetricsRequest;
import com.google.ads.googleads.v20.services.GenerateTargetingSuggestionMetricsResponse;
import com.google.ads.googleads.v20.services.ListAudienceInsightsAttributesRequest;
import com.google.ads.googleads.v20.services.ListAudienceInsightsAttributesResponse;
import com.google.ads.googleads.v20.services.ListInsightsEligibleDatesRequest;
import com.google.ads.googleads.v20.services.ListInsightsEligibleDatesResponse;
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
 * Settings class to configure an instance of {@link AudienceInsightsServiceStub}.
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
 * of generateInsightsFinderReport:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AudienceInsightsServiceStubSettings.Builder audienceInsightsServiceSettingsBuilder =
 *     AudienceInsightsServiceStubSettings.newBuilder();
 * audienceInsightsServiceSettingsBuilder
 *     .generateInsightsFinderReportSettings()
 *     .setRetrySettings(
 *         audienceInsightsServiceSettingsBuilder
 *             .generateInsightsFinderReportSettings()
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
 * AudienceInsightsServiceStubSettings audienceInsightsServiceSettings =
 *     audienceInsightsServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class AudienceInsightsServiceStubSettings
    extends StubSettings<AudienceInsightsServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/adwords").build();

  private final UnaryCallSettings<
          GenerateInsightsFinderReportRequest, GenerateInsightsFinderReportResponse>
      generateInsightsFinderReportSettings;
  private final UnaryCallSettings<
          ListAudienceInsightsAttributesRequest, ListAudienceInsightsAttributesResponse>
      listAudienceInsightsAttributesSettings;
  private final UnaryCallSettings<
          ListInsightsEligibleDatesRequest, ListInsightsEligibleDatesResponse>
      listInsightsEligibleDatesSettings;
  private final UnaryCallSettings<
          GenerateAudienceCompositionInsightsRequest, GenerateAudienceCompositionInsightsResponse>
      generateAudienceCompositionInsightsSettings;
  private final UnaryCallSettings<
          GenerateSuggestedTargetingInsightsRequest, GenerateSuggestedTargetingInsightsResponse>
      generateSuggestedTargetingInsightsSettings;
  private final UnaryCallSettings<
          GenerateAudienceOverlapInsightsRequest, GenerateAudienceOverlapInsightsResponse>
      generateAudienceOverlapInsightsSettings;
  private final UnaryCallSettings<
          GenerateTargetingSuggestionMetricsRequest, GenerateTargetingSuggestionMetricsResponse>
      generateTargetingSuggestionMetricsSettings;

  /** Returns the object with the settings used for calls to generateInsightsFinderReport. */
  public UnaryCallSettings<
          GenerateInsightsFinderReportRequest, GenerateInsightsFinderReportResponse>
      generateInsightsFinderReportSettings() {
    return generateInsightsFinderReportSettings;
  }

  /** Returns the object with the settings used for calls to listAudienceInsightsAttributes. */
  public UnaryCallSettings<
          ListAudienceInsightsAttributesRequest, ListAudienceInsightsAttributesResponse>
      listAudienceInsightsAttributesSettings() {
    return listAudienceInsightsAttributesSettings;
  }

  /** Returns the object with the settings used for calls to listInsightsEligibleDates. */
  public UnaryCallSettings<ListInsightsEligibleDatesRequest, ListInsightsEligibleDatesResponse>
      listInsightsEligibleDatesSettings() {
    return listInsightsEligibleDatesSettings;
  }

  /** Returns the object with the settings used for calls to generateAudienceCompositionInsights. */
  public UnaryCallSettings<
          GenerateAudienceCompositionInsightsRequest, GenerateAudienceCompositionInsightsResponse>
      generateAudienceCompositionInsightsSettings() {
    return generateAudienceCompositionInsightsSettings;
  }

  /** Returns the object with the settings used for calls to generateSuggestedTargetingInsights. */
  public UnaryCallSettings<
          GenerateSuggestedTargetingInsightsRequest, GenerateSuggestedTargetingInsightsResponse>
      generateSuggestedTargetingInsightsSettings() {
    return generateSuggestedTargetingInsightsSettings;
  }

  /** Returns the object with the settings used for calls to generateAudienceOverlapInsights. */
  public UnaryCallSettings<
          GenerateAudienceOverlapInsightsRequest, GenerateAudienceOverlapInsightsResponse>
      generateAudienceOverlapInsightsSettings() {
    return generateAudienceOverlapInsightsSettings;
  }

  /** Returns the object with the settings used for calls to generateTargetingSuggestionMetrics. */
  public UnaryCallSettings<
          GenerateTargetingSuggestionMetricsRequest, GenerateTargetingSuggestionMetricsResponse>
      generateTargetingSuggestionMetricsSettings() {
    return generateTargetingSuggestionMetricsSettings;
  }

  public AudienceInsightsServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcAudienceInsightsServiceStub.create(this);
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
            "gapic", GaxProperties.getLibraryVersion(AudienceInsightsServiceStubSettings.class))
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

  protected AudienceInsightsServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    generateInsightsFinderReportSettings =
        settingsBuilder.generateInsightsFinderReportSettings().build();
    listAudienceInsightsAttributesSettings =
        settingsBuilder.listAudienceInsightsAttributesSettings().build();
    listInsightsEligibleDatesSettings = settingsBuilder.listInsightsEligibleDatesSettings().build();
    generateAudienceCompositionInsightsSettings =
        settingsBuilder.generateAudienceCompositionInsightsSettings().build();
    generateSuggestedTargetingInsightsSettings =
        settingsBuilder.generateSuggestedTargetingInsightsSettings().build();
    generateAudienceOverlapInsightsSettings =
        settingsBuilder.generateAudienceOverlapInsightsSettings().build();
    generateTargetingSuggestionMetricsSettings =
        settingsBuilder.generateTargetingSuggestionMetricsSettings().build();
  }

  /** Builder for AudienceInsightsServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<AudienceInsightsServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<
            GenerateInsightsFinderReportRequest, GenerateInsightsFinderReportResponse>
        generateInsightsFinderReportSettings;
    private final UnaryCallSettings.Builder<
            ListAudienceInsightsAttributesRequest, ListAudienceInsightsAttributesResponse>
        listAudienceInsightsAttributesSettings;
    private final UnaryCallSettings.Builder<
            ListInsightsEligibleDatesRequest, ListInsightsEligibleDatesResponse>
        listInsightsEligibleDatesSettings;
    private final UnaryCallSettings.Builder<
            GenerateAudienceCompositionInsightsRequest, GenerateAudienceCompositionInsightsResponse>
        generateAudienceCompositionInsightsSettings;
    private final UnaryCallSettings.Builder<
            GenerateSuggestedTargetingInsightsRequest, GenerateSuggestedTargetingInsightsResponse>
        generateSuggestedTargetingInsightsSettings;
    private final UnaryCallSettings.Builder<
            GenerateAudienceOverlapInsightsRequest, GenerateAudienceOverlapInsightsResponse>
        generateAudienceOverlapInsightsSettings;
    private final UnaryCallSettings.Builder<
            GenerateTargetingSuggestionMetricsRequest, GenerateTargetingSuggestionMetricsResponse>
        generateTargetingSuggestionMetricsSettings;
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

      generateInsightsFinderReportSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listAudienceInsightsAttributesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listInsightsEligibleDatesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      generateAudienceCompositionInsightsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      generateSuggestedTargetingInsightsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      generateAudienceOverlapInsightsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      generateTargetingSuggestionMetricsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              generateInsightsFinderReportSettings,
              listAudienceInsightsAttributesSettings,
              listInsightsEligibleDatesSettings,
              generateAudienceCompositionInsightsSettings,
              generateSuggestedTargetingInsightsSettings,
              generateAudienceOverlapInsightsSettings,
              generateTargetingSuggestionMetricsSettings);
      initDefaults(this);
    }

    protected Builder(AudienceInsightsServiceStubSettings settings) {
      super(settings);

      generateInsightsFinderReportSettings =
          settings.generateInsightsFinderReportSettings.toBuilder();
      listAudienceInsightsAttributesSettings =
          settings.listAudienceInsightsAttributesSettings.toBuilder();
      listInsightsEligibleDatesSettings = settings.listInsightsEligibleDatesSettings.toBuilder();
      generateAudienceCompositionInsightsSettings =
          settings.generateAudienceCompositionInsightsSettings.toBuilder();
      generateSuggestedTargetingInsightsSettings =
          settings.generateSuggestedTargetingInsightsSettings.toBuilder();
      generateAudienceOverlapInsightsSettings =
          settings.generateAudienceOverlapInsightsSettings.toBuilder();
      generateTargetingSuggestionMetricsSettings =
          settings.generateTargetingSuggestionMetricsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              generateInsightsFinderReportSettings,
              listAudienceInsightsAttributesSettings,
              listInsightsEligibleDatesSettings,
              generateAudienceCompositionInsightsSettings,
              generateSuggestedTargetingInsightsSettings,
              generateAudienceOverlapInsightsSettings,
              generateTargetingSuggestionMetricsSettings);
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
          .generateInsightsFinderReportSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listAudienceInsightsAttributesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listInsightsEligibleDatesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .generateAudienceCompositionInsightsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .generateSuggestedTargetingInsightsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .generateAudienceOverlapInsightsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .generateTargetingSuggestionMetricsSettings()
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

    /** Returns the builder for the settings used for calls to generateInsightsFinderReport. */
    public UnaryCallSettings.Builder<
            GenerateInsightsFinderReportRequest, GenerateInsightsFinderReportResponse>
        generateInsightsFinderReportSettings() {
      return generateInsightsFinderReportSettings;
    }

    /** Returns the builder for the settings used for calls to listAudienceInsightsAttributes. */
    public UnaryCallSettings.Builder<
            ListAudienceInsightsAttributesRequest, ListAudienceInsightsAttributesResponse>
        listAudienceInsightsAttributesSettings() {
      return listAudienceInsightsAttributesSettings;
    }

    /** Returns the builder for the settings used for calls to listInsightsEligibleDates. */
    public UnaryCallSettings.Builder<
            ListInsightsEligibleDatesRequest, ListInsightsEligibleDatesResponse>
        listInsightsEligibleDatesSettings() {
      return listInsightsEligibleDatesSettings;
    }

    /**
     * Returns the builder for the settings used for calls to generateAudienceCompositionInsights.
     */
    public UnaryCallSettings.Builder<
            GenerateAudienceCompositionInsightsRequest, GenerateAudienceCompositionInsightsResponse>
        generateAudienceCompositionInsightsSettings() {
      return generateAudienceCompositionInsightsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to generateSuggestedTargetingInsights.
     */
    public UnaryCallSettings.Builder<
            GenerateSuggestedTargetingInsightsRequest, GenerateSuggestedTargetingInsightsResponse>
        generateSuggestedTargetingInsightsSettings() {
      return generateSuggestedTargetingInsightsSettings;
    }

    /** Returns the builder for the settings used for calls to generateAudienceOverlapInsights. */
    public UnaryCallSettings.Builder<
            GenerateAudienceOverlapInsightsRequest, GenerateAudienceOverlapInsightsResponse>
        generateAudienceOverlapInsightsSettings() {
      return generateAudienceOverlapInsightsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to generateTargetingSuggestionMetrics.
     */
    public UnaryCallSettings.Builder<
            GenerateTargetingSuggestionMetricsRequest, GenerateTargetingSuggestionMetricsResponse>
        generateTargetingSuggestionMetricsSettings() {
      return generateTargetingSuggestionMetricsSettings;
    }

    @Override
    public AudienceInsightsServiceStubSettings build() throws IOException {
      return new AudienceInsightsServiceStubSettings(this);
    }
  }
}
