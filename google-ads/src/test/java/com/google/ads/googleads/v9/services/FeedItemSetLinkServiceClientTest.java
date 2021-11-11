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
import com.google.ads.googleads.v9.resources.FeedItemSetLink;
import com.google.ads.googleads.v9.resources.FeedItemSetLinkName;
import com.google.ads.googleads.v9.resources.FeedItemSetName;
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
public class FeedItemSetLinkServiceClientTest {
  private static MockFeedItemSetLinkService mockFeedItemSetLinkService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private FeedItemSetLinkServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockFeedItemSetLinkService = new MockFeedItemSetLinkService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockFeedItemSetLinkService));
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
    FeedItemSetLinkServiceSettings settings =
        FeedItemSetLinkServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = FeedItemSetLinkServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getFeedItemSetLinkTest() throws Exception {
    FeedItemSetLink expectedResponse =
        FeedItemSetLink.newBuilder()
            .setResourceName(
                FeedItemSetLinkName.of(
                        "[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]", "[FEED_ITEM_ID]")
                    .toString())
            .setFeedItem(FeedItemName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_ID]").toString())
            .setFeedItemSet(
                FeedItemSetName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]").toString())
            .build();
    mockFeedItemSetLinkService.addResponse(expectedResponse);

    FeedItemSetLinkName resourceName =
        FeedItemSetLinkName.of(
            "[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]", "[FEED_ITEM_ID]");

    FeedItemSetLink actualResponse = client.getFeedItemSetLink(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedItemSetLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeedItemSetLinkRequest actualRequest = ((GetFeedItemSetLinkRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeedItemSetLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedItemSetLinkService.addException(exception);

    try {
      FeedItemSetLinkName resourceName =
          FeedItemSetLinkName.of(
              "[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]", "[FEED_ITEM_ID]");
      client.getFeedItemSetLink(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getFeedItemSetLinkTest2() throws Exception {
    FeedItemSetLink expectedResponse =
        FeedItemSetLink.newBuilder()
            .setResourceName(
                FeedItemSetLinkName.of(
                        "[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]", "[FEED_ITEM_ID]")
                    .toString())
            .setFeedItem(FeedItemName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_ID]").toString())
            .setFeedItemSet(
                FeedItemSetName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_ITEM_SET_ID]").toString())
            .build();
    mockFeedItemSetLinkService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    FeedItemSetLink actualResponse = client.getFeedItemSetLink(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedItemSetLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeedItemSetLinkRequest actualRequest = ((GetFeedItemSetLinkRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeedItemSetLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedItemSetLinkService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getFeedItemSetLink(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateFeedItemSetLinksTest() throws Exception {
    MutateFeedItemSetLinksResponse expectedResponse =
        MutateFeedItemSetLinksResponse.newBuilder()
            .addAllResults(new ArrayList<MutateFeedItemSetLinkResult>())
            .setPartialFailureError(Status.newBuilder().build())
            .build();
    mockFeedItemSetLinkService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<FeedItemSetLinkOperation> operations = new ArrayList<>();

    MutateFeedItemSetLinksResponse actualResponse =
        client.mutateFeedItemSetLinks(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedItemSetLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateFeedItemSetLinksRequest actualRequest =
        ((MutateFeedItemSetLinksRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateFeedItemSetLinksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedItemSetLinkService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<FeedItemSetLinkOperation> operations = new ArrayList<>();
      client.mutateFeedItemSetLinks(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
