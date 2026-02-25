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
import com.google.ads.googleads.v23.services.stub.YouTubeVideoUploadServiceStub;
import com.google.ads.googleads.v23.services.stub.YouTubeVideoUploadServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage YouTube video uploads.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (YouTubeVideoUploadServiceClient youTubeVideoUploadServiceClient =
 *     YouTubeVideoUploadServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   YouTubeVideoUpload youTubeVideoUpload = YouTubeVideoUpload.newBuilder().build();
 *   CreateYouTubeVideoUploadResponse response =
 *       youTubeVideoUploadServiceClient.createYouTubeVideoUpload(customerId, youTubeVideoUpload);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the YouTubeVideoUploadServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> CreateYouTubeVideoUpload</td>
 *      <td><p> Uploads a video to Google-managed or advertiser owned (brand) YouTube channel.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createYouTubeVideoUpload(CreateYouTubeVideoUploadRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createYouTubeVideoUpload(String customerId, YouTubeVideoUpload youTubeVideoUpload)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createYouTubeVideoUploadCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateYouTubeVideoUpload</td>
 *      <td><p> Updates YouTube video's metadata, but only for videos uploaded using this API.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateYouTubeVideoUpload(UpdateYouTubeVideoUploadRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateYouTubeVideoUpload(String customerId, YouTubeVideoUpload youTubeVideoUpload, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateYouTubeVideoUploadCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> RemoveYouTubeVideoUpload</td>
 *      <td><p> Removes YouTube videos uploaded using this API.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> removeYouTubeVideoUpload(RemoveYouTubeVideoUploadRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> removeYouTubeVideoUpload(String customerId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> removeYouTubeVideoUploadCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * YouTubeVideoUploadServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * YouTubeVideoUploadServiceSettings youTubeVideoUploadServiceSettings =
 *     YouTubeVideoUploadServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * YouTubeVideoUploadServiceClient youTubeVideoUploadServiceClient =
 *     YouTubeVideoUploadServiceClient.create(youTubeVideoUploadServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * YouTubeVideoUploadServiceSettings youTubeVideoUploadServiceSettings =
 *     YouTubeVideoUploadServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * YouTubeVideoUploadServiceClient youTubeVideoUploadServiceClient =
 *     YouTubeVideoUploadServiceClient.create(youTubeVideoUploadServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class YouTubeVideoUploadServiceClient implements BackgroundResource {
  private final YouTubeVideoUploadServiceSettings settings;
  private final YouTubeVideoUploadServiceStub stub;

  /** Constructs an instance of YouTubeVideoUploadServiceClient with default settings. */
  public static final YouTubeVideoUploadServiceClient create() throws IOException {
    return create(YouTubeVideoUploadServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of YouTubeVideoUploadServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final YouTubeVideoUploadServiceClient create(
      YouTubeVideoUploadServiceSettings settings) throws IOException {
    return new YouTubeVideoUploadServiceClient(settings);
  }

  /**
   * Constructs an instance of YouTubeVideoUploadServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(YouTubeVideoUploadServiceSettings).
   */
  public static final YouTubeVideoUploadServiceClient create(YouTubeVideoUploadServiceStub stub) {
    return new YouTubeVideoUploadServiceClient(stub);
  }

  /**
   * Constructs an instance of YouTubeVideoUploadServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected YouTubeVideoUploadServiceClient(YouTubeVideoUploadServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((YouTubeVideoUploadServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected YouTubeVideoUploadServiceClient(YouTubeVideoUploadServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final YouTubeVideoUploadServiceSettings getSettings() {
    return settings;
  }

  public YouTubeVideoUploadServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Uploads a video to Google-managed or advertiser owned (brand) YouTube channel.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (YouTubeVideoUploadServiceClient youTubeVideoUploadServiceClient =
   *     YouTubeVideoUploadServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   YouTubeVideoUpload youTubeVideoUpload = YouTubeVideoUpload.newBuilder().build();
   *   CreateYouTubeVideoUploadResponse response =
   *       youTubeVideoUploadServiceClient.createYouTubeVideoUpload(customerId, youTubeVideoUpload);
   * }
   * }</pre>
   *
   * @param customerId Required. The customer ID requesting the upload. Required.
   * @param youTubeVideoUpload Required. The initial details of the video to upload. Required.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CreateYouTubeVideoUploadResponse createYouTubeVideoUpload(
      String customerId, YouTubeVideoUpload youTubeVideoUpload) {
    CreateYouTubeVideoUploadRequest request =
        CreateYouTubeVideoUploadRequest.newBuilder()
            .setCustomerId(customerId)
            .setYouTubeVideoUpload(youTubeVideoUpload)
            .build();
    return createYouTubeVideoUpload(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Uploads a video to Google-managed or advertiser owned (brand) YouTube channel.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (YouTubeVideoUploadServiceClient youTubeVideoUploadServiceClient =
   *     YouTubeVideoUploadServiceClient.create()) {
   *   CreateYouTubeVideoUploadRequest request =
   *       CreateYouTubeVideoUploadRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setYouTubeVideoUpload(YouTubeVideoUpload.newBuilder().build())
   *           .build();
   *   CreateYouTubeVideoUploadResponse response =
   *       youTubeVideoUploadServiceClient.createYouTubeVideoUpload(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CreateYouTubeVideoUploadResponse createYouTubeVideoUpload(
      CreateYouTubeVideoUploadRequest request) {
    return createYouTubeVideoUploadCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Uploads a video to Google-managed or advertiser owned (brand) YouTube channel.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (YouTubeVideoUploadServiceClient youTubeVideoUploadServiceClient =
   *     YouTubeVideoUploadServiceClient.create()) {
   *   CreateYouTubeVideoUploadRequest request =
   *       CreateYouTubeVideoUploadRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setYouTubeVideoUpload(YouTubeVideoUpload.newBuilder().build())
   *           .build();
   *   ApiFuture<CreateYouTubeVideoUploadResponse> future =
   *       youTubeVideoUploadServiceClient.createYouTubeVideoUploadCallable().futureCall(request);
   *   // Do something.
   *   CreateYouTubeVideoUploadResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateYouTubeVideoUploadRequest, CreateYouTubeVideoUploadResponse>
      createYouTubeVideoUploadCallable() {
    return stub.createYouTubeVideoUploadCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates YouTube video's metadata, but only for videos uploaded using this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (YouTubeVideoUploadServiceClient youTubeVideoUploadServiceClient =
   *     YouTubeVideoUploadServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   YouTubeVideoUpload youTubeVideoUpload = YouTubeVideoUpload.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   UpdateYouTubeVideoUploadResponse response =
   *       youTubeVideoUploadServiceClient.updateYouTubeVideoUpload(
   *           customerId, youTubeVideoUpload, updateMask);
   * }
   * }</pre>
   *
   * @param customerId Required. The customer ID requesting the YouTube video upload update.
   *     Required.
   * @param youTubeVideoUpload Required. The YouTube video upload resource to be updated. It's
   *     expected to have a valid resource name. Required.
   * @param updateMask Required. FieldMask that determines which resource fields are modified in an
   *     update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UpdateYouTubeVideoUploadResponse updateYouTubeVideoUpload(
      String customerId, YouTubeVideoUpload youTubeVideoUpload, FieldMask updateMask) {
    UpdateYouTubeVideoUploadRequest request =
        UpdateYouTubeVideoUploadRequest.newBuilder()
            .setCustomerId(customerId)
            .setYouTubeVideoUpload(youTubeVideoUpload)
            .setUpdateMask(updateMask)
            .build();
    return updateYouTubeVideoUpload(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates YouTube video's metadata, but only for videos uploaded using this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (YouTubeVideoUploadServiceClient youTubeVideoUploadServiceClient =
   *     YouTubeVideoUploadServiceClient.create()) {
   *   UpdateYouTubeVideoUploadRequest request =
   *       UpdateYouTubeVideoUploadRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setYouTubeVideoUpload(YouTubeVideoUpload.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   UpdateYouTubeVideoUploadResponse response =
   *       youTubeVideoUploadServiceClient.updateYouTubeVideoUpload(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UpdateYouTubeVideoUploadResponse updateYouTubeVideoUpload(
      UpdateYouTubeVideoUploadRequest request) {
    return updateYouTubeVideoUploadCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates YouTube video's metadata, but only for videos uploaded using this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (YouTubeVideoUploadServiceClient youTubeVideoUploadServiceClient =
   *     YouTubeVideoUploadServiceClient.create()) {
   *   UpdateYouTubeVideoUploadRequest request =
   *       UpdateYouTubeVideoUploadRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .setYouTubeVideoUpload(YouTubeVideoUpload.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<UpdateYouTubeVideoUploadResponse> future =
   *       youTubeVideoUploadServiceClient.updateYouTubeVideoUploadCallable().futureCall(request);
   *   // Do something.
   *   UpdateYouTubeVideoUploadResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateYouTubeVideoUploadRequest, UpdateYouTubeVideoUploadResponse>
      updateYouTubeVideoUploadCallable() {
    return stub.updateYouTubeVideoUploadCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Removes YouTube videos uploaded using this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (YouTubeVideoUploadServiceClient youTubeVideoUploadServiceClient =
   *     YouTubeVideoUploadServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   RemoveYouTubeVideoUploadResponse response =
   *       youTubeVideoUploadServiceClient.removeYouTubeVideoUpload(customerId);
   * }
   * }</pre>
   *
   * @param customerId Required. The customer ID requesting the YouTube video upload deletion.
   *     Required.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemoveYouTubeVideoUploadResponse removeYouTubeVideoUpload(String customerId) {
    RemoveYouTubeVideoUploadRequest request =
        RemoveYouTubeVideoUploadRequest.newBuilder().setCustomerId(customerId).build();
    return removeYouTubeVideoUpload(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Removes YouTube videos uploaded using this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (YouTubeVideoUploadServiceClient youTubeVideoUploadServiceClient =
   *     YouTubeVideoUploadServiceClient.create()) {
   *   RemoveYouTubeVideoUploadRequest request =
   *       RemoveYouTubeVideoUploadRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllResourceNames(new ArrayList<String>())
   *           .build();
   *   RemoveYouTubeVideoUploadResponse response =
   *       youTubeVideoUploadServiceClient.removeYouTubeVideoUpload(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RemoveYouTubeVideoUploadResponse removeYouTubeVideoUpload(
      RemoveYouTubeVideoUploadRequest request) {
    return removeYouTubeVideoUploadCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Removes YouTube videos uploaded using this API.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (YouTubeVideoUploadServiceClient youTubeVideoUploadServiceClient =
   *     YouTubeVideoUploadServiceClient.create()) {
   *   RemoveYouTubeVideoUploadRequest request =
   *       RemoveYouTubeVideoUploadRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllResourceNames(new ArrayList<String>())
   *           .build();
   *   ApiFuture<RemoveYouTubeVideoUploadResponse> future =
   *       youTubeVideoUploadServiceClient.removeYouTubeVideoUploadCallable().futureCall(request);
   *   // Do something.
   *   RemoveYouTubeVideoUploadResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<RemoveYouTubeVideoUploadRequest, RemoveYouTubeVideoUploadResponse>
      removeYouTubeVideoUploadCallable() {
    return stub.removeYouTubeVideoUploadCallable();
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
