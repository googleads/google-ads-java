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

import com.google.ads.googleads.v6.resources.ProductGroupView;
import com.google.ads.googleads.v6.resources.ProductGroupViewName;
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
public class ProductGroupViewServiceClientTest {
  private static MockProductGroupViewService mockProductGroupViewService;
  private static MockServiceHelper mockServiceHelper;
  private ProductGroupViewServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockProductGroupViewService = new MockProductGroupViewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockProductGroupViewService));
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
    ProductGroupViewServiceSettings settings =
        ProductGroupViewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ProductGroupViewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getProductGroupViewTest() throws Exception {
    ProductGroupView expectedResponse =
        ProductGroupView.newBuilder()
            .setResourceName(
                ProductGroupViewName.of("[CUSTOMER_ID]", "[ADGROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockProductGroupViewService.addResponse(expectedResponse);

    ProductGroupViewName resourceName =
        ProductGroupViewName.of("[CUSTOMER_ID]", "[ADGROUP_ID]", "[CRITERION_ID]");

    ProductGroupView actualResponse = client.getProductGroupView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockProductGroupViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetProductGroupViewRequest actualRequest = ((GetProductGroupViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getProductGroupViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockProductGroupViewService.addException(exception);

    try {
      ProductGroupViewName resourceName =
          ProductGroupViewName.of("[CUSTOMER_ID]", "[ADGROUP_ID]", "[CRITERION_ID]");
      client.getProductGroupView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getProductGroupViewTest2() throws Exception {
    ProductGroupView expectedResponse =
        ProductGroupView.newBuilder()
            .setResourceName(
                ProductGroupViewName.of("[CUSTOMER_ID]", "[ADGROUP_ID]", "[CRITERION_ID]")
                    .toString())
            .build();
    mockProductGroupViewService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    ProductGroupView actualResponse = client.getProductGroupView(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockProductGroupViewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetProductGroupViewRequest actualRequest = ((GetProductGroupViewRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getProductGroupViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockProductGroupViewService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getProductGroupView(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
