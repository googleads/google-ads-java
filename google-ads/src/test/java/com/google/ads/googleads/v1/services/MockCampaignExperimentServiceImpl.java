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

import com.google.ads.googleads.v1.resources.CampaignExperiment;
import com.google.ads.googleads.v1.services.CampaignExperimentServiceGrpc.CampaignExperimentServiceImplBase;
import com.google.api.core.BetaApi;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.GeneratedMessageV3;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@javax.annotation.Generated("by GAPIC")
@BetaApi
public class MockCampaignExperimentServiceImpl extends CampaignExperimentServiceImplBase {
  private ArrayList<GeneratedMessageV3> requests;
  private Queue<Object> responses;

  public MockCampaignExperimentServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<GeneratedMessageV3> getRequests() {
    return requests;
  }

  public void addResponse(GeneratedMessageV3 response) {
    responses.add(response);
  }

  public void setResponses(List<GeneratedMessageV3> responses) {
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
  public void getCampaignExperiment(
      GetCampaignExperimentRequest request, StreamObserver<CampaignExperiment> responseObserver) {
    Object response = responses.remove();
    if (response instanceof CampaignExperiment) {
      requests.add(request);
      responseObserver.onNext((CampaignExperiment) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void createCampaignExperiment(
      CreateCampaignExperimentRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext((Operation) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void mutateCampaignExperiments(
      MutateCampaignExperimentsRequest request,
      StreamObserver<MutateCampaignExperimentsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof MutateCampaignExperimentsResponse) {
      requests.add(request);
      responseObserver.onNext((MutateCampaignExperimentsResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void graduateCampaignExperiment(
      GraduateCampaignExperimentRequest request,
      StreamObserver<GraduateCampaignExperimentResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof GraduateCampaignExperimentResponse) {
      requests.add(request);
      responseObserver.onNext((GraduateCampaignExperimentResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void promoteCampaignExperiment(
      PromoteCampaignExperimentRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext((Operation) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void endCampaignExperiment(
      EndCampaignExperimentRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext((Empty) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void listCampaignExperimentAsyncErrors(
      ListCampaignExperimentAsyncErrorsRequest request,
      StreamObserver<ListCampaignExperimentAsyncErrorsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ListCampaignExperimentAsyncErrorsResponse) {
      requests.add(request);
      responseObserver.onNext((ListCampaignExperimentAsyncErrorsResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }
}
