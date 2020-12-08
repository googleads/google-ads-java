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

import com.google.ads.googleads.v6.resources.AdGroupLabel;
import com.google.ads.googleads.v6.resources.AdGroupLabelName;
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
public class AdGroupLabelServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockAdGroupLabelService mockAdGroupLabelService;
  private AdGroupLabelServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAdGroupLabelService = new MockAdGroupLabelService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockAdGroupLabelService));
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
    AdGroupLabelServiceSettings settings =
        AdGroupLabelServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdGroupLabelServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdGroupLabelTest() throws Exception {
    AdGroupLabel expectedResponse =
        AdGroupLabel.newBuilder()
            .setResourceName(
                AdGroupLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[LABEL_ID]").toString())
            .build();
    mockAdGroupLabelService.addResponse(expectedResponse);

    AdGroupLabelName resourceName =
        AdGroupLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[LABEL_ID]");

    AdGroupLabel actualResponse = client.getAdGroupLabel(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupLabelRequest actualRequest = ((GetAdGroupLabelRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupLabelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupLabelService.addException(exception);

    try {
      AdGroupLabelName resourceName =
          AdGroupLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[LABEL_ID]");
      client.getAdGroupLabel(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdGroupLabelTest2() throws Exception {
    AdGroupLabel expectedResponse =
        AdGroupLabel.newBuilder()
            .setResourceName(
                AdGroupLabelName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[LABEL_ID]").toString())
            .build();
    mockAdGroupLabelService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdGroupLabel actualResponse = client.getAdGroupLabel(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupLabelRequest actualRequest = ((GetAdGroupLabelRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupLabelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupLabelService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdGroupLabel(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAdGroupLabelsTest() throws Exception {
    MutateAdGroupLabelsResponse expectedResponse =
        MutateAdGroupLabelsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateAdGroupLabelResult>())
            .build();
    mockAdGroupLabelService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<AdGroupLabelOperation> operations = new ArrayList<>();

    MutateAdGroupLabelsResponse actualResponse = client.mutateAdGroupLabels(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupLabelService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAdGroupLabelsRequest actualRequest = ((MutateAdGroupLabelsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAdGroupLabelsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupLabelService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<AdGroupLabelOperation> operations = new ArrayList<>();
      client.mutateAdGroupLabels(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
