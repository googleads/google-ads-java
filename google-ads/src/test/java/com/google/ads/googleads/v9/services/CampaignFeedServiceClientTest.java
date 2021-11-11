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

import com.google.ads.googleads.v9.common.MatchingFunction;
import com.google.ads.googleads.v9.enums.PlaceholderTypeEnum;
import com.google.ads.googleads.v9.resources.CampaignFeed;
import com.google.ads.googleads.v9.resources.CampaignFeedName;
import com.google.ads.googleads.v9.resources.CampaignName;
import com.google.ads.googleads.v9.resources.FeedName;
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
public class CampaignFeedServiceClientTest {
  private static MockCampaignFeedService mockCampaignFeedService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CampaignFeedServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCampaignFeedService = new MockCampaignFeedService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockCampaignFeedService));
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
    CampaignFeedServiceSettings settings =
        CampaignFeedServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CampaignFeedServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCampaignFeedTest() throws Exception {
    CampaignFeed expectedResponse =
        CampaignFeed.newBuilder()
            .setResourceName(
                CampaignFeedName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[FEED_ID]").toString())
            .setFeed(FeedName.of("[CUSTOMER_ID]", "[FEED_ID]").toString())
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .addAllPlaceholderTypes(new ArrayList<PlaceholderTypeEnum.PlaceholderType>())
            .setMatchingFunction(MatchingFunction.newBuilder().build())
            .build();
    mockCampaignFeedService.addResponse(expectedResponse);

    CampaignFeedName resourceName =
        CampaignFeedName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[FEED_ID]");

    CampaignFeed actualResponse = client.getCampaignFeed(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignFeedService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignFeedRequest actualRequest = ((GetCampaignFeedRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignFeedExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignFeedService.addException(exception);

    try {
      CampaignFeedName resourceName =
          CampaignFeedName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[FEED_ID]");
      client.getCampaignFeed(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCampaignFeedTest2() throws Exception {
    CampaignFeed expectedResponse =
        CampaignFeed.newBuilder()
            .setResourceName(
                CampaignFeedName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[FEED_ID]").toString())
            .setFeed(FeedName.of("[CUSTOMER_ID]", "[FEED_ID]").toString())
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .addAllPlaceholderTypes(new ArrayList<PlaceholderTypeEnum.PlaceholderType>())
            .setMatchingFunction(MatchingFunction.newBuilder().build())
            .build();
    mockCampaignFeedService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CampaignFeed actualResponse = client.getCampaignFeed(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignFeedService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignFeedRequest actualRequest = ((GetCampaignFeedRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignFeedExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignFeedService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCampaignFeed(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCampaignFeedsTest() throws Exception {
    MutateCampaignFeedsResponse expectedResponse =
        MutateCampaignFeedsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCampaignFeedResult>())
            .build();
    mockCampaignFeedService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CampaignFeedOperation> operations = new ArrayList<>();

    MutateCampaignFeedsResponse actualResponse = client.mutateCampaignFeeds(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignFeedService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignFeedsRequest actualRequest = ((MutateCampaignFeedsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCampaignFeedsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignFeedService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CampaignFeedOperation> operations = new ArrayList<>();
      client.mutateCampaignFeeds(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
