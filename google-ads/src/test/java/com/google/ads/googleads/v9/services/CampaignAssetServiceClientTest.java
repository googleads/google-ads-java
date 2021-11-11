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

package com.google.ads.googleads.v9.services;

import com.google.ads.googleads.v9.resources.AssetName;
import com.google.ads.googleads.v9.resources.CampaignAsset;
import com.google.ads.googleads.v9.resources.CampaignAssetName;
import com.google.ads.googleads.v9.resources.CampaignName;
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
public class CampaignAssetServiceClientTest {
  private static MockCampaignAssetService mockCampaignAssetService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CampaignAssetServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCampaignAssetService = new MockCampaignAssetService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockCampaignAssetService));
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
    CampaignAssetServiceSettings settings =
        CampaignAssetServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CampaignAssetServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCampaignAssetTest() throws Exception {
    CampaignAsset expectedResponse =
        CampaignAsset.newBuilder()
            .setResourceName(
                CampaignAssetName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[ASSET_ID]", "[FIELD_TYPE]")
                    .toString())
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .setAsset(AssetName.of("[CUSTOMER_ID]", "[ASSET_ID]").toString())
            .build();
    mockCampaignAssetService.addResponse(expectedResponse);

    CampaignAssetName resourceName =
        CampaignAssetName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[ASSET_ID]", "[FIELD_TYPE]");

    CampaignAsset actualResponse = client.getCampaignAsset(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignAssetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignAssetRequest actualRequest = ((GetCampaignAssetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignAssetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignAssetService.addException(exception);

    try {
      CampaignAssetName resourceName =
          CampaignAssetName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[ASSET_ID]", "[FIELD_TYPE]");
      client.getCampaignAsset(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCampaignAssetTest2() throws Exception {
    CampaignAsset expectedResponse =
        CampaignAsset.newBuilder()
            .setResourceName(
                CampaignAssetName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[ASSET_ID]", "[FIELD_TYPE]")
                    .toString())
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .setAsset(AssetName.of("[CUSTOMER_ID]", "[ASSET_ID]").toString())
            .build();
    mockCampaignAssetService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CampaignAsset actualResponse = client.getCampaignAsset(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignAssetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignAssetRequest actualRequest = ((GetCampaignAssetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignAssetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignAssetService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCampaignAsset(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCampaignAssetsTest() throws Exception {
    MutateCampaignAssetsResponse expectedResponse =
        MutateCampaignAssetsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCampaignAssetResult>())
            .build();
    mockCampaignAssetService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CampaignAssetOperation> operations = new ArrayList<>();

    MutateCampaignAssetsResponse actualResponse =
        client.mutateCampaignAssets(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignAssetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignAssetsRequest actualRequest =
        ((MutateCampaignAssetsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCampaignAssetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignAssetService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CampaignAssetOperation> operations = new ArrayList<>();
      client.mutateCampaignAssets(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
