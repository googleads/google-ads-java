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

import com.google.ads.googleads.v9.resources.AssetName;
import com.google.ads.googleads.v9.resources.CustomerAsset;
import com.google.ads.googleads.v9.resources.CustomerAssetName;
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
public class CustomerAssetServiceClientTest {
  private static MockCustomerAssetService mockCustomerAssetService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private CustomerAssetServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockCustomerAssetService = new MockCustomerAssetService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockCustomerAssetService));
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
    CustomerAssetServiceSettings settings =
        CustomerAssetServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = CustomerAssetServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getCustomerAssetTest() throws Exception {
    CustomerAsset expectedResponse =
        CustomerAsset.newBuilder()
            .setResourceName(
                CustomerAssetName.of("[CUSTOMER_ID]", "[ASSET_ID]", "[FIELD_TYPE]").toString())
            .setAsset(AssetName.of("[CUSTOMER_ID]", "[ASSET_ID]").toString())
            .build();
    mockCustomerAssetService.addResponse(expectedResponse);

    CustomerAssetName resourceName =
        CustomerAssetName.of("[CUSTOMER_ID]", "[ASSET_ID]", "[FIELD_TYPE]");

    CustomerAsset actualResponse = client.getCustomerAsset(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerAssetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerAssetRequest actualRequest = ((GetCustomerAssetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerAssetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerAssetService.addException(exception);

    try {
      CustomerAssetName resourceName =
          CustomerAssetName.of("[CUSTOMER_ID]", "[ASSET_ID]", "[FIELD_TYPE]");
      client.getCustomerAsset(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getCustomerAssetTest2() throws Exception {
    CustomerAsset expectedResponse =
        CustomerAsset.newBuilder()
            .setResourceName(
                CustomerAssetName.of("[CUSTOMER_ID]", "[ASSET_ID]", "[FIELD_TYPE]").toString())
            .setAsset(AssetName.of("[CUSTOMER_ID]", "[ASSET_ID]").toString())
            .build();
    mockCustomerAssetService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    CustomerAsset actualResponse = client.getCustomerAsset(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerAssetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetCustomerAssetRequest actualRequest = ((GetCustomerAssetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getCustomerAssetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerAssetService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getCustomerAsset(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateCustomerAssetsTest() throws Exception {
    MutateCustomerAssetsResponse expectedResponse =
        MutateCustomerAssetsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateCustomerAssetResult>())
            .build();
    mockCustomerAssetService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<CustomerAssetOperation> operations = new ArrayList<>();

    MutateCustomerAssetsResponse actualResponse =
        client.mutateCustomerAssets(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockCustomerAssetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateCustomerAssetsRequest actualRequest =
        ((MutateCustomerAssetsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateCustomerAssetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockCustomerAssetService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<CustomerAssetOperation> operations = new ArrayList<>();
      client.mutateCustomerAssets(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
