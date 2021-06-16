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

import com.google.ads.googleads.v8.resources.CampaignExperiment;
import com.google.ads.googleads.v8.services.CampaignExperimentServiceGrpc.CampaignExperimentServiceImplBase;
import com.google.api.core.BetaApi;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockCampaignExperimentServiceImpl extends CampaignExperimentServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockCampaignExperimentServiceImpl() {
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
  public void getCampaignExperiment(
      GetCampaignExperimentRequest request, StreamObserver<CampaignExperiment> responseObserver) {
    Object response = responses.poll();
    if (response instanceof CampaignExperiment) {
      requests.add(request);
      responseObserver.onNext(((CampaignExperiment) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetCampaignExperiment, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  CampaignExperiment.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void createCampaignExperiment(
      CreateCampaignExperimentRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext(((Operation) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CreateCampaignExperiment, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Operation.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void mutateCampaignExperiments(
      MutateCampaignExperimentsRequest request,
      StreamObserver<MutateCampaignExperimentsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof MutateCampaignExperimentsResponse) {
      requests.add(request);
      responseObserver.onNext(((MutateCampaignExperimentsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method MutateCampaignExperiments, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  MutateCampaignExperimentsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void graduateCampaignExperiment(
      GraduateCampaignExperimentRequest request,
      StreamObserver<GraduateCampaignExperimentResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof GraduateCampaignExperimentResponse) {
      requests.add(request);
      responseObserver.onNext(((GraduateCampaignExperimentResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GraduateCampaignExperiment, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  GraduateCampaignExperimentResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void promoteCampaignExperiment(
      PromoteCampaignExperimentRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext(((Operation) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method PromoteCampaignExperiment, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Operation.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void endCampaignExperiment(
      EndCampaignExperimentRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method EndCampaignExperiment, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listCampaignExperimentAsyncErrors(
      ListCampaignExperimentAsyncErrorsRequest request,
      StreamObserver<ListCampaignExperimentAsyncErrorsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListCampaignExperimentAsyncErrorsResponse) {
      requests.add(request);
      responseObserver.onNext(((ListCampaignExperimentAsyncErrorsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListCampaignExperimentAsyncErrors, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListCampaignExperimentAsyncErrorsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
