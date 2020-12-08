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

import com.google.ads.googleads.v6.resources.AdGroupCriterionLabel;
import com.google.ads.googleads.v6.resources.AdGroupCriterionLabelName;
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
public class AdGroupCriterionLabelServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockAdGroupCriterionLabelService mockAdGroupCriterionLabelService;
  private AdGroupCriterionLabelServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAdGroupCriterionLabelService = new MockAdGroupCriterionLabelService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAdGroupCriterionLabelService));
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
    AdGroupCriterionLabelServiceSettings settings =
        AdGroupCriterionLabelServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdGroupCriterionLabelServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdGroupCriterionLabelTest() throws Exception {
    AdGroupCriterionLabel expectedResponse =
        AdGroupCriterionLabel.newBuilder()
            .setResourceName(
                AdGroupCriterionLabelName.of(
                        "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[LABEL_ID]")
                    .toString())
            .build();
    mockAdGroupCriterionLabelService.addResponse(expectedResponse);

    AdGroupCriterionLabelName resourceName =
        AdGroupCriterionLabelName.of(
            "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[LABEL_ID]");

    AdGroupCriterionLabel actualResponse = client.getAdGroupCriterionLabel(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupCriterionLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupCriterionLabelRequest actualRequest =
        ((GetAdGroupCriterionLabelRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupCriterionLabelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupCriterionLabelService.addException(exception);

    try {
      AdGroupCriterionLabelName resourceName =
          AdGroupCriterionLabelName.of(
              "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[LABEL_ID]");
      client.getAdGroupCriterionLabel(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdGroupCriterionLabelTest2() throws Exception {
    AdGroupCriterionLabel expectedResponse =
        AdGroupCriterionLabel.newBuilder()
            .setResourceName(
                AdGroupCriterionLabelName.of(
                        "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]", "[LABEL_ID]")
                    .toString())
            .build();
    mockAdGroupCriterionLabelService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdGroupCriterionLabel actualResponse = client.getAdGroupCriterionLabel(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupCriterionLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupCriterionLabelRequest actualRequest =
        ((GetAdGroupCriterionLabelRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupCriterionLabelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupCriterionLabelService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdGroupCriterionLabel(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAdGroupCriterionLabelsTest() throws Exception {
    MutateAdGroupCriterionLabelsResponse expectedResponse =
        MutateAdGroupCriterionLabelsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateAdGroupCriterionLabelResult>())
            .build();
    mockAdGroupCriterionLabelService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<AdGroupCriterionLabelOperation> operations = new ArrayList<>();

    MutateAdGroupCriterionLabelsResponse actualResponse =
        client.mutateAdGroupCriterionLabels(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupCriterionLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAdGroupCriterionLabelsRequest actualRequest =
        ((MutateAdGroupCriterionLabelsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAdGroupCriterionLabelsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupCriterionLabelService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<AdGroupCriterionLabelOperation> operations = new ArrayList<>();
      client.mutateAdGroupCriterionLabels(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
