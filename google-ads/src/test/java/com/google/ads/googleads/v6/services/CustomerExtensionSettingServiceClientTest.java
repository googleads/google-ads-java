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

import com.google.ads.googleads.v6.resources.CustomerExtensionSetting;
import com.google.ads.googleads.v6.resources.CustomerExtensionSettingName;
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
public class CustomerExtensionSettingServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private CustomerExtensionSettingServiceClient client;
  private static MockCustomerExtensionSettingService mockCustomerExtensionSettingService;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomerExtensionSettingService = new MockCustomerExtensionSettingService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockCustomerExtensionSettingService));
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
    CustomerExtensionSettingServiceSettings settings =
        CustomerExtensionSettingServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomerExtensionSettingServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCustomerExtensionSettingTest() throws Exception {
    CustomerExtensionSetting expectedResponse =
        CustomerExtensionSetting.newBuilder()
            .setResourceName(
                CustomerExtensionSettingName.of("[CUSTOMER_ID]", "[EXTENSION_TYPE]").toString())
            .addAllExtensionFeedItems(new ArrayList<String>())
            .build();
    mockCustomerExtensionSettingService.addResponse(expectedResponse);

    CustomerExtensionSettingName resourceName =
        CustomerExtensionSettingName.of("[CUSTOMER_ID]", "[EXTENSION_TYPE]");

    CustomerExtensionSetting actualResponse = client.getCustomerExtensionSetting(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerExtensionSettingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerExtensionSettingRequest actualRequest =
        ((GetCustomerExtensionSettingRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerExtensionSettingExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerExtensionSettingService.addException(exception);

    try {
      CustomerExtensionSettingName resourceName =
          CustomerExtensionSettingName.of("[CUSTOMER_ID]", "[EXTENSION_TYPE]");
      client.getCustomerExtensionSetting(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomerExtensionSettingTest2() throws Exception {
    CustomerExtensionSetting expectedResponse =
        CustomerExtensionSetting.newBuilder()
            .setResourceName(
                CustomerExtensionSettingName.of("[CUSTOMER_ID]", "[EXTENSION_TYPE]").toString())
            .addAllExtensionFeedItems(new ArrayList<String>())
            .build();
    mockCustomerExtensionSettingService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CustomerExtensionSetting actualResponse = client.getCustomerExtensionSetting(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerExtensionSettingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerExtensionSettingRequest actualRequest =
        ((GetCustomerExtensionSettingRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerExtensionSettingExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerExtensionSettingService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCustomerExtensionSetting(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCustomerExtensionSettingsTest() throws Exception {
    MutateCustomerExtensionSettingsResponse expectedResponse =
        MutateCustomerExtensionSettingsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCustomerExtensionSettingResult>())
            .build();
    mockCustomerExtensionSettingService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CustomerExtensionSettingOperation> operations = new ArrayList<>();

    MutateCustomerExtensionSettingsResponse actualResponse =
        client.mutateCustomerExtensionSettings(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerExtensionSettingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCustomerExtensionSettingsRequest actualRequest =
        ((MutateCustomerExtensionSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCustomerExtensionSettingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerExtensionSettingService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CustomerExtensionSettingOperation> operations = new ArrayList<>();
      client.mutateCustomerExtensionSettings(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
