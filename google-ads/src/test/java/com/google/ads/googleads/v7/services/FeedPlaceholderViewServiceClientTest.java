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

import com.google.ads.googleads.v7.resources.FeedPlaceholderView;
import com.google.ads.googleads.v7.resources.FeedPlaceholderViewName;
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
public class FeedPlaceholderViewServiceClientTest {
  private static MockFeedPlaceholderViewService mockFeedPlaceholderViewService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private FeedPlaceholderViewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockFeedPlaceholderViewService = new MockFeedPlaceholderViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockFeedPlaceholderViewService));
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
    FeedPlaceholderViewServiceSettings settings =
        FeedPlaceholderViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = FeedPlaceholderViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getFeedPlaceholderViewTest() throws Exception {
    FeedPlaceholderView expectedResponse =
        FeedPlaceholderView.newBuilder()
            .setResourceName(
                FeedPlaceholderViewName.of("[CUSTOMER_ID]", "[PLACEHOLDER_TYPE]").toString())
            .build();
    mockFeedPlaceholderViewService.addResponse(expectedResponse);

    FeedPlaceholderViewName resourceName =
        FeedPlaceholderViewName.of("[CUSTOMER_ID]", "[PLACEHOLDER_TYPE]");

    FeedPlaceholderView actualResponse = client.getFeedPlaceholderView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedPlaceholderViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeedPlaceholderViewRequest actualRequest =
        ((GetFeedPlaceholderViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeedPlaceholderViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedPlaceholderViewService.addException(exception);

    try {
      FeedPlaceholderViewName resourceName =
          FeedPlaceholderViewName.of("[CUSTOMER_ID]", "[PLACEHOLDER_TYPE]");
      client.getFeedPlaceholderView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getFeedPlaceholderViewTest2() throws Exception {
    FeedPlaceholderView expectedResponse =
        FeedPlaceholderView.newBuilder()
            .setResourceName(
                FeedPlaceholderViewName.of("[CUSTOMER_ID]", "[PLACEHOLDER_TYPE]").toString())
            .build();
    mockFeedPlaceholderViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    FeedPlaceholderView actualResponse = client.getFeedPlaceholderView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockFeedPlaceholderViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetFeedPlaceholderViewRequest actualRequest =
        ((GetFeedPlaceholderViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getFeedPlaceholderViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockFeedPlaceholderViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getFeedPlaceholderView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
