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

import com.google.ads.googleads.v8.resources.AccountLink;
import com.google.ads.googleads.v8.services.AccountLinkServiceGrpc.AccountLinkServiceImplBase;
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
public class MockAccountLinkServiceImpl extends AccountLinkServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockAccountLinkServiceImpl() {
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
  public void getAccountLink(
      GetAccountLinkRequest request, StreamObserver<AccountLink> responseObserver) {
    Object response = responses.poll();
    if (response instanceof AccountLink) {
      requests.add(request);
      responseObserver.onNext(((AccountLink) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetAccountLink, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  AccountLink.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void createAccountLink(
      CreateAccountLinkRequest request,
      StreamObserver<CreateAccountLinkResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof CreateAccountLinkResponse) {
      requests.add(request);
      responseObserver.onNext(((CreateAccountLinkResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CreateAccountLink, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  CreateAccountLinkResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void mutateAccountLink(
      MutateAccountLinkRequest request,
      StreamObserver<MutateAccountLinkResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof MutateAccountLinkResponse) {
      requests.add(request);
      responseObserver.onNext(((MutateAccountLinkResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method MutateAccountLink, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  MutateAccountLinkResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
