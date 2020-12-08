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

import com.google.ads.googleads.v6.resources.CampaignSharedSet;
import com.google.ads.googleads.v6.resources.CampaignSharedSetName;
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
public class CampaignSharedSetServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockCampaignSharedSetService mockCampaignSharedSetService;
  private CampaignSharedSetServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockCampaignSharedSetService = new MockCampaignSharedSetService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCampaignSharedSetService));
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
    CampaignSharedSetServiceSettings settings =
        CampaignSharedSetServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CampaignSharedSetServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCampaignSharedSetTest() throws Exception {
    CampaignSharedSet expectedResponse =
        CampaignSharedSet.newBuilder()
            .setResourceName(
                CampaignSharedSetName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[SHARED_SET_ID]")
                    .toString())
            .build();
    mockCampaignSharedSetService.addResponse(expectedResponse);

    CampaignSharedSetName resourceName =
        CampaignSharedSetName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[SHARED_SET_ID]");

    CampaignSharedSet actualResponse = client.getCampaignSharedSet(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignSharedSetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignSharedSetRequest actualRequest =
        ((GetCampaignSharedSetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignSharedSetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignSharedSetService.addException(exception);

    try {
      CampaignSharedSetName resourceName =
          CampaignSharedSetName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[SHARED_SET_ID]");
      client.getCampaignSharedSet(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCampaignSharedSetTest2() throws Exception {
    CampaignSharedSet expectedResponse =
        CampaignSharedSet.newBuilder()
            .setResourceName(
                CampaignSharedSetName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[SHARED_SET_ID]")
                    .toString())
            .build();
    mockCampaignSharedSetService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CampaignSharedSet actualResponse = client.getCampaignSharedSet(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignSharedSetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignSharedSetRequest actualRequest =
        ((GetCampaignSharedSetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignSharedSetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignSharedSetService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCampaignSharedSet(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCampaignSharedSetsTest() throws Exception {
    MutateCampaignSharedSetsResponse expectedResponse =
        MutateCampaignSharedSetsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCampaignSharedSetResult>())
            .build();
    mockCampaignSharedSetService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CampaignSharedSetOperation> operations = new ArrayList<>();

    MutateCampaignSharedSetsResponse actualResponse =
        client.mutateCampaignSharedSets(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignSharedSetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignSharedSetsRequest actualRequest =
        ((MutateCampaignSharedSetsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCampaignSharedSetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignSharedSetService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CampaignSharedSetOperation> operations = new ArrayList<>();
      client.mutateCampaignSharedSets(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
