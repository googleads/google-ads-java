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

import com.google.ads.googleads.v8.resources.Feed;
import com.google.ads.googleads.v8.resources.FeedAttribute;
import com.google.ads.googleads.v8.resources.FeedAttributeOperation;
import com.google.ads.googleads.v8.resources.FeedName;
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
public class FeedServiceClientTest {
  private static MockFeedService mockFeedService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private FeedServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockFeedService = new MockFeedService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockFeedService));
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
    FeedServiceSettings settings =
        FeedServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = FeedServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getFeedTest() throws Exception {
    Feed expectedResponse =
        Feed.newBuilder()
            .setResourceName(FeedName.of("[CUSTOMER_ID]", "[FEED_ID]").toString())
            .setId(3355)
            .setName(FeedName.of("[CUSTOMER_ID]", "[FEED_ID]").toString())
            .addAllAttributes(new ArrayList<FeedAttribute>())
            .addAllAttributeOperations(new ArrayList<FeedAttributeOperation>())
            .build();
    mockFeedService.addResponse(expectedResponse);

    FeedName resourceName = FeedName.of("[CUSTOMER_ID]", "[FEED_ID]");

    Feed actualResponse = client.getFeed(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeedRequest actualRequest = ((GetFeedRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeedExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedService.addException(exception);

    try {
      FeedName resourceName = FeedName.of("[CUSTOMER_ID]", "[FEED_ID]");
      client.getFeed(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getFeedTest2() throws Exception {
    Feed expectedResponse =
        Feed.newBuilder()
            .setResourceName(FeedName.of("[CUSTOMER_ID]", "[FEED_ID]").toString())
            .setId(3355)
            .setName(FeedName.of("[CUSTOMER_ID]", "[FEED_ID]").toString())
            .addAllAttributes(new ArrayList<FeedAttribute>())
            .addAllAttributeOperations(new ArrayList<FeedAttributeOperation>())
            .build();
    mockFeedService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    Feed actualResponse = client.getFeed(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeedRequest actualRequest = ((GetFeedRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeedExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getFeed(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateFeedsTest() throws Exception {
    MutateFeedsResponse expectedResponse =
        MutateFeedsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateFeedResult>())
            .build();
    mockFeedService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<FeedOperation> operations = new ArrayList<>();

    MutateFeedsResponse actualResponse = client.mutateFeeds(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateFeedsRequest actualRequest = ((MutateFeedsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateFeedsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<FeedOperation> operations = new ArrayList<>();
      client.mutateFeeds(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
