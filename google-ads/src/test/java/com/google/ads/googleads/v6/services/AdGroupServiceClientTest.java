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

import com.google.ads.googleads.v6.common.CustomParameter;
import com.google.ads.googleads.v6.common.ExplorerAutoOptimizerSetting;
import com.google.ads.googleads.v6.common.TargetingSetting;
import com.google.ads.googleads.v6.resources.AdGroup;
import com.google.ads.googleads.v6.resources.AdGroupName;
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
public class AdGroupServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private AdGroupServiceClient client;
  private LocalChannelProvider channelProvider;
  private static MockAdGroupService mockAdGroupService;

  @BeforeClass
  public static void startStaticServer() {
    mockAdGroupService = new MockAdGroupService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockAdGroupService));
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
    AdGroupServiceSettings settings =
        AdGroupServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdGroupServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdGroupTest() throws Exception {
    AdGroup expectedResponse =
        AdGroup.newBuilder()
            .setResourceName(AdGroupName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]").toString())
            .addAllUrlCustomParameters(new ArrayList<CustomParameter>())
            .setExplorerAutoOptimizerSetting(ExplorerAutoOptimizerSetting.newBuilder().build())
            .setTargetingSetting(TargetingSetting.newBuilder().build())
            .addAllLabels(new ArrayList<String>())
            .build();
    mockAdGroupService.addResponse(expectedResponse);

    AdGroupName resourceName = AdGroupName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]");

    AdGroup actualResponse = client.getAdGroup(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupRequest actualRequest = ((GetAdGroupRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupService.addException(exception);

    try {
      AdGroupName resourceName = AdGroupName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]");
      client.getAdGroup(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdGroupTest2() throws Exception {
    AdGroup expectedResponse =
        AdGroup.newBuilder()
            .setResourceName(AdGroupName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]").toString())
            .addAllUrlCustomParameters(new ArrayList<CustomParameter>())
            .setExplorerAutoOptimizerSetting(ExplorerAutoOptimizerSetting.newBuilder().build())
            .setTargetingSetting(TargetingSetting.newBuilder().build())
            .addAllLabels(new ArrayList<String>())
            .build();
    mockAdGroupService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdGroup actualResponse = client.getAdGroup(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupRequest actualRequest = ((GetAdGroupRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdGroup(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAdGroupsTest() throws Exception {
    MutateAdGroupsResponse expectedResponse =
        MutateAdGroupsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateAdGroupResult>())
            .build();
    mockAdGroupService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<AdGroupOperation> operations = new ArrayList<>();

    MutateAdGroupsResponse actualResponse = client.mutateAdGroups(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAdGroupsRequest actualRequest = ((MutateAdGroupsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAdGroupsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<AdGroupOperation> operations = new ArrayList<>();
      client.mutateAdGroups(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
