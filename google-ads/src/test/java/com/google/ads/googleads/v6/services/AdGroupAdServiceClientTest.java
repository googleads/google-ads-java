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

import com.google.ads.googleads.v6.resources.Ad;
import com.google.ads.googleads.v6.resources.AdGroupAd;
import com.google.ads.googleads.v6.resources.AdGroupAdName;
import com.google.ads.googleads.v6.resources.AdGroupAdPolicySummary;
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
public class AdGroupAdServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private AdGroupAdServiceClient client;
  private static MockAdGroupAdService mockAdGroupAdService;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAdGroupAdService = new MockAdGroupAdService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockAdGroupAdService));
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
    AdGroupAdServiceSettings settings =
        AdGroupAdServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdGroupAdServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdGroupAdTest() throws Exception {
    AdGroupAd expectedResponse =
        AdGroupAd.newBuilder()
            .setResourceName(
                AdGroupAdName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]").toString())
            .setAd(Ad.newBuilder().build())
            .setPolicySummary(AdGroupAdPolicySummary.newBuilder().build())
            .build();
    mockAdGroupAdService.addResponse(expectedResponse);

    AdGroupAdName resourceName = AdGroupAdName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]");

    AdGroupAd actualResponse = client.getAdGroupAd(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupAdService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupAdRequest actualRequest = ((GetAdGroupAdRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupAdExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupAdService.addException(exception);

    try {
      AdGroupAdName resourceName = AdGroupAdName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]");
      client.getAdGroupAd(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdGroupAdTest2() throws Exception {
    AdGroupAd expectedResponse =
        AdGroupAd.newBuilder()
            .setResourceName(
                AdGroupAdName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[AD_ID]").toString())
            .setAd(Ad.newBuilder().build())
            .setPolicySummary(AdGroupAdPolicySummary.newBuilder().build())
            .build();
    mockAdGroupAdService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    AdGroupAd actualResponse = client.getAdGroupAd(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupAdService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdGroupAdRequest actualRequest = ((GetAdGroupAdRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdGroupAdExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupAdService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAdGroupAd(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAdGroupAdsTest() throws Exception {
    MutateAdGroupAdsResponse expectedResponse =
        MutateAdGroupAdsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateAdGroupAdResult>())
            .build();
    mockAdGroupAdService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<AdGroupAdOperation> operations = new ArrayList<>();

    MutateAdGroupAdsResponse actualResponse = client.mutateAdGroupAds(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdGroupAdService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAdGroupAdsRequest actualRequest = ((MutateAdGroupAdsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAdGroupAdsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdGroupAdService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<AdGroupAdOperation> operations = new ArrayList<>();
      client.mutateAdGroupAds(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
