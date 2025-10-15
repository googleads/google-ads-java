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

import com.google.ads.googleads.v22.services.stub.AssetGenerationServiceStub;
import com.google.ads.googleads.v22.services.stub.AssetGenerationServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service for generating new assets with generative AI.
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
 * try (AssetGenerationServiceClient assetGenerationServiceClient =
 *     AssetGenerationServiceClient.create()) {
 *   GenerateTextRequest request =
 *       GenerateTextRequest.newBuilder()
 *           .setCustomerId("customerId-1581184615")
 *           .addAllAssetFieldTypes(new ArrayList<AssetFieldTypeEnum.AssetFieldType>())
 *           .setFinalUrl("finalUrl-681275367")
 *           .setFreeformPrompt("freeformPrompt-230510924")
 *           .addAllKeywords(new ArrayList<String>())
 *           .build();
 *   GenerateTextResponse response = assetGenerationServiceClient.generateText(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AssetGenerationServiceClient object to clean up
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
 *      <td><p> GenerateText</td>
 *      <td><p> Uses generative AI to generate text that can be used as assets in a campaign.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [AssetGenerationError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateText(GenerateTextRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateTextCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateImages</td>
 *      <td><p> Uses generative AI to generate images that can be used as assets in a campaign.
 * <p>  List of thrown errors:   [AuthenticationError]()   [AuthorizationError]()   [AssetGenerationError]()   [HeaderError]()   [InternalError]()   [QuotaError]()   [RequestError]()</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateImages(GenerateImagesRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateImagesCallable()
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
 * <p>This class can be customized by passing in a custom instance of AssetGenerationServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AssetGenerationServiceSettings assetGenerationServiceSettings =
 *     AssetGenerationServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AssetGenerationServiceClient assetGenerationServiceClient =
 *     AssetGenerationServiceClient.create(assetGenerationServiceSettings);
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
 * AssetGenerationServiceSettings assetGenerationServiceSettings =
 *     AssetGenerationServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AssetGenerationServiceClient assetGenerationServiceClient =
 *     AssetGenerationServiceClient.create(assetGenerationServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AssetGenerationServiceClient implements BackgroundResource {
  private final AssetGenerationServiceSettings settings;
  private final AssetGenerationServiceStub stub;

  /** Constructs an instance of AssetGenerationServiceClient with default settings. */
  public static final AssetGenerationServiceClient create() throws IOException {
    return create(AssetGenerationServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AssetGenerationServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AssetGenerationServiceClient create(AssetGenerationServiceSettings settings)
      throws IOException {
    return new AssetGenerationServiceClient(settings);
  }

  /**
   * Constructs an instance of AssetGenerationServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(AssetGenerationServiceSettings).
   */
  public static final AssetGenerationServiceClient create(AssetGenerationServiceStub stub) {
    return new AssetGenerationServiceClient(stub);
  }

  /**
   * Constructs an instance of AssetGenerationServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AssetGenerationServiceClient(AssetGenerationServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((AssetGenerationServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected AssetGenerationServiceClient(AssetGenerationServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AssetGenerationServiceSettings getSettings() {
    return settings;
  }

  public AssetGenerationServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Uses generative AI to generate text that can be used as assets in a campaign.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [AssetGenerationError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetGenerationServiceClient assetGenerationServiceClient =
   *     AssetGenerationServiceClient.create()) {
   *   GenerateTextRequest request =
   *       GenerateTextRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllAssetFieldTypes(new ArrayList<AssetFieldTypeEnum.AssetFieldType>())
   *           .setFinalUrl("finalUrl-681275367")
   *           .setFreeformPrompt("freeformPrompt-230510924")
   *           .addAllKeywords(new ArrayList<String>())
   *           .build();
   *   GenerateTextResponse response = assetGenerationServiceClient.generateText(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateTextResponse generateText(GenerateTextRequest request) {
    return generateTextCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Uses generative AI to generate text that can be used as assets in a campaign.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [AssetGenerationError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetGenerationServiceClient assetGenerationServiceClient =
   *     AssetGenerationServiceClient.create()) {
   *   GenerateTextRequest request =
   *       GenerateTextRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllAssetFieldTypes(new ArrayList<AssetFieldTypeEnum.AssetFieldType>())
   *           .setFinalUrl("finalUrl-681275367")
   *           .setFreeformPrompt("freeformPrompt-230510924")
   *           .addAllKeywords(new ArrayList<String>())
   *           .build();
   *   ApiFuture<GenerateTextResponse> future =
   *       assetGenerationServiceClient.generateTextCallable().futureCall(request);
   *   // Do something.
   *   GenerateTextResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateTextRequest, GenerateTextResponse> generateTextCallable() {
    return stub.generateTextCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Uses generative AI to generate images that can be used as assets in a campaign.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [AssetGenerationError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetGenerationServiceClient assetGenerationServiceClient =
   *     AssetGenerationServiceClient.create()) {
   *   GenerateImagesRequest request =
   *       GenerateImagesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllAssetFieldTypes(new ArrayList<AssetFieldTypeEnum.AssetFieldType>())
   *           .build();
   *   GenerateImagesResponse response = assetGenerationServiceClient.generateImages(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateImagesResponse generateImages(GenerateImagesRequest request) {
    return generateImagesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Uses generative AI to generate images that can be used as assets in a campaign.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]()
   * [AssetGenerationError]() [HeaderError]() [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetGenerationServiceClient assetGenerationServiceClient =
   *     AssetGenerationServiceClient.create()) {
   *   GenerateImagesRequest request =
   *       GenerateImagesRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllAssetFieldTypes(new ArrayList<AssetFieldTypeEnum.AssetFieldType>())
   *           .build();
   *   ApiFuture<GenerateImagesResponse> future =
   *       assetGenerationServiceClient.generateImagesCallable().futureCall(request);
   *   // Do something.
   *   GenerateImagesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateImagesRequest, GenerateImagesResponse>
      generateImagesCallable() {
    return stub.generateImagesCallable();
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
