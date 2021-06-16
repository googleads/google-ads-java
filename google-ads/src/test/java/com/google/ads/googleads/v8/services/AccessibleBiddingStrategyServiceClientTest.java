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

import com.google.ads.googleads.v8.resources.AccessibleBiddingStrategy;
import com.google.ads.googleads.v8.resources.AccessibleBiddingStrategyName;
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
public class AccessibleBiddingStrategyServiceClientTest {
  private static MockAccessibleBiddingStrategyService mockAccessibleBiddingStrategyService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private AccessibleBiddingStrategyServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAccessibleBiddingStrategyService = new MockAccessibleBiddingStrategyService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAccessibleBiddingStrategyService));
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
    AccessibleBiddingStrategyServiceSettings settings =
        AccessibleBiddingStrategyServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AccessibleBiddingStrategyServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAccessibleBiddingStrategyTest() throws Exception {
    AccessibleBiddingStrategy expectedResponse =
        AccessibleBiddingStrategy.newBuilder()
            .setResourceName(
                AccessibleBiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]")
                    .toString())
            .setId(3355)
            .setName(
                AccessibleBiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]")
                    .toString())
            .setOwnerCustomerId(887314832)
            .setOwnerDescriptiveName("ownerDescriptiveName-791816636")
            .build();
    mockAccessibleBiddingStrategyService.addResponse(expectedResponse);

    AccessibleBiddingStrategyName resourceName =
        AccessibleBiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]");

    AccessibleBiddingStrategy actualResponse = client.getAccessibleBiddingStrategy(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAccessibleBiddingStrategyService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAccessibleBiddingStrategyRequest actualRequest =
        ((GetAccessibleBiddingStrategyRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAccessibleBiddingStrategyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAccessibleBiddingStrategyService.addException(exception);

    try {
      AccessibleBiddingStrategyName resourceName =
          AccessibleBiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]");
      client.getAccessibleBiddingStrategy(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAccessibleBiddingStrategyTest2() throws Exception {
    AccessibleBiddingStrategy expectedResponse =
        AccessibleBiddingStrategy.newBuilder()
            .setResourceName(
                AccessibleBiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]")
                    .toString())
            .setId(3355)
            .setName(
                AccessibleBiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]")
                    .toString())
            .setOwnerCustomerId(887314832)
            .setOwnerDescriptiveName("ownerDescriptiveName-791816636")
            .build();
    mockAccessibleBiddingStrategyService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AccessibleBiddingStrategy actualResponse = client.getAccessibleBiddingStrategy(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAccessibleBiddingStrategyService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAccessibleBiddingStrategyRequest actualRequest =
        ((GetAccessibleBiddingStrategyRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAccessibleBiddingStrategyExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAccessibleBiddingStrategyService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAccessibleBiddingStrategy(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
