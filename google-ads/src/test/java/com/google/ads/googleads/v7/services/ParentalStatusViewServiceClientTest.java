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

import com.google.ads.googleads.v7.resources.ParentalStatusView;
import com.google.ads.googleads.v7.resources.ParentalStatusViewName;
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
public class ParentalStatusViewServiceClientTest {
  private static MockParentalStatusViewService mockParentalStatusViewService;
  private static MockServiceHelper mockServiceHelper;
  private ParentalStatusViewServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockParentalStatusViewService = new MockParentalStatusViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockParentalStatusViewService));
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
    ParentalStatusViewServiceSettings settings =
        ParentalStatusViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ParentalStatusViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getParentalStatusViewTest() throws Exception {
    ParentalStatusView expectedResponse =
        ParentalStatusView.newBuilder()
            .setResourceName(
                ParentalStatusViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockParentalStatusViewService.addResponse(expectedResponse);

    ParentalStatusViewName resourceName =
        ParentalStatusViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");

    ParentalStatusView actualResponse = client.getParentalStatusView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockParentalStatusViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetParentalStatusViewRequest actualRequest =
        ((GetParentalStatusViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getParentalStatusViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockParentalStatusViewService.addException(exception);

    try {
      ParentalStatusViewName resourceName =
          ParentalStatusViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
      client.getParentalStatusView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getParentalStatusViewTest2() throws Exception {
    ParentalStatusView expectedResponse =
        ParentalStatusView.newBuilder()
            .setResourceName(
                ParentalStatusViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockParentalStatusViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    ParentalStatusView actualResponse = client.getParentalStatusView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockParentalStatusViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetParentalStatusViewRequest actualRequest =
        ((GetParentalStatusViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getParentalStatusViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockParentalStatusViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getParentalStatusView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
