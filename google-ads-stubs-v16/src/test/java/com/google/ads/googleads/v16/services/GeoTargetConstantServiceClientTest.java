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
public class GeoTargetConstantServiceClientTest {
  private static MockGeoTargetConstantService mockGeoTargetConstantService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private GeoTargetConstantServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockGeoTargetConstantService = new MockGeoTargetConstantService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockGeoTargetConstantService));
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
    GeoTargetConstantServiceSettings settings =
        GeoTargetConstantServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = GeoTargetConstantServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void suggestGeoTargetConstantsTest() throws Exception {
    SuggestGeoTargetConstantsResponse expectedResponse =
        SuggestGeoTargetConstantsResponse.newBuilder()
            .addAllGeoTargetConstantSuggestions(new ArrayList<GeoTargetConstantSuggestion>())
            .build();
    mockGeoTargetConstantService.addResponse(expectedResponse);

    SuggestGeoTargetConstantsRequest request =
        SuggestGeoTargetConstantsRequest.newBuilder()
            .setLocale("locale-1097462182")
            .setCountryCode("countryCode-1477067101")
            .build();

    SuggestGeoTargetConstantsResponse actualResponse = client.suggestGeoTargetConstants(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockGeoTargetConstantService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SuggestGeoTargetConstantsRequest actualRequest =
        ((SuggestGeoTargetConstantsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getLocale(), actualRequest.getLocale());
    Assert.assertEquals(request.getCountryCode(), actualRequest.getCountryCode());
    Assert.assertEquals(request.getLocationNames(), actualRequest.getLocationNames());
    Assert.assertEquals(request.getGeoTargets(), actualRequest.getGeoTargets());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void suggestGeoTargetConstantsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockGeoTargetConstantService.addException(exception);

    try {
      SuggestGeoTargetConstantsRequest request =
          SuggestGeoTargetConstantsRequest.newBuilder()
              .setLocale("locale-1097462182")
              .setCountryCode("countryCode-1477067101")
              .build();
      client.suggestGeoTargetConstants(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
