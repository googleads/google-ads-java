/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v1.services;

import com.google.ads.googleads.v1.resources.Video;
import com.google.ads.googleads.v1.services.stub.VideoServiceStub;
import com.google.ads.googleads.v1.services.stub.VideoServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage videos.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (VideoServiceClient videoServiceClient = VideoServiceClient.create()) {
 *   String formattedResourceName = VideoServiceClient.formatVideoName("[CUSTOMER]", "[VIDEO]");
 *   Video response = videoServiceClient.getVideo(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the videoServiceClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of VideoServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * VideoServiceSettings videoServiceSettings =
 *     VideoServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * VideoServiceClient videoServiceClient =
 *     VideoServiceClient.create(videoServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * VideoServiceSettings videoServiceSettings =
 *     VideoServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * VideoServiceClient videoServiceClient =
 *     VideoServiceClient.create(videoServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class VideoServiceClient implements BackgroundResource {
  private final VideoServiceSettings settings;
  private final VideoServiceStub stub;

  private static final PathTemplate VIDEO_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/videos/{video}");

  /** Formats a string containing the fully-qualified path to represent a video resource. */
  public static final String formatVideoName(String customer, String video) {
    return VIDEO_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "video", video);
  }

  /** Parses the customer from the given fully-qualified path which represents a video resource. */
  public static final String parseCustomerFromVideoName(String videoName) {
    return VIDEO_PATH_TEMPLATE.parse(videoName).get("customer");
  }

  /** Parses the video from the given fully-qualified path which represents a video resource. */
  public static final String parseVideoFromVideoName(String videoName) {
    return VIDEO_PATH_TEMPLATE.parse(videoName).get("video");
  }

  /** Constructs an instance of VideoServiceClient with default settings. */
  public static final VideoServiceClient create() throws IOException {
    return create(VideoServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of VideoServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final VideoServiceClient create(VideoServiceSettings settings) throws IOException {
    return new VideoServiceClient(settings);
  }

  /**
   * Constructs an instance of VideoServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer to use VideoServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final VideoServiceClient create(VideoServiceStub stub) {
    return new VideoServiceClient(stub);
  }

  /**
   * Constructs an instance of VideoServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected VideoServiceClient(VideoServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((VideoServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected VideoServiceClient(VideoServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final VideoServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public VideoServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested video in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (VideoServiceClient videoServiceClient = VideoServiceClient.create()) {
   *   String formattedResourceName = VideoServiceClient.formatVideoName("[CUSTOMER]", "[VIDEO]");
   *   Video response = videoServiceClient.getVideo(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the video to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Video getVideo(String resourceName) {
    VIDEO_PATH_TEMPLATE.validate(resourceName, "getVideo");
    GetVideoRequest request = GetVideoRequest.newBuilder().setResourceName(resourceName).build();
    return getVideo(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested video in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (VideoServiceClient videoServiceClient = VideoServiceClient.create()) {
   *   String formattedResourceName = VideoServiceClient.formatVideoName("[CUSTOMER]", "[VIDEO]");
   *   GetVideoRequest request = GetVideoRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   Video response = videoServiceClient.getVideo(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Video getVideo(GetVideoRequest request) {
    return getVideoCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested video in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (VideoServiceClient videoServiceClient = VideoServiceClient.create()) {
   *   String formattedResourceName = VideoServiceClient.formatVideoName("[CUSTOMER]", "[VIDEO]");
   *   GetVideoRequest request = GetVideoRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;Video&gt; future = videoServiceClient.getVideoCallable().futureCall(request);
   *   // Do something
   *   Video response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetVideoRequest, Video> getVideoCallable() {
    return stub.getVideoCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
