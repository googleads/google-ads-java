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

import com.google.ads.googleads.v0.services.AccountBudgetProposalServiceClient;
import com.google.ads.googleads.v0.services.AccountBudgetProposalServiceSettings;
import com.google.ads.googleads.v0.services.AccountBudgetServiceClient;
import com.google.ads.googleads.v0.services.AccountBudgetServiceSettings;
import com.google.ads.googleads.v0.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v0.services.AdGroupAdServiceSettings;
import com.google.ads.googleads.v0.services.AdGroupAudienceViewServiceClient;
import com.google.ads.googleads.v0.services.AdGroupAudienceViewServiceSettings;
import com.google.ads.googleads.v0.services.AdGroupBidModifierServiceClient;
import com.google.ads.googleads.v0.services.AdGroupBidModifierServiceSettings;
import com.google.ads.googleads.v0.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v0.services.AdGroupCriterionServiceSettings;
import com.google.ads.googleads.v0.services.AdGroupFeedServiceClient;
import com.google.ads.googleads.v0.services.AdGroupFeedServiceSettings;
import com.google.ads.googleads.v0.services.AdGroupServiceClient;
import com.google.ads.googleads.v0.services.AdGroupServiceSettings;
import com.google.ads.googleads.v0.services.AgeRangeViewServiceClient;
import com.google.ads.googleads.v0.services.AgeRangeViewServiceSettings;
import com.google.ads.googleads.v0.services.BiddingStrategyServiceClient;
import com.google.ads.googleads.v0.services.BiddingStrategyServiceSettings;
import com.google.ads.googleads.v0.services.BillingSetupServiceClient;
import com.google.ads.googleads.v0.services.BillingSetupServiceSettings;
import com.google.ads.googleads.v0.services.CampaignAudienceViewServiceClient;
import com.google.ads.googleads.v0.services.CampaignAudienceViewServiceSettings;
import com.google.ads.googleads.v0.services.CampaignBidModifierServiceClient;
import com.google.ads.googleads.v0.services.CampaignBidModifierServiceSettings;
import com.google.ads.googleads.v0.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v0.services.CampaignBudgetServiceSettings;
import com.google.ads.googleads.v0.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v0.services.CampaignCriterionServiceSettings;
import com.google.ads.googleads.v0.services.CampaignFeedServiceClient;
import com.google.ads.googleads.v0.services.CampaignFeedServiceSettings;
import com.google.ads.googleads.v0.services.CampaignGroupServiceClient;
import com.google.ads.googleads.v0.services.CampaignGroupServiceSettings;
import com.google.ads.googleads.v0.services.CampaignServiceClient;
import com.google.ads.googleads.v0.services.CampaignServiceSettings;
import com.google.ads.googleads.v0.services.CampaignSharedSetServiceClient;
import com.google.ads.googleads.v0.services.CampaignSharedSetServiceSettings;
import com.google.ads.googleads.v0.services.CarrierConstantServiceClient;
import com.google.ads.googleads.v0.services.CarrierConstantServiceSettings;
import com.google.ads.googleads.v0.services.ChangeStatusServiceClient;
import com.google.ads.googleads.v0.services.ChangeStatusServiceSettings;
import com.google.ads.googleads.v0.services.ConversionActionServiceClient;
import com.google.ads.googleads.v0.services.ConversionActionServiceSettings;
import com.google.ads.googleads.v0.services.CustomerClientLinkServiceClient;
import com.google.ads.googleads.v0.services.CustomerClientLinkServiceSettings;
import com.google.ads.googleads.v0.services.CustomerClientServiceClient;
import com.google.ads.googleads.v0.services.CustomerClientServiceSettings;
import com.google.ads.googleads.v0.services.CustomerFeedServiceClient;
import com.google.ads.googleads.v0.services.CustomerFeedServiceSettings;
import com.google.ads.googleads.v0.services.CustomerManagerLinkServiceClient;
import com.google.ads.googleads.v0.services.CustomerManagerLinkServiceSettings;
import com.google.ads.googleads.v0.services.CustomerServiceClient;
import com.google.ads.googleads.v0.services.CustomerServiceSettings;
import com.google.ads.googleads.v0.services.DisplayKeywordViewServiceClient;
import com.google.ads.googleads.v0.services.DisplayKeywordViewServiceSettings;
import com.google.ads.googleads.v0.services.FeedItemServiceClient;
import com.google.ads.googleads.v0.services.FeedItemServiceSettings;
import com.google.ads.googleads.v0.services.FeedMappingServiceClient;
import com.google.ads.googleads.v0.services.FeedMappingServiceSettings;
import com.google.ads.googleads.v0.services.FeedServiceClient;
import com.google.ads.googleads.v0.services.FeedServiceSettings;
import com.google.ads.googleads.v0.services.GenderViewServiceClient;
import com.google.ads.googleads.v0.services.GenderViewServiceSettings;
import com.google.ads.googleads.v0.services.GeoTargetConstantServiceClient;
import com.google.ads.googleads.v0.services.GeoTargetConstantServiceSettings;
import com.google.ads.googleads.v0.services.GoogleAdsFieldServiceClient;
import com.google.ads.googleads.v0.services.GoogleAdsFieldServiceSettings;
import com.google.ads.googleads.v0.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v0.services.GoogleAdsServiceSettings;
import com.google.ads.googleads.v0.services.HotelGroupViewServiceClient;
import com.google.ads.googleads.v0.services.HotelGroupViewServiceSettings;
import com.google.ads.googleads.v0.services.HotelPerformanceViewServiceClient;
import com.google.ads.googleads.v0.services.HotelPerformanceViewServiceSettings;
import com.google.ads.googleads.v0.services.KeywordPlanAdGroupServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanAdGroupServiceSettings;
import com.google.ads.googleads.v0.services.KeywordPlanCampaignServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanCampaignServiceSettings;
import com.google.ads.googleads.v0.services.KeywordPlanIdeaServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanIdeaServiceSettings;
import com.google.ads.googleads.v0.services.KeywordPlanKeywordServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanKeywordServiceSettings;
import com.google.ads.googleads.v0.services.KeywordPlanNegativeKeywordServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanNegativeKeywordServiceSettings;
import com.google.ads.googleads.v0.services.KeywordPlanServiceClient;
import com.google.ads.googleads.v0.services.KeywordPlanServiceSettings;
import com.google.ads.googleads.v0.services.KeywordViewServiceClient;
import com.google.ads.googleads.v0.services.KeywordViewServiceSettings;
import com.google.ads.googleads.v0.services.LanguageConstantServiceClient;
import com.google.ads.googleads.v0.services.LanguageConstantServiceSettings;
import com.google.ads.googleads.v0.services.ManagedPlacementViewServiceClient;
import com.google.ads.googleads.v0.services.ManagedPlacementViewServiceSettings;
import com.google.ads.googleads.v0.services.MediaFileServiceClient;
import com.google.ads.googleads.v0.services.MediaFileServiceSettings;
import com.google.ads.googleads.v0.services.ParentalStatusViewServiceClient;
import com.google.ads.googleads.v0.services.ParentalStatusViewServiceSettings;
import com.google.ads.googleads.v0.services.PaymentsAccountServiceClient;
import com.google.ads.googleads.v0.services.PaymentsAccountServiceSettings;
import com.google.ads.googleads.v0.services.ProductGroupViewServiceClient;
import com.google.ads.googleads.v0.services.ProductGroupViewServiceSettings;
import com.google.ads.googleads.v0.services.RecommendationServiceClient;
import com.google.ads.googleads.v0.services.RecommendationServiceSettings;
import com.google.ads.googleads.v0.services.SearchTermViewServiceClient;
import com.google.ads.googleads.v0.services.SearchTermViewServiceSettings;
import com.google.ads.googleads.v0.services.SharedCriterionServiceClient;
import com.google.ads.googleads.v0.services.SharedCriterionServiceSettings;
import com.google.ads.googleads.v0.services.SharedSetServiceClient;
import com.google.ads.googleads.v0.services.SharedSetServiceSettings;
import com.google.ads.googleads.v0.services.TopicConstantServiceClient;
import com.google.ads.googleads.v0.services.TopicConstantServiceSettings;
import com.google.ads.googleads.v0.services.TopicViewServiceClient;
import com.google.ads.googleads.v0.services.TopicViewServiceSettings;
import com.google.ads.googleads.v0.services.UserInterestServiceClient;
import com.google.ads.googleads.v0.services.UserInterestServiceSettings;
import com.google.ads.googleads.v0.services.UserListServiceClient;
import com.google.ads.googleads.v0.services.UserListServiceSettings;
import com.google.ads.googleads.v0.services.VideoServiceClient;
import com.google.ads.googleads.v0.services.VideoServiceSettings;
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.gax.rpc.ClientSettings;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.io.IOException;

