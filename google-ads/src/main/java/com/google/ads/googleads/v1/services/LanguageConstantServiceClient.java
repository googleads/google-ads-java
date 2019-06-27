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

import com.google.ads.googleads.v1.resources.LanguageConstant;
import com.google.ads.googleads.v1.services.stub.LanguageConstantServiceStub;
import com.google.ads.googleads.v1.services.stub.LanguageConstantServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch language constants.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (LanguageConstantServiceClient languageConstantServiceClient = LanguageConstantServiceClient.create()) {
 *   String formattedResourceName = LanguageConstantServiceClient.formatLanguageConstantName("[LANGUAGE_CONSTANT]");
 *   LanguageConstant response = languageConstantServiceClient.getLanguageConstant(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the languageConstantServiceClient object to clean up
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
 * LanguageConstantServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * LanguageConstantServiceSettings languageConstantServiceSettings =
 *     LanguageConstantServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * LanguageConstantServiceClient languageConstantServiceClient =
 *     LanguageConstantServiceClient.create(languageConstantServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * LanguageConstantServiceSettings languageConstantServiceSettings =
 *     LanguageConstantServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * LanguageConstantServiceClient languageConstantServiceClient =
 *     LanguageConstantServiceClient.create(languageConstantServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class LanguageConstantServiceClient implements BackgroundResource {
  private final LanguageConstantServiceSettings settings;
  private final LanguageConstantServiceStub stub;

  private static final PathTemplate LANGUAGE_CONSTANT_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("languageConstants/{language_constant}");

  /**
   * Formats a string containing the fully-qualified path to represent a language_constant resource.
   *
   * @deprecated Use the {@link LanguageConstantName} class instead.
   */
  @Deprecated
  public static final String formatLanguageConstantName(String languageConstant) {
    return LANGUAGE_CONSTANT_PATH_TEMPLATE.instantiate("language_constant", languageConstant);
  }

  /**
   * Parses the language_constant from the given fully-qualified path which represents a
   * language_constant resource.
   *
   * @deprecated Use the {@link LanguageConstantName} class instead.
   */
  @Deprecated
  public static final String parseLanguageConstantFromLanguageConstantName(
      String languageConstantName) {
    return LANGUAGE_CONSTANT_PATH_TEMPLATE.parse(languageConstantName).get("language_constant");
  }

  /** Constructs an instance of LanguageConstantServiceClient with default settings. */
  public static final LanguageConstantServiceClient create() throws IOException {
    return create(LanguageConstantServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of LanguageConstantServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final LanguageConstantServiceClient create(LanguageConstantServiceSettings settings)
      throws IOException {
    return new LanguageConstantServiceClient(settings);
  }

  /**
   * Constructs an instance of LanguageConstantServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use LanguageConstantServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final LanguageConstantServiceClient create(LanguageConstantServiceStub stub) {
    return new LanguageConstantServiceClient(stub);
  }

  /**
   * Constructs an instance of LanguageConstantServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected LanguageConstantServiceClient(LanguageConstantServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((LanguageConstantServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected LanguageConstantServiceClient(LanguageConstantServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final LanguageConstantServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public LanguageConstantServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested language constant.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LanguageConstantServiceClient languageConstantServiceClient = LanguageConstantServiceClient.create()) {
   *   String formattedResourceName = LanguageConstantServiceClient.formatLanguageConstantName("[LANGUAGE_CONSTANT]");
   *   LanguageConstant response = languageConstantServiceClient.getLanguageConstant(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Resource name of the language constant to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LanguageConstant getLanguageConstant(String resourceName) {
    LANGUAGE_CONSTANT_PATH_TEMPLATE.validate(resourceName, "getLanguageConstant");
    GetLanguageConstantRequest request =
        GetLanguageConstantRequest.newBuilder().setResourceName(resourceName).build();
    return getLanguageConstant(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested language constant.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LanguageConstantServiceClient languageConstantServiceClient = LanguageConstantServiceClient.create()) {
   *   String formattedResourceName = LanguageConstantServiceClient.formatLanguageConstantName("[LANGUAGE_CONSTANT]");
   *   GetLanguageConstantRequest request = GetLanguageConstantRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   LanguageConstant response = languageConstantServiceClient.getLanguageConstant(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LanguageConstant getLanguageConstant(GetLanguageConstantRequest request) {
    return getLanguageConstantCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested language constant.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LanguageConstantServiceClient languageConstantServiceClient = LanguageConstantServiceClient.create()) {
   *   String formattedResourceName = LanguageConstantServiceClient.formatLanguageConstantName("[LANGUAGE_CONSTANT]");
   *   GetLanguageConstantRequest request = GetLanguageConstantRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;LanguageConstant&gt; future = languageConstantServiceClient.getLanguageConstantCallable().futureCall(request);
   *   // Do something
   *   LanguageConstant response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetLanguageConstantRequest, LanguageConstant>
      getLanguageConstantCallable() {
    return stub.getLanguageConstantCallable();
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
