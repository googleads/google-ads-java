// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.lib;

import com.google.ads.googleads.v0.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v0.services.AdGroupBidModifierServiceClient;
import com.google.ads.googleads.v0.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v0.services.AdGroupServiceClient;
import com.google.ads.googleads.v0.services.BiddingStrategyServiceClient;
import com.google.ads.googleads.v0.services.CampaignBidModifierServiceClient;
import com.google.ads.googleads.v0.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v0.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v0.services.CampaignGroupServiceClient;
import com.google.ads.googleads.v0.services.CampaignServiceClient;
import com.google.ads.googleads.v0.services.CampaignSharedSetServiceClient;
import com.google.ads.googleads.v0.services.CustomerServiceClient;
import com.google.ads.googleads.v0.services.GeoTargetConstantServiceClient;
import com.google.ads.googleads.v0.services.GoogleAdsFieldServiceClient;
import com.google.ads.googleads.v0.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v0.services.KeywordViewServiceClient;
import com.google.ads.googleads.v0.services.RecommendationServiceClient;
import com.google.ads.googleads.v0.services.SharedCriterionServiceClient;
import com.google.ads.googleads.v0.services.SharedSetServiceClient;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.FixedHeaderProvider;
import com.google.api.gax.rpc.TransportChannel;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.UserCredentials;
import com.google.auto.value.AutoValue;
import com.google.auto.value.extension.memoized.Memoized;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.ThreadSafe;

/**
 * A client for the Google Ads API that handles common configuration and OAuth2 settings.
 *
 * <p>Instances of this class are both immutable and thread safe.
 *
 * <p>Implements {@link ServiceClientFactory} to simplify instantiation of service client objects
 * using the GoogleAdsClient as a {@link TransportChannelProvider} and default service settings, as
 * shown in the following example.
 *
 * <pre>
 * <code>
 * GoogleAdsClient googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
 * try (CampaignServiceClient client = googleAdsClient.getCampaignServiceClient()) {
 *   ...
 * }
 * </code>
 * </pre>
 *
 * <p>If further customization of service clients or service settings is required, this class can be
 * used as a {@link TransportChannelProvider} to simplify the instantiation of subclasses of
 * com.google.api.gax.grpc.ClientSettings, as shown in the following example.
 *
 * <pre>
 * <code>
 * GoogleAdsClient googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
 * CampaignServiceSettings settings =
 *     CampaignServiceSettings.defaultBuilder()
 *         .setTransportChannelProvider(googleAdsClient)
 *         // Set other properties for the settings object
 *         // ...
 *         .build();
 * try (CampaignServiceClient client = CampaignServiceClient.create(settings)) {
 *   ...
 * }
 * </code>
 * </pre>
 */
@AutoValue
@Immutable
@ThreadSafe
public abstract class GoogleAdsClient implements ServiceClientFactory, TransportChannelProvider {

  /** The default endpoint for Google Ads API services. */
  private static final String DEFAULT_ENDPOINT = "googleads.googleapis.com:443";

  /** Returns a new builder for {@link GoogleAdsClient} with only default values set. */
  public static Builder newBuilder() {
    return new AutoValue_GoogleAdsClient.Builder().setEndpoint(DEFAULT_ENDPOINT);
  }

  /** Returns the credentials for this client. */
  public abstract Credentials getCredentials();

  /** Returns the developer token. */
  public abstract String getDeveloperToken();

  /** Returns the endpoint to use. Defaults to DEFAULT_ENDPOINT. */
  public abstract String getEndpoint();

  /**
   * Lazily instantiates the underlying {@link TransportChannelProvider} via AutoValue memoization.
   *
   * @return this object's {@link TransportChannelProvider}.
   */
  @Memoized
  TransportChannelProvider getWrappedProvider() {
    // CredentialsProvider credentialsProvider = FixedCredentialsProvider.create(getCredentials());
    InstantiatingGrpcChannelProvider.Builder channelProviderBuilder =
        InstantiatingGrpcChannelProvider.newBuilder();

    channelProviderBuilder
        .setHeaderProvider(FixedHeaderProvider.create("developer-token", getDeveloperToken()))
        .setEndpoint(getEndpoint());
    return channelProviderBuilder.build();
  }

  @Override
  public boolean shouldAutoClose() {
    return getWrappedProvider().shouldAutoClose();
  }

  @Override
  public boolean needsExecutor() {
    return getWrappedProvider().needsExecutor();
  }

  @Override
  public TransportChannelProvider withExecutor(ScheduledExecutorService scheduledExecutorService) {
    return getWrappedProvider().withExecutor(scheduledExecutorService);
  }

  @Override
  public boolean needsHeaders() {
    return getWrappedProvider().needsHeaders();
  }

