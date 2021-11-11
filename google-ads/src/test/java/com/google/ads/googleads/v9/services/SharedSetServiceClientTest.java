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

package com.google.ads.googleads.v9.services;

import com.google.ads.googleads.v9.resources.SharedSet;
import com.google.ads.googleads.v9.resources.SharedSetName;
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
public class SharedSetServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockSharedSetService mockSharedSetService;
  private LocalChannelProvider channelProvider;
  private SharedSetServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockSharedSetService = new MockSharedSetService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockSharedSetService));
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
    SharedSetServiceSettings settings =
        SharedSetServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = SharedSetServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getSharedSetTest() throws Exception {
    SharedSet expectedResponse =
        SharedSet.newBuilder()
            .setResourceName(SharedSetName.of("[CUSTOMER_ID]", "[SHARED_SET_ID]").toString())
            .setId(3355)
            .setName(SharedSetName.of("[CUSTOMER_ID]", "[SHARED_SET_ID]").toString())
            .setMemberCount(-59350230)
            .setReferenceCount(1214713627)
            .build();
    mockSharedSetService.addResponse(expectedResponse);

    SharedSetName resourceName = SharedSetName.of("[CUSTOMER_ID]", "[SHARED_SET_ID]");

    SharedSet actualResponse = client.getSharedSet(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockSharedSetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSharedSetRequest actualRequest = ((GetSharedSetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSharedSetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockSharedSetService.addException(exception);

    try {
      SharedSetName resourceName = SharedSetName.of("[CUSTOMER_ID]", "[SHARED_SET_ID]");
      client.getSharedSet(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSharedSetTest2() throws Exception {
    SharedSet expectedResponse =
        SharedSet.newBuilder()
            .setResourceName(SharedSetName.of("[CUSTOMER_ID]", "[SHARED_SET_ID]").toString())
            .setId(3355)
            .setName(SharedSetName.of("[CUSTOMER_ID]", "[SHARED_SET_ID]").toString())
            .setMemberCount(-59350230)
            .setReferenceCount(1214713627)
            .build();
    mockSharedSetService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    SharedSet actualResponse = client.getSharedSet(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockSharedSetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSharedSetRequest actualRequest = ((GetSharedSetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSharedSetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockSharedSetService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getSharedSet(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateSharedSetsTest() throws Exception {
    MutateSharedSetsResponse expectedResponse =
        MutateSharedSetsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateSharedSetResult>())
            .build();
    mockSharedSetService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<SharedSetOperation> operations = new ArrayList<>();

    MutateSharedSetsResponse actualResponse = client.mutateSharedSets(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockSharedSetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateSharedSetsRequest actualRequest = ((MutateSharedSetsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateSharedSetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockSharedSetService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<SharedSetOperation> operations = new ArrayList<>();
      client.mutateSharedSets(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
