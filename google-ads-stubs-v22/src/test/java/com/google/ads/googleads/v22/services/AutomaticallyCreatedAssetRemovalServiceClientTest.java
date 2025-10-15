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

package com.google.ads.googleads.v22.services;

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
public class AutomaticallyCreatedAssetRemovalServiceClientTest {
  private static MockAutomaticallyCreatedAssetRemovalService
      mockAutomaticallyCreatedAssetRemovalService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private AutomaticallyCreatedAssetRemovalServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockAutomaticallyCreatedAssetRemovalService = new MockAutomaticallyCreatedAssetRemovalService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockAutomaticallyCreatedAssetRemovalService));
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
    AutomaticallyCreatedAssetRemovalServiceSettings settings =
        AutomaticallyCreatedAssetRemovalServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AutomaticallyCreatedAssetRemovalServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void removeCampaignAutomaticallyCreatedAssetTest() throws Exception {
    RemoveCampaignAutomaticallyCreatedAssetResponse expectedResponse =
        RemoveCampaignAutomaticallyCreatedAssetResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .build();
    mockAutomaticallyCreatedAssetRemovalService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<RemoveCampaignAutomaticallyCreatedAssetOperation> operations = new ArrayList<>();
    boolean partialFailure = true;

    RemoveCampaignAutomaticallyCreatedAssetResponse actualResponse =
        client.removeCampaignAutomaticallyCreatedAsset(customerId, operations, partialFailure);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests =
        mockAutomaticallyCreatedAssetRemovalService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RemoveCampaignAutomaticallyCreatedAssetRequest actualRequest =
        ((RemoveCampaignAutomaticallyCreatedAssetRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertEquals(partialFailure, actualRequest.getPartialFailure());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void removeCampaignAutomaticallyCreatedAssetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockAutomaticallyCreatedAssetRemovalService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<RemoveCampaignAutomaticallyCreatedAssetOperation> operations = new ArrayList<>();
      boolean partialFailure = true;
      client.removeCampaignAutomaticallyCreatedAsset(customerId, operations, partialFailure);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
