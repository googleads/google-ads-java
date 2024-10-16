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

package com.google.ads.googleads.v18.services;

import static com.google.ads.googleads.v18.services.GoogleAdsFieldServiceClient.SearchGoogleAdsFieldsPagedResponse;

import com.google.ads.googleads.v18.resources.GoogleAdsField;
import com.google.ads.googleads.v18.resources.GoogleAdsFieldName;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.common.collect.Lists;
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
public class GoogleAdsFieldServiceClientTest {
  private static MockGoogleAdsFieldService mockGoogleAdsFieldService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private GoogleAdsFieldServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockGoogleAdsFieldService = new MockGoogleAdsFieldService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockGoogleAdsFieldService));
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
    GoogleAdsFieldServiceSettings settings =
        GoogleAdsFieldServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = GoogleAdsFieldServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getGoogleAdsFieldTest() throws Exception {
    GoogleAdsField expectedResponse =
        GoogleAdsField.newBuilder()
            .setResourceName(GoogleAdsFieldName.of("[GOOGLE_ADS_FIELD]").toString())
            .setName(GoogleAdsFieldName.of("[GOOGLE_ADS_FIELD]").toString())
            .setSelectable(true)
            .setFilterable(true)
            .setSortable(true)
            .addAllSelectableWith(new ArrayList<String>())
            .addAllAttributeResources(new ArrayList<String>())
            .addAllMetrics(new ArrayList<String>())
            .addAllSegments(new ArrayList<String>())
            .addAllEnumValues(new ArrayList<String>())
            .setTypeUrl("typeUrl-853099563")
            .setIsRepeated(true)
            .build();
    mockGoogleAdsFieldService.addResponse(expectedResponse);

    GoogleAdsFieldName resourceName = GoogleAdsFieldName.of("[GOOGLE_ADS_FIELD]");

    GoogleAdsField actualResponse = client.getGoogleAdsField(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockGoogleAdsFieldService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetGoogleAdsFieldRequest actualRequest = ((GetGoogleAdsFieldRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getGoogleAdsFieldExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockGoogleAdsFieldService.addException(exception);

    try {
      GoogleAdsFieldName resourceName = GoogleAdsFieldName.of("[GOOGLE_ADS_FIELD]");
      client.getGoogleAdsField(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getGoogleAdsFieldTest2() throws Exception {
    GoogleAdsField expectedResponse =
        GoogleAdsField.newBuilder()
            .setResourceName(GoogleAdsFieldName.of("[GOOGLE_ADS_FIELD]").toString())
            .setName(GoogleAdsFieldName.of("[GOOGLE_ADS_FIELD]").toString())
            .setSelectable(true)
            .setFilterable(true)
            .setSortable(true)
            .addAllSelectableWith(new ArrayList<String>())
            .addAllAttributeResources(new ArrayList<String>())
            .addAllMetrics(new ArrayList<String>())
            .addAllSegments(new ArrayList<String>())
            .addAllEnumValues(new ArrayList<String>())
            .setTypeUrl("typeUrl-853099563")
            .setIsRepeated(true)
            .build();
    mockGoogleAdsFieldService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    GoogleAdsField actualResponse = client.getGoogleAdsField(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockGoogleAdsFieldService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetGoogleAdsFieldRequest actualRequest = ((GetGoogleAdsFieldRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getGoogleAdsFieldExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockGoogleAdsFieldService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getGoogleAdsField(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void searchGoogleAdsFieldsTest() throws Exception {
    GoogleAdsField responsesElement = GoogleAdsField.newBuilder().build();
    SearchGoogleAdsFieldsResponse expectedResponse =
        SearchGoogleAdsFieldsResponse.newBuilder()
            .setNextPageToken("")
            .addAllResults(Arrays.asList(responsesElement))
            .build();
    mockGoogleAdsFieldService.addResponse(expectedResponse);

    String query = "query107944136";

    SearchGoogleAdsFieldsPagedResponse pagedListResponse = client.searchGoogleAdsFields(query);

    List<GoogleAdsField> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getResultsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockGoogleAdsFieldService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SearchGoogleAdsFieldsRequest actualRequest =
        ((SearchGoogleAdsFieldsRequest) actualRequests.get(0));

    Assert.assertEquals(query, actualRequest.getQuery());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void searchGoogleAdsFieldsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockGoogleAdsFieldService.addException(exception);

    try {
      String query = "query107944136";
      client.searchGoogleAdsFields(query);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
