// Copyright 2026 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.examples.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v24.enums.MultiPartyAuthOperationTypeEnum.MultiPartyAuthOperationType;
import com.google.ads.googleads.v24.enums.MultiPartyAuthReviewStatusEnum.MultiPartyAuthReviewStatus;
import com.google.ads.googleads.v24.enums.MultiPartyAuthReviewTargetResourceEnum.MultiPartyAuthReviewTargetResource;
import com.google.ads.googleads.v24.errors.GoogleAdsError;
import com.google.ads.googleads.v24.errors.GoogleAdsException;
import com.google.ads.googleads.v24.errors.GoogleAdsFailure;
import com.google.ads.googleads.v24.resources.CustomerUserAccessInvitation;
import com.google.ads.googleads.v24.resources.CustomerUserAccessInvitationReview;
import com.google.ads.googleads.v24.resources.CustomerUserAccessReview;
import com.google.ads.googleads.v24.resources.MultiPartyAuthReview;
import com.google.ads.googleads.v24.services.GoogleAdsRow;
import com.google.ads.googleads.v24.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v24.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v24.services.MultiPartyAuthReviewServiceClient;
import com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewOperation;
import com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewResponse;
import com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewResultOrError;
import com.google.ads.googleads.v24.utils.ErrorUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Fetches pending multi-party auth reviews for a customer account and approves them.
 */
public class FetchAndApprovePendingMultiPartyAuthReviews {

  private static class FetchAndApprovePendingMultiPartyAuthReviewsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    FetchAndApprovePendingMultiPartyAuthReviewsParams params =
        new FetchAndApprovePendingMultiPartyAuthReviewsParams();
    if (!params.parseArguments(args)) {
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
    }

