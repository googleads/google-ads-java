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

import com.google.ads.googleads.v1.resources.MobileAppCategoryConstant;
import com.google.ads.googleads.v1.services.stub.MobileAppCategoryConstantServiceStub;
import com.google.ads.googleads.v1.services.stub.MobileAppCategoryConstantServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to fetch mobile app category constants.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (MobileAppCategoryConstantServiceClient mobileAppCategoryConstantServiceClient = MobileAppCategoryConstantServiceClient.create()) {
 *   String formattedResourceName = MobileAppCategoryConstantServiceClient.formatMobileAppCategoryConstantName("[MOBILE_APP_CATEGORY_CONSTANT]");
 *   MobileAppCategoryConstant response = mobileAppCategoryConstantServiceClient.getMobileAppCategoryConstant(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the mobileAppCategoryConstantServiceClient object to clean
 * up resources such as threads. In the example above, try-with-resources is used, which
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
 * MobileAppCategoryConstantServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * MobileAppCategoryConstantServiceSettings mobileAppCategoryConstantServiceSettings =
 *     MobileAppCategoryConstantServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * MobileAppCategoryConstantServiceClient mobileAppCategoryConstantServiceClient =
 *     MobileAppCategoryConstantServiceClient.create(mobileAppCategoryConstantServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * MobileAppCategoryConstantServiceSettings mobileAppCategoryConstantServiceSettings =
 *     MobileAppCategoryConstantServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * MobileAppCategoryConstantServiceClient mobileAppCategoryConstantServiceClient =
 *     MobileAppCategoryConstantServiceClient.create(mobileAppCategoryConstantServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class MobileAppCategoryConstantServiceClient implements BackgroundResource {
  private final MobileAppCategoryConstantServiceSettings settings;
  private final MobileAppCategoryConstantServiceStub stub;

  private static final PathTemplate MOBILE_APP_CATEGORY_CONSTANT_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "mobileAppCategoryConstants/{mobile_app_category_constant}");

  /**
   * Formats a string containing the fully-qualified path to represent a
   * mobile_app_category_constant resource.
   */
  public static final String formatMobileAppCategoryConstantName(String mobileAppCategoryConstant) {
    return MOBILE_APP_CATEGORY_CONSTANT_PATH_TEMPLATE.instantiate(
        "mobile_app_category_constant", mobileAppCategoryConstant);
  }

  /**
   * Parses the mobile_app_category_constant from the given fully-qualified path which represents a
   * mobile_app_category_constant resource.
   */
  public static final String parseMobileAppCategoryConstantFromMobileAppCategoryConstantName(
      String mobileAppCategoryConstantName) {
    return MOBILE_APP_CATEGORY_CONSTANT_PATH_TEMPLATE
        .parse(mobileAppCategoryConstantName)
        .get("mobile_app_category_constant");
  }

  /** Constructs an instance of MobileAppCategoryConstantServiceClient with default settings. */
  public static final MobileAppCategoryConstantServiceClient create() throws IOException {
    return create(MobileAppCategoryConstantServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of MobileAppCategoryConstantServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final MobileAppCategoryConstantServiceClient create(
      MobileAppCategoryConstantServiceSettings settings) throws IOException {
    return new MobileAppCategoryConstantServiceClient(settings);
  }

  /**
   * Constructs an instance of MobileAppCategoryConstantServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer to use
   * MobileAppCategoryConstantServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final MobileAppCategoryConstantServiceClient create(
      MobileAppCategoryConstantServiceStub stub) {
    return new MobileAppCategoryConstantServiceClient(stub);
  }

  /**
   * Constructs an instance of MobileAppCategoryConstantServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected MobileAppCategoryConstantServiceClient(
      MobileAppCategoryConstantServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((MobileAppCategoryConstantServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected MobileAppCategoryConstantServiceClient(MobileAppCategoryConstantServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final MobileAppCategoryConstantServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public MobileAppCategoryConstantServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested mobile app category constant.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MobileAppCategoryConstantServiceClient mobileAppCategoryConstantServiceClient = MobileAppCategoryConstantServiceClient.create()) {
   *   String formattedResourceName = MobileAppCategoryConstantServiceClient.formatMobileAppCategoryConstantName("[MOBILE_APP_CATEGORY_CONSTANT]");
   *   MobileAppCategoryConstant response = mobileAppCategoryConstantServiceClient.getMobileAppCategoryConstant(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Resource name of the mobile app category constant to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MobileAppCategoryConstant getMobileAppCategoryConstant(String resourceName) {
    MOBILE_APP_CATEGORY_CONSTANT_PATH_TEMPLATE.validate(
        resourceName, "getMobileAppCategoryConstant");
    GetMobileAppCategoryConstantRequest request =
        GetMobileAppCategoryConstantRequest.newBuilder().setResourceName(resourceName).build();
    return getMobileAppCategoryConstant(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested mobile app category constant.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MobileAppCategoryConstantServiceClient mobileAppCategoryConstantServiceClient = MobileAppCategoryConstantServiceClient.create()) {
   *   String formattedResourceName = MobileAppCategoryConstantServiceClient.formatMobileAppCategoryConstantName("[MOBILE_APP_CATEGORY_CONSTANT]");
   *   GetMobileAppCategoryConstantRequest request = GetMobileAppCategoryConstantRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   MobileAppCategoryConstant response = mobileAppCategoryConstantServiceClient.getMobileAppCategoryConstant(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MobileAppCategoryConstant getMobileAppCategoryConstant(
      GetMobileAppCategoryConstantRequest request) {
    return getMobileAppCategoryConstantCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested mobile app category constant.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MobileAppCategoryConstantServiceClient mobileAppCategoryConstantServiceClient = MobileAppCategoryConstantServiceClient.create()) {
   *   String formattedResourceName = MobileAppCategoryConstantServiceClient.formatMobileAppCategoryConstantName("[MOBILE_APP_CATEGORY_CONSTANT]");
   *   GetMobileAppCategoryConstantRequest request = GetMobileAppCategoryConstantRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;MobileAppCategoryConstant&gt; future = mobileAppCategoryConstantServiceClient.getMobileAppCategoryConstantCallable().futureCall(request);
   *   // Do something
   *   MobileAppCategoryConstant response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetMobileAppCategoryConstantRequest, MobileAppCategoryConstant>
      getMobileAppCategoryConstantCallable() {
    return stub.getMobileAppCategoryConstantCallable();
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
