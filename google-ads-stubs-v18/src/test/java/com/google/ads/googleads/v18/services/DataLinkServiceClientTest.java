/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v18.services;

import com.google.ads.googleads.v18.resources.DataLink;
import com.google.ads.googleads.v18.resources.DataLinkName;
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
public class DataLinkServiceClientTest {
  private static MockDataLinkService mockDataLinkService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private DataLinkServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockDataLinkService = new MockDataLinkService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockDataLinkService));
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
    DataLinkServiceSettings settings =
        DataLinkServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = DataLinkServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void createDataLinkTest() throws Exception {
    CreateDataLinkResponse expectedResponse =
        CreateDataLinkResponse.newBuilder()
            .setResourceName(
                DataLinkName.of("[CUSTOMER_ID]", "[PRODUCT_LINK_ID]", "[DATA_LINK_ID]").toString())
            .build();
    mockDataLinkService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    DataLink dataLink = DataLink.newBuilder().build();

    CreateDataLinkResponse actualResponse = client.createDataLink(customerId, dataLink);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataLinkService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateDataLinkRequest actualRequest = ((CreateDataLinkRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(dataLink, actualRequest.getDataLink());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createDataLinkExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDataLinkService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      DataLink dataLink = DataLink.newBuilder().build();
      client.createDataLink(customerId, dataLink);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
