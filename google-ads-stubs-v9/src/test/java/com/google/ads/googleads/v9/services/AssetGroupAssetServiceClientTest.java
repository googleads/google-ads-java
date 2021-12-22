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

import com.google.ads.googleads.v9.common.PolicySummary;
import com.google.ads.googleads.v9.resources.AssetGroupAsset;
import com.google.ads.googleads.v9.resources.AssetGroupAssetName;
import com.google.ads.googleads.v9.resources.AssetGroupName;
import com.google.ads.googleads.v9.resources.AssetName;
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
public class AssetGroupAssetServiceClientTest {
  private static MockAssetGroupAssetService mockAssetGroupAssetService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private AssetGroupAssetServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAssetGroupAssetService = new MockAssetGroupAssetService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAssetGroupAssetService));
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
    AssetGroupAssetServiceSettings settings =
        AssetGroupAssetServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AssetGroupAssetServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAssetGroupAssetTest() throws Exception {
    AssetGroupAsset expectedResponse =
        AssetGroupAsset.newBuilder()
            .setResourceName(
                AssetGroupAssetName.of(
                        "[CUSTOMER_ID]", "[ASSET_GROUP_ID]", "[ASSET_ID]", "[FIELD_TYPE]")
                    .toString())
            .setAssetGroup(AssetGroupName.of("[CUSTOMER_ID]", "[ASSET_GROUP_ID]").toString())
            .setAsset(AssetName.of("[CUSTOMER_ID]", "[ASSET_ID]").toString())
            .setPolicySummary(PolicySummary.newBuilder().build())
            .build();
    mockAssetGroupAssetService.addResponse(expectedResponse);

    AssetGroupAssetName resourceName =
        AssetGroupAssetName.of("[CUSTOMER_ID]", "[ASSET_GROUP_ID]", "[ASSET_ID]", "[FIELD_TYPE]");

    AssetGroupAsset actualResponse = client.getAssetGroupAsset(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAssetGroupAssetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAssetGroupAssetRequest actualRequest = ((GetAssetGroupAssetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAssetGroupAssetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAssetGroupAssetService.addException(exception);

    try {
      AssetGroupAssetName resourceName =
          AssetGroupAssetName.of("[CUSTOMER_ID]", "[ASSET_GROUP_ID]", "[ASSET_ID]", "[FIELD_TYPE]");
      client.getAssetGroupAsset(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAssetGroupAssetTest2() throws Exception {
    AssetGroupAsset expectedResponse =
        AssetGroupAsset.newBuilder()
            .setResourceName(
                AssetGroupAssetName.of(
                        "[CUSTOMER_ID]", "[ASSET_GROUP_ID]", "[ASSET_ID]", "[FIELD_TYPE]")
                    .toString())
            .setAssetGroup(AssetGroupName.of("[CUSTOMER_ID]", "[ASSET_GROUP_ID]").toString())
            .setAsset(AssetName.of("[CUSTOMER_ID]", "[ASSET_ID]").toString())
            .setPolicySummary(PolicySummary.newBuilder().build())
            .build();
    mockAssetGroupAssetService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AssetGroupAsset actualResponse = client.getAssetGroupAsset(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAssetGroupAssetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAssetGroupAssetRequest actualRequest = ((GetAssetGroupAssetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAssetGroupAssetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAssetGroupAssetService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAssetGroupAsset(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAssetGroupAssetsTest() throws Exception {
    MutateAssetGroupAssetsResponse expectedResponse =
        MutateAssetGroupAssetsResponse.newBuilder()
            .addAllResults(new ArrayList<MutateAssetGroupAssetResult>())
            .setPartialFailureError(Status.newBuilder().build())
            .build();
    mockAssetGroupAssetService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<AssetGroupAssetOperation> operations = new ArrayList<>();

    MutateAssetGroupAssetsResponse actualResponse =
        client.mutateAssetGroupAssets(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAssetGroupAssetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAssetGroupAssetsRequest actualRequest =
        ((MutateAssetGroupAssetsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAssetGroupAssetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAssetGroupAssetService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<AssetGroupAssetOperation> operations = new ArrayList<>();
      client.mutateAssetGroupAssets(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
