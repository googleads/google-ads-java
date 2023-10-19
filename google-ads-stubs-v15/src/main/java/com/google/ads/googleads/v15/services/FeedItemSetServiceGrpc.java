package com.google.ads.googleads.v15.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage feed Item Set
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v15/services/feed_item_set_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FeedItemSetServiceGrpc {

  private FeedItemSetServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v15.services.FeedItemSetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v15.services.MutateFeedItemSetsRequest,
      com.google.ads.googleads.v15.services.MutateFeedItemSetsResponse> getMutateFeedItemSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateFeedItemSets",
      requestType = com.google.ads.googleads.v15.services.MutateFeedItemSetsRequest.class,
      responseType = com.google.ads.googleads.v15.services.MutateFeedItemSetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v15.services.MutateFeedItemSetsRequest,
      com.google.ads.googleads.v15.services.MutateFeedItemSetsResponse> getMutateFeedItemSetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v15.services.MutateFeedItemSetsRequest, com.google.ads.googleads.v15.services.MutateFeedItemSetsResponse> getMutateFeedItemSetsMethod;
    if ((getMutateFeedItemSetsMethod = FeedItemSetServiceGrpc.getMutateFeedItemSetsMethod) == null) {
      synchronized (FeedItemSetServiceGrpc.class) {
        if ((getMutateFeedItemSetsMethod = FeedItemSetServiceGrpc.getMutateFeedItemSetsMethod) == null) {
          FeedItemSetServiceGrpc.getMutateFeedItemSetsMethod = getMutateFeedItemSetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v15.services.MutateFeedItemSetsRequest, com.google.ads.googleads.v15.services.MutateFeedItemSetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateFeedItemSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v15.services.MutateFeedItemSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v15.services.MutateFeedItemSetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FeedItemSetServiceMethodDescriptorSupplier("MutateFeedItemSets"))
              .build();
        }
      }
    }
    return getMutateFeedItemSetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedItemSetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedItemSetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedItemSetServiceStub>() {
        @java.lang.Override
        public FeedItemSetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedItemSetServiceStub(channel, callOptions);
        }
      };
    return FeedItemSetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedItemSetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedItemSetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedItemSetServiceBlockingStub>() {
        @java.lang.Override
        public FeedItemSetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedItemSetServiceBlockingStub(channel, callOptions);
        }
      };
    return FeedItemSetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedItemSetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedItemSetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedItemSetServiceFutureStub>() {
        @java.lang.Override
        public FeedItemSetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedItemSetServiceFutureStub(channel, callOptions);
        }
      };
    return FeedItemSetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage feed Item Set
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates or removes feed item sets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void mutateFeedItemSets(com.google.ads.googleads.v15.services.MutateFeedItemSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v15.services.MutateFeedItemSetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateFeedItemSetsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FeedItemSetService.
   * <pre>
   * Service to manage feed Item Set
   * </pre>
   */
  public static abstract class FeedItemSetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FeedItemSetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FeedItemSetService.
   * <pre>
   * Service to manage feed Item Set
   * </pre>
   */
  public static final class FeedItemSetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FeedItemSetServiceStub> {
    private FeedItemSetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemSetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedItemSetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes feed item sets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateFeedItemSets(com.google.ads.googleads.v15.services.MutateFeedItemSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v15.services.MutateFeedItemSetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateFeedItemSetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FeedItemSetService.
   * <pre>
   * Service to manage feed Item Set
   * </pre>
   */
  public static final class FeedItemSetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FeedItemSetServiceBlockingStub> {
    private FeedItemSetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemSetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedItemSetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes feed item sets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v15.services.MutateFeedItemSetsResponse mutateFeedItemSets(com.google.ads.googleads.v15.services.MutateFeedItemSetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateFeedItemSetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FeedItemSetService.
   * <pre>
   * Service to manage feed Item Set
   * </pre>
   */
  public static final class FeedItemSetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FeedItemSetServiceFutureStub> {
    private FeedItemSetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemSetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedItemSetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes feed item sets. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v15.services.MutateFeedItemSetsResponse> mutateFeedItemSets(
        com.google.ads.googleads.v15.services.MutateFeedItemSetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateFeedItemSetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_FEED_ITEM_SETS = 0;

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
        case METHODID_MUTATE_FEED_ITEM_SETS:
          serviceImpl.mutateFeedItemSets((com.google.ads.googleads.v15.services.MutateFeedItemSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v15.services.MutateFeedItemSetsResponse>) responseObserver);
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
          getMutateFeedItemSetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v15.services.MutateFeedItemSetsRequest,
              com.google.ads.googleads.v15.services.MutateFeedItemSetsResponse>(
                service, METHODID_MUTATE_FEED_ITEM_SETS)))
        .build();
  }

  private static abstract class FeedItemSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedItemSetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v15.services.FeedItemSetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedItemSetService");
    }
  }

  private static final class FeedItemSetServiceFileDescriptorSupplier
      extends FeedItemSetServiceBaseDescriptorSupplier {
    FeedItemSetServiceFileDescriptorSupplier() {}
  }

  private static final class FeedItemSetServiceMethodDescriptorSupplier
      extends FeedItemSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FeedItemSetServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FeedItemSetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedItemSetServiceFileDescriptorSupplier())
              .addMethod(getMutateFeedItemSetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
