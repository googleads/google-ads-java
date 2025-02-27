/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v19.services;

import com.google.ads.googleads.v19.resources.SmartCampaignSettingName;
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
public class SmartCampaignSettingServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockSmartCampaignSettingService mockSmartCampaignSettingService;
  private LocalChannelProvider channelProvider;
  private SmartCampaignSettingServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockSmartCampaignSettingService = new MockSmartCampaignSettingService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockSmartCampaignSettingService));
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
    SmartCampaignSettingServiceSettings settings =
        SmartCampaignSettingServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = SmartCampaignSettingServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getSmartCampaignStatusTest() throws Exception {
    GetSmartCampaignStatusResponse expectedResponse =
        GetSmartCampaignStatusResponse.newBuilder().build();
    mockSmartCampaignSettingService.addResponse(expectedResponse);

    SmartCampaignSettingName resourceName =
        SmartCampaignSettingName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]");

    GetSmartCampaignStatusResponse actualResponse = client.getSmartCampaignStatus(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockSmartCampaignSettingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSmartCampaignStatusRequest actualRequest =
        ((GetSmartCampaignStatusRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSmartCampaignStatusExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockSmartCampaignSettingService.addException(exception);

    try {
      SmartCampaignSettingName resourceName =
          SmartCampaignSettingName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]");
      client.getSmartCampaignStatus(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSmartCampaignStatusTest2() throws Exception {
    GetSmartCampaignStatusResponse expectedResponse =
        GetSmartCampaignStatusResponse.newBuilder().build();
    mockSmartCampaignSettingService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    GetSmartCampaignStatusResponse actualResponse = client.getSmartCampaignStatus(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockSmartCampaignSettingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSmartCampaignStatusRequest actualRequest =
        ((GetSmartCampaignStatusRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSmartCampaignStatusExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockSmartCampaignSettingService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getSmartCampaignStatus(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateSmartCampaignSettingsTest() throws Exception {
    MutateSmartCampaignSettingsResponse expectedResponse =
        MutateSmartCampaignSettingsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateSmartCampaignSettingResult>())
            .build();
    mockSmartCampaignSettingService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<SmartCampaignSettingOperation> operations = new ArrayList<>();

    MutateSmartCampaignSettingsResponse actualResponse =
        client.mutateSmartCampaignSettings(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockSmartCampaignSettingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateSmartCampaignSettingsRequest actualRequest =
        ((MutateSmartCampaignSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateSmartCampaignSettingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockSmartCampaignSettingService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<SmartCampaignSettingOperation> operations = new ArrayList<>();
      client.mutateSmartCampaignSettings(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
