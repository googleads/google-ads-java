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

import com.google.ads.googleads.v6.common.AdScheduleInfo;
import com.google.ads.googleads.v6.common.KeywordInfo;
import com.google.ads.googleads.v6.resources.ExtensionFeedItem;
import com.google.ads.googleads.v6.resources.ExtensionFeedItemName;
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
public class ExtensionFeedItemServiceClientTest {
  private static MockExtensionFeedItemService mockExtensionFeedItemService;
  private static MockServiceHelper mockServiceHelper;
  private ExtensionFeedItemServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockExtensionFeedItemService = new MockExtensionFeedItemService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockExtensionFeedItemService));
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
    ExtensionFeedItemServiceSettings settings =
        ExtensionFeedItemServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ExtensionFeedItemServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getExtensionFeedItemTest() throws Exception {
    ExtensionFeedItem expectedResponse =
        ExtensionFeedItem.newBuilder()
            .setResourceName(ExtensionFeedItemName.of("[CUSTOMER_ID]", "[FEED_ITEM_ID]").toString())
            .addAllAdSchedules(new ArrayList<AdScheduleInfo>())
            .setTargetedKeyword(KeywordInfo.newBuilder().build())
            .build();
    mockExtensionFeedItemService.addResponse(expectedResponse);

    ExtensionFeedItemName resourceName =
        ExtensionFeedItemName.of("[CUSTOMER_ID]", "[FEED_ITEM_ID]");

    ExtensionFeedItem actualResponse = client.getExtensionFeedItem(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockExtensionFeedItemService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetExtensionFeedItemRequest actualRequest =
        ((GetExtensionFeedItemRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getExtensionFeedItemExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExtensionFeedItemService.addException(exception);

    try {
      ExtensionFeedItemName resourceName =
          ExtensionFeedItemName.of("[CUSTOMER_ID]", "[FEED_ITEM_ID]");
      client.getExtensionFeedItem(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getExtensionFeedItemTest2() throws Exception {
    ExtensionFeedItem expectedResponse =
        ExtensionFeedItem.newBuilder()
            .setResourceName(ExtensionFeedItemName.of("[CUSTOMER_ID]", "[FEED_ITEM_ID]").toString())
            .addAllAdSchedules(new ArrayList<AdScheduleInfo>())
            .setTargetedKeyword(KeywordInfo.newBuilder().build())
            .build();
    mockExtensionFeedItemService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    ExtensionFeedItem actualResponse = client.getExtensionFeedItem(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockExtensionFeedItemService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetExtensionFeedItemRequest actualRequest =
        ((GetExtensionFeedItemRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getExtensionFeedItemExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExtensionFeedItemService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getExtensionFeedItem(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateExtensionFeedItemsTest() throws Exception {
    MutateExtensionFeedItemsResponse expectedResponse =
        MutateExtensionFeedItemsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateExtensionFeedItemResult>())
            .build();
    mockExtensionFeedItemService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<ExtensionFeedItemOperation> operations = new ArrayList<>();

    MutateExtensionFeedItemsResponse actualResponse =
        client.mutateExtensionFeedItems(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockExtensionFeedItemService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateExtensionFeedItemsRequest actualRequest =
        ((MutateExtensionFeedItemsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateExtensionFeedItemsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockExtensionFeedItemService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<ExtensionFeedItemOperation> operations = new ArrayList<>();
      client.mutateExtensionFeedItems(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
