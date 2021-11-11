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

import com.google.ads.googleads.v9.resources.FeedItemName;
import com.google.ads.googleads.v9.resources.FeedItemTarget;
import com.google.ads.googleads.v9.resources.FeedItemTargetName;
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
public class FeedItemTargetServiceClientTest {
  private static MockFeedItemTargetService mockFeedItemTargetService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private FeedItemTargetServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockFeedItemTargetService = new MockFeedItemTargetService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockFeedItemTargetService));
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
    FeedItemTargetServiceSettings settings =
        FeedItemTargetServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = FeedItemTargetServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getFeedItemTargetTest() throws Exception {
    FeedItemTarget expectedResponse =
        FeedItemTarget.newBuilder()
            .setResourceName(
                FeedItemTargetName.of(
                        "[CUSTOMER_ID]",
                        "[FEED_ID]",
                        "[FEED_ITEM_ID]",
                        "[FEED_ITEM_TARGET_TYPE]",
                        "[FEED_ITEM_TARGET_ID]")
                    .toString())
            .setFeedItem(FeedItemName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_ID]").toString())
            .setFeedItemTargetId(1682840862)
            .build();
    mockFeedItemTargetService.addResponse(expectedResponse);

    FeedItemTargetName resourceName =
        FeedItemTargetName.of(
            "[CUSTOMER_ID]",
            "[FEED_ID]",
            "[FEED_ITEM_ID]",
            "[FEED_ITEM_TARGET_TYPE]",
            "[FEED_ITEM_TARGET_ID]");

    FeedItemTarget actualResponse = client.getFeedItemTarget(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedItemTargetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeedItemTargetRequest actualRequest = ((GetFeedItemTargetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeedItemTargetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedItemTargetService.addException(exception);

    try {
      FeedItemTargetName resourceName =
          FeedItemTargetName.of(
              "[CUSTOMER_ID]",
              "[FEED_ID]",
              "[FEED_ITEM_ID]",
              "[FEED_ITEM_TARGET_TYPE]",
              "[FEED_ITEM_TARGET_ID]");
      client.getFeedItemTarget(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getFeedItemTargetTest2() throws Exception {
    FeedItemTarget expectedResponse =
        FeedItemTarget.newBuilder()
            .setResourceName(
                FeedItemTargetName.of(
                        "[CUSTOMER_ID]",
                        "[FEED_ID]",
                        "[FEED_ITEM_ID]",
                        "[FEED_ITEM_TARGET_TYPE]",
                        "[FEED_ITEM_TARGET_ID]")
                    .toString())
            .setFeedItem(FeedItemName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_ID]").toString())
            .setFeedItemTargetId(1682840862)
            .build();
    mockFeedItemTargetService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    FeedItemTarget actualResponse = client.getFeedItemTarget(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedItemTargetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeedItemTargetRequest actualRequest = ((GetFeedItemTargetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeedItemTargetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedItemTargetService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getFeedItemTarget(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateFeedItemTargetsTest() throws Exception {
    MutateFeedItemTargetsResponse expectedResponse =
        MutateFeedItemTargetsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateFeedItemTargetResult>())
            .build();
    mockFeedItemTargetService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<FeedItemTargetOperation> operations = new ArrayList<>();

    MutateFeedItemTargetsResponse actualResponse =
        client.mutateFeedItemTargets(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedItemTargetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateFeedItemTargetsRequest actualRequest =
        ((MutateFeedItemTargetsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateFeedItemTargetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedItemTargetService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<FeedItemTargetOperation> operations = new ArrayList<>();
      client.mutateFeedItemTargets(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
