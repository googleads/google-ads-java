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

import com.google.ads.googleads.v9.enums.AdvertisingChannelTypeEnum;
import com.google.ads.googleads.v9.enums.DeviceEnum;
import com.google.ads.googleads.v9.resources.BiddingSeasonalityAdjustment;
import com.google.ads.googleads.v9.resources.BiddingSeasonalityAdjustmentName;
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
public class BiddingSeasonalityAdjustmentServiceClientTest {
  private static MockBiddingSeasonalityAdjustmentService mockBiddingSeasonalityAdjustmentService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private BiddingSeasonalityAdjustmentServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockBiddingSeasonalityAdjustmentService = new MockBiddingSeasonalityAdjustmentService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockBiddingSeasonalityAdjustmentService));
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
    BiddingSeasonalityAdjustmentServiceSettings settings =
        BiddingSeasonalityAdjustmentServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = BiddingSeasonalityAdjustmentServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getBiddingSeasonalityAdjustmentTest() throws Exception {
    BiddingSeasonalityAdjustment expectedResponse =
        BiddingSeasonalityAdjustment.newBuilder()
            .setResourceName(
                BiddingSeasonalityAdjustmentName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]")
                    .toString())
            .setSeasonalityAdjustmentId(1520725710)
            .setStartDateTime("startDateTime1919866397")
            .setEndDateTime("endDateTime255463830")
            .setName(
                BiddingSeasonalityAdjustmentName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]")
                    .toString())
            .setDescription("description-1724546052")
            .addAllDevices(new ArrayList<DeviceEnum.Device>())
            .setConversionRateModifier(-1379017747)
            .addAllCampaigns(new ArrayList<String>())
            .addAllAdvertisingChannelTypes(
                new ArrayList<AdvertisingChannelTypeEnum.AdvertisingChannelType>())
            .build();
    mockBiddingSeasonalityAdjustmentService.addResponse(expectedResponse);

    BiddingSeasonalityAdjustmentName resourceName =
        BiddingSeasonalityAdjustmentName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]");

    BiddingSeasonalityAdjustment actualResponse =
        client.getBiddingSeasonalityAdjustment(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBiddingSeasonalityAdjustmentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBiddingSeasonalityAdjustmentRequest actualRequest =
        ((GetBiddingSeasonalityAdjustmentRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBiddingSeasonalityAdjustmentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBiddingSeasonalityAdjustmentService.addException(exception);

    try {
      BiddingSeasonalityAdjustmentName resourceName =
          BiddingSeasonalityAdjustmentName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]");
      client.getBiddingSeasonalityAdjustment(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getBiddingSeasonalityAdjustmentTest2() throws Exception {
    BiddingSeasonalityAdjustment expectedResponse =
        BiddingSeasonalityAdjustment.newBuilder()
            .setResourceName(
                BiddingSeasonalityAdjustmentName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]")
                    .toString())
            .setSeasonalityAdjustmentId(1520725710)
            .setStartDateTime("startDateTime1919866397")
            .setEndDateTime("endDateTime255463830")
            .setName(
                BiddingSeasonalityAdjustmentName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]")
                    .toString())
            .setDescription("description-1724546052")
            .addAllDevices(new ArrayList<DeviceEnum.Device>())
            .setConversionRateModifier(-1379017747)
            .addAllCampaigns(new ArrayList<String>())
            .addAllAdvertisingChannelTypes(
                new ArrayList<AdvertisingChannelTypeEnum.AdvertisingChannelType>())
            .build();
    mockBiddingSeasonalityAdjustmentService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    BiddingSeasonalityAdjustment actualResponse =
        client.getBiddingSeasonalityAdjustment(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBiddingSeasonalityAdjustmentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBiddingSeasonalityAdjustmentRequest actualRequest =
        ((GetBiddingSeasonalityAdjustmentRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBiddingSeasonalityAdjustmentExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBiddingSeasonalityAdjustmentService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getBiddingSeasonalityAdjustment(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateBiddingSeasonalityAdjustmentsTest() throws Exception {
    MutateBiddingSeasonalityAdjustmentsResponse expectedResponse =
        MutateBiddingSeasonalityAdjustmentsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateBiddingSeasonalityAdjustmentsResult>())
            .build();
    mockBiddingSeasonalityAdjustmentService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<BiddingSeasonalityAdjustmentOperation> operations = new ArrayList<>();

    MutateBiddingSeasonalityAdjustmentsResponse actualResponse =
        client.mutateBiddingSeasonalityAdjustments(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBiddingSeasonalityAdjustmentService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateBiddingSeasonalityAdjustmentsRequest actualRequest =
        ((MutateBiddingSeasonalityAdjustmentsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateBiddingSeasonalityAdjustmentsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBiddingSeasonalityAdjustmentService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<BiddingSeasonalityAdjustmentOperation> operations = new ArrayList<>();
      client.mutateBiddingSeasonalityAdjustments(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
