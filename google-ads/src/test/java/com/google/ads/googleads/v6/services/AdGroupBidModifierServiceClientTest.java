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

import com.google.ads.googleads.v6.resources.AdGroupBidModifier;
import com.google.ads.googleads.v6.resources.AdGroupBidModifierName;
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
public class AdGroupBidModifierServiceClientTest {
  private static MockAdGroupBidModifierService mockAdGroupBidModifierService;
  private static MockServiceHelper mockServiceHelper;
  private AdGroupBidModifierServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAdGroupBidModifierService = new MockAdGroupBidModifierService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAdGroupBidModifierService));
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
    AdGroupBidModifierServiceSettings settings =
        AdGroupBidModifierServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdGroupBidModifierServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdGroupBidModifierTest() throws Exception {
    AdGroupBidModifier expectedResponse =
        AdGroupBidModifier.newBuilder()
            .setResourceName(
                AdGroupBidModifierName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockAdGroupBidModifierService.addResponse(expectedResponse);

    AdGroupBidModifierName resourceName =
        AdGroupBidModifierName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");

    AdGroupBidModifier actualResponse = client.getAdGroupBidModifier(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupBidModifierService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupBidModifierRequest actualRequest =
        ((GetAdGroupBidModifierRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupBidModifierExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupBidModifierService.addException(exception);

    try {
      AdGroupBidModifierName resourceName =
          AdGroupBidModifierName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]");
      client.getAdGroupBidModifier(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdGroupBidModifierTest2() throws Exception {
    AdGroupBidModifier expectedResponse =
        AdGroupBidModifier.newBuilder()
            .setResourceName(
                AdGroupBidModifierName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockAdGroupBidModifierService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdGroupBidModifier actualResponse = client.getAdGroupBidModifier(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupBidModifierService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupBidModifierRequest actualRequest =
        ((GetAdGroupBidModifierRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupBidModifierExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupBidModifierService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdGroupBidModifier(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAdGroupBidModifiersTest() throws Exception {
    MutateAdGroupBidModifiersResponse expectedResponse =
        MutateAdGroupBidModifiersResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateAdGroupBidModifierResult>())
            .build();
    mockAdGroupBidModifierService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<AdGroupBidModifierOperation> operations = new ArrayList<>();

    MutateAdGroupBidModifiersResponse actualResponse =
        client.mutateAdGroupBidModifiers(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupBidModifierService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAdGroupBidModifiersRequest actualRequest =
        ((MutateAdGroupBidModifiersRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAdGroupBidModifiersExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupBidModifierService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<AdGroupBidModifierOperation> operations = new ArrayList<>();
      client.mutateAdGroupBidModifiers(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
