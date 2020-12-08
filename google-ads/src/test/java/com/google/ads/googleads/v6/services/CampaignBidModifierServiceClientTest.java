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

import com.google.ads.googleads.v6.resources.CampaignBidModifier;
import com.google.ads.googleads.v6.resources.CampaignBidModifierName;
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
public class CampaignBidModifierServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private CampaignBidModifierServiceClient client;
  private static MockCampaignBidModifierService mockCampaignBidModifierService;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockCampaignBidModifierService = new MockCampaignBidModifierService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCampaignBidModifierService));
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
    CampaignBidModifierServiceSettings settings =
        CampaignBidModifierServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CampaignBidModifierServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCampaignBidModifierTest() throws Exception {
    CampaignBidModifier expectedResponse =
        CampaignBidModifier.newBuilder()
            .setResourceName(
                CampaignBidModifierName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockCampaignBidModifierService.addResponse(expectedResponse);

    CampaignBidModifierName resourceName =
        CampaignBidModifierName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]");

    CampaignBidModifier actualResponse = client.getCampaignBidModifier(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignBidModifierService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignBidModifierRequest actualRequest =
        ((GetCampaignBidModifierRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignBidModifierExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignBidModifierService.addException(exception);

    try {
      CampaignBidModifierName resourceName =
          CampaignBidModifierName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]");
      client.getCampaignBidModifier(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCampaignBidModifierTest2() throws Exception {
    CampaignBidModifier expectedResponse =
        CampaignBidModifier.newBuilder()
            .setResourceName(
                CampaignBidModifierName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockCampaignBidModifierService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CampaignBidModifier actualResponse = client.getCampaignBidModifier(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignBidModifierService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignBidModifierRequest actualRequest =
        ((GetCampaignBidModifierRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignBidModifierExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignBidModifierService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCampaignBidModifier(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCampaignBidModifiersTest() throws Exception {
    MutateCampaignBidModifiersResponse expectedResponse =
        MutateCampaignBidModifiersResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCampaignBidModifierResult>())
            .build();
    mockCampaignBidModifierService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CampaignBidModifierOperation> operations = new ArrayList<>();

    MutateCampaignBidModifiersResponse actualResponse =
        client.mutateCampaignBidModifiers(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignBidModifierService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignBidModifiersRequest actualRequest =
        ((MutateCampaignBidModifiersRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCampaignBidModifiersExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignBidModifierService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CampaignBidModifierOperation> operations = new ArrayList<>();
      client.mutateCampaignBidModifiers(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
