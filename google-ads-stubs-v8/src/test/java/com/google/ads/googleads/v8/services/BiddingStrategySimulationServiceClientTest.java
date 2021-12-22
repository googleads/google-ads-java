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

import com.google.ads.googleads.v8.resources.BiddingStrategySimulation;
import com.google.ads.googleads.v8.resources.BiddingStrategySimulationName;
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
public class BiddingStrategySimulationServiceClientTest {
  private static MockBiddingStrategySimulationService mockBiddingStrategySimulationService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private BiddingStrategySimulationServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockBiddingStrategySimulationService = new MockBiddingStrategySimulationService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockBiddingStrategySimulationService));
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
    BiddingStrategySimulationServiceSettings settings =
        BiddingStrategySimulationServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = BiddingStrategySimulationServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getBiddingStrategySimulationTest() throws Exception {
    BiddingStrategySimulation expectedResponse =
        BiddingStrategySimulation.newBuilder()
            .setResourceName(
                BiddingStrategySimulationName.of(
                        "[CUSTOMER_ID]",
                        "[BIDDING_STRATEGY_ID]",
                        "[TYPE]",
                        "[MODIFICATION_METHOD]",
                        "[START_DATE]",
                        "[END_DATE]")
                    .toString())
            .setBiddingStrategyId(1437791907)
            .setStartDate("startDate-2129778896")
            .setEndDate("endDate-1607727319")
            .build();
    mockBiddingStrategySimulationService.addResponse(expectedResponse);

    BiddingStrategySimulationName resourceName =
        BiddingStrategySimulationName.of(
            "[CUSTOMER_ID]",
            "[BIDDING_STRATEGY_ID]",
            "[TYPE]",
            "[MODIFICATION_METHOD]",
            "[START_DATE]",
            "[END_DATE]");

    BiddingStrategySimulation actualResponse = client.getBiddingStrategySimulation(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBiddingStrategySimulationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBiddingStrategySimulationRequest actualRequest =
        ((GetBiddingStrategySimulationRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBiddingStrategySimulationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBiddingStrategySimulationService.addException(exception);

    try {
      BiddingStrategySimulationName resourceName =
          BiddingStrategySimulationName.of(
              "[CUSTOMER_ID]",
              "[BIDDING_STRATEGY_ID]",
              "[TYPE]",
              "[MODIFICATION_METHOD]",
              "[START_DATE]",
              "[END_DATE]");
      client.getBiddingStrategySimulation(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getBiddingStrategySimulationTest2() throws Exception {
    BiddingStrategySimulation expectedResponse =
        BiddingStrategySimulation.newBuilder()
            .setResourceName(
                BiddingStrategySimulationName.of(
                        "[CUSTOMER_ID]",
                        "[BIDDING_STRATEGY_ID]",
                        "[TYPE]",
                        "[MODIFICATION_METHOD]",
                        "[START_DATE]",
                        "[END_DATE]")
                    .toString())
            .setBiddingStrategyId(1437791907)
            .setStartDate("startDate-2129778896")
            .setEndDate("endDate-1607727319")
            .build();
    mockBiddingStrategySimulationService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    BiddingStrategySimulation actualResponse = client.getBiddingStrategySimulation(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBiddingStrategySimulationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBiddingStrategySimulationRequest actualRequest =
        ((GetBiddingStrategySimulationRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBiddingStrategySimulationExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBiddingStrategySimulationService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getBiddingStrategySimulation(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
