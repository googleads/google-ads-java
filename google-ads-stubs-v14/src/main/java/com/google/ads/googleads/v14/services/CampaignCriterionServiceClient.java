/*
 * Copyright 2023 Google LLC
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

package com.google.ads.googleads.v14.services;

import com.google.ads.googleads.v14.services.stub.CampaignCriterionServiceStub;
import com.google.ads.googleads.v14.services.stub.CampaignCriterionServiceStubSettings;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage campaign criteria.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (CampaignCriterionServiceClient campaignCriterionServiceClient =
 *     CampaignCriterionServiceClient.create()) {
 *   String customerId = "customerId-1581184615";
 *   List<CampaignCriterionOperation> operations = new ArrayList<>();
 *   MutateCampaignCriteriaResponse response =
 *       campaignCriterionServiceClient.mutateCampaignCriteria(customerId, operations);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CampaignCriterionServiceClient object to clean up
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
 * CampaignCriterionServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CampaignCriterionServiceSettings campaignCriterionServiceSettings =
 *     CampaignCriterionServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignCriterionServiceClient campaignCriterionServiceClient =
 *     CampaignCriterionServiceClient.create(campaignCriterionServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CampaignCriterionServiceSettings campaignCriterionServiceSettings =
 *     CampaignCriterionServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignCriterionServiceClient campaignCriterionServiceClient =
 *     CampaignCriterionServiceClient.create(campaignCriterionServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CampaignCriterionServiceClient implements BackgroundResource {
  private final CampaignCriterionServiceSettings settings;
  private final CampaignCriterionServiceStub stub;

  /** Constructs an instance of CampaignCriterionServiceClient with default settings. */
  public static final CampaignCriterionServiceClient create() throws IOException {
    return create(CampaignCriterionServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CampaignCriterionServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final CampaignCriterionServiceClient create(
      CampaignCriterionServiceSettings settings) throws IOException {
    return new CampaignCriterionServiceClient(settings);
  }

  /**
   * Constructs an instance of CampaignCriterionServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(CampaignCriterionServiceSettings).
   */
  public static final CampaignCriterionServiceClient create(CampaignCriterionServiceStub stub) {
    return new CampaignCriterionServiceClient(stub);
  }

  /**
   * Constructs an instance of CampaignCriterionServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CampaignCriterionServiceClient(CampaignCriterionServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((CampaignCriterionServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected CampaignCriterionServiceClient(CampaignCriterionServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CampaignCriterionServiceSettings getSettings() {
    return settings;
  }

  public CampaignCriterionServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes criteria. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AdxError]() [AuthenticationError]() [AuthorizationError]()
   * [CampaignCriterionError]() [CollectionSizeError]() [ContextError]() [CriterionError]()
   * [DatabaseError]() [DistinctError]() [FieldError]() [FieldMaskError]() [FunctionError]()
   * [HeaderError]() [IdError]() [InternalError]() [MutateError]() [NewResourceCreationError]()
   * [NotEmptyError]() [NullError]() [OperationAccessDeniedError]() [OperatorError]() [QuotaError]()
   * [RangeError]() [RegionCodeError]() [RequestError]() [ResourceCountLimitExceededError]()
   * [SizeLimitError]() [StringFormatError]() [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CampaignCriterionServiceClient campaignCriterionServiceClient =
   *     CampaignCriterionServiceClient.create()) {
   *   String customerId = "customerId-1581184615";
   *   List<CampaignCriterionOperation> operations = new ArrayList<>();
   *   MutateCampaignCriteriaResponse response =
   *       campaignCriterionServiceClient.mutateCampaignCriteria(customerId, operations);
   * }
   * }</pre>
   *
   * @param customerId Required. The ID of the customer whose criteria are being modified.
   * @param operations Required. The list of operations to perform on individual criteria.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignCriteriaResponse mutateCampaignCriteria(
      String customerId, List<CampaignCriterionOperation> operations) {
    MutateCampaignCriteriaRequest request =
        MutateCampaignCriteriaRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateCampaignCriteria(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes criteria. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AdxError]() [AuthenticationError]() [AuthorizationError]()
   * [CampaignCriterionError]() [CollectionSizeError]() [ContextError]() [CriterionError]()
   * [DatabaseError]() [DistinctError]() [FieldError]() [FieldMaskError]() [FunctionError]()
   * [HeaderError]() [IdError]() [InternalError]() [MutateError]() [NewResourceCreationError]()
   * [NotEmptyError]() [NullError]() [OperationAccessDeniedError]() [OperatorError]() [QuotaError]()
   * [RangeError]() [RegionCodeError]() [RequestError]() [ResourceCountLimitExceededError]()
   * [SizeLimitError]() [StringFormatError]() [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CampaignCriterionServiceClient campaignCriterionServiceClient =
   *     CampaignCriterionServiceClient.create()) {
   *   MutateCampaignCriteriaRequest request =
   *       MutateCampaignCriteriaRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CampaignCriterionOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   MutateCampaignCriteriaResponse response =
   *       campaignCriterionServiceClient.mutateCampaignCriteria(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateCampaignCriteriaResponse mutateCampaignCriteria(
      MutateCampaignCriteriaRequest request) {
    return mutateCampaignCriteriaCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates, updates, or removes criteria. Operation statuses are returned.
   *
   * <p>List of thrown errors: [AdxError]() [AuthenticationError]() [AuthorizationError]()
   * [CampaignCriterionError]() [CollectionSizeError]() [ContextError]() [CriterionError]()
   * [DatabaseError]() [DistinctError]() [FieldError]() [FieldMaskError]() [FunctionError]()
   * [HeaderError]() [IdError]() [InternalError]() [MutateError]() [NewResourceCreationError]()
   * [NotEmptyError]() [NullError]() [OperationAccessDeniedError]() [OperatorError]() [QuotaError]()
   * [RangeError]() [RegionCodeError]() [RequestError]() [ResourceCountLimitExceededError]()
   * [SizeLimitError]() [StringFormatError]() [StringLengthError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CampaignCriterionServiceClient campaignCriterionServiceClient =
   *     CampaignCriterionServiceClient.create()) {
   *   MutateCampaignCriteriaRequest request =
   *       MutateCampaignCriteriaRequest.newBuilder()
   *           .setCustomerId("customerId-1581184615")
   *           .addAllOperations(new ArrayList<CampaignCriterionOperation>())
   *           .setPartialFailure(true)
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<MutateCampaignCriteriaResponse> future =
   *       campaignCriterionServiceClient.mutateCampaignCriteriaCallable().futureCall(request);
   *   // Do something.
   *   MutateCampaignCriteriaResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MutateCampaignCriteriaRequest, MutateCampaignCriteriaResponse>
      mutateCampaignCriteriaCallable() {
    return stub.mutateCampaignCriteriaCallable();
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
