/*
 * Copyright 2020 Google LLC
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
package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.resources.KeywordPlanAdGroup;
import com.google.ads.googleads.v6.services.stub.KeywordPlanAdGroupServiceStub;
import com.google.ads.googleads.v6.services.stub.KeywordPlanAdGroupServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage Keyword Plan ad groups.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (KeywordPlanAdGroupServiceClient keywordPlanAdGroupServiceClient = KeywordPlanAdGroupServiceClient.create()) {
 *   KeywordPlanAdGroupName resourceName = KeywordPlanAdGroupName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_ID]");
 *   KeywordPlanAdGroup response = keywordPlanAdGroupServiceClient.getKeywordPlanAdGroup(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the keywordPlanAdGroupServiceClient object to clean up
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
 * KeywordPlanAdGroupServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * KeywordPlanAdGroupServiceSettings keywordPlanAdGroupServiceSettings =
 *     KeywordPlanAdGroupServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordPlanAdGroupServiceClient keywordPlanAdGroupServiceClient =
 *     KeywordPlanAdGroupServiceClient.create(keywordPlanAdGroupServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * KeywordPlanAdGroupServiceSettings keywordPlanAdGroupServiceSettings =
 *     KeywordPlanAdGroupServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordPlanAdGroupServiceClient keywordPlanAdGroupServiceClient =
 *     KeywordPlanAdGroupServiceClient.create(keywordPlanAdGroupServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class KeywordPlanAdGroupServiceClient implements BackgroundResource {
  private final KeywordPlanAdGroupServiceSettings settings;
  private final KeywordPlanAdGroupServiceStub stub;

  /** Constructs an instance of KeywordPlanAdGroupServiceClient with default settings. */
  public static final KeywordPlanAdGroupServiceClient create() throws IOException {
    return create(KeywordPlanAdGroupServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of KeywordPlanAdGroupServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final KeywordPlanAdGroupServiceClient create(
      KeywordPlanAdGroupServiceSettings settings) throws IOException {
    return new KeywordPlanAdGroupServiceClient(settings);
  }

  /**
   * Constructs an instance of KeywordPlanAdGroupServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use KeywordPlanAdGroupServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final KeywordPlanAdGroupServiceClient create(KeywordPlanAdGroupServiceStub stub) {
    return new KeywordPlanAdGroupServiceClient(stub);
  }

  /**
   * Constructs an instance of KeywordPlanAdGroupServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected KeywordPlanAdGroupServiceClient(KeywordPlanAdGroupServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((KeywordPlanAdGroupServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected KeywordPlanAdGroupServiceClient(KeywordPlanAdGroupServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordPlanAdGroupServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public KeywordPlanAdGroupServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan ad group in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanAdGroupServiceClient keywordPlanAdGroupServiceClient = KeywordPlanAdGroupServiceClient.create()) {
   *   KeywordPlanAdGroupName resourceName = KeywordPlanAdGroupName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_ID]");
   *   KeywordPlanAdGroup response = keywordPlanAdGroupServiceClient.getKeywordPlanAdGroup(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the Keyword Plan ad group to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlanAdGroup getKeywordPlanAdGroup(KeywordPlanAdGroupName resourceName) {
    GetKeywordPlanAdGroupRequest request =
        GetKeywordPlanAdGroupRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getKeywordPlanAdGroup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan ad group in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanAdGroupServiceClient keywordPlanAdGroupServiceClient = KeywordPlanAdGroupServiceClient.create()) {
   *   KeywordPlanAdGroupName resourceName = KeywordPlanAdGroupName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_ID]");
   *   KeywordPlanAdGroup response = keywordPlanAdGroupServiceClient.getKeywordPlanAdGroup(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the Keyword Plan ad group to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlanAdGroup getKeywordPlanAdGroup(String resourceName) {
    GetKeywordPlanAdGroupRequest request =
        GetKeywordPlanAdGroupRequest.newBuilder().setResourceName(resourceName).build();
    return getKeywordPlanAdGroup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan ad group in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanAdGroupServiceClient keywordPlanAdGroupServiceClient = KeywordPlanAdGroupServiceClient.create()) {
   *   KeywordPlanAdGroupName resourceName = KeywordPlanAdGroupName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_ID]");
   *   GetKeywordPlanAdGroupRequest request = GetKeywordPlanAdGroupRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   KeywordPlanAdGroup response = keywordPlanAdGroupServiceClient.getKeywordPlanAdGroup(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlanAdGroup getKeywordPlanAdGroup(GetKeywordPlanAdGroupRequest request) {
    return getKeywordPlanAdGroupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan ad group in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanAdGroupServiceClient keywordPlanAdGroupServiceClient = KeywordPlanAdGroupServiceClient.create()) {
   *   KeywordPlanAdGroupName resourceName = KeywordPlanAdGroupName.of("[CUSTOMER_ID]", "[KEYWORD_PLAN_AD_GROUP_ID]");
   *   GetKeywordPlanAdGroupRequest request = GetKeywordPlanAdGroupRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;KeywordPlanAdGroup&gt; future = keywordPlanAdGroupServiceClient.getKeywordPlanAdGroupCallable().futureCall(request);
   *   // Do something
   *   KeywordPlanAdGroup response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetKeywordPlanAdGroupRequest, KeywordPlanAdGroup>
      getKeywordPlanAdGroupCallable() {
    return stub.getKeywordPlanAdGroupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan ad groups. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanAdGroupServiceClient keywordPlanAdGroupServiceClient = KeywordPlanAdGroupServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanAdGroupOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlanAdGroupsResponse response = keywordPlanAdGroupServiceClient.mutateKeywordPlanAdGroups(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose Keyword Plan ad groups are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual Keyword Plan ad
   *     groups.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanAdGroupsResponse mutateKeywordPlanAdGroups(
      String customerId, List<KeywordPlanAdGroupOperation> operations) {
    MutateKeywordPlanAdGroupsRequest request =
        MutateKeywordPlanAdGroupsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateKeywordPlanAdGroups(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan ad groups. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanAdGroupServiceClient keywordPlanAdGroupServiceClient = KeywordPlanAdGroupServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanAdGroupOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlanAdGroupsRequest request = MutateKeywordPlanAdGroupsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateKeywordPlanAdGroupsResponse response = keywordPlanAdGroupServiceClient.mutateKeywordPlanAdGroups(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanAdGroupsResponse mutateKeywordPlanAdGroups(
      MutateKeywordPlanAdGroupsRequest request) {
    return mutateKeywordPlanAdGroupsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan ad groups. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanAdGroupServiceClient keywordPlanAdGroupServiceClient = KeywordPlanAdGroupServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanAdGroupOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlanAdGroupsRequest request = MutateKeywordPlanAdGroupsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateKeywordPlanAdGroupsResponse&gt; future = keywordPlanAdGroupServiceClient.mutateKeywordPlanAdGroupsCallable().futureCall(request);
   *   // Do something
   *   MutateKeywordPlanAdGroupsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateKeywordPlanAdGroupsRequest, MutateKeywordPlanAdGroupsResponse>
      mutateKeywordPlanAdGroupsCallable() {
    return stub.mutateKeywordPlanAdGroupsCallable();
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
