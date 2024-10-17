package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage ad group feeds.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/ad_group_feed_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdGroupFeedServiceGrpc {

  private AdGroupFeedServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.AdGroupFeedService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateAdGroupFeedsRequest,
      com.google.ads.googleads.v18.services.MutateAdGroupFeedsResponse> getMutateAdGroupFeedsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupFeeds",
      requestType = com.google.ads.googleads.v18.services.MutateAdGroupFeedsRequest.class,
      responseType = com.google.ads.googleads.v18.services.MutateAdGroupFeedsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateAdGroupFeedsRequest,
      com.google.ads.googleads.v18.services.MutateAdGroupFeedsResponse> getMutateAdGroupFeedsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateAdGroupFeedsRequest, com.google.ads.googleads.v18.services.MutateAdGroupFeedsResponse> getMutateAdGroupFeedsMethod;
    if ((getMutateAdGroupFeedsMethod = AdGroupFeedServiceGrpc.getMutateAdGroupFeedsMethod) == null) {
      synchronized (AdGroupFeedServiceGrpc.class) {
        if ((getMutateAdGroupFeedsMethod = AdGroupFeedServiceGrpc.getMutateAdGroupFeedsMethod) == null) {
          AdGroupFeedServiceGrpc.getMutateAdGroupFeedsMethod = getMutateAdGroupFeedsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.MutateAdGroupFeedsRequest, com.google.ads.googleads.v18.services.MutateAdGroupFeedsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupFeeds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateAdGroupFeedsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateAdGroupFeedsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupFeedServiceMethodDescriptorSupplier("MutateAdGroupFeeds"))
              .build();
        }
      }
    }
    return getMutateAdGroupFeedsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupFeedServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupFeedServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupFeedServiceStub>() {
        @java.lang.Override
        public AdGroupFeedServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupFeedServiceStub(channel, callOptions);
        }
      };
    return AdGroupFeedServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupFeedServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupFeedServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupFeedServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupFeedServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupFeedServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupFeedServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupFeedServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupFeedServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupFeedServiceFutureStub>() {
        @java.lang.Override
        public AdGroupFeedServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupFeedServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupFeedServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage ad group feeds.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes ad group feeds. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AdGroupFeedError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    default void mutateAdGroupFeeds(com.google.ads.googleads.v18.services.MutateAdGroupFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateAdGroupFeedsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdGroupFeedsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AdGroupFeedService.
   * <pre>
   * Service to manage ad group feeds.
   * </pre>
   */
  public static abstract class AdGroupFeedServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdGroupFeedServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdGroupFeedService.
   * <pre>
   * Service to manage ad group feeds.
   * </pre>
   */
  public static final class AdGroupFeedServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdGroupFeedServiceStub> {
    private AdGroupFeedServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupFeedServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupFeedServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group feeds. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AdGroupFeedError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateAdGroupFeeds(com.google.ads.googleads.v18.services.MutateAdGroupFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateAdGroupFeedsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupFeedsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AdGroupFeedService.
   * <pre>
   * Service to manage ad group feeds.
   * </pre>
   */
  public static final class AdGroupFeedServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupFeedServiceBlockingStub> {
    private AdGroupFeedServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupFeedServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupFeedServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group feeds. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AdGroupFeedError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.MutateAdGroupFeedsResponse mutateAdGroupFeeds(com.google.ads.googleads.v18.services.MutateAdGroupFeedsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupFeedsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdGroupFeedService.
   * <pre>
   * Service to manage ad group feeds.
   * </pre>
   */
  public static final class AdGroupFeedServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdGroupFeedServiceFutureStub> {
    private AdGroupFeedServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupFeedServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupFeedServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group feeds. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AdGroupFeedError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.MutateAdGroupFeedsResponse> mutateAdGroupFeeds(
        com.google.ads.googleads.v18.services.MutateAdGroupFeedsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdGroupFeedsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_AD_GROUP_FEEDS = 0;

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
        case METHODID_MUTATE_AD_GROUP_FEEDS:
          serviceImpl.mutateAdGroupFeeds((com.google.ads.googleads.v18.services.MutateAdGroupFeedsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateAdGroupFeedsResponse>) responseObserver);
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
          getMutateAdGroupFeedsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.MutateAdGroupFeedsRequest,
              com.google.ads.googleads.v18.services.MutateAdGroupFeedsResponse>(
                service, METHODID_MUTATE_AD_GROUP_FEEDS)))
        .build();
  }

  private static abstract class AdGroupFeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupFeedServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.AdGroupFeedServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupFeedService");
    }
  }

  private static final class AdGroupFeedServiceFileDescriptorSupplier
      extends AdGroupFeedServiceBaseDescriptorSupplier {
    AdGroupFeedServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupFeedServiceMethodDescriptorSupplier
      extends AdGroupFeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AdGroupFeedServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AdGroupFeedServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupFeedServiceFileDescriptorSupplier())
              .addMethod(getMutateAdGroupFeedsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
