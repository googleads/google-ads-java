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

import com.google.ads.googleads.v6.resources.CampaignExtensionSetting;
import com.google.ads.googleads.v6.resources.CampaignExtensionSettingName;
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
public class CampaignExtensionSettingServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockCampaignExtensionSettingService mockCampaignExtensionSettingService;
  private CampaignExtensionSettingServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockCampaignExtensionSettingService = new MockCampaignExtensionSettingService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCampaignExtensionSettingService));
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
    CampaignExtensionSettingServiceSettings settings =
        CampaignExtensionSettingServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CampaignExtensionSettingServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCampaignExtensionSettingTest() throws Exception {
    CampaignExtensionSetting expectedResponse =
        CampaignExtensionSetting.newBuilder()
            .setResourceName(
                CampaignExtensionSettingName.of(
                        "[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[EXTENSION_TYPE]")
                    .toString())
            .addAllExtensionFeedItems(new ArrayList<String>())
            .build();
    mockCampaignExtensionSettingService.addResponse(expectedResponse);

    CampaignExtensionSettingName resourceName =
        CampaignExtensionSettingName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[EXTENSION_TYPE]");

    CampaignExtensionSetting actualResponse = client.getCampaignExtensionSetting(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignExtensionSettingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignExtensionSettingRequest actualRequest =
        ((GetCampaignExtensionSettingRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignExtensionSettingExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignExtensionSettingService.addException(exception);

    try {
      CampaignExtensionSettingName resourceName =
          CampaignExtensionSettingName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[EXTENSION_TYPE]");
      client.getCampaignExtensionSetting(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCampaignExtensionSettingTest2() throws Exception {
    CampaignExtensionSetting expectedResponse =
        CampaignExtensionSetting.newBuilder()
            .setResourceName(
                CampaignExtensionSettingName.of(
                        "[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[EXTENSION_TYPE]")
                    .toString())
            .addAllExtensionFeedItems(new ArrayList<String>())
            .build();
    mockCampaignExtensionSettingService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CampaignExtensionSetting actualResponse = client.getCampaignExtensionSetting(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignExtensionSettingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignExtensionSettingRequest actualRequest =
        ((GetCampaignExtensionSettingRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignExtensionSettingExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignExtensionSettingService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCampaignExtensionSetting(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCampaignExtensionSettingsTest() throws Exception {
    MutateCampaignExtensionSettingsResponse expectedResponse =
        MutateCampaignExtensionSettingsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCampaignExtensionSettingResult>())
            .build();
    mockCampaignExtensionSettingService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CampaignExtensionSettingOperation> operations = new ArrayList<>();

    MutateCampaignExtensionSettingsResponse actualResponse =
        client.mutateCampaignExtensionSettings(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignExtensionSettingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignExtensionSettingsRequest actualRequest =
        ((MutateCampaignExtensionSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCampaignExtensionSettingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignExtensionSettingService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CampaignExtensionSettingOperation> operations = new ArrayList<>();
      client.mutateCampaignExtensionSettings(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
