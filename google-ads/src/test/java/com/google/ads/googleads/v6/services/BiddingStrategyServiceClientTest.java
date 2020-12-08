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

import com.google.ads.googleads.v6.resources.BiddingStrategy;
import com.google.ads.googleads.v6.resources.BiddingStrategyName;
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
public class BiddingStrategyServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockBiddingStrategyService mockBiddingStrategyService;
  private BiddingStrategyServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockBiddingStrategyService = new MockBiddingStrategyService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockBiddingStrategyService));
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
    BiddingStrategyServiceSettings settings =
        BiddingStrategyServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = BiddingStrategyServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getBiddingStrategyTest() throws Exception {
    BiddingStrategy expectedResponse =
        BiddingStrategy.newBuilder()
            .setResourceName(
                BiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]").toString())
            .build();
    mockBiddingStrategyService.addResponse(expectedResponse);

    BiddingStrategyName resourceName =
        BiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]");

    BiddingStrategy actualResponse = client.getBiddingStrategy(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBiddingStrategyService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBiddingStrategyRequest actualRequest = ((GetBiddingStrategyRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBiddingStrategyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBiddingStrategyService.addException(exception);

    try {
      BiddingStrategyName resourceName =
          BiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]");
      client.getBiddingStrategy(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getBiddingStrategyTest2() throws Exception {
    BiddingStrategy expectedResponse =
        BiddingStrategy.newBuilder()
            .setResourceName(
                BiddingStrategyName.of("[CUSTOMER_ID]", "[BIDDING_STRATEGY_ID]").toString())
            .build();
    mockBiddingStrategyService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    BiddingStrategy actualResponse = client.getBiddingStrategy(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBiddingStrategyService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBiddingStrategyRequest actualRequest = ((GetBiddingStrategyRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBiddingStrategyExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBiddingStrategyService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getBiddingStrategy(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateBiddingStrategiesTest() throws Exception {
    MutateBiddingStrategiesResponse expectedResponse =
        MutateBiddingStrategiesResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateBiddingStrategyResult>())
            .build();
    mockBiddingStrategyService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<BiddingStrategyOperation> operations = new ArrayList<>();

    MutateBiddingStrategiesResponse actualResponse =
        client.mutateBiddingStrategies(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBiddingStrategyService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateBiddingStrategiesRequest actualRequest =
        ((MutateBiddingStrategiesRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateBiddingStrategiesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBiddingStrategyService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<BiddingStrategyOperation> operations = new ArrayList<>();
      client.mutateBiddingStrategies(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
