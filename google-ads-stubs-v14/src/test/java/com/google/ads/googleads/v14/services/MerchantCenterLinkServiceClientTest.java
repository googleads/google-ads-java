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

package com.google.ads.googleads.v14.services;

import com.google.ads.googleads.v14.resources.MerchantCenterLink;
import com.google.ads.googleads.v14.resources.MerchantCenterLinkName;
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
public class MerchantCenterLinkServiceClientTest {
  private static MockMerchantCenterLinkService mockMerchantCenterLinkService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private MerchantCenterLinkServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockMerchantCenterLinkService = new MockMerchantCenterLinkService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockMerchantCenterLinkService));
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
    MerchantCenterLinkServiceSettings settings =
        MerchantCenterLinkServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = MerchantCenterLinkServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void listMerchantCenterLinksTest() throws Exception {
    ListMerchantCenterLinksResponse expectedResponse =
        ListMerchantCenterLinksResponse.newBuilder()
            .addAllMerchantCenterLinks(new ArrayList<MerchantCenterLink>())
            .build();
    mockMerchantCenterLinkService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";

    ListMerchantCenterLinksResponse actualResponse = client.listMerchantCenterLinks(customerId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockMerchantCenterLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListMerchantCenterLinksRequest actualRequest =
        ((ListMerchantCenterLinksRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listMerchantCenterLinksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockMerchantCenterLinkService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      client.listMerchantCenterLinks(customerId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getMerchantCenterLinkTest() throws Exception {
    MerchantCenterLink expectedResponse =
        MerchantCenterLink.newBuilder()
            .setResourceName(
                MerchantCenterLinkName.of("[CUSTOMER_ID]", "[MERCHANT_CENTER_ID]").toString())
            .setId(3355)
            .setMerchantCenterAccountName("merchantCenterAccountName1180638683")
            .build();
    mockMerchantCenterLinkService.addResponse(expectedResponse);

    MerchantCenterLinkName resourceName =
        MerchantCenterLinkName.of("[CUSTOMER_ID]", "[MERCHANT_CENTER_ID]");

    MerchantCenterLink actualResponse = client.getMerchantCenterLink(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockMerchantCenterLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetMerchantCenterLinkRequest actualRequest =
        ((GetMerchantCenterLinkRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getMerchantCenterLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockMerchantCenterLinkService.addException(exception);

    try {
      MerchantCenterLinkName resourceName =
          MerchantCenterLinkName.of("[CUSTOMER_ID]", "[MERCHANT_CENTER_ID]");
      client.getMerchantCenterLink(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getMerchantCenterLinkTest2() throws Exception {
    MerchantCenterLink expectedResponse =
        MerchantCenterLink.newBuilder()
            .setResourceName(
                MerchantCenterLinkName.of("[CUSTOMER_ID]", "[MERCHANT_CENTER_ID]").toString())
            .setId(3355)
            .setMerchantCenterAccountName("merchantCenterAccountName1180638683")
            .build();
    mockMerchantCenterLinkService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    MerchantCenterLink actualResponse = client.getMerchantCenterLink(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockMerchantCenterLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetMerchantCenterLinkRequest actualRequest =
        ((GetMerchantCenterLinkRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getMerchantCenterLinkExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockMerchantCenterLinkService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getMerchantCenterLink(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateMerchantCenterLinkTest() throws Exception {
    MutateMerchantCenterLinkResponse expectedResponse =
        MutateMerchantCenterLinkResponse.newBuilder()
            .setResult(MutateMerchantCenterLinkResult.newBuilder().build())
            .build();
    mockMerchantCenterLinkService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    MerchantCenterLinkOperation operation = MerchantCenterLinkOperation.newBuilder().build();

    MutateMerchantCenterLinkResponse actualResponse =
        client.mutateMerchantCenterLink(customerId, operation);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockMerchantCenterLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateMerchantCenterLinkRequest actualRequest =
        ((MutateMerchantCenterLinkRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operation, actualRequest.getOperation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateMerchantCenterLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockMerchantCenterLinkService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      MerchantCenterLinkOperation operation = MerchantCenterLinkOperation.newBuilder().build();
      client.mutateMerchantCenterLink(customerId, operation);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
