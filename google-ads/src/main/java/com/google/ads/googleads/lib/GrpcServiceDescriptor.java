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
import com.google.ads.googleads.v0.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v0.services.AdGroupAdServiceSettings;
import com.google.ads.googleads.v0.services.AdGroupBidModifierServiceClient;
import com.google.ads.googleads.v0.services.AdGroupBidModifierServiceSettings;
import com.google.ads.googleads.v0.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v0.services.AdGroupCriterionServiceSettings;
import com.google.ads.googleads.v0.services.AdGroupServiceClient;
import com.google.ads.googleads.v0.services.AdGroupServiceSettings;
import com.google.ads.googleads.v0.services.BiddingStrategyServiceClient;
import com.google.ads.googleads.v0.services.BiddingStrategyServiceSettings;
import com.google.ads.googleads.v0.services.BillingSetupServiceClient;
import com.google.ads.googleads.v0.services.BillingSetupServiceSettings;
import com.google.ads.googleads.v0.services.CampaignBidModifierServiceClient;
import com.google.ads.googleads.v0.services.CampaignBidModifierServiceSettings;
import com.google.ads.googleads.v0.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v0.services.CampaignBudgetServiceSettings;
import com.google.ads.googleads.v0.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v0.services.CampaignCriterionServiceSettings;
import com.google.ads.googleads.v0.services.CampaignGroupServiceClient;
import com.google.ads.googleads.v0.services.CampaignGroupServiceSettings;
import com.google.ads.googleads.v0.services.CampaignServiceClient;
import com.google.ads.googleads.v0.services.CampaignServiceSettings;
import com.google.ads.googleads.v0.services.CampaignSharedSetServiceClient;
import com.google.ads.googleads.v0.services.CampaignSharedSetServiceSettings;
import com.google.ads.googleads.v0.services.ChangeStatusServiceClient;
import com.google.ads.googleads.v0.services.ChangeStatusServiceSettings;
import com.google.ads.googleads.v0.services.ConversionActionServiceClient;
import com.google.ads.googleads.v0.services.ConversionActionServiceSettings;
import com.google.ads.googleads.v0.services.CustomerServiceClient;
import com.google.ads.googleads.v0.services.CustomerServiceSettings;
import com.google.ads.googleads.v0.services.GeoTargetConstantServiceClient;
import com.google.ads.googleads.v0.services.GeoTargetConstantServiceSettings;
import com.google.ads.googleads.v0.services.GoogleAdsFieldServiceClient;
import com.google.ads.googleads.v0.services.GoogleAdsFieldServiceSettings;
import com.google.ads.googleads.v0.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v0.services.GoogleAdsServiceSettings;
import com.google.ads.googleads.v0.services.KeywordViewServiceClient;
import com.google.ads.googleads.v0.services.KeywordViewServiceSettings;
import com.google.ads.googleads.v0.services.RecommendationServiceClient;
import com.google.ads.googleads.v0.services.RecommendationServiceSettings;
import com.google.ads.googleads.v0.services.SharedCriterionServiceClient;
import com.google.ads.googleads.v0.services.SharedCriterionServiceSettings;
import com.google.ads.googleads.v0.services.SharedSetServiceClient;
import com.google.ads.googleads.v0.services.SharedSetServiceSettings;
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
              .put(AdGroupAdServiceClient.class, new AdGroupAdServiceDescriptor())
              .put(AdGroupBidModifierServiceClient.class, new AdGroupBidModifierServiceDescriptor())
              .put(AdGroupCriterionServiceClient.class, new AdGroupCriterionServiceDescriptor())
              .put(AdGroupServiceClient.class, new AdGroupServiceDescriptor())
              .put(BiddingStrategyServiceClient.class, new BiddingStrategyServiceDescriptor())
              .put(BillingSetupServiceClient.class, new BillingSetupServiceDescriptor())
              .put(
                  CampaignBidModifierServiceClient.class,
                  new CampaignBidModifierServiceDescriptor())
              .put(CampaignBudgetServiceClient.class, new CampaignBudgetServiceDescriptor())
              .put(CampaignCriterionServiceClient.class, new CampaignCriterionServiceDescriptor())
              .put(CampaignGroupServiceClient.class, new CampaignGroupServiceDescriptor())
              .put(CampaignServiceClient.class, new CampaignServiceDescriptor())
              .put(CampaignSharedSetServiceClient.class, new CampaignSharedSetServiceDescriptor())
              .put(ChangeStatusServiceClient.class, new ChangeStatusServiceDescriptor())
              .put(ConversionActionServiceClient.class, new ConversionActionServiceDescriptor())
              .put(CustomerServiceClient.class, new CustomerServiceDescriptor())
              .put(GeoTargetConstantServiceClient.class, new GeoTargetConstantServiceDescriptor())
              .put(GoogleAdsFieldServiceClient.class, new GoogleAdsFieldServiceDescriptor())
              .put(GoogleAdsServiceClient.class, new GoogleAdsServiceDescriptor())
              .put(KeywordViewServiceClient.class, new KeywordViewServiceDescriptor())
              .put(RecommendationServiceClient.class, new RecommendationServiceDescriptor())
              .put(SharedCriterionServiceClient.class, new SharedCriterionServiceDescriptor())
              .put(SharedSetServiceClient.class, new SharedSetServiceDescriptor())
              .put(VideoServiceClient.class, new VideoServiceDescriptor())
              .build();

  private GrpcServiceDescriptor() {
    // Only private subclasses allowed.
  }

  /**
   * Returns a new instance of the service client for this descriptor.
   *
   * @throws ServiceClientCreationException if the creation process fails.
   */
  public abstract ClientT newServiceClient(GoogleAdsClient googleAdsClient)
      throws ServiceClientCreationException;

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
