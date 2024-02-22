/*
 * Copyright 2024 Google LLC
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

package com.google.ads.googleads.v16.services;

import com.google.ads.googleads.v16.enums.ProductLinkInvitationStatusEnum;
import com.google.ads.googleads.v16.resources.ProductLinkInvitation;
import com.google.ads.googleads.v16.resources.ProductLinkInvitationName;
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
public class ProductLinkInvitationServiceClientTest {
  private static MockProductLinkInvitationService mockProductLinkInvitationService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ProductLinkInvitationServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockProductLinkInvitationService = new MockProductLinkInvitationService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockProductLinkInvitationService));
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
    ProductLinkInvitationServiceSettings settings =
        ProductLinkInvitationServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ProductLinkInvitationServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void createProductLinkInvitationTest() throws Exception {
    CreateProductLinkInvitationResponse expectedResponse =
        CreateProductLinkInvitationResponse.newBuilder()
            .setResourceName(
                ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]")
                    .toString())
            .build();
    mockProductLinkInvitationService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    ProductLinkInvitation productLinkInvitation = ProductLinkInvitation.newBuilder().build();

    CreateProductLinkInvitationResponse actualResponse =
        client.createProductLinkInvitation(customerId, productLinkInvitation);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockProductLinkInvitationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateProductLinkInvitationRequest actualRequest =
        ((CreateProductLinkInvitationRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(productLinkInvitation, actualRequest.getProductLinkInvitation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createProductLinkInvitationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockProductLinkInvitationService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      ProductLinkInvitation productLinkInvitation = ProductLinkInvitation.newBuilder().build();
      client.createProductLinkInvitation(customerId, productLinkInvitation);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateProductLinkInvitationTest() throws Exception {
    UpdateProductLinkInvitationResponse expectedResponse =
        UpdateProductLinkInvitationResponse.newBuilder()
            .setResourceName(
                ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]")
                    .toString())
            .build();
    mockProductLinkInvitationService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus productLinkInvitationStatus =
        ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus.forNumber(0);
    ProductLinkInvitationName resourceName =
        ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]");

    UpdateProductLinkInvitationResponse actualResponse =
        client.updateProductLinkInvitation(customerId, productLinkInvitationStatus, resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockProductLinkInvitationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateProductLinkInvitationRequest actualRequest =
        ((UpdateProductLinkInvitationRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(
        productLinkInvitationStatus, actualRequest.getProductLinkInvitationStatus());
    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateProductLinkInvitationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockProductLinkInvitationService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus productLinkInvitationStatus =
          ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus.forNumber(0);
      ProductLinkInvitationName resourceName =
          ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]");
      client.updateProductLinkInvitation(customerId, productLinkInvitationStatus, resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateProductLinkInvitationTest2() throws Exception {
    UpdateProductLinkInvitationResponse expectedResponse =
        UpdateProductLinkInvitationResponse.newBuilder()
            .setResourceName(
                ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]")
                    .toString())
            .build();
    mockProductLinkInvitationService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus productLinkInvitationStatus =
        ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus.forNumber(0);
    String resourceName = "resourceName-384566343";

    UpdateProductLinkInvitationResponse actualResponse =
        client.updateProductLinkInvitation(customerId, productLinkInvitationStatus, resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockProductLinkInvitationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateProductLinkInvitationRequest actualRequest =
        ((UpdateProductLinkInvitationRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(
        productLinkInvitationStatus, actualRequest.getProductLinkInvitationStatus());
    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateProductLinkInvitationExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockProductLinkInvitationService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus productLinkInvitationStatus =
          ProductLinkInvitationStatusEnum.ProductLinkInvitationStatus.forNumber(0);
      String resourceName = "resourceName-384566343";
      client.updateProductLinkInvitation(customerId, productLinkInvitationStatus, resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void removeProductLinkInvitationTest() throws Exception {
    RemoveProductLinkInvitationResponse expectedResponse =
        RemoveProductLinkInvitationResponse.newBuilder()
            .setResourceName(
                ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]")
                    .toString())
            .build();
    mockProductLinkInvitationService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    ProductLinkInvitationName resourceName =
        ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]");

    RemoveProductLinkInvitationResponse actualResponse =
        client.removeProductLinkInvitation(customerId, resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockProductLinkInvitationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RemoveProductLinkInvitationRequest actualRequest =
        ((RemoveProductLinkInvitationRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void removeProductLinkInvitationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockProductLinkInvitationService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      ProductLinkInvitationName resourceName =
          ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]");
      client.removeProductLinkInvitation(customerId, resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void removeProductLinkInvitationTest2() throws Exception {
    RemoveProductLinkInvitationResponse expectedResponse =
        RemoveProductLinkInvitationResponse.newBuilder()
            .setResourceName(
                ProductLinkInvitationName.of("[CUSTOMER_ID]", "[CUSTOMER_INVITATION_ID]")
                    .toString())
            .build();
    mockProductLinkInvitationService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    String resourceName = "resourceName-384566343";

    RemoveProductLinkInvitationResponse actualResponse =
        client.removeProductLinkInvitation(customerId, resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockProductLinkInvitationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RemoveProductLinkInvitationRequest actualRequest =
        ((RemoveProductLinkInvitationRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void removeProductLinkInvitationExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockProductLinkInvitationService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      String resourceName = "resourceName-384566343";
      client.removeProductLinkInvitation(customerId, resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
