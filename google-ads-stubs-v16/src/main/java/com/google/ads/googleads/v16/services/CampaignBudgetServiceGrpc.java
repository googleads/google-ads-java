package com.google.ads.googleads.v16.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage campaign budgets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v16/services/campaign_budget_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampaignBudgetServiceGrpc {

  private CampaignBudgetServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v16.services.CampaignBudgetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateCampaignBudgetsRequest,
      com.google.ads.googleads.v16.services.MutateCampaignBudgetsResponse> getMutateCampaignBudgetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignBudgets",
      requestType = com.google.ads.googleads.v16.services.MutateCampaignBudgetsRequest.class,
      responseType = com.google.ads.googleads.v16.services.MutateCampaignBudgetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateCampaignBudgetsRequest,
      com.google.ads.googleads.v16.services.MutateCampaignBudgetsResponse> getMutateCampaignBudgetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateCampaignBudgetsRequest, com.google.ads.googleads.v16.services.MutateCampaignBudgetsResponse> getMutateCampaignBudgetsMethod;
    if ((getMutateCampaignBudgetsMethod = CampaignBudgetServiceGrpc.getMutateCampaignBudgetsMethod) == null) {
      synchronized (CampaignBudgetServiceGrpc.class) {
        if ((getMutateCampaignBudgetsMethod = CampaignBudgetServiceGrpc.getMutateCampaignBudgetsMethod) == null) {
          CampaignBudgetServiceGrpc.getMutateCampaignBudgetsMethod = getMutateCampaignBudgetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v16.services.MutateCampaignBudgetsRequest, com.google.ads.googleads.v16.services.MutateCampaignBudgetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignBudgets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v16.services.MutateCampaignBudgetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v16.services.MutateCampaignBudgetsResponse.getDefaultInstance()))
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
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes campaign budgets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignBudgetError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    default void mutateCampaignBudgets(com.google.ads.googleads.v16.services.MutateCampaignBudgetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateCampaignBudgetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCampaignBudgetsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CampaignBudgetService.
   * <pre>
   * Service to manage campaign budgets.
   * </pre>
   */
  public static abstract class CampaignBudgetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CampaignBudgetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CampaignBudgetService.
   * <pre>
   * Service to manage campaign budgets.
   * </pre>
   */
  public static final class CampaignBudgetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CampaignBudgetServiceStub> {
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
     * Creates, updates, or removes campaign budgets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignBudgetError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateCampaignBudgets(com.google.ads.googleads.v16.services.MutateCampaignBudgetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateCampaignBudgetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCampaignBudgetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CampaignBudgetService.
   * <pre>
   * Service to manage campaign budgets.
   * </pre>
   */
  public static final class CampaignBudgetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CampaignBudgetServiceBlockingStub> {
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
     * Creates, updates, or removes campaign budgets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignBudgetError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v16.services.MutateCampaignBudgetsResponse mutateCampaignBudgets(com.google.ads.googleads.v16.services.MutateCampaignBudgetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignBudgetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CampaignBudgetService.
   * <pre>
   * Service to manage campaign budgets.
   * </pre>
   */
  public static final class CampaignBudgetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CampaignBudgetServiceFutureStub> {
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
     * Creates, updates, or removes campaign budgets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignBudgetError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [OperationAccessDeniedError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v16.services.MutateCampaignBudgetsResponse> mutateCampaignBudgets(
        com.google.ads.googleads.v16.services.MutateCampaignBudgetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCampaignBudgetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CAMPAIGN_BUDGETS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_CAMPAIGN_BUDGETS:
          serviceImpl.mutateCampaignBudgets((com.google.ads.googleads.v16.services.MutateCampaignBudgetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateCampaignBudgetsResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMutateCampaignBudgetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v16.services.MutateCampaignBudgetsRequest,
              com.google.ads.googleads.v16.services.MutateCampaignBudgetsResponse>(
                service, METHODID_MUTATE_CAMPAIGN_BUDGETS)))
        .build();
  }

  private static abstract class CampaignBudgetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignBudgetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v16.services.CampaignBudgetServiceProto.getDescriptor();
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
    private final java.lang.String methodName;

    CampaignBudgetServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getMutateCampaignBudgetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
