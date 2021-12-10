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

import com.google.ads.googleads.v7.resources.DistanceView;
import com.google.ads.googleads.v7.resources.DistanceViewName;
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
public class DistanceViewServiceClientTest {
  private static MockDistanceViewService mockDistanceViewService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private DistanceViewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockDistanceViewService = new MockDistanceViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockDistanceViewService));
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
    DistanceViewServiceSettings settings =
        DistanceViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = DistanceViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getDistanceViewTest() throws Exception {
    DistanceView expectedResponse =
        DistanceView.newBuilder()
            .setResourceName(
                DistanceViewName.of("[CUSTOMER_ID]", "[PLACEHOLDER_CHAIN_ID]", "[DISTANCE_BUCKET]")
                    .toString())
            .setMetricSystem(true)
            .build();
    mockDistanceViewService.addResponse(expectedResponse);

    DistanceViewName resourceName =
        DistanceViewName.of("[CUSTOMER_ID]", "[PLACEHOLDER_CHAIN_ID]", "[DISTANCE_BUCKET]");

    DistanceView actualResponse = client.getDistanceView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDistanceViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDistanceViewRequest actualRequest = ((GetDistanceViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDistanceViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDistanceViewService.addException(exception);

    try {
      DistanceViewName resourceName =
          DistanceViewName.of("[CUSTOMER_ID]", "[PLACEHOLDER_CHAIN_ID]", "[DISTANCE_BUCKET]");
      client.getDistanceView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDistanceViewTest2() throws Exception {
    DistanceView expectedResponse =
        DistanceView.newBuilder()
            .setResourceName(
                DistanceViewName.of("[CUSTOMER_ID]", "[PLACEHOLDER_CHAIN_ID]", "[DISTANCE_BUCKET]")
                    .toString())
            .setMetricSystem(true)
            .build();
    mockDistanceViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    DistanceView actualResponse = client.getDistanceView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDistanceViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDistanceViewRequest actualRequest = ((GetDistanceViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDistanceViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDistanceViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getDistanceView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
