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

import com.google.ads.googleads.lib.catalog.ApiCatalog;
import com.google.ads.googleads.lib.catalog.Primer;
import com.google.ads.googleads.lib.logging.LoggingInterceptor;
import com.google.ads.googleads.lib.logging.RequestLogger;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.auth.Credentials;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.auth.oauth2.UserCredentials;
import com.google.auto.value.AutoValue;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Properties;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.ThreadSafe;

/**
 * A client for the Google Ads API that handles common configuration and OAuth2 settings.
 *
 * <p>Instances of this class are both immutable and thread safe.
 *
 * <p>Implements {@link GoogleAdsAllVersions} to simplify instantiation of service client objects
 * using the GoogleAdsClient as a {@link TransportChannelProvider} and default service settings, as
 * shown in the following example.
 *
 * <pre>
 * <code>
 * GoogleAdsClient googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
 * try (CampaignServiceClient client = googleAdsClient.getLatestVersion().getCampaignServiceClient()) {
 *   ...
 * }
 * </code>
 * </pre>
 */
@AutoValue
@Immutable
@ThreadSafe
public abstract class GoogleAdsClient extends AbstractGoogleAdsClient {

  /** The default endpoint for Google Ads API services. */
  private static final String DEFAULT_ENDPOINT = "googleads.googleapis.com:443";

  static {
    // Alpha feature to optimize the client startup time.
    Primer.primeBasicsIfEnabled();
  }

  /** Returns a new builder for {@link GoogleAdsClient} with only default values set. */
  public static Builder newBuilder() {
    AutoValue_GoogleAdsClient.Builder clientBuilder = new AutoValue_GoogleAdsClient.Builder();
    // Constructs the channel provider.
    InstantiatingGrpcChannelProvider transportChannelProvider =
        InstantiatingGrpcChannelProvider.newBuilder()
            .setInterceptorProvider(
                () ->
                    ImmutableList.of(
                        new LoggingInterceptor(
                            new RequestLogger(),
                            clientBuilder.getHeaders(),
                            clientBuilder.getEndpoint())))
            // Issue 131: inbound headers may exceed default (8kb) max header size.
            // Sets max header size to 16MB, which should be more than necessary.
            .setMaxInboundMetadataSize(16 * 1024 * 1024)
            // Sets max response size to 64MB, since large responses will often exceed the default
            // (4MB).
            .setMaxInboundMessageSize(64 * 1024 * 1024)
            .build();
    clientBuilder
        .setEndpoint(DEFAULT_ENDPOINT)
        .setTransportChannelProvider(transportChannelProvider);
    return clientBuilder;
  }

  /** Returns the credentials for this client. */
  public abstract Credentials getCredentials();

  /** Returns the developer token. */
  public abstract String getDeveloperToken();

  /** Returns the endpoint to use. Defaults to DEFAULT_ENDPOINT. */
  public abstract String getEndpoint();

  /** Returns the login customer ID for this client. */
  @Nullable
  public abstract Long getLoginCustomerId();

  /**
   * Returns the linked customer ID for this client. Only required if explicitly instructed by the
   * service documentation.
   */
  @Nullable
  public abstract Long getLinkedCustomerId();

  /** Returns a new {@link GoogleAdsClient.Builder} with the properties as this instance. */
  public abstract Builder toBuilder();

  /** Returns the configured transport provider. */
  abstract TransportChannelProvider getTransportChannelProvider();

  /** Builder for configuring and creating an instance of {@link GoogleAdsClient}. */
  @AutoValue.Builder
  public abstract static class Builder {

    /**
     * The default file name for the properties configuration file. This does <em>not</em> include a
     * path.
     */
    public static final String DEFAULT_PROPERTIES_CONFIG_FILE_NAME = "ads.properties";

    /** Required scope of credentials for the Google Ads API. */
    private static final String GOOGLE_ADS_API_SCOPE = "https://www.googleapis.com/auth/adwords";

