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

import com.google.ads.googleads.v22.services.stub.ShareablePreviewServiceStub;
import com.google.ads.googleads.v22.services.stub.ShareablePreviewServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to generate Shareable Previews.
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
 * try (ShareablePreviewServiceClient shareablePreviewServiceClient =
 *     ShareablePreviewServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<ShareablePreview> shareablePreviews = new ArrayList<>();
 *   GenerateShareablePreviewsResponse response =
 *       shareablePreviewServiceClient.generateShareablePreviews(customerId, shareablePreviews);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ShareablePreviewServiceClient object to clean up
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
 *      <td><p> GenerateShareablePreviews</td>
 *      <td><p> Returns the requested Shareable Preview.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateShareablePreviews(GenerateShareablePreviewsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> generateShareablePreviews(String customerId, List&lt;ShareablePreview&gt; shareablePreviews)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateShareablePreviewsCallable()
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
 * ShareablePreviewServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ShareablePreviewServiceSettings shareablePreviewServiceSettings =
 *     ShareablePreviewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ShareablePreviewServiceClient shareablePreviewServiceClient =
 *     ShareablePreviewServiceClient.create(shareablePreviewServiceSettings);
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
 * ShareablePreviewServiceSettings shareablePreviewServiceSettings =
 *     ShareablePreviewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ShareablePreviewServiceClient shareablePreviewServiceClient =
 *     ShareablePreviewServiceClient.create(shareablePreviewServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class ShareablePreviewServiceClient implements BackgroundResource {
  private final ShareablePreviewServiceSettings settings;
  private final ShareablePreviewServiceStub stub;

  /** Constructs an instance of ShareablePreviewServiceClient with default settings. */
  public static final ShareablePreviewServiceClient create() throws IOException {
    return create(ShareablePreviewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ShareablePreviewServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ShareablePreviewServiceClient create(ShareablePreviewServiceSettings settings)
      throws IOException {
    return new ShareablePreviewServiceClient(settings);
  }

  /**
   * Constructs an instance of ShareablePreviewServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(ShareablePreviewServiceSettings).
   */
  public static final ShareablePreviewServiceClient create(ShareablePreviewServiceStub stub) {
    return new ShareablePreviewServiceClient(stub);
  }

  /**
   * Constructs an instance of ShareablePreviewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ShareablePreviewServiceClient(ShareablePreviewServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((ShareablePreviewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected ShareablePreviewServiceClient(ShareablePreviewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ShareablePreviewServiceSettings getSettings() {
    return settings;
  }

  public ShareablePreviewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Shareable Preview.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ShareablePreviewServiceClient shareablePreviewServiceClient =
   *     ShareablePreviewServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<ShareablePreview> shareablePreviews = new ArrayList<>();
   *   GenerateShareablePreviewsResponse response =
   *       shareablePreviewServiceClient.generateShareablePreviews(customerId, shareablePreviews);
   * }
   * }</pre>
   *
   * @param customerId Required. The customer creating the shareable previews request.
   * @param shareablePreviews Required. The list of shareable previews to generate.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateShareablePreviewsResponse generateShareablePreviews(
      String customerId, List<ShareablePreview> shareablePreviews) {
    GenerateShareablePreviewsRequest request =
        GenerateShareablePreviewsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllShareablePreviews(shareablePreviews)
            .build();
    return generateShareablePreviews(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Shareable Preview.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ShareablePreviewServiceClient shareablePreviewServiceClient =
   *     ShareablePreviewServiceClient.create()) {
   *   GenerateShareablePreviewsRequest request =
   *       GenerateShareablePreviewsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllShareablePreviews(new ArrayList<ShareablePreview>())
   *           .build();
   *   GenerateShareablePreviewsResponse response =
   *       shareablePreviewServiceClient.generateShareablePreviews(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateShareablePreviewsResponse generateShareablePreviews(
      GenerateShareablePreviewsRequest request) {
    return generateShareablePreviewsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Shareable Preview.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ShareablePreviewServiceClient shareablePreviewServiceClient =
   *     ShareablePreviewServiceClient.create()) {
   *   GenerateShareablePreviewsRequest request =
   *       GenerateShareablePreviewsRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllShareablePreviews(new ArrayList<ShareablePreview>())
   *           .build();
   *   ApiFuture<GenerateShareablePreviewsResponse> future =
   *       shareablePreviewServiceClient.generateShareablePreviewsCallable().futureCall(request);
   *   // Do something.
   *   GenerateShareablePreviewsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateShareablePreviewsRequest, GenerateShareablePreviewsResponse>
      generateShareablePreviewsCallable() {
    return stub.generateShareablePreviewsCallable();
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
