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

import com.google.ads.googleads.v7.common.CustomParameter;
import com.google.ads.googleads.v7.common.FinalAppUrl;
import com.google.ads.googleads.v7.common.UrlCollection;
import com.google.ads.googleads.v7.resources.Ad;
import com.google.ads.googleads.v7.resources.AdName;
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
public class AdServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private AdServiceClient client;
  private static MockAdService mockAdService;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockAdService = new MockAdService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockAdService));
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
    AdServiceSettings settings =
        AdServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AdServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAdTest() throws Exception {
    Ad expectedResponse =
        Ad.newBuilder()
            .setResourceName(AdName.of("[CUSTOMER_ID]", "[AD_ID]").toString())
            .addAllFinalUrls(new ArrayList<String>())
            .addAllFinalAppUrls(new ArrayList<FinalAppUrl>())
            .addAllFinalMobileUrls(new ArrayList<String>())
            .addAllUrlCustomParameters(new ArrayList<CustomParameter>())
            .addAllUrlCollections(new ArrayList<UrlCollection>())
            .build();
    mockAdService.addResponse(expectedResponse);

    AdName resourceName = AdName.of("[CUSTOMER_ID]", "[AD_ID]");

    Ad actualResponse = client.getAd(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdRequest actualRequest = ((GetAdRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdService.addException(exception);

    try {
      AdName resourceName = AdName.of("[CUSTOMER_ID]", "[AD_ID]");
      client.getAd(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdTest2() throws Exception {
    Ad expectedResponse =
        Ad.newBuilder()
            .setResourceName(AdName.of("[CUSTOMER_ID]", "[AD_ID]").toString())
            .addAllFinalUrls(new ArrayList<String>())
            .addAllFinalAppUrls(new ArrayList<FinalAppUrl>())
            .addAllFinalMobileUrls(new ArrayList<String>())
            .addAllUrlCustomParameters(new ArrayList<CustomParameter>())
            .addAllUrlCollections(new ArrayList<UrlCollection>())
            .build();
    mockAdService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    Ad actualResponse = client.getAd(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdRequest actualRequest = ((GetAdRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getAd(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateAdsTest() throws Exception {
    MutateAdsResponse expectedResponse =
        MutateAdsResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateAdResult>())
            .build();
    mockAdService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<AdOperation> operations = new ArrayList<>();

    MutateAdsResponse actualResponse = client.mutateAds(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAdService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateAdsRequest actualRequest = ((MutateAdsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateAdsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAdService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<AdOperation> operations = new ArrayList<>();
      client.mutateAds(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
