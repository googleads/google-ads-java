package com.google.ads.googleads.v0.services;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * Service to manage campaign budgets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/ads/googleads/v0/services/campaign_budget_service.proto")
public final class CampaignBudgetServiceGrpc {

  private CampaignBudgetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.CampaignBudgetService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignBudgetRequest,
      com.google.ads.googleads.v0.resources.CampaignBudget> METHOD_GET_CAMPAIGN_BUDGET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.ads.googleads.v0.services.CampaignBudgetService", "GetCampaignBudget"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.ads.googleads.v0.services.GetCampaignBudgetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.ads.googleads.v0.resources.CampaignBudget.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignBudgetsRequest,
      com.google.ads.googleads.v0.services.MutateCampaignBudgetsResponse> METHOD_MUTATE_CAMPAIGN_BUDGETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.ads.googleads.v0.services.CampaignBudgetService", "MutateCampaignBudgets"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.ads.googleads.v0.services.MutateCampaignBudgetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.ads.googleads.v0.services.MutateCampaignBudgetsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignBudgetServiceStub newStub(io.grpc.Channel channel) {
    return new CampaignBudgetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignBudgetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CampaignBudgetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignBudgetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CampaignBudgetServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage campaign budgets.
   * </pre>
   */
  public static abstract class CampaignBudgetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested Campaign Budget in full detail.
     * </pre>
     */
    public void getCampaignBudget(com.google.ads.googleads.v0.services.GetCampaignBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CampaignBudget> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CAMPAIGN_BUDGET, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign budgets. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCampaignBudgets(com.google.ads.googleads.v0.services.MutateCampaignBudgetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateCampaignBudgetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MUTATE_CAMPAIGN_BUDGETS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_CAMPAIGN_BUDGET,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.GetCampaignBudgetRequest,
                com.google.ads.googleads.v0.resources.CampaignBudget>(
                  this, METHODID_GET_CAMPAIGN_BUDGET)))
          .addMethod(
            METHOD_MUTATE_CAMPAIGN_BUDGETS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.MutateCampaignBudgetsRequest,
                com.google.ads.googleads.v0.services.MutateCampaignBudgetsResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_BUDGETS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign budgets.
   * </pre>
   */
  public static final class CampaignBudgetServiceStub extends io.grpc.stub.AbstractStub<CampaignBudgetServiceStub> {
    private CampaignBudgetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignBudgetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBudgetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignBudgetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Campaign Budget in full detail.
     * </pre>
     */
    public void getCampaignBudget(com.google.ads.googleads.v0.services.GetCampaignBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CampaignBudget> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CAMPAIGN_BUDGET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign budgets. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCampaignBudgets(com.google.ads.googleads.v0.services.MutateCampaignBudgetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateCampaignBudgetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MUTATE_CAMPAIGN_BUDGETS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign budgets.
   * </pre>
   */
  public static final class CampaignBudgetServiceBlockingStub extends io.grpc.stub.AbstractStub<CampaignBudgetServiceBlockingStub> {
    private CampaignBudgetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignBudgetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBudgetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignBudgetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Campaign Budget in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v0.resources.CampaignBudget getCampaignBudget(com.google.ads.googleads.v0.services.GetCampaignBudgetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CAMPAIGN_BUDGET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign budgets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v0.services.MutateCampaignBudgetsResponse mutateCampaignBudgets(com.google.ads.googleads.v0.services.MutateCampaignBudgetsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MUTATE_CAMPAIGN_BUDGETS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign budgets.
   * </pre>
   */
  public static final class CampaignBudgetServiceFutureStub extends io.grpc.stub.AbstractStub<CampaignBudgetServiceFutureStub> {
    private CampaignBudgetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignBudgetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBudgetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignBudgetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Campaign Budget in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.resources.CampaignBudget> getCampaignBudget(
        com.google.ads.googleads.v0.services.GetCampaignBudgetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CAMPAIGN_BUDGET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign budgets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.services.MutateCampaignBudgetsResponse> mutateCampaignBudgets(
        com.google.ads.googleads.v0.services.MutateCampaignBudgetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MUTATE_CAMPAIGN_BUDGETS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_BUDGET = 0;
  private static final int METHODID_MUTATE_CAMPAIGN_BUDGETS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignBudgetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignBudgetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_BUDGET:
          serviceImpl.getCampaignBudget((com.google.ads.googleads.v0.services.GetCampaignBudgetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CampaignBudget>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_BUDGETS:
          serviceImpl.mutateCampaignBudgets((com.google.ads.googleads.v0.services.MutateCampaignBudgetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateCampaignBudgetsResponse>) responseObserver);
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

  private static final class CampaignBudgetServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.CampaignBudgetServiceProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CampaignBudgetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignBudgetServiceDescriptorSupplier())
              .addMethod(METHOD_GET_CAMPAIGN_BUDGET)
              .addMethod(METHOD_MUTATE_CAMPAIGN_BUDGETS)
              .build();
        }
      }
    }
    return result;
  }
}
