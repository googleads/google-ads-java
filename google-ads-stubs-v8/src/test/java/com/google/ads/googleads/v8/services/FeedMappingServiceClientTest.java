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

import com.google.ads.googleads.v8.resources.AttributeFieldMapping;
import com.google.ads.googleads.v8.resources.FeedMapping;
import com.google.ads.googleads.v8.resources.FeedMappingName;
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
public class FeedMappingServiceClientTest {
  private static MockFeedMappingService mockFeedMappingService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private FeedMappingServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockFeedMappingService = new MockFeedMappingService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockFeedMappingService));
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
    FeedMappingServiceSettings settings =
        FeedMappingServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = FeedMappingServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getFeedMappingTest() throws Exception {
    FeedMapping expectedResponse =
        FeedMapping.newBuilder()
            .setResourceName(
                FeedMappingName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_MAPPING_ID]").toString())
            .setFeed(FeedName.of("[CUSTOMER_ID]", "[FEED_ID]").toString())
            .addAllAttributeFieldMappings(new ArrayList<AttributeFieldMapping>())
            .build();
    mockFeedMappingService.addResponse(expectedResponse);

    FeedMappingName resourceName =
        FeedMappingName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_MAPPING_ID]");

    FeedMapping actualResponse = client.getFeedMapping(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedMappingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeedMappingRequest actualRequest = ((GetFeedMappingRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeedMappingExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedMappingService.addException(exception);

    try {
      FeedMappingName resourceName =
          FeedMappingName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_MAPPING_ID]");
      client.getFeedMapping(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getFeedMappingTest2() throws Exception {
    FeedMapping expectedResponse =
        FeedMapping.newBuilder()
            .setResourceName(
                FeedMappingName.of("[CUSTOMER_ID]", "[FEED_ID]", "[FEED_MAPPING_ID]").toString())
            .setFeed(FeedName.of("[CUSTOMER_ID]", "[FEED_ID]").toString())
            .addAllAttributeFieldMappings(new ArrayList<AttributeFieldMapping>())
            .build();
    mockFeedMappingService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    FeedMapping actualResponse = client.getFeedMapping(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedMappingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeedMappingRequest actualRequest = ((GetFeedMappingRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeedMappingExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedMappingService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getFeedMapping(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateFeedMappingsTest() throws Exception {
    MutateFeedMappingsResponse expectedResponse =
        MutateFeedMappingsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateFeedMappingResult>())
            .build();
    mockFeedMappingService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<FeedMappingOperation> operations = new ArrayList<>();

    MutateFeedMappingsResponse actualResponse = client.mutateFeedMappings(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedMappingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateFeedMappingsRequest actualRequest = ((MutateFeedMappingsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateFeedMappingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedMappingService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<FeedMappingOperation> operations = new ArrayList<>();
      client.mutateFeedMappings(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
