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

import com.google.ads.googleads.v1.resources.ExtensionFeedItem;
import com.google.ads.googleads.v1.services.stub.ExtensionFeedItemServiceStub;
import com.google.ads.googleads.v1.services.stub.ExtensionFeedItemServiceStubSettings;
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
 * Service Description: Service to manage extension feed items.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient = ExtensionFeedItemServiceClient.create()) {
 *   String formattedResourceName = ExtensionFeedItemServiceClient.formatExtensionFeedItemName("[CUSTOMER]", "[EXTENSION_FEED_ITEM]");
 *   ExtensionFeedItem response = extensionFeedItemServiceClient.getExtensionFeedItem(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the extensionFeedItemServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
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
 * <p>This class can be customized by passing in a custom instance of
 * ExtensionFeedItemServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * ExtensionFeedItemServiceSettings extensionFeedItemServiceSettings =
 *     ExtensionFeedItemServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ExtensionFeedItemServiceClient extensionFeedItemServiceClient =
 *     ExtensionFeedItemServiceClient.create(extensionFeedItemServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ExtensionFeedItemServiceSettings extensionFeedItemServiceSettings =
 *     ExtensionFeedItemServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ExtensionFeedItemServiceClient extensionFeedItemServiceClient =
 *     ExtensionFeedItemServiceClient.create(extensionFeedItemServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class ExtensionFeedItemServiceClient implements BackgroundResource {
  private final ExtensionFeedItemServiceSettings settings;
  private final ExtensionFeedItemServiceStub stub;

  private static final PathTemplate EXTENSION_FEED_ITEM_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/extensionFeedItems/{extension_feed_item}");

  /**
   * Formats a string containing the fully-qualified path to represent a extension_feed_item
   * resource.
   *
   * @deprecated Use the {@link ExtensionFeedItemName} class instead.
   */
  @Deprecated
  public static final String formatExtensionFeedItemName(
      String customer, String extensionFeedItem) {
    return EXTENSION_FEED_ITEM_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "extension_feed_item", extensionFeedItem);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a extension_feed_item
   * resource.
   *
   * @deprecated Use the {@link ExtensionFeedItemName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromExtensionFeedItemName(String extensionFeedItemName) {
    return EXTENSION_FEED_ITEM_PATH_TEMPLATE.parse(extensionFeedItemName).get("customer");
  }

  /**
   * Parses the extension_feed_item from the given fully-qualified path which represents a
   * extension_feed_item resource.
   *
   * @deprecated Use the {@link ExtensionFeedItemName} class instead.
   */
  @Deprecated
  public static final String parseExtensionFeedItemFromExtensionFeedItemName(
      String extensionFeedItemName) {
    return EXTENSION_FEED_ITEM_PATH_TEMPLATE
        .parse(extensionFeedItemName)
        .get("extension_feed_item");
  }

  /** Constructs an instance of ExtensionFeedItemServiceClient with default settings. */
  public static final ExtensionFeedItemServiceClient create() throws IOException {
    return create(ExtensionFeedItemServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ExtensionFeedItemServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final ExtensionFeedItemServiceClient create(
      ExtensionFeedItemServiceSettings settings) throws IOException {
    return new ExtensionFeedItemServiceClient(settings);
  }

  /**
   * Constructs an instance of ExtensionFeedItemServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use ExtensionFeedItemServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ExtensionFeedItemServiceClient create(ExtensionFeedItemServiceStub stub) {
    return new ExtensionFeedItemServiceClient(stub);
  }

  /**
   * Constructs an instance of ExtensionFeedItemServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ExtensionFeedItemServiceClient(ExtensionFeedItemServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((ExtensionFeedItemServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ExtensionFeedItemServiceClient(ExtensionFeedItemServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ExtensionFeedItemServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ExtensionFeedItemServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested extension feed item in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient = ExtensionFeedItemServiceClient.create()) {
   *   String formattedResourceName = ExtensionFeedItemServiceClient.formatExtensionFeedItemName("[CUSTOMER]", "[EXTENSION_FEED_ITEM]");
   *   ExtensionFeedItem response = extensionFeedItemServiceClient.getExtensionFeedItem(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the extension feed item to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ExtensionFeedItem getExtensionFeedItem(String resourceName) {
    EXTENSION_FEED_ITEM_PATH_TEMPLATE.validate(resourceName, "getExtensionFeedItem");
    GetExtensionFeedItemRequest request =
        GetExtensionFeedItemRequest.newBuilder().setResourceName(resourceName).build();
    return getExtensionFeedItem(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested extension feed item in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient = ExtensionFeedItemServiceClient.create()) {
   *   String formattedResourceName = ExtensionFeedItemServiceClient.formatExtensionFeedItemName("[CUSTOMER]", "[EXTENSION_FEED_ITEM]");
   *   GetExtensionFeedItemRequest request = GetExtensionFeedItemRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ExtensionFeedItem response = extensionFeedItemServiceClient.getExtensionFeedItem(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ExtensionFeedItem getExtensionFeedItem(GetExtensionFeedItemRequest request) {
    return getExtensionFeedItemCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested extension feed item in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient = ExtensionFeedItemServiceClient.create()) {
   *   String formattedResourceName = ExtensionFeedItemServiceClient.formatExtensionFeedItemName("[CUSTOMER]", "[EXTENSION_FEED_ITEM]");
   *   GetExtensionFeedItemRequest request = GetExtensionFeedItemRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;ExtensionFeedItem&gt; future = extensionFeedItemServiceClient.getExtensionFeedItemCallable().futureCall(request);
   *   // Do something
   *   ExtensionFeedItem response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetExtensionFeedItemRequest, ExtensionFeedItem>
      getExtensionFeedItemCallable() {
    return stub.getExtensionFeedItemCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes extension feed items. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient = ExtensionFeedItemServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;ExtensionFeedItemOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean validateOnly = false;
   *   MutateExtensionFeedItemsResponse response = extensionFeedItemServiceClient.mutateExtensionFeedItems(customerId, operations, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose extension feed items are being modified.
   * @param operations The list of operations to perform on individual extension feed items.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateExtensionFeedItemsResponse mutateExtensionFeedItems(
      String customerId, List<ExtensionFeedItemOperation> operations, boolean validateOnly) {

    MutateExtensionFeedItemsRequest request =
        MutateExtensionFeedItemsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setValidateOnly(validateOnly)
            .build();
    return mutateExtensionFeedItems(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes extension feed items. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient = ExtensionFeedItemServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;ExtensionFeedItemOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateExtensionFeedItemsResponse response = extensionFeedItemServiceClient.mutateExtensionFeedItems(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose extension feed items are being modified.
   * @param operations The list of operations to perform on individual extension feed items.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateExtensionFeedItemsResponse mutateExtensionFeedItems(
      String customerId, List<ExtensionFeedItemOperation> operations) {

    MutateExtensionFeedItemsRequest request =
        MutateExtensionFeedItemsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateExtensionFeedItems(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes extension feed items. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient = ExtensionFeedItemServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;ExtensionFeedItemOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateExtensionFeedItemsRequest request = MutateExtensionFeedItemsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateExtensionFeedItemsResponse response = extensionFeedItemServiceClient.mutateExtensionFeedItems(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateExtensionFeedItemsResponse mutateExtensionFeedItems(
      MutateExtensionFeedItemsRequest request) {
    return mutateExtensionFeedItemsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes extension feed items. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient = ExtensionFeedItemServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;ExtensionFeedItemOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateExtensionFeedItemsRequest request = MutateExtensionFeedItemsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateExtensionFeedItemsResponse&gt; future = extensionFeedItemServiceClient.mutateExtensionFeedItemsCallable().futureCall(request);
   *   // Do something
   *   MutateExtensionFeedItemsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateExtensionFeedItemsRequest, MutateExtensionFeedItemsResponse>
      mutateExtensionFeedItemsCallable() {
    return stub.mutateExtensionFeedItemsCallable();
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
