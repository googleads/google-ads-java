/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services.stub;

import static com.google.ads.googleads.v6.services.KeywordPlanIdeaServiceClient.GenerateKeywordIdeasPagedResponse;

import com.google.ads.googleads.v6.services.GenerateKeywordIdeaResponse;
import com.google.ads.googleads.v6.services.GenerateKeywordIdeaResult;
import com.google.ads.googleads.v6.services.GenerateKeywordIdeasRequest;
import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
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
 * Settings class to configure an instance of {@link KeywordPlanIdeaServiceStub}.
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
 * <p>For example, to set the total timeout of generateKeywordIdeas to 30 seconds:
 *
 * <pre>{@code
 * KeywordPlanIdeaServiceStubSettings.Builder keywordPlanIdeaServiceSettingsBuilder =
 *     KeywordPlanIdeaServiceStubSettings.newBuilder();
 * keywordPlanIdeaServiceSettingsBuilder
 *     .generateKeywordIdeasSettings()
 *     .setRetrySettings(
 *         keywordPlanIdeaServiceSettingsBuilder
 *             .generateKeywordIdeasSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * KeywordPlanIdeaServiceStubSettings keywordPlanIdeaServiceSettings =
 *     keywordPlanIdeaServiceSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class KeywordPlanIdeaServiceStubSettings
    extends StubSettings<KeywordPlanIdeaServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/adwords").build();

  private final PagedCallSettings<
          GenerateKeywordIdeasRequest,
          GenerateKeywordIdeaResponse,
          GenerateKeywordIdeasPagedResponse>
      generateKeywordIdeasSettings;

  private static final PagedListDescriptor<
          GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse, GenerateKeywordIdeaResult>
      GENERATE_KEYWORD_IDEAS_PAGE_STR_DESC =
          new PagedListDescriptor<
              GenerateKeywordIdeasRequest,
              GenerateKeywordIdeaResponse,
              GenerateKeywordIdeaResult>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public GenerateKeywordIdeasRequest injectToken(
                GenerateKeywordIdeasRequest payload, String token) {
              return GenerateKeywordIdeasRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public GenerateKeywordIdeasRequest injectPageSize(
                GenerateKeywordIdeasRequest payload, int pageSize) {
              return GenerateKeywordIdeasRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(GenerateKeywordIdeasRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(GenerateKeywordIdeaResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<GenerateKeywordIdeaResult> extractResources(
                GenerateKeywordIdeaResponse payload) {
              return payload.getResultsList() == null
                  ? ImmutableList.<GenerateKeywordIdeaResult>of()
                  : payload.getResultsList();
            }
          };

  private static final PagedListResponseFactory<
          GenerateKeywordIdeasRequest,
          GenerateKeywordIdeaResponse,
          GenerateKeywordIdeasPagedResponse>
      GENERATE_KEYWORD_IDEAS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              GenerateKeywordIdeasRequest,
              GenerateKeywordIdeaResponse,
              GenerateKeywordIdeasPagedResponse>() {
            @Override
            public ApiFuture<GenerateKeywordIdeasPagedResponse> getFuturePagedResponse(
                UnaryCallable<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse> callable,
                GenerateKeywordIdeasRequest request,
                ApiCallContext context,
                ApiFuture<GenerateKeywordIdeaResponse> futureResponse) {
              PageContext<
                      GenerateKeywordIdeasRequest,
                      GenerateKeywordIdeaResponse,
                      GenerateKeywordIdeaResult>
                  pageContext =
                      PageContext.create(
                          callable, GENERATE_KEYWORD_IDEAS_PAGE_STR_DESC, request, context);
              return GenerateKeywordIdeasPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to generateKeywordIdeas. */
  public PagedCallSettings<
          GenerateKeywordIdeasRequest,
          GenerateKeywordIdeaResponse,
          GenerateKeywordIdeasPagedResponse>
      generateKeywordIdeasSettings() {
    return generateKeywordIdeasSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public KeywordPlanIdeaServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcKeywordPlanIdeaServiceStub.create(this);
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
            "gapic", GaxProperties.getLibraryVersion(KeywordPlanIdeaServiceStubSettings.class))
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

  protected KeywordPlanIdeaServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    generateKeywordIdeasSettings = settingsBuilder.generateKeywordIdeasSettings().build();
  }

  /** Builder for KeywordPlanIdeaServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<KeywordPlanIdeaServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            GenerateKeywordIdeasRequest,
            GenerateKeywordIdeaResponse,
            GenerateKeywordIdeasPagedResponse>
        generateKeywordIdeasSettings;
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

      generateKeywordIdeasSettings =
          PagedCallSettings.newBuilder(GENERATE_KEYWORD_IDEAS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(generateKeywordIdeasSettings);
      initDefaults(this);
    }

    protected Builder(KeywordPlanIdeaServiceStubSettings settings) {
      super(settings);

      generateKeywordIdeasSettings = settings.generateKeywordIdeasSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(generateKeywordIdeasSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .generateKeywordIdeasSettings()
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

    /** Returns the builder for the settings used for calls to generateKeywordIdeas. */
    public PagedCallSettings.Builder<
            GenerateKeywordIdeasRequest,
            GenerateKeywordIdeaResponse,
            GenerateKeywordIdeasPagedResponse>
        generateKeywordIdeasSettings() {
      return generateKeywordIdeasSettings;
    }

    @Override
    public KeywordPlanIdeaServiceStubSettings build() throws IOException {
      return new KeywordPlanIdeaServiceStubSettings(this);
    }
  }
}
