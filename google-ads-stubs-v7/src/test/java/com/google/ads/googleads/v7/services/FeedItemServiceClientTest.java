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
import com.google.ads.googleads.v7.resources.FeedItem;
import com.google.ads.googleads.v7.resources.FeedItemAttributeValue;
import com.google.ads.googleads.v7.resources.FeedItemName;
import com.google.ads.googleads.v7.resources.FeedItemPlaceholderPolicyInfo;
import com.google.ads.googleads.v7.resources.FeedName;
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
public class FeedItemServiceClientTest {
  private static MockFeedItemService mockFeedItemService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private FeedItemServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockFeedItemService = new MockFeedItemService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockFeedItemService));
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
    FeedItemServiceSettings settings =
        FeedItemServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = FeedItemServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getFeedItemTest() throws Exception {
    FeedItem expectedResponse =
        FeedItem.newBuilder()
            .setResourceName(
                FeedItemName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_ID]").toString())
            .setFeed(FeedName.of("[CUSTOMER_ID]", "[FEED_ID]").toString())
            .setId(3355)
            .setStartDateTime("startDateTime1919866397")
            .setEndDateTime("endDateTime255463830")
            .addAllAttributeValues(new ArrayList<FeedItemAttributeValue>())
            .addAllUrlCustomParameters(new ArrayList<CustomParameter>())
            .addAllPolicyInfos(new ArrayList<FeedItemPlaceholderPolicyInfo>())
            .build();
    mockFeedItemService.addResponse(expectedResponse);

    FeedItemName resourceName = FeedItemName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_ID]");

    FeedItem actualResponse = client.getFeedItem(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedItemService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeedItemRequest actualRequest = ((GetFeedItemRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeedItemExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedItemService.addException(exception);

    try {
      FeedItemName resourceName = FeedItemName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_ID]");
      client.getFeedItem(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getFeedItemTest2() throws Exception {
    FeedItem expectedResponse =
        FeedItem.newBuilder()
            .setResourceName(
                FeedItemName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_ID]").toString())
            .setFeed(FeedName.of("[CUSTOMER_ID]", "[FEED_ID]").toString())
            .setId(3355)
            .setStartDateTime("startDateTime1919866397")
            .setEndDateTime("endDateTime255463830")
            .addAllAttributeValues(new ArrayList<FeedItemAttributeValue>())
            .addAllUrlCustomParameters(new ArrayList<CustomParameter>())
            .addAllPolicyInfos(new ArrayList<FeedItemPlaceholderPolicyInfo>())
            .build();
    mockFeedItemService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    FeedItem actualResponse = client.getFeedItem(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedItemService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeedItemRequest actualRequest = ((GetFeedItemRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeedItemExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedItemService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getFeedItem(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateFeedItemsTest() throws Exception {
    MutateFeedItemsResponse expectedResponse =
        MutateFeedItemsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateFeedItemResult>())
            .build();
    mockFeedItemService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<FeedItemOperation> operations = new ArrayList<>();

    MutateFeedItemsResponse actualResponse = client.mutateFeedItems(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedItemService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateFeedItemsRequest actualRequest = ((MutateFeedItemsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateFeedItemsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedItemService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<FeedItemOperation> operations = new ArrayList<>();
      client.mutateFeedItems(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
