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

package com.google.ads.googleads.v8.services;

import com.google.ads.googleads.v8.resources.FeedItemSet;
import com.google.ads.googleads.v8.resources.FeedItemSetName;
import com.google.ads.googleads.v8.resources.FeedName;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
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
public class FeedItemSetServiceClientTest {
  private static MockFeedItemSetService mockFeedItemSetService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private FeedItemSetServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockFeedItemSetService = new MockFeedItemSetService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockFeedItemSetService));
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
    FeedItemSetServiceSettings settings =
        FeedItemSetServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = FeedItemSetServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getFeedItemSetTest() throws Exception {
    FeedItemSet expectedResponse =
        FeedItemSet.newBuilder()
            .setResourceName(
                FeedItemSetName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]").toString())
            .setFeed(FeedName.of("[CUSTOMER_ID]", "[FEED_ID]").toString())
            .setFeedItemSetId(1588723619)
            .setDisplayName("displayName1714148973")
            .build();
    mockFeedItemSetService.addResponse(expectedResponse);

    FeedItemSetName resourceName =
        FeedItemSetName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]");

    FeedItemSet actualResponse = client.getFeedItemSet(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedItemSetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeedItemSetRequest actualRequest = ((GetFeedItemSetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeedItemSetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedItemSetService.addException(exception);

    try {
      FeedItemSetName resourceName =
          FeedItemSetName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]");
      client.getFeedItemSet(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getFeedItemSetTest2() throws Exception {
    FeedItemSet expectedResponse =
        FeedItemSet.newBuilder()
            .setResourceName(
                FeedItemSetName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]").toString())
            .setFeed(FeedName.of("[CUSTOMER_ID]", "[FEED_ID]").toString())
            .setFeedItemSetId(1588723619)
            .setDisplayName("displayName1714148973")
            .build();
    mockFeedItemSetService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    FeedItemSet actualResponse = client.getFeedItemSet(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedItemSetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeedItemSetRequest actualRequest = ((GetFeedItemSetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeedItemSetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedItemSetService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getFeedItemSet(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateFeedItemSetsTest() throws Exception {
    MutateFeedItemSetsResponse expectedResponse =
        MutateFeedItemSetsResponse.newBuilder()
            .addAllResults(new ArrayList<MutateFeedItemSetResult>())
            .build();
    mockFeedItemSetService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<FeedItemSetOperation> operations = new ArrayList<>();

    MutateFeedItemSetsResponse actualResponse = client.mutateFeedItemSets(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedItemSetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateFeedItemSetsRequest actualRequest = ((MutateFeedItemSetsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateFeedItemSetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedItemSetService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<FeedItemSetOperation> operations = new ArrayList<>();
      client.mutateFeedItemSets(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
