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

import com.google.ads.googleads.v23.common.AdditionalApplicationInfo;
import com.google.ads.googleads.v23.common.DateRange;
import com.google.ads.googleads.v23.common.LocationInfo;
import com.google.ads.googleads.v23.enums.BenchmarksSourceTypeEnum;
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
public class BenchmarksServiceClientTest {
  private static MockBenchmarksService mockBenchmarksService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private BenchmarksServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockBenchmarksService = new MockBenchmarksService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockBenchmarksService));
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
    BenchmarksServiceSettings settings =
        BenchmarksServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = BenchmarksServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void listBenchmarksAvailableDatesTest() throws Exception {
    ListBenchmarksAvailableDatesResponse expectedResponse =
        ListBenchmarksAvailableDatesResponse.newBuilder()
            .setSupportedDates(DateRange.newBuilder().build())
            .build();
    mockBenchmarksService.addResponse(expectedResponse);

    ListBenchmarksAvailableDatesRequest request =
        ListBenchmarksAvailableDatesRequest.newBuilder()
            .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
            .build();

    ListBenchmarksAvailableDatesResponse actualResponse =
        client.listBenchmarksAvailableDates(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBenchmarksService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListBenchmarksAvailableDatesRequest actualRequest =
        ((ListBenchmarksAvailableDatesRequest) actualRequests.get(0));

    Assert.assertEquals(request.getApplicationInfo(), actualRequest.getApplicationInfo());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listBenchmarksAvailableDatesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBenchmarksService.addException(exception);

    try {
      ListBenchmarksAvailableDatesRequest request =
          ListBenchmarksAvailableDatesRequest.newBuilder()
              .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
              .build();
      client.listBenchmarksAvailableDates(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBenchmarksLocationsTest() throws Exception {
    ListBenchmarksLocationsResponse expectedResponse =
        ListBenchmarksLocationsResponse.newBuilder()
            .addAllBenchmarksLocations(new ArrayList<BenchmarksLocation>())
            .build();
    mockBenchmarksService.addResponse(expectedResponse);

    ListBenchmarksLocationsRequest request =
        ListBenchmarksLocationsRequest.newBuilder()
            .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
            .build();

    ListBenchmarksLocationsResponse actualResponse = client.listBenchmarksLocations(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBenchmarksService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListBenchmarksLocationsRequest actualRequest =
        ((ListBenchmarksLocationsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getApplicationInfo(), actualRequest.getApplicationInfo());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listBenchmarksLocationsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBenchmarksService.addException(exception);

    try {
      ListBenchmarksLocationsRequest request =
          ListBenchmarksLocationsRequest.newBuilder()
              .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
              .build();
      client.listBenchmarksLocations(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBenchmarksProductsTest() throws Exception {
    ListBenchmarksProductsResponse expectedResponse =
        ListBenchmarksProductsResponse.newBuilder()
            .addAllBenchmarksProducts(new ArrayList<BenchmarksProductMetadata>())
            .build();
    mockBenchmarksService.addResponse(expectedResponse);

    ListBenchmarksProductsRequest request =
        ListBenchmarksProductsRequest.newBuilder()
            .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
            .build();

    ListBenchmarksProductsResponse actualResponse = client.listBenchmarksProducts(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBenchmarksService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListBenchmarksProductsRequest actualRequest =
        ((ListBenchmarksProductsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getApplicationInfo(), actualRequest.getApplicationInfo());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listBenchmarksProductsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBenchmarksService.addException(exception);

    try {
      ListBenchmarksProductsRequest request =
          ListBenchmarksProductsRequest.newBuilder()
              .setApplicationInfo(AdditionalApplicationInfo.newBuilder().build())
              .build();
      client.listBenchmarksProducts(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBenchmarksSourcesTest() throws Exception {
    ListBenchmarksSourcesResponse expectedResponse =
        ListBenchmarksSourcesResponse.newBuilder()
            .addAllBenchmarksSources(new ArrayList<BenchmarksSourceMetadata>())
            .build();
    mockBenchmarksService.addResponse(expectedResponse);

    List<BenchmarksSourceTypeEnum.BenchmarksSourceType> benchmarksSources = new ArrayList<>();

    ListBenchmarksSourcesResponse actualResponse = client.listBenchmarksSources(benchmarksSources);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBenchmarksService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListBenchmarksSourcesRequest actualRequest =
        ((ListBenchmarksSourcesRequest) actualRequests.get(0));

    Assert.assertEquals(benchmarksSources, actualRequest.getBenchmarksSourcesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listBenchmarksSourcesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBenchmarksService.addException(exception);

    try {
      List<BenchmarksSourceTypeEnum.BenchmarksSourceType> benchmarksSources = new ArrayList<>();
      client.listBenchmarksSources(benchmarksSources);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateBenchmarksMetricsTest() throws Exception {
    GenerateBenchmarksMetricsResponse expectedResponse =
        GenerateBenchmarksMetricsResponse.newBuilder()
            .setCustomerMetrics(Metrics.newBuilder().build())
            .setAverageBenchmarksMetrics(Metrics.newBuilder().build())
            .build();
    mockBenchmarksService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    LocationInfo location = LocationInfo.newBuilder().build();
    BenchmarksSource benchmarksSource = BenchmarksSource.newBuilder().build();
    ProductFilter productFilter = ProductFilter.newBuilder().build();

    GenerateBenchmarksMetricsResponse actualResponse =
        client.generateBenchmarksMetrics(customerId, location, benchmarksSource, productFilter);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBenchmarksService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateBenchmarksMetricsRequest actualRequest =
        ((GenerateBenchmarksMetricsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(location, actualRequest.getLocation());
    Assert.assertEquals(benchmarksSource, actualRequest.getBenchmarksSource());
    Assert.assertEquals(productFilter, actualRequest.getProductFilter());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateBenchmarksMetricsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBenchmarksService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      LocationInfo location = LocationInfo.newBuilder().build();
      BenchmarksSource benchmarksSource = BenchmarksSource.newBuilder().build();
      ProductFilter productFilter = ProductFilter.newBuilder().build();
      client.generateBenchmarksMetrics(customerId, location, benchmarksSource, productFilter);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