  @Override
  public TransportChannelProvider withHeaders(Map<String, String> headers) {
    return getWrappedProvider().withHeaders(headers);
  }

  @Override
  public String getTransportName() {
    return getWrappedProvider().getTransportName();
  }

  @Override
  public boolean needsEndpoint() {
    return getWrappedProvider().needsEndpoint();
  }

  @Override
  public TransportChannel getTransportChannel() throws IOException {
    return getWrappedProvider().getTransportChannel();
  }

  @Override
  public TransportChannelProvider withEndpoint(String endpoint) {
    return getWrappedProvider().withEndpoint(endpoint);
  }

  @Override
  public AdGroupAdServiceClient getAdGroupAdServiceClient() {
    return GrpcServiceDescriptor.get(AdGroupAdServiceClient.class).newServiceClient(this);
  }

  @Override
  public AdGroupBidModifierServiceClient getAdGroupBidModifierServiceClient() {
    return GrpcServiceDescriptor.get(AdGroupBidModifierServiceClient.class).newServiceClient(this);
  }

  @Override
  public AdGroupCriterionServiceClient getAdGroupCriterionServiceClient() {
    return GrpcServiceDescriptor.get(AdGroupCriterionServiceClient.class).newServiceClient(this);
  }

  @Override
  public AdGroupServiceClient getAdGroupServiceClient() {
    return GrpcServiceDescriptor.get(AdGroupServiceClient.class).newServiceClient(this);
  }

  @Override
  public BiddingStrategyServiceClient getBiddingStrategyServiceClient() {
    return GrpcServiceDescriptor.get(BiddingStrategyServiceClient.class).newServiceClient(this);
  }

  @Override
  public CampaignBidModifierServiceClient getCampaignBidModifierServiceClient() {
    return GrpcServiceDescriptor.get(CampaignBidModifierServiceClient.class).newServiceClient(this);
  }

  @Override
  public CampaignBudgetServiceClient getCampaignBudgetServiceClient() {
    return GrpcServiceDescriptor.get(CampaignBudgetServiceClient.class).newServiceClient(this);
  }

  @Override
  public CampaignCriterionServiceClient getCampaignCriterionServiceClient() {
    return GrpcServiceDescriptor.get(CampaignCriterionServiceClient.class).newServiceClient(this);
  }

  @Override
  public CampaignGroupServiceClient getCampaignGroupServiceClient() {
    return GrpcServiceDescriptor.get(CampaignGroupServiceClient.class).newServiceClient(this);
  }

  @Override
  public CampaignServiceClient getCampaignServiceClient() {
    return GrpcServiceDescriptor.get(CampaignServiceClient.class).newServiceClient(this);
  }

  @Override
  public CampaignSharedSetServiceClient getCampaignSharedSetServiceClient() {
    return GrpcServiceDescriptor.get(CampaignSharedSetServiceClient.class).newServiceClient(this);
  }

  @Override
  public CustomerServiceClient getCustomerServiceClient() {
    return GrpcServiceDescriptor.get(CustomerServiceClient.class).newServiceClient(this);
  }

  @Override
  public GeoTargetConstantServiceClient getGeoTargetConstantServiceClient() {
    return GrpcServiceDescriptor.get(GeoTargetConstantServiceClient.class).newServiceClient(this);
  }

  @Override
  public GoogleAdsFieldServiceClient getGoogleAdsFieldServiceClient() {
    return GrpcServiceDescriptor.get(GoogleAdsFieldServiceClient.class).newServiceClient(this);
  }

  @Override
  public GoogleAdsServiceClient getGoogleAdsServiceClient() {
    return GrpcServiceDescriptor.get(GoogleAdsServiceClient.class).newServiceClient(this);
  }

  @Override
  public KeywordViewServiceClient getKeywordViewServiceClient() {
    return GrpcServiceDescriptor.get(KeywordViewServiceClient.class).newServiceClient(this);
  }

  @Override
  public RecommendationServiceClient getRecommendationServiceClient() {
    return GrpcServiceDescriptor.get(RecommendationServiceClient.class).newServiceClient(this);
  }

  @Override
  public SharedCriterionServiceClient getSharedCriterionServiceClient() {
    return GrpcServiceDescriptor.get(SharedCriterionServiceClient.class).newServiceClient(this);
  }

  @Override
  public SharedSetServiceClient getSharedSetServiceClient() {
    return GrpcServiceDescriptor.get(SharedSetServiceClient.class).newServiceClient(this);
  }

  /** Builder for configuring and creating an instance of {@link GoogleAdsClient}. */
  @AutoValue.Builder
  public abstract static class Builder {

    /**
     * The default file name for the properties configuration file. This does <em>not</em> include a
     * path.
     */
    public static final String DEFAULT_PROPERTIES_CONFIG_FILE_NAME = "ads.properties";

