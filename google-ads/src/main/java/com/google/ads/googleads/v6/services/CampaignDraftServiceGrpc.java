package com.google.ads.googleads.v6.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service to manage campaign drafts.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/campaign_draft_service.proto")
public final class CampaignDraftServiceGrpc {

  private CampaignDraftServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.CampaignDraftService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCampaignDraftRequest,
      com.google.ads.googleads.v6.resources.CampaignDraft> getGetCampaignDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaignDraft",
      requestType = com.google.ads.googleads.v6.services.GetCampaignDraftRequest.class,
      responseType = com.google.ads.googleads.v6.resources.CampaignDraft.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCampaignDraftRequest,
      com.google.ads.googleads.v6.resources.CampaignDraft> getGetCampaignDraftMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCampaignDraftRequest, com.google.ads.googleads.v6.resources.CampaignDraft> getGetCampaignDraftMethod;
    if ((getGetCampaignDraftMethod = CampaignDraftServiceGrpc.getGetCampaignDraftMethod) == null) {
      synchronized (CampaignDraftServiceGrpc.class) {
        if ((getGetCampaignDraftMethod = CampaignDraftServiceGrpc.getGetCampaignDraftMethod) == null) {
          CampaignDraftServiceGrpc.getGetCampaignDraftMethod = getGetCampaignDraftMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetCampaignDraftRequest, com.google.ads.googleads.v6.resources.CampaignDraft>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaignDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetCampaignDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.CampaignDraft.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignDraftServiceMethodDescriptorSupplier("GetCampaignDraft"))
              .build();
        }
      }
    }
    return getGetCampaignDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCampaignDraftsRequest,
      com.google.ads.googleads.v6.services.MutateCampaignDraftsResponse> getMutateCampaignDraftsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignDrafts",
      requestType = com.google.ads.googleads.v6.services.MutateCampaignDraftsRequest.class,
      responseType = com.google.ads.googleads.v6.services.MutateCampaignDraftsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCampaignDraftsRequest,
      com.google.ads.googleads.v6.services.MutateCampaignDraftsResponse> getMutateCampaignDraftsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCampaignDraftsRequest, com.google.ads.googleads.v6.services.MutateCampaignDraftsResponse> getMutateCampaignDraftsMethod;
    if ((getMutateCampaignDraftsMethod = CampaignDraftServiceGrpc.getMutateCampaignDraftsMethod) == null) {
      synchronized (CampaignDraftServiceGrpc.class) {
        if ((getMutateCampaignDraftsMethod = CampaignDraftServiceGrpc.getMutateCampaignDraftsMethod) == null) {
          CampaignDraftServiceGrpc.getMutateCampaignDraftsMethod = getMutateCampaignDraftsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.MutateCampaignDraftsRequest, com.google.ads.googleads.v6.services.MutateCampaignDraftsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignDrafts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateCampaignDraftsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateCampaignDraftsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignDraftServiceMethodDescriptorSupplier("MutateCampaignDrafts"))
              .build();
        }
      }
    }
    return getMutateCampaignDraftsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.PromoteCampaignDraftRequest,
      com.google.longrunning.Operation> getPromoteCampaignDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PromoteCampaignDraft",
      requestType = com.google.ads.googleads.v6.services.PromoteCampaignDraftRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.PromoteCampaignDraftRequest,
      com.google.longrunning.Operation> getPromoteCampaignDraftMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.PromoteCampaignDraftRequest, com.google.longrunning.Operation> getPromoteCampaignDraftMethod;
    if ((getPromoteCampaignDraftMethod = CampaignDraftServiceGrpc.getPromoteCampaignDraftMethod) == null) {
      synchronized (CampaignDraftServiceGrpc.class) {
        if ((getPromoteCampaignDraftMethod = CampaignDraftServiceGrpc.getPromoteCampaignDraftMethod) == null) {
          CampaignDraftServiceGrpc.getPromoteCampaignDraftMethod = getPromoteCampaignDraftMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.PromoteCampaignDraftRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PromoteCampaignDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.PromoteCampaignDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignDraftServiceMethodDescriptorSupplier("PromoteCampaignDraft"))
              .build();
        }
      }
    }
    return getPromoteCampaignDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsRequest,
      com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsResponse> getListCampaignDraftAsyncErrorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCampaignDraftAsyncErrors",
      requestType = com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsRequest.class,
      responseType = com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsRequest,
      com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsResponse> getListCampaignDraftAsyncErrorsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsRequest, com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsResponse> getListCampaignDraftAsyncErrorsMethod;
    if ((getListCampaignDraftAsyncErrorsMethod = CampaignDraftServiceGrpc.getListCampaignDraftAsyncErrorsMethod) == null) {
      synchronized (CampaignDraftServiceGrpc.class) {
        if ((getListCampaignDraftAsyncErrorsMethod = CampaignDraftServiceGrpc.getListCampaignDraftAsyncErrorsMethod) == null) {
          CampaignDraftServiceGrpc.getListCampaignDraftAsyncErrorsMethod = getListCampaignDraftAsyncErrorsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsRequest, com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCampaignDraftAsyncErrors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignDraftServiceMethodDescriptorSupplier("ListCampaignDraftAsyncErrors"))
              .build();
        }
      }
    }
    return getListCampaignDraftAsyncErrorsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignDraftServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignDraftServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignDraftServiceStub>() {
        @java.lang.Override
        public CampaignDraftServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignDraftServiceStub(channel, callOptions);
        }
      };
    return CampaignDraftServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignDraftServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignDraftServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignDraftServiceBlockingStub>() {
        @java.lang.Override
        public CampaignDraftServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignDraftServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignDraftServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignDraftServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignDraftServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignDraftServiceFutureStub>() {
        @java.lang.Override
        public CampaignDraftServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignDraftServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignDraftServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage campaign drafts.
   * </pre>
   */
  public static abstract class CampaignDraftServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested campaign draft in full detail.
     * </pre>
     */
    public void getCampaignDraft(com.google.ads.googleads.v6.services.GetCampaignDraftRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.CampaignDraft> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign drafts. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCampaignDrafts(com.google.ads.googleads.v6.services.MutateCampaignDraftsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCampaignDraftsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCampaignDraftsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Promotes the changes in a draft back to the base campaign.
     * This method returns a Long Running Operation (LRO) indicating if the
     * Promote is done. Use [Operations.GetOperation] to poll the LRO until it
     * is done. Only a done status is returned in the response. See the status
     * in the Campaign Draft resource to determine if the promotion was
     * successful. If the LRO failed, use
     * [CampaignDraftService.ListCampaignDraftAsyncErrors][google.ads.googleads.v6.services.CampaignDraftService.ListCampaignDraftAsyncErrors] to view the list of
     * error reasons.
     * </pre>
     */
    public void promoteCampaignDraft(com.google.ads.googleads.v6.services.PromoteCampaignDraftRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getPromoteCampaignDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all errors that occurred during CampaignDraft promote. Throws an
     * error if called before campaign draft is promoted.
     * Supports standard list paging.
     * </pre>
     */
    public void listCampaignDraftAsyncErrors(com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCampaignDraftAsyncErrorsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignDraftMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetCampaignDraftRequest,
                com.google.ads.googleads.v6.resources.CampaignDraft>(
                  this, METHODID_GET_CAMPAIGN_DRAFT)))
          .addMethod(
            getMutateCampaignDraftsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.MutateCampaignDraftsRequest,
                com.google.ads.googleads.v6.services.MutateCampaignDraftsResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_DRAFTS)))
          .addMethod(
            getPromoteCampaignDraftMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.PromoteCampaignDraftRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_PROMOTE_CAMPAIGN_DRAFT)))
          .addMethod(
            getListCampaignDraftAsyncErrorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsRequest,
                com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsResponse>(
                  this, METHODID_LIST_CAMPAIGN_DRAFT_ASYNC_ERRORS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign drafts.
   * </pre>
   */
  public static final class CampaignDraftServiceStub extends io.grpc.stub.AbstractAsyncStub<CampaignDraftServiceStub> {
    private CampaignDraftServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignDraftServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignDraftServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign draft in full detail.
     * </pre>
     */
    public void getCampaignDraft(com.google.ads.googleads.v6.services.GetCampaignDraftRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.CampaignDraft> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign drafts. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCampaignDrafts(com.google.ads.googleads.v6.services.MutateCampaignDraftsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCampaignDraftsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCampaignDraftsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Promotes the changes in a draft back to the base campaign.
     * This method returns a Long Running Operation (LRO) indicating if the
     * Promote is done. Use [Operations.GetOperation] to poll the LRO until it
     * is done. Only a done status is returned in the response. See the status
     * in the Campaign Draft resource to determine if the promotion was
     * successful. If the LRO failed, use
     * [CampaignDraftService.ListCampaignDraftAsyncErrors][google.ads.googleads.v6.services.CampaignDraftService.ListCampaignDraftAsyncErrors] to view the list of
     * error reasons.
     * </pre>
     */
    public void promoteCampaignDraft(com.google.ads.googleads.v6.services.PromoteCampaignDraftRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPromoteCampaignDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all errors that occurred during CampaignDraft promote. Throws an
     * error if called before campaign draft is promoted.
     * Supports standard list paging.
     * </pre>
     */
    public void listCampaignDraftAsyncErrors(com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCampaignDraftAsyncErrorsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign drafts.
   * </pre>
   */
  public static final class CampaignDraftServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignDraftServiceBlockingStub> {
    private CampaignDraftServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignDraftServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignDraftServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign draft in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.CampaignDraft getCampaignDraft(com.google.ads.googleads.v6.services.GetCampaignDraftRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign drafts. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.MutateCampaignDraftsResponse mutateCampaignDrafts(com.google.ads.googleads.v6.services.MutateCampaignDraftsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCampaignDraftsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Promotes the changes in a draft back to the base campaign.
     * This method returns a Long Running Operation (LRO) indicating if the
     * Promote is done. Use [Operations.GetOperation] to poll the LRO until it
     * is done. Only a done status is returned in the response. See the status
     * in the Campaign Draft resource to determine if the promotion was
     * successful. If the LRO failed, use
     * [CampaignDraftService.ListCampaignDraftAsyncErrors][google.ads.googleads.v6.services.CampaignDraftService.ListCampaignDraftAsyncErrors] to view the list of
     * error reasons.
     * </pre>
     */
    public com.google.longrunning.Operation promoteCampaignDraft(com.google.ads.googleads.v6.services.PromoteCampaignDraftRequest request) {
      return blockingUnaryCall(
          getChannel(), getPromoteCampaignDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all errors that occurred during CampaignDraft promote. Throws an
     * error if called before campaign draft is promoted.
     * Supports standard list paging.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsResponse listCampaignDraftAsyncErrors(com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCampaignDraftAsyncErrorsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign drafts.
   * </pre>
   */
  public static final class CampaignDraftServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignDraftServiceFutureStub> {
    private CampaignDraftServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignDraftServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignDraftServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign draft in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.CampaignDraft> getCampaignDraft(
        com.google.ads.googleads.v6.services.GetCampaignDraftRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign drafts. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.MutateCampaignDraftsResponse> mutateCampaignDrafts(
        com.google.ads.googleads.v6.services.MutateCampaignDraftsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCampaignDraftsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Promotes the changes in a draft back to the base campaign.
     * This method returns a Long Running Operation (LRO) indicating if the
     * Promote is done. Use [Operations.GetOperation] to poll the LRO until it
     * is done. Only a done status is returned in the response. See the status
     * in the Campaign Draft resource to determine if the promotion was
     * successful. If the LRO failed, use
     * [CampaignDraftService.ListCampaignDraftAsyncErrors][google.ads.googleads.v6.services.CampaignDraftService.ListCampaignDraftAsyncErrors] to view the list of
     * error reasons.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> promoteCampaignDraft(
        com.google.ads.googleads.v6.services.PromoteCampaignDraftRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPromoteCampaignDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all errors that occurred during CampaignDraft promote. Throws an
     * error if called before campaign draft is promoted.
     * Supports standard list paging.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsResponse> listCampaignDraftAsyncErrors(
        com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCampaignDraftAsyncErrorsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_DRAFT = 0;
  private static final int METHODID_MUTATE_CAMPAIGN_DRAFTS = 1;
  private static final int METHODID_PROMOTE_CAMPAIGN_DRAFT = 2;
  private static final int METHODID_LIST_CAMPAIGN_DRAFT_ASYNC_ERRORS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignDraftServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignDraftServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_DRAFT:
          serviceImpl.getCampaignDraft((com.google.ads.googleads.v6.services.GetCampaignDraftRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.CampaignDraft>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_DRAFTS:
          serviceImpl.mutateCampaignDrafts((com.google.ads.googleads.v6.services.MutateCampaignDraftsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCampaignDraftsResponse>) responseObserver);
          break;
        case METHODID_PROMOTE_CAMPAIGN_DRAFT:
          serviceImpl.promoteCampaignDraft((com.google.ads.googleads.v6.services.PromoteCampaignDraftRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LIST_CAMPAIGN_DRAFT_ASYNC_ERRORS:
          serviceImpl.listCampaignDraftAsyncErrors((com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.ListCampaignDraftAsyncErrorsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CampaignDraftServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignDraftServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.CampaignDraftServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignDraftService");
    }
  }

  private static final class CampaignDraftServiceFileDescriptorSupplier
      extends CampaignDraftServiceBaseDescriptorSupplier {
    CampaignDraftServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignDraftServiceMethodDescriptorSupplier
      extends CampaignDraftServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignDraftServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CampaignDraftServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignDraftServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignDraftMethod())
              .addMethod(getMutateCampaignDraftsMethod())
              .addMethod(getPromoteCampaignDraftMethod())
              .addMethod(getListCampaignDraftAsyncErrorsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
