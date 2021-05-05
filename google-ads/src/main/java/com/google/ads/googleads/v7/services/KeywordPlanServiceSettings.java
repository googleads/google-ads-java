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

package com.google.ads.googleads.v7.services;

import com.google.ads.googleads.v7.resources.KeywordPlan;
import com.google.ads.googleads.v7.services.stub.KeywordPlanServiceStubSettings;
import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
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
 * Settings class to configure an instance of {@link KeywordPlanServiceClient}.
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
 * <p>For example, to set the total timeout of getKeywordPlan to 30 seconds:
 *
 * <pre>{@code
 * KeywordPlanServiceSettings.Builder keywordPlanServiceSettingsBuilder =
 *     KeywordPlanServiceSettings.newBuilder();
 * keywordPlanServiceSettingsBuilder
 *     .getKeywordPlanSettings()
 *     .setRetrySettings(
 *         keywordPlanServiceSettingsBuilder
 *             .getKeywordPlanSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * KeywordPlanServiceSettings keywordPlanServiceSettings =
 *     keywordPlanServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class KeywordPlanServiceSettings extends ClientSettings<KeywordPlanServiceSettings> {

  /** Returns the object with the settings used for calls to getKeywordPlan. */
  public UnaryCallSettings<GetKeywordPlanRequest, KeywordPlan> getKeywordPlanSettings() {
    return ((KeywordPlanServiceStubSettings) getStubSettings()).getKeywordPlanSettings();
  }

  /** Returns the object with the settings used for calls to mutateKeywordPlans. */
  public UnaryCallSettings<MutateKeywordPlansRequest, MutateKeywordPlansResponse>
      mutateKeywordPlansSettings() {
    return ((KeywordPlanServiceStubSettings) getStubSettings()).mutateKeywordPlansSettings();
  }

  /** Returns the object with the settings used for calls to generateForecastCurve. */
  public UnaryCallSettings<GenerateForecastCurveRequest, GenerateForecastCurveResponse>
      generateForecastCurveSettings() {
    return ((KeywordPlanServiceStubSettings) getStubSettings()).generateForecastCurveSettings();
  }

  /** Returns the object with the settings used for calls to generateForecastTimeSeries. */
  public UnaryCallSettings<GenerateForecastTimeSeriesRequest, GenerateForecastTimeSeriesResponse>
      generateForecastTimeSeriesSettings() {
    return ((KeywordPlanServiceStubSettings) getStubSettings())
        .generateForecastTimeSeriesSettings();
  }

  /** Returns the object with the settings used for calls to generateForecastMetrics. */
  public UnaryCallSettings<GenerateForecastMetricsRequest, GenerateForecastMetricsResponse>
      generateForecastMetricsSettings() {
    return ((KeywordPlanServiceStubSettings) getStubSettings()).generateForecastMetricsSettings();
  }

  /** Returns the object with the settings used for calls to generateHistoricalMetrics. */
  public UnaryCallSettings<GenerateHistoricalMetricsRequest, GenerateHistoricalMetricsResponse>
      generateHistoricalMetricsSettings() {
    return ((KeywordPlanServiceStubSettings) getStubSettings()).generateHistoricalMetricsSettings();
  }

  public static final KeywordPlanServiceSettings create(KeywordPlanServiceStubSettings stub)
      throws IOException {
    return new KeywordPlanServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return KeywordPlanServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return KeywordPlanServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return KeywordPlanServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return KeywordPlanServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return KeywordPlanServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return KeywordPlanServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return KeywordPlanServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected KeywordPlanServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for KeywordPlanServiceSettings. */
  public static class Builder extends ClientSettings.Builder<KeywordPlanServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(KeywordPlanServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(KeywordPlanServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(KeywordPlanServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(KeywordPlanServiceStubSettings.newBuilder());
    }

    public KeywordPlanServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((KeywordPlanServiceStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
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

    /** Returns the builder for the settings used for calls to getKeywordPlan. */
    public UnaryCallSettings.Builder<GetKeywordPlanRequest, KeywordPlan> getKeywordPlanSettings() {
      return getStubSettingsBuilder().getKeywordPlanSettings();
    }

    /** Returns the builder for the settings used for calls to mutateKeywordPlans. */
    public UnaryCallSettings.Builder<MutateKeywordPlansRequest, MutateKeywordPlansResponse>
        mutateKeywordPlansSettings() {
      return getStubSettingsBuilder().mutateKeywordPlansSettings();
    }

    /** Returns the builder for the settings used for calls to generateForecastCurve. */
    public UnaryCallSettings.Builder<GenerateForecastCurveRequest, GenerateForecastCurveResponse>
        generateForecastCurveSettings() {
      return getStubSettingsBuilder().generateForecastCurveSettings();
    }

    /** Returns the builder for the settings used for calls to generateForecastTimeSeries. */
    public UnaryCallSettings.Builder<
            GenerateForecastTimeSeriesRequest, GenerateForecastTimeSeriesResponse>
        generateForecastTimeSeriesSettings() {
      return getStubSettingsBuilder().generateForecastTimeSeriesSettings();
    }

    /** Returns the builder for the settings used for calls to generateForecastMetrics. */
    public UnaryCallSettings.Builder<
            GenerateForecastMetricsRequest, GenerateForecastMetricsResponse>
        generateForecastMetricsSettings() {
      return getStubSettingsBuilder().generateForecastMetricsSettings();
    }

    /** Returns the builder for the settings used for calls to generateHistoricalMetrics. */
    public UnaryCallSettings.Builder<
            GenerateHistoricalMetricsRequest, GenerateHistoricalMetricsResponse>
        generateHistoricalMetricsSettings() {
      return getStubSettingsBuilder().generateHistoricalMetricsSettings();
    }

    @Override
    public KeywordPlanServiceSettings build() throws IOException {
      return new KeywordPlanServiceSettings(this);
    }
  }
}
