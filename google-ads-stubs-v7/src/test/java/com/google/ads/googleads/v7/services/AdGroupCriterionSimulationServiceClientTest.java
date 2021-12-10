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

import com.google.ads.googleads.v7.resources.AdGroupCriterionSimulation;
import com.google.ads.googleads.v7.resources.AdGroupCriterionSimulationName;
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
public class AdGroupCriterionSimulationServiceClientTest {
  private static MockAdGroupCriterionSimulationService mockAdGroupCriterionSimulationService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private AdGroupCriterionSimulationServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAdGroupCriterionSimulationService = new MockAdGroupCriterionSimulationService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAdGroupCriterionSimulationService));
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
    AdGroupCriterionSimulationServiceSettings settings =
        AdGroupCriterionSimulationServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdGroupCriterionSimulationServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdGroupCriterionSimulationTest() throws Exception {
    AdGroupCriterionSimulation expectedResponse =
        AdGroupCriterionSimulation.newBuilder()
            .setResourceName(
                AdGroupCriterionSimulationName.of(
                        "[CUSTOMER_ID]",
                        "[AD_GROUP_ID]",
                        "[CRITERION_ID]",
                        "[TYPE]",
                        "[MODIFICATION_METHOD]",
                        "[START_DATE]",
                        "[END_DATE]")
                    .toString())
            .setAdGroupId(-85224585)
            .setCriterionId(-326773895)
            .setStartDate("startDate-2129778896")
            .setEndDate("endDate-1607727319")
            .build();
    mockAdGroupCriterionSimulationService.addResponse(expectedResponse);

    AdGroupCriterionSimulationName resourceName =
        AdGroupCriterionSimulationName.of(
            "[CUSTOMER_ID]",
            "[AD_GROUP_ID]",
            "[CRITERION_ID]",
            "[TYPE]",
            "[MODIFICATION_METHOD]",
            "[START_DATE]",
            "[END_DATE]");

    AdGroupCriterionSimulation actualResponse = client.getAdGroupCriterionSimulation(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupCriterionSimulationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupCriterionSimulationRequest actualRequest =
        ((GetAdGroupCriterionSimulationRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupCriterionSimulationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupCriterionSimulationService.addException(exception);

    try {
      AdGroupCriterionSimulationName resourceName =
          AdGroupCriterionSimulationName.of(
              "[CUSTOMER_ID]",
              "[AD_GROUP_ID]",
              "[CRITERION_ID]",
              "[TYPE]",
              "[MODIFICATION_METHOD]",
              "[START_DATE]",
              "[END_DATE]");
      client.getAdGroupCriterionSimulation(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdGroupCriterionSimulationTest2() throws Exception {
    AdGroupCriterionSimulation expectedResponse =
        AdGroupCriterionSimulation.newBuilder()
            .setResourceName(
                AdGroupCriterionSimulationName.of(
                        "[CUSTOMER_ID]",
                        "[AD_GROUP_ID]",
                        "[CRITERION_ID]",
                        "[TYPE]",
                        "[MODIFICATION_METHOD]",
                        "[START_DATE]",
                        "[END_DATE]")
                    .toString())
            .setAdGroupId(-85224585)
            .setCriterionId(-326773895)
            .setStartDate("startDate-2129778896")
            .setEndDate("endDate-1607727319")
            .build();
    mockAdGroupCriterionSimulationService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdGroupCriterionSimulation actualResponse = client.getAdGroupCriterionSimulation(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupCriterionSimulationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupCriterionSimulationRequest actualRequest =
        ((GetAdGroupCriterionSimulationRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupCriterionSimulationExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupCriterionSimulationService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdGroupCriterionSimulation(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
