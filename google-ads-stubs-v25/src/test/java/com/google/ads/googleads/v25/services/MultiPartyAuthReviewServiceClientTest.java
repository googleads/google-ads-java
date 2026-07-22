/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v25.services;

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
public class MultiPartyAuthReviewServiceClientTest {
  private static MockMultiPartyAuthReviewService mockMultiPartyAuthReviewService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private MultiPartyAuthReviewServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockMultiPartyAuthReviewService = new MockMultiPartyAuthReviewService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockMultiPartyAuthReviewService));
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
    MultiPartyAuthReviewServiceSettings settings =
        MultiPartyAuthReviewServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = MultiPartyAuthReviewServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void resolveMultiPartyAuthReviewTest() throws Exception {
    ResolveMultiPartyAuthReviewResponse expectedResponse =
        ResolveMultiPartyAuthReviewResponse.newBuilder()
            .addAllResultOrError(new ArrayList<ResolveMultiPartyAuthReviewResultOrError>())
            .build();
    mockMultiPartyAuthReviewService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<ResolveMultiPartyAuthReviewOperation> operations = new ArrayList<>();

    ResolveMultiPartyAuthReviewResponse actualResponse =
        client.resolveMultiPartyAuthReview(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockMultiPartyAuthReviewService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ResolveMultiPartyAuthReviewRequest actualRequest =
        ((ResolveMultiPartyAuthReviewRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void resolveMultiPartyAuthReviewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockMultiPartyAuthReviewService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<ResolveMultiPartyAuthReviewOperation> operations = new ArrayList<>();
      client.resolveMultiPartyAuthReview(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
