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

import com.google.ads.googleads.v6.resources.AdGroupExtensionSetting;
import com.google.ads.googleads.v6.resources.AdGroupExtensionSettingName;
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
public class AdGroupExtensionSettingServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private AdGroupExtensionSettingServiceClient client;
  private static MockAdGroupExtensionSettingService mockAdGroupExtensionSettingService;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAdGroupExtensionSettingService = new MockAdGroupExtensionSettingService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAdGroupExtensionSettingService));
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
    AdGroupExtensionSettingServiceSettings settings =
        AdGroupExtensionSettingServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdGroupExtensionSettingServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdGroupExtensionSettingTest() throws Exception {
    AdGroupExtensionSetting expectedResponse =
        AdGroupExtensionSetting.newBuilder()
            .setResourceName(
                AdGroupExtensionSettingName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[EXTENSION_TYPE]")
                    .toString())
            .addAllExtensionFeedItems(new ArrayList<String>())
            .build();
    mockAdGroupExtensionSettingService.addResponse(expectedResponse);

    AdGroupExtensionSettingName resourceName =
        AdGroupExtensionSettingName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[EXTENSION_TYPE]");

    AdGroupExtensionSetting actualResponse = client.getAdGroupExtensionSetting(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupExtensionSettingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupExtensionSettingRequest actualRequest =
        ((GetAdGroupExtensionSettingRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupExtensionSettingExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupExtensionSettingService.addException(exception);

    try {
      AdGroupExtensionSettingName resourceName =
          AdGroupExtensionSettingName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[EXTENSION_TYPE]");
      client.getAdGroupExtensionSetting(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdGroupExtensionSettingTest2() throws Exception {
    AdGroupExtensionSetting expectedResponse =
        AdGroupExtensionSetting.newBuilder()
            .setResourceName(
                AdGroupExtensionSettingName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[EXTENSION_TYPE]")
                    .toString())
            .addAllExtensionFeedItems(new ArrayList<String>())
            .build();
    mockAdGroupExtensionSettingService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdGroupExtensionSetting actualResponse = client.getAdGroupExtensionSetting(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupExtensionSettingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupExtensionSettingRequest actualRequest =
        ((GetAdGroupExtensionSettingRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupExtensionSettingExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupExtensionSettingService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdGroupExtensionSetting(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAdGroupExtensionSettingsTest() throws Exception {
    MutateAdGroupExtensionSettingsResponse expectedResponse =
        MutateAdGroupExtensionSettingsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateAdGroupExtensionSettingResult>())
            .build();
    mockAdGroupExtensionSettingService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<AdGroupExtensionSettingOperation> operations = new ArrayList<>();

    MutateAdGroupExtensionSettingsResponse actualResponse =
        client.mutateAdGroupExtensionSettings(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupExtensionSettingService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAdGroupExtensionSettingsRequest actualRequest =
        ((MutateAdGroupExtensionSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAdGroupExtensionSettingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupExtensionSettingService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<AdGroupExtensionSettingOperation> operations = new ArrayList<>();
      client.mutateAdGroupExtensionSettings(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
