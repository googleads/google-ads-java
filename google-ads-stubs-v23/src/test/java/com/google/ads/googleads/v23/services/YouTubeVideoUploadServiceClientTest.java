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

package com.google.ads.googleads.v23.services;

import com.google.ads.googleads.v23.resources.YouTubeVideoUpload;
import com.google.ads.googleads.v23.resources.YouTubeVideoUploadName;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.FieldMask;
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
public class YouTubeVideoUploadServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockYouTubeVideoUploadService mockYouTubeVideoUploadService;
  private LocalChannelProvider channelProvider;
  private YouTubeVideoUploadServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockYouTubeVideoUploadService = new MockYouTubeVideoUploadService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockYouTubeVideoUploadService));
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
    YouTubeVideoUploadServiceSettings settings =
        YouTubeVideoUploadServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = YouTubeVideoUploadServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void createYouTubeVideoUploadTest() throws Exception {
    CreateYouTubeVideoUploadResponse expectedResponse =
        CreateYouTubeVideoUploadResponse.newBuilder()
            .setResourceName(
                YouTubeVideoUploadName.of("[CUSTOMER_ID]", "[VIDEO_UPLOAD_ID]").toString())
            .build();
    mockYouTubeVideoUploadService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    YouTubeVideoUpload youTubeVideoUpload = YouTubeVideoUpload.newBuilder().build();

    CreateYouTubeVideoUploadResponse actualResponse =
        client.createYouTubeVideoUpload(customerId, youTubeVideoUpload);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockYouTubeVideoUploadService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateYouTubeVideoUploadRequest actualRequest =
        ((CreateYouTubeVideoUploadRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(youTubeVideoUpload, actualRequest.getYouTubeVideoUpload());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createYouTubeVideoUploadExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockYouTubeVideoUploadService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      YouTubeVideoUpload youTubeVideoUpload = YouTubeVideoUpload.newBuilder().build();
      client.createYouTubeVideoUpload(customerId, youTubeVideoUpload);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateYouTubeVideoUploadTest() throws Exception {
    UpdateYouTubeVideoUploadResponse expectedResponse =
        UpdateYouTubeVideoUploadResponse.newBuilder()
            .setResourceName(
                YouTubeVideoUploadName.of("[CUSTOMER_ID]", "[VIDEO_UPLOAD_ID]").toString())
            .build();
    mockYouTubeVideoUploadService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    YouTubeVideoUpload youTubeVideoUpload = YouTubeVideoUpload.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    UpdateYouTubeVideoUploadResponse actualResponse =
        client.updateYouTubeVideoUpload(customerId, youTubeVideoUpload, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockYouTubeVideoUploadService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateYouTubeVideoUploadRequest actualRequest =
        ((UpdateYouTubeVideoUploadRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(youTubeVideoUpload, actualRequest.getYouTubeVideoUpload());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateYouTubeVideoUploadExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockYouTubeVideoUploadService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      YouTubeVideoUpload youTubeVideoUpload = YouTubeVideoUpload.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateYouTubeVideoUpload(customerId, youTubeVideoUpload, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void removeYouTubeVideoUploadTest() throws Exception {
    RemoveYouTubeVideoUploadResponse expectedResponse =
        RemoveYouTubeVideoUploadResponse.newBuilder()
            .addAllResourceNames(new ArrayList<String>())
            .build();
    mockYouTubeVideoUploadService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";

    RemoveYouTubeVideoUploadResponse actualResponse = client.removeYouTubeVideoUpload(customerId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockYouTubeVideoUploadService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RemoveYouTubeVideoUploadRequest actualRequest =
        ((RemoveYouTubeVideoUploadRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void removeYouTubeVideoUploadExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockYouTubeVideoUploadService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      client.removeYouTubeVideoUpload(customerId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
