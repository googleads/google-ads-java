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
package com.google.ads.googleads.v3.services;

import com.google.ads.googleads.v3.resources.FeedPlaceholderView;
import com.google.ads.googleads.v3.services.stub.FeedPlaceholderViewServiceStubSettings;
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
 * Settings class to configure an instance of {@link FeedPlaceholderViewServiceClient}.
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
 * <p>For example, to set the total timeout of getFeedPlaceholderView to 30 seconds:
 *
 * <pre>
 * <code>
 * FeedPlaceholderViewServiceSettings.Builder feedPlaceholderViewServiceSettingsBuilder =
 *     FeedPlaceholderViewServiceSettings.newBuilder();
 * feedPlaceholderViewServiceSettingsBuilder
 *     .getFeedPlaceholderViewSettings()
 *     .setRetrySettings(
 *         feedPlaceholderViewServiceSettingsBuilder.getFeedPlaceholderViewSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * FeedPlaceholderViewServiceSettings feedPlaceholderViewServiceSettings = feedPlaceholderViewServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class FeedPlaceholderViewServiceSettings
    extends ClientSettings<FeedPlaceholderViewServiceSettings> {
  /** Returns the object with the settings used for calls to getFeedPlaceholderView. */
  public UnaryCallSettings<GetFeedPlaceholderViewRequest, FeedPlaceholderView>
      getFeedPlaceholderViewSettings() {
    return ((FeedPlaceholderViewServiceStubSettings) getStubSettings())
        .getFeedPlaceholderViewSettings();
  }

  public static final FeedPlaceholderViewServiceSettings create(
      FeedPlaceholderViewServiceStubSettings stub) throws IOException {
    return new FeedPlaceholderViewServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return FeedPlaceholderViewServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return FeedPlaceholderViewServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return FeedPlaceholderViewServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return FeedPlaceholderViewServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return FeedPlaceholderViewServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return FeedPlaceholderViewServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return FeedPlaceholderViewServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected FeedPlaceholderViewServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for FeedPlaceholderViewServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<FeedPlaceholderViewServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(FeedPlaceholderViewServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(FeedPlaceholderViewServiceStubSettings.newBuilder());
    }

    protected Builder(FeedPlaceholderViewServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(FeedPlaceholderViewServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public FeedPlaceholderViewServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((FeedPlaceholderViewServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to getFeedPlaceholderView. */
    public UnaryCallSettings.Builder<GetFeedPlaceholderViewRequest, FeedPlaceholderView>
        getFeedPlaceholderViewSettings() {
      return getStubSettingsBuilder().getFeedPlaceholderViewSettings();
    }

    @Override
    public FeedPlaceholderViewServiceSettings build() throws IOException {
      return new FeedPlaceholderViewServiceSettings(this);
    }
  }
}
