package com.google.ads.googleads.v5.services;

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
 * Service to manage campaign budgets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v5/services/campaign_budget_service.proto")
public final class CampaignBudgetServiceGrpc {

  private CampaignBudgetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v5.services.CampaignBudgetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetCampaignBudgetRequest,
      com.google.ads.googleads.v5.resources.CampaignBudget> getGetCampaignBudgetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaignBudget",
      requestType = com.google.ads.googleads.v5.services.GetCampaignBudgetRequest.class,
      responseType = com.google.ads.googleads.v5.resources.CampaignBudget.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetCampaignBudgetRequest,
      com.google.ads.googleads.v5.resources.CampaignBudget> getGetCampaignBudgetMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetCampaignBudgetRequest, com.google.ads.googleads.v5.resources.CampaignBudget> getGetCampaignBudgetMethod;
    if ((getGetCampaignBudgetMethod = CampaignBudgetServiceGrpc.getGetCampaignBudgetMethod) == null) {
      synchronized (CampaignBudgetServiceGrpc.class) {
        if ((getGetCampaignBudgetMethod = CampaignBudgetServiceGrpc.getGetCampaignBudgetMethod) == null) {
          CampaignBudgetServiceGrpc.getGetCampaignBudgetMethod = getGetCampaignBudgetMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.GetCampaignBudgetRequest, com.google.ads.googleads.v5.resources.CampaignBudget>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaignBudget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.GetCampaignBudgetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.resources.CampaignBudget.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignBudgetServiceMethodDescriptorSupplier("GetCampaignBudget"))
              .build();
        }
      }
    }
    return getGetCampaignBudgetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateCampaignBudgetsRequest,
      com.google.ads.googleads.v5.services.MutateCampaignBudgetsResponse> getMutateCampaignBudgetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignBudgets",
      requestType = com.google.ads.googleads.v5.services.MutateCampaignBudgetsRequest.class,
      responseType = com.google.ads.googleads.v5.services.MutateCampaignBudgetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateCampaignBudgetsRequest,
      com.google.ads.googleads.v5.services.MutateCampaignBudgetsResponse> getMutateCampaignBudgetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateCampaignBudgetsRequest, com.google.ads.googleads.v5.services.MutateCampaignBudgetsResponse> getMutateCampaignBudgetsMethod;
    if ((getMutateCampaignBudgetsMethod = CampaignBudgetServiceGrpc.getMutateCampaignBudgetsMethod) == null) {
      synchronized (CampaignBudgetServiceGrpc.class) {
        if ((getMutateCampaignBudgetsMethod = CampaignBudgetServiceGrpc.getMutateCampaignBudgetsMethod) == null) {
          CampaignBudgetServiceGrpc.getMutateCampaignBudgetsMethod = getMutateCampaignBudgetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.MutateCampaignBudgetsRequest, com.google.ads.googleads.v5.services.MutateCampaignBudgetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignBudgets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.MutateCampaignBudgetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.MutateCampaignBudgetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignBudgetServiceMethodDescriptorSupplier("MutateCampaignBudgets"))
              .build();
        }
      }
    }
    return getMutateCampaignBudgetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignBudgetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignBudgetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignBudgetServiceStub>() {
        @java.lang.Override
        public CampaignBudgetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignBudgetServiceStub(channel, callOptions);
        }
      };
    return CampaignBudgetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignBudgetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignBudgetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignBudgetServiceBlockingStub>() {
        @java.lang.Override
        public CampaignBudgetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignBudgetServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignBudgetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignBudgetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignBudgetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignBudgetServiceFutureStub>() {
        @java.lang.Override
        public CampaignBudgetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignBudgetServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignBudgetServiceFutureStub.newStub(factory, channel);
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
    public void getCampaignBudget(com.google.ads.googleads.v5.services.GetCampaignBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.CampaignBudget> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignBudgetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign budgets. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCampaignBudgets(com.google.ads.googleads.v5.services.MutateCampaignBudgetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateCampaignBudgetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCampaignBudgetsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignBudgetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.GetCampaignBudgetRequest,
                com.google.ads.googleads.v5.resources.CampaignBudget>(
                  this, METHODID_GET_CAMPAIGN_BUDGET)))
          .addMethod(
            getMutateCampaignBudgetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.MutateCampaignBudgetsRequest,
                com.google.ads.googleads.v5.services.MutateCampaignBudgetsResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_BUDGETS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign budgets.
   * </pre>
   */
  public static final class CampaignBudgetServiceStub extends io.grpc.stub.AbstractAsyncStub<CampaignBudgetServiceStub> {
    private CampaignBudgetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBudgetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignBudgetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Campaign Budget in full detail.
     * </pre>
     */
    public void getCampaignBudget(com.google.ads.googleads.v5.services.GetCampaignBudgetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.CampaignBudget> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignBudgetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign budgets. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCampaignBudgets(com.google.ads.googleads.v5.services.MutateCampaignBudgetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateCampaignBudgetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCampaignBudgetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign budgets.
   * </pre>
   */
  public static final class CampaignBudgetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignBudgetServiceBlockingStub> {
    private CampaignBudgetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBudgetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignBudgetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Campaign Budget in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v5.resources.CampaignBudget getCampaignBudget(com.google.ads.googleads.v5.services.GetCampaignBudgetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignBudgetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign budgets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v5.services.MutateCampaignBudgetsResponse mutateCampaignBudgets(com.google.ads.googleads.v5.services.MutateCampaignBudgetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCampaignBudgetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign budgets.
   * </pre>
   */
  public static final class CampaignBudgetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignBudgetServiceFutureStub> {
    private CampaignBudgetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBudgetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignBudgetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Campaign Budget in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.resources.CampaignBudget> getCampaignBudget(
        com.google.ads.googleads.v5.services.GetCampaignBudgetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignBudgetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign budgets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.services.MutateCampaignBudgetsResponse> mutateCampaignBudgets(
        com.google.ads.googleads.v5.services.MutateCampaignBudgetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCampaignBudgetsMethod(), getCallOptions()), request);
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
          serviceImpl.getCampaignBudget((com.google.ads.googleads.v5.services.GetCampaignBudgetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.CampaignBudget>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_BUDGETS:
          serviceImpl.mutateCampaignBudgets((com.google.ads.googleads.v5.services.MutateCampaignBudgetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateCampaignBudgetsResponse>) responseObserver);
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

  private static abstract class CampaignBudgetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignBudgetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v5.services.CampaignBudgetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignBudgetService");
    }
  }

  private static final class CampaignBudgetServiceFileDescriptorSupplier
      extends CampaignBudgetServiceBaseDescriptorSupplier {
    CampaignBudgetServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignBudgetServiceMethodDescriptorSupplier
      extends CampaignBudgetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignBudgetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignBudgetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignBudgetServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignBudgetMethod())
              .addMethod(getMutateCampaignBudgetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
