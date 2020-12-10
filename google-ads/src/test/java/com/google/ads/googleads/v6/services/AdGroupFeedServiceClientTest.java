/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.common.MatchingFunction;
import com.google.ads.googleads.v6.enums.PlaceholderTypeEnum;
import com.google.ads.googleads.v6.resources.AdGroupFeed;
import com.google.ads.googleads.v6.resources.AdGroupFeedName;
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
public class AdGroupFeedServiceClientTest {
  private static MockAdGroupFeedService mockAdGroupFeedService;
  private static MockServiceHelper mockServiceHelper;
  private AdGroupFeedServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAdGroupFeedService = new MockAdGroupFeedService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockAdGroupFeedService));
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
    AdGroupFeedServiceSettings settings =
        AdGroupFeedServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdGroupFeedServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdGroupFeedTest() throws Exception {
    AdGroupFeed expectedResponse =
        AdGroupFeed.newBuilder()
            .setResourceName(
                AdGroupFeedName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[FEED_ID]").toString())
            .addAllPlaceholderTypes(new ArrayList<PlaceholderTypeEnum.PlaceholderType>())
            .setMatchingFunction(MatchingFunction.newBuilder().build())
            .build();
    mockAdGroupFeedService.addResponse(expectedResponse);

    AdGroupFeedName resourceName =
        AdGroupFeedName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[FEED_ID]");

    AdGroupFeed actualResponse = client.getAdGroupFeed(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupFeedService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupFeedRequest actualRequest = ((GetAdGroupFeedRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupFeedExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupFeedService.addException(exception);

    try {
      AdGroupFeedName resourceName =
          AdGroupFeedName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[FEED_ID]");
      client.getAdGroupFeed(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdGroupFeedTest2() throws Exception {
    AdGroupFeed expectedResponse =
        AdGroupFeed.newBuilder()
            .setResourceName(
                AdGroupFeedName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[FEED_ID]").toString())
            .addAllPlaceholderTypes(new ArrayList<PlaceholderTypeEnum.PlaceholderType>())
            .setMatchingFunction(MatchingFunction.newBuilder().build())
            .build();
    mockAdGroupFeedService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdGroupFeed actualResponse = client.getAdGroupFeed(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupFeedService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupFeedRequest actualRequest = ((GetAdGroupFeedRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupFeedExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupFeedService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdGroupFeed(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAdGroupFeedsTest() throws Exception {
    MutateAdGroupFeedsResponse expectedResponse =
        MutateAdGroupFeedsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateAdGroupFeedResult>())
            .build();
    mockAdGroupFeedService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<AdGroupFeedOperation> operations = new ArrayList<>();

    MutateAdGroupFeedsResponse actualResponse = client.mutateAdGroupFeeds(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupFeedService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAdGroupFeedsRequest actualRequest = ((MutateAdGroupFeedsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAdGroupFeedsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupFeedService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<AdGroupFeedOperation> operations = new ArrayList<>();
      client.mutateAdGroupFeeds(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
