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
package com.google.ads.googleads.v3.services;

import com.google.ads.googleads.v3.resources.AdGroupExtensionSetting;
import com.google.ads.googleads.v3.services.stub.AdGroupExtensionSettingServiceStub;
import com.google.ads.googleads.v3.services.stub.AdGroupExtensionSettingServiceStubSettings;
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
 * Service Description: Service to manage ad group extension settings.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient = AdGroupExtensionSettingServiceClient.create()) {
 *   String formattedResourceName = AdGroupExtensionSettingServiceClient.formatAdGroupExtensionSettingName("[CUSTOMER]", "[AD_GROUP_EXTENSION_SETTING]");
 *   AdGroupExtensionSetting response = adGroupExtensionSettingServiceClient.getAdGroupExtensionSetting(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the adGroupExtensionSettingServiceClient object to clean
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
 * AdGroupExtensionSettingServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * AdGroupExtensionSettingServiceSettings adGroupExtensionSettingServiceSettings =
 *     AdGroupExtensionSettingServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient =
 *     AdGroupExtensionSettingServiceClient.create(adGroupExtensionSettingServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AdGroupExtensionSettingServiceSettings adGroupExtensionSettingServiceSettings =
 *     AdGroupExtensionSettingServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient =
 *     AdGroupExtensionSettingServiceClient.create(adGroupExtensionSettingServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AdGroupExtensionSettingServiceClient implements BackgroundResource {
  private final AdGroupExtensionSettingServiceSettings settings;
  private final AdGroupExtensionSettingServiceStub stub;

  private static final PathTemplate AD_GROUP_EXTENSION_SETTING_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/adGroupExtensionSettings/{ad_group_extension_setting}");

  /**
   * Formats a string containing the fully-qualified path to represent a ad_group_extension_setting
   * resource.
   *
   * @deprecated Use the {@link AdGroupExtensionSettingName} class instead.
   */
  @Deprecated
  public static final String formatAdGroupExtensionSettingName(
      String customer, String adGroupExtensionSetting) {
    return AD_GROUP_EXTENSION_SETTING_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "ad_group_extension_setting", adGroupExtensionSetting);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a
   * ad_group_extension_setting resource.
   *
   * @deprecated Use the {@link AdGroupExtensionSettingName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromAdGroupExtensionSettingName(
      String adGroupExtensionSettingName) {
    return AD_GROUP_EXTENSION_SETTING_PATH_TEMPLATE
        .parse(adGroupExtensionSettingName)
        .get("customer");
  }

  /**
   * Parses the ad_group_extension_setting from the given fully-qualified path which represents a
   * ad_group_extension_setting resource.
   *
   * @deprecated Use the {@link AdGroupExtensionSettingName} class instead.
   */
  @Deprecated
  public static final String parseAdGroupExtensionSettingFromAdGroupExtensionSettingName(
      String adGroupExtensionSettingName) {
    return AD_GROUP_EXTENSION_SETTING_PATH_TEMPLATE
        .parse(adGroupExtensionSettingName)
        .get("ad_group_extension_setting");
  }

  /** Constructs an instance of AdGroupExtensionSettingServiceClient with default settings. */
  public static final AdGroupExtensionSettingServiceClient create() throws IOException {
    return create(AdGroupExtensionSettingServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdGroupExtensionSettingServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final AdGroupExtensionSettingServiceClient create(
      AdGroupExtensionSettingServiceSettings settings) throws IOException {
    return new AdGroupExtensionSettingServiceClient(settings);
  }

  /**
   * Constructs an instance of AdGroupExtensionSettingServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use AdGroupExtensionSettingServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AdGroupExtensionSettingServiceClient create(
      AdGroupExtensionSettingServiceStub stub) {
    return new AdGroupExtensionSettingServiceClient(stub);
  }

  /**
   * Constructs an instance of AdGroupExtensionSettingServiceClient, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AdGroupExtensionSettingServiceClient(AdGroupExtensionSettingServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((AdGroupExtensionSettingServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AdGroupExtensionSettingServiceClient(AdGroupExtensionSettingServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdGroupExtensionSettingServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AdGroupExtensionSettingServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group extension setting in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient = AdGroupExtensionSettingServiceClient.create()) {
   *   String formattedResourceName = AdGroupExtensionSettingServiceClient.formatAdGroupExtensionSettingName("[CUSTOMER]", "[AD_GROUP_EXTENSION_SETTING]");
   *   AdGroupExtensionSetting response = adGroupExtensionSettingServiceClient.getAdGroupExtensionSetting(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the ad group extension setting to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupExtensionSetting getAdGroupExtensionSetting(String resourceName) {
    AD_GROUP_EXTENSION_SETTING_PATH_TEMPLATE.validate(resourceName, "getAdGroupExtensionSetting");
    GetAdGroupExtensionSettingRequest request =
        GetAdGroupExtensionSettingRequest.newBuilder().setResourceName(resourceName).build();
    return getAdGroupExtensionSetting(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group extension setting in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient = AdGroupExtensionSettingServiceClient.create()) {
   *   String formattedResourceName = AdGroupExtensionSettingServiceClient.formatAdGroupExtensionSettingName("[CUSTOMER]", "[AD_GROUP_EXTENSION_SETTING]");
   *   GetAdGroupExtensionSettingRequest request = GetAdGroupExtensionSettingRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   AdGroupExtensionSetting response = adGroupExtensionSettingServiceClient.getAdGroupExtensionSetting(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AdGroupExtensionSetting getAdGroupExtensionSetting(
      GetAdGroupExtensionSettingRequest request) {
    return getAdGroupExtensionSettingCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested ad group extension setting in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient = AdGroupExtensionSettingServiceClient.create()) {
   *   String formattedResourceName = AdGroupExtensionSettingServiceClient.formatAdGroupExtensionSettingName("[CUSTOMER]", "[AD_GROUP_EXTENSION_SETTING]");
   *   GetAdGroupExtensionSettingRequest request = GetAdGroupExtensionSettingRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;AdGroupExtensionSetting&gt; future = adGroupExtensionSettingServiceClient.getAdGroupExtensionSettingCallable().futureCall(request);
   *   // Do something
   *   AdGroupExtensionSetting response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetAdGroupExtensionSettingRequest, AdGroupExtensionSetting>
      getAdGroupExtensionSettingCallable() {
    return stub.getAdGroupExtensionSettingCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes ad group extension settings. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient = AdGroupExtensionSettingServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupExtensionSettingOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateAdGroupExtensionSettingsResponse response = adGroupExtensionSettingServiceClient.mutateAdGroupExtensionSettings(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose ad group extension settings are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual ad group extension
   *     settings.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupExtensionSettingsResponse mutateAdGroupExtensionSettings(
      String customerId,
      List<AdGroupExtensionSettingOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateAdGroupExtensionSettingsRequest request =
        MutateAdGroupExtensionSettingsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateAdGroupExtensionSettings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes ad group extension settings. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient = AdGroupExtensionSettingServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupExtensionSettingOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdGroupExtensionSettingsResponse response = adGroupExtensionSettingServiceClient.mutateAdGroupExtensionSettings(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose ad group extension settings are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual ad group extension
   *     settings.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupExtensionSettingsResponse mutateAdGroupExtensionSettings(
      String customerId, List<AdGroupExtensionSettingOperation> operations) {

    MutateAdGroupExtensionSettingsRequest request =
        MutateAdGroupExtensionSettingsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateAdGroupExtensionSettings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes ad group extension settings. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient = AdGroupExtensionSettingServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupExtensionSettingOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdGroupExtensionSettingsRequest request = MutateAdGroupExtensionSettingsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateAdGroupExtensionSettingsResponse response = adGroupExtensionSettingServiceClient.mutateAdGroupExtensionSettings(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateAdGroupExtensionSettingsResponse mutateAdGroupExtensionSettings(
      MutateAdGroupExtensionSettingsRequest request) {
    return mutateAdGroupExtensionSettingsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes ad group extension settings. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AdGroupExtensionSettingServiceClient adGroupExtensionSettingServiceClient = AdGroupExtensionSettingServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;AdGroupExtensionSettingOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateAdGroupExtensionSettingsRequest request = MutateAdGroupExtensionSettingsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateAdGroupExtensionSettingsResponse&gt; future = adGroupExtensionSettingServiceClient.mutateAdGroupExtensionSettingsCallable().futureCall(request);
   *   // Do something
   *   MutateAdGroupExtensionSettingsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<
          MutateAdGroupExtensionSettingsRequest, MutateAdGroupExtensionSettingsResponse>
      mutateAdGroupExtensionSettingsCallable() {
    return stub.mutateAdGroupExtensionSettingsCallable();
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