    /** The property to set to override the location searched by {@link #fromPropertiesFile()}. */
    public static final String PROPERTIES_CONFIG_FILE_PROPERTY =
        "com.google.ads.googleads.GoogleAdsClient.propertiesFile";

    /** Enum of keys expected in the {@value DEFAULT_PROPERTIES_CONFIG_FILE_NAME}. */
    public enum ConfigPropertyKey {
      CLIENT_ID("api.googleads.clientId"),
      CLIENT_SECRET("api.googleads.clientSecret"),
      DEVELOPER_TOKEN("api.googleads.developerToken"),
      REFRESH_TOKEN("api.googleads.refreshToken"),
      ENDPOINT("api.googleads.endpoint");

      private final String key;

      ConfigPropertyKey(String key) {
        this.key = key;
      }

      /** The key corresponding to this config property. */
      public String getPropertyKey() {
        return key;
      }
    }

    public abstract Builder setCredentials(Credentials credentials);

    public abstract Builder setDeveloperToken(String developerToken);

    public abstract Builder setEndpoint(String endpoint);

    abstract GoogleAdsClient autoBuild();

    /**
     * Same as {@link #fromPropertiesFile(File)}, but loads from the default location. The default
     * location is derived as follows:
     *
     * <ul>
     *   <li>The {@value PROPERTIES_CONFIG_FILE_PROPERTY} system property, if it is set.
     *   <li>Otherwise, the {@value #DEFAULT_PROPERTIES_CONFIG_FILE_NAME} file from the user's home
     *       directory.
     * </ul>
     *
     * @throws FileNotFoundException if the file does not exist.
     * @throws IOException if the file exists, but a failure occurs when trying to load properties
     *     from the file.
     */
    public Builder fromPropertiesFile() throws IOException {
      return fromPropertiesFile(System.getProperties());
    }

    /**
     * Same as {@link #fromPropertiesFile()}, but uses the specified properties instead of using
     * system properties. This is useful for tests, where setting system properties is problematic,
     * particularly when multiple tests depend on the same system property.
     *
     * @param properties the properties to check for the config file location.
     * @throws IOException if the file exists, but a failure occurs when trying to load properties
     *     from the file.
     */
    @VisibleForTesting
    Builder fromPropertiesFile(Properties properties) throws IOException {
      File propertiesFile;
      String fileOverride = properties.getProperty(PROPERTIES_CONFIG_FILE_PROPERTY);
      if (Strings.isNullOrEmpty(fileOverride)) {
        propertiesFile =
            new File(properties.getProperty("user.home"), DEFAULT_PROPERTIES_CONFIG_FILE_NAME);
      } else {
        propertiesFile = new File(fileOverride);
      }
      return fromPropertiesFile(propertiesFile);
    }

    /**
     * Updates this builder with values set from a properties file.
     *
     * <p>The format is similar to the format specified in the AdWords API's client library for
     * Java, except the property keys have changed. See {@link ConfigPropertyKey} for the list of
     * expected keys.
     *
     * @throws FileNotFoundException if the specified file does not exist.
     * @throws IOException if the file exists, but a failure occurs when trying to load properties
     *     from the file.
     */
    public Builder fromPropertiesFile(File propertiesFile) throws IOException {
      Preconditions.checkNotNull(propertiesFile, "Null properties file");
      Properties adsProperties = new Properties();
      try (FileInputStream fileInputStream = new FileInputStream(propertiesFile)) {
        adsProperties.load(fileInputStream);
      }
      GoogleCredentials credentials;
      credentials =
          UserCredentials.newBuilder()
              .setClientId(adsProperties.getProperty(ConfigPropertyKey.CLIENT_ID.getPropertyKey()))
              .setClientSecret(
                  adsProperties.getProperty(ConfigPropertyKey.CLIENT_SECRET.getPropertyKey()))
              .setRefreshToken(
                  adsProperties.getProperty(ConfigPropertyKey.REFRESH_TOKEN.getPropertyKey()))
              .build();

      String endpoint =
          MoreObjects.firstNonNull(
              adsProperties.getProperty(ConfigPropertyKey.ENDPOINT.getPropertyKey()),
              MoreObjects.firstNonNull(
                  System.getProperty(ConfigPropertyKey.ENDPOINT.getPropertyKey()),
                  DEFAULT_ENDPOINT));

      return setCredentials(credentials)
          .setDeveloperToken(
              adsProperties.getProperty(ConfigPropertyKey.DEVELOPER_TOKEN.getPropertyKey()))
          .setEndpoint(endpoint);
    }

    /**
     * Returns a new instance of {@link GoogleAdsClient} based on the attributes of this builder.
     */
    public GoogleAdsClient build() {
      GoogleAdsClient provider = autoBuild();
      return provider;
    }
  }
}
