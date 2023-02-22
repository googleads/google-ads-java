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

package com.google.ads.googleads.v13.services;

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
public class MediaFileServiceClientTest {
  private static MockMediaFileService mockMediaFileService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private MediaFileServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockMediaFileService = new MockMediaFileService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockMediaFileService));
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
    MediaFileServiceSettings settings =
        MediaFileServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = MediaFileServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void mutateMediaFilesTest() throws Exception {
    MutateMediaFilesResponse expectedResponse =
        MutateMediaFilesResponse.newBuilder()
            .setPartialFailureError(Status.newBuilder().build())
            .addAllResults(new ArrayList<MutateMediaFileResult>())
            .build();
    mockMediaFileService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<MediaFileOperation> operations = new ArrayList<>();

    MutateMediaFilesResponse actualResponse = client.mutateMediaFiles(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockMediaFileService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateMediaFilesRequest actualRequest = ((MutateMediaFilesRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateMediaFilesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockMediaFileService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<MediaFileOperation> operations = new ArrayList<>();
      client.mutateMediaFiles(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
