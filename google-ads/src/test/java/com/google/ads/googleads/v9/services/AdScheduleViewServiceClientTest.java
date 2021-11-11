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

import com.google.ads.googleads.v9.resources.AdScheduleView;
import com.google.ads.googleads.v9.resources.AdScheduleViewName;
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
public class AdScheduleViewServiceClientTest {
  private static MockAdScheduleViewService mockAdScheduleViewService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private AdScheduleViewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAdScheduleViewService = new MockAdScheduleViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAdScheduleViewService));
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
    AdScheduleViewServiceSettings settings =
        AdScheduleViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdScheduleViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdScheduleViewTest() throws Exception {
    AdScheduleView expectedResponse =
        AdScheduleView.newBuilder()
            .setResourceName(
                AdScheduleViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockAdScheduleViewService.addResponse(expectedResponse);

    AdScheduleViewName resourceName =
        AdScheduleViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]");

    AdScheduleView actualResponse = client.getAdScheduleView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdScheduleViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdScheduleViewRequest actualRequest = ((GetAdScheduleViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdScheduleViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdScheduleViewService.addException(exception);

    try {
      AdScheduleViewName resourceName =
          AdScheduleViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]");
      client.getAdScheduleView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdScheduleViewTest2() throws Exception {
    AdScheduleView expectedResponse =
        AdScheduleView.newBuilder()
            .setResourceName(
                AdScheduleViewName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockAdScheduleViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdScheduleView actualResponse = client.getAdScheduleView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdScheduleViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdScheduleViewRequest actualRequest = ((GetAdScheduleViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdScheduleViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdScheduleViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdScheduleView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
