package com.google.ads.googleads.v14.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage feed item set links.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v14/services/feed_item_set_link_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FeedItemSetLinkServiceGrpc {

  private FeedItemSetLinkServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v14.services.FeedItemSetLinkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateFeedItemSetLinksRequest,
      com.google.ads.googleads.v14.services.MutateFeedItemSetLinksResponse> getMutateFeedItemSetLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateFeedItemSetLinks",
      requestType = com.google.ads.googleads.v14.services.MutateFeedItemSetLinksRequest.class,
      responseType = com.google.ads.googleads.v14.services.MutateFeedItemSetLinksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateFeedItemSetLinksRequest,
      com.google.ads.googleads.v14.services.MutateFeedItemSetLinksResponse> getMutateFeedItemSetLinksMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateFeedItemSetLinksRequest, com.google.ads.googleads.v14.services.MutateFeedItemSetLinksResponse> getMutateFeedItemSetLinksMethod;
    if ((getMutateFeedItemSetLinksMethod = FeedItemSetLinkServiceGrpc.getMutateFeedItemSetLinksMethod) == null) {
      synchronized (FeedItemSetLinkServiceGrpc.class) {
        if ((getMutateFeedItemSetLinksMethod = FeedItemSetLinkServiceGrpc.getMutateFeedItemSetLinksMethod) == null) {
          FeedItemSetLinkServiceGrpc.getMutateFeedItemSetLinksMethod = getMutateFeedItemSetLinksMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v14.services.MutateFeedItemSetLinksRequest, com.google.ads.googleads.v14.services.MutateFeedItemSetLinksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateFeedItemSetLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateFeedItemSetLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateFeedItemSetLinksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FeedItemSetLinkServiceMethodDescriptorSupplier("MutateFeedItemSetLinks"))
              .build();
        }
      }
    }
    return getMutateFeedItemSetLinksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedItemSetLinkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedItemSetLinkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedItemSetLinkServiceStub>() {
        @java.lang.Override
        public FeedItemSetLinkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedItemSetLinkServiceStub(channel, callOptions);
        }
      };
    return FeedItemSetLinkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedItemSetLinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedItemSetLinkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedItemSetLinkServiceBlockingStub>() {
        @java.lang.Override
        public FeedItemSetLinkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedItemSetLinkServiceBlockingStub(channel, callOptions);
        }
      };
    return FeedItemSetLinkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedItemSetLinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedItemSetLinkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedItemSetLinkServiceFutureStub>() {
        @java.lang.Override
        public FeedItemSetLinkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedItemSetLinkServiceFutureStub(channel, callOptions);
        }
      };
    return FeedItemSetLinkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage feed item set links.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes feed item set links.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void mutateFeedItemSetLinks(com.google.ads.googleads.v14.services.MutateFeedItemSetLinksRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateFeedItemSetLinksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateFeedItemSetLinksMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FeedItemSetLinkService.
   * <pre>
   * Service to manage feed item set links.
   * </pre>
   */
  public static abstract class FeedItemSetLinkServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FeedItemSetLinkServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FeedItemSetLinkService.
   * <pre>
   * Service to manage feed item set links.
   * </pre>
   */
  public static final class FeedItemSetLinkServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FeedItemSetLinkServiceStub> {
    private FeedItemSetLinkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemSetLinkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedItemSetLinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes feed item set links.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateFeedItemSetLinks(com.google.ads.googleads.v14.services.MutateFeedItemSetLinksRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateFeedItemSetLinksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateFeedItemSetLinksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FeedItemSetLinkService.
   * <pre>
   * Service to manage feed item set links.
   * </pre>
   */
  public static final class FeedItemSetLinkServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FeedItemSetLinkServiceBlockingStub> {
    private FeedItemSetLinkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemSetLinkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedItemSetLinkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes feed item set links.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v14.services.MutateFeedItemSetLinksResponse mutateFeedItemSetLinks(com.google.ads.googleads.v14.services.MutateFeedItemSetLinksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateFeedItemSetLinksMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FeedItemSetLinkService.
   * <pre>
   * Service to manage feed item set links.
   * </pre>
   */
  public static final class FeedItemSetLinkServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FeedItemSetLinkServiceFutureStub> {
    private FeedItemSetLinkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedItemSetLinkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedItemSetLinkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes feed item set links.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v14.services.MutateFeedItemSetLinksResponse> mutateFeedItemSetLinks(
        com.google.ads.googleads.v14.services.MutateFeedItemSetLinksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateFeedItemSetLinksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_FEED_ITEM_SET_LINKS = 0;

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
        case METHODID_MUTATE_FEED_ITEM_SET_LINKS:
          serviceImpl.mutateFeedItemSetLinks((com.google.ads.googleads.v14.services.MutateFeedItemSetLinksRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateFeedItemSetLinksResponse>) responseObserver);
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
          getMutateFeedItemSetLinksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v14.services.MutateFeedItemSetLinksRequest,
              com.google.ads.googleads.v14.services.MutateFeedItemSetLinksResponse>(
                service, METHODID_MUTATE_FEED_ITEM_SET_LINKS)))
        .build();
  }

  private static abstract class FeedItemSetLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedItemSetLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v14.services.FeedItemSetLinkServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedItemSetLinkService");
    }
  }

  private static final class FeedItemSetLinkServiceFileDescriptorSupplier
      extends FeedItemSetLinkServiceBaseDescriptorSupplier {
    FeedItemSetLinkServiceFileDescriptorSupplier() {}
  }

  private static final class FeedItemSetLinkServiceMethodDescriptorSupplier
      extends FeedItemSetLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FeedItemSetLinkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FeedItemSetLinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedItemSetLinkServiceFileDescriptorSupplier())
              .addMethod(getMutateFeedItemSetLinksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
