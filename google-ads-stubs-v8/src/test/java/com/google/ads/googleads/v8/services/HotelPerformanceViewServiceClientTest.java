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

import com.google.ads.googleads.v8.resources.HotelPerformanceView;
import com.google.ads.googleads.v8.resources.HotelPerformanceViewName;
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
public class HotelPerformanceViewServiceClientTest {
  private static MockHotelPerformanceViewService mockHotelPerformanceViewService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private HotelPerformanceViewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockHotelPerformanceViewService = new MockHotelPerformanceViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockHotelPerformanceViewService));
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
    HotelPerformanceViewServiceSettings settings =
        HotelPerformanceViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = HotelPerformanceViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getHotelPerformanceViewTest() throws Exception {
    HotelPerformanceView expectedResponse =
        HotelPerformanceView.newBuilder()
            .setResourceName(HotelPerformanceViewName.of("[CUSTOMER_ID]").toString())
            .build();
    mockHotelPerformanceViewService.addResponse(expectedResponse);

    HotelPerformanceViewName resourceName = HotelPerformanceViewName.of("[CUSTOMER_ID]");

    HotelPerformanceView actualResponse = client.getHotelPerformanceView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockHotelPerformanceViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetHotelPerformanceViewRequest actualRequest =
        ((GetHotelPerformanceViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getHotelPerformanceViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockHotelPerformanceViewService.addException(exception);

    try {
      HotelPerformanceViewName resourceName = HotelPerformanceViewName.of("[CUSTOMER_ID]");
      client.getHotelPerformanceView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getHotelPerformanceViewTest2() throws Exception {
    HotelPerformanceView expectedResponse =
        HotelPerformanceView.newBuilder()
            .setResourceName(HotelPerformanceViewName.of("[CUSTOMER_ID]").toString())
            .build();
    mockHotelPerformanceViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    HotelPerformanceView actualResponse = client.getHotelPerformanceView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockHotelPerformanceViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetHotelPerformanceViewRequest actualRequest =
        ((GetHotelPerformanceViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getHotelPerformanceViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockHotelPerformanceViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getHotelPerformanceView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
