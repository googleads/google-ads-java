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

import com.google.ads.googleads.v7.resources.AdGroupAdAssetPolicySummary;
import com.google.ads.googleads.v7.resources.AdGroupAdAssetView;
import com.google.ads.googleads.v7.resources.AdGroupAdAssetViewName;
import com.google.ads.googleads.v7.resources.AdGroupAdName;
import com.google.ads.googleads.v7.resources.AssetName;
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
public class AdGroupAdAssetViewServiceClientTest {
  private static MockAdGroupAdAssetViewService mockAdGroupAdAssetViewService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private AdGroupAdAssetViewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAdGroupAdAssetViewService = new MockAdGroupAdAssetViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAdGroupAdAssetViewService));
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
    AdGroupAdAssetViewServiceSettings settings =
        AdGroupAdAssetViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdGroupAdAssetViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdGroupAdAssetViewTest() throws Exception {
    AdGroupAdAssetView expectedResponse =
        AdGroupAdAssetView.newBuilder()
            .setResourceName(
                AdGroupAdAssetViewName.of(
                        "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]", "[ASSET_ID]", "[FIELD_TYPE]")
                    .toString())
            .setAdGroupAd(AdGroupAdName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]").toString())
            .setAsset(AssetName.of("[CUSTOMER_ID]", "[ASSET_ID]").toString())
            .setEnabled(true)
            .setPolicySummary(AdGroupAdAssetPolicySummary.newBuilder().build())
            .build();
    mockAdGroupAdAssetViewService.addResponse(expectedResponse);

    AdGroupAdAssetViewName resourceName =
        AdGroupAdAssetViewName.of(
            "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]", "[ASSET_ID]", "[FIELD_TYPE]");

    AdGroupAdAssetView actualResponse = client.getAdGroupAdAssetView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupAdAssetViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupAdAssetViewRequest actualRequest =
        ((GetAdGroupAdAssetViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupAdAssetViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupAdAssetViewService.addException(exception);

    try {
      AdGroupAdAssetViewName resourceName =
          AdGroupAdAssetViewName.of(
              "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]", "[ASSET_ID]", "[FIELD_TYPE]");
      client.getAdGroupAdAssetView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdGroupAdAssetViewTest2() throws Exception {
    AdGroupAdAssetView expectedResponse =
        AdGroupAdAssetView.newBuilder()
            .setResourceName(
                AdGroupAdAssetViewName.of(
                        "[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]", "[ASSET_ID]", "[FIELD_TYPE]")
                    .toString())
            .setAdGroupAd(AdGroupAdName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]").toString())
            .setAsset(AssetName.of("[CUSTOMER_ID]", "[ASSET_ID]").toString())
            .setEnabled(true)
            .setPolicySummary(AdGroupAdAssetPolicySummary.newBuilder().build())
            .build();
    mockAdGroupAdAssetViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdGroupAdAssetView actualResponse = client.getAdGroupAdAssetView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupAdAssetViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupAdAssetViewRequest actualRequest =
        ((GetAdGroupAdAssetViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupAdAssetViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupAdAssetViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdGroupAdAssetView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