/** A descriptor for a service to support creation of service clients without reflection. */
abstract class GrpcServiceDescriptor<ClientT, SettingsBuilderT extends ClientSettings.Builder> {

  /** Map from service client class to the corresponding descriptor instance. */
  private static final ImmutableMap<
          Class<?>, GrpcServiceDescriptor<?, ? extends ClientSettings.Builder>>
      DESCRIPTOR_MAP =
          ImmutableMap
              .<Class<?>, GrpcServiceDescriptor<?, ? extends ClientSettings.Builder>>builder()
              .put(
                  AccountBudgetProposalServiceClient.class,
                  new AccountBudgetProposalServiceDescriptor())
              .put(AccountBudgetServiceClient.class, new AccountBudgetServiceDescriptor())
              .put(AdGroupAdServiceClient.class, new AdGroupAdServiceDescriptor())
              .put(
                  AdGroupAudienceViewServiceClient.class,
                  new AdGroupAudienceViewServiceDescriptor())
              .put(AdGroupBidModifierServiceClient.class, new AdGroupBidModifierServiceDescriptor())
              .put(AdGroupCriterionServiceClient.class, new AdGroupCriterionServiceDescriptor())
              .put(AdGroupFeedServiceClient.class, new AdGroupFeedServiceDescriptor())
              .put(AdGroupServiceClient.class, new AdGroupServiceDescriptor())
              .put(AgeRangeViewServiceClient.class, new AgeRangeViewServiceDescriptor())
              .put(BiddingStrategyServiceClient.class, new BiddingStrategyServiceDescriptor())
              .put(BillingSetupServiceClient.class, new BillingSetupServiceDescriptor())
              .put(
                  CampaignAudienceViewServiceClient.class,
                  new CampaignAudienceViewServiceDescriptor())
              .put(
                  CampaignBidModifierServiceClient.class,
                  new CampaignBidModifierServiceDescriptor())
              .put(CampaignBudgetServiceClient.class, new CampaignBudgetServiceDescriptor())
              .put(CampaignCriterionServiceClient.class, new CampaignCriterionServiceDescriptor())
              .put(CampaignFeedServiceClient.class, new CampaignFeedServiceDescriptor())
              .put(CampaignGroupServiceClient.class, new CampaignGroupServiceDescriptor())
              .put(CampaignServiceClient.class, new CampaignServiceDescriptor())
              .put(CampaignSharedSetServiceClient.class, new CampaignSharedSetServiceDescriptor())
              .put(CarrierConstantServiceClient.class, new CarrierConstantServiceDescriptor())
              .put(ChangeStatusServiceClient.class, new ChangeStatusServiceDescriptor())
              .put(ConversionActionServiceClient.class, new ConversionActionServiceDescriptor())
              .put(CustomerClientLinkServiceClient.class, new CustomerClientLinkServiceDescriptor())
              .put(CustomerClientServiceClient.class, new CustomerClientServiceDescriptor())
              .put(CustomerFeedServiceClient.class, new CustomerFeedServiceDescriptor())
              .put(
                  CustomerManagerLinkServiceClient.class,
                  new CustomerManagerLinkServiceDescriptor())
              .put(CustomerServiceClient.class, new CustomerServiceDescriptor())
              .put(DisplayKeywordViewServiceClient.class, new DisplayKeywordViewServiceDescriptor())
              .put(FeedItemServiceClient.class, new FeedItemServiceDescriptor())
              .put(FeedMappingServiceClient.class, new FeedMappingServiceDescriptor())
              .put(FeedServiceClient.class, new FeedServiceDescriptor())
              .put(GenderViewServiceClient.class, new GenderViewServiceDescriptor())
              .put(GeoTargetConstantServiceClient.class, new GeoTargetConstantServiceDescriptor())
              .put(GoogleAdsFieldServiceClient.class, new GoogleAdsFieldServiceDescriptor())
              .put(GoogleAdsServiceClient.class, new GoogleAdsServiceDescriptor())
              .put(HotelGroupViewServiceClient.class, new HotelGroupViewServiceDescriptor())
              .put(
                  HotelPerformanceViewServiceClient.class,
                  new HotelPerformanceViewServiceDescriptor())
              .put(KeywordPlanAdGroupServiceClient.class, new KeywordPlanAdGroupServiceDescriptor())
              .put(
                  KeywordPlanCampaignServiceClient.class,
                  new KeywordPlanCampaignServiceDescriptor())
              .put(KeywordPlanIdeaServiceClient.class, new KeywordPlanIdeaServiceDescriptor())
              .put(KeywordPlanKeywordServiceClient.class, new KeywordPlanKeywordServiceDescriptor())
              .put(
                  KeywordPlanNegativeKeywordServiceClient.class,
                  new KeywordPlanNegativeKeywordServiceDescriptor())
              .put(KeywordPlanServiceClient.class, new KeywordPlanServiceDescriptor())
              .put(KeywordViewServiceClient.class, new KeywordViewServiceDescriptor())
              .put(LanguageConstantServiceClient.class, new LanguageConstantServiceDescriptor())
              .put(
                  ManagedPlacementViewServiceClient.class,
                  new ManagedPlacementViewServiceDescriptor())
              .put(MediaFileServiceClient.class, new MediaFileServiceDescriptor())
              .put(ParentalStatusViewServiceClient.class, new ParentalStatusViewServiceDescriptor())
              .put(PaymentsAccountServiceClient.class, new PaymentsAccountServiceDescriptor())
              .put(ProductGroupViewServiceClient.class, new ProductGroupViewServiceDescriptor())
              .put(RecommendationServiceClient.class, new RecommendationServiceDescriptor())
              .put(SearchTermViewServiceClient.class, new SearchTermViewServiceDescriptor())
              .put(SharedCriterionServiceClient.class, new SharedCriterionServiceDescriptor())
              .put(SharedSetServiceClient.class, new SharedSetServiceDescriptor())
              .put(TopicConstantServiceClient.class, new TopicConstantServiceDescriptor())
              .put(TopicViewServiceClient.class, new TopicViewServiceDescriptor())
              .put(UserInterestServiceClient.class, new UserInterestServiceDescriptor())
              .put(UserListServiceClient.class, new UserListServiceDescriptor())
              .put(VideoServiceClient.class, new VideoServiceDescriptor())
              .build();

