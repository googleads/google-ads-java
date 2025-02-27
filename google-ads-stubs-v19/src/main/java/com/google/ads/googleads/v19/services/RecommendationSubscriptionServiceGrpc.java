package com.google.ads.googleads.v19.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage recommendation subscriptions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v19/services/recommendation_subscription_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RecommendationSubscriptionServiceGrpc {

  private RecommendationSubscriptionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v19.services.RecommendationSubscriptionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionRequest,
      com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionResponse> getMutateRecommendationSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateRecommendationSubscription",
      requestType = com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionRequest.class,
      responseType = com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionRequest,
      com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionResponse> getMutateRecommendationSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionRequest, com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionResponse> getMutateRecommendationSubscriptionMethod;
    if ((getMutateRecommendationSubscriptionMethod = RecommendationSubscriptionServiceGrpc.getMutateRecommendationSubscriptionMethod) == null) {
      synchronized (RecommendationSubscriptionServiceGrpc.class) {
        if ((getMutateRecommendationSubscriptionMethod = RecommendationSubscriptionServiceGrpc.getMutateRecommendationSubscriptionMethod) == null) {
          RecommendationSubscriptionServiceGrpc.getMutateRecommendationSubscriptionMethod = getMutateRecommendationSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionRequest, com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateRecommendationSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationSubscriptionServiceMethodDescriptorSupplier("MutateRecommendationSubscription"))
              .build();
        }
      }
    }
    return getMutateRecommendationSubscriptionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecommendationSubscriptionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationSubscriptionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationSubscriptionServiceStub>() {
        @java.lang.Override
        public RecommendationSubscriptionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationSubscriptionServiceStub(channel, callOptions);
        }
      };
    return RecommendationSubscriptionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static RecommendationSubscriptionServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationSubscriptionServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationSubscriptionServiceBlockingV2Stub>() {
        @java.lang.Override
        public RecommendationSubscriptionServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationSubscriptionServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return RecommendationSubscriptionServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecommendationSubscriptionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationSubscriptionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationSubscriptionServiceBlockingStub>() {
        @java.lang.Override
        public RecommendationSubscriptionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationSubscriptionServiceBlockingStub(channel, callOptions);
        }
      };
    return RecommendationSubscriptionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecommendationSubscriptionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationSubscriptionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationSubscriptionServiceFutureStub>() {
        @java.lang.Override
        public RecommendationSubscriptionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationSubscriptionServiceFutureStub(channel, callOptions);
        }
      };
    return RecommendationSubscriptionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage recommendation subscriptions.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Mutates given subscription with corresponding apply parameters.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RecommendationError]()
     *   [RequestError]()
     *   [UrlFieldError]()
     * </pre>
     */
    default void mutateRecommendationSubscription(com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateRecommendationSubscriptionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RecommendationSubscriptionService.
   * <pre>
   * Service to manage recommendation subscriptions.
   * </pre>
   */
  public static abstract class RecommendationSubscriptionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RecommendationSubscriptionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RecommendationSubscriptionService.
   * <pre>
   * Service to manage recommendation subscriptions.
   * </pre>
   */
  public static final class RecommendationSubscriptionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RecommendationSubscriptionServiceStub> {
    private RecommendationSubscriptionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationSubscriptionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationSubscriptionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Mutates given subscription with corresponding apply parameters.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RecommendationError]()
     *   [RequestError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public void mutateRecommendationSubscription(com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateRecommendationSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RecommendationSubscriptionService.
   * <pre>
   * Service to manage recommendation subscriptions.
   * </pre>
   */
  public static final class RecommendationSubscriptionServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<RecommendationSubscriptionServiceBlockingV2Stub> {
    private RecommendationSubscriptionServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationSubscriptionServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationSubscriptionServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Mutates given subscription with corresponding apply parameters.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RecommendationError]()
     *   [RequestError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionResponse mutateRecommendationSubscription(com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateRecommendationSubscriptionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service RecommendationSubscriptionService.
   * <pre>
   * Service to manage recommendation subscriptions.
   * </pre>
   */
  public static final class RecommendationSubscriptionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RecommendationSubscriptionServiceBlockingStub> {
    private RecommendationSubscriptionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationSubscriptionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationSubscriptionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Mutates given subscription with corresponding apply parameters.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RecommendationError]()
     *   [RequestError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionResponse mutateRecommendationSubscription(com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateRecommendationSubscriptionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RecommendationSubscriptionService.
   * <pre>
   * Service to manage recommendation subscriptions.
   * </pre>
   */
  public static final class RecommendationSubscriptionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RecommendationSubscriptionServiceFutureStub> {
    private RecommendationSubscriptionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationSubscriptionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationSubscriptionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Mutates given subscription with corresponding apply parameters.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RecommendationError]()
     *   [RequestError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionResponse> mutateRecommendationSubscription(
        com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateRecommendationSubscriptionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_RECOMMENDATION_SUBSCRIPTION = 0;

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
        case METHODID_MUTATE_RECOMMENDATION_SUBSCRIPTION:
          serviceImpl.mutateRecommendationSubscription((com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionResponse>) responseObserver);
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
          getMutateRecommendationSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionRequest,
              com.google.ads.googleads.v19.services.MutateRecommendationSubscriptionResponse>(
                service, METHODID_MUTATE_RECOMMENDATION_SUBSCRIPTION)))
        .build();
  }

  private static abstract class RecommendationSubscriptionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecommendationSubscriptionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v19.services.RecommendationSubscriptionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RecommendationSubscriptionService");
    }
  }

  private static final class RecommendationSubscriptionServiceFileDescriptorSupplier
      extends RecommendationSubscriptionServiceBaseDescriptorSupplier {
    RecommendationSubscriptionServiceFileDescriptorSupplier() {}
  }

  private static final class RecommendationSubscriptionServiceMethodDescriptorSupplier
      extends RecommendationSubscriptionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RecommendationSubscriptionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RecommendationSubscriptionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecommendationSubscriptionServiceFileDescriptorSupplier())
              .addMethod(getMutateRecommendationSubscriptionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
