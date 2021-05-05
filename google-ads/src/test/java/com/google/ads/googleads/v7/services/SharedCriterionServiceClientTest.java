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

import com.google.ads.googleads.v7.resources.SharedCriterion;
import com.google.ads.googleads.v7.resources.SharedCriterionName;
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
public class SharedCriterionServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private SharedCriterionServiceClient client;
  private static MockSharedCriterionService mockSharedCriterionService;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockSharedCriterionService = new MockSharedCriterionService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockSharedCriterionService));
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
    SharedCriterionServiceSettings settings =
        SharedCriterionServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = SharedCriterionServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getSharedCriterionTest() throws Exception {
    SharedCriterion expectedResponse =
        SharedCriterion.newBuilder()
            .setResourceName(
                SharedCriterionName.of("[CUSTOMER_ID]", "[SHARED_SET_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockSharedCriterionService.addResponse(expectedResponse);

    SharedCriterionName resourceName =
        SharedCriterionName.of("[CUSTOMER_ID]", "[SHARED_SET_ID]", "[CRITERION_ID]");

    SharedCriterion actualResponse = client.getSharedCriterion(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockSharedCriterionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSharedCriterionRequest actualRequest = ((GetSharedCriterionRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSharedCriterionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockSharedCriterionService.addException(exception);

    try {
      SharedCriterionName resourceName =
          SharedCriterionName.of("[CUSTOMER_ID]", "[SHARED_SET_ID]", "[CRITERION_ID]");
      client.getSharedCriterion(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSharedCriterionTest2() throws Exception {
    SharedCriterion expectedResponse =
        SharedCriterion.newBuilder()
            .setResourceName(
                SharedCriterionName.of("[CUSTOMER_ID]", "[SHARED_SET_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockSharedCriterionService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    SharedCriterion actualResponse = client.getSharedCriterion(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockSharedCriterionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSharedCriterionRequest actualRequest = ((GetSharedCriterionRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSharedCriterionExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockSharedCriterionService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getSharedCriterion(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateSharedCriteriaTest() throws Exception {
    MutateSharedCriteriaResponse expectedResponse =
        MutateSharedCriteriaResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateSharedCriterionResult>())
            .build();
    mockSharedCriterionService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<SharedCriterionOperation> operations = new ArrayList<>();

    MutateSharedCriteriaResponse actualResponse =
        client.mutateSharedCriteria(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockSharedCriterionService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateSharedCriteriaRequest actualRequest =
        ((MutateSharedCriteriaRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateSharedCriteriaExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockSharedCriterionService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<SharedCriterionOperation> operations = new ArrayList<>();
      client.mutateSharedCriteria(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