  private GrpcServiceDescriptor() {
    // Only private subclasses allowed.
  }

  /**
   * Returns the service descriptor for the specified {@code serviceClientClass}.
   *
   * @param serviceClientClass the service client class, e.g., {@code ReportFieldServiceClient}.
   * @throws NullPointerException if {@code serviceClientClass == null}.
   * @throws IllegalArgumentException if no service descriptor exists for the specified {@code
   *     serviceClientClass}.
   */
  public static <ClientT, SettingsBuilderT extends ClientSettings.Builder>
      GrpcServiceDescriptor<ClientT, SettingsBuilderT> get(Class<ClientT> serviceClientClass) {
    Preconditions.checkNotNull(serviceClientClass, "Null service client class");
    @SuppressWarnings("unchecked") // The DESCRIPTOR_MAP ensures this cast is safe.
    GrpcServiceDescriptor<ClientT, SettingsBuilderT> descriptor =
        (GrpcServiceDescriptor<ClientT, SettingsBuilderT>) DESCRIPTOR_MAP.get(serviceClientClass);
    if (descriptor == null) {
      throw new IllegalArgumentException(
          "No service descriptor found for service client class: " + serviceClientClass);
    }
    return descriptor;
  }

  @VisibleForTesting
  static ImmutableSet<Class<?>> getAllServiceClientClasses() {
    return DESCRIPTOR_MAP.keySet();
  }

