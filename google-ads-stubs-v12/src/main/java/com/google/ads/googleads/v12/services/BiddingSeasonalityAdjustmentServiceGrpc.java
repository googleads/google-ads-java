package com.google.ads.googleads.v12.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage bidding seasonality adjustments.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v12/services/bidding_seasonality_adjustment_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BiddingSeasonalityAdjustmentServiceGrpc {

  private BiddingSeasonalityAdjustmentServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v12.services.BiddingSeasonalityAdjustmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsRequest,
      com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsResponse> getMutateBiddingSeasonalityAdjustmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateBiddingSeasonalityAdjustments",
      requestType = com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsRequest.class,
      responseType = com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsRequest,
      com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsResponse> getMutateBiddingSeasonalityAdjustmentsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsRequest, com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsResponse> getMutateBiddingSeasonalityAdjustmentsMethod;
    if ((getMutateBiddingSeasonalityAdjustmentsMethod = BiddingSeasonalityAdjustmentServiceGrpc.getMutateBiddingSeasonalityAdjustmentsMethod) == null) {
      synchronized (BiddingSeasonalityAdjustmentServiceGrpc.class) {
        if ((getMutateBiddingSeasonalityAdjustmentsMethod = BiddingSeasonalityAdjustmentServiceGrpc.getMutateBiddingSeasonalityAdjustmentsMethod) == null) {
          BiddingSeasonalityAdjustmentServiceGrpc.getMutateBiddingSeasonalityAdjustmentsMethod = getMutateBiddingSeasonalityAdjustmentsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsRequest, com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateBiddingSeasonalityAdjustments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BiddingSeasonalityAdjustmentServiceMethodDescriptorSupplier("MutateBiddingSeasonalityAdjustments"))
              .build();
        }
      }
    }
    return getMutateBiddingSeasonalityAdjustmentsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BiddingSeasonalityAdjustmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BiddingSeasonalityAdjustmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BiddingSeasonalityAdjustmentServiceStub>() {
        @java.lang.Override
        public BiddingSeasonalityAdjustmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BiddingSeasonalityAdjustmentServiceStub(channel, callOptions);
        }
      };
    return BiddingSeasonalityAdjustmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BiddingSeasonalityAdjustmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BiddingSeasonalityAdjustmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BiddingSeasonalityAdjustmentServiceBlockingStub>() {
        @java.lang.Override
        public BiddingSeasonalityAdjustmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BiddingSeasonalityAdjustmentServiceBlockingStub(channel, callOptions);
        }
      };
    return BiddingSeasonalityAdjustmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BiddingSeasonalityAdjustmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BiddingSeasonalityAdjustmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BiddingSeasonalityAdjustmentServiceFutureStub>() {
        @java.lang.Override
        public BiddingSeasonalityAdjustmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BiddingSeasonalityAdjustmentServiceFutureStub(channel, callOptions);
        }
      };
    return BiddingSeasonalityAdjustmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage bidding seasonality adjustments.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes seasonality adjustments.
     * Operation statuses are returned.
     * </pre>
     */
    default void mutateBiddingSeasonalityAdjustments(com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateBiddingSeasonalityAdjustmentsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BiddingSeasonalityAdjustmentService.
   * <pre>
   * Service to manage bidding seasonality adjustments.
   * </pre>
   */
  public static abstract class BiddingSeasonalityAdjustmentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BiddingSeasonalityAdjustmentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BiddingSeasonalityAdjustmentService.
   * <pre>
   * Service to manage bidding seasonality adjustments.
   * </pre>
   */
  public static final class BiddingSeasonalityAdjustmentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BiddingSeasonalityAdjustmentServiceStub> {
    private BiddingSeasonalityAdjustmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingSeasonalityAdjustmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BiddingSeasonalityAdjustmentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes seasonality adjustments.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateBiddingSeasonalityAdjustments(com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateBiddingSeasonalityAdjustmentsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BiddingSeasonalityAdjustmentService.
   * <pre>
   * Service to manage bidding seasonality adjustments.
   * </pre>
   */
  public static final class BiddingSeasonalityAdjustmentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BiddingSeasonalityAdjustmentServiceBlockingStub> {
    private BiddingSeasonalityAdjustmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingSeasonalityAdjustmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BiddingSeasonalityAdjustmentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes seasonality adjustments.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsResponse mutateBiddingSeasonalityAdjustments(com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateBiddingSeasonalityAdjustmentsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BiddingSeasonalityAdjustmentService.
   * <pre>
   * Service to manage bidding seasonality adjustments.
   * </pre>
   */
  public static final class BiddingSeasonalityAdjustmentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BiddingSeasonalityAdjustmentServiceFutureStub> {
    private BiddingSeasonalityAdjustmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiddingSeasonalityAdjustmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BiddingSeasonalityAdjustmentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes seasonality adjustments.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsResponse> mutateBiddingSeasonalityAdjustments(
        com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateBiddingSeasonalityAdjustmentsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_BIDDING_SEASONALITY_ADJUSTMENTS = 0;

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
        case METHODID_MUTATE_BIDDING_SEASONALITY_ADJUSTMENTS:
          serviceImpl.mutateBiddingSeasonalityAdjustments((com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsResponse>) responseObserver);
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
          getMutateBiddingSeasonalityAdjustmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsRequest,
              com.google.ads.googleads.v12.services.MutateBiddingSeasonalityAdjustmentsResponse>(
                service, METHODID_MUTATE_BIDDING_SEASONALITY_ADJUSTMENTS)))
        .build();
  }

  private static abstract class BiddingSeasonalityAdjustmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BiddingSeasonalityAdjustmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v12.services.BiddingSeasonalityAdjustmentServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BiddingSeasonalityAdjustmentService");
    }
  }

  private static final class BiddingSeasonalityAdjustmentServiceFileDescriptorSupplier
      extends BiddingSeasonalityAdjustmentServiceBaseDescriptorSupplier {
    BiddingSeasonalityAdjustmentServiceFileDescriptorSupplier() {}
  }

  private static final class BiddingSeasonalityAdjustmentServiceMethodDescriptorSupplier
      extends BiddingSeasonalityAdjustmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BiddingSeasonalityAdjustmentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BiddingSeasonalityAdjustmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BiddingSeasonalityAdjustmentServiceFileDescriptorSupplier())
              .addMethod(getMutateBiddingSeasonalityAdjustmentsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
