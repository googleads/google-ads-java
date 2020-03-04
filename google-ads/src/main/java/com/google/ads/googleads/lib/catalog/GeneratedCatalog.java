// Copyright 2019 Google LLC
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
package com.google.ads.googleads.lib.catalog;

import com.google.ads.googleads.lib.GoogleAdsAllVersions;
import com.google.ads.googleads.v2.services.AccountBudgetProposalServiceClient;
import com.google.ads.googleads.v2.services.AccountBudgetProposalServiceSettings;
import com.google.ads.googleads.v2.services.AccountBudgetServiceClient;
import com.google.ads.googleads.v2.services.AccountBudgetServiceSettings;
import com.google.ads.googleads.v2.services.AdGroupAdAssetViewServiceClient;
import com.google.ads.googleads.v2.services.AdGroupAdAssetViewServiceSettings;
import com.google.ads.googleads.v2.services.AdGroupAdLabelServiceClient;
import com.google.ads.googleads.v2.services.AdGroupAdLabelServiceSettings;
import com.google.ads.googleads.v2.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v2.services.AdGroupAdServiceSettings;
import com.google.ads.googleads.v2.services.AdGroupAudienceViewServiceClient;
import com.google.ads.googleads.v2.services.AdGroupAudienceViewServiceSettings;
import com.google.ads.googleads.v2.services.AdGroupBidModifierServiceClient;
import com.google.ads.googleads.v2.services.AdGroupBidModifierServiceSettings;
import com.google.ads.googleads.v2.services.AdGroupCriterionLabelServiceClient;
import com.google.ads.googleads.v2.services.AdGroupCriterionLabelServiceSettings;
import com.google.ads.googleads.v2.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v2.services.AdGroupCriterionServiceSettings;
import com.google.ads.googleads.v2.services.AdGroupCriterionSimulationServiceClient;
import com.google.ads.googleads.v2.services.AdGroupCriterionSimulationServiceSettings;
import com.google.ads.googleads.v2.services.AdGroupExtensionSettingServiceClient;
import com.google.ads.googleads.v2.services.AdGroupExtensionSettingServiceSettings;
import com.google.ads.googleads.v2.services.AdGroupFeedServiceClient;
import com.google.ads.googleads.v2.services.AdGroupFeedServiceSettings;
import com.google.ads.googleads.v2.services.AdGroupLabelServiceClient;
import com.google.ads.googleads.v2.services.AdGroupLabelServiceSettings;
import com.google.ads.googleads.v2.services.AdGroupServiceClient;
import com.google.ads.googleads.v2.services.AdGroupServiceSettings;
import com.google.ads.googleads.v2.services.AdGroupSimulationServiceClient;
import com.google.ads.googleads.v2.services.AdGroupSimulationServiceSettings;
import com.google.ads.googleads.v2.services.AdParameterServiceClient;
import com.google.ads.googleads.v2.services.AdParameterServiceSettings;
import com.google.ads.googleads.v2.services.AdScheduleViewServiceClient;
import com.google.ads.googleads.v2.services.AdScheduleViewServiceSettings;
import com.google.ads.googleads.v2.services.AdServiceClient;
import com.google.ads.googleads.v2.services.AdServiceSettings;
import com.google.ads.googleads.v2.services.AgeRangeViewServiceClient;
import com.google.ads.googleads.v2.services.AgeRangeViewServiceSettings;
import com.google.ads.googleads.v2.services.AssetServiceClient;
import com.google.ads.googleads.v2.services.AssetServiceSettings;
import com.google.ads.googleads.v2.services.BiddingStrategyServiceClient;
import com.google.ads.googleads.v2.services.BiddingStrategyServiceSettings;
import com.google.ads.googleads.v2.services.BillingSetupServiceClient;
import com.google.ads.googleads.v2.services.BillingSetupServiceSettings;
import com.google.ads.googleads.v2.services.CampaignAudienceViewServiceClient;
import com.google.ads.googleads.v2.services.CampaignAudienceViewServiceSettings;
import com.google.ads.googleads.v2.services.CampaignBidModifierServiceClient;
import com.google.ads.googleads.v2.services.CampaignBidModifierServiceSettings;
import com.google.ads.googleads.v2.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v2.services.CampaignBudgetServiceSettings;
import com.google.ads.googleads.v2.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v2.services.CampaignCriterionServiceSettings;
import com.google.ads.googleads.v2.services.CampaignCriterionSimulationServiceClient;
import com.google.ads.googleads.v2.services.CampaignCriterionSimulationServiceSettings;
import com.google.ads.googleads.v2.services.CampaignDraftServiceClient;
import com.google.ads.googleads.v2.services.CampaignDraftServiceSettings;
import com.google.ads.googleads.v2.services.CampaignExperimentServiceClient;
import com.google.ads.googleads.v2.services.CampaignExperimentServiceSettings;
import com.google.ads.googleads.v2.services.CampaignExtensionSettingServiceClient;
import com.google.ads.googleads.v2.services.CampaignExtensionSettingServiceSettings;
import com.google.ads.googleads.v2.services.CampaignFeedServiceClient;
import com.google.ads.googleads.v2.services.CampaignFeedServiceSettings;
import com.google.ads.googleads.v2.services.CampaignLabelServiceClient;
import com.google.ads.googleads.v2.services.CampaignLabelServiceSettings;
import com.google.ads.googleads.v2.services.CampaignServiceClient;
import com.google.ads.googleads.v2.services.CampaignServiceSettings;
import com.google.ads.googleads.v2.services.CampaignSharedSetServiceClient;
import com.google.ads.googleads.v2.services.CampaignSharedSetServiceSettings;
import com.google.ads.googleads.v2.services.CarrierConstantServiceClient;
import com.google.ads.googleads.v2.services.CarrierConstantServiceSettings;
import com.google.ads.googleads.v2.services.ChangeStatusServiceClient;
import com.google.ads.googleads.v2.services.ChangeStatusServiceSettings;
import com.google.ads.googleads.v2.services.ClickViewServiceClient;
import com.google.ads.googleads.v2.services.ClickViewServiceSettings;
import com.google.ads.googleads.v2.services.ConversionActionServiceClient;
import com.google.ads.googleads.v2.services.ConversionActionServiceSettings;
import com.google.ads.googleads.v2.services.ConversionAdjustmentUploadServiceClient;
import com.google.ads.googleads.v2.services.ConversionAdjustmentUploadServiceSettings;
import com.google.ads.googleads.v2.services.ConversionUploadServiceClient;
import com.google.ads.googleads.v2.services.ConversionUploadServiceSettings;
import com.google.ads.googleads.v2.services.CustomInterestServiceClient;
import com.google.ads.googleads.v2.services.CustomInterestServiceSettings;
import com.google.ads.googleads.v2.services.CustomerClientLinkServiceClient;
import com.google.ads.googleads.v2.services.CustomerClientLinkServiceSettings;
import com.google.ads.googleads.v2.services.CustomerClientServiceClient;
import com.google.ads.googleads.v2.services.CustomerClientServiceSettings;
import com.google.ads.googleads.v2.services.CustomerExtensionSettingServiceClient;
import com.google.ads.googleads.v2.services.CustomerExtensionSettingServiceSettings;
import com.google.ads.googleads.v2.services.CustomerFeedServiceClient;
import com.google.ads.googleads.v2.services.CustomerFeedServiceSettings;
import com.google.ads.googleads.v2.services.CustomerLabelServiceClient;
import com.google.ads.googleads.v2.services.CustomerLabelServiceSettings;
import com.google.ads.googleads.v2.services.CustomerManagerLinkServiceClient;
import com.google.ads.googleads.v2.services.CustomerManagerLinkServiceSettings;
import com.google.ads.googleads.v2.services.CustomerNegativeCriterionServiceClient;
import com.google.ads.googleads.v2.services.CustomerNegativeCriterionServiceSettings;
import com.google.ads.googleads.v2.services.CustomerServiceClient;
import com.google.ads.googleads.v2.services.CustomerServiceSettings;
import com.google.ads.googleads.v2.services.DetailPlacementViewServiceClient;
import com.google.ads.googleads.v2.services.DetailPlacementViewServiceSettings;
import com.google.ads.googleads.v2.services.DisplayKeywordViewServiceClient;
import com.google.ads.googleads.v2.services.DisplayKeywordViewServiceSettings;
import com.google.ads.googleads.v2.services.DistanceViewServiceClient;
import com.google.ads.googleads.v2.services.DistanceViewServiceSettings;
import com.google.ads.googleads.v2.services.DomainCategoryServiceClient;
import com.google.ads.googleads.v2.services.DomainCategoryServiceSettings;
import com.google.ads.googleads.v2.services.DynamicSearchAdsSearchTermViewServiceClient;
import com.google.ads.googleads.v2.services.DynamicSearchAdsSearchTermViewServiceSettings;
import com.google.ads.googleads.v2.services.ExpandedLandingPageViewServiceClient;
import com.google.ads.googleads.v2.services.ExpandedLandingPageViewServiceSettings;
import com.google.ads.googleads.v2.services.ExtensionFeedItemServiceClient;
import com.google.ads.googleads.v2.services.ExtensionFeedItemServiceSettings;
import com.google.ads.googleads.v2.services.FeedItemServiceClient;
import com.google.ads.googleads.v2.services.FeedItemServiceSettings;
import com.google.ads.googleads.v2.services.FeedItemTargetServiceClient;
import com.google.ads.googleads.v2.services.FeedItemTargetServiceSettings;
import com.google.ads.googleads.v2.services.FeedMappingServiceClient;
import com.google.ads.googleads.v2.services.FeedMappingServiceSettings;
import com.google.ads.googleads.v2.services.FeedPlaceholderViewServiceClient;
import com.google.ads.googleads.v2.services.FeedPlaceholderViewServiceSettings;
import com.google.ads.googleads.v2.services.FeedServiceClient;
import com.google.ads.googleads.v2.services.FeedServiceSettings;
import com.google.ads.googleads.v2.services.GenderViewServiceClient;
import com.google.ads.googleads.v2.services.GenderViewServiceSettings;
import com.google.ads.googleads.v2.services.GeoTargetConstantServiceClient;
import com.google.ads.googleads.v2.services.GeoTargetConstantServiceSettings;
import com.google.ads.googleads.v2.services.GeographicViewServiceClient;
import com.google.ads.googleads.v2.services.GeographicViewServiceSettings;
import com.google.ads.googleads.v2.services.GoogleAdsFieldServiceClient;
import com.google.ads.googleads.v2.services.GoogleAdsFieldServiceSettings;
import com.google.ads.googleads.v2.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v2.services.GoogleAdsServiceSettings;
import com.google.ads.googleads.v2.services.GoogleAdsVersion;
import com.google.ads.googleads.v2.services.GroupPlacementViewServiceClient;
import com.google.ads.googleads.v2.services.GroupPlacementViewServiceSettings;
import com.google.ads.googleads.v2.services.HotelGroupViewServiceClient;
import com.google.ads.googleads.v2.services.HotelGroupViewServiceSettings;
import com.google.ads.googleads.v2.services.HotelPerformanceViewServiceClient;
import com.google.ads.googleads.v2.services.HotelPerformanceViewServiceSettings;
import com.google.ads.googleads.v2.services.InvoiceServiceClient;
import com.google.ads.googleads.v2.services.InvoiceServiceSettings;
import com.google.ads.googleads.v2.services.KeywordPlanAdGroupServiceClient;
import com.google.ads.googleads.v2.services.KeywordPlanAdGroupServiceSettings;
import com.google.ads.googleads.v2.services.KeywordPlanCampaignServiceClient;
import com.google.ads.googleads.v2.services.KeywordPlanCampaignServiceSettings;
import com.google.ads.googleads.v2.services.KeywordPlanIdeaServiceClient;
import com.google.ads.googleads.v2.services.KeywordPlanIdeaServiceSettings;
import com.google.ads.googleads.v2.services.KeywordPlanKeywordServiceClient;
import com.google.ads.googleads.v2.services.KeywordPlanKeywordServiceSettings;
import com.google.ads.googleads.v2.services.KeywordPlanNegativeKeywordServiceClient;
import com.google.ads.googleads.v2.services.KeywordPlanNegativeKeywordServiceSettings;
import com.google.ads.googleads.v2.services.KeywordPlanServiceClient;
import com.google.ads.googleads.v2.services.KeywordPlanServiceSettings;
import com.google.ads.googleads.v2.services.KeywordViewServiceClient;
import com.google.ads.googleads.v2.services.KeywordViewServiceSettings;
import com.google.ads.googleads.v2.services.LabelServiceClient;
import com.google.ads.googleads.v2.services.LabelServiceSettings;
import com.google.ads.googleads.v2.services.LandingPageViewServiceClient;
import com.google.ads.googleads.v2.services.LandingPageViewServiceSettings;
import com.google.ads.googleads.v2.services.LanguageConstantServiceClient;
import com.google.ads.googleads.v2.services.LanguageConstantServiceSettings;
import com.google.ads.googleads.v2.services.LocationViewServiceClient;
import com.google.ads.googleads.v2.services.LocationViewServiceSettings;
import com.google.ads.googleads.v2.services.ManagedPlacementViewServiceClient;
import com.google.ads.googleads.v2.services.ManagedPlacementViewServiceSettings;
import com.google.ads.googleads.v2.services.MediaFileServiceClient;
import com.google.ads.googleads.v2.services.MediaFileServiceSettings;
import com.google.ads.googleads.v2.services.MerchantCenterLinkServiceClient;
import com.google.ads.googleads.v2.services.MerchantCenterLinkServiceSettings;
import com.google.ads.googleads.v2.services.MobileAppCategoryConstantServiceClient;
import com.google.ads.googleads.v2.services.MobileAppCategoryConstantServiceSettings;
import com.google.ads.googleads.v2.services.MobileDeviceConstantServiceClient;
import com.google.ads.googleads.v2.services.MobileDeviceConstantServiceSettings;
import com.google.ads.googleads.v2.services.MutateJobServiceClient;
import com.google.ads.googleads.v2.services.MutateJobServiceSettings;
import com.google.ads.googleads.v2.services.OperatingSystemVersionConstantServiceClient;
import com.google.ads.googleads.v2.services.OperatingSystemVersionConstantServiceSettings;
import com.google.ads.googleads.v2.services.PaidOrganicSearchTermViewServiceClient;
import com.google.ads.googleads.v2.services.PaidOrganicSearchTermViewServiceSettings;
import com.google.ads.googleads.v2.services.ParentalStatusViewServiceClient;
import com.google.ads.googleads.v2.services.ParentalStatusViewServiceSettings;
import com.google.ads.googleads.v2.services.PaymentsAccountServiceClient;
import com.google.ads.googleads.v2.services.PaymentsAccountServiceSettings;
import com.google.ads.googleads.v2.services.ProductBiddingCategoryConstantServiceClient;
import com.google.ads.googleads.v2.services.ProductBiddingCategoryConstantServiceSettings;
import com.google.ads.googleads.v2.services.ProductGroupViewServiceClient;
import com.google.ads.googleads.v2.services.ProductGroupViewServiceSettings;
import com.google.ads.googleads.v2.services.ReachPlanServiceClient;
import com.google.ads.googleads.v2.services.ReachPlanServiceSettings;
import com.google.ads.googleads.v2.services.RecommendationServiceClient;
import com.google.ads.googleads.v2.services.RecommendationServiceSettings;
import com.google.ads.googleads.v2.services.RemarketingActionServiceClient;
import com.google.ads.googleads.v2.services.RemarketingActionServiceSettings;
import com.google.ads.googleads.v2.services.SearchTermViewServiceClient;
import com.google.ads.googleads.v2.services.SearchTermViewServiceSettings;
import com.google.ads.googleads.v2.services.SharedCriterionServiceClient;
import com.google.ads.googleads.v2.services.SharedCriterionServiceSettings;
import com.google.ads.googleads.v2.services.SharedSetServiceClient;
import com.google.ads.googleads.v2.services.SharedSetServiceSettings;
import com.google.ads.googleads.v2.services.ShoppingPerformanceViewServiceClient;
import com.google.ads.googleads.v2.services.ShoppingPerformanceViewServiceSettings;
import com.google.ads.googleads.v2.services.TopicConstantServiceClient;
import com.google.ads.googleads.v2.services.TopicConstantServiceSettings;
import com.google.ads.googleads.v2.services.TopicViewServiceClient;
import com.google.ads.googleads.v2.services.TopicViewServiceSettings;
import com.google.ads.googleads.v2.services.UserInterestServiceClient;
import com.google.ads.googleads.v2.services.UserInterestServiceSettings;
import com.google.ads.googleads.v2.services.UserListServiceClient;
import com.google.ads.googleads.v2.services.UserListServiceSettings;
import com.google.ads.googleads.v2.services.UserLocationViewServiceClient;
import com.google.ads.googleads.v2.services.UserLocationViewServiceSettings;
import com.google.ads.googleads.v2.services.VideoServiceClient;
import com.google.ads.googleads.v2.services.VideoServiceSettings;
import com.google.ads.googleads.v3.services.CurrencyConstantServiceClient;
import com.google.ads.googleads.v3.services.CurrencyConstantServiceSettings;
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.auth.Credentials;
import com.google.common.collect.ImmutableSortedSet;
import java.io.IOException;
import java.lang.Override;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.annotation.Generated;

