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

import com.google.ads.googleads.v9.resources.ProductBiddingCategoryConstant;
import com.google.ads.googleads.v9.resources.ProductBiddingCategoryConstantName;
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
public class ProductBiddingCategoryConstantServiceClientTest {
  private static MockProductBiddingCategoryConstantService
      mockProductBiddingCategoryConstantService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ProductBiddingCategoryConstantServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockProductBiddingCategoryConstantService = new MockProductBiddingCategoryConstantService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockProductBiddingCategoryConstantService));
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
    ProductBiddingCategoryConstantServiceSettings settings =
        ProductBiddingCategoryConstantServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ProductBiddingCategoryConstantServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getProductBiddingCategoryConstantTest() throws Exception {
    ProductBiddingCategoryConstant expectedResponse =
        ProductBiddingCategoryConstant.newBuilder()
            .setResourceName(
                ProductBiddingCategoryConstantName.of("[COUNTRY_CODE]", "[LEVEL]", "[ID]")
                    .toString())
            .setId(3355)
            .setCountryCode("countryCode-1477067101")
            .setProductBiddingCategoryConstantParent(
                ProductBiddingCategoryConstantName.of("[COUNTRY_CODE]", "[LEVEL]", "[ID]")
                    .toString())
            .setLanguageCode("languageCode-2092349083")
            .setLocalizedName("localizedName696548518")
            .build();
    mockProductBiddingCategoryConstantService.addResponse(expectedResponse);

    ProductBiddingCategoryConstantName resourceName =
        ProductBiddingCategoryConstantName.of("[COUNTRY_CODE]", "[LEVEL]", "[ID]");

    ProductBiddingCategoryConstant actualResponse =
        client.getProductBiddingCategoryConstant(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockProductBiddingCategoryConstantService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetProductBiddingCategoryConstantRequest actualRequest =
        ((GetProductBiddingCategoryConstantRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getProductBiddingCategoryConstantExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockProductBiddingCategoryConstantService.addException(exception);

    try {
      ProductBiddingCategoryConstantName resourceName =
          ProductBiddingCategoryConstantName.of("[COUNTRY_CODE]", "[LEVEL]", "[ID]");
      client.getProductBiddingCategoryConstant(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getProductBiddingCategoryConstantTest2() throws Exception {
    ProductBiddingCategoryConstant expectedResponse =
        ProductBiddingCategoryConstant.newBuilder()
            .setResourceName(
                ProductBiddingCategoryConstantName.of("[COUNTRY_CODE]", "[LEVEL]", "[ID]")
                    .toString())
            .setId(3355)
            .setCountryCode("countryCode-1477067101")
            .setProductBiddingCategoryConstantParent(
                ProductBiddingCategoryConstantName.of("[COUNTRY_CODE]", "[LEVEL]", "[ID]")
                    .toString())
            .setLanguageCode("languageCode-2092349083")
            .setLocalizedName("localizedName696548518")
            .build();
    mockProductBiddingCategoryConstantService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    ProductBiddingCategoryConstant actualResponse =
        client.getProductBiddingCategoryConstant(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockProductBiddingCategoryConstantService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetProductBiddingCategoryConstantRequest actualRequest =
        ((GetProductBiddingCategoryConstantRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getProductBiddingCategoryConstantExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockProductBiddingCategoryConstantService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getProductBiddingCategoryConstant(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
