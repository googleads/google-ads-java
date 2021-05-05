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

import com.google.ads.googleads.v7.common.TextLabel;
import com.google.ads.googleads.v7.resources.Label;
import com.google.ads.googleads.v7.resources.LabelName;
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
public class LabelServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private LabelServiceClient client;
  private LocalChannelProvider channelProvider;
  private static MockLabelService mockLabelService;

  @BeforeClass
  public static void startStaticServer() {
    mockLabelService = new MockLabelService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockLabelService));
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
    LabelServiceSettings settings =
        LabelServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = LabelServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getLabelTest() throws Exception {
    Label expectedResponse =
        Label.newBuilder()
            .setResourceName(LabelName.of("[CUSTOMER_ID]", "[LABEL_ID]").toString())
            .setTextLabel(TextLabel.newBuilder().build())
            .build();
    mockLabelService.addResponse(expectedResponse);

    LabelName resourceName = LabelName.of("[CUSTOMER_ID]", "[LABEL_ID]");

    Label actualResponse = client.getLabel(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetLabelRequest actualRequest = ((GetLabelRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getLabelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLabelService.addException(exception);

    try {
      LabelName resourceName = LabelName.of("[CUSTOMER_ID]", "[LABEL_ID]");
      client.getLabel(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getLabelTest2() throws Exception {
    Label expectedResponse =
        Label.newBuilder()
            .setResourceName(LabelName.of("[CUSTOMER_ID]", "[LABEL_ID]").toString())
            .setTextLabel(TextLabel.newBuilder().build())
            .build();
    mockLabelService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    Label actualResponse = client.getLabel(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetLabelRequest actualRequest = ((GetLabelRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getLabelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLabelService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getLabel(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateLabelsTest() throws Exception {
    MutateLabelsResponse expectedResponse =
        MutateLabelsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateLabelResult>())
            .build();
    mockLabelService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<LabelOperation> operations = new ArrayList<>();

    MutateLabelsResponse actualResponse = client.mutateLabels(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateLabelsRequest actualRequest = ((MutateLabelsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateLabelsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLabelService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<LabelOperation> operations = new ArrayList<>();
      client.mutateLabels(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
