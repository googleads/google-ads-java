/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.resources.ExtensionFeedItem;
import com.google.ads.googleads.v6.resources.ExtensionFeedItemName;
import com.google.ads.googleads.v6.services.stub.ExtensionFeedItemServiceStub;
import com.google.ads.googleads.v6.services.stub.ExtensionFeedItemServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage extension feed items.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the ExtensionFeedItemServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
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
 * <pre>{@code
 * ExtensionFeedItemServiceSettings extensionFeedItemServiceSettings =
 *     ExtensionFeedItemServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ExtensionFeedItemServiceClient extensionFeedItemServiceClient =
 *     ExtensionFeedItemServiceClient.create(extensionFeedItemServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * ExtensionFeedItemServiceSettings extensionFeedItemServiceSettings =
 *     ExtensionFeedItemServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ExtensionFeedItemServiceClient extensionFeedItemServiceClient =
 *     ExtensionFeedItemServiceClient.create(extensionFeedItemServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator")
public class ExtensionFeedItemServiceClient implements BackgroundResource {
  private final ExtensionFeedItemServiceSettings settings;
  private final ExtensionFeedItemServiceStub stub;

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
   * calls. This is for advanced usage - prefer using create(ExtensionFeedItemServiceSettings).
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested extension feed item in full detail.
   *
   * @param resource_name Required. The resource name of the extension feed item to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ExtensionFeedItem getExtensionFeedItem(ExtensionFeedItemName resourceName) {
    GetExtensionFeedItemRequest request =
        GetExtensionFeedItemRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getExtensionFeedItem(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested extension feed item in full detail.
   *
   * @param resource_name Required. The resource name of the extension feed item to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ExtensionFeedItem getExtensionFeedItem(String resourceName) {
    GetExtensionFeedItemRequest request =
        GetExtensionFeedItemRequest.newBuilder().setResourceName(resourceName).build();
    return getExtensionFeedItem(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested extension feed item in full detail.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ExtensionFeedItem getExtensionFeedItem(GetExtensionFeedItemRequest request) {
    return getExtensionFeedItemCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested extension feed item in full detail.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetExtensionFeedItemRequest, ExtensionFeedItem>
      getExtensionFeedItemCallable() {
    return stub.getExtensionFeedItemCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes extension feed items. Operation statuses are returned.
   *
   * @param customer_id Required. The ID of the customer whose extension feed items are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual extension feed
   *     items.
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

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes extension feed items. Operation statuses are returned.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateExtensionFeedItemsResponse mutateExtensionFeedItems(
      MutateExtensionFeedItemsRequest request) {
    return mutateExtensionFeedItemsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes extension feed items. Operation statuses are returned.
   *
   * <p>Sample code:
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
