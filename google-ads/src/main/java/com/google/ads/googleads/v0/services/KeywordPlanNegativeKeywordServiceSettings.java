/*
 * Copyright 2019 Google LLC
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
package com.google.ads.googleads.v0.services;

import com.google.ads.googleads.v0.resources.KeywordPlanNegativeKeyword;
import com.google.ads.googleads.v0.services.stub.KeywordPlanNegativeKeywordServiceStubSettings;
import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link KeywordPlanNegativeKeywordServiceClient}.
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
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of getKeywordPlanNegativeKeyword to 30 seconds:
 *
 * <pre>
 * <code>
 * KeywordPlanNegativeKeywordServiceSettings.Builder keywordPlanNegativeKeywordServiceSettingsBuilder =
 *     KeywordPlanNegativeKeywordServiceSettings.newBuilder();
 * keywordPlanNegativeKeywordServiceSettingsBuilder.getKeywordPlanNegativeKeywordSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * KeywordPlanNegativeKeywordServiceSettings keywordPlanNegativeKeywordServiceSettings = keywordPlanNegativeKeywordServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class KeywordPlanNegativeKeywordServiceSettings
    extends ClientSettings<KeywordPlanNegativeKeywordServiceSettings> {
  /** Returns the object with the settings used for calls to getKeywordPlanNegativeKeyword. */
  public UnaryCallSettings<GetKeywordPlanNegativeKeywordRequest, KeywordPlanNegativeKeyword>
      getKeywordPlanNegativeKeywordSettings() {
    return ((KeywordPlanNegativeKeywordServiceStubSettings) getStubSettings())
        .getKeywordPlanNegativeKeywordSettings();
  }

  /** Returns the object with the settings used for calls to mutateKeywordPlanNegativeKeywords. */
  public UnaryCallSettings<
          MutateKeywordPlanNegativeKeywordsRequest, MutateKeywordPlanNegativeKeywordsResponse>
      mutateKeywordPlanNegativeKeywordsSettings() {
    return ((KeywordPlanNegativeKeywordServiceStubSettings) getStubSettings())
        .mutateKeywordPlanNegativeKeywordsSettings();
  }

  public static final KeywordPlanNegativeKeywordServiceSettings create(
      KeywordPlanNegativeKeywordServiceStubSettings stub) throws IOException {
    return new KeywordPlanNegativeKeywordServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return KeywordPlanNegativeKeywordServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return KeywordPlanNegativeKeywordServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return KeywordPlanNegativeKeywordServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return KeywordPlanNegativeKeywordServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return KeywordPlanNegativeKeywordServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return KeywordPlanNegativeKeywordServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return KeywordPlanNegativeKeywordServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected KeywordPlanNegativeKeywordServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for KeywordPlanNegativeKeywordServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<KeywordPlanNegativeKeywordServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(KeywordPlanNegativeKeywordServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(KeywordPlanNegativeKeywordServiceStubSettings.newBuilder());
    }

    protected Builder(KeywordPlanNegativeKeywordServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(KeywordPlanNegativeKeywordServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public KeywordPlanNegativeKeywordServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((KeywordPlanNegativeKeywordServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to getKeywordPlanNegativeKeyword. */
    public UnaryCallSettings.Builder<
            GetKeywordPlanNegativeKeywordRequest, KeywordPlanNegativeKeyword>
        getKeywordPlanNegativeKeywordSettings() {
      return getStubSettingsBuilder().getKeywordPlanNegativeKeywordSettings();
    }

    /** Returns the builder for the settings used for calls to mutateKeywordPlanNegativeKeywords. */
    public UnaryCallSettings.Builder<
            MutateKeywordPlanNegativeKeywordsRequest, MutateKeywordPlanNegativeKeywordsResponse>
        mutateKeywordPlanNegativeKeywordsSettings() {
      return getStubSettingsBuilder().mutateKeywordPlanNegativeKeywordsSettings();
    }

    @Override
    public KeywordPlanNegativeKeywordServiceSettings build() throws IOException {
      return new KeywordPlanNegativeKeywordServiceSettings(this);
    }
  }
}
