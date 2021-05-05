/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v7.services;

import com.google.ads.googleads.v7.common.CustomParameter;
import com.google.ads.googleads.v7.common.FrequencyCapEntry;
import com.google.ads.googleads.v7.common.RealTimeBiddingSetting;
import com.google.ads.googleads.v7.common.TargetingSetting;
import com.google.ads.googleads.v7.enums.AssetFieldTypeEnum;
import com.google.ads.googleads.v7.resources.Campaign;
import com.google.ads.googleads.v7.resources.CampaignName;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import com.google.rpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class CampaignServiceClientTest {
  private static MockCampaignService mockCampaignService;
  private static MockServiceHelper mockServiceHelper;
  private CampaignServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockCampaignService = new MockCampaignService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockCampaignService));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    CampaignServiceSettings settings =
        CampaignServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CampaignServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCampaignTest() throws Exception {
    Campaign expectedResponse =
        Campaign.newBuilder()
            .setResourceName(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .addAllUrlCustomParameters(new ArrayList<CustomParameter>())
            .setRealTimeBiddingSetting(RealTimeBiddingSetting.newBuilder().build())
            .setNetworkSettings(Campaign.NetworkSettings.newBuilder().build())
            .setHotelSetting(Campaign.HotelSettingInfo.newBuilder().build())
            .setDynamicSearchAdsSetting(Campaign.DynamicSearchAdsSetting.newBuilder().build())
            .setShoppingSetting(Campaign.ShoppingSetting.newBuilder().build())
            .setTargetingSetting(TargetingSetting.newBuilder().build())
            .setGeoTargetTypeSetting(Campaign.GeoTargetTypeSetting.newBuilder().build())
            .setLocalCampaignSetting(Campaign.LocalCampaignSetting.newBuilder().build())
            .setAppCampaignSetting(Campaign.AppCampaignSetting.newBuilder().build())
            .addAllLabels(new ArrayList<String>())
            .addAllFrequencyCaps(new ArrayList<FrequencyCapEntry>())
            .setVanityPharma(Campaign.VanityPharma.newBuilder().build())
            .setSelectiveOptimization(Campaign.SelectiveOptimization.newBuilder().build())
            .setOptimizationGoalSetting(Campaign.OptimizationGoalSetting.newBuilder().build())
            .setTrackingSetting(Campaign.TrackingSetting.newBuilder().build())
            .addAllExcludedParentAssetFieldTypes(new ArrayList<AssetFieldTypeEnum.AssetFieldType>())
            .build();
    mockCampaignService.addResponse(expectedResponse);

    CampaignName resourceName = CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]");

    Campaign actualResponse = client.getCampaign(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignRequest actualRequest = ((GetCampaignRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignService.addException(exception);

    try {
      CampaignName resourceName = CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]");
      client.getCampaign(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCampaignTest2() throws Exception {
    Campaign expectedResponse =
        Campaign.newBuilder()
            .setResourceName(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .addAllUrlCustomParameters(new ArrayList<CustomParameter>())
            .setRealTimeBiddingSetting(RealTimeBiddingSetting.newBuilder().build())
            .setNetworkSettings(Campaign.NetworkSettings.newBuilder().build())
            .setHotelSetting(Campaign.HotelSettingInfo.newBuilder().build())
            .setDynamicSearchAdsSetting(Campaign.DynamicSearchAdsSetting.newBuilder().build())
            .setShoppingSetting(Campaign.ShoppingSetting.newBuilder().build())
            .setTargetingSetting(TargetingSetting.newBuilder().build())
            .setGeoTargetTypeSetting(Campaign.GeoTargetTypeSetting.newBuilder().build())
            .setLocalCampaignSetting(Campaign.LocalCampaignSetting.newBuilder().build())
            .setAppCampaignSetting(Campaign.AppCampaignSetting.newBuilder().build())
            .addAllLabels(new ArrayList<String>())
            .addAllFrequencyCaps(new ArrayList<FrequencyCapEntry>())
            .setVanityPharma(Campaign.VanityPharma.newBuilder().build())
            .setSelectiveOptimization(Campaign.SelectiveOptimization.newBuilder().build())
            .setOptimizationGoalSetting(Campaign.OptimizationGoalSetting.newBuilder().build())
            .setTrackingSetting(Campaign.TrackingSetting.newBuilder().build())
            .addAllExcludedParentAssetFieldTypes(new ArrayList<AssetFieldTypeEnum.AssetFieldType>())
            .build();
    mockCampaignService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    Campaign actualResponse = client.getCampaign(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignRequest actualRequest = ((GetCampaignRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCampaign(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCampaignsTest() throws Exception {
    MutateCampaignsResponse expectedResponse =
        MutateCampaignsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCampaignResult>())
            .build();
    mockCampaignService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CampaignOperation> operations = new ArrayList<>();

    MutateCampaignsResponse actualResponse = client.mutateCampaigns(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignsRequest actualRequest = ((MutateCampaignsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCampaignsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CampaignOperation> operations = new ArrayList<>();
      client.mutateCampaigns(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
