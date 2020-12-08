/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.services;

import com.google.ads.googleads.v6.resources.CampaignDraft;
import com.google.ads.googleads.v6.services.CampaignDraftServiceGrpc.CampaignDraftServiceImplBase;
import com.google.api.core.BetaApi;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockCampaignDraftServiceImpl extends CampaignDraftServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockCampaignDraftServiceImpl() {
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
  public void getCampaignDraft(
      GetCampaignDraftRequest request, StreamObserver<CampaignDraft> responseObserver) {
    Object response = responses.remove();
    if (response instanceof CampaignDraft) {
      requests.add(request);
      responseObserver.onNext(((CampaignDraft) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void mutateCampaignDrafts(
      MutateCampaignDraftsRequest request,
      StreamObserver<MutateCampaignDraftsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof MutateCampaignDraftsResponse) {
      requests.add(request);
      responseObserver.onNext(((MutateCampaignDraftsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void promoteCampaignDraft(
      PromoteCampaignDraftRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext(((Operation) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void listCampaignDraftAsyncErrors(
      ListCampaignDraftAsyncErrorsRequest request,
      StreamObserver<ListCampaignDraftAsyncErrorsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ListCampaignDraftAsyncErrorsResponse) {
      requests.add(request);
      responseObserver.onNext(((ListCampaignDraftAsyncErrorsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }
}