    /** Keys for creating installed app/web flow credentials. */
    private static final ImmutableSet<ConfigPropertyKey> INSTALLED_APP_OAUTH_KEYS =
        ImmutableSet.of(
            ConfigPropertyKey.CLIENT_ID,
            ConfigPropertyKey.CLIENT_SECRET,
            ConfigPropertyKey.REFRESH_TOKEN);

    /** Keys for creating service account credentials. */
    private static final ImmutableSet<ConfigPropertyKey> SERVICE_ACCOUNT_OAUTH_KEYS =
        ImmutableSet.of(
            ConfigPropertyKey.SERVICE_ACCOUNT_SECRETS_PATH, ConfigPropertyKey.SERVICE_ACCOUNT_USER);

    /**
     * Allows injecting a different default configuration file, instead of using {@value
     * #DEFAULT_PROPERTIES_CONFIG_FILE_NAME}. Only for testing.
     */
    private Supplier<File> configurationFileSupplier =
        () -> new File(System.getProperty("user.home"), DEFAULT_PROPERTIES_CONFIG_FILE_NAME);

    /** Returns the credentials currently configured. */
    public abstract Credentials getCredentials();

    /**
     * Specifies the OAuth client ID, secret and refresh token. Use {@code
     * UserCredentials.newBuilder()} to build this object.
     *
     * <p>This field is marked nullable to facilitate testing of the client library. In practice,
     * all requests to Google Ads API must be authenticated.
     */
    public abstract Builder setCredentials(Credentials credentials);

    private void setCredentials(Properties properties) throws IOException {
      Credentials credentials;
      String serviceAccountSecretsPath =
          ConfigPropertyKey.SERVICE_ACCOUNT_SECRETS_PATH.getPropertyValue(properties);
      String refreshToken = ConfigPropertyKey.REFRESH_TOKEN.getPropertyValue(properties);
      // Validates that entries are present for exactly one of installed app/web flow credentials or
      // service account credentials.
      if (serviceAccountSecretsPath == null && refreshToken == null) {
        // Entries missing for both types of credentials.
        throw new IllegalArgumentException(
            String.format(
                "Missing properties for credentials. Please modify properties to include entries"
                    + " for %s if using installed application/web flow credentials, or %s if using"
                    + " service account credentials.",
                INSTALLED_APP_OAUTH_KEYS, SERVICE_ACCOUNT_OAUTH_KEYS));
      } else if (serviceAccountSecretsPath != null && refreshToken != null) {
        // Entries specified for both types of credentials.
        throw new IllegalArgumentException(
            String.format(
                "Entries found in properties for both %s and %s. Please modify properties to either"
                    + " include entries for %s if using installed application/web flow credentials,"
                    + " or %s if using service account credentials.",
                ConfigPropertyKey.SERVICE_ACCOUNT_SECRETS_PATH,
                ConfigPropertyKey.REFRESH_TOKEN,
                INSTALLED_APP_OAUTH_KEYS,
                SERVICE_ACCOUNT_OAUTH_KEYS));
      }

      // Constructs the credentials object using the appropriate set of properties.
      if (serviceAccountSecretsPath != null) {
        // Service accounts secrets path is specified, so constructs service account credentials.
        String serviceAccountUser =
            ConfigPropertyKey.SERVICE_ACCOUNT_USER.getPropertyValue(properties);
        // Confirms the service account user is specified. This is required for service account
        // credentials when using the Google Ads API.
        Preconditions.checkNotNull(
            serviceAccountUser,
            "No service account user specified under the key: %s",
            ConfigPropertyKey.SERVICE_ACCOUNT_USER);
        // Creates base service account credentials from the secrets JSON file.
        ServiceAccountCredentials baseCredentials =
            ServiceAccountCredentials.fromStream(new FileInputStream(serviceAccountSecretsPath));
        // Decorates the base credentials with the service account user and scopes.
        credentials =
            baseCredentials.toBuilder()
                .setServiceAccountUser(serviceAccountUser)
                .setScopes(Collections.singletonList(GOOGLE_ADS_API_SCOPE))
                .build();
      } else {
        // Refresh token is specified, so constructs user credentials.
        credentials =
            UserCredentials.newBuilder()
                .setClientId(ConfigPropertyKey.CLIENT_ID.getPropertyValue(properties))
                .setClientSecret(ConfigPropertyKey.CLIENT_SECRET.getPropertyValue(properties))
                .setRefreshToken(ConfigPropertyKey.REFRESH_TOKEN.getPropertyValue(properties))
                .build();
      }
      setCredentials(credentials);
    }

