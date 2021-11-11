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

import com.google.ads.googleads.v9.resources.AdGroupSimulation;
import com.google.ads.googleads.v9.resources.AdGroupSimulationName;
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
public class AdGroupSimulationServiceClientTest {
  private static MockAdGroupSimulationService mockAdGroupSimulationService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private AdGroupSimulationServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAdGroupSimulationService = new MockAdGroupSimulationService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAdGroupSimulationService));
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
    AdGroupSimulationServiceSettings settings =
        AdGroupSimulationServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdGroupSimulationServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdGroupSimulationTest() throws Exception {
    AdGroupSimulation expectedResponse =
        AdGroupSimulation.newBuilder()
            .setResourceName(
                AdGroupSimulationName.of(
                        "[CUSTOMER_ID]",
                        "[AD_GROUP_ID]",
                        "[TYPE]",
                        "[MODIFICATION_METHOD]",
                        "[START_DATE]",
                        "[END_DATE]")
                    .toString())
            .setAdGroupId(-85224585)
            .setStartDate("startDate-2129778896")
            .setEndDate("endDate-1607727319")
            .build();
    mockAdGroupSimulationService.addResponse(expectedResponse);

    AdGroupSimulationName resourceName =
        AdGroupSimulationName.of(
            "[CUSTOMER_ID]",
            "[AD_GROUP_ID]",
            "[TYPE]",
            "[MODIFICATION_METHOD]",
            "[START_DATE]",
            "[END_DATE]");

    AdGroupSimulation actualResponse = client.getAdGroupSimulation(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupSimulationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupSimulationRequest actualRequest =
        ((GetAdGroupSimulationRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupSimulationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupSimulationService.addException(exception);

    try {
      AdGroupSimulationName resourceName =
          AdGroupSimulationName.of(
              "[CUSTOMER_ID]",
              "[AD_GROUP_ID]",
              "[TYPE]",
              "[MODIFICATION_METHOD]",
              "[START_DATE]",
              "[END_DATE]");
      client.getAdGroupSimulation(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdGroupSimulationTest2() throws Exception {
    AdGroupSimulation expectedResponse =
        AdGroupSimulation.newBuilder()
            .setResourceName(
                AdGroupSimulationName.of(
                        "[CUSTOMER_ID]",
                        "[AD_GROUP_ID]",
                        "[TYPE]",
                        "[MODIFICATION_METHOD]",
                        "[START_DATE]",
                        "[END_DATE]")
                    .toString())
            .setAdGroupId(-85224585)
            .setStartDate("startDate-2129778896")
            .setEndDate("endDate-1607727319")
            .build();
    mockAdGroupSimulationService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdGroupSimulation actualResponse = client.getAdGroupSimulation(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupSimulationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupSimulationRequest actualRequest =
        ((GetAdGroupSimulationRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupSimulationExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupSimulationService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdGroupSimulation(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
