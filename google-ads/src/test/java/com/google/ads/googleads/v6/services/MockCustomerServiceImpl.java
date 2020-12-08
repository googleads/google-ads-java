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

import com.google.ads.googleads.v6.resources.Customer;
import com.google.ads.googleads.v6.services.CustomerServiceGrpc.CustomerServiceImplBase;
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
public class MockCustomerServiceImpl extends CustomerServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockCustomerServiceImpl() {
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
  public void getCustomer(GetCustomerRequest request, StreamObserver<Customer> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Customer) {
      requests.add(request);
      responseObserver.onNext(((Customer) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void mutateCustomer(
      MutateCustomerRequest request, StreamObserver<MutateCustomerResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof MutateCustomerResponse) {
      requests.add(request);
      responseObserver.onNext(((MutateCustomerResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void listAccessibleCustomers(
      ListAccessibleCustomersRequest request,
      StreamObserver<ListAccessibleCustomersResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ListAccessibleCustomersResponse) {
      requests.add(request);
      responseObserver.onNext(((ListAccessibleCustomersResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void createCustomerClient(
      CreateCustomerClientRequest request,
      StreamObserver<CreateCustomerClientResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof CreateCustomerClientResponse) {
      requests.add(request);
      responseObserver.onNext(((CreateCustomerClientResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }
}
