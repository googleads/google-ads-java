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

package com.google.ads.googleads.v19.services;

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
public class ShareablePreviewServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockShareablePreviewService mockShareablePreviewService;
  private LocalChannelProvider channelProvider;
  private ShareablePreviewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockShareablePreviewService = new MockShareablePreviewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockShareablePreviewService));
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
    ShareablePreviewServiceSettings settings =
        ShareablePreviewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ShareablePreviewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void generateShareablePreviewsTest() throws Exception {
    GenerateShareablePreviewsResponse expectedResponse =
        GenerateShareablePreviewsResponse.newBuilder()
            .addAllResponses(new ArrayList<ShareablePreviewOrError>())
            .build();
    mockShareablePreviewService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<ShareablePreview> shareablePreviews = new ArrayList<>();

    GenerateShareablePreviewsResponse actualResponse =
        client.generateShareablePreviews(customerId, shareablePreviews);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockShareablePreviewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateShareablePreviewsRequest actualRequest =
        ((GenerateShareablePreviewsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(shareablePreviews, actualRequest.getShareablePreviewsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateShareablePreviewsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockShareablePreviewService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<ShareablePreview> shareablePreviews = new ArrayList<>();
      client.generateShareablePreviews(customerId, shareablePreviews);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
