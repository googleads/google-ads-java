/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v9.services;

import com.google.ads.googleads.v9.resources.Video;
import com.google.ads.googleads.v9.resources.VideoName;
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
public class VideoServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockVideoService mockVideoService;
  private LocalChannelProvider channelProvider;
  private VideoServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockVideoService = new MockVideoService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockVideoService));
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
    VideoServiceSettings settings =
        VideoServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = VideoServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getVideoTest() throws Exception {
    Video expectedResponse =
        Video.newBuilder()
            .setResourceName(VideoName.of("[CUSTOMER_ID]", "[VIDEO_ID]").toString())
            .setId("id3355")
            .setChannelId("channelId1461735806")
            .setDurationMillis(1817418577)
            .setTitle("title110371416")
            .build();
    mockVideoService.addResponse(expectedResponse);

    VideoName resourceName = VideoName.of("[CUSTOMER_ID]", "[VIDEO_ID]");

    Video actualResponse = client.getVideo(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockVideoService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetVideoRequest actualRequest = ((GetVideoRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getVideoExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockVideoService.addException(exception);

    try {
      VideoName resourceName = VideoName.of("[CUSTOMER_ID]", "[VIDEO_ID]");
      client.getVideo(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getVideoTest2() throws Exception {
    Video expectedResponse =
        Video.newBuilder()
            .setResourceName(VideoName.of("[CUSTOMER_ID]", "[VIDEO_ID]").toString())
            .setId("id3355")
            .setChannelId("channelId1461735806")
            .setDurationMillis(1817418577)
            .setTitle("title110371416")
            .build();
    mockVideoService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    Video actualResponse = client.getVideo(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockVideoService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetVideoRequest actualRequest = ((GetVideoRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getVideoExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockVideoService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getVideo(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
