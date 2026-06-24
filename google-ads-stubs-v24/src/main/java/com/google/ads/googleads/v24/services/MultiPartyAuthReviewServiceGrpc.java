package com.google.ads.googleads.v24.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage Multi-Party Authorization requests.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class MultiPartyAuthReviewServiceGrpc {

  private MultiPartyAuthReviewServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v24.services.MultiPartyAuthReviewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewRequest,
      com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewResponse> getResolveMultiPartyAuthReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResolveMultiPartyAuthReview",
      requestType = com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewRequest.class,
      responseType = com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewRequest,
      com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewResponse> getResolveMultiPartyAuthReviewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewRequest, com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewResponse> getResolveMultiPartyAuthReviewMethod;
    if ((getResolveMultiPartyAuthReviewMethod = MultiPartyAuthReviewServiceGrpc.getResolveMultiPartyAuthReviewMethod) == null) {
      synchronized (MultiPartyAuthReviewServiceGrpc.class) {
        if ((getResolveMultiPartyAuthReviewMethod = MultiPartyAuthReviewServiceGrpc.getResolveMultiPartyAuthReviewMethod) == null) {
          MultiPartyAuthReviewServiceGrpc.getResolveMultiPartyAuthReviewMethod = getResolveMultiPartyAuthReviewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewRequest, com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResolveMultiPartyAuthReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MultiPartyAuthReviewServiceMethodDescriptorSupplier("ResolveMultiPartyAuthReview"))
              .build();
        }
      }
    }
    return getResolveMultiPartyAuthReviewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MultiPartyAuthReviewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MultiPartyAuthReviewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MultiPartyAuthReviewServiceStub>() {
        @java.lang.Override
        public MultiPartyAuthReviewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MultiPartyAuthReviewServiceStub(channel, callOptions);
        }
      };
    return MultiPartyAuthReviewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static MultiPartyAuthReviewServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MultiPartyAuthReviewServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MultiPartyAuthReviewServiceBlockingV2Stub>() {
        @java.lang.Override
        public MultiPartyAuthReviewServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MultiPartyAuthReviewServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return MultiPartyAuthReviewServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MultiPartyAuthReviewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MultiPartyAuthReviewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MultiPartyAuthReviewServiceBlockingStub>() {
        @java.lang.Override
        public MultiPartyAuthReviewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MultiPartyAuthReviewServiceBlockingStub(channel, callOptions);
        }
      };
    return MultiPartyAuthReviewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MultiPartyAuthReviewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MultiPartyAuthReviewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MultiPartyAuthReviewServiceFutureStub>() {
        @java.lang.Override
        public MultiPartyAuthReviewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MultiPartyAuthReviewServiceFutureStub(channel, callOptions);
        }
      };
    return MultiPartyAuthReviewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage Multi-Party Authorization requests.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Resolves the status of a Multi-Party Authorization review.
     * List of thrown errors:
     *   [AccessInvitationError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CustomerUserAccessError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MultiPartyAuthReviewError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    default void resolveMultiPartyAuthReview(com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResolveMultiPartyAuthReviewMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MultiPartyAuthReviewService.
   * <pre>
   * Service to manage Multi-Party Authorization requests.
   * </pre>
   */
  public static abstract class MultiPartyAuthReviewServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MultiPartyAuthReviewServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MultiPartyAuthReviewService.
   * <pre>
   * Service to manage Multi-Party Authorization requests.
   * </pre>
   */
  public static final class MultiPartyAuthReviewServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MultiPartyAuthReviewServiceStub> {
    private MultiPartyAuthReviewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MultiPartyAuthReviewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MultiPartyAuthReviewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Resolves the status of a Multi-Party Authorization review.
     * List of thrown errors:
     *   [AccessInvitationError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CustomerUserAccessError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MultiPartyAuthReviewError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void resolveMultiPartyAuthReview(com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResolveMultiPartyAuthReviewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MultiPartyAuthReviewService.
   * <pre>
   * Service to manage Multi-Party Authorization requests.
   * </pre>
   */
  public static final class MultiPartyAuthReviewServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<MultiPartyAuthReviewServiceBlockingV2Stub> {
    private MultiPartyAuthReviewServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MultiPartyAuthReviewServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MultiPartyAuthReviewServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Resolves the status of a Multi-Party Authorization review.
     * List of thrown errors:
     *   [AccessInvitationError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CustomerUserAccessError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MultiPartyAuthReviewError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewResponse resolveMultiPartyAuthReview(com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getResolveMultiPartyAuthReviewMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service MultiPartyAuthReviewService.
   * <pre>
   * Service to manage Multi-Party Authorization requests.
   * </pre>
   */
  public static final class MultiPartyAuthReviewServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MultiPartyAuthReviewServiceBlockingStub> {
    private MultiPartyAuthReviewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MultiPartyAuthReviewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MultiPartyAuthReviewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Resolves the status of a Multi-Party Authorization review.
     * List of thrown errors:
     *   [AccessInvitationError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CustomerUserAccessError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MultiPartyAuthReviewError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewResponse resolveMultiPartyAuthReview(com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResolveMultiPartyAuthReviewMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MultiPartyAuthReviewService.
   * <pre>
   * Service to manage Multi-Party Authorization requests.
   * </pre>
   */
  public static final class MultiPartyAuthReviewServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MultiPartyAuthReviewServiceFutureStub> {
    private MultiPartyAuthReviewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MultiPartyAuthReviewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MultiPartyAuthReviewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Resolves the status of a Multi-Party Authorization review.
     * List of thrown errors:
     *   [AccessInvitationError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CustomerUserAccessError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MultiPartyAuthReviewError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewResponse> resolveMultiPartyAuthReview(
        com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResolveMultiPartyAuthReviewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RESOLVE_MULTI_PARTY_AUTH_REVIEW = 0;

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
        case METHODID_RESOLVE_MULTI_PARTY_AUTH_REVIEW:
          serviceImpl.resolveMultiPartyAuthReview((com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewResponse>) responseObserver);
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
          getResolveMultiPartyAuthReviewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewRequest,
              com.google.ads.googleads.v24.services.ResolveMultiPartyAuthReviewResponse>(
                service, METHODID_RESOLVE_MULTI_PARTY_AUTH_REVIEW)))
        .build();
  }

  private static abstract class MultiPartyAuthReviewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MultiPartyAuthReviewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v24.services.MultiPartyAuthReviewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MultiPartyAuthReviewService");
    }
  }

  private static final class MultiPartyAuthReviewServiceFileDescriptorSupplier
      extends MultiPartyAuthReviewServiceBaseDescriptorSupplier {
    MultiPartyAuthReviewServiceFileDescriptorSupplier() {}
  }

  private static final class MultiPartyAuthReviewServiceMethodDescriptorSupplier
      extends MultiPartyAuthReviewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MultiPartyAuthReviewServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MultiPartyAuthReviewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MultiPartyAuthReviewServiceFileDescriptorSupplier())
              .addMethod(getResolveMultiPartyAuthReviewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
