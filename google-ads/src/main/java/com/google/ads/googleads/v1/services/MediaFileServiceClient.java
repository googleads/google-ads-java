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

import com.google.ads.googleads.v1.resources.MediaFile;
import com.google.ads.googleads.v1.services.stub.MediaFileServiceStub;
import com.google.ads.googleads.v1.services.stub.MediaFileServiceStubSettings;
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
 * Service Description: Service to manage media files.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (MediaFileServiceClient mediaFileServiceClient = MediaFileServiceClient.create()) {
 *   String formattedResourceName = MediaFileServiceClient.formatMediaFileName("[CUSTOMER]", "[MEDIA_FILE]");
 *   MediaFile response = mediaFileServiceClient.getMediaFile(formattedResourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the mediaFileServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
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
 * <p>This class can be customized by passing in a custom instance of MediaFileServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * MediaFileServiceSettings mediaFileServiceSettings =
 *     MediaFileServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * MediaFileServiceClient mediaFileServiceClient =
 *     MediaFileServiceClient.create(mediaFileServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * MediaFileServiceSettings mediaFileServiceSettings =
 *     MediaFileServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * MediaFileServiceClient mediaFileServiceClient =
 *     MediaFileServiceClient.create(mediaFileServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class MediaFileServiceClient implements BackgroundResource {
  private final MediaFileServiceSettings settings;
  private final MediaFileServiceStub stub;

  private static final PathTemplate MEDIA_FILE_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/mediaFiles/{media_file}");

  /** Formats a string containing the fully-qualified path to represent a media_file resource. */
  public static final String formatMediaFileName(String customer, String mediaFile) {
    return MEDIA_FILE_PATH_TEMPLATE.instantiate(
        "customer", customer,
        "media_file", mediaFile);
  }

  /**
   * Parses the customer from the given fully-qualified path which represents a media_file resource.
   */
  public static final String parseCustomerFromMediaFileName(String mediaFileName) {
    return MEDIA_FILE_PATH_TEMPLATE.parse(mediaFileName).get("customer");
  }

  /**
   * Parses the media_file from the given fully-qualified path which represents a media_file
   * resource.
   */
  public static final String parseMediaFileFromMediaFileName(String mediaFileName) {
    return MEDIA_FILE_PATH_TEMPLATE.parse(mediaFileName).get("media_file");
  }

  /** Constructs an instance of MediaFileServiceClient with default settings. */
  public static final MediaFileServiceClient create() throws IOException {
    return create(MediaFileServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of MediaFileServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final MediaFileServiceClient create(MediaFileServiceSettings settings)
      throws IOException {
    return new MediaFileServiceClient(settings);
  }

  /**
   * Constructs an instance of MediaFileServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer to use MediaFileServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final MediaFileServiceClient create(MediaFileServiceStub stub) {
    return new MediaFileServiceClient(stub);
  }

  /**
   * Constructs an instance of MediaFileServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected MediaFileServiceClient(MediaFileServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((MediaFileServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected MediaFileServiceClient(MediaFileServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final MediaFileServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public MediaFileServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested media file in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MediaFileServiceClient mediaFileServiceClient = MediaFileServiceClient.create()) {
   *   String formattedResourceName = MediaFileServiceClient.formatMediaFileName("[CUSTOMER]", "[MEDIA_FILE]");
   *   MediaFile response = mediaFileServiceClient.getMediaFile(formattedResourceName);
   * }
   * </code></pre>
   *
   * @param resourceName The resource name of the media file to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MediaFile getMediaFile(String resourceName) {
    MEDIA_FILE_PATH_TEMPLATE.validate(resourceName, "getMediaFile");
    GetMediaFileRequest request =
        GetMediaFileRequest.newBuilder().setResourceName(resourceName).build();
    return getMediaFile(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested media file in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MediaFileServiceClient mediaFileServiceClient = MediaFileServiceClient.create()) {
   *   String formattedResourceName = MediaFileServiceClient.formatMediaFileName("[CUSTOMER]", "[MEDIA_FILE]");
   *   GetMediaFileRequest request = GetMediaFileRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   MediaFile response = mediaFileServiceClient.getMediaFile(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MediaFile getMediaFile(GetMediaFileRequest request) {
    return getMediaFileCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested media file in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MediaFileServiceClient mediaFileServiceClient = MediaFileServiceClient.create()) {
   *   String formattedResourceName = MediaFileServiceClient.formatMediaFileName("[CUSTOMER]", "[MEDIA_FILE]");
   *   GetMediaFileRequest request = GetMediaFileRequest.newBuilder()
   *     .setResourceName(formattedResourceName)
   *     .build();
   *   ApiFuture&lt;MediaFile&gt; future = mediaFileServiceClient.getMediaFileCallable().futureCall(request);
   *   // Do something
   *   MediaFile response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetMediaFileRequest, MediaFile> getMediaFileCallable() {
    return stub.getMediaFileCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates media files. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MediaFileServiceClient mediaFileServiceClient = MediaFileServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;MediaFileOperation&gt; operations = new ArrayList&lt;&gt;();
   *   boolean partialFailure = false;
   *   boolean validateOnly = false;
   *   MutateMediaFilesResponse response = mediaFileServiceClient.mutateMediaFiles(customerId, operations, partialFailure, validateOnly);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose media files are being modified.
   * @param operations The list of operations to perform on individual media file.
   * @param partialFailure If true, successful operations will be carried out and invalid operations
   *     will return errors. If false, all operations will be carried out in one transaction if and
   *     only if they are all valid. Default is false.
   * @param validateOnly If true, the request is validated but not executed. Only errors are
   *     returned, not results.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateMediaFilesResponse mutateMediaFiles(
      String customerId,
      List<MediaFileOperation> operations,
      boolean partialFailure,
      boolean validateOnly) {

    MutateMediaFilesRequest request =
        MutateMediaFilesRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .setPartialFailure(partialFailure)
            .setValidateOnly(validateOnly)
            .build();
    return mutateMediaFiles(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates media files. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MediaFileServiceClient mediaFileServiceClient = MediaFileServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;MediaFileOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateMediaFilesResponse response = mediaFileServiceClient.mutateMediaFiles(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId The ID of the customer whose media files are being modified.
   * @param operations The list of operations to perform on individual media file.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateMediaFilesResponse mutateMediaFiles(
      String customerId, List<MediaFileOperation> operations) {

    MutateMediaFilesRequest request =
        MutateMediaFilesRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateMediaFiles(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates media files. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MediaFileServiceClient mediaFileServiceClient = MediaFileServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;MediaFileOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateMediaFilesRequest request = MutateMediaFilesRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateMediaFilesResponse response = mediaFileServiceClient.mutateMediaFiles(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateMediaFilesResponse mutateMediaFiles(MutateMediaFilesRequest request) {
    return mutateMediaFilesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates media files. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (MediaFileServiceClient mediaFileServiceClient = MediaFileServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;MediaFileOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateMediaFilesRequest request = MutateMediaFilesRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateMediaFilesResponse&gt; future = mediaFileServiceClient.mutateMediaFilesCallable().futureCall(request);
   *   // Do something
   *   MutateMediaFilesResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateMediaFilesRequest, MutateMediaFilesResponse>
      mutateMediaFilesCallable() {
    return stub.mutateMediaFilesCallable();
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
