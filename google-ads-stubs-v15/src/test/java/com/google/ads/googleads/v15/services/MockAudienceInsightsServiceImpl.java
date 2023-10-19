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

package com.google.ads.googleads.v15.services;

import com.google.ads.googleads.v15.services.AudienceInsightsServiceGrpc.AudienceInsightsServiceImplBase;
import com.google.api.core.BetaApi;
import com.google.protobuf.AbstractMessage;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockAudienceInsightsServiceImpl extends AudienceInsightsServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockAudienceInsightsServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void generateInsightsFinderReport(
      GenerateInsightsFinderReportRequest request,
      StreamObserver<GenerateInsightsFinderReportResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof GenerateInsightsFinderReportResponse) {
      requests.add(request);
      responseObserver.onNext(((GenerateInsightsFinderReportResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GenerateInsightsFinderReport, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  GenerateInsightsFinderReportResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listAudienceInsightsAttributes(
      ListAudienceInsightsAttributesRequest request,
      StreamObserver<ListAudienceInsightsAttributesResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListAudienceInsightsAttributesResponse) {
      requests.add(request);
      responseObserver.onNext(((ListAudienceInsightsAttributesResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListAudienceInsightsAttributes, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListAudienceInsightsAttributesResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listInsightsEligibleDates(
      ListInsightsEligibleDatesRequest request,
      StreamObserver<ListInsightsEligibleDatesResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListInsightsEligibleDatesResponse) {
      requests.add(request);
      responseObserver.onNext(((ListInsightsEligibleDatesResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListInsightsEligibleDates, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListInsightsEligibleDatesResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void generateAudienceCompositionInsights(
      GenerateAudienceCompositionInsightsRequest request,
      StreamObserver<GenerateAudienceCompositionInsightsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof GenerateAudienceCompositionInsightsResponse) {
      requests.add(request);
      responseObserver.onNext(((GenerateAudienceCompositionInsightsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GenerateAudienceCompositionInsights, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  GenerateAudienceCompositionInsightsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void generateSuggestedTargetingInsights(
      GenerateSuggestedTargetingInsightsRequest request,
      StreamObserver<GenerateSuggestedTargetingInsightsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof GenerateSuggestedTargetingInsightsResponse) {
      requests.add(request);
      responseObserver.onNext(((GenerateSuggestedTargetingInsightsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GenerateSuggestedTargetingInsights, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  GenerateSuggestedTargetingInsightsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
