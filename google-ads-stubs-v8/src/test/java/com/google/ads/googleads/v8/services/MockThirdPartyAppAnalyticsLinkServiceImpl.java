/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v8.services;

import com.google.ads.googleads.v8.resources.ThirdPartyAppAnalyticsLink;
import com.google.ads.googleads.v8.services.ThirdPartyAppAnalyticsLinkServiceGrpc.ThirdPartyAppAnalyticsLinkServiceImplBase;
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
public class MockThirdPartyAppAnalyticsLinkServiceImpl
    extends ThirdPartyAppAnalyticsLinkServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockThirdPartyAppAnalyticsLinkServiceImpl() {
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
  public void getThirdPartyAppAnalyticsLink(
      GetThirdPartyAppAnalyticsLinkRequest request,
      StreamObserver<ThirdPartyAppAnalyticsLink> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ThirdPartyAppAnalyticsLink) {
      requests.add(request);
      responseObserver.onNext(((ThirdPartyAppAnalyticsLink) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetThirdPartyAppAnalyticsLink, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ThirdPartyAppAnalyticsLink.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void regenerateShareableLinkId(
      RegenerateShareableLinkIdRequest request,
      StreamObserver<RegenerateShareableLinkIdResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof RegenerateShareableLinkIdResponse) {
      requests.add(request);
      responseObserver.onNext(((RegenerateShareableLinkIdResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method RegenerateShareableLinkId, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  RegenerateShareableLinkIdResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