@Generated("by a class not included in this version of the library")
class GeneratedCatalog implements ApiCatalog {

  private static final ApiCatalog INSTANCE =
      new GeneratedCatalog(VersionDescriptorLoader
          .forVersionList(GoogleAdsAllVersions.class).getVersions());

  private final ImmutableSortedSet<Version> supportedVersions;

  /**
   * Creates a new constant catalog from a known collection of versions
   */
  private GeneratedCatalog(Collection<Version> versions) {
    supportedVersions = ImmutableSortedSet.copyOf(new TreeSet<>(versions));
  }

  static ApiCatalog getDefault() {
    return INSTANCE;
  }

  @Override
  public SortedSet<Version> getSupportedVersions() {
    return supportedVersions;
  }

  @Override
  public Version getLatestVersion() {
    return getSupportedVersions().first();
  }

  @Override
  public GoogleAdsAllVersions createAllVersionsClient(TransportChannelProvider provider,
      Credentials credentials) {
    return new GoogleAdsAllVersions() {
      @Override
      public GoogleAdsVersion getVersion2() {
        return new V2Client(provider, credentials);
      }

      @Override
      public com.google.ads.googleads.v1.services.GoogleAdsVersion getVersion1() {
        return new V1Client(provider, credentials);
      }

      @Override
      public com.google.ads.googleads.v3.services.GoogleAdsVersion getVersion3() {
        return new V3Client(provider, credentials);
      }

      @Override
      public com.google.ads.googleads.v3.services.GoogleAdsVersion getLatestVersion() {
        return getVersion3();
      }
    };
  }

  private static class V2Client implements GoogleAdsVersion {

    private final TransportChannelProvider provider;

    private final Credentials credentials;

    public V2Client(TransportChannelProvider provider, Credentials credentials) {
      this.provider = provider;
      this.credentials = credentials;
    }

