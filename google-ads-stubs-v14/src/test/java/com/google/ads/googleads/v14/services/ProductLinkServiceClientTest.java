/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v14.services;

import com.google.ads.googleads.v14.resources.ProductLink;
import com.google.ads.googleads.v14.resources.ProductLinkName;
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
public class ProductLinkServiceClientTest {
  private static MockProductLinkService mockProductLinkService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ProductLinkServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockProductLinkService = new MockProductLinkService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockProductLinkService));
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
    ProductLinkServiceSettings settings =
        ProductLinkServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ProductLinkServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void createProductLinkTest() throws Exception {
    CreateProductLinkResponse expectedResponse =
        CreateProductLinkResponse.newBuilder()
            .setResourceName(ProductLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]").toString())
            .build();
    mockProductLinkService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    ProductLink productLink = ProductLink.newBuilder().build();

    CreateProductLinkResponse actualResponse = client.createProductLink(customerId, productLink);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockProductLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateProductLinkRequest actualRequest = ((CreateProductLinkRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(productLink, actualRequest.getProductLink());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createProductLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockProductLinkService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      ProductLink productLink = ProductLink.newBuilder().build();
      client.createProductLink(customerId, productLink);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void removeProductLinkTest() throws Exception {
    RemoveProductLinkResponse expectedResponse =
        RemoveProductLinkResponse.newBuilder()
            .setResourceName(ProductLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]").toString())
            .build();
    mockProductLinkService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    ProductLinkName resourceName = ProductLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]");

    RemoveProductLinkResponse actualResponse = client.removeProductLink(customerId, resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockProductLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RemoveProductLinkRequest actualRequest = ((RemoveProductLinkRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void removeProductLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockProductLinkService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      ProductLinkName resourceName = ProductLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]");
      client.removeProductLink(customerId, resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void removeProductLinkTest2() throws Exception {
    RemoveProductLinkResponse expectedResponse =
        RemoveProductLinkResponse.newBuilder()
            .setResourceName(ProductLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]").toString())
            .build();
    mockProductLinkService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    String resourceName = "resourceName-384566343";

    RemoveProductLinkResponse actualResponse = client.removeProductLink(customerId, resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockProductLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RemoveProductLinkRequest actualRequest = ((RemoveProductLinkRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void removeProductLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockProductLinkService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      String resourceName = "resourceName-384566343";
      client.removeProductLink(customerId, resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
