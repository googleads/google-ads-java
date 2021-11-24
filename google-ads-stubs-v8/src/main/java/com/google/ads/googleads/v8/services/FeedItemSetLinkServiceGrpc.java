package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage feed item set links.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/feed_item_set_link_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FeedItemSetLinkServiceGrpc {

  private FeedItemSetLinkServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.FeedItemSetLinkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetFeedItemSetLinkRequest,
      com.google.ads.googleads.v8.resources.FeedItemSetLink> getGetFeedItemSetLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeedItemSetLink",
      requestType = com.google.ads.googleads.v8.services.GetFeedItemSetLinkRequest.class,
      responseType = com.google.ads.googleads.v8.resources.FeedItemSetLink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetFeedItemSetLinkRequest,
      com.google.ads.googleads.v8.resources.FeedItemSetLink> getGetFeedItemSetLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetFeedItemSetLinkRequest, com.google.ads.googleads.v8.resources.FeedItemSetLink> getGetFeedItemSetLinkMethod;
    if ((getGetFeedItemSetLinkMethod = FeedItemSetLinkServiceGrpc.getGetFeedItemSetLinkMethod) == null) {
      synchronized (FeedItemSetLinkServiceGrpc.class) {
        if ((getGetFeedItemSetLinkMethod = FeedItemSetLinkServiceGrpc.getGetFeedItemSetLinkMethod) == null) {
          FeedItemSetLinkServiceGrpc.getGetFeedItemSetLinkMethod = getGetFeedItemSetLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetFeedItemSetLinkRequest, com.google.ads.googleads.v8.resources.FeedItemSetLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeedItemSetLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetFeedItemSetLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.FeedItemSetLink.getDefaultInstance()))
              .setSchemaDescriptor(new FeedItemSetLinkServiceMethodDescriptorSupplier("GetFeedItemSetLink"))
              .build();
        }
      }
    }
    return getGetFeedItemSetLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateFeedItemSetLinksRequest,
      com.google.ads.googleads.v8.services.MutateFeedItemSetLinksResponse> getMutateFeedItemSetLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateFeedItemSetLinks",
      requestType = com.google.ads.googleads.v8.services.MutateFeedItemSetLinksRequest.class,
      responseType = com.google.ads.googleads.v8.services.MutateFeedItemSetLinksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateFeedItemSetLinksRequest,
      com.google.ads.googleads.v8.services.MutateFeedItemSetLinksResponse> getMutateFeedItemSetLinksMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateFeedItemSetLinksRequest, com.google.ads.googleads.v8.services.MutateFeedItemSetLinksResponse> getMutateFeedItemSetLinksMethod;
    if ((getMutateFeedItemSetLinksMethod = FeedItemSetLinkServiceGrpc.getMutateFeedItemSetLinksMethod) == null) {
      synchronized (FeedItemSetLinkServiceGrpc.class) {
        if ((getMutateFeedItemSetLinksMethod = FeedItemSetLinkServiceGrpc.getMutateFeedItemSetLinksMethod) == null) {
          FeedItemSetLinkServiceGrpc.getMutateFeedItemSetLinksMethod = getMutateFeedItemSetLinksMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.MutateFeedItemSetLinksRequest, com.google.ads.googleads.v8.services.MutateFeedItemSetLinksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateFeedItemSetLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.MutateFeedItemSetLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.MutateFeedItemSetLinksResponse.getDefaultInstance()))
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
  public static abstract class FeedItemSetLinkServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested feed item set link in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getFeedItemSetLink(com.google.ads.googleads.v8.services.GetFeedItemSetLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.FeedItemSetLink> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFeedItemSetLinkMethod(), responseObserver);
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
    public void mutateFeedItemSetLinks(com.google.ads.googleads.v8.services.MutateFeedItemSetLinksRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateFeedItemSetLinksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateFeedItemSetLinksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeedItemSetLinkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetFeedItemSetLinkRequest,
                com.google.ads.googleads.v8.resources.FeedItemSetLink>(
                  this, METHODID_GET_FEED_ITEM_SET_LINK)))
          .addMethod(
            getMutateFeedItemSetLinksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.MutateFeedItemSetLinksRequest,
                com.google.ads.googleads.v8.services.MutateFeedItemSetLinksResponse>(
                  this, METHODID_MUTATE_FEED_ITEM_SET_LINKS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage feed item set links.
   * </pre>
   */
  public static final class FeedItemSetLinkServiceStub extends io.grpc.stub.AbstractAsyncStub<FeedItemSetLinkServiceStub> {
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
     * Returns the requested feed item set link in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getFeedItemSetLink(com.google.ads.googleads.v8.services.GetFeedItemSetLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.FeedItemSetLink> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFeedItemSetLinkMethod(), getCallOptions()), request, responseObserver);
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
    public void mutateFeedItemSetLinks(com.google.ads.googleads.v8.services.MutateFeedItemSetLinksRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateFeedItemSetLinksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateFeedItemSetLinksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage feed item set links.
   * </pre>
   */
  public static final class FeedItemSetLinkServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FeedItemSetLinkServiceBlockingStub> {
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
     * Returns the requested feed item set link in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.FeedItemSetLink getFeedItemSetLink(com.google.ads.googleads.v8.services.GetFeedItemSetLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFeedItemSetLinkMethod(), getCallOptions(), request);
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
    public com.google.ads.googleads.v8.services.MutateFeedItemSetLinksResponse mutateFeedItemSetLinks(com.google.ads.googleads.v8.services.MutateFeedItemSetLinksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateFeedItemSetLinksMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage feed item set links.
   * </pre>
   */
  public static final class FeedItemSetLinkServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FeedItemSetLinkServiceFutureStub> {
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
     * Returns the requested feed item set link in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.FeedItemSetLink> getFeedItemSetLink(
        com.google.ads.googleads.v8.services.GetFeedItemSetLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFeedItemSetLinkMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.services.MutateFeedItemSetLinksResponse> mutateFeedItemSetLinks(
        com.google.ads.googleads.v8.services.MutateFeedItemSetLinksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateFeedItemSetLinksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEED_ITEM_SET_LINK = 0;
  private static final int METHODID_MUTATE_FEED_ITEM_SET_LINKS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FeedItemSetLinkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FeedItemSetLinkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEED_ITEM_SET_LINK:
          serviceImpl.getFeedItemSetLink((com.google.ads.googleads.v8.services.GetFeedItemSetLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.FeedItemSetLink>) responseObserver);
          break;
        case METHODID_MUTATE_FEED_ITEM_SET_LINKS:
          serviceImpl.mutateFeedItemSetLinks((com.google.ads.googleads.v8.services.MutateFeedItemSetLinksRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateFeedItemSetLinksResponse>) responseObserver);
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

  private static abstract class FeedItemSetLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedItemSetLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.FeedItemSetLinkServiceProto.getDescriptor();
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
              .addMethod(getGetFeedItemSetLinkMethod())
              .addMethod(getMutateFeedItemSetLinksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
