/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v13.services;

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
public class CustomizerAttributeServiceClientTest {
  private static MockCustomizerAttributeService mockCustomizerAttributeService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CustomizerAttributeServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomizerAttributeService = new MockCustomizerAttributeService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCustomizerAttributeService));
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
    CustomizerAttributeServiceSettings settings =
        CustomizerAttributeServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomizerAttributeServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void mutateCustomizerAttributesTest() throws Exception {
    MutateCustomizerAttributesResponse expectedResponse =
        MutateCustomizerAttributesResponse.newBuilder()
            .addAllResults(new ArrayList<MutateCustomizerAttributeResult>())
            .setPartialFailureError(Status.newBuilder().build())
            .build();
    mockCustomizerAttributeService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CustomizerAttributeOperation> operations = new ArrayList<>();

    MutateCustomizerAttributesResponse actualResponse =
        client.mutateCustomizerAttributes(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomizerAttributeService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCustomizerAttributesRequest actualRequest =
        ((MutateCustomizerAttributesRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCustomizerAttributesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomizerAttributeService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CustomizerAttributeOperation> operations = new ArrayList<>();
      client.mutateCustomizerAttributes(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
