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

import com.google.ads.googleads.v8.resources.AdGroupAdLabel;
import com.google.ads.googleads.v8.resources.AdGroupAdLabelName;
import com.google.ads.googleads.v8.resources.AdGroupAdName;
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
public class AdGroupAdLabelServiceClientTest {
  private static MockAdGroupAdLabelService mockAdGroupAdLabelService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private AdGroupAdLabelServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAdGroupAdLabelService = new MockAdGroupAdLabelService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAdGroupAdLabelService));
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
    AdGroupAdLabelServiceSettings settings =
        AdGroupAdLabelServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdGroupAdLabelServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdGroupAdLabelTest() throws Exception {
    AdGroupAdLabel expectedResponse =
        AdGroupAdLabel.newBuilder()
            .setResourceName(
                AdGroupAdLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]", "[LABEL_ID]")
                    .toString())
            .setAdGroupAd(AdGroupAdName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]").toString())
            .setLabel(LabelName.of("[CUSTOMER_ID]", "[LABEL_ID]").toString())
            .build();
    mockAdGroupAdLabelService.addResponse(expectedResponse);

    AdGroupAdLabelName resourceName =
        AdGroupAdLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]", "[LABEL_ID]");

    AdGroupAdLabel actualResponse = client.getAdGroupAdLabel(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupAdLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupAdLabelRequest actualRequest = ((GetAdGroupAdLabelRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupAdLabelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupAdLabelService.addException(exception);

    try {
      AdGroupAdLabelName resourceName =
          AdGroupAdLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]", "[LABEL_ID]");
      client.getAdGroupAdLabel(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdGroupAdLabelTest2() throws Exception {
    AdGroupAdLabel expectedResponse =
        AdGroupAdLabel.newBuilder()
            .setResourceName(
                AdGroupAdLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]", "[LABEL_ID]")
                    .toString())
            .setAdGroupAd(AdGroupAdName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]").toString())
            .setLabel(LabelName.of("[CUSTOMER_ID]", "[LABEL_ID]").toString())
            .build();
    mockAdGroupAdLabelService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdGroupAdLabel actualResponse = client.getAdGroupAdLabel(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupAdLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupAdLabelRequest actualRequest = ((GetAdGroupAdLabelRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupAdLabelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupAdLabelService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdGroupAdLabel(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAdGroupAdLabelsTest() throws Exception {
    MutateAdGroupAdLabelsResponse expectedResponse =
        MutateAdGroupAdLabelsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateAdGroupAdLabelResult>())
            .build();
    mockAdGroupAdLabelService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<AdGroupAdLabelOperation> operations = new ArrayList<>();

    MutateAdGroupAdLabelsResponse actualResponse =
        client.mutateAdGroupAdLabels(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupAdLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAdGroupAdLabelsRequest actualRequest =
        ((MutateAdGroupAdLabelsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAdGroupAdLabelsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupAdLabelService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<AdGroupAdLabelOperation> operations = new ArrayList<>();
      client.mutateAdGroupAdLabels(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