    GoogleAdsClient googleAdsClient = null;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      System.exit(1);
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      System.exit(1);
    }

    try {
      new FetchAndApprovePendingMultiPartyAuthReviews().runExample(googleAdsClient, params.customerId);
    } catch (GoogleAdsException gae) {
      System.err.printf(
          "Request ID %s failed due to GoogleAdsException. Underlying errors:%n",
          gae.getRequestId());
      int i = 0;
      for (GoogleAdsError googleAdsError : gae.getGoogleAdsFailure().getErrorsList()) {
        System.err.printf("  Error %d: %s%n", i++, googleAdsError);
      }
      System.exit(1);
    }
  }

  /**
   * Runs the example.
   *
   * @param client The Google Ads client.
   * @param customerId The Google Ads customer ID.
   */
  private void runExample(GoogleAdsClient client, long customerId) {
    List<String> pendingReviews = fetchPendingMPAReviews(client, customerId);
    
    if (!pendingReviews.isEmpty()) {
      // Multi party auth reviews can only be resolved one at a time. In this code
      // example, we illustrate approving the first pending review request.
      approveMPAReview(client, customerId, pendingReviews.get(0));
    }
  }

  // [START approve_mpa_review]
  /**
   * Approves the MPA auth review.
   *
   * @param client The Google Ads client.
   * @param customerId The Google Ads customer ID.
   * @param pendingReview The pending multi-party auth review resource name to be approved.
   */
  private void approveMPAReview(GoogleAdsClient client, long customerId, String pendingReview) {
    // Currently, you can only approve one request at a time. In addition, the approvals
    // can only be done by a second administrator.
    ResolveMultiPartyAuthReviewOperation operation =
        ResolveMultiPartyAuthReviewOperation.newBuilder()
            .setMultiPartyAuthReview(pendingReview)
            .setNewStatus(MultiPartyAuthReviewStatus.APPROVED)
            .build();

    try (MultiPartyAuthReviewServiceClient mpaReviewService =
        client.getLatestVersion().createMultiPartyAuthReviewServiceClient()) {
      ResolveMultiPartyAuthReviewResponse response =
          mpaReviewService.resolveMultiPartyAuthReview(
              String.valueOf(customerId), Collections.singletonList(operation));

      ResolveMultiPartyAuthReviewResultOrError resultOrError = response.getResultOrError(0);
      if (resultOrError.hasResult()) {
        System.out.printf(
            "Approved multi-party auth review: %s.%n",
            resultOrError.getResult().getMultiPartyAuthReview());
        if (resultOrError.getResult().hasCustomerUserAccessInvitation()) {
          System.out.printf(
              "New user invitation created: %s%n",
              resultOrError.getResult().getCustomerUserAccessInvitation());
        } else if (resultOrError.getResult().hasCustomerUserAccess()) {
          System.out.printf(
              "Affected customer user access resource: %s%n",
              resultOrError.getResult().getCustomerUserAccess());
        }
      } else if (resultOrError.hasPartialFailureError()) {
        GoogleAdsFailure failure =
            ErrorUtils.getInstance().getGoogleAdsFailure(resultOrError.getPartialFailureError());
        System.out.printf(
            "%d partial failure error(s) occurred%n",
            failure.getErrorsCount());
      }
    }
  }
  // [END approve_mpa_review]

  // [START fetch_mpa_review]
  /**
   * Fetches the pending MPA reviews.
   *
   * @param client The Google Ads client.
   * @param customerId The Google Ads customer ID.
   * @return A list of resource names for the pending multi-party auth reviews.
   */
  private List<String> fetchPendingMPAReviews(GoogleAdsClient client, long customerId) {
    List<String> pendingReviews = new ArrayList<>();

    // Create a query that will retrieve all the pending MPA reviews.
    String query =
        "SELECT "
            + "multi_party_auth_review.resource_name, "
            + "multi_party_auth_review.review_id, "
            + "multi_party_auth_review.creation_date_time, "
            + "multi_party_auth_review.request_user_email, "
            + "multi_party_auth_review.operation_type, "
            + "multi_party_auth_review.justification, "
            + "multi_party_auth_review.target_resource, "
            + "multi_party_auth_review.customer_user_access_review.old_customer_user_access, "
            + "multi_party_auth_review.customer_user_access_review.new_customer_user_access, "
            + "multi_party_auth_review.customer_user_access_invitation_review.new_customer_user_access_invitation "
            + "FROM multi_party_auth_review "
            + "WHERE multi_party_auth_review.review_status = 'PENDING'";

    try (GoogleAdsServiceClient googleAdsServiceClient =
        client.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchPagedResponse response =
          googleAdsServiceClient.search(String.valueOf(customerId), query);

      for (GoogleAdsRow googleAdsRow : response.iterateAll()) {
        MultiPartyAuthReview mpaReview = googleAdsRow.getMultiPartyAuthReview();
        System.out.printf(
            "%s created a pending multi-party auth review with ID %d "
                + "at %s. This request is for target resource type = %s and operation type = "
                + "%s. The justification is \"%s\".%n",
            mpaReview.getRequestUserEmail(),
            mpaReview.getMultiPartyAuthReviewId(),
            mpaReview.getCreationDateTime(),
            mpaReview.getTargetResource(),
            mpaReview.getOperationType(),
            mpaReview.getJustification());

        if (mpaReview.getTargetResource() == MultiPartyAuthReviewTargetResource.CUSTOMER_USER_ACCESS) {
          CustomerUserAccessReview accessReview = mpaReview.getCustomerUserAccessReview();
          if (mpaReview.getOperationType() == MultiPartyAuthOperationType.UPDATE) {
            // When updating a customer user access, only the new access level is populated.
            System.out.printf(
                "Old resource name: %s, new access role: %s.%n",
                accessReview.getOldCustomerUserAccess(),
                accessReview.getNewCustomerUserAccess().getAccessRole());
          } else if (mpaReview.getOperationType() == MultiPartyAuthOperationType.REMOVE) {
            System.out.printf(
                "Old resource name: %s.%n", accessReview.getOldCustomerUserAccess());
          }
        } else if (mpaReview.getTargetResource()
            == MultiPartyAuthReviewTargetResource.CUSTOMER_USER_ACCESS_INVITATION) {
          CustomerUserAccessInvitation newInvite =
              mpaReview.getCustomerUserAccessInvitationReview().getNewCustomerUserAccessInvitation();
          System.out.printf(
              "Invitation email address: %s, Role: %s.%n",
              newInvite.getEmailAddress(), newInvite.getAccessRole());
        }

        pendingReviews.add(mpaReview.getResourceName());
      }
    }
    return pendingReviews;
  }
  // [END fetch_mpa_review]
}
