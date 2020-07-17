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
package com.google.ads.googleads.v4.services.stub;

import com.google.ads.googleads.v4.resources.AdGroupCriterionLabel;
import com.google.ads.googleads.v4.services.GetAdGroupCriterionLabelRequest;
import com.google.ads.googleads.v4.services.MutateAdGroupCriterionLabelsRequest;
import com.google.ads.googleads.v4.services.MutateAdGroupCriterionLabelsResponse;
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

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link AdGroupCriterionLabelServiceStub}.
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
 * <p>For example, to set the total timeout of getAdGroupCriterionLabel to 30 seconds:
 *
 * <pre>
 * <code>
 * AdGroupCriterionLabelServiceStubSettings.Builder adGroupCriterionLabelServiceSettingsBuilder =
 *     AdGroupCriterionLabelServiceStubSettings.newBuilder();
 * adGroupCriterionLabelServiceSettingsBuilder
 *     .getAdGroupCriterionLabelSettings()
 *     .setRetrySettings(
 *         adGroupCriterionLabelServiceSettingsBuilder.getAdGroupCriterionLabelSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * AdGroupCriterionLabelServiceStubSettings adGroupCriterionLabelServiceSettings = adGroupCriterionLabelServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AdGroupCriterionLabelServiceStubSettings
    extends StubSettings<AdGroupCriterionLabelServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().build();

  private final UnaryCallSettings<GetAdGroupCriterionLabelRequest, AdGroupCriterionLabel>
      getAdGroupCriterionLabelSettings;
  private final UnaryCallSettings<
          MutateAdGroupCriterionLabelsRequest, MutateAdGroupCriterionLabelsResponse>
      mutateAdGroupCriterionLabelsSettings;

  /** Returns the object with the settings used for calls to getAdGroupCriterionLabel. */
  public UnaryCallSettings<GetAdGroupCriterionLabelRequest, AdGroupCriterionLabel>
      getAdGroupCriterionLabelSettings() {
    return getAdGroupCriterionLabelSettings;
  }

  /** Returns the object with the settings used for calls to mutateAdGroupCriterionLabels. */
  public UnaryCallSettings<
          MutateAdGroupCriterionLabelsRequest, MutateAdGroupCriterionLabelsResponse>
      mutateAdGroupCriterionLabelsSettings() {
    return mutateAdGroupCriterionLabelsSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AdGroupCriterionLabelServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcAdGroupCriterionLabelServiceStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "googleads.googleapis.com:443";
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
            "gapic",
            GaxProperties.getLibraryVersion(AdGroupCriterionLabelServiceStubSettings.class))
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

  protected AdGroupCriterionLabelServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    getAdGroupCriterionLabelSettings = settingsBuilder.getAdGroupCriterionLabelSettings().build();
    mutateAdGroupCriterionLabelsSettings =
        settingsBuilder.mutateAdGroupCriterionLabelsSettings().build();
  }

  /** Builder for AdGroupCriterionLabelServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<AdGroupCriterionLabelServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<GetAdGroupCriterionLabelRequest, AdGroupCriterionLabel>
        getAdGroupCriterionLabelSettings;
    private final UnaryCallSettings.Builder<
            MutateAdGroupCriterionLabelsRequest, MutateAdGroupCriterionLabelsResponse>
        mutateAdGroupCriterionLabelsSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
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
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      getAdGroupCriterionLabelSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      mutateAdGroupCriterionLabelsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getAdGroupCriterionLabelSettings, mutateAdGroupCriterionLabelsSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .getAdGroupCriterionLabelSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .mutateAdGroupCriterionLabelsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(AdGroupCriterionLabelServiceStubSettings settings) {
      super(settings);

      getAdGroupCriterionLabelSettings = settings.getAdGroupCriterionLabelSettings.toBuilder();
      mutateAdGroupCriterionLabelsSettings =
          settings.mutateAdGroupCriterionLabelsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getAdGroupCriterionLabelSettings, mutateAdGroupCriterionLabelsSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
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

    /** Returns the builder for the settings used for calls to getAdGroupCriterionLabel. */
    public UnaryCallSettings.Builder<GetAdGroupCriterionLabelRequest, AdGroupCriterionLabel>
        getAdGroupCriterionLabelSettings() {
      return getAdGroupCriterionLabelSettings;
    }

    /** Returns the builder for the settings used for calls to mutateAdGroupCriterionLabels. */
    public UnaryCallSettings.Builder<
            MutateAdGroupCriterionLabelsRequest, MutateAdGroupCriterionLabelsResponse>
        mutateAdGroupCriterionLabelsSettings() {
      return mutateAdGroupCriterionLabelsSettings;
    }

    @Override
    public AdGroupCriterionLabelServiceStubSettings build() throws IOException {
      return new AdGroupCriterionLabelServiceStubSettings(this);
    }
  }
}
