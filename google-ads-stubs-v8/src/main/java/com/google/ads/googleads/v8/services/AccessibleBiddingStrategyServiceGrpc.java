package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to read accessible bidding strategies.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/accessible_bidding_strategy_service.proto")
public final class AccessibleBiddingStrategyServiceGrpc {

  private AccessibleBiddingStrategyServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.AccessibleBiddingStrategyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetAccessibleBiddingStrategyRequest,
      com.google.ads.googleads.v8.resources.AccessibleBiddingStrategy> getGetAccessibleBiddingStrategyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccessibleBiddingStrategy",
      requestType = com.google.ads.googleads.v8.services.GetAccessibleBiddingStrategyRequest.class,
      responseType = com.google.ads.googleads.v8.resources.AccessibleBiddingStrategy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetAccessibleBiddingStrategyRequest,
      com.google.ads.googleads.v8.resources.AccessibleBiddingStrategy> getGetAccessibleBiddingStrategyMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetAccessibleBiddingStrategyRequest, com.google.ads.googleads.v8.resources.AccessibleBiddingStrategy> getGetAccessibleBiddingStrategyMethod;
    if ((getGetAccessibleBiddingStrategyMethod = AccessibleBiddingStrategyServiceGrpc.getGetAccessibleBiddingStrategyMethod) == null) {
      synchronized (AccessibleBiddingStrategyServiceGrpc.class) {
        if ((getGetAccessibleBiddingStrategyMethod = AccessibleBiddingStrategyServiceGrpc.getGetAccessibleBiddingStrategyMethod) == null) {
          AccessibleBiddingStrategyServiceGrpc.getGetAccessibleBiddingStrategyMethod = getGetAccessibleBiddingStrategyMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetAccessibleBiddingStrategyRequest, com.google.ads.googleads.v8.resources.AccessibleBiddingStrategy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccessibleBiddingStrategy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetAccessibleBiddingStrategyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.AccessibleBiddingStrategy.getDefaultInstance()))
              .setSchemaDescriptor(new AccessibleBiddingStrategyServiceMethodDescriptorSupplier("GetAccessibleBiddingStrategy"))
              .build();
        }
      }
    }
    return getGetAccessibleBiddingStrategyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessibleBiddingStrategyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessibleBiddingStrategyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessibleBiddingStrategyServiceStub>() {
        @java.lang.Override
        public AccessibleBiddingStrategyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessibleBiddingStrategyServiceStub(channel, callOptions);
        }
      };
    return AccessibleBiddingStrategyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessibleBiddingStrategyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessibleBiddingStrategyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessibleBiddingStrategyServiceBlockingStub>() {
        @java.lang.Override
        public AccessibleBiddingStrategyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessibleBiddingStrategyServiceBlockingStub(channel, callOptions);
        }
      };
    return AccessibleBiddingStrategyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessibleBiddingStrategyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessibleBiddingStrategyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccessibleBiddingStrategyServiceFutureStub>() {
        @java.lang.Override
        public AccessibleBiddingStrategyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccessibleBiddingStrategyServiceFutureStub(channel, callOptions);
        }
      };
    return AccessibleBiddingStrategyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to read accessible bidding strategies.
   * </pre>
   */
  public static abstract class AccessibleBiddingStrategyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested accessible bidding strategy in full detail.
     * </pre>
     */
    public void getAccessibleBiddingStrategy(com.google.ads.googleads.v8.services.GetAccessibleBiddingStrategyRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.AccessibleBiddingStrategy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccessibleBiddingStrategyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAccessibleBiddingStrategyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetAccessibleBiddingStrategyRequest,
                com.google.ads.googleads.v8.resources.AccessibleBiddingStrategy>(
                  this, METHODID_GET_ACCESSIBLE_BIDDING_STRATEGY)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to read accessible bidding strategies.
   * </pre>
   */
  public static final class AccessibleBiddingStrategyServiceStub extends io.grpc.stub.AbstractAsyncStub<AccessibleBiddingStrategyServiceStub> {
    private AccessibleBiddingStrategyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessibleBiddingStrategyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessibleBiddingStrategyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested accessible bidding strategy in full detail.
     * </pre>
     */
    public void getAccessibleBiddingStrategy(com.google.ads.googleads.v8.services.GetAccessibleBiddingStrategyRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.AccessibleBiddingStrategy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccessibleBiddingStrategyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to read accessible bidding strategies.
   * </pre>
   */
  public static final class AccessibleBiddingStrategyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccessibleBiddingStrategyServiceBlockingStub> {
    private AccessibleBiddingStrategyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessibleBiddingStrategyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessibleBiddingStrategyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested accessible bidding strategy in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.AccessibleBiddingStrategy getAccessibleBiddingStrategy(com.google.ads.googleads.v8.services.GetAccessibleBiddingStrategyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccessibleBiddingStrategyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to read accessible bidding strategies.
   * </pre>
   */
  public static final class AccessibleBiddingStrategyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccessibleBiddingStrategyServiceFutureStub> {
    private AccessibleBiddingStrategyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessibleBiddingStrategyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessibleBiddingStrategyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested accessible bidding strategy in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.AccessibleBiddingStrategy> getAccessibleBiddingStrategy(
        com.google.ads.googleads.v8.services.GetAccessibleBiddingStrategyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccessibleBiddingStrategyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCESSIBLE_BIDDING_STRATEGY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccessibleBiddingStrategyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessibleBiddingStrategyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACCESSIBLE_BIDDING_STRATEGY:
          serviceImpl.getAccessibleBiddingStrategy((com.google.ads.googleads.v8.services.GetAccessibleBiddingStrategyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.AccessibleBiddingStrategy>) responseObserver);
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

  private static abstract class AccessibleBiddingStrategyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessibleBiddingStrategyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.AccessibleBiddingStrategyServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessibleBiddingStrategyService");
    }
  }

  private static final class AccessibleBiddingStrategyServiceFileDescriptorSupplier
      extends AccessibleBiddingStrategyServiceBaseDescriptorSupplier {
    AccessibleBiddingStrategyServiceFileDescriptorSupplier() {}
  }

  private static final class AccessibleBiddingStrategyServiceMethodDescriptorSupplier
      extends AccessibleBiddingStrategyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessibleBiddingStrategyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessibleBiddingStrategyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessibleBiddingStrategyServiceFileDescriptorSupplier())
              .addMethod(getGetAccessibleBiddingStrategyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
