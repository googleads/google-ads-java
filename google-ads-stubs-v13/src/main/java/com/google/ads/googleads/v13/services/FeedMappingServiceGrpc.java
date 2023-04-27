package com.google.ads.googleads.v13.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage feed mappings.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v13/services/feed_mapping_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FeedMappingServiceGrpc {

  private FeedMappingServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v13.services.FeedMappingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateFeedMappingsRequest,
      com.google.ads.googleads.v13.services.MutateFeedMappingsResponse> getMutateFeedMappingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateFeedMappings",
      requestType = com.google.ads.googleads.v13.services.MutateFeedMappingsRequest.class,
      responseType = com.google.ads.googleads.v13.services.MutateFeedMappingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateFeedMappingsRequest,
      com.google.ads.googleads.v13.services.MutateFeedMappingsResponse> getMutateFeedMappingsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateFeedMappingsRequest, com.google.ads.googleads.v13.services.MutateFeedMappingsResponse> getMutateFeedMappingsMethod;
    if ((getMutateFeedMappingsMethod = FeedMappingServiceGrpc.getMutateFeedMappingsMethod) == null) {
      synchronized (FeedMappingServiceGrpc.class) {
        if ((getMutateFeedMappingsMethod = FeedMappingServiceGrpc.getMutateFeedMappingsMethod) == null) {
          FeedMappingServiceGrpc.getMutateFeedMappingsMethod = getMutateFeedMappingsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v13.services.MutateFeedMappingsRequest, com.google.ads.googleads.v13.services.MutateFeedMappingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateFeedMappings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateFeedMappingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateFeedMappingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FeedMappingServiceMethodDescriptorSupplier("MutateFeedMappings"))
              .build();
        }
      }
    }
    return getMutateFeedMappingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedMappingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedMappingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedMappingServiceStub>() {
        @java.lang.Override
        public FeedMappingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedMappingServiceStub(channel, callOptions);
        }
      };
    return FeedMappingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedMappingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedMappingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedMappingServiceBlockingStub>() {
        @java.lang.Override
        public FeedMappingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedMappingServiceBlockingStub(channel, callOptions);
        }
      };
    return FeedMappingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedMappingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedMappingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedMappingServiceFutureStub>() {
        @java.lang.Override
        public FeedMappingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedMappingServiceFutureStub(channel, callOptions);
        }
      };
    return FeedMappingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage feed mappings.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates or removes feed mappings. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FeedMappingError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    default void mutateFeedMappings(com.google.ads.googleads.v13.services.MutateFeedMappingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateFeedMappingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateFeedMappingsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FeedMappingService.
   * <pre>
   * Service to manage feed mappings.
   * </pre>
   */
  public static abstract class FeedMappingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FeedMappingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FeedMappingService.
   * <pre>
   * Service to manage feed mappings.
   * </pre>
   */
  public static final class FeedMappingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FeedMappingServiceStub> {
    private FeedMappingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedMappingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedMappingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes feed mappings. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FeedMappingError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateFeedMappings(com.google.ads.googleads.v13.services.MutateFeedMappingsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateFeedMappingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateFeedMappingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FeedMappingService.
   * <pre>
   * Service to manage feed mappings.
   * </pre>
   */
  public static final class FeedMappingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FeedMappingServiceBlockingStub> {
    private FeedMappingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedMappingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedMappingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes feed mappings. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FeedMappingError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v13.services.MutateFeedMappingsResponse mutateFeedMappings(com.google.ads.googleads.v13.services.MutateFeedMappingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateFeedMappingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FeedMappingService.
   * <pre>
   * Service to manage feed mappings.
   * </pre>
   */
  public static final class FeedMappingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FeedMappingServiceFutureStub> {
    private FeedMappingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedMappingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedMappingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes feed mappings. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FeedMappingError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v13.services.MutateFeedMappingsResponse> mutateFeedMappings(
        com.google.ads.googleads.v13.services.MutateFeedMappingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateFeedMappingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_FEED_MAPPINGS = 0;

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
        case METHODID_MUTATE_FEED_MAPPINGS:
          serviceImpl.mutateFeedMappings((com.google.ads.googleads.v13.services.MutateFeedMappingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateFeedMappingsResponse>) responseObserver);
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
          getMutateFeedMappingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v13.services.MutateFeedMappingsRequest,
              com.google.ads.googleads.v13.services.MutateFeedMappingsResponse>(
                service, METHODID_MUTATE_FEED_MAPPINGS)))
        .build();
  }

  private static abstract class FeedMappingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedMappingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v13.services.FeedMappingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedMappingService");
    }
  }

  private static final class FeedMappingServiceFileDescriptorSupplier
      extends FeedMappingServiceBaseDescriptorSupplier {
    FeedMappingServiceFileDescriptorSupplier() {}
  }

  private static final class FeedMappingServiceMethodDescriptorSupplier
      extends FeedMappingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FeedMappingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FeedMappingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedMappingServiceFileDescriptorSupplier())
              .addMethod(getMutateFeedMappingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
