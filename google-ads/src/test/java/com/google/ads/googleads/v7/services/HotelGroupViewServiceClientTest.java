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

import com.google.ads.googleads.v7.resources.HotelGroupView;
import com.google.ads.googleads.v7.resources.HotelGroupViewName;
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
public class HotelGroupViewServiceClientTest {
  private static MockHotelGroupViewService mockHotelGroupViewService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private HotelGroupViewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockHotelGroupViewService = new MockHotelGroupViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockHotelGroupViewService));
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
    HotelGroupViewServiceSettings settings =
        HotelGroupViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = HotelGroupViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getHotelGroupViewTest() throws Exception {
    HotelGroupView expectedResponse =
        HotelGroupView.newBuilder()
            .setResourceName(
                HotelGroupViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockHotelGroupViewService.addResponse(expectedResponse);

    HotelGroupViewName resourceName =
        HotelGroupViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");

    HotelGroupView actualResponse = client.getHotelGroupView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockHotelGroupViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetHotelGroupViewRequest actualRequest = ((GetHotelGroupViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getHotelGroupViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockHotelGroupViewService.addException(exception);

    try {
      HotelGroupViewName resourceName =
          HotelGroupViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
      client.getHotelGroupView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getHotelGroupViewTest2() throws Exception {
    HotelGroupView expectedResponse =
        HotelGroupView.newBuilder()
            .setResourceName(
                HotelGroupViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockHotelGroupViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    HotelGroupView actualResponse = client.getHotelGroupView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockHotelGroupViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetHotelGroupViewRequest actualRequest = ((GetHotelGroupViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getHotelGroupViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockHotelGroupViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getHotelGroupView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
