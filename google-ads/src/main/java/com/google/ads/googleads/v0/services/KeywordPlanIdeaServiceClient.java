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

import com.google.ads.googleads.v0.enums.KeywordPlanNetworkEnum;
import com.google.ads.googleads.v0.services.stub.KeywordPlanIdeaServiceStub;
import com.google.ads.googleads.v0.services.stub.KeywordPlanIdeaServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.protobuf.StringValue;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to generate keyword ideas.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient = KeywordPlanIdeaServiceClient.create()) {
 *   String customerId = "";
 *   StringValue language = StringValue.newBuilder().build();
 *   List&lt;StringValue&gt; geoTargetConstants = new ArrayList&lt;&gt;();
 *   KeywordPlanNetworkEnum.KeywordPlanNetwork keywordPlanNetwork = KeywordPlanNetworkEnum.KeywordPlanNetwork.UNSPECIFIED;
 *   GenerateKeywordIdeaResponse response = keywordPlanIdeaServiceClient.generateKeywordIdeas(customerId, language, geoTargetConstants, keywordPlanNetwork);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the keywordPlanIdeaServiceClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of KeywordPlanIdeaServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * KeywordPlanIdeaServiceSettings keywordPlanIdeaServiceSettings =
 *     KeywordPlanIdeaServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
 *     KeywordPlanIdeaServiceClient.create(keywordPlanIdeaServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * KeywordPlanIdeaServiceSettings keywordPlanIdeaServiceSettings =
 *     KeywordPlanIdeaServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
 *     KeywordPlanIdeaServiceClient.create(keywordPlanIdeaServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class KeywordPlanIdeaServiceClient implements BackgroundResource {
  private final KeywordPlanIdeaServiceSettings settings;
  private final KeywordPlanIdeaServiceStub stub;

  /** Constructs an instance of KeywordPlanIdeaServiceClient with default settings. */
  public static final KeywordPlanIdeaServiceClient create() throws IOException {
    return create(KeywordPlanIdeaServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of KeywordPlanIdeaServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final KeywordPlanIdeaServiceClient create(KeywordPlanIdeaServiceSettings settings)
      throws IOException {
    return new KeywordPlanIdeaServiceClient(settings);
  }

  /**
   * Constructs an instance of KeywordPlanIdeaServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use KeywordPlanIdeaServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final KeywordPlanIdeaServiceClient create(KeywordPlanIdeaServiceStub stub) {
    return new KeywordPlanIdeaServiceClient(stub);
  }

  /**
   * Constructs an instance of KeywordPlanIdeaServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected KeywordPlanIdeaServiceClient(KeywordPlanIdeaServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((KeywordPlanIdeaServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected KeywordPlanIdeaServiceClient(KeywordPlanIdeaServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordPlanIdeaServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public KeywordPlanIdeaServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of keyword ideas.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient = KeywordPlanIdeaServiceClient.create()) {
   *   String customerId = "";
   *   StringValue language = StringValue.newBuilder().build();
   *   List&lt;StringValue&gt; geoTargetConstants = new ArrayList&lt;&gt;();
   *   KeywordPlanNetworkEnum.KeywordPlanNetwork keywordPlanNetwork = KeywordPlanNetworkEnum.KeywordPlanNetwork.UNSPECIFIED;
   *   GenerateKeywordIdeaResponse response = keywordPlanIdeaServiceClient.generateKeywordIdeas(customerId, language, geoTargetConstants, keywordPlanNetwork);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer with the recommendation.
   * @param language The resource name of the language to target. Required
   * @param geoTargetConstants The resource names of the location to target. Max 10
   * @param keywordPlanNetwork Targeting network.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateKeywordIdeaResponse generateKeywordIdeas(
      String customerId,
      StringValue language,
      List<StringValue> geoTargetConstants,
      KeywordPlanNetworkEnum.KeywordPlanNetwork keywordPlanNetwork) {

    GenerateKeywordIdeasRequest request =
        GenerateKeywordIdeasRequest.newBuilder()
            .setCustomerId(customerId)
            .setLanguage(language)
            .addAllGeoTargetConstants(geoTargetConstants)
            .setKeywordPlanNetwork(keywordPlanNetwork)
            .build();
    return generateKeywordIdeas(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of keyword ideas.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient = KeywordPlanIdeaServiceClient.create()) {
   *   String customerId = "";
   *   StringValue language = StringValue.newBuilder().build();
   *   List&lt;StringValue&gt; geoTargetConstants = new ArrayList&lt;&gt;();
   *   KeywordPlanNetworkEnum.KeywordPlanNetwork keywordPlanNetwork = KeywordPlanNetworkEnum.KeywordPlanNetwork.UNSPECIFIED;
   *   GenerateKeywordIdeasRequest request = GenerateKeywordIdeasRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setLanguage(language)
   *     .addAllGeoTargetConstants(geoTargetConstants)
   *     .setKeywordPlanNetwork(keywordPlanNetwork)
   *     .build();
   *   GenerateKeywordIdeaResponse response = keywordPlanIdeaServiceClient.generateKeywordIdeas(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateKeywordIdeaResponse generateKeywordIdeas(
      GenerateKeywordIdeasRequest request) {
    return generateKeywordIdeasCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns a list of keyword ideas.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient = KeywordPlanIdeaServiceClient.create()) {
   *   String customerId = "";
   *   StringValue language = StringValue.newBuilder().build();
   *   List&lt;StringValue&gt; geoTargetConstants = new ArrayList&lt;&gt;();
   *   KeywordPlanNetworkEnum.KeywordPlanNetwork keywordPlanNetwork = KeywordPlanNetworkEnum.KeywordPlanNetwork.UNSPECIFIED;
   *   GenerateKeywordIdeasRequest request = GenerateKeywordIdeasRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .setLanguage(language)
   *     .addAllGeoTargetConstants(geoTargetConstants)
   *     .setKeywordPlanNetwork(keywordPlanNetwork)
   *     .build();
   *   ApiFuture&lt;GenerateKeywordIdeaResponse&gt; future = keywordPlanIdeaServiceClient.generateKeywordIdeasCallable().futureCall(request);
   *   // Do something
   *   GenerateKeywordIdeaResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GenerateKeywordIdeasRequest, GenerateKeywordIdeaResponse>
      generateKeywordIdeasCallable() {
    return stub.generateKeywordIdeasCallable();
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
