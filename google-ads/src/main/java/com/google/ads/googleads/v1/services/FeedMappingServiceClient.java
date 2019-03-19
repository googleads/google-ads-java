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

import com.google.ads.googleads.v1.resources.FeedMapping;
import com.google.ads.googleads.v1.services.stub.FeedMappingServiceStub;
import com.google.ads.googleads.v1.services.stub.FeedMappingServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage feed mappings.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (FeedMappingServiceClient feedMappingServiceClient = FeedMappingServiceClient.create()) {
 *   String formattedResourceName = FeedMappingServiceClient.formatFeedMappingName("[CUSTOMER]", "[FEED_MAPPING]");
 *   FeedMapping response = feedMappingServiceClient.getFeedMapping(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the feedMappingServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
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
 * <p>This class can be customized by passing in a custom instance of FeedMappingServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * FeedMappingServiceSettings feedMappingServiceSettings =
 *     FeedMappingServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * FeedMappingServiceClient feedMappingServiceClient =
 *     FeedMappingServiceClient.create(feedMappingServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * FeedMappingServiceSettings feedMappingServiceSettings =
 *     FeedMappingServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * FeedMappingServiceClient feedMappingServiceClient =
 *     FeedMappingServiceClient.create(feedMappingServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class FeedMappingServiceClient implements BackgroundResource {
  private final FeedMappingServiceSettings settings;
  private final FeedMappingServiceStub stub;

  private static final PathTemplate FEED_MAPPING_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/feedMappings/{feed_mapping}");

  /** Formats a string containing the fully-qualified path to represent a feed_mapping resource. */
  public static final String formatFeedMappingName(String customer, String feedMapping) {
    return FEED_MAPPING_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "feed_mapping", feedMapping);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a feed_mapping
   * resource.
   */
  public static final String parseCustomerFromFeedMappingName(String feedMappingName) {
    return FEED_MAPPING_PATH_TEMPLATE.parse(feedMappingName).get("customer");
  }

  /**
   * Parses the feed_mapping from the given fully-qualified path which represents a feed_mapping
   * resource.
   */
  public static final String parseFeedMappingFromFeedMappingName(String feedMappingName) {
    return FEED_MAPPING_PATH_TEMPLATE.parse(feedMappingName).get("feed_mapping");
  }

  /** Constructs an instance of FeedMappingServiceClient with default settings. */
  public static final FeedMappingServiceClient create() throws IOException {
    return create(FeedMappingServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of FeedMappingServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final FeedMappingServiceClient create(FeedMappingServiceSettings settings)
      throws IOException {
    return new FeedMappingServiceClient(settings);
  }

  /**
   * Constructs an instance of FeedMappingServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer to use FeedMappingServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final FeedMappingServiceClient create(FeedMappingServiceStub stub) {
    return new FeedMappingServiceClient(stub);
  }

  /**
   * Constructs an instance of FeedMappingServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected FeedMappingServiceClient(FeedMappingServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((FeedMappingServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected FeedMappingServiceClient(FeedMappingServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final FeedMappingServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public FeedMappingServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed mapping in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedMappingServiceClient feedMappingServiceClient = FeedMappingServiceClient.create()) {
   *   String formattedResourceName = FeedMappingServiceClient.formatFeedMappingName("[CUSTOMER]", "[FEED_MAPPING]");
   *   FeedMapping response = feedMappingServiceClient.getFeedMapping(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the feed mapping to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeedMapping getFeedMapping(String resourceName) {
    FEED_MAPPING_PATH_TEMPLATE.validate(resourceName, "getFeedMapping");
    GetFeedMappingRequest request =
        GetFeedMappingRequest.newBuilder().setResourceName(resourceName).build();
    return getFeedMapping(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed mapping in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedMappingServiceClient feedMappingServiceClient = FeedMappingServiceClient.create()) {
   *   String formattedResourceName = FeedMappingServiceClient.formatFeedMappingName("[CUSTOMER]", "[FEED_MAPPING]");
   *   GetFeedMappingRequest request = GetFeedMappingRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   FeedMapping response = feedMappingServiceClient.getFeedMapping(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FeedMapping getFeedMapping(GetFeedMappingRequest request) {
    return getFeedMappingCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested feed mapping in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedMappingServiceClient feedMappingServiceClient = FeedMappingServiceClient.create()) {
   *   String formattedResourceName = FeedMappingServiceClient.formatFeedMappingName("[CUSTOMER]", "[FEED_MAPPING]");
   *   GetFeedMappingRequest request = GetFeedMappingRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;FeedMapping&gt; future = feedMappingServiceClient.getFeedMappingCallable().futureCall(request);
   *   // Do something
   *   FeedMapping response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetFeedMappingRequest, FeedMapping> getFeedMappingCallable() {
    return stub.getFeedMappingCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes feed mappings. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedMappingServiceClient feedMappingServiceClient = FeedMappingServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedMappingOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateFeedMappingsResponse response = feedMappingServiceClient.mutateFeedMappings(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose feed mappings are being modified.
   * @param operations The list of operations to perform on individual feed mappings.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedMappingsResponse mutateFeedMappings(
      String customerId,
      List<FeedMappingOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateFeedMappingsRequest request =
        MutateFeedMappingsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateFeedMappings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes feed mappings. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedMappingServiceClient feedMappingServiceClient = FeedMappingServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedMappingOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateFeedMappingsResponse response = feedMappingServiceClient.mutateFeedMappings(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose feed mappings are being modified.
   * @param operations The list of operations to perform on individual feed mappings.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedMappingsResponse mutateFeedMappings(
      String customerId, List<FeedMappingOperation> operations) {

    MutateFeedMappingsRequest request =
        MutateFeedMappingsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateFeedMappings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes feed mappings. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedMappingServiceClient feedMappingServiceClient = FeedMappingServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedMappingOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateFeedMappingsRequest request = MutateFeedMappingsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateFeedMappingsResponse response = feedMappingServiceClient.mutateFeedMappings(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateFeedMappingsResponse mutateFeedMappings(MutateFeedMappingsRequest request) {
    return mutateFeedMappingsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates or removes feed mappings. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (FeedMappingServiceClient feedMappingServiceClient = FeedMappingServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;FeedMappingOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateFeedMappingsRequest request = MutateFeedMappingsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateFeedMappingsResponse&gt; future = feedMappingServiceClient.mutateFeedMappingsCallable().futureCall(request);
   *   // Do something
   *   MutateFeedMappingsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateFeedMappingsRequest, MutateFeedMappingsResponse>
      mutateFeedMappingsCallable() {
    return stub.mutateFeedMappingsCallable();
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
