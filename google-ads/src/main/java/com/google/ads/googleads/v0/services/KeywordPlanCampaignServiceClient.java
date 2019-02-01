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

import com.google.ads.googleads.v0.resources.KeywordPlanCampaign;
import com.google.ads.googleads.v0.services.stub.KeywordPlanCampaignServiceStub;
import com.google.ads.googleads.v0.services.stub.KeywordPlanCampaignServiceStubSettings;
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
 * Service Description: Service to manage Keyword Plan campaigns.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient = KeywordPlanCampaignServiceClient.create()) {
 *   String formattedResourceName = KeywordPlanCampaignServiceClient.formatKeywordPlanCampaignName("[CUSTOMER]", "[KEYWORD_PLAN_CAMPAIGN]");
 *   KeywordPlanCampaign response = keywordPlanCampaignServiceClient.getKeywordPlanCampaign(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the keywordPlanCampaignServiceClient object to clean up
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
 * KeywordPlanCampaignServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * KeywordPlanCampaignServiceSettings keywordPlanCampaignServiceSettings =
 *     KeywordPlanCampaignServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient =
 *     KeywordPlanCampaignServiceClient.create(keywordPlanCampaignServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * KeywordPlanCampaignServiceSettings keywordPlanCampaignServiceSettings =
 *     KeywordPlanCampaignServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient =
 *     KeywordPlanCampaignServiceClient.create(keywordPlanCampaignServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class KeywordPlanCampaignServiceClient implements BackgroundResource {
  private final KeywordPlanCampaignServiceSettings settings;
  private final KeywordPlanCampaignServiceStub stub;

  private static final PathTemplate KEYWORD_PLAN_CAMPAIGN_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/keywordPlanCampaigns/{keyword_plan_campaign}");

  /**
   * Formats a string containing the fully-qualified path to represent a keyword_plan_campaign
   * resource.
   */
  public static final String formatKeywordPlanCampaignName(
      String customer, String keywordPlanCampaign) {
    return KEYWORD_PLAN_CAMPAIGN_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "keyword_plan_campaign", keywordPlanCampaign);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a
   * keyword_plan_campaign resource.
   */
  public static final String parseCustomerFromKeywordPlanCampaignName(
      String keywordPlanCampaignName) {
    return KEYWORD_PLAN_CAMPAIGN_PATH_TEMPLATE.parse(keywordPlanCampaignName).get("customer");
  }

  /**
   * Parses the keyword_plan_campaign from the given fully-qualified path which represents a
   * keyword_plan_campaign resource.
   */
  public static final String parseKeywordPlanCampaignFromKeywordPlanCampaignName(
      String keywordPlanCampaignName) {
    return KEYWORD_PLAN_CAMPAIGN_PATH_TEMPLATE
        .parse(keywordPlanCampaignName)
        .get("keyword_plan_campaign");
  }

  /** Constructs an instance of KeywordPlanCampaignServiceClient with default settings. */
  public static final KeywordPlanCampaignServiceClient create() throws IOException {
    return create(KeywordPlanCampaignServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of KeywordPlanCampaignServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final KeywordPlanCampaignServiceClient create(
      KeywordPlanCampaignServiceSettings settings) throws IOException {
    return new KeywordPlanCampaignServiceClient(settings);
  }

  /**
   * Constructs an instance of KeywordPlanCampaignServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use KeywordPlanCampaignServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final KeywordPlanCampaignServiceClient create(KeywordPlanCampaignServiceStub stub) {
    return new KeywordPlanCampaignServiceClient(stub);
  }

  /**
   * Constructs an instance of KeywordPlanCampaignServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected KeywordPlanCampaignServiceClient(KeywordPlanCampaignServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((KeywordPlanCampaignServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected KeywordPlanCampaignServiceClient(KeywordPlanCampaignServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordPlanCampaignServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public KeywordPlanCampaignServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan campaign in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient = KeywordPlanCampaignServiceClient.create()) {
   *   String formattedResourceName = KeywordPlanCampaignServiceClient.formatKeywordPlanCampaignName("[CUSTOMER]", "[KEYWORD_PLAN_CAMPAIGN]");
   *   KeywordPlanCampaign response = keywordPlanCampaignServiceClient.getKeywordPlanCampaign(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the Keyword Plan campaign to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlanCampaign getKeywordPlanCampaign(String resourceName) {
    KEYWORD_PLAN_CAMPAIGN_PATH_TEMPLATE.validate(resourceName, "getKeywordPlanCampaign");
    GetKeywordPlanCampaignRequest request =
        GetKeywordPlanCampaignRequest.newBuilder().setResourceName(resourceName).build();
    return getKeywordPlanCampaign(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan campaign in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient = KeywordPlanCampaignServiceClient.create()) {
   *   String formattedResourceName = KeywordPlanCampaignServiceClient.formatKeywordPlanCampaignName("[CUSTOMER]", "[KEYWORD_PLAN_CAMPAIGN]");
   *   GetKeywordPlanCampaignRequest request = GetKeywordPlanCampaignRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   KeywordPlanCampaign response = keywordPlanCampaignServiceClient.getKeywordPlanCampaign(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlanCampaign getKeywordPlanCampaign(GetKeywordPlanCampaignRequest request) {
    return getKeywordPlanCampaignCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan campaign in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient = KeywordPlanCampaignServiceClient.create()) {
   *   String formattedResourceName = KeywordPlanCampaignServiceClient.formatKeywordPlanCampaignName("[CUSTOMER]", "[KEYWORD_PLAN_CAMPAIGN]");
   *   GetKeywordPlanCampaignRequest request = GetKeywordPlanCampaignRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;KeywordPlanCampaign&gt; future = keywordPlanCampaignServiceClient.getKeywordPlanCampaignCallable().futureCall(request);
   *   // Do something
   *   KeywordPlanCampaign response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetKeywordPlanCampaignRequest, KeywordPlanCampaign>
      getKeywordPlanCampaignCallable() {
    return stub.getKeywordPlanCampaignCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan campaigns. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient = KeywordPlanCampaignServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanCampaignOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateKeywordPlanCampaignsResponse response = keywordPlanCampaignServiceClient.mutateKeywordPlanCampaigns(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose Keyword Plan campaigns are being modified.
   * @param operations The list of operations to perform on individual Keyword Plan campaigns.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanCampaignsResponse mutateKeywordPlanCampaigns(
      String customerId,
      List<KeywordPlanCampaignOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateKeywordPlanCampaignsRequest request =
        MutateKeywordPlanCampaignsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateKeywordPlanCampaigns(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan campaigns. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient = KeywordPlanCampaignServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanCampaignOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlanCampaignsResponse response = keywordPlanCampaignServiceClient.mutateKeywordPlanCampaigns(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose Keyword Plan campaigns are being modified.
   * @param operations The list of operations to perform on individual Keyword Plan campaigns.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanCampaignsResponse mutateKeywordPlanCampaigns(
      String customerId, List<KeywordPlanCampaignOperation> operations) {

    MutateKeywordPlanCampaignsRequest request =
        MutateKeywordPlanCampaignsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateKeywordPlanCampaigns(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan campaigns. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient = KeywordPlanCampaignServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanCampaignOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlanCampaignsRequest request = MutateKeywordPlanCampaignsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateKeywordPlanCampaignsResponse response = keywordPlanCampaignServiceClient.mutateKeywordPlanCampaigns(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanCampaignsResponse mutateKeywordPlanCampaigns(
      MutateKeywordPlanCampaignsRequest request) {
    return mutateKeywordPlanCampaignsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan campaigns. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanCampaignServiceClient keywordPlanCampaignServiceClient = KeywordPlanCampaignServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanCampaignOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlanCampaignsRequest request = MutateKeywordPlanCampaignsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateKeywordPlanCampaignsResponse&gt; future = keywordPlanCampaignServiceClient.mutateKeywordPlanCampaignsCallable().futureCall(request);
   *   // Do something
   *   MutateKeywordPlanCampaignsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateKeywordPlanCampaignsRequest, MutateKeywordPlanCampaignsResponse>
      mutateKeywordPlanCampaignsCallable() {
    return stub.mutateKeywordPlanCampaignsCallable();
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