    /** Returns the TransportChannelProvider currently configured. */
    @VisibleForTesting
    abstract TransportChannelProvider getTransportChannelProvider();

    /** Sets the TransportChannelProvider to use. */
    abstract Builder setTransportChannelProvider(TransportChannelProvider transportChannelProvider);

    /** Returns the developer token currently configured. */
    public abstract String getDeveloperToken();

    /** Sets the developer token used to obtain access to the Google Ads API. */
    public abstract Builder setDeveloperToken(String developerToken);

    private void setDeveloperToken(Properties properties) {
      setDeveloperToken(ConfigPropertyKey.DEVELOPER_TOKEN.getPropertyValue(properties));
    }

    /** Returns the login customer ID currently configured. */
    public abstract Long getLoginCustomerId();

    /** Returns the linked customer ID currently configured. */
    public abstract Long getLinkedCustomerId();

    /**
     * Required by a small subset of services and use-cases. Only required if explicitly instructed
     * in the service documentation.
     */
    public abstract Builder setLinkedCustomerId(Long linkedCustomerId);

    /**
     * Required for manager accounts only. When authenticating as a Google Ads manager account,
     * specifies the customer ID of the authenticating manager account.
     *
     * <p>If your OAuth credentials are for a user with access to multiple manager accounts you must
     * create a separate GoogleAdsClient instance for each manager account. Use {@code
     * toBuilder().setLoginCustomerId(...).build()} to change the loginCustomerId.
     */
    public abstract Builder setLoginCustomerId(Long customerId);

    private void setLoginCustomerId(Properties properties) {
      String configuredLoginCustomer =
          ConfigPropertyKey.LOGIN_CUSTOMER_ID.getPropertyValue(properties);
      if (configuredLoginCustomer != null) {
        try {
          setLoginCustomerId(Long.parseLong(configuredLoginCustomer));
        } catch (NumberFormatException ex) {
          throw new IllegalArgumentException(
              "Invalid loginCustomerId, must be a number, provided: " + configuredLoginCustomer,
              ex);
        }
      }
    }

    /** Returns the endpoint currently configured. */
    public abstract String getEndpoint();

    /**
     * Optional: Overrides the default endpoint. For the default value see {@see #DEFAULT_ENDPOINT}
     */
    public abstract Builder setEndpoint(String endpoint);

    private void setEndpoint(Properties properties) {
      String endpoint =
          MoreObjects.firstNonNull(
              ConfigPropertyKey.ENDPOINT.getPropertyValue(properties),
              MoreObjects.firstNonNull(
                  ConfigPropertyKey.ENDPOINT.getPropertyValue(System.getProperties()),
                  DEFAULT_ENDPOINT));
      setEndpoint(endpoint);
    }

    /** Sets the GoogleAdsAllVersions factory object (internal only). */
    abstract Builder setGoogleAdsAllVersions(GoogleAdsAllVersions versions);

    abstract GoogleAdsClient autoBuild();

    /**
     * Loads the Google Ads Client configuration file from the default location: {@value
     * #DEFAULT_PROPERTIES_CONFIG_FILE_NAME}.
     *
     * @throws FileNotFoundException if the file does not exist.
     * @throws IOException if the file exists, but a failure occurs when trying to load properties
     *     from the file.
     */
    public Builder fromPropertiesFile() throws IOException {
      return fromPropertiesFile(configurationFileSupplier.get());
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
      return fromProperties(adsProperties);
    }

