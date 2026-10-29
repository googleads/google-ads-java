/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v26.services;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
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
public class CustomerBudgetNetworkSettingServiceClientTest {
  private static MockCustomerBudgetNetworkSettingService mockCustomerBudgetNetworkSettingService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CustomerBudgetNetworkSettingServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomerBudgetNetworkSettingService = new MockCustomerBudgetNetworkSettingService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCustomerBudgetNetworkSettingService));
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
    CustomerBudgetNetworkSettingServiceSettings settings =
        CustomerBudgetNetworkSettingServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomerBudgetNetworkSettingServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void mutateCustomerBudgetNetworkSettingTest() throws Exception {
    MutateCustomerBudgetNetworkSettingResponse expectedResponse =
        MutateCustomerBudgetNetworkSettingResponse.newBuilder()
            .setResult(MutateCustomerBudgetNetworkSettingResult.newBuilder().build())
            .build();
    mockCustomerBudgetNetworkSettingService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    CustomerBudgetNetworkSettingOperation operation =
        CustomerBudgetNetworkSettingOperation.newBuilder().build();

    MutateCustomerBudgetNetworkSettingResponse actualResponse =
        client.mutateCustomerBudgetNetworkSetting(customerId, operation);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerBudgetNetworkSettingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCustomerBudgetNetworkSettingRequest actualRequest =
        ((MutateCustomerBudgetNetworkSettingRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operation, actualRequest.getOperation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCustomerBudgetNetworkSettingExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerBudgetNetworkSettingService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      CustomerBudgetNetworkSettingOperation operation =
          CustomerBudgetNetworkSettingOperation.newBuilder().build();
      client.mutateCustomerBudgetNetworkSetting(customerId, operation);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
