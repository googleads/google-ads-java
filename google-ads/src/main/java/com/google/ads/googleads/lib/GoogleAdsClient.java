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
import com.google.auth.oauth2.GoogleCredentials;
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
import java.util.Optional;
import java.util.Properties;
import java.util.function.Function;
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
    return new AutoValue_GoogleAdsClient.Builder().setEndpoint(DEFAULT_ENDPOINT);
  }

  /**
   * Returns the credentials for this client.
   *
   * <p>This field is marked nullable to enable proper builder behavior. In practice, all requests
   * to Google Ads API must be authenticated, and this field will never be null.
   */
  @Nullable
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

  /**
   * Builder for configuring and creating an instance of {@link GoogleAdsClient}.
   *
   * <p>Unlike {@link GoogleAdsClient}, builders are <em>not</em> thread safe.
   */
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
     * Allows injecting a different mechanism for retrieving the value of environment variables.
     * Only modify this for testing.
     */
    private Function<String, String> environmentValueGetter = System::getenv;

    /**
     * Allows injecting a different default configuration file, instead of using {@value
     * #DEFAULT_PROPERTIES_CONFIG_FILE_NAME}. Only for testing.
     */
    private Supplier<File> configurationFileSupplier =
        () -> {
          String envConfigFilePath =
              environmentValueGetter.apply(
                  AdsEnvironmentVariable.GOOGLE_ADS_CONFIGURATION_FILE_PATH.name());
          if (envConfigFilePath != null) {
            return new File(envConfigFilePath);
          }
          return new File(System.getProperty("user.home"), DEFAULT_PROPERTIES_CONFIG_FILE_NAME);
        };

    /**
     * A builder for the client's Credentials.
     *
     * <p>If setting the value of this {@code Optional}, use either a UserCredentials.Builder or a
     * ServiceAccountCredentials.Builder.
     */
    private Optional<GoogleCredentials.Builder> credentialsBuilder = Optional.empty();

    /** Returns the credentials currently configured. */
    public abstract Credentials getCredentials();

    /**
     * Specifies the OAuth credentials. Use {@code UserCredentials.newBuilder()} or {@code
     * ServiceAccountCredentials.newBuilder()} to build this object, or configure your credentials
     * using a properties file or environment variables.
     *
     * <p>This field is marked nullable to facilitate testing of the client library. In practice,
     * all requests to Google Ads API must be authenticated.
     */
    public abstract Builder setCredentials(Credentials credentials);

    private void setCredentials(Properties properties) throws IOException {
      // Validates that entries are present for exactly one of installed app/web flow credentials or
      // service account credentials.
      boolean hasInstalledAppKeys =
          INSTALLED_APP_OAUTH_KEYS.stream().anyMatch(k -> k.getPropertyValue(properties) != null);
      boolean hasServiceAccountKeys =
          SERVICE_ACCOUNT_OAUTH_KEYS.stream().anyMatch(k -> k.getPropertyValue(properties) != null);
      if (!(hasInstalledAppKeys || hasServiceAccountKeys)) {
        // Entries missing for both types of credentials. Skips any further processing so user can
        // merge this builder if needed.
        return;
      }

      if (hasInstalledAppKeys && hasServiceAccountKeys) {
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

      if (credentialsBuilder.isPresent()) {
        if ((credentialsBuilder.get() instanceof UserCredentials.Builder)
            && hasServiceAccountKeys) {
          throw new IllegalArgumentException(
              "Entries found in properties for service account credentials, "
                  + "but this builder is already partially configured for installed application/"
                  + "web flow credentials.");
        } else if ((credentialsBuilder.get() instanceof ServiceAccountCredentials.Builder)
            && hasInstalledAppKeys) {
          throw new IllegalArgumentException(
              "Entries found in properties for installed application/web flow credentials, but"
                  + " this builder is already partially configured for service account"
                  + " credentials.");
        }
      }

      // Clears the explicitly set credentials. This ensures that the credentials configured here
      // will be used, even if the user previously explicitly set credentials. See build() for
      // details.
      setCredentials((Credentials) null);

      // Updates the credentials builder using the appropriate set of properties.
      GoogleCredentials.Builder updatedBuilder;
      if (hasInstalledAppKeys) {
        updatedBuilder = configureUserCredentials(properties, credentialsBuilder);
      } else {
        updatedBuilder = configureServiceAccountCredentials(properties, credentialsBuilder);
      }
      credentialsBuilder = Optional.of(updatedBuilder);
    }

    /**
     * Configures the credentials builder using the specified properties for installed app or web
     * server configuration keys.
     *
     * @return the modified, potentially <em>different</em> credentials builder
     */
    private GoogleCredentials.Builder configureUserCredentials(
        Properties properties, Optional<GoogleCredentials.Builder> optionalBuilder) {
      UserCredentials.Builder userCredentialsBuilder;
      if (optionalBuilder.isPresent()) {
        Preconditions.checkState(
            optionalBuilder.get() instanceof UserCredentials.Builder,
            "Cannot apply installed app/web flow credential settings. Builder is already partially"
                + " configured for the service account flow.");
        userCredentialsBuilder = (UserCredentials.Builder) optionalBuilder.get();
      } else {
        userCredentialsBuilder = UserCredentials.newBuilder();
      }

      String refreshToken = ConfigPropertyKey.REFRESH_TOKEN.getPropertyValue(properties);
      if (refreshToken != null) {
        userCredentialsBuilder.setRefreshToken(refreshToken);
      }

      String clientId = ConfigPropertyKey.CLIENT_ID.getPropertyValue(properties);
      if (clientId != null) {
        userCredentialsBuilder.setClientId(clientId);
      }

      String clientSecret = ConfigPropertyKey.CLIENT_SECRET.getPropertyValue(properties);
      if (clientSecret != null) {
        userCredentialsBuilder.setClientSecret(clientSecret);
      }

      return userCredentialsBuilder;
    }

    /**
     * Configures the credentials builder using the specified properties for service account
     * configuration keys.
     *
     * @return the modified, potentially <em>different</em> credentials builder
     */
    private GoogleCredentials.Builder configureServiceAccountCredentials(
        Properties properties, Optional<GoogleCredentials.Builder> optionalBuilder)
        throws IOException {
      ServiceAccountCredentials.Builder builder;
      if (optionalBuilder.isPresent()) {
        Preconditions.checkState(
            optionalBuilder.get() instanceof ServiceAccountCredentials.Builder,
            "Cannot apply service account credential settings. Builder is already partially"
                + " configured for the installed app/web flow.");
        builder = (ServiceAccountCredentials.Builder) optionalBuilder.get();
      } else {
        builder =
            ServiceAccountCredentials.newBuilder()
                .setScopes(Collections.singleton(GOOGLE_ADS_API_SCOPE));
      }

      String serviceAccountSecretsPath =
          ConfigPropertyKey.SERVICE_ACCOUNT_SECRETS_PATH.getPropertyValue(properties);
      if (serviceAccountSecretsPath != null) {
        // Unfortunately, ServiceAccountCredentials.Builder does not provide a fromStream() method
        // that updates a builder from a secrets file, so creates a new builder and copies existing
        // builder's properties to that builder.
        ServiceAccountCredentials.Builder newBuilder =
            ServiceAccountCredentials.fromStream(new FileInputStream(serviceAccountSecretsPath))
                .toBuilder();
        // Adds the service account user and scopes from the existing builder.
        newBuilder.setServiceAccountUser(builder.getServiceAccountUser());
        newBuilder.setScopes(builder.getScopes());
        // Replaces the credentials builder with the one created from the secrets file.
        builder = newBuilder;
      }

      String serviceAccountUser =
          ConfigPropertyKey.SERVICE_ACCOUNT_USER.getPropertyValue(properties);
      if (serviceAccountUser != null) {
        builder.setServiceAccountUser(serviceAccountUser);
      }
      return builder;
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

    /**
     * Sets the developer token from the specified {@code properties} if an entry for developer
     * token exists.
     */
    private void setDeveloperToken(Properties properties) {
      String devToken = ConfigPropertyKey.DEVELOPER_TOKEN.getPropertyValue(properties);
      if (devToken != null) {
        setDeveloperToken(devToken);
      }
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

    /**
     * @return {@code longString} as a long if it is a valid long literal
     * @throws IllegalArgumentException if {@code longString} is not a valid long literal
     */
    private long checkLongString(String longString, String fieldName) {
      try {
        return Long.parseLong(longString);
      } catch (NumberFormatException ex) {
        throw new IllegalArgumentException(
            "Invalid " + fieldName + ", must be a number, provided: " + longString, ex);
      }
    }

    private void setLoginCustomerId(Properties properties) {
      String configuredLoginCustomer =
          ConfigPropertyKey.LOGIN_CUSTOMER_ID.getPropertyValue(properties);
      if (configuredLoginCustomer != null) {
        setLoginCustomerId(checkLongString(configuredLoginCustomer, "loginCustomerId"));
      }
    }

    private void setLinkedCustomerId(Properties properties) {
      String configuredLinkedCustomer =
          ConfigPropertyKey.LINKED_CUSTOMER_ID.getPropertyValue(properties);
      if (configuredLinkedCustomer != null) {
        setLinkedCustomerId(checkLongString(configuredLinkedCustomer, "linkedCustomerId"));
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
      setLinkedCustomerId(properties);
      return this;
    }

    public Builder fromEnvironment() {
      // Converts the value for each relevant environment variable into its equivalent in property.
      // This allows environment variable configuration to leverage the same methods and validation
      // that's used for properties configuration.
      Properties properties = new Properties();
      for (AdsEnvironmentVariable adsEnvVar : AdsEnvironmentVariable.values()) {
        if (adsEnvVar.configPropertyKey.isPresent()) {
          String envVarValue = environmentValueGetter.apply(adsEnvVar.name());
          if (envVarValue != null) {
            properties.put(adsEnvVar.configPropertyKey.get().getPropertyKey(), envVarValue);
          }
        }
      }
      return fromProperties(properties);
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
      // Implements "last one wins" logic for credentials. The client should use the credentials
      // configured by the LAST of the following actions:
      // - The user configured credentials by calling fromProperties() or fromEnvironment() along
      //   with properties/environment variables that include credential settings. Note that
      //   fromProperties() will set credentials to null in this case.
      // - The user explicitly set credentials via setCredentials(Credentials).
      if (getCredentials() == null) {
        if (credentialsBuilder.isPresent()) {
          // Sets the credentials using the credentials builder.
          setCredentials(credentialsBuilder.get().build());
        } else {
          throw new IllegalStateException("Property \"credentials\" has not been set");
        }
      } else {
        // The last action by the user was to invoke setCredentials(Credentials), so no further
        // action is needed.
      }

      // Provides the credentials to the primer to preemptively get these ready for usage.
      Primer.getInstance().ifPresent(p -> p.primeCredentialsAsync(getCredentials()));
      // Proceeds with creating the client library instance.
      // Constructs the channel provider.
      TransportChannelProvider transportChannelProvider =
          InstantiatingGrpcChannelProvider.newBuilder()
              .setInterceptorProvider(
                  () ->
                      ImmutableList.of(
                          new LoggingInterceptor(
                              new RequestLogger(),
                              getHeaders(),
                              getEndpoint())))
              // Issue 131: inbound headers may exceed default (8kb) max header size.
              // Sets max header size to 16MB, which should be more than necessary.
              .setMaxInboundMetadataSize(16 * 1024 * 1024)
              // Sets max response size to 64MB, since large responses will often exceed the default
              // (4MB).
              .setMaxInboundMessageSize(64 * 1024 * 1024)
              .build();

      transportChannelProvider = transportChannelProvider.withHeaders(getHeaders());

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

    @VisibleForTesting
    Builder setEnvironmentValueGetter(Function<String, String> environmentValueGetter) {
      this.environmentValueGetter = environmentValueGetter;
      return this;
    }

    /**
     * Enumeration of the environment variables that can be used to configure a {@link
     * GoogleAdsClient}.
     */
    public enum AdsEnvironmentVariable {
      /**
       * Path, including the file name, from which the client configuration file should be read.
       * Overrides the default location of the user's home directory and default file name of
       * {@value DEFAULT_PROPERTIES_CONFIG_FILE_NAME}.
       */
      GOOGLE_ADS_CONFIGURATION_FILE_PATH(),
      // OAuth environment variables:
      /** Client ID for installed app/web flow credentials. */
      GOOGLE_ADS_CLIENT_ID(ConfigPropertyKey.CLIENT_ID),
      /** Client secret for installed app/web flow credentials. */
      GOOGLE_ADS_CLIENT_SECRET(ConfigPropertyKey.CLIENT_SECRET),
      /** Refresh token for installed app/web flow credentials. */
      GOOGLE_ADS_REFRESH_TOKEN(ConfigPropertyKey.REFRESH_TOKEN),
      /** Path to the JSON key (secrets) file for service account credentials. */
      GOOGLE_ADS_JSON_KEY_FILE_PATH(ConfigPropertyKey.SERVICE_ACCOUNT_SECRETS_PATH),
      /** Service account user to impersonate for service account credentials. */
      GOOGLE_ADS_IMPERSONATED_EMAIL(ConfigPropertyKey.SERVICE_ACCOUNT_USER),
      // Google Ads API environment variables:
      /** Google Ads API developer token. */
      GOOGLE_ADS_DEVELOPER_TOKEN(ConfigPropertyKey.DEVELOPER_TOKEN),
      /** Login customer ID. */
      GOOGLE_ADS_LOGIN_CUSTOMER_ID(ConfigPropertyKey.LOGIN_CUSTOMER_ID),
      /** Linked customer ID. */
      GOOGLE_ADS_LINKED_CUSTOMER_ID(ConfigPropertyKey.LINKED_CUSTOMER_ID),
      /** Google Ads API endpoint. Overrides the default endpoint of {@value DEFAULT_ENDPOINT}. */
      GOOGLE_ADS_ENDPOINT(ConfigPropertyKey.ENDPOINT);

      /**
       * The {@link ConfigPropertyKey} that this environment variable maps to, if such a mapping
       * exists.
       */
      private Optional<ConfigPropertyKey> configPropertyKey;

      AdsEnvironmentVariable(ConfigPropertyKey configPropertyKey) {
        this.configPropertyKey = Optional.of(configPropertyKey);
      }

      AdsEnvironmentVariable() {
        this.configPropertyKey = Optional.empty();
      }
    }

    /** Enum of keys expected in the {@value DEFAULT_PROPERTIES_CONFIG_FILE_NAME}. */
    public enum ConfigPropertyKey {
      CLIENT_ID("api.googleads.clientId"),
      CLIENT_SECRET("api.googleads.clientSecret"),
      DEVELOPER_TOKEN("api.googleads.developerToken"),
      REFRESH_TOKEN("api.googleads.refreshToken"),
      ENDPOINT("api.googleads.endpoint"),
      LOGIN_CUSTOMER_ID("api.googleads.loginCustomerId"),
      LINKED_CUSTOMER_ID("api.googleads.linkedCustomerId"),
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
