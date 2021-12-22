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

import com.google.ads.googleads.v9.resources.AssetGroup;
import com.google.ads.googleads.v9.resources.AssetGroupName;
import com.google.ads.googleads.v9.resources.CampaignName;
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
public class AssetGroupServiceClientTest {
  private static MockAssetGroupService mockAssetGroupService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private AssetGroupServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAssetGroupService = new MockAssetGroupService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockAssetGroupService));
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
    AssetGroupServiceSettings settings =
        AssetGroupServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AssetGroupServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAssetGroupTest() throws Exception {
    AssetGroup expectedResponse =
        AssetGroup.newBuilder()
            .setResourceName(AssetGroupName.of("[CUSTOMER_ID]", "[ASSET_GROUP_ID]").toString())
            .setId(3355)
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .setName(AssetGroupName.of("[CUSTOMER_ID]", "[ASSET_GROUP_ID]").toString())
            .addAllFinalUrls(new ArrayList<String>())
            .addAllFinalMobileUrls(new ArrayList<String>())
            .setPath1("path1106438828")
            .setPath2("path2106438829")
            .build();
    mockAssetGroupService.addResponse(expectedResponse);

    AssetGroupName resourceName = AssetGroupName.of("[CUSTOMER_ID]", "[ASSET_GROUP_ID]");

    AssetGroup actualResponse = client.getAssetGroup(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAssetGroupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAssetGroupRequest actualRequest = ((GetAssetGroupRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAssetGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAssetGroupService.addException(exception);

    try {
      AssetGroupName resourceName = AssetGroupName.of("[CUSTOMER_ID]", "[ASSET_GROUP_ID]");
      client.getAssetGroup(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAssetGroupTest2() throws Exception {
    AssetGroup expectedResponse =
        AssetGroup.newBuilder()
            .setResourceName(AssetGroupName.of("[CUSTOMER_ID]", "[ASSET_GROUP_ID]").toString())
            .setId(3355)
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .setName(AssetGroupName.of("[CUSTOMER_ID]", "[ASSET_GROUP_ID]").toString())
            .addAllFinalUrls(new ArrayList<String>())
            .addAllFinalMobileUrls(new ArrayList<String>())
            .setPath1("path1106438828")
            .setPath2("path2106438829")
            .build();
    mockAssetGroupService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AssetGroup actualResponse = client.getAssetGroup(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAssetGroupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAssetGroupRequest actualRequest = ((GetAssetGroupRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAssetGroupExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAssetGroupService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAssetGroup(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAssetGroupsTest() throws Exception {
    MutateAssetGroupsResponse expectedResponse =
        MutateAssetGroupsResponse.newBuilder()
            .addAllResults(new ArrayList<MutateAssetGroupResult>())
            .setPartialFailureError(Status.newBuilder().build())
            .build();
    mockAssetGroupService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<AssetGroupOperation> operations = new ArrayList<>();

    MutateAssetGroupsResponse actualResponse = client.mutateAssetGroups(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAssetGroupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAssetGroupsRequest actualRequest = ((MutateAssetGroupsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAssetGroupsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAssetGroupService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<AssetGroupOperation> operations = new ArrayList<>();
      client.mutateAssetGroups(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