    /**
     * Updates this builder with values set from a properties object.
     *
     * <p>The format is similar to the format specified in the AdWords API's client library for
     * Java, except the property keys have changed. See {@link ConfigPropertyKey} for the list of
     * expected keys.
     *
     * @throws IllegalArgumentException if a failure occurs when trying to load properties from the
     *     file.
     */
    public Builder fromProperties(Properties properties) {
      try {
        setCredentials(properties);
      } catch (IOException ioe) {
        throw new IllegalArgumentException("Failed to create credentials from properties", ioe);
      }
      setDeveloperToken(properties);
      setEndpoint(properties);
      setLoginCustomerId(properties);
      return this;
    }

    /**
     * Retrieves the headers to be provided in requests, generated from properties set on the
     * builder, e.g. endpoint and developer token.
     */
    ImmutableMap<String, String> getHeaders() {
      return GoogleAdsHeaderProvider.newBuilder()
          .setDeveloperToken(getDeveloperToken())
          .setLoginCustomerId(getLoginCustomerId())
          .setLinkedCustomerId(getLinkedCustomerId())
          .build()
          .getHeaders();
    }

    /**
     * Returns a new instance of {@link GoogleAdsClient} based on the attributes of this builder.
     */
    public GoogleAdsClient build() {
      // Provides the credentials to the primer to preemptively get these ready for usage.
      Primer.getInstance().ifPresent(p -> p.primeCredentialsAsync(getCredentials()));
      // Proceeds with creating the client library instance.
      TransportChannelProvider transportChannelProvider = getTransportChannelProvider();
      if (transportChannelProvider.needsHeaders()) {
        transportChannelProvider = transportChannelProvider.withHeaders(getHeaders());
      }
      if (transportChannelProvider.needsEndpoint()) {
        transportChannelProvider = transportChannelProvider.withEndpoint(getEndpoint());
      }
      setTransportChannelProvider(transportChannelProvider);

      GoogleAdsAllVersions allVersionsClient =
          ApiCatalog.getDefault()
              .createAllVersionsClient(getTransportChannelProvider(), getCredentials());
      setGoogleAdsAllVersions(allVersionsClient);

      GoogleAdsClient provider = autoBuild();
      Long loginCustomerId = provider.getLoginCustomerId();
      Preconditions.checkArgument(
          provider.getLoginCustomerId() == null
              || (loginCustomerId > 0 && loginCustomerId <= 999_999_9999L),
          "Invalid loginCustomerId, "
              + "must be 0 < loginCustomerId < 9,999,999,999, provided: "
              + loginCustomerId);
      return provider;
    }

    @VisibleForTesting
    Builder setConfigurationFileSupplier(Supplier<File> configurationFileSupplier) {
      this.configurationFileSupplier = configurationFileSupplier;
      return this;
    }

    /** Enum of keys expected in the {@value DEFAULT_PROPERTIES_CONFIG_FILE_NAME}. */
    public enum ConfigPropertyKey {
      CLIENT_ID("api.googleads.clientId"),
      CLIENT_SECRET("api.googleads.clientSecret"),
      DEVELOPER_TOKEN("api.googleads.developerToken"),
      REFRESH_TOKEN("api.googleads.refreshToken"),
      ENDPOINT("api.googleads.endpoint"),
      LOGIN_CUSTOMER_ID("api.googleads.loginCustomerId"),
      ENABLE_GENERATED_CATALOG("api.googleads.enableGeneratedCatalog"),
      // Service account keys
      SERVICE_ACCOUNT_SECRETS_PATH("api.googleads.serviceAccountSecretsPath"),
      SERVICE_ACCOUNT_USER("api.googleads.serviceAccountUser");

      private final String key;

      ConfigPropertyKey(String key) {
        this.key = key;
      }

      /** The key corresponding to this config property. */
      public String getPropertyKey() {
        return key;
      }

      /**
       * Convenience method that gets the value for this config key from the specified {@code
       * properties}.
       *
       * @param properties the properties from which the value will be fetched
       * @return the property value for this key, or {@code null} if no such entry exists.
       * @throws NullPointerException if {@code properties == null}.
       */
      public String getPropertyValue(Properties properties) {
        return Preconditions.checkNotNull(properties, "Null properties")
            .getProperty(getPropertyKey());
      }
    }
  }
}
