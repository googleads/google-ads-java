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
package com.google.ads.googleads.v4.services;

import com.google.ads.googleads.v4.resources.CampaignExtensionSetting;
import com.google.ads.googleads.v4.services.stub.CampaignExtensionSettingServiceStub;
import com.google.ads.googleads.v4.services.stub.CampaignExtensionSettingServiceStubSettings;
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
 * Service Description: Service to manage campaign extension settings.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (CampaignExtensionSettingServiceClient campaignExtensionSettingServiceClient = CampaignExtensionSettingServiceClient.create()) {
 *   String formattedResourceName = CampaignExtensionSettingServiceClient.formatCampaignExtensionSettingName("[CUSTOMER]", "[CAMPAIGN_EXTENSION_SETTING]");
 *   CampaignExtensionSetting response = campaignExtensionSettingServiceClient.getCampaignExtensionSetting(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the campaignExtensionSettingServiceClient object to clean
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
 * CampaignExtensionSettingServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * CampaignExtensionSettingServiceSettings campaignExtensionSettingServiceSettings =
 *     CampaignExtensionSettingServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignExtensionSettingServiceClient campaignExtensionSettingServiceClient =
 *     CampaignExtensionSettingServiceClient.create(campaignExtensionSettingServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * CampaignExtensionSettingServiceSettings campaignExtensionSettingServiceSettings =
 *     CampaignExtensionSettingServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignExtensionSettingServiceClient campaignExtensionSettingServiceClient =
 *     CampaignExtensionSettingServiceClient.create(campaignExtensionSettingServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class CampaignExtensionSettingServiceClient implements BackgroundResource {
  private final CampaignExtensionSettingServiceSettings settings;
  private final CampaignExtensionSettingServiceStub stub;

  private static final PathTemplate CAMPAIGN_EXTENSION_SETTING_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer}/campaignExtensionSettings/{campaign_extension_setting}");

  /**
   * Formats a string containing the fully-qualified path to represent a campaign_extension_setting
   * resource.
   *
   * @deprecated Use the {@link CampaignExtensionSettingName} class instead.
   */
  @Deprecated
  public static final String formatCampaignExtensionSettingName(
      String customer, String campaignExtensionSetting) {
    return CAMPAIGN_EXTENSION_SETTING_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "campaign_extension_setting", campaignExtensionSetting);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a
   * campaign_extension_setting resource.
   *
   * @deprecated Use the {@link CampaignExtensionSettingName} class instead.
   */
  @Deprecated
  public static final String parseCustomerFromCampaignExtensionSettingName(
      String campaignExtensionSettingName) {
    return CAMPAIGN_EXTENSION_SETTING_PATH_TEMPLATE
        .parse(campaignExtensionSettingName)
        .get("customer");
  }

  /**
   * Parses the campaign_extension_setting from the given fully-qualified path which represents a
   * campaign_extension_setting resource.
   *
   * @deprecated Use the {@link CampaignExtensionSettingName} class instead.
   */
  @Deprecated
  public static final String parseCampaignExtensionSettingFromCampaignExtensionSettingName(
      String campaignExtensionSettingName) {
    return CAMPAIGN_EXTENSION_SETTING_PATH_TEMPLATE
        .parse(campaignExtensionSettingName)
        .get("campaign_extension_setting");
  }

  /** Constructs an instance of CampaignExtensionSettingServiceClient with default settings. */
  public static final CampaignExtensionSettingServiceClient create() throws IOException {
    return create(CampaignExtensionSettingServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CampaignExtensionSettingServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final CampaignExtensionSettingServiceClient create(
      CampaignExtensionSettingServiceSettings settings) throws IOException {
    return new CampaignExtensionSettingServiceClient(settings);
  }

  /**
   * Constructs an instance of CampaignExtensionSettingServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer to use
   * CampaignExtensionSettingServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CampaignExtensionSettingServiceClient create(
      CampaignExtensionSettingServiceStub stub) {
    return new CampaignExtensionSettingServiceClient(stub);
  }

  /**
   * Constructs an instance of CampaignExtensionSettingServiceClient, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CampaignExtensionSettingServiceClient(CampaignExtensionSettingServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((CampaignExtensionSettingServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CampaignExtensionSettingServiceClient(CampaignExtensionSettingServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CampaignExtensionSettingServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CampaignExtensionSettingServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign extension setting in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExtensionSettingServiceClient campaignExtensionSettingServiceClient = CampaignExtensionSettingServiceClient.create()) {
   *   String formattedResourceName = CampaignExtensionSettingServiceClient.formatCampaignExtensionSettingName("[CUSTOMER]", "[CAMPAIGN_EXTENSION_SETTING]");
   *   CampaignExtensionSetting response = campaignExtensionSettingServiceClient.getCampaignExtensionSetting(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the campaign extension setting to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignExtensionSetting getCampaignExtensionSetting(String resourceName) {
    CAMPAIGN_EXTENSION_SETTING_PATH_TEMPLATE.validate(resourceName, "getCampaignExtensionSetting");
    GetCampaignExtensionSettingRequest request =
        GetCampaignExtensionSettingRequest.newBuilder().setResourceName(resourceName).build();
    return getCampaignExtensionSetting(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign extension setting in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExtensionSettingServiceClient campaignExtensionSettingServiceClient = CampaignExtensionSettingServiceClient.create()) {
   *   String formattedResourceName = CampaignExtensionSettingServiceClient.formatCampaignExtensionSettingName("[CUSTOMER]", "[CAMPAIGN_EXTENSION_SETTING]");
   *   GetCampaignExtensionSettingRequest request = GetCampaignExtensionSettingRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   CampaignExtensionSetting response = campaignExtensionSettingServiceClient.getCampaignExtensionSetting(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignExtensionSetting getCampaignExtensionSetting(
      GetCampaignExtensionSettingRequest request) {
    return getCampaignExtensionSettingCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested campaign extension setting in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExtensionSettingServiceClient campaignExtensionSettingServiceClient = CampaignExtensionSettingServiceClient.create()) {
   *   String formattedResourceName = CampaignExtensionSettingServiceClient.formatCampaignExtensionSettingName("[CUSTOMER]", "[CAMPAIGN_EXTENSION_SETTING]");
   *   GetCampaignExtensionSettingRequest request = GetCampaignExtensionSettingRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;CampaignExtensionSetting&gt; future = campaignExtensionSettingServiceClient.getCampaignExtensionSettingCallable().futureCall(request);
   *   // Do something
   *   CampaignExtensionSetting response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetCampaignExtensionSettingRequest, CampaignExtensionSetting>
      getCampaignExtensionSettingCallable() {
    return stub.getCampaignExtensionSettingCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaign extension settings. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExtensionSettingServiceClient campaignExtensionSettingServiceClient = CampaignExtensionSettingServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignExtensionSettingOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateCampaignExtensionSettingsResponse response = campaignExtensionSettingServiceClient.mutateCampaignExtensionSettings(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose campaign extension settings are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual campaign extension
   *     settings.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignExtensionSettingsResponse mutateCampaignExtensionSettings(
      String customerId,
      List<CampaignExtensionSettingOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {
    MutateCampaignExtensionSettingsRequest request =
        MutateCampaignExtensionSettingsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateCampaignExtensionSettings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaign extension settings. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExtensionSettingServiceClient campaignExtensionSettingServiceClient = CampaignExtensionSettingServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignExtensionSettingOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignExtensionSettingsResponse response = campaignExtensionSettingServiceClient.mutateCampaignExtensionSettings(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose campaign extension settings are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual campaign extension
   *     settings.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignExtensionSettingsResponse mutateCampaignExtensionSettings(
      String customerId, List<CampaignExtensionSettingOperation> operations) {
    MutateCampaignExtensionSettingsRequest request =
        MutateCampaignExtensionSettingsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCampaignExtensionSettings(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaign extension settings. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExtensionSettingServiceClient campaignExtensionSettingServiceClient = CampaignExtensionSettingServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignExtensionSettingOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignExtensionSettingsRequest request = MutateCampaignExtensionSettingsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateCampaignExtensionSettingsResponse response = campaignExtensionSettingServiceClient.mutateCampaignExtensionSettings(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignExtensionSettingsResponse mutateCampaignExtensionSettings(
      MutateCampaignExtensionSettingsRequest request) {
    return mutateCampaignExtensionSettingsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes campaign extension settings. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (CampaignExtensionSettingServiceClient campaignExtensionSettingServiceClient = CampaignExtensionSettingServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;CampaignExtensionSettingOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateCampaignExtensionSettingsRequest request = MutateCampaignExtensionSettingsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateCampaignExtensionSettingsResponse&gt; future = campaignExtensionSettingServiceClient.mutateCampaignExtensionSettingsCallable().futureCall(request);
   *   // Do something
   *   MutateCampaignExtensionSettingsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<
          MutateCampaignExtensionSettingsRequest, MutateCampaignExtensionSettingsResponse>
      mutateCampaignExtensionSettingsCallable() {
    return stub.mutateCampaignExtensionSettingsCallable();
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
