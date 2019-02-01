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
package com.google.ads.googleads.v0.services;

import com.google.ads.googleads.v0.resources.KeywordPlanNegativeKeyword;
import com.google.ads.googleads.v0.services.stub.KeywordPlanNegativeKeywordServiceStub;
import com.google.ads.googleads.v0.services.stub.KeywordPlanNegativeKeywordServiceStubSettings;
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
 * Service Description: Service to manage Keyword Plan negative keywords.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (KeywordPlanNegativeKeywordServiceClient keywordPlanNegativeKeywordServiceClient = KeywordPlanNegativeKeywordServiceClient.create()) {
 *   String formattedResourceName = KeywordPlanNegativeKeywordServiceClient.formatKeywordPlanNegativeKeywordName("[CUSTOMER]", "[KEYWORD_PLAN_NEGATIVE_KEYWORD]");
 *   KeywordPlanNegativeKeyword response = keywordPlanNegativeKeywordServiceClient.getKeywordPlanNegativeKeyword(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the keywordPlanNegativeKeywordServiceClient object to
 * clean up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
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
 * KeywordPlanNegativeKeywordServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * KeywordPlanNegativeKeywordServiceSettings keywordPlanNegativeKeywordServiceSettings =
 *     KeywordPlanNegativeKeywordServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordPlanNegativeKeywordServiceClient keywordPlanNegativeKeywordServiceClient =
 *     KeywordPlanNegativeKeywordServiceClient.create(keywordPlanNegativeKeywordServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * KeywordPlanNegativeKeywordServiceSettings keywordPlanNegativeKeywordServiceSettings =
 *     KeywordPlanNegativeKeywordServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordPlanNegativeKeywordServiceClient keywordPlanNegativeKeywordServiceClient =
 *     KeywordPlanNegativeKeywordServiceClient.create(keywordPlanNegativeKeywordServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class KeywordPlanNegativeKeywordServiceClient implements BackgroundResource {
  private final KeywordPlanNegativeKeywordServiceSettings settings;
  private final KeywordPlanNegativeKeywordServiceStub stub;

  private static final PathTemplate KEYWORD_PLAN_NEGATIVE_KEYWORD_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/keywordPlanNegativeKeywords/{keyword_plan_negative_keyword}");

  /**
   * Formats a string containing the fully-qualified path to represent a
   * keyword_plan_negative_keyword resource.
   */
  public static final String formatKeywordPlanNegativeKeywordName(
      String customer, String keywordPlanNegativeKeyword) {
    return KEYWORD_PLAN_NEGATIVE_KEYWORD_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "keyword_plan_negative_keyword", keywordPlanNegativeKeyword);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a
   * keyword_plan_negative_keyword resource.
   */
  public static final String parseCustomerFromKeywordPlanNegativeKeywordName(
      String keywordPlanNegativeKeywordName) {
    return KEYWORD_PLAN_NEGATIVE_KEYWORD_PATH_TEMPLATE
        .parse(keywordPlanNegativeKeywordName)
        .get("customer");
  }

  /**
   * Parses the keyword_plan_negative_keyword from the given fully-qualified path which represents a
   * keyword_plan_negative_keyword resource.
   */
  public static final String parseKeywordPlanNegativeKeywordFromKeywordPlanNegativeKeywordName(
      String keywordPlanNegativeKeywordName) {
    return KEYWORD_PLAN_NEGATIVE_KEYWORD_PATH_TEMPLATE
        .parse(keywordPlanNegativeKeywordName)
        .get("keyword_plan_negative_keyword");
  }

  /** Constructs an instance of KeywordPlanNegativeKeywordServiceClient with default settings. */
  public static final KeywordPlanNegativeKeywordServiceClient create() throws IOException {
    return create(KeywordPlanNegativeKeywordServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of KeywordPlanNegativeKeywordServiceClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any settings that are
   * not set.
   */
  public static final KeywordPlanNegativeKeywordServiceClient create(
      KeywordPlanNegativeKeywordServiceSettings settings) throws IOException {
    return new KeywordPlanNegativeKeywordServiceClient(settings);
  }

  /**
   * Constructs an instance of KeywordPlanNegativeKeywordServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer to use
   * KeywordPlanNegativeKeywordServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final KeywordPlanNegativeKeywordServiceClient create(
      KeywordPlanNegativeKeywordServiceStub stub) {
    return new KeywordPlanNegativeKeywordServiceClient(stub);
  }

  /**
   * Constructs an instance of KeywordPlanNegativeKeywordServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected KeywordPlanNegativeKeywordServiceClient(
      KeywordPlanNegativeKeywordServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((KeywordPlanNegativeKeywordServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected KeywordPlanNegativeKeywordServiceClient(KeywordPlanNegativeKeywordServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordPlanNegativeKeywordServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public KeywordPlanNegativeKeywordServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested plan in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanNegativeKeywordServiceClient keywordPlanNegativeKeywordServiceClient = KeywordPlanNegativeKeywordServiceClient.create()) {
   *   String formattedResourceName = KeywordPlanNegativeKeywordServiceClient.formatKeywordPlanNegativeKeywordName("[CUSTOMER]", "[KEYWORD_PLAN_NEGATIVE_KEYWORD]");
   *   KeywordPlanNegativeKeyword response = keywordPlanNegativeKeywordServiceClient.getKeywordPlanNegativeKeyword(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the plan to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlanNegativeKeyword getKeywordPlanNegativeKeyword(String resourceName) {
    KEYWORD_PLAN_NEGATIVE_KEYWORD_PATH_TEMPLATE.validate(
        resourceName, "getKeywordPlanNegativeKeyword");
    GetKeywordPlanNegativeKeywordRequest request =
        GetKeywordPlanNegativeKeywordRequest.newBuilder().setResourceName(resourceName).build();
    return getKeywordPlanNegativeKeyword(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested plan in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanNegativeKeywordServiceClient keywordPlanNegativeKeywordServiceClient = KeywordPlanNegativeKeywordServiceClient.create()) {
   *   String formattedResourceName = KeywordPlanNegativeKeywordServiceClient.formatKeywordPlanNegativeKeywordName("[CUSTOMER]", "[KEYWORD_PLAN_NEGATIVE_KEYWORD]");
   *   GetKeywordPlanNegativeKeywordRequest request = GetKeywordPlanNegativeKeywordRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   KeywordPlanNegativeKeyword response = keywordPlanNegativeKeywordServiceClient.getKeywordPlanNegativeKeyword(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlanNegativeKeyword getKeywordPlanNegativeKeyword(
      GetKeywordPlanNegativeKeywordRequest request) {
    return getKeywordPlanNegativeKeywordCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested plan in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanNegativeKeywordServiceClient keywordPlanNegativeKeywordServiceClient = KeywordPlanNegativeKeywordServiceClient.create()) {
   *   String formattedResourceName = KeywordPlanNegativeKeywordServiceClient.formatKeywordPlanNegativeKeywordName("[CUSTOMER]", "[KEYWORD_PLAN_NEGATIVE_KEYWORD]");
   *   GetKeywordPlanNegativeKeywordRequest request = GetKeywordPlanNegativeKeywordRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;KeywordPlanNegativeKeyword&gt; future = keywordPlanNegativeKeywordServiceClient.getKeywordPlanNegativeKeywordCallable().futureCall(request);
   *   // Do something
   *   KeywordPlanNegativeKeyword response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetKeywordPlanNegativeKeywordRequest, KeywordPlanNegativeKeyword>
      getKeywordPlanNegativeKeywordCallable() {
    return stub.getKeywordPlanNegativeKeywordCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan negative keywords. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanNegativeKeywordServiceClient keywordPlanNegativeKeywordServiceClient = KeywordPlanNegativeKeywordServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanNegativeKeywordOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateKeywordPlanNegativeKeywordsResponse response = keywordPlanNegativeKeywordServiceClient.mutateKeywordPlanNegativeKeywords(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose negative keywords are being modified.
   * @param operations The list of operations to perform on individual Keyword Plan negative
   *     keywords.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanNegativeKeywordsResponse mutateKeywordPlanNegativeKeywords(
      String customerId,
      List<KeywordPlanNegativeKeywordOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateKeywordPlanNegativeKeywordsRequest request =
        MutateKeywordPlanNegativeKeywordsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateKeywordPlanNegativeKeywords(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan negative keywords. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanNegativeKeywordServiceClient keywordPlanNegativeKeywordServiceClient = KeywordPlanNegativeKeywordServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanNegativeKeywordOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlanNegativeKeywordsResponse response = keywordPlanNegativeKeywordServiceClient.mutateKeywordPlanNegativeKeywords(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose negative keywords are being modified.
   * @param operations The list of operations to perform on individual Keyword Plan negative
   *     keywords.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanNegativeKeywordsResponse mutateKeywordPlanNegativeKeywords(
      String customerId, List<KeywordPlanNegativeKeywordOperation> operations) {

    MutateKeywordPlanNegativeKeywordsRequest request =
        MutateKeywordPlanNegativeKeywordsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateKeywordPlanNegativeKeywords(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan negative keywords. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanNegativeKeywordServiceClient keywordPlanNegativeKeywordServiceClient = KeywordPlanNegativeKeywordServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanNegativeKeywordOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlanNegativeKeywordsRequest request = MutateKeywordPlanNegativeKeywordsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateKeywordPlanNegativeKeywordsResponse response = keywordPlanNegativeKeywordServiceClient.mutateKeywordPlanNegativeKeywords(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanNegativeKeywordsResponse mutateKeywordPlanNegativeKeywords(
      MutateKeywordPlanNegativeKeywordsRequest request) {
    return mutateKeywordPlanNegativeKeywordsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan negative keywords. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanNegativeKeywordServiceClient keywordPlanNegativeKeywordServiceClient = KeywordPlanNegativeKeywordServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanNegativeKeywordOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlanNegativeKeywordsRequest request = MutateKeywordPlanNegativeKeywordsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateKeywordPlanNegativeKeywordsResponse&gt; future = keywordPlanNegativeKeywordServiceClient.mutateKeywordPlanNegativeKeywordsCallable().futureCall(request);
   *   // Do something
   *   MutateKeywordPlanNegativeKeywordsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<
          MutateKeywordPlanNegativeKeywordsRequest, MutateKeywordPlanNegativeKeywordsResponse>
      mutateKeywordPlanNegativeKeywordsCallable() {
    return stub.mutateKeywordPlanNegativeKeywordsCallable();
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