  /**
   * Returns a new instance of the service client for this descriptor.
   *
   * @throws ServiceClientCreationException if the creation process fails.
   */
  public abstract ClientT newServiceClient(GoogleAdsClient googleAdsClient)
      throws ServiceClientCreationException;

  // Subclasses of GrpcServiceDescriptor for each supported service:
  private static final class AccountBudgetProposalServiceDescriptor
      extends GrpcServiceDescriptor<
          AccountBudgetProposalServiceClient, AccountBudgetProposalServiceSettings.Builder> {

    @Override
    public AccountBudgetProposalServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return AccountBudgetProposalServiceClient.create(
            AccountBudgetProposalServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class AccountBudgetServiceDescriptor
      extends GrpcServiceDescriptor<
          AccountBudgetServiceClient, AccountBudgetServiceSettings.Builder> {

    @Override
    public AccountBudgetServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return AccountBudgetServiceClient.create(
            AccountBudgetServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class AdGroupAdServiceDescriptor
      extends GrpcServiceDescriptor<AdGroupAdServiceClient, AdGroupAdServiceSettings.Builder> {

    @Override
    public AdGroupAdServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return AdGroupAdServiceClient.create(
            AdGroupAdServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class AdGroupAudienceViewServiceDescriptor
      extends GrpcServiceDescriptor<
          AdGroupAudienceViewServiceClient, AdGroupAudienceViewServiceSettings.Builder> {

    @Override
    public AdGroupAudienceViewServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return AdGroupAudienceViewServiceClient.create(
            AdGroupAudienceViewServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class AdGroupBidModifierServiceDescriptor
      extends GrpcServiceDescriptor<
          AdGroupBidModifierServiceClient, AdGroupBidModifierServiceSettings.Builder> {

    @Override
    public AdGroupBidModifierServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return AdGroupBidModifierServiceClient.create(
            AdGroupBidModifierServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class AdGroupCriterionServiceDescriptor
      extends GrpcServiceDescriptor<
          AdGroupCriterionServiceClient, AdGroupCriterionServiceSettings.Builder> {

    @Override
    public AdGroupCriterionServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return AdGroupCriterionServiceClient.create(
            AdGroupCriterionServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class AdGroupFeedServiceDescriptor
      extends GrpcServiceDescriptor<AdGroupFeedServiceClient, AdGroupFeedServiceSettings.Builder> {

    @Override
    public AdGroupFeedServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return AdGroupFeedServiceClient.create(
            AdGroupFeedServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class AdGroupServiceDescriptor
      extends GrpcServiceDescriptor<AdGroupServiceClient, AdGroupServiceSettings.Builder> {

    @Override
    public AdGroupServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return AdGroupServiceClient.create(
            AdGroupServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class AgeRangeViewServiceDescriptor
      extends GrpcServiceDescriptor<
          AgeRangeViewServiceClient, AgeRangeViewServiceSettings.Builder> {

    @Override
    public AgeRangeViewServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return AgeRangeViewServiceClient.create(
            AgeRangeViewServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class BiddingStrategyServiceDescriptor
      extends GrpcServiceDescriptor<
          BiddingStrategyServiceClient, BiddingStrategyServiceSettings.Builder> {

    @Override
    public BiddingStrategyServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return BiddingStrategyServiceClient.create(
            BiddingStrategyServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class BillingSetupServiceDescriptor
      extends GrpcServiceDescriptor<
          BillingSetupServiceClient, BillingSetupServiceSettings.Builder> {

    @Override
    public BillingSetupServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return BillingSetupServiceClient.create(
            BillingSetupServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class CampaignAudienceViewServiceDescriptor
      extends GrpcServiceDescriptor<
          CampaignAudienceViewServiceClient, CampaignAudienceViewServiceSettings.Builder> {

    @Override
    public CampaignAudienceViewServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return CampaignAudienceViewServiceClient.create(
            CampaignAudienceViewServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class CampaignBidModifierServiceDescriptor
      extends GrpcServiceDescriptor<
          CampaignBidModifierServiceClient, CampaignBidModifierServiceSettings.Builder> {

    @Override
    public CampaignBidModifierServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return CampaignBidModifierServiceClient.create(
            CampaignBidModifierServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class CampaignBudgetServiceDescriptor
      extends GrpcServiceDescriptor<
          CampaignBudgetServiceClient, CampaignBudgetServiceSettings.Builder> {

    @Override
    public CampaignBudgetServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return CampaignBudgetServiceClient.create(
            CampaignBudgetServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class CampaignCriterionServiceDescriptor
      extends GrpcServiceDescriptor<
          CampaignCriterionServiceClient, CampaignCriterionServiceSettings.Builder> {

    @Override
    public CampaignCriterionServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return CampaignCriterionServiceClient.create(
            CampaignCriterionServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class CampaignFeedServiceDescriptor
      extends GrpcServiceDescriptor<
          CampaignFeedServiceClient, CampaignFeedServiceSettings.Builder> {

    @Override
    public CampaignFeedServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return CampaignFeedServiceClient.create(
            CampaignFeedServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class CampaignGroupServiceDescriptor
      extends GrpcServiceDescriptor<
          CampaignGroupServiceClient, CampaignGroupServiceSettings.Builder> {

    @Override
    public CampaignGroupServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return CampaignGroupServiceClient.create(
            CampaignGroupServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class CampaignServiceDescriptor
      extends GrpcServiceDescriptor<CampaignServiceClient, CampaignServiceSettings.Builder> {

    @Override
    public CampaignServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return CampaignServiceClient.create(
            CampaignServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class CampaignSharedSetServiceDescriptor
      extends GrpcServiceDescriptor<
          CampaignSharedSetServiceClient, CampaignSharedSetServiceSettings.Builder> {

    @Override
    public CampaignSharedSetServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return CampaignSharedSetServiceClient.create(
            CampaignSharedSetServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class CarrierConstantServiceDescriptor
      extends GrpcServiceDescriptor<
          CarrierConstantServiceClient, CarrierConstantServiceSettings.Builder> {

    @Override
    public CarrierConstantServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return CarrierConstantServiceClient.create(
            CarrierConstantServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class ChangeStatusServiceDescriptor
      extends GrpcServiceDescriptor<
          ChangeStatusServiceClient, ChangeStatusServiceSettings.Builder> {

    @Override
    public ChangeStatusServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return ChangeStatusServiceClient.create(
            ChangeStatusServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class ConversionActionServiceDescriptor
      extends GrpcServiceDescriptor<
          ConversionActionServiceClient, ConversionActionServiceSettings.Builder> {

    @Override
    public ConversionActionServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return ConversionActionServiceClient.create(
            ConversionActionServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class CustomerClientLinkServiceDescriptor
      extends GrpcServiceDescriptor<
          CustomerClientLinkServiceClient, CustomerClientLinkServiceSettings.Builder> {

    @Override
    public CustomerClientLinkServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return CustomerClientLinkServiceClient.create(
            CustomerClientLinkServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class CustomerClientServiceDescriptor
      extends GrpcServiceDescriptor<
          CustomerClientServiceClient, CustomerClientServiceSettings.Builder> {

    @Override
    public CustomerClientServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return CustomerClientServiceClient.create(
            CustomerClientServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class CustomerFeedServiceDescriptor
      extends GrpcServiceDescriptor<
          CustomerFeedServiceClient, CustomerFeedServiceSettings.Builder> {

    @Override
    public CustomerFeedServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return CustomerFeedServiceClient.create(
            CustomerFeedServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class CustomerManagerLinkServiceDescriptor
      extends GrpcServiceDescriptor<
          CustomerManagerLinkServiceClient, CustomerManagerLinkServiceSettings.Builder> {

    @Override
    public CustomerManagerLinkServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return CustomerManagerLinkServiceClient.create(
            CustomerManagerLinkServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class CustomerServiceDescriptor
      extends GrpcServiceDescriptor<CustomerServiceClient, CustomerServiceSettings.Builder> {

    @Override
    public CustomerServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return CustomerServiceClient.create(
            CustomerServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class DisplayKeywordViewServiceDescriptor
      extends GrpcServiceDescriptor<
          DisplayKeywordViewServiceClient, DisplayKeywordViewServiceSettings.Builder> {

    @Override
    public DisplayKeywordViewServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return DisplayKeywordViewServiceClient.create(
            DisplayKeywordViewServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class FeedItemServiceDescriptor
      extends GrpcServiceDescriptor<FeedItemServiceClient, FeedItemServiceSettings.Builder> {

    @Override
    public FeedItemServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return FeedItemServiceClient.create(
            FeedItemServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class FeedMappingServiceDescriptor
      extends GrpcServiceDescriptor<FeedMappingServiceClient, FeedMappingServiceSettings.Builder> {

    @Override
    public FeedMappingServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return FeedMappingServiceClient.create(
            FeedMappingServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class FeedServiceDescriptor
      extends GrpcServiceDescriptor<FeedServiceClient, FeedServiceSettings.Builder> {

    @Override
    public FeedServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return FeedServiceClient.create(
            FeedServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class GenderViewServiceDescriptor
      extends GrpcServiceDescriptor<GenderViewServiceClient, GenderViewServiceSettings.Builder> {

    @Override
    public GenderViewServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return GenderViewServiceClient.create(
            GenderViewServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class GeoTargetConstantServiceDescriptor
      extends GrpcServiceDescriptor<
          GeoTargetConstantServiceClient, GeoTargetConstantServiceSettings.Builder> {

    @Override
    public GeoTargetConstantServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return GeoTargetConstantServiceClient.create(
            GeoTargetConstantServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class GoogleAdsFieldServiceDescriptor
      extends GrpcServiceDescriptor<
          GoogleAdsFieldServiceClient, GoogleAdsFieldServiceSettings.Builder> {

    @Override
    public GoogleAdsFieldServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return GoogleAdsFieldServiceClient.create(
            GoogleAdsFieldServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class GoogleAdsServiceDescriptor
      extends GrpcServiceDescriptor<GoogleAdsServiceClient, GoogleAdsServiceSettings.Builder> {

    @Override
    public GoogleAdsServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return GoogleAdsServiceClient.create(
            GoogleAdsServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class HotelGroupViewServiceDescriptor
      extends GrpcServiceDescriptor<
          HotelGroupViewServiceClient, HotelGroupViewServiceSettings.Builder> {

    @Override
    public HotelGroupViewServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return HotelGroupViewServiceClient.create(
            HotelGroupViewServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class HotelPerformanceViewServiceDescriptor
      extends GrpcServiceDescriptor<
          HotelPerformanceViewServiceClient, HotelPerformanceViewServiceSettings.Builder> {

    @Override
    public HotelPerformanceViewServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return HotelPerformanceViewServiceClient.create(
            HotelPerformanceViewServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class KeywordPlanAdGroupServiceDescriptor
      extends GrpcServiceDescriptor<
          KeywordPlanAdGroupServiceClient, KeywordPlanAdGroupServiceSettings.Builder> {

    @Override
    public KeywordPlanAdGroupServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return KeywordPlanAdGroupServiceClient.create(
            KeywordPlanAdGroupServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class KeywordPlanCampaignServiceDescriptor
      extends GrpcServiceDescriptor<
          KeywordPlanCampaignServiceClient, KeywordPlanCampaignServiceSettings.Builder> {

    @Override
    public KeywordPlanCampaignServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return KeywordPlanCampaignServiceClient.create(
            KeywordPlanCampaignServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class KeywordPlanIdeaServiceDescriptor
      extends GrpcServiceDescriptor<
          KeywordPlanIdeaServiceClient, KeywordPlanIdeaServiceSettings.Builder> {

    @Override
    public KeywordPlanIdeaServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return KeywordPlanIdeaServiceClient.create(
            KeywordPlanIdeaServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class KeywordPlanKeywordServiceDescriptor
      extends GrpcServiceDescriptor<
          KeywordPlanKeywordServiceClient, KeywordPlanKeywordServiceSettings.Builder> {

    @Override
    public KeywordPlanKeywordServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return KeywordPlanKeywordServiceClient.create(
            KeywordPlanKeywordServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class KeywordPlanNegativeKeywordServiceDescriptor
      extends GrpcServiceDescriptor<
          KeywordPlanNegativeKeywordServiceClient,
          KeywordPlanNegativeKeywordServiceSettings.Builder> {

    @Override
    public KeywordPlanNegativeKeywordServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return KeywordPlanNegativeKeywordServiceClient.create(
            KeywordPlanNegativeKeywordServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class KeywordPlanServiceDescriptor
      extends GrpcServiceDescriptor<KeywordPlanServiceClient, KeywordPlanServiceSettings.Builder> {

    @Override
    public KeywordPlanServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return KeywordPlanServiceClient.create(
            KeywordPlanServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class KeywordViewServiceDescriptor
      extends GrpcServiceDescriptor<KeywordViewServiceClient, KeywordViewServiceSettings.Builder> {

    @Override
    public KeywordViewServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return KeywordViewServiceClient.create(
            KeywordViewServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class LanguageConstantServiceDescriptor
      extends GrpcServiceDescriptor<
          LanguageConstantServiceClient, LanguageConstantServiceSettings.Builder> {

    @Override
    public LanguageConstantServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return LanguageConstantServiceClient.create(
            LanguageConstantServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class ManagedPlacementViewServiceDescriptor
      extends GrpcServiceDescriptor<
          ManagedPlacementViewServiceClient, ManagedPlacementViewServiceSettings.Builder> {

    @Override
    public ManagedPlacementViewServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return ManagedPlacementViewServiceClient.create(
            ManagedPlacementViewServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class MediaFileServiceDescriptor
      extends GrpcServiceDescriptor<MediaFileServiceClient, MediaFileServiceSettings.Builder> {

    @Override
    public MediaFileServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return MediaFileServiceClient.create(
            MediaFileServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class ParentalStatusViewServiceDescriptor
      extends GrpcServiceDescriptor<
          ParentalStatusViewServiceClient, ParentalStatusViewServiceSettings.Builder> {

    @Override
    public ParentalStatusViewServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return ParentalStatusViewServiceClient.create(
            ParentalStatusViewServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class PaymentsAccountServiceDescriptor
      extends GrpcServiceDescriptor<
          PaymentsAccountServiceClient, PaymentsAccountServiceSettings.Builder> {

    @Override
    public PaymentsAccountServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return PaymentsAccountServiceClient.create(
            PaymentsAccountServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class ProductGroupViewServiceDescriptor
      extends GrpcServiceDescriptor<
          ProductGroupViewServiceClient, ProductGroupViewServiceSettings.Builder> {

    @Override
    public ProductGroupViewServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return ProductGroupViewServiceClient.create(
            ProductGroupViewServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class RecommendationServiceDescriptor
      extends GrpcServiceDescriptor<
          RecommendationServiceClient, RecommendationServiceSettings.Builder> {

    @Override
    public RecommendationServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return RecommendationServiceClient.create(
            RecommendationServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class SearchTermViewServiceDescriptor
      extends GrpcServiceDescriptor<
          SearchTermViewServiceClient, SearchTermViewServiceSettings.Builder> {

    @Override
    public SearchTermViewServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return SearchTermViewServiceClient.create(
            SearchTermViewServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class SharedCriterionServiceDescriptor
      extends GrpcServiceDescriptor<
          SharedCriterionServiceClient, SharedCriterionServiceSettings.Builder> {

    @Override
    public SharedCriterionServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return SharedCriterionServiceClient.create(
            SharedCriterionServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class SharedSetServiceDescriptor
      extends GrpcServiceDescriptor<SharedSetServiceClient, SharedSetServiceSettings.Builder> {

    @Override
    public SharedSetServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return SharedSetServiceClient.create(
            SharedSetServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class TopicConstantServiceDescriptor
      extends GrpcServiceDescriptor<
          TopicConstantServiceClient, TopicConstantServiceSettings.Builder> {

    @Override
    public TopicConstantServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return TopicConstantServiceClient.create(
            TopicConstantServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class TopicViewServiceDescriptor
      extends GrpcServiceDescriptor<TopicViewServiceClient, TopicViewServiceSettings.Builder> {

    @Override
    public TopicViewServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return TopicViewServiceClient.create(
            TopicViewServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class UserInterestServiceDescriptor
      extends GrpcServiceDescriptor<
          UserInterestServiceClient, UserInterestServiceSettings.Builder> {

    @Override
    public UserInterestServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return UserInterestServiceClient.create(
            UserInterestServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class UserListServiceDescriptor
      extends GrpcServiceDescriptor<UserListServiceClient, UserListServiceSettings.Builder> {

    @Override
    public UserListServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return UserListServiceClient.create(
            UserListServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }

  private static final class VideoServiceDescriptor
      extends GrpcServiceDescriptor<VideoServiceClient, VideoServiceSettings.Builder> {

    @Override
    public VideoServiceClient newServiceClient(GoogleAdsClient googleAdsClient)
        throws ServiceClientCreationException {
      try {
        return VideoServiceClient.create(
            VideoServiceSettings.newBuilder()
                .setTransportChannelProvider(googleAdsClient)
                .setCredentialsProvider(
                    FixedCredentialsProvider.create(googleAdsClient.getCredentials()))
                .build());
      } catch (IOException ioe) {
        throw new ServiceClientCreationException(this, ioe);
      }
    }
  }
}
