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
import com.google.ads.googleads.v9.resources.BiddingDataExclusion;
import com.google.ads.googleads.v9.resources.BiddingDataExclusionName;
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
public class BiddingDataExclusionServiceClientTest {
  private static MockBiddingDataExclusionService mockBiddingDataExclusionService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private BiddingDataExclusionServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockBiddingDataExclusionService = new MockBiddingDataExclusionService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockBiddingDataExclusionService));
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
    BiddingDataExclusionServiceSettings settings =
        BiddingDataExclusionServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = BiddingDataExclusionServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getBiddingDataExclusionTest() throws Exception {
    BiddingDataExclusion expectedResponse =
        BiddingDataExclusion.newBuilder()
            .setResourceName(
                BiddingDataExclusionName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]").toString())
            .setDataExclusionId(-1709770847)
            .setStartDateTime("startDateTime1919866397")
            .setEndDateTime("endDateTime255463830")
            .setName(
                BiddingDataExclusionName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]").toString())
            .setDescription("description-1724546052")
            .addAllDevices(new ArrayList<DeviceEnum.Device>())
            .addAllCampaigns(new ArrayList<String>())
            .addAllAdvertisingChannelTypes(
                new ArrayList<AdvertisingChannelTypeEnum.AdvertisingChannelType>())
            .build();
    mockBiddingDataExclusionService.addResponse(expectedResponse);

    BiddingDataExclusionName resourceName =
        BiddingDataExclusionName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]");

    BiddingDataExclusion actualResponse = client.getBiddingDataExclusion(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBiddingDataExclusionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBiddingDataExclusionRequest actualRequest =
        ((GetBiddingDataExclusionRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBiddingDataExclusionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBiddingDataExclusionService.addException(exception);

    try {
      BiddingDataExclusionName resourceName =
          BiddingDataExclusionName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]");
      client.getBiddingDataExclusion(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getBiddingDataExclusionTest2() throws Exception {
    BiddingDataExclusion expectedResponse =
        BiddingDataExclusion.newBuilder()
            .setResourceName(
                BiddingDataExclusionName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]").toString())
            .setDataExclusionId(-1709770847)
            .setStartDateTime("startDateTime1919866397")
            .setEndDateTime("endDateTime255463830")
            .setName(
                BiddingDataExclusionName.of("[CUSTOMER_ID]", "[SEASONALITY_EVENT_ID]").toString())
            .setDescription("description-1724546052")
            .addAllDevices(new ArrayList<DeviceEnum.Device>())
            .addAllCampaigns(new ArrayList<String>())
            .addAllAdvertisingChannelTypes(
                new ArrayList<AdvertisingChannelTypeEnum.AdvertisingChannelType>())
            .build();
    mockBiddingDataExclusionService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    BiddingDataExclusion actualResponse = client.getBiddingDataExclusion(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBiddingDataExclusionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBiddingDataExclusionRequest actualRequest =
        ((GetBiddingDataExclusionRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBiddingDataExclusionExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBiddingDataExclusionService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getBiddingDataExclusion(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateBiddingDataExclusionsTest() throws Exception {
    MutateBiddingDataExclusionsResponse expectedResponse =
        MutateBiddingDataExclusionsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateBiddingDataExclusionsResult>())
            .build();
    mockBiddingDataExclusionService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<BiddingDataExclusionOperation> operations = new ArrayList<>();

    MutateBiddingDataExclusionsResponse actualResponse =
        client.mutateBiddingDataExclusions(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBiddingDataExclusionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateBiddingDataExclusionsRequest actualRequest =
        ((MutateBiddingDataExclusionsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateBiddingDataExclusionsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBiddingDataExclusionService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<BiddingDataExclusionOperation> operations = new ArrayList<>();
      client.mutateBiddingDataExclusions(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
