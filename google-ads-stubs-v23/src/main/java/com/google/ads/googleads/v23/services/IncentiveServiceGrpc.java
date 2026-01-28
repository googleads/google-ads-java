package com.google.ads.googleads.v23.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to support incentive related operations.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class IncentiveServiceGrpc {

  private IncentiveServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v23.services.IncentiveService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.FetchIncentiveRequest,
      com.google.ads.googleads.v23.services.FetchIncentiveResponse> getFetchIncentiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchIncentive",
      requestType = com.google.ads.googleads.v23.services.FetchIncentiveRequest.class,
      responseType = com.google.ads.googleads.v23.services.FetchIncentiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.FetchIncentiveRequest,
      com.google.ads.googleads.v23.services.FetchIncentiveResponse> getFetchIncentiveMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.FetchIncentiveRequest, com.google.ads.googleads.v23.services.FetchIncentiveResponse> getFetchIncentiveMethod;
    if ((getFetchIncentiveMethod = IncentiveServiceGrpc.getFetchIncentiveMethod) == null) {
      synchronized (IncentiveServiceGrpc.class) {
        if ((getFetchIncentiveMethod = IncentiveServiceGrpc.getFetchIncentiveMethod) == null) {
          IncentiveServiceGrpc.getFetchIncentiveMethod = getFetchIncentiveMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v23.services.FetchIncentiveRequest, com.google.ads.googleads.v23.services.FetchIncentiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchIncentive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.FetchIncentiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.FetchIncentiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IncentiveServiceMethodDescriptorSupplier("FetchIncentive"))
              .build();
        }
      }
    }
    return getFetchIncentiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.ApplyIncentiveRequest,
      com.google.ads.googleads.v23.services.ApplyIncentiveResponse> getApplyIncentiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyIncentive",
      requestType = com.google.ads.googleads.v23.services.ApplyIncentiveRequest.class,
      responseType = com.google.ads.googleads.v23.services.ApplyIncentiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.ApplyIncentiveRequest,
      com.google.ads.googleads.v23.services.ApplyIncentiveResponse> getApplyIncentiveMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.ApplyIncentiveRequest, com.google.ads.googleads.v23.services.ApplyIncentiveResponse> getApplyIncentiveMethod;
    if ((getApplyIncentiveMethod = IncentiveServiceGrpc.getApplyIncentiveMethod) == null) {
      synchronized (IncentiveServiceGrpc.class) {
        if ((getApplyIncentiveMethod = IncentiveServiceGrpc.getApplyIncentiveMethod) == null) {
          IncentiveServiceGrpc.getApplyIncentiveMethod = getApplyIncentiveMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v23.services.ApplyIncentiveRequest, com.google.ads.googleads.v23.services.ApplyIncentiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplyIncentive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.ApplyIncentiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.ApplyIncentiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IncentiveServiceMethodDescriptorSupplier("ApplyIncentive"))
              .build();
        }
      }
    }
    return getApplyIncentiveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IncentiveServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IncentiveServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IncentiveServiceStub>() {
        @java.lang.Override
        public IncentiveServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IncentiveServiceStub(channel, callOptions);
        }
      };
    return IncentiveServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static IncentiveServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IncentiveServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IncentiveServiceBlockingV2Stub>() {
        @java.lang.Override
        public IncentiveServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IncentiveServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return IncentiveServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IncentiveServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IncentiveServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IncentiveServiceBlockingStub>() {
        @java.lang.Override
        public IncentiveServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IncentiveServiceBlockingStub(channel, callOptions);
        }
      };
    return IncentiveServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IncentiveServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IncentiveServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IncentiveServiceFutureStub>() {
        @java.lang.Override
        public IncentiveServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IncentiveServiceFutureStub(channel, callOptions);
        }
      };
    return IncentiveServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to support incentive related operations.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns incentives for a given user.
     * </pre>
     */
    default void fetchIncentive(com.google.ads.googleads.v23.services.FetchIncentiveRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.FetchIncentiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchIncentiveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Applies the incentive for the ads customer.
     * </pre>
     */
    default void applyIncentive(com.google.ads.googleads.v23.services.ApplyIncentiveRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.ApplyIncentiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplyIncentiveMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service IncentiveService.
   * <pre>
   * Service to support incentive related operations.
   * </pre>
   */
  public static abstract class IncentiveServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IncentiveServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service IncentiveService.
   * <pre>
   * Service to support incentive related operations.
   * </pre>
   */
  public static final class IncentiveServiceStub
      extends io.grpc.stub.AbstractAsyncStub<IncentiveServiceStub> {
    private IncentiveServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncentiveServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IncentiveServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns incentives for a given user.
     * </pre>
     */
    public void fetchIncentive(com.google.ads.googleads.v23.services.FetchIncentiveRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.FetchIncentiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchIncentiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Applies the incentive for the ads customer.
     * </pre>
     */
    public void applyIncentive(com.google.ads.googleads.v23.services.ApplyIncentiveRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.ApplyIncentiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplyIncentiveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service IncentiveService.
   * <pre>
   * Service to support incentive related operations.
   * </pre>
   */
  public static final class IncentiveServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<IncentiveServiceBlockingV2Stub> {
    private IncentiveServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncentiveServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IncentiveServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns incentives for a given user.
     * </pre>
     */
    public com.google.ads.googleads.v23.services.FetchIncentiveResponse fetchIncentive(com.google.ads.googleads.v23.services.FetchIncentiveRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getFetchIncentiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Applies the incentive for the ads customer.
     * </pre>
     */
    public com.google.ads.googleads.v23.services.ApplyIncentiveResponse applyIncentive(com.google.ads.googleads.v23.services.ApplyIncentiveRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getApplyIncentiveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service IncentiveService.
   * <pre>
   * Service to support incentive related operations.
   * </pre>
   */
  public static final class IncentiveServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IncentiveServiceBlockingStub> {
    private IncentiveServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncentiveServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IncentiveServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns incentives for a given user.
     * </pre>
     */
    public com.google.ads.googleads.v23.services.FetchIncentiveResponse fetchIncentive(com.google.ads.googleads.v23.services.FetchIncentiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchIncentiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Applies the incentive for the ads customer.
     * </pre>
     */
    public com.google.ads.googleads.v23.services.ApplyIncentiveResponse applyIncentive(com.google.ads.googleads.v23.services.ApplyIncentiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplyIncentiveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service IncentiveService.
   * <pre>
   * Service to support incentive related operations.
   * </pre>
   */
  public static final class IncentiveServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<IncentiveServiceFutureStub> {
    private IncentiveServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncentiveServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IncentiveServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns incentives for a given user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v23.services.FetchIncentiveResponse> fetchIncentive(
        com.google.ads.googleads.v23.services.FetchIncentiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchIncentiveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Applies the incentive for the ads customer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v23.services.ApplyIncentiveResponse> applyIncentive(
        com.google.ads.googleads.v23.services.ApplyIncentiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplyIncentiveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_INCENTIVE = 0;
  private static final int METHODID_APPLY_INCENTIVE = 1;

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
        case METHODID_FETCH_INCENTIVE:
          serviceImpl.fetchIncentive((com.google.ads.googleads.v23.services.FetchIncentiveRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.FetchIncentiveResponse>) responseObserver);
          break;
        case METHODID_APPLY_INCENTIVE:
          serviceImpl.applyIncentive((com.google.ads.googleads.v23.services.ApplyIncentiveRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.ApplyIncentiveResponse>) responseObserver);
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
          getFetchIncentiveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v23.services.FetchIncentiveRequest,
              com.google.ads.googleads.v23.services.FetchIncentiveResponse>(
                service, METHODID_FETCH_INCENTIVE)))
        .addMethod(
          getApplyIncentiveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v23.services.ApplyIncentiveRequest,
              com.google.ads.googleads.v23.services.ApplyIncentiveResponse>(
                service, METHODID_APPLY_INCENTIVE)))
        .build();
  }

  private static abstract class IncentiveServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IncentiveServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v23.services.IncentiveServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IncentiveService");
    }
  }

  private static final class IncentiveServiceFileDescriptorSupplier
      extends IncentiveServiceBaseDescriptorSupplier {
    IncentiveServiceFileDescriptorSupplier() {}
  }

  private static final class IncentiveServiceMethodDescriptorSupplier
      extends IncentiveServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IncentiveServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IncentiveServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IncentiveServiceFileDescriptorSupplier())
              .addMethod(getFetchIncentiveMethod())
              .addMethod(getApplyIncentiveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
