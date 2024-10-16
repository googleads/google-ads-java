package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage recommendations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/recommendation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RecommendationServiceGrpc {

  private RecommendationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.RecommendationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ApplyRecommendationRequest,
      com.google.ads.googleads.v18.services.ApplyRecommendationResponse> getApplyRecommendationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyRecommendation",
      requestType = com.google.ads.googleads.v18.services.ApplyRecommendationRequest.class,
      responseType = com.google.ads.googleads.v18.services.ApplyRecommendationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ApplyRecommendationRequest,
      com.google.ads.googleads.v18.services.ApplyRecommendationResponse> getApplyRecommendationMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ApplyRecommendationRequest, com.google.ads.googleads.v18.services.ApplyRecommendationResponse> getApplyRecommendationMethod;
    if ((getApplyRecommendationMethod = RecommendationServiceGrpc.getApplyRecommendationMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getApplyRecommendationMethod = RecommendationServiceGrpc.getApplyRecommendationMethod) == null) {
          RecommendationServiceGrpc.getApplyRecommendationMethod = getApplyRecommendationMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.ApplyRecommendationRequest, com.google.ads.googleads.v18.services.ApplyRecommendationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplyRecommendation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.ApplyRecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.ApplyRecommendationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("ApplyRecommendation"))
              .build();
        }
      }
    }
    return getApplyRecommendationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.DismissRecommendationRequest,
      com.google.ads.googleads.v18.services.DismissRecommendationResponse> getDismissRecommendationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DismissRecommendation",
      requestType = com.google.ads.googleads.v18.services.DismissRecommendationRequest.class,
      responseType = com.google.ads.googleads.v18.services.DismissRecommendationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.DismissRecommendationRequest,
      com.google.ads.googleads.v18.services.DismissRecommendationResponse> getDismissRecommendationMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.DismissRecommendationRequest, com.google.ads.googleads.v18.services.DismissRecommendationResponse> getDismissRecommendationMethod;
    if ((getDismissRecommendationMethod = RecommendationServiceGrpc.getDismissRecommendationMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getDismissRecommendationMethod = RecommendationServiceGrpc.getDismissRecommendationMethod) == null) {
          RecommendationServiceGrpc.getDismissRecommendationMethod = getDismissRecommendationMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.DismissRecommendationRequest, com.google.ads.googleads.v18.services.DismissRecommendationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DismissRecommendation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.DismissRecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.DismissRecommendationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("DismissRecommendation"))
              .build();
        }
      }
    }
    return getDismissRecommendationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateRecommendationsRequest,
      com.google.ads.googleads.v18.services.GenerateRecommendationsResponse> getGenerateRecommendationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateRecommendations",
      requestType = com.google.ads.googleads.v18.services.GenerateRecommendationsRequest.class,
      responseType = com.google.ads.googleads.v18.services.GenerateRecommendationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateRecommendationsRequest,
      com.google.ads.googleads.v18.services.GenerateRecommendationsResponse> getGenerateRecommendationsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GenerateRecommendationsRequest, com.google.ads.googleads.v18.services.GenerateRecommendationsResponse> getGenerateRecommendationsMethod;
    if ((getGenerateRecommendationsMethod = RecommendationServiceGrpc.getGenerateRecommendationsMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getGenerateRecommendationsMethod = RecommendationServiceGrpc.getGenerateRecommendationsMethod) == null) {
          RecommendationServiceGrpc.getGenerateRecommendationsMethod = getGenerateRecommendationsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.GenerateRecommendationsRequest, com.google.ads.googleads.v18.services.GenerateRecommendationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateRecommendations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GenerateRecommendationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GenerateRecommendationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("GenerateRecommendations"))
              .build();
        }
      }
    }
    return getGenerateRecommendationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecommendationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceStub>() {
        @java.lang.Override
        public RecommendationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationServiceStub(channel, callOptions);
        }
      };
    return RecommendationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecommendationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceBlockingStub>() {
        @java.lang.Override
        public RecommendationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationServiceBlockingStub(channel, callOptions);
        }
      };
    return RecommendationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecommendationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceFutureStub>() {
        @java.lang.Override
        public RecommendationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationServiceFutureStub(channel, callOptions);
        }
      };
    return RecommendationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage recommendations.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Applies given recommendations with corresponding apply parameters.
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
    default void applyRecommendation(com.google.ads.googleads.v18.services.ApplyRecommendationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ApplyRecommendationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplyRecommendationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Dismisses given recommendations.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RecommendationError]()
     *   [RequestError]()
     * </pre>
     */
    default void dismissRecommendation(com.google.ads.googleads.v18.services.DismissRecommendationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.DismissRecommendationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDismissRecommendationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates Recommendations based off the requested recommendation_types.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RecommendationError]()
     *   [RequestError]()
     * </pre>
     */
    default void generateRecommendations(com.google.ads.googleads.v18.services.GenerateRecommendationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateRecommendationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateRecommendationsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RecommendationService.
   * <pre>
   * Service to manage recommendations.
   * </pre>
   */
  public static abstract class RecommendationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RecommendationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RecommendationService.
   * <pre>
   * Service to manage recommendations.
   * </pre>
   */
  public static final class RecommendationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RecommendationServiceStub> {
    private RecommendationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Applies given recommendations with corresponding apply parameters.
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
    public void applyRecommendation(com.google.ads.googleads.v18.services.ApplyRecommendationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ApplyRecommendationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplyRecommendationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Dismisses given recommendations.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RecommendationError]()
     *   [RequestError]()
     * </pre>
     */
    public void dismissRecommendation(com.google.ads.googleads.v18.services.DismissRecommendationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.DismissRecommendationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDismissRecommendationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates Recommendations based off the requested recommendation_types.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RecommendationError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateRecommendations(com.google.ads.googleads.v18.services.GenerateRecommendationsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateRecommendationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateRecommendationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RecommendationService.
   * <pre>
   * Service to manage recommendations.
   * </pre>
   */
  public static final class RecommendationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RecommendationServiceBlockingStub> {
    private RecommendationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Applies given recommendations with corresponding apply parameters.
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
    public com.google.ads.googleads.v18.services.ApplyRecommendationResponse applyRecommendation(com.google.ads.googleads.v18.services.ApplyRecommendationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplyRecommendationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Dismisses given recommendations.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RecommendationError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.DismissRecommendationResponse dismissRecommendation(com.google.ads.googleads.v18.services.DismissRecommendationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDismissRecommendationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates Recommendations based off the requested recommendation_types.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RecommendationError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.GenerateRecommendationsResponse generateRecommendations(com.google.ads.googleads.v18.services.GenerateRecommendationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateRecommendationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RecommendationService.
   * <pre>
   * Service to manage recommendations.
   * </pre>
   */
  public static final class RecommendationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RecommendationServiceFutureStub> {
    private RecommendationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Applies given recommendations with corresponding apply parameters.
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.ApplyRecommendationResponse> applyRecommendation(
        com.google.ads.googleads.v18.services.ApplyRecommendationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplyRecommendationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Dismisses given recommendations.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RecommendationError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.DismissRecommendationResponse> dismissRecommendation(
        com.google.ads.googleads.v18.services.DismissRecommendationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDismissRecommendationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates Recommendations based off the requested recommendation_types.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RecommendationError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.GenerateRecommendationsResponse> generateRecommendations(
        com.google.ads.googleads.v18.services.GenerateRecommendationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateRecommendationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_APPLY_RECOMMENDATION = 0;
  private static final int METHODID_DISMISS_RECOMMENDATION = 1;
  private static final int METHODID_GENERATE_RECOMMENDATIONS = 2;

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
        case METHODID_APPLY_RECOMMENDATION:
          serviceImpl.applyRecommendation((com.google.ads.googleads.v18.services.ApplyRecommendationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ApplyRecommendationResponse>) responseObserver);
          break;
        case METHODID_DISMISS_RECOMMENDATION:
          serviceImpl.dismissRecommendation((com.google.ads.googleads.v18.services.DismissRecommendationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.DismissRecommendationResponse>) responseObserver);
          break;
        case METHODID_GENERATE_RECOMMENDATIONS:
          serviceImpl.generateRecommendations((com.google.ads.googleads.v18.services.GenerateRecommendationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GenerateRecommendationsResponse>) responseObserver);
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
          getApplyRecommendationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.ApplyRecommendationRequest,
              com.google.ads.googleads.v18.services.ApplyRecommendationResponse>(
                service, METHODID_APPLY_RECOMMENDATION)))
        .addMethod(
          getDismissRecommendationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.DismissRecommendationRequest,
              com.google.ads.googleads.v18.services.DismissRecommendationResponse>(
                service, METHODID_DISMISS_RECOMMENDATION)))
        .addMethod(
          getGenerateRecommendationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.GenerateRecommendationsRequest,
              com.google.ads.googleads.v18.services.GenerateRecommendationsResponse>(
                service, METHODID_GENERATE_RECOMMENDATIONS)))
        .build();
  }

  private static abstract class RecommendationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecommendationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.RecommendationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RecommendationService");
    }
  }

  private static final class RecommendationServiceFileDescriptorSupplier
      extends RecommendationServiceBaseDescriptorSupplier {
    RecommendationServiceFileDescriptorSupplier() {}
  }

  private static final class RecommendationServiceMethodDescriptorSupplier
      extends RecommendationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RecommendationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RecommendationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecommendationServiceFileDescriptorSupplier())
              .addMethod(getApplyRecommendationMethod())
              .addMethod(getDismissRecommendationMethod())
              .addMethod(getGenerateRecommendationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
