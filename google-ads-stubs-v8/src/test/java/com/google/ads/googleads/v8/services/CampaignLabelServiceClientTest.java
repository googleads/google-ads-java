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

import com.google.ads.googleads.v8.resources.CampaignLabel;
import com.google.ads.googleads.v8.resources.CampaignLabelName;
import com.google.ads.googleads.v8.resources.CampaignName;
import com.google.ads.googleads.v8.resources.LabelName;
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
public class CampaignLabelServiceClientTest {
  private static MockCampaignLabelService mockCampaignLabelService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CampaignLabelServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCampaignLabelService = new MockCampaignLabelService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockCampaignLabelService));
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
    CampaignLabelServiceSettings settings =
        CampaignLabelServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CampaignLabelServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCampaignLabelTest() throws Exception {
    CampaignLabel expectedResponse =
        CampaignLabel.newBuilder()
            .setResourceName(
                CampaignLabelName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[LABEL_ID]").toString())
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .setLabel(LabelName.of("[CUSTOMER_ID]", "[LABEL_ID]").toString())
            .build();
    mockCampaignLabelService.addResponse(expectedResponse);

    CampaignLabelName resourceName =
        CampaignLabelName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[LABEL_ID]");

    CampaignLabel actualResponse = client.getCampaignLabel(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignLabelRequest actualRequest = ((GetCampaignLabelRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignLabelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignLabelService.addException(exception);

    try {
      CampaignLabelName resourceName =
          CampaignLabelName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[LABEL_ID]");
      client.getCampaignLabel(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCampaignLabelTest2() throws Exception {
    CampaignLabel expectedResponse =
        CampaignLabel.newBuilder()
            .setResourceName(
                CampaignLabelName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]", "[LABEL_ID]").toString())
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .setLabel(LabelName.of("[CUSTOMER_ID]", "[LABEL_ID]").toString())
            .build();
    mockCampaignLabelService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CampaignLabel actualResponse = client.getCampaignLabel(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCampaignLabelRequest actualRequest = ((GetCampaignLabelRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCampaignLabelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignLabelService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCampaignLabel(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCampaignLabelsTest() throws Exception {
    MutateCampaignLabelsResponse expectedResponse =
        MutateCampaignLabelsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCampaignLabelResult>())
            .build();
    mockCampaignLabelService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CampaignLabelOperation> operations = new ArrayList<>();

    MutateCampaignLabelsResponse actualResponse =
        client.mutateCampaignLabels(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCampaignLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCampaignLabelsRequest actualRequest =
        ((MutateCampaignLabelsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCampaignLabelsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCampaignLabelService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CampaignLabelOperation> operations = new ArrayList<>();
      client.mutateCampaignLabels(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
