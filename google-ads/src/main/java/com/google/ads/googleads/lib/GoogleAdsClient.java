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

import com.google.ads.googleads.lib.logging.LoggingInterceptor;
import com.google.ads.googleads.lib.logging.RequestLogger;
import com.google.ads.googleads.v0.services.AccountBudgetProposalServiceClient;
import com.google.ads.googleads.v0.services.AccountBudgetServiceClient;
import com.google.ads.googleads.v0.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v0.services.AdGroupAudienceViewServiceClient;
import com.google.ads.googleads.v0.services.AdGroupBidModifierServiceClient;
import com.google.ads.googleads.v0.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v0.services.AdGroupFeedServiceClient;
import com.google.ads.googleads.v0.services.AdGroupServiceClient;
import com.google.ads.googleads.v0.services.AdParameterServiceClient;
import com.google.ads.googleads.v0.services.AdScheduleViewServiceClient;
import com.google.ads.googleads.v0.services.AgeRangeViewServiceClient;
import com.google.ads.googleads.v0.services.BiddingStrategyServiceClient;
import com.google.ads.googleads.v0.services.BillingSetupServiceClient;
import com.google.ads.googleads.v0.services.CampaignAudienceViewServiceClient;
import com.google.ads.googleads.v0.services.CampaignBidModifierServiceClient;
import com.google.ads.googleads.v0.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v0.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v0.services.CampaignFeedServiceClient;
import com.google.ads.googleads.v0.services.CampaignServiceClient;
import com.google.ads.googleads.v0.services.CampaignSharedSetServiceClient;
import com.google.ads.googleads.v0.services.CarrierConstantServiceClient;
import com.google.ads.googleads.v0.services.ChangeStatusServiceClient;
import com.google.ads.googleads.v0.services.ConversionActionServiceClient;
import com.google.ads.googleads.v0.services.CustomerClientLinkServiceClient;
import com.google.ads.googleads.v0.services.CustomerClientServiceClient;
import com.google.ads.googleads.v0.services.CustomerFeedServiceClient;
import com.google.ads.googleads.v0.services.CustomerManagerLinkServiceClient;
import com.google.ads.googleads.v0.services.CustomerServiceClient;
import com.google.ads.googleads.v0.services.DisplayKeywordViewServiceClient;
import com.google.ads.googleads.v0.services.FeedItemServiceClient;
import com.google.ads.googleads.v0.services.FeedMappingServiceClient;
import com.google.ads.googleads.v0.services.FeedServiceClient;
import com.google.ads.googleads.v0.services.GenderViewServiceClient;
import com.google.ads.googleads.v0.services.GeoTargetConstantServiceClient;
import com.google.ads.googleads.v0.services.GoogleAdsFieldServiceClient;
import com.google.ads.googleads.v0.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v0.services.HotelGroupViewServiceClient;
import com.google.ads.googleads.v0.services.HotelPerformanceViewServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanAdGroupServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanCampaignServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanIdeaServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanKeywordServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanNegativeKeywordServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanServiceClient;
import com.google.ads.googleads.v0.services.KeywordViewServiceClient;
import com.google.ads.googleads.v0.services.LanguageConstantServiceClient;
import com.google.ads.googleads.v0.services.ManagedPlacementViewServiceClient;
import com.google.ads.googleads.v0.services.MediaFileServiceClient;
import com.google.ads.googleads.v0.services.MobileAppCategoryConstantServiceClient;
import com.google.ads.googleads.v0.services.MobileDeviceConstantServiceClient;
import com.google.ads.googleads.v0.services.OperatingSystemVersionConstantServiceClient;
import com.google.ads.googleads.v0.services.ParentalStatusViewServiceClient;
import com.google.ads.googleads.v0.services.PaymentsAccountServiceClient;
import com.google.ads.googleads.v0.services.ProductGroupViewServiceClient;
import com.google.ads.googleads.v0.services.RecommendationServiceClient;
import com.google.ads.googleads.v0.services.RemarketingActionServiceClient;
import com.google.ads.googleads.v0.services.SearchTermViewServiceClient;
import com.google.ads.googleads.v0.services.SharedCriterionServiceClient;
import com.google.ads.googleads.v0.services.SharedSetServiceClient;
import com.google.ads.googleads.v0.services.TopicConstantServiceClient;
import com.google.ads.googleads.v0.services.TopicViewServiceClient;
import com.google.ads.googleads.v0.services.UserInterestServiceClient;
import com.google.ads.googleads.v0.services.UserListServiceClient;
import com.google.ads.googleads.v0.services.VideoServiceClient;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.TransportChannel;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.auth.Credentials;
import com.google.auth.oauth2.UserCredentials;
import com.google.auto.value.AutoValue;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Supplier;
import javax.annotation.Nullable;
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
 * <p>If further customization of service clients or service settings is required, this class can
 * be used as a {@link TransportChannelProvider} to simplify the instantiation of subclasses of
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
    AutoValue_GoogleAdsClient.Builder clientBuilder = new AutoValue_GoogleAdsClient.Builder();
    InstantiatingGrpcChannelProvider transportChannelProvider = InstantiatingGrpcChannelProvider
        .newBuilder()
        .setInterceptorProvider(
            () -> ImmutableList.of(new LoggingInterceptor(new RequestLogger(),
                clientBuilder.getHeaders(),
                clientBuilder.getEndpoint())))
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

  /** Returns a new {@link GoogleAdsClient.Builder} with the properties as this instance. */
  public abstract Builder toBuilder();

  public abstract TransportChannelProvider getTransportChannelProvider();


  @Override
  public boolean shouldAutoClose() {
    return getTransportChannelProvider().shouldAutoClose();
  }

  @Override
  public boolean needsExecutor() {
    return getTransportChannelProvider().needsExecutor();
  }

  @Override
  public TransportChannelProvider withExecutor(ScheduledExecutorService scheduledExecutorService) {
    return getTransportChannelProvider().withExecutor(scheduledExecutorService);
  }

  @Override
  public boolean needsHeaders() {
    return getTransportChannelProvider().needsHeaders();
  }

  @Override
  public TransportChannelProvider withHeaders(Map<String, String> headers) {
    return getTransportChannelProvider().withHeaders(headers);
  }

  @Override
  public String getTransportName() {
    return getTransportChannelProvider().getTransportName();
  }

  @Override
  public boolean needsEndpoint() {
    return getTransportChannelProvider().needsEndpoint();
  }

  @Override
  public TransportChannel getTransportChannel() throws IOException {
    return getTransportChannelProvider().getTransportChannel();
  }

  @Override
  public TransportChannelProvider withEndpoint(String endpoint) {
    return getTransportChannelProvider().withEndpoint(endpoint);
  }

  @Override
  public boolean acceptsPoolSize() {
    return getTransportChannelProvider().acceptsPoolSize();
  }

  @Override
  public TransportChannelProvider withPoolSize(int i) {
    return getTransportChannelProvider().withPoolSize(i);
  }

  @Override
  public AccountBudgetProposalServiceClient getAccountBudgetProposalServiceClient() {
    return GrpcServiceDescriptor.get(AccountBudgetProposalServiceClient.class)
        .newServiceClient(this);
  }

  @Override
  public AccountBudgetServiceClient getAccountBudgetServiceClient() {
    return GrpcServiceDescriptor.get(AccountBudgetServiceClient.class).newServiceClient(this);
  }

  @Override
  public AdGroupAdServiceClient getAdGroupAdServiceClient() {
    return GrpcServiceDescriptor.get(AdGroupAdServiceClient.class).newServiceClient(this);
  }

  @Override
  public AdGroupAudienceViewServiceClient getAdGroupAudienceViewServiceClient() {
    return GrpcServiceDescriptor.get(AdGroupAudienceViewServiceClient.class).newServiceClient(this);
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
  public AdGroupFeedServiceClient getAdGroupFeedServiceClient() {
    return GrpcServiceDescriptor.get(AdGroupFeedServiceClient.class).newServiceClient(this);
  }

  @Override
  public AdGroupServiceClient getAdGroupServiceClient() {
    return GrpcServiceDescriptor.get(AdGroupServiceClient.class).newServiceClient(this);
  }

  @Override
  public AdParameterServiceClient getAdParameterServiceClient() {
    return GrpcServiceDescriptor.get(AdParameterServiceClient.class).newServiceClient(this);
  }

  @Override
  public AdScheduleViewServiceClient getAdScheduleViewServiceClient() {
    return GrpcServiceDescriptor.get(AdScheduleViewServiceClient.class).newServiceClient(this);
  }

  @Override
  public AgeRangeViewServiceClient getAgeRangeViewServiceClient() {
    return GrpcServiceDescriptor.get(AgeRangeViewServiceClient.class).newServiceClient(this);
  }

  @Override
  public BiddingStrategyServiceClient getBiddingStrategyServiceClient() {
    return GrpcServiceDescriptor.get(BiddingStrategyServiceClient.class).newServiceClient(this);
  }

  @Override
  public BillingSetupServiceClient getBillingSetupServiceClient() {
    return GrpcServiceDescriptor.get(BillingSetupServiceClient.class).newServiceClient(this);
  }

  @Override
  public CampaignAudienceViewServiceClient getCampaignAudienceViewServiceClient() {
    return GrpcServiceDescriptor.get(CampaignAudienceViewServiceClient.class)
        .newServiceClient(this);
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
  public CampaignFeedServiceClient getCampaignFeedServiceClient() {
    return GrpcServiceDescriptor.get(CampaignFeedServiceClient.class).newServiceClient(this);
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
  public CarrierConstantServiceClient getCarrierConstantServiceClient() {
    return GrpcServiceDescriptor.get(CarrierConstantServiceClient.class).newServiceClient(this);
  }

  @Override
  public ChangeStatusServiceClient getChangeStatusServiceClient() {
    return GrpcServiceDescriptor.get(ChangeStatusServiceClient.class).newServiceClient(this);
  }

  @Override
  public ConversionActionServiceClient getConversionActionServiceClient() {
    return GrpcServiceDescriptor.get(ConversionActionServiceClient.class).newServiceClient(this);
  }

  @Override
  public CustomerClientLinkServiceClient getCustomerClientLinkServiceClient() {
    return GrpcServiceDescriptor.get(CustomerClientLinkServiceClient.class).newServiceClient(this);
  }

  @Override
  public CustomerClientServiceClient getCustomerClientServiceClient() {
    return GrpcServiceDescriptor.get(CustomerClientServiceClient.class).newServiceClient(this);
  }

  @Override
  public CustomerFeedServiceClient getCustomerFeedServiceClient() {
    return GrpcServiceDescriptor.get(CustomerFeedServiceClient.class).newServiceClient(this);
  }

  @Override
  public CustomerManagerLinkServiceClient getCustomerManagerLinkServiceClient() {
    return GrpcServiceDescriptor.get(CustomerManagerLinkServiceClient.class).newServiceClient(this);
  }

  @Override
  public CustomerServiceClient getCustomerServiceClient() {
    return GrpcServiceDescriptor.get(CustomerServiceClient.class).newServiceClient(this);
  }

  @Override
  public DisplayKeywordViewServiceClient getDisplayKeywordViewServiceClient() {
    return GrpcServiceDescriptor.get(DisplayKeywordViewServiceClient.class).newServiceClient(this);
  }

  @Override
  public FeedItemServiceClient getFeedItemServiceClient() {
    return GrpcServiceDescriptor.get(FeedItemServiceClient.class).newServiceClient(this);
  }

  @Override
  public FeedMappingServiceClient getFeedMappingServiceClient() {
    return GrpcServiceDescriptor.get(FeedMappingServiceClient.class).newServiceClient(this);
  }

  @Override
  public FeedServiceClient getFeedServiceClient() {
    return GrpcServiceDescriptor.get(FeedServiceClient.class).newServiceClient(this);
  }

  @Override
  public GenderViewServiceClient getGenderViewServiceClient() {
    return GrpcServiceDescriptor.get(GenderViewServiceClient.class).newServiceClient(this);
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
  public HotelGroupViewServiceClient getHotelGroupViewServiceClient() {
    return GrpcServiceDescriptor.get(HotelGroupViewServiceClient.class).newServiceClient(this);
  }

  @Override
  public HotelPerformanceViewServiceClient getHotelPerformanceViewServiceClient() {
    return GrpcServiceDescriptor.get(HotelPerformanceViewServiceClient.class)
        .newServiceClient(this);
  }

  @Override
  public KeywordPlanAdGroupServiceClient getKeywordPlanAdGroupServiceClient() {
    return GrpcServiceDescriptor.get(KeywordPlanAdGroupServiceClient.class).newServiceClient(this);
  }

  @Override
  public KeywordPlanCampaignServiceClient getKeywordPlanCampaignServiceClient() {
    return GrpcServiceDescriptor.get(KeywordPlanCampaignServiceClient.class).newServiceClient(this);
  }

  @Override
  public KeywordPlanIdeaServiceClient getKeywordPlanIdeaServiceClient() {
    return GrpcServiceDescriptor.get(KeywordPlanIdeaServiceClient.class).newServiceClient(this);
  }

  @Override
  public KeywordPlanKeywordServiceClient getKeywordPlanKeywordServiceClient() {
    return GrpcServiceDescriptor.get(KeywordPlanKeywordServiceClient.class).newServiceClient(this);
  }

  @Override
  public KeywordPlanNegativeKeywordServiceClient getKeywordPlanNegativeKeywordServiceClient() {
    return GrpcServiceDescriptor.get(KeywordPlanNegativeKeywordServiceClient.class)
        .newServiceClient(this);
  }

  @Override
  public KeywordPlanServiceClient getKeywordPlanServiceClient() {
    return GrpcServiceDescriptor.get(KeywordPlanServiceClient.class).newServiceClient(this);
  }

  @Override
  public KeywordViewServiceClient getKeywordViewServiceClient() {
    return GrpcServiceDescriptor.get(KeywordViewServiceClient.class).newServiceClient(this);
  }

  @Override
  public LanguageConstantServiceClient getLanguageConstantServiceClient() {
    return GrpcServiceDescriptor.get(LanguageConstantServiceClient.class).newServiceClient(this);
  }

  @Override
  public ManagedPlacementViewServiceClient getManagedPlacementViewServiceClient() {
    return GrpcServiceDescriptor.get(ManagedPlacementViewServiceClient.class)
        .newServiceClient(this);
  }

  @Override
  public MediaFileServiceClient getMediaFileServiceClient() {
    return GrpcServiceDescriptor.get(MediaFileServiceClient.class).newServiceClient(this);
  }

  @Override
  public MobileAppCategoryConstantServiceClient getMobileAppCategoryConstantServiceClient() {
    return GrpcServiceDescriptor.get(MobileAppCategoryConstantServiceClient.class)
        .newServiceClient(this);
  }

  @Override
  public MobileDeviceConstantServiceClient getMobileDeviceConstantServiceClient() {
    return GrpcServiceDescriptor.get(MobileDeviceConstantServiceClient.class)
        .newServiceClient(this);
  }

  @Override
  public OperatingSystemVersionConstantServiceClient
      getOperatingSystemVersionConstantServiceClient() {
    return GrpcServiceDescriptor.get(OperatingSystemVersionConstantServiceClient.class)
        .newServiceClient(this);
  }

  @Override
  public ParentalStatusViewServiceClient getParentalStatusViewServiceClient() {
    return GrpcServiceDescriptor.get(ParentalStatusViewServiceClient.class).newServiceClient(this);
  }

  @Override
  public PaymentsAccountServiceClient getPaymentsAccountServiceClient() {
    return GrpcServiceDescriptor.get(PaymentsAccountServiceClient.class).newServiceClient(this);
  }

  @Override
  public ProductGroupViewServiceClient getProductGroupViewServiceClient() {
    return GrpcServiceDescriptor.get(ProductGroupViewServiceClient.class).newServiceClient(this);
  }

  @Override
  public RecommendationServiceClient getRecommendationServiceClient() {
    return GrpcServiceDescriptor.get(RecommendationServiceClient.class).newServiceClient(this);
  }

  @Override
  public RemarketingActionServiceClient getRemarketingActionServiceClient() {
    return GrpcServiceDescriptor.get(RemarketingActionServiceClient.class).newServiceClient(this);
  }

  @Override
  public SearchTermViewServiceClient getSearchTermViewServiceClient() {
    return GrpcServiceDescriptor.get(SearchTermViewServiceClient.class).newServiceClient(this);
  }

  @Override
  public SharedCriterionServiceClient getSharedCriterionServiceClient() {
    return GrpcServiceDescriptor.get(SharedCriterionServiceClient.class).newServiceClient(this);
  }

  @Override
  public SharedSetServiceClient getSharedSetServiceClient() {
    return GrpcServiceDescriptor.get(SharedSetServiceClient.class).newServiceClient(this);
  }

  @Override
  public TopicConstantServiceClient getTopicConstantServiceClient() {
    return GrpcServiceDescriptor.get(TopicConstantServiceClient.class).newServiceClient(this);
  }

  @Override
  public TopicViewServiceClient getTopicViewServiceClient() {
    return GrpcServiceDescriptor.get(TopicViewServiceClient.class).newServiceClient(this);
  }

  @Override
  public UserInterestServiceClient getUserInterestServiceClient() {
    return GrpcServiceDescriptor.get(UserInterestServiceClient.class).newServiceClient(this);
  }

  @Override
  public UserListServiceClient getUserListServiceClient() {
    return GrpcServiceDescriptor.get(UserListServiceClient.class).newServiceClient(this);
  }

  @Override
  public VideoServiceClient getVideoServiceClient() {
    return GrpcServiceDescriptor.get(VideoServiceClient.class).newServiceClient(this);
  }

  /** Builder for configuring and creating an instance of {@link GoogleAdsClient}. */
  @AutoValue.Builder
  public abstract static class Builder {

    /**
     * The default file name for the properties configuration file. This does <em>not</em> include a
     * path.
     */
    public static final String DEFAULT_PROPERTIES_CONFIG_FILE_NAME = "ads.properties";
    /**
     * Allows injecting a different default configuration file, instead of using {@value
     * #DEFAULT_PROPERTIES_CONFIG_FILE_NAME}. Only for testing.
     */
    private Supplier<File> configurationFileSupplier =
        () -> new File(System.getProperty("user.home"), DEFAULT_PROPERTIES_CONFIG_FILE_NAME);

    /**
     * Specifies the OAuth client ID, secret and refresh token. Use {@code
     * UserCredentials.newBuilder()} to build this object.
     *
     * <p>This field is marked nullable to facilitate testing of the client library. In practice,
     * all requests to Google Ads API must be authenticated.
     */
    public abstract Builder setCredentials(Credentials credentials);

    /** Sets the developer token used to obtain access to the Google Ads API. */
    public abstract Builder setDeveloperToken(String developerToken);

    /**
     * Optional: Overrides the default endpoint. For the default value see {@see #DEFAULT_ENDPOINT}
     */
    public abstract Builder setEndpoint(String endpoint);

    /**
     * Required for manager accounts only. When authenticating as a Google Ads manager account,
     * specifies the customer ID of the authenticating manager account.
     *
     * <p>If your OAuth credentials are for a user with access to multiple manager accounts you
     * must create a separate GoogleAdsClient instance for each manager account. Use {@code
     * toBuilder().setLoginCustomerId(...).build()} to change the loginCustomerId.
     */
    public abstract Builder setLoginCustomerId(Long customerId);

    /** Returns the TransportChannelProvider currently configured. */
    @VisibleForTesting
    abstract TransportChannelProvider getTransportChannelProvider();

    /** Sets the TransportChannelProvider to use. */
    @VisibleForTesting
    abstract Builder setTransportChannelProvider(TransportChannelProvider transportChannelProvider);

    /** Returns the developer token currently configured. */
    public abstract String getDeveloperToken();

    private void setDeveloperToken(Properties properties) {
      setDeveloperToken(properties.getProperty(ConfigPropertyKey.DEVELOPER_TOKEN.getPropertyKey()));
    }

    /** Returns the login customer ID currently configured. */
    public abstract Long getLoginCustomerId();

    private void setLoginCustomerId(Properties properties) {
      String configuredLoginCustomer =
          properties.getProperty(ConfigPropertyKey.LOGIN_CUSTOMER_ID.getPropertyKey());
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

    private void setEndpoint(Properties properties) {
      String endpoint =
          MoreObjects.firstNonNull(
              properties.getProperty(ConfigPropertyKey.ENDPOINT.getPropertyKey()),
              MoreObjects.firstNonNull(
                  System.getProperty(ConfigPropertyKey.ENDPOINT.getPropertyKey()),
                  DEFAULT_ENDPOINT));
      setEndpoint(endpoint);
    }

    abstract GoogleAdsClient autoBuild();

    /**
     * Loads the Google Ads Client configuration file from the default location: {@value
     * #DEFAULT_PROPERTIES_CONFIG_FILE_NAME}.
     *
     * @throws FileNotFoundException if the file does not exist.
     * @throws IOException if the file exists, but a failure occurs when trying to load
     *     properties from the file.
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
     * @throws IOException if the file exists, but a failure occurs when trying to load
     *     properties from the file.
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
     * @throws IllegalArgumentException if a failure occurs when trying to load properties from
     *     the file.
     */
    public Builder fromProperties(Properties properties) {
      setCredentials(properties);
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
          .build()
          .getHeaders();
    }

    /**
     * Returns a new instance of {@link GoogleAdsClient} based on the attributes of this builder.
     */
    public GoogleAdsClient build() {
      TransportChannelProvider transportChannelProvider = getTransportChannelProvider();
      if (transportChannelProvider.needsHeaders()) {
        transportChannelProvider = transportChannelProvider.withHeaders(getHeaders());
      }
      if (transportChannelProvider.needsEndpoint()) {
        transportChannelProvider = transportChannelProvider.withEndpoint(getEndpoint());
      }
      setTransportChannelProvider(transportChannelProvider);
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
    void setConfigurationFileSupplier(Supplier<File> configurationFileSupplier) {
      this.configurationFileSupplier = configurationFileSupplier;
    }

    private void setCredentials(Properties properties) {
      UserCredentials credentials =
          UserCredentials.newBuilder()
              .setClientId(properties.getProperty(ConfigPropertyKey.CLIENT_ID.getPropertyKey()))
              .setClientSecret(
                  properties.getProperty(ConfigPropertyKey.CLIENT_SECRET.getPropertyKey()))
              .setRefreshToken(
                  properties.getProperty(ConfigPropertyKey.REFRESH_TOKEN.getPropertyKey()))
              .build();
      setCredentials(credentials);
    }

    /** Enum of keys expected in the {@value DEFAULT_PROPERTIES_CONFIG_FILE_NAME}. */
    public enum ConfigPropertyKey {
      CLIENT_ID("api.googleads.clientId"),
      CLIENT_SECRET("api.googleads.clientSecret"),
      DEVELOPER_TOKEN("api.googleads.developerToken"),
      REFRESH_TOKEN("api.googleads.refreshToken"),
      ENDPOINT("api.googleads.endpoint"),
      LOGIN_CUSTOMER_ID("api.googleads.loginCustomerId");

      private final String key;

      ConfigPropertyKey(String key) {
        this.key = key;
      }

      /** The key corresponding to this config property. */
      public String getPropertyKey() {
        return key;
      }
    }
  }
}