    @Override
    public AdGroupAdServiceClient createAdGroupAdServiceClient() {
      try {
        AdGroupAdServiceSettings settings =
            AdGroupAdServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdGroupAdServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AccountBudgetServiceClient createAccountBudgetServiceClient() {
      try {
        AccountBudgetServiceSettings settings =
            AccountBudgetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AccountBudgetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AccountBudgetProposalServiceClient createAccountBudgetProposalServiceClient() {
      try {
        AccountBudgetProposalServiceSettings settings =
            AccountBudgetProposalServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AccountBudgetProposalServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AdGroupAdAssetViewServiceClient createAdGroupAdAssetViewServiceClient() {
      try {
        AdGroupAdAssetViewServiceSettings settings =
            AdGroupAdAssetViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdGroupAdAssetViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AdGroupAdLabelServiceClient createAdGroupAdLabelServiceClient() {
      try {
        AdGroupAdLabelServiceSettings settings =
            AdGroupAdLabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdGroupAdLabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AdGroupAudienceViewServiceClient createAdGroupAudienceViewServiceClient() {
      try {
        AdGroupAudienceViewServiceSettings settings =
            AdGroupAudienceViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdGroupAudienceViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AdGroupBidModifierServiceClient createAdGroupBidModifierServiceClient() {
      try {
        AdGroupBidModifierServiceSettings settings =
            AdGroupBidModifierServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdGroupBidModifierServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AdGroupCriterionLabelServiceClient createAdGroupCriterionLabelServiceClient() {
      try {
        AdGroupCriterionLabelServiceSettings settings =
            AdGroupCriterionLabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdGroupCriterionLabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AdGroupCriterionServiceClient createAdGroupCriterionServiceClient() {
      try {
        AdGroupCriterionServiceSettings settings =
            AdGroupCriterionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdGroupCriterionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AdGroupCriterionSimulationServiceClient createAdGroupCriterionSimulationServiceClient() {
      try {
        AdGroupCriterionSimulationServiceSettings settings =
            AdGroupCriterionSimulationServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdGroupCriterionSimulationServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AdGroupExtensionSettingServiceClient createAdGroupExtensionSettingServiceClient() {
      try {
        AdGroupExtensionSettingServiceSettings settings =
            AdGroupExtensionSettingServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdGroupExtensionSettingServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AdGroupFeedServiceClient createAdGroupFeedServiceClient() {
      try {
        AdGroupFeedServiceSettings settings =
            AdGroupFeedServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdGroupFeedServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AdGroupLabelServiceClient createAdGroupLabelServiceClient() {
      try {
        AdGroupLabelServiceSettings settings =
            AdGroupLabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdGroupLabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AdGroupServiceClient createAdGroupServiceClient() {
      try {
        AdGroupServiceSettings settings =
            AdGroupServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdGroupServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AdGroupSimulationServiceClient createAdGroupSimulationServiceClient() {
      try {
        AdGroupSimulationServiceSettings settings =
            AdGroupSimulationServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdGroupSimulationServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AdParameterServiceClient createAdParameterServiceClient() {
      try {
        AdParameterServiceSettings settings =
            AdParameterServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdParameterServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AdScheduleViewServiceClient createAdScheduleViewServiceClient() {
      try {
        AdScheduleViewServiceSettings settings =
            AdScheduleViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdScheduleViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AdServiceClient createAdServiceClient() {
      try {
        AdServiceSettings settings =
            AdServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AdServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AgeRangeViewServiceClient createAgeRangeViewServiceClient() {
      try {
        AgeRangeViewServiceSettings settings =
            AgeRangeViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AgeRangeViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public AssetServiceClient createAssetServiceClient() {
      try {
        AssetServiceSettings settings =
            AssetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return AssetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public BiddingStrategyServiceClient createBiddingStrategyServiceClient() {
      try {
        BiddingStrategyServiceSettings settings =
            BiddingStrategyServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return BiddingStrategyServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public BillingSetupServiceClient createBillingSetupServiceClient() {
      try {
        BillingSetupServiceSettings settings =
            BillingSetupServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return BillingSetupServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CampaignAudienceViewServiceClient createCampaignAudienceViewServiceClient() {
      try {
        CampaignAudienceViewServiceSettings settings =
            CampaignAudienceViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CampaignAudienceViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CampaignBidModifierServiceClient createCampaignBidModifierServiceClient() {
      try {
        CampaignBidModifierServiceSettings settings =
            CampaignBidModifierServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CampaignBidModifierServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CampaignBudgetServiceClient createCampaignBudgetServiceClient() {
      try {
        CampaignBudgetServiceSettings settings =
            CampaignBudgetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CampaignBudgetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CampaignCriterionServiceClient createCampaignCriterionServiceClient() {
      try {
        CampaignCriterionServiceSettings settings =
            CampaignCriterionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CampaignCriterionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CampaignCriterionSimulationServiceClient createCampaignCriterionSimulationServiceClient(
    ) {
      try {
        CampaignCriterionSimulationServiceSettings settings =
            CampaignCriterionSimulationServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CampaignCriterionSimulationServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CampaignDraftServiceClient createCampaignDraftServiceClient() {
      try {
        CampaignDraftServiceSettings settings =
            CampaignDraftServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CampaignDraftServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CampaignExperimentServiceClient createCampaignExperimentServiceClient() {
      try {
        CampaignExperimentServiceSettings settings =
            CampaignExperimentServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CampaignExperimentServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CampaignExtensionSettingServiceClient createCampaignExtensionSettingServiceClient() {
      try {
        CampaignExtensionSettingServiceSettings settings =
            CampaignExtensionSettingServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CampaignExtensionSettingServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CampaignFeedServiceClient createCampaignFeedServiceClient() {
      try {
        CampaignFeedServiceSettings settings =
            CampaignFeedServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CampaignFeedServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CampaignLabelServiceClient createCampaignLabelServiceClient() {
      try {
        CampaignLabelServiceSettings settings =
            CampaignLabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CampaignLabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CampaignServiceClient createCampaignServiceClient() {
      try {
        CampaignServiceSettings settings =
            CampaignServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CampaignServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CampaignSharedSetServiceClient createCampaignSharedSetServiceClient() {
      try {
        CampaignSharedSetServiceSettings settings =
            CampaignSharedSetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CampaignSharedSetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CarrierConstantServiceClient createCarrierConstantServiceClient() {
      try {
        CarrierConstantServiceSettings settings =
            CarrierConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CarrierConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public ChangeStatusServiceClient createChangeStatusServiceClient() {
      try {
        ChangeStatusServiceSettings settings =
            ChangeStatusServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return ChangeStatusServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public ClickViewServiceClient createClickViewServiceClient() {
      try {
        ClickViewServiceSettings settings =
            ClickViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return ClickViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public ConversionActionServiceClient createConversionActionServiceClient() {
      try {
        ConversionActionServiceSettings settings =
            ConversionActionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return ConversionActionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public ConversionAdjustmentUploadServiceClient createConversionAdjustmentUploadServiceClient() {
      try {
        ConversionAdjustmentUploadServiceSettings settings =
            ConversionAdjustmentUploadServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return ConversionAdjustmentUploadServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public ConversionUploadServiceClient createConversionUploadServiceClient() {
      try {
        ConversionUploadServiceSettings settings =
            ConversionUploadServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return ConversionUploadServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CustomerClientLinkServiceClient createCustomerClientLinkServiceClient() {
      try {
        CustomerClientLinkServiceSettings settings =
            CustomerClientLinkServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CustomerClientLinkServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CustomerClientServiceClient createCustomerClientServiceClient() {
      try {
        CustomerClientServiceSettings settings =
            CustomerClientServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CustomerClientServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CustomerExtensionSettingServiceClient createCustomerExtensionSettingServiceClient() {
      try {
        CustomerExtensionSettingServiceSettings settings =
            CustomerExtensionSettingServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CustomerExtensionSettingServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CustomerFeedServiceClient createCustomerFeedServiceClient() {
      try {
        CustomerFeedServiceSettings settings =
            CustomerFeedServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CustomerFeedServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CustomerLabelServiceClient createCustomerLabelServiceClient() {
      try {
        CustomerLabelServiceSettings settings =
            CustomerLabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CustomerLabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CustomerManagerLinkServiceClient createCustomerManagerLinkServiceClient() {
      try {
        CustomerManagerLinkServiceSettings settings =
            CustomerManagerLinkServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CustomerManagerLinkServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CustomerNegativeCriterionServiceClient createCustomerNegativeCriterionServiceClient() {
      try {
        CustomerNegativeCriterionServiceSettings settings =
            CustomerNegativeCriterionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CustomerNegativeCriterionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CustomerServiceClient createCustomerServiceClient() {
      try {
        CustomerServiceSettings settings =
            CustomerServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CustomerServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CustomInterestServiceClient createCustomInterestServiceClient() {
      try {
        CustomInterestServiceSettings settings =
            CustomInterestServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CustomInterestServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public DetailPlacementViewServiceClient createDetailPlacementViewServiceClient() {
      try {
        DetailPlacementViewServiceSettings settings =
            DetailPlacementViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return DetailPlacementViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public DisplayKeywordViewServiceClient createDisplayKeywordViewServiceClient() {
      try {
        DisplayKeywordViewServiceSettings settings =
            DisplayKeywordViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return DisplayKeywordViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public DistanceViewServiceClient createDistanceViewServiceClient() {
      try {
        DistanceViewServiceSettings settings =
            DistanceViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return DistanceViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public DomainCategoryServiceClient createDomainCategoryServiceClient() {
      try {
        DomainCategoryServiceSettings settings =
            DomainCategoryServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return DomainCategoryServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public DynamicSearchAdsSearchTermViewServiceClient createDynamicSearchAdsSearchTermViewServiceClient(
    ) {
      try {
        DynamicSearchAdsSearchTermViewServiceSettings settings =
            DynamicSearchAdsSearchTermViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return DynamicSearchAdsSearchTermViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public ExpandedLandingPageViewServiceClient createExpandedLandingPageViewServiceClient() {
      try {
        ExpandedLandingPageViewServiceSettings settings =
            ExpandedLandingPageViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return ExpandedLandingPageViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public ExtensionFeedItemServiceClient createExtensionFeedItemServiceClient() {
      try {
        ExtensionFeedItemServiceSettings settings =
            ExtensionFeedItemServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return ExtensionFeedItemServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public FeedItemServiceClient createFeedItemServiceClient() {
      try {
        FeedItemServiceSettings settings =
            FeedItemServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return FeedItemServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public FeedItemTargetServiceClient createFeedItemTargetServiceClient() {
      try {
        FeedItemTargetServiceSettings settings =
            FeedItemTargetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return FeedItemTargetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public FeedMappingServiceClient createFeedMappingServiceClient() {
      try {
        FeedMappingServiceSettings settings =
            FeedMappingServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return FeedMappingServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public FeedPlaceholderViewServiceClient createFeedPlaceholderViewServiceClient() {
      try {
        FeedPlaceholderViewServiceSettings settings =
            FeedPlaceholderViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return FeedPlaceholderViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public FeedServiceClient createFeedServiceClient() {
      try {
        FeedServiceSettings settings =
            FeedServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return FeedServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public GenderViewServiceClient createGenderViewServiceClient() {
      try {
        GenderViewServiceSettings settings =
            GenderViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return GenderViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public GeographicViewServiceClient createGeographicViewServiceClient() {
      try {
        GeographicViewServiceSettings settings =
            GeographicViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return GeographicViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public GeoTargetConstantServiceClient createGeoTargetConstantServiceClient() {
      try {
        GeoTargetConstantServiceSettings settings =
            GeoTargetConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return GeoTargetConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public GoogleAdsFieldServiceClient createGoogleAdsFieldServiceClient() {
      try {
        GoogleAdsFieldServiceSettings settings =
            GoogleAdsFieldServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return GoogleAdsFieldServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public GoogleAdsServiceClient createGoogleAdsServiceClient() {
      try {
        GoogleAdsServiceSettings settings =
            GoogleAdsServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return GoogleAdsServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public GroupPlacementViewServiceClient createGroupPlacementViewServiceClient() {
      try {
        GroupPlacementViewServiceSettings settings =
            GroupPlacementViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return GroupPlacementViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public HotelGroupViewServiceClient createHotelGroupViewServiceClient() {
      try {
        HotelGroupViewServiceSettings settings =
            HotelGroupViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return HotelGroupViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public HotelPerformanceViewServiceClient createHotelPerformanceViewServiceClient() {
      try {
        HotelPerformanceViewServiceSettings settings =
            HotelPerformanceViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return HotelPerformanceViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public InvoiceServiceClient createInvoiceServiceClient() {
      try {
        InvoiceServiceSettings settings =
            InvoiceServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return InvoiceServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public KeywordPlanAdGroupServiceClient createKeywordPlanAdGroupServiceClient() {
      try {
        KeywordPlanAdGroupServiceSettings settings =
            KeywordPlanAdGroupServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return KeywordPlanAdGroupServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public KeywordPlanCampaignServiceClient createKeywordPlanCampaignServiceClient() {
      try {
        KeywordPlanCampaignServiceSettings settings =
            KeywordPlanCampaignServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return KeywordPlanCampaignServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public KeywordPlanIdeaServiceClient createKeywordPlanIdeaServiceClient() {
      try {
        KeywordPlanIdeaServiceSettings settings =
            KeywordPlanIdeaServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return KeywordPlanIdeaServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public KeywordPlanKeywordServiceClient createKeywordPlanKeywordServiceClient() {
      try {
        KeywordPlanKeywordServiceSettings settings =
            KeywordPlanKeywordServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return KeywordPlanKeywordServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public KeywordPlanNegativeKeywordServiceClient createKeywordPlanNegativeKeywordServiceClient() {
      try {
        KeywordPlanNegativeKeywordServiceSettings settings =
            KeywordPlanNegativeKeywordServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return KeywordPlanNegativeKeywordServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public KeywordPlanServiceClient createKeywordPlanServiceClient() {
      try {
        KeywordPlanServiceSettings settings =
            KeywordPlanServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return KeywordPlanServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public KeywordViewServiceClient createKeywordViewServiceClient() {
      try {
        KeywordViewServiceSettings settings =
            KeywordViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return KeywordViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public LabelServiceClient createLabelServiceClient() {
      try {
        LabelServiceSettings settings =
            LabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return LabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public LandingPageViewServiceClient createLandingPageViewServiceClient() {
      try {
        LandingPageViewServiceSettings settings =
            LandingPageViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return LandingPageViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public LanguageConstantServiceClient createLanguageConstantServiceClient() {
      try {
        LanguageConstantServiceSettings settings =
            LanguageConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return LanguageConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public LocationViewServiceClient createLocationViewServiceClient() {
      try {
        LocationViewServiceSettings settings =
            LocationViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return LocationViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public ManagedPlacementViewServiceClient createManagedPlacementViewServiceClient() {
      try {
        ManagedPlacementViewServiceSettings settings =
            ManagedPlacementViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return ManagedPlacementViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public MediaFileServiceClient createMediaFileServiceClient() {
      try {
        MediaFileServiceSettings settings =
            MediaFileServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return MediaFileServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public MerchantCenterLinkServiceClient createMerchantCenterLinkServiceClient() {
      try {
        MerchantCenterLinkServiceSettings settings =
            MerchantCenterLinkServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return MerchantCenterLinkServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public MobileAppCategoryConstantServiceClient createMobileAppCategoryConstantServiceClient() {
      try {
        MobileAppCategoryConstantServiceSettings settings =
            MobileAppCategoryConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return MobileAppCategoryConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public MobileDeviceConstantServiceClient createMobileDeviceConstantServiceClient() {
      try {
        MobileDeviceConstantServiceSettings settings =
            MobileDeviceConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return MobileDeviceConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public MutateJobServiceClient createMutateJobServiceClient() {
      try {
        MutateJobServiceSettings settings =
            MutateJobServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return MutateJobServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public OperatingSystemVersionConstantServiceClient createOperatingSystemVersionConstantServiceClient(
    ) {
      try {
        OperatingSystemVersionConstantServiceSettings settings =
            OperatingSystemVersionConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return OperatingSystemVersionConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public PaidOrganicSearchTermViewServiceClient createPaidOrganicSearchTermViewServiceClient() {
      try {
        PaidOrganicSearchTermViewServiceSettings settings =
            PaidOrganicSearchTermViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return PaidOrganicSearchTermViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public ParentalStatusViewServiceClient createParentalStatusViewServiceClient() {
      try {
        ParentalStatusViewServiceSettings settings =
            ParentalStatusViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return ParentalStatusViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public PaymentsAccountServiceClient createPaymentsAccountServiceClient() {
      try {
        PaymentsAccountServiceSettings settings =
            PaymentsAccountServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return PaymentsAccountServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public ProductBiddingCategoryConstantServiceClient createProductBiddingCategoryConstantServiceClient(
    ) {
      try {
        ProductBiddingCategoryConstantServiceSettings settings =
            ProductBiddingCategoryConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return ProductBiddingCategoryConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public ProductGroupViewServiceClient createProductGroupViewServiceClient() {
      try {
        ProductGroupViewServiceSettings settings =
            ProductGroupViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return ProductGroupViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public ReachPlanServiceClient createReachPlanServiceClient() {
      try {
        ReachPlanServiceSettings settings =
            ReachPlanServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return ReachPlanServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public RecommendationServiceClient createRecommendationServiceClient() {
      try {
        RecommendationServiceSettings settings =
            RecommendationServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return RecommendationServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public RemarketingActionServiceClient createRemarketingActionServiceClient() {
      try {
        RemarketingActionServiceSettings settings =
            RemarketingActionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return RemarketingActionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public SearchTermViewServiceClient createSearchTermViewServiceClient() {
      try {
        SearchTermViewServiceSettings settings =
            SearchTermViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return SearchTermViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public SharedCriterionServiceClient createSharedCriterionServiceClient() {
      try {
        SharedCriterionServiceSettings settings =
            SharedCriterionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return SharedCriterionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public SharedSetServiceClient createSharedSetServiceClient() {
      try {
        SharedSetServiceSettings settings =
            SharedSetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return SharedSetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public ShoppingPerformanceViewServiceClient createShoppingPerformanceViewServiceClient() {
      try {
        ShoppingPerformanceViewServiceSettings settings =
            ShoppingPerformanceViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return ShoppingPerformanceViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public TopicConstantServiceClient createTopicConstantServiceClient() {
      try {
        TopicConstantServiceSettings settings =
            TopicConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return TopicConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public TopicViewServiceClient createTopicViewServiceClient() {
      try {
        TopicViewServiceSettings settings =
            TopicViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return TopicViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public UserInterestServiceClient createUserInterestServiceClient() {
      try {
        UserInterestServiceSettings settings =
            UserInterestServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return UserInterestServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public UserListServiceClient createUserListServiceClient() {
      try {
        UserListServiceSettings settings =
            UserListServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return UserListServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public UserLocationViewServiceClient createUserLocationViewServiceClient() {
      try {
        UserLocationViewServiceSettings settings =
            UserLocationViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return UserLocationViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public VideoServiceClient createVideoServiceClient() {
      try {
        VideoServiceSettings settings =
            VideoServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return VideoServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }

  private static class V1Client implements com.google.ads.googleads.v1.services.GoogleAdsVersion {

    private final TransportChannelProvider provider;

    private final Credentials credentials;

    public V1Client(TransportChannelProvider provider, Credentials credentials) {
      this.provider = provider;
      this.credentials = credentials;
    }

    @Override
    public com.google.ads.googleads.v1.services.AdGroupAdServiceClient createAdGroupAdServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AdGroupAdServiceSettings settings =
            com.google.ads.googleads.v1.services.AdGroupAdServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AdGroupAdServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AccountBudgetServiceClient createAccountBudgetServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AccountBudgetServiceSettings settings =
            com.google.ads.googleads.v1.services.AccountBudgetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AccountBudgetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AccountBudgetProposalServiceClient createAccountBudgetProposalServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AccountBudgetProposalServiceSettings settings =
            com.google.ads.googleads.v1.services.AccountBudgetProposalServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AccountBudgetProposalServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AdGroupAdLabelServiceClient createAdGroupAdLabelServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AdGroupAdLabelServiceSettings settings =
            com.google.ads.googleads.v1.services.AdGroupAdLabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AdGroupAdLabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AdGroupAudienceViewServiceClient createAdGroupAudienceViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AdGroupAudienceViewServiceSettings settings =
            com.google.ads.googleads.v1.services.AdGroupAudienceViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AdGroupAudienceViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AdGroupBidModifierServiceClient createAdGroupBidModifierServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AdGroupBidModifierServiceSettings settings =
            com.google.ads.googleads.v1.services.AdGroupBidModifierServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AdGroupBidModifierServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AdGroupCriterionLabelServiceClient createAdGroupCriterionLabelServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AdGroupCriterionLabelServiceSettings settings =
            com.google.ads.googleads.v1.services.AdGroupCriterionLabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AdGroupCriterionLabelServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AdGroupCriterionServiceClient createAdGroupCriterionServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AdGroupCriterionServiceSettings settings =
            com.google.ads.googleads.v1.services.AdGroupCriterionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AdGroupCriterionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AdGroupCriterionSimulationServiceClient createAdGroupCriterionSimulationServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AdGroupCriterionSimulationServiceSettings settings =
            com.google.ads.googleads.v1.services.AdGroupCriterionSimulationServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AdGroupCriterionSimulationServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AdGroupExtensionSettingServiceClient createAdGroupExtensionSettingServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AdGroupExtensionSettingServiceSettings settings =
            com.google.ads.googleads.v1.services.AdGroupExtensionSettingServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AdGroupExtensionSettingServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AdGroupFeedServiceClient createAdGroupFeedServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AdGroupFeedServiceSettings settings =
            com.google.ads.googleads.v1.services.AdGroupFeedServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AdGroupFeedServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AdGroupLabelServiceClient createAdGroupLabelServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AdGroupLabelServiceSettings settings =
            com.google.ads.googleads.v1.services.AdGroupLabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AdGroupLabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AdGroupServiceClient createAdGroupServiceClient() {
      try {
        com.google.ads.googleads.v1.services.AdGroupServiceSettings settings =
            com.google.ads.googleads.v1.services.AdGroupServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AdGroupServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AdGroupSimulationServiceClient createAdGroupSimulationServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AdGroupSimulationServiceSettings settings =
            com.google.ads.googleads.v1.services.AdGroupSimulationServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AdGroupSimulationServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AdParameterServiceClient createAdParameterServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AdParameterServiceSettings settings =
            com.google.ads.googleads.v1.services.AdParameterServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AdParameterServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AdScheduleViewServiceClient createAdScheduleViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AdScheduleViewServiceSettings settings =
            com.google.ads.googleads.v1.services.AdScheduleViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AdScheduleViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AgeRangeViewServiceClient createAgeRangeViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.AgeRangeViewServiceSettings settings =
            com.google.ads.googleads.v1.services.AgeRangeViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AgeRangeViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.AssetServiceClient createAssetServiceClient() {
      try {
        com.google.ads.googleads.v1.services.AssetServiceSettings settings =
            com.google.ads.googleads.v1.services.AssetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.AssetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.BiddingStrategyServiceClient createBiddingStrategyServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.BiddingStrategyServiceSettings settings =
            com.google.ads.googleads.v1.services.BiddingStrategyServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.BiddingStrategyServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.BillingSetupServiceClient createBillingSetupServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.BillingSetupServiceSettings settings =
            com.google.ads.googleads.v1.services.BillingSetupServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.BillingSetupServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CampaignAudienceViewServiceClient createCampaignAudienceViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CampaignAudienceViewServiceSettings settings =
            com.google.ads.googleads.v1.services.CampaignAudienceViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CampaignAudienceViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CampaignBidModifierServiceClient createCampaignBidModifierServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CampaignBidModifierServiceSettings settings =
            com.google.ads.googleads.v1.services.CampaignBidModifierServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CampaignBidModifierServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CampaignBudgetServiceClient createCampaignBudgetServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CampaignBudgetServiceSettings settings =
            com.google.ads.googleads.v1.services.CampaignBudgetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CampaignBudgetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CampaignCriterionServiceClient createCampaignCriterionServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CampaignCriterionServiceSettings settings =
            com.google.ads.googleads.v1.services.CampaignCriterionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CampaignCriterionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CampaignCriterionSimulationServiceClient createCampaignCriterionSimulationServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CampaignCriterionSimulationServiceSettings settings =
            com.google.ads.googleads.v1.services.CampaignCriterionSimulationServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CampaignCriterionSimulationServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CampaignDraftServiceClient createCampaignDraftServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CampaignDraftServiceSettings settings =
            com.google.ads.googleads.v1.services.CampaignDraftServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CampaignDraftServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CampaignExperimentServiceClient createCampaignExperimentServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CampaignExperimentServiceSettings settings =
            com.google.ads.googleads.v1.services.CampaignExperimentServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CampaignExperimentServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CampaignExtensionSettingServiceClient createCampaignExtensionSettingServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CampaignExtensionSettingServiceSettings settings =
            com.google.ads.googleads.v1.services.CampaignExtensionSettingServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CampaignExtensionSettingServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CampaignFeedServiceClient createCampaignFeedServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CampaignFeedServiceSettings settings =
            com.google.ads.googleads.v1.services.CampaignFeedServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CampaignFeedServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CampaignLabelServiceClient createCampaignLabelServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CampaignLabelServiceSettings settings =
            com.google.ads.googleads.v1.services.CampaignLabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CampaignLabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CampaignServiceClient createCampaignServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CampaignServiceSettings settings =
            com.google.ads.googleads.v1.services.CampaignServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CampaignServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CampaignSharedSetServiceClient createCampaignSharedSetServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CampaignSharedSetServiceSettings settings =
            com.google.ads.googleads.v1.services.CampaignSharedSetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CampaignSharedSetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CarrierConstantServiceClient createCarrierConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CarrierConstantServiceSettings settings =
            com.google.ads.googleads.v1.services.CarrierConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CarrierConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.ChangeStatusServiceClient createChangeStatusServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.ChangeStatusServiceSettings settings =
            com.google.ads.googleads.v1.services.ChangeStatusServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.ChangeStatusServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.ClickViewServiceClient createClickViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.ClickViewServiceSettings settings =
            com.google.ads.googleads.v1.services.ClickViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.ClickViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.ConversionActionServiceClient createConversionActionServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.ConversionActionServiceSettings settings =
            com.google.ads.googleads.v1.services.ConversionActionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.ConversionActionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.ConversionAdjustmentUploadServiceClient createConversionAdjustmentUploadServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.ConversionAdjustmentUploadServiceSettings settings =
            com.google.ads.googleads.v1.services.ConversionAdjustmentUploadServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.ConversionAdjustmentUploadServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.ConversionUploadServiceClient createConversionUploadServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.ConversionUploadServiceSettings settings =
            com.google.ads.googleads.v1.services.ConversionUploadServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.ConversionUploadServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CustomerClientLinkServiceClient createCustomerClientLinkServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CustomerClientLinkServiceSettings settings =
            com.google.ads.googleads.v1.services.CustomerClientLinkServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CustomerClientLinkServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CustomerClientServiceClient createCustomerClientServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CustomerClientServiceSettings settings =
            com.google.ads.googleads.v1.services.CustomerClientServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CustomerClientServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CustomerExtensionSettingServiceClient createCustomerExtensionSettingServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CustomerExtensionSettingServiceSettings settings =
            com.google.ads.googleads.v1.services.CustomerExtensionSettingServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CustomerExtensionSettingServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CustomerFeedServiceClient createCustomerFeedServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CustomerFeedServiceSettings settings =
            com.google.ads.googleads.v1.services.CustomerFeedServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CustomerFeedServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CustomerLabelServiceClient createCustomerLabelServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CustomerLabelServiceSettings settings =
            com.google.ads.googleads.v1.services.CustomerLabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CustomerLabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CustomerManagerLinkServiceClient createCustomerManagerLinkServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CustomerManagerLinkServiceSettings settings =
            com.google.ads.googleads.v1.services.CustomerManagerLinkServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CustomerManagerLinkServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CustomerNegativeCriterionServiceClient createCustomerNegativeCriterionServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CustomerNegativeCriterionServiceSettings settings =
            com.google.ads.googleads.v1.services.CustomerNegativeCriterionServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CustomerNegativeCriterionServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CustomerServiceClient createCustomerServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CustomerServiceSettings settings =
            com.google.ads.googleads.v1.services.CustomerServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CustomerServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.CustomInterestServiceClient createCustomInterestServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.CustomInterestServiceSettings settings =
            com.google.ads.googleads.v1.services.CustomInterestServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.CustomInterestServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.DetailPlacementViewServiceClient createDetailPlacementViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.DetailPlacementViewServiceSettings settings =
            com.google.ads.googleads.v1.services.DetailPlacementViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.DetailPlacementViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.DisplayKeywordViewServiceClient createDisplayKeywordViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.DisplayKeywordViewServiceSettings settings =
            com.google.ads.googleads.v1.services.DisplayKeywordViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.DisplayKeywordViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.DomainCategoryServiceClient createDomainCategoryServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.DomainCategoryServiceSettings settings =
            com.google.ads.googleads.v1.services.DomainCategoryServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.DomainCategoryServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.DynamicSearchAdsSearchTermViewServiceClient createDynamicSearchAdsSearchTermViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.DynamicSearchAdsSearchTermViewServiceSettings settings =
            com.google.ads.googleads.v1.services.DynamicSearchAdsSearchTermViewServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.DynamicSearchAdsSearchTermViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.ExpandedLandingPageViewServiceClient createExpandedLandingPageViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.ExpandedLandingPageViewServiceSettings settings =
            com.google.ads.googleads.v1.services.ExpandedLandingPageViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.ExpandedLandingPageViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.ExtensionFeedItemServiceClient createExtensionFeedItemServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.ExtensionFeedItemServiceSettings settings =
            com.google.ads.googleads.v1.services.ExtensionFeedItemServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.ExtensionFeedItemServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.FeedItemServiceClient createFeedItemServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.FeedItemServiceSettings settings =
            com.google.ads.googleads.v1.services.FeedItemServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.FeedItemServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.FeedItemTargetServiceClient createFeedItemTargetServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.FeedItemTargetServiceSettings settings =
            com.google.ads.googleads.v1.services.FeedItemTargetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.FeedItemTargetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.FeedMappingServiceClient createFeedMappingServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.FeedMappingServiceSettings settings =
            com.google.ads.googleads.v1.services.FeedMappingServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.FeedMappingServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.FeedPlaceholderViewServiceClient createFeedPlaceholderViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.FeedPlaceholderViewServiceSettings settings =
            com.google.ads.googleads.v1.services.FeedPlaceholderViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.FeedPlaceholderViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.FeedServiceClient createFeedServiceClient() {
      try {
        com.google.ads.googleads.v1.services.FeedServiceSettings settings =
            com.google.ads.googleads.v1.services.FeedServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.FeedServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.GenderViewServiceClient createGenderViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.GenderViewServiceSettings settings =
            com.google.ads.googleads.v1.services.GenderViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.GenderViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.GeographicViewServiceClient createGeographicViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.GeographicViewServiceSettings settings =
            com.google.ads.googleads.v1.services.GeographicViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.GeographicViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.GeoTargetConstantServiceClient createGeoTargetConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.GeoTargetConstantServiceSettings settings =
            com.google.ads.googleads.v1.services.GeoTargetConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.GeoTargetConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.GoogleAdsFieldServiceClient createGoogleAdsFieldServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.GoogleAdsFieldServiceSettings settings =
            com.google.ads.googleads.v1.services.GoogleAdsFieldServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.GoogleAdsFieldServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.GoogleAdsServiceClient createGoogleAdsServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.GoogleAdsServiceSettings settings =
            com.google.ads.googleads.v1.services.GoogleAdsServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.GoogleAdsServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.GroupPlacementViewServiceClient createGroupPlacementViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.GroupPlacementViewServiceSettings settings =
            com.google.ads.googleads.v1.services.GroupPlacementViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.GroupPlacementViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.HotelGroupViewServiceClient createHotelGroupViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.HotelGroupViewServiceSettings settings =
            com.google.ads.googleads.v1.services.HotelGroupViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.HotelGroupViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.HotelPerformanceViewServiceClient createHotelPerformanceViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.HotelPerformanceViewServiceSettings settings =
            com.google.ads.googleads.v1.services.HotelPerformanceViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.HotelPerformanceViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.KeywordPlanAdGroupServiceClient createKeywordPlanAdGroupServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.KeywordPlanAdGroupServiceSettings settings =
            com.google.ads.googleads.v1.services.KeywordPlanAdGroupServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.KeywordPlanAdGroupServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.KeywordPlanCampaignServiceClient createKeywordPlanCampaignServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.KeywordPlanCampaignServiceSettings settings =
            com.google.ads.googleads.v1.services.KeywordPlanCampaignServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.KeywordPlanCampaignServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.KeywordPlanIdeaServiceClient createKeywordPlanIdeaServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.KeywordPlanIdeaServiceSettings settings =
            com.google.ads.googleads.v1.services.KeywordPlanIdeaServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.KeywordPlanIdeaServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.KeywordPlanKeywordServiceClient createKeywordPlanKeywordServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.KeywordPlanKeywordServiceSettings settings =
            com.google.ads.googleads.v1.services.KeywordPlanKeywordServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.KeywordPlanKeywordServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.KeywordPlanNegativeKeywordServiceClient createKeywordPlanNegativeKeywordServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.KeywordPlanNegativeKeywordServiceSettings settings =
            com.google.ads.googleads.v1.services.KeywordPlanNegativeKeywordServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.KeywordPlanNegativeKeywordServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.KeywordPlanServiceClient createKeywordPlanServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.KeywordPlanServiceSettings settings =
            com.google.ads.googleads.v1.services.KeywordPlanServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.KeywordPlanServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.KeywordViewServiceClient createKeywordViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.KeywordViewServiceSettings settings =
            com.google.ads.googleads.v1.services.KeywordViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.KeywordViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.LabelServiceClient createLabelServiceClient() {
      try {
        com.google.ads.googleads.v1.services.LabelServiceSettings settings =
            com.google.ads.googleads.v1.services.LabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.LabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.LandingPageViewServiceClient createLandingPageViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.LandingPageViewServiceSettings settings =
            com.google.ads.googleads.v1.services.LandingPageViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.LandingPageViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.LanguageConstantServiceClient createLanguageConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.LanguageConstantServiceSettings settings =
            com.google.ads.googleads.v1.services.LanguageConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.LanguageConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.LocationViewServiceClient createLocationViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.LocationViewServiceSettings settings =
            com.google.ads.googleads.v1.services.LocationViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.LocationViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.ManagedPlacementViewServiceClient createManagedPlacementViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.ManagedPlacementViewServiceSettings settings =
            com.google.ads.googleads.v1.services.ManagedPlacementViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.ManagedPlacementViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.MediaFileServiceClient createMediaFileServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.MediaFileServiceSettings settings =
            com.google.ads.googleads.v1.services.MediaFileServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.MediaFileServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.MerchantCenterLinkServiceClient createMerchantCenterLinkServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.MerchantCenterLinkServiceSettings settings =
            com.google.ads.googleads.v1.services.MerchantCenterLinkServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.MerchantCenterLinkServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.MobileAppCategoryConstantServiceClient createMobileAppCategoryConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.MobileAppCategoryConstantServiceSettings settings =
            com.google.ads.googleads.v1.services.MobileAppCategoryConstantServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.MobileAppCategoryConstantServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.MobileDeviceConstantServiceClient createMobileDeviceConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.MobileDeviceConstantServiceSettings settings =
            com.google.ads.googleads.v1.services.MobileDeviceConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.MobileDeviceConstantServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.MutateJobServiceClient createMutateJobServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.MutateJobServiceSettings settings =
            com.google.ads.googleads.v1.services.MutateJobServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.MutateJobServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.OperatingSystemVersionConstantServiceClient createOperatingSystemVersionConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.OperatingSystemVersionConstantServiceSettings settings =
            com.google.ads.googleads.v1.services.OperatingSystemVersionConstantServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.OperatingSystemVersionConstantServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.PaidOrganicSearchTermViewServiceClient createPaidOrganicSearchTermViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.PaidOrganicSearchTermViewServiceSettings settings =
            com.google.ads.googleads.v1.services.PaidOrganicSearchTermViewServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.PaidOrganicSearchTermViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.ParentalStatusViewServiceClient createParentalStatusViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.ParentalStatusViewServiceSettings settings =
            com.google.ads.googleads.v1.services.ParentalStatusViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.ParentalStatusViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.PaymentsAccountServiceClient createPaymentsAccountServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.PaymentsAccountServiceSettings settings =
            com.google.ads.googleads.v1.services.PaymentsAccountServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.PaymentsAccountServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.ProductBiddingCategoryConstantServiceClient createProductBiddingCategoryConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.ProductBiddingCategoryConstantServiceSettings settings =
            com.google.ads.googleads.v1.services.ProductBiddingCategoryConstantServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.ProductBiddingCategoryConstantServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.ProductGroupViewServiceClient createProductGroupViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.ProductGroupViewServiceSettings settings =
            com.google.ads.googleads.v1.services.ProductGroupViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.ProductGroupViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.RecommendationServiceClient createRecommendationServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.RecommendationServiceSettings settings =
            com.google.ads.googleads.v1.services.RecommendationServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.RecommendationServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.RemarketingActionServiceClient createRemarketingActionServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.RemarketingActionServiceSettings settings =
            com.google.ads.googleads.v1.services.RemarketingActionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.RemarketingActionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.SearchTermViewServiceClient createSearchTermViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.SearchTermViewServiceSettings settings =
            com.google.ads.googleads.v1.services.SearchTermViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.SearchTermViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.SharedCriterionServiceClient createSharedCriterionServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.SharedCriterionServiceSettings settings =
            com.google.ads.googleads.v1.services.SharedCriterionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.SharedCriterionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.SharedSetServiceClient createSharedSetServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.SharedSetServiceSettings settings =
            com.google.ads.googleads.v1.services.SharedSetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.SharedSetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.ShoppingPerformanceViewServiceClient createShoppingPerformanceViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.ShoppingPerformanceViewServiceSettings settings =
            com.google.ads.googleads.v1.services.ShoppingPerformanceViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.ShoppingPerformanceViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.TopicConstantServiceClient createTopicConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.TopicConstantServiceSettings settings =
            com.google.ads.googleads.v1.services.TopicConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.TopicConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.TopicViewServiceClient createTopicViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.TopicViewServiceSettings settings =
            com.google.ads.googleads.v1.services.TopicViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.TopicViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.UserInterestServiceClient createUserInterestServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.UserInterestServiceSettings settings =
            com.google.ads.googleads.v1.services.UserInterestServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.UserInterestServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.UserListServiceClient createUserListServiceClient(
    ) {
      try {
        com.google.ads.googleads.v1.services.UserListServiceSettings settings =
            com.google.ads.googleads.v1.services.UserListServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.UserListServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v1.services.VideoServiceClient createVideoServiceClient() {
      try {
        com.google.ads.googleads.v1.services.VideoServiceSettings settings =
            com.google.ads.googleads.v1.services.VideoServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v1.services.VideoServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }

  private static class V3Client implements com.google.ads.googleads.v3.services.GoogleAdsVersion {

    private final TransportChannelProvider provider;

    private final Credentials credentials;

    public V3Client(TransportChannelProvider provider, Credentials credentials) {
      this.provider = provider;
      this.credentials = credentials;
    }

    @Override
    public com.google.ads.googleads.v3.services.AdGroupAdServiceClient createAdGroupAdServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AdGroupAdServiceSettings settings =
            com.google.ads.googleads.v3.services.AdGroupAdServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdGroupAdServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AccountBudgetServiceClient createAccountBudgetServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AccountBudgetServiceSettings settings =
            com.google.ads.googleads.v3.services.AccountBudgetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AccountBudgetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AccountBudgetProposalServiceClient createAccountBudgetProposalServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AccountBudgetProposalServiceSettings settings =
            com.google.ads.googleads.v3.services.AccountBudgetProposalServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AccountBudgetProposalServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AdGroupAdAssetViewServiceClient createAdGroupAdAssetViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AdGroupAdAssetViewServiceSettings settings =
            com.google.ads.googleads.v3.services.AdGroupAdAssetViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdGroupAdAssetViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AdGroupAdLabelServiceClient createAdGroupAdLabelServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AdGroupAdLabelServiceSettings settings =
            com.google.ads.googleads.v3.services.AdGroupAdLabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdGroupAdLabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AdGroupAudienceViewServiceClient createAdGroupAudienceViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AdGroupAudienceViewServiceSettings settings =
            com.google.ads.googleads.v3.services.AdGroupAudienceViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdGroupAudienceViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AdGroupBidModifierServiceClient createAdGroupBidModifierServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AdGroupBidModifierServiceSettings settings =
            com.google.ads.googleads.v3.services.AdGroupBidModifierServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdGroupBidModifierServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AdGroupCriterionLabelServiceClient createAdGroupCriterionLabelServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AdGroupCriterionLabelServiceSettings settings =
            com.google.ads.googleads.v3.services.AdGroupCriterionLabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdGroupCriterionLabelServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AdGroupCriterionServiceClient createAdGroupCriterionServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AdGroupCriterionServiceSettings settings =
            com.google.ads.googleads.v3.services.AdGroupCriterionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdGroupCriterionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AdGroupCriterionSimulationServiceClient createAdGroupCriterionSimulationServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AdGroupCriterionSimulationServiceSettings settings =
            com.google.ads.googleads.v3.services.AdGroupCriterionSimulationServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdGroupCriterionSimulationServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AdGroupExtensionSettingServiceClient createAdGroupExtensionSettingServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AdGroupExtensionSettingServiceSettings settings =
            com.google.ads.googleads.v3.services.AdGroupExtensionSettingServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdGroupExtensionSettingServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AdGroupFeedServiceClient createAdGroupFeedServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AdGroupFeedServiceSettings settings =
            com.google.ads.googleads.v3.services.AdGroupFeedServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdGroupFeedServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AdGroupLabelServiceClient createAdGroupLabelServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AdGroupLabelServiceSettings settings =
            com.google.ads.googleads.v3.services.AdGroupLabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdGroupLabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AdGroupServiceClient createAdGroupServiceClient() {
      try {
        com.google.ads.googleads.v3.services.AdGroupServiceSettings settings =
            com.google.ads.googleads.v3.services.AdGroupServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdGroupServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AdGroupSimulationServiceClient createAdGroupSimulationServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AdGroupSimulationServiceSettings settings =
            com.google.ads.googleads.v3.services.AdGroupSimulationServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdGroupSimulationServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AdParameterServiceClient createAdParameterServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AdParameterServiceSettings settings =
            com.google.ads.googleads.v3.services.AdParameterServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdParameterServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AdScheduleViewServiceClient createAdScheduleViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AdScheduleViewServiceSettings settings =
            com.google.ads.googleads.v3.services.AdScheduleViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdScheduleViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AdServiceClient createAdServiceClient() {
      try {
        com.google.ads.googleads.v3.services.AdServiceSettings settings =
            com.google.ads.googleads.v3.services.AdServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AdServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AgeRangeViewServiceClient createAgeRangeViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.AgeRangeViewServiceSettings settings =
            com.google.ads.googleads.v3.services.AgeRangeViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AgeRangeViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.AssetServiceClient createAssetServiceClient() {
      try {
        com.google.ads.googleads.v3.services.AssetServiceSettings settings =
            com.google.ads.googleads.v3.services.AssetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.AssetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.BiddingStrategyServiceClient createBiddingStrategyServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.BiddingStrategyServiceSettings settings =
            com.google.ads.googleads.v3.services.BiddingStrategyServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.BiddingStrategyServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.BillingSetupServiceClient createBillingSetupServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.BillingSetupServiceSettings settings =
            com.google.ads.googleads.v3.services.BillingSetupServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.BillingSetupServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CampaignAudienceViewServiceClient createCampaignAudienceViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CampaignAudienceViewServiceSettings settings =
            com.google.ads.googleads.v3.services.CampaignAudienceViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CampaignAudienceViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CampaignBidModifierServiceClient createCampaignBidModifierServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CampaignBidModifierServiceSettings settings =
            com.google.ads.googleads.v3.services.CampaignBidModifierServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CampaignBidModifierServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CampaignBudgetServiceClient createCampaignBudgetServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CampaignBudgetServiceSettings settings =
            com.google.ads.googleads.v3.services.CampaignBudgetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CampaignBudgetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CampaignCriterionServiceClient createCampaignCriterionServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CampaignCriterionServiceSettings settings =
            com.google.ads.googleads.v3.services.CampaignCriterionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CampaignCriterionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CampaignCriterionSimulationServiceClient createCampaignCriterionSimulationServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CampaignCriterionSimulationServiceSettings settings =
            com.google.ads.googleads.v3.services.CampaignCriterionSimulationServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CampaignCriterionSimulationServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CampaignDraftServiceClient createCampaignDraftServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CampaignDraftServiceSettings settings =
            com.google.ads.googleads.v3.services.CampaignDraftServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CampaignDraftServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CampaignExperimentServiceClient createCampaignExperimentServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CampaignExperimentServiceSettings settings =
            com.google.ads.googleads.v3.services.CampaignExperimentServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CampaignExperimentServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CampaignExtensionSettingServiceClient createCampaignExtensionSettingServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CampaignExtensionSettingServiceSettings settings =
            com.google.ads.googleads.v3.services.CampaignExtensionSettingServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CampaignExtensionSettingServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CampaignFeedServiceClient createCampaignFeedServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CampaignFeedServiceSettings settings =
            com.google.ads.googleads.v3.services.CampaignFeedServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CampaignFeedServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CampaignLabelServiceClient createCampaignLabelServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CampaignLabelServiceSettings settings =
            com.google.ads.googleads.v3.services.CampaignLabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CampaignLabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CampaignServiceClient createCampaignServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CampaignServiceSettings settings =
            com.google.ads.googleads.v3.services.CampaignServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CampaignServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CampaignSharedSetServiceClient createCampaignSharedSetServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CampaignSharedSetServiceSettings settings =
            com.google.ads.googleads.v3.services.CampaignSharedSetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CampaignSharedSetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CarrierConstantServiceClient createCarrierConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CarrierConstantServiceSettings settings =
            com.google.ads.googleads.v3.services.CarrierConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CarrierConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.ChangeStatusServiceClient createChangeStatusServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.ChangeStatusServiceSettings settings =
            com.google.ads.googleads.v3.services.ChangeStatusServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.ChangeStatusServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.ClickViewServiceClient createClickViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.ClickViewServiceSettings settings =
            com.google.ads.googleads.v3.services.ClickViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.ClickViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.ConversionActionServiceClient createConversionActionServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.ConversionActionServiceSettings settings =
            com.google.ads.googleads.v3.services.ConversionActionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.ConversionActionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.ConversionAdjustmentUploadServiceClient createConversionAdjustmentUploadServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.ConversionAdjustmentUploadServiceSettings settings =
            com.google.ads.googleads.v3.services.ConversionAdjustmentUploadServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.ConversionAdjustmentUploadServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.ConversionUploadServiceClient createConversionUploadServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.ConversionUploadServiceSettings settings =
            com.google.ads.googleads.v3.services.ConversionUploadServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.ConversionUploadServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CustomerClientLinkServiceClient createCustomerClientLinkServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CustomerClientLinkServiceSettings settings =
            com.google.ads.googleads.v3.services.CustomerClientLinkServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CustomerClientLinkServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CustomerClientServiceClient createCustomerClientServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CustomerClientServiceSettings settings =
            com.google.ads.googleads.v3.services.CustomerClientServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CustomerClientServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CustomerExtensionSettingServiceClient createCustomerExtensionSettingServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CustomerExtensionSettingServiceSettings settings =
            com.google.ads.googleads.v3.services.CustomerExtensionSettingServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CustomerExtensionSettingServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CustomerFeedServiceClient createCustomerFeedServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CustomerFeedServiceSettings settings =
            com.google.ads.googleads.v3.services.CustomerFeedServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CustomerFeedServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CustomerLabelServiceClient createCustomerLabelServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CustomerLabelServiceSettings settings =
            com.google.ads.googleads.v3.services.CustomerLabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CustomerLabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CustomerManagerLinkServiceClient createCustomerManagerLinkServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CustomerManagerLinkServiceSettings settings =
            com.google.ads.googleads.v3.services.CustomerManagerLinkServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CustomerManagerLinkServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CustomerNegativeCriterionServiceClient createCustomerNegativeCriterionServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CustomerNegativeCriterionServiceSettings settings =
            com.google.ads.googleads.v3.services.CustomerNegativeCriterionServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CustomerNegativeCriterionServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CustomerServiceClient createCustomerServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CustomerServiceSettings settings =
            com.google.ads.googleads.v3.services.CustomerServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CustomerServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.CustomInterestServiceClient createCustomInterestServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.CustomInterestServiceSettings settings =
            com.google.ads.googleads.v3.services.CustomInterestServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.CustomInterestServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.DetailPlacementViewServiceClient createDetailPlacementViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.DetailPlacementViewServiceSettings settings =
            com.google.ads.googleads.v3.services.DetailPlacementViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.DetailPlacementViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.DisplayKeywordViewServiceClient createDisplayKeywordViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.DisplayKeywordViewServiceSettings settings =
            com.google.ads.googleads.v3.services.DisplayKeywordViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.DisplayKeywordViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.DistanceViewServiceClient createDistanceViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.DistanceViewServiceSettings settings =
            com.google.ads.googleads.v3.services.DistanceViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.DistanceViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.DomainCategoryServiceClient createDomainCategoryServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.DomainCategoryServiceSettings settings =
            com.google.ads.googleads.v3.services.DomainCategoryServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.DomainCategoryServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.DynamicSearchAdsSearchTermViewServiceClient createDynamicSearchAdsSearchTermViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.DynamicSearchAdsSearchTermViewServiceSettings settings =
            com.google.ads.googleads.v3.services.DynamicSearchAdsSearchTermViewServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.DynamicSearchAdsSearchTermViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.ExpandedLandingPageViewServiceClient createExpandedLandingPageViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.ExpandedLandingPageViewServiceSettings settings =
            com.google.ads.googleads.v3.services.ExpandedLandingPageViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.ExpandedLandingPageViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.ExtensionFeedItemServiceClient createExtensionFeedItemServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.ExtensionFeedItemServiceSettings settings =
            com.google.ads.googleads.v3.services.ExtensionFeedItemServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.ExtensionFeedItemServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.FeedItemServiceClient createFeedItemServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.FeedItemServiceSettings settings =
            com.google.ads.googleads.v3.services.FeedItemServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.FeedItemServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.FeedItemTargetServiceClient createFeedItemTargetServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.FeedItemTargetServiceSettings settings =
            com.google.ads.googleads.v3.services.FeedItemTargetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.FeedItemTargetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.FeedMappingServiceClient createFeedMappingServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.FeedMappingServiceSettings settings =
            com.google.ads.googleads.v3.services.FeedMappingServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.FeedMappingServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.FeedPlaceholderViewServiceClient createFeedPlaceholderViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.FeedPlaceholderViewServiceSettings settings =
            com.google.ads.googleads.v3.services.FeedPlaceholderViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.FeedPlaceholderViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.FeedServiceClient createFeedServiceClient() {
      try {
        com.google.ads.googleads.v3.services.FeedServiceSettings settings =
            com.google.ads.googleads.v3.services.FeedServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.FeedServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.GenderViewServiceClient createGenderViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.GenderViewServiceSettings settings =
            com.google.ads.googleads.v3.services.GenderViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.GenderViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.GeographicViewServiceClient createGeographicViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.GeographicViewServiceSettings settings =
            com.google.ads.googleads.v3.services.GeographicViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.GeographicViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.GeoTargetConstantServiceClient createGeoTargetConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.GeoTargetConstantServiceSettings settings =
            com.google.ads.googleads.v3.services.GeoTargetConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.GeoTargetConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.GoogleAdsFieldServiceClient createGoogleAdsFieldServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.GoogleAdsFieldServiceSettings settings =
            com.google.ads.googleads.v3.services.GoogleAdsFieldServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.GoogleAdsFieldServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.GoogleAdsServiceClient createGoogleAdsServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.GoogleAdsServiceSettings settings =
            com.google.ads.googleads.v3.services.GoogleAdsServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.GoogleAdsServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.GroupPlacementViewServiceClient createGroupPlacementViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.GroupPlacementViewServiceSettings settings =
            com.google.ads.googleads.v3.services.GroupPlacementViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.GroupPlacementViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.HotelGroupViewServiceClient createHotelGroupViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.HotelGroupViewServiceSettings settings =
            com.google.ads.googleads.v3.services.HotelGroupViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.HotelGroupViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.HotelPerformanceViewServiceClient createHotelPerformanceViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.HotelPerformanceViewServiceSettings settings =
            com.google.ads.googleads.v3.services.HotelPerformanceViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.HotelPerformanceViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.InvoiceServiceClient createInvoiceServiceClient() {
      try {
        com.google.ads.googleads.v3.services.InvoiceServiceSettings settings =
            com.google.ads.googleads.v3.services.InvoiceServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.InvoiceServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.KeywordPlanAdGroupServiceClient createKeywordPlanAdGroupServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.KeywordPlanAdGroupServiceSettings settings =
            com.google.ads.googleads.v3.services.KeywordPlanAdGroupServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.KeywordPlanAdGroupServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CurrencyConstantServiceClient createCurrencyConstantServiceClient() {
      try {
        CurrencyConstantServiceSettings settings =
            CurrencyConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return CurrencyConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.KeywordPlanCampaignServiceClient createKeywordPlanCampaignServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.KeywordPlanCampaignServiceSettings settings =
            com.google.ads.googleads.v3.services.KeywordPlanCampaignServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.KeywordPlanCampaignServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.KeywordPlanIdeaServiceClient createKeywordPlanIdeaServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.KeywordPlanIdeaServiceSettings settings =
            com.google.ads.googleads.v3.services.KeywordPlanIdeaServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.KeywordPlanIdeaServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.KeywordPlanKeywordServiceClient createKeywordPlanKeywordServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.KeywordPlanKeywordServiceSettings settings =
            com.google.ads.googleads.v3.services.KeywordPlanKeywordServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.KeywordPlanKeywordServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.KeywordPlanNegativeKeywordServiceClient createKeywordPlanNegativeKeywordServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.KeywordPlanNegativeKeywordServiceSettings settings =
            com.google.ads.googleads.v3.services.KeywordPlanNegativeKeywordServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.KeywordPlanNegativeKeywordServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.KeywordPlanServiceClient createKeywordPlanServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.KeywordPlanServiceSettings settings =
            com.google.ads.googleads.v3.services.KeywordPlanServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.KeywordPlanServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.KeywordViewServiceClient createKeywordViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.KeywordViewServiceSettings settings =
            com.google.ads.googleads.v3.services.KeywordViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.KeywordViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.LabelServiceClient createLabelServiceClient() {
      try {
        com.google.ads.googleads.v3.services.LabelServiceSettings settings =
            com.google.ads.googleads.v3.services.LabelServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.LabelServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.LandingPageViewServiceClient createLandingPageViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.LandingPageViewServiceSettings settings =
            com.google.ads.googleads.v3.services.LandingPageViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.LandingPageViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.LanguageConstantServiceClient createLanguageConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.LanguageConstantServiceSettings settings =
            com.google.ads.googleads.v3.services.LanguageConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.LanguageConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.LocationViewServiceClient createLocationViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.LocationViewServiceSettings settings =
            com.google.ads.googleads.v3.services.LocationViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.LocationViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.ManagedPlacementViewServiceClient createManagedPlacementViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.ManagedPlacementViewServiceSettings settings =
            com.google.ads.googleads.v3.services.ManagedPlacementViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.ManagedPlacementViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.MediaFileServiceClient createMediaFileServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.MediaFileServiceSettings settings =
            com.google.ads.googleads.v3.services.MediaFileServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.MediaFileServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.MerchantCenterLinkServiceClient createMerchantCenterLinkServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.MerchantCenterLinkServiceSettings settings =
            com.google.ads.googleads.v3.services.MerchantCenterLinkServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.MerchantCenterLinkServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.MobileAppCategoryConstantServiceClient createMobileAppCategoryConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.MobileAppCategoryConstantServiceSettings settings =
            com.google.ads.googleads.v3.services.MobileAppCategoryConstantServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.MobileAppCategoryConstantServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.MobileDeviceConstantServiceClient createMobileDeviceConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.MobileDeviceConstantServiceSettings settings =
            com.google.ads.googleads.v3.services.MobileDeviceConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.MobileDeviceConstantServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.MutateJobServiceClient createMutateJobServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.MutateJobServiceSettings settings =
            com.google.ads.googleads.v3.services.MutateJobServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.MutateJobServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.OperatingSystemVersionConstantServiceClient createOperatingSystemVersionConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.OperatingSystemVersionConstantServiceSettings settings =
            com.google.ads.googleads.v3.services.OperatingSystemVersionConstantServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.OperatingSystemVersionConstantServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.PaidOrganicSearchTermViewServiceClient createPaidOrganicSearchTermViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.PaidOrganicSearchTermViewServiceSettings settings =
            com.google.ads.googleads.v3.services.PaidOrganicSearchTermViewServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.PaidOrganicSearchTermViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.ParentalStatusViewServiceClient createParentalStatusViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.ParentalStatusViewServiceSettings settings =
            com.google.ads.googleads.v3.services.ParentalStatusViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.ParentalStatusViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.PaymentsAccountServiceClient createPaymentsAccountServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.PaymentsAccountServiceSettings settings =
            com.google.ads.googleads.v3.services.PaymentsAccountServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.PaymentsAccountServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.ProductBiddingCategoryConstantServiceClient createProductBiddingCategoryConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.ProductBiddingCategoryConstantServiceSettings settings =
            com.google.ads.googleads.v3.services.ProductBiddingCategoryConstantServiceSettings
                .newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.ProductBiddingCategoryConstantServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.ProductGroupViewServiceClient createProductGroupViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.ProductGroupViewServiceSettings settings =
            com.google.ads.googleads.v3.services.ProductGroupViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.ProductGroupViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.ReachPlanServiceClient createReachPlanServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.ReachPlanServiceSettings settings =
            com.google.ads.googleads.v3.services.ReachPlanServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.ReachPlanServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.RecommendationServiceClient createRecommendationServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.RecommendationServiceSettings settings =
            com.google.ads.googleads.v3.services.RecommendationServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.RecommendationServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.RemarketingActionServiceClient createRemarketingActionServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.RemarketingActionServiceSettings settings =
            com.google.ads.googleads.v3.services.RemarketingActionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.RemarketingActionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.SearchTermViewServiceClient createSearchTermViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.SearchTermViewServiceSettings settings =
            com.google.ads.googleads.v3.services.SearchTermViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.SearchTermViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.SharedCriterionServiceClient createSharedCriterionServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.SharedCriterionServiceSettings settings =
            com.google.ads.googleads.v3.services.SharedCriterionServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.SharedCriterionServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.SharedSetServiceClient createSharedSetServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.SharedSetServiceSettings settings =
            com.google.ads.googleads.v3.services.SharedSetServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.SharedSetServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.ShoppingPerformanceViewServiceClient createShoppingPerformanceViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.ShoppingPerformanceViewServiceSettings settings =
            com.google.ads.googleads.v3.services.ShoppingPerformanceViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.ShoppingPerformanceViewServiceClient
            .create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.TopicConstantServiceClient createTopicConstantServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.TopicConstantServiceSettings settings =
            com.google.ads.googleads.v3.services.TopicConstantServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.TopicConstantServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.TopicViewServiceClient createTopicViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.TopicViewServiceSettings settings =
            com.google.ads.googleads.v3.services.TopicViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.TopicViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.UserInterestServiceClient createUserInterestServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.UserInterestServiceSettings settings =
            com.google.ads.googleads.v3.services.UserInterestServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.UserInterestServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.UserListServiceClient createUserListServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.UserListServiceSettings settings =
            com.google.ads.googleads.v3.services.UserListServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.UserListServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.UserLocationViewServiceClient createUserLocationViewServiceClient(
    ) {
      try {
        com.google.ads.googleads.v3.services.UserLocationViewServiceSettings settings =
            com.google.ads.googleads.v3.services.UserLocationViewServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.UserLocationViewServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public com.google.ads.googleads.v3.services.VideoServiceClient createVideoServiceClient() {
      try {
        com.google.ads.googleads.v3.services.VideoServiceSettings settings =
            com.google.ads.googleads.v3.services.VideoServiceSettings.newBuilder()
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .setTransportChannelProvider(provider)
                .build();
        return com.google.ads.googleads.v3.services.VideoServiceClient.create(settings);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
