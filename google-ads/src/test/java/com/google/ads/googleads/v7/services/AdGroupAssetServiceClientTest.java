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

import com.google.ads.googleads.v7.resources.AdGroupAsset;
import com.google.ads.googleads.v7.resources.AdGroupAssetName;
import com.google.ads.googleads.v7.resources.AdGroupName;
import com.google.ads.googleads.v7.resources.AssetName;
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
public class AdGroupAssetServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockAdGroupAssetService mockAdGroupAssetService;
  private AdGroupAssetServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAdGroupAssetService = new MockAdGroupAssetService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockAdGroupAssetService));
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
    AdGroupAssetServiceSettings settings =
        AdGroupAssetServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdGroupAssetServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdGroupAssetTest() throws Exception {
    AdGroupAsset expectedResponse =
        AdGroupAsset.newBuilder()
            .setResourceName(
                AdGroupAssetName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[ASSET_ID]", "[FIELD_TYPE]")
                    .toString())
            .setAdGroup(AdGroupName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]").toString())
            .setAsset(AssetName.of("[CUSTOMER_ID]", "[ASSET_ID]").toString())
            .build();
    mockAdGroupAssetService.addResponse(expectedResponse);

    AdGroupAssetName resourceName =
        AdGroupAssetName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[ASSET_ID]", "[FIELD_TYPE]");

    AdGroupAsset actualResponse = client.getAdGroupAsset(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupAssetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupAssetRequest actualRequest = ((GetAdGroupAssetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupAssetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupAssetService.addException(exception);

    try {
      AdGroupAssetName resourceName =
          AdGroupAssetName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[ASSET_ID]", "[FIELD_TYPE]");
      client.getAdGroupAsset(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdGroupAssetTest2() throws Exception {
    AdGroupAsset expectedResponse =
        AdGroupAsset.newBuilder()
            .setResourceName(
                AdGroupAssetName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[ASSET_ID]", "[FIELD_TYPE]")
                    .toString())
            .setAdGroup(AdGroupName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]").toString())
            .setAsset(AssetName.of("[CUSTOMER_ID]", "[ASSET_ID]").toString())
            .build();
    mockAdGroupAssetService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdGroupAsset actualResponse = client.getAdGroupAsset(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupAssetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupAssetRequest actualRequest = ((GetAdGroupAssetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupAssetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupAssetService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdGroupAsset(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAdGroupAssetsTest() throws Exception {
    MutateAdGroupAssetsResponse expectedResponse =
        MutateAdGroupAssetsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateAdGroupAssetResult>())
            .build();
    mockAdGroupAssetService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<AdGroupAssetOperation> operations = new ArrayList<>();

    MutateAdGroupAssetsResponse actualResponse = client.mutateAdGroupAssets(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupAssetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAdGroupAssetsRequest actualRequest = ((MutateAdGroupAssetsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAdGroupAssetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupAssetService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<AdGroupAssetOperation> operations = new ArrayList<>();
      client.mutateAdGroupAssets(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
