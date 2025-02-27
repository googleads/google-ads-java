package com.google.ads.googleads.v19.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Content Creator Insights Service helps users find information about YouTube
 * Creators and their content and how these creators and their audiences can be
 * reached with Google Ads. Accessible to allowlisted customers only.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v19/services/content_creator_insights_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ContentCreatorInsightsServiceGrpc {

  private ContentCreatorInsightsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v19.services.ContentCreatorInsightsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.GenerateCreatorInsightsRequest,
      com.google.ads.googleads.v19.services.GenerateCreatorInsightsResponse> getGenerateCreatorInsightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateCreatorInsights",
      requestType = com.google.ads.googleads.v19.services.GenerateCreatorInsightsRequest.class,
      responseType = com.google.ads.googleads.v19.services.GenerateCreatorInsightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.GenerateCreatorInsightsRequest,
      com.google.ads.googleads.v19.services.GenerateCreatorInsightsResponse> getGenerateCreatorInsightsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.GenerateCreatorInsightsRequest, com.google.ads.googleads.v19.services.GenerateCreatorInsightsResponse> getGenerateCreatorInsightsMethod;
    if ((getGenerateCreatorInsightsMethod = ContentCreatorInsightsServiceGrpc.getGenerateCreatorInsightsMethod) == null) {
      synchronized (ContentCreatorInsightsServiceGrpc.class) {
        if ((getGenerateCreatorInsightsMethod = ContentCreatorInsightsServiceGrpc.getGenerateCreatorInsightsMethod) == null) {
          ContentCreatorInsightsServiceGrpc.getGenerateCreatorInsightsMethod = getGenerateCreatorInsightsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v19.services.GenerateCreatorInsightsRequest, com.google.ads.googleads.v19.services.GenerateCreatorInsightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateCreatorInsights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.GenerateCreatorInsightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.GenerateCreatorInsightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContentCreatorInsightsServiceMethodDescriptorSupplier("GenerateCreatorInsights"))
              .build();
        }
      }
    }
    return getGenerateCreatorInsightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.GenerateTrendingInsightsRequest,
      com.google.ads.googleads.v19.services.GenerateTrendingInsightsResponse> getGenerateTrendingInsightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateTrendingInsights",
      requestType = com.google.ads.googleads.v19.services.GenerateTrendingInsightsRequest.class,
      responseType = com.google.ads.googleads.v19.services.GenerateTrendingInsightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.GenerateTrendingInsightsRequest,
      com.google.ads.googleads.v19.services.GenerateTrendingInsightsResponse> getGenerateTrendingInsightsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.GenerateTrendingInsightsRequest, com.google.ads.googleads.v19.services.GenerateTrendingInsightsResponse> getGenerateTrendingInsightsMethod;
    if ((getGenerateTrendingInsightsMethod = ContentCreatorInsightsServiceGrpc.getGenerateTrendingInsightsMethod) == null) {
      synchronized (ContentCreatorInsightsServiceGrpc.class) {
        if ((getGenerateTrendingInsightsMethod = ContentCreatorInsightsServiceGrpc.getGenerateTrendingInsightsMethod) == null) {
          ContentCreatorInsightsServiceGrpc.getGenerateTrendingInsightsMethod = getGenerateTrendingInsightsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v19.services.GenerateTrendingInsightsRequest, com.google.ads.googleads.v19.services.GenerateTrendingInsightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateTrendingInsights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.GenerateTrendingInsightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.GenerateTrendingInsightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContentCreatorInsightsServiceMethodDescriptorSupplier("GenerateTrendingInsights"))
              .build();
        }
      }
    }
    return getGenerateTrendingInsightsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContentCreatorInsightsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContentCreatorInsightsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContentCreatorInsightsServiceStub>() {
        @java.lang.Override
        public ContentCreatorInsightsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContentCreatorInsightsServiceStub(channel, callOptions);
        }
      };
    return ContentCreatorInsightsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ContentCreatorInsightsServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContentCreatorInsightsServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContentCreatorInsightsServiceBlockingV2Stub>() {
        @java.lang.Override
        public ContentCreatorInsightsServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContentCreatorInsightsServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ContentCreatorInsightsServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContentCreatorInsightsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContentCreatorInsightsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContentCreatorInsightsServiceBlockingStub>() {
        @java.lang.Override
        public ContentCreatorInsightsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContentCreatorInsightsServiceBlockingStub(channel, callOptions);
        }
      };
    return ContentCreatorInsightsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContentCreatorInsightsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContentCreatorInsightsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContentCreatorInsightsServiceFutureStub>() {
        @java.lang.Override
        public ContentCreatorInsightsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContentCreatorInsightsServiceFutureStub(channel, callOptions);
        }
      };
    return ContentCreatorInsightsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Content Creator Insights Service helps users find information about YouTube
   * Creators and their content and how these creators and their audiences can be
   * reached with Google Ads. Accessible to allowlisted customers only.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns insights for a collection of YouTube Creators and Channels.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    default void generateCreatorInsights(com.google.ads.googleads.v19.services.GenerateCreatorInsightsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.GenerateCreatorInsightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateCreatorInsightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns insights for trending content on YouTube.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    default void generateTrendingInsights(com.google.ads.googleads.v19.services.GenerateTrendingInsightsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.GenerateTrendingInsightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateTrendingInsightsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ContentCreatorInsightsService.
   * <pre>
   * Content Creator Insights Service helps users find information about YouTube
   * Creators and their content and how these creators and their audiences can be
   * reached with Google Ads. Accessible to allowlisted customers only.
   * </pre>
   */
  public static abstract class ContentCreatorInsightsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ContentCreatorInsightsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ContentCreatorInsightsService.
   * <pre>
   * Content Creator Insights Service helps users find information about YouTube
   * Creators and their content and how these creators and their audiences can be
   * reached with Google Ads. Accessible to allowlisted customers only.
   * </pre>
   */
  public static final class ContentCreatorInsightsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ContentCreatorInsightsServiceStub> {
    private ContentCreatorInsightsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentCreatorInsightsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContentCreatorInsightsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns insights for a collection of YouTube Creators and Channels.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateCreatorInsights(com.google.ads.googleads.v19.services.GenerateCreatorInsightsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.GenerateCreatorInsightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateCreatorInsightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns insights for trending content on YouTube.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateTrendingInsights(com.google.ads.googleads.v19.services.GenerateTrendingInsightsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.GenerateTrendingInsightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateTrendingInsightsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ContentCreatorInsightsService.
   * <pre>
   * Content Creator Insights Service helps users find information about YouTube
   * Creators and their content and how these creators and their audiences can be
   * reached with Google Ads. Accessible to allowlisted customers only.
   * </pre>
   */
  public static final class ContentCreatorInsightsServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ContentCreatorInsightsServiceBlockingV2Stub> {
    private ContentCreatorInsightsServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentCreatorInsightsServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContentCreatorInsightsServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns insights for a collection of YouTube Creators and Channels.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.GenerateCreatorInsightsResponse generateCreatorInsights(com.google.ads.googleads.v19.services.GenerateCreatorInsightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateCreatorInsightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns insights for trending content on YouTube.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.GenerateTrendingInsightsResponse generateTrendingInsights(com.google.ads.googleads.v19.services.GenerateTrendingInsightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateTrendingInsightsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ContentCreatorInsightsService.
   * <pre>
   * Content Creator Insights Service helps users find information about YouTube
   * Creators and their content and how these creators and their audiences can be
   * reached with Google Ads. Accessible to allowlisted customers only.
   * </pre>
   */
  public static final class ContentCreatorInsightsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ContentCreatorInsightsServiceBlockingStub> {
    private ContentCreatorInsightsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentCreatorInsightsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContentCreatorInsightsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns insights for a collection of YouTube Creators and Channels.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.GenerateCreatorInsightsResponse generateCreatorInsights(com.google.ads.googleads.v19.services.GenerateCreatorInsightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateCreatorInsightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns insights for trending content on YouTube.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.GenerateTrendingInsightsResponse generateTrendingInsights(com.google.ads.googleads.v19.services.GenerateTrendingInsightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateTrendingInsightsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ContentCreatorInsightsService.
   * <pre>
   * Content Creator Insights Service helps users find information about YouTube
   * Creators and their content and how these creators and their audiences can be
   * reached with Google Ads. Accessible to allowlisted customers only.
   * </pre>
   */
  public static final class ContentCreatorInsightsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ContentCreatorInsightsServiceFutureStub> {
    private ContentCreatorInsightsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentCreatorInsightsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContentCreatorInsightsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns insights for a collection of YouTube Creators and Channels.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v19.services.GenerateCreatorInsightsResponse> generateCreatorInsights(
        com.google.ads.googleads.v19.services.GenerateCreatorInsightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateCreatorInsightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns insights for trending content on YouTube.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v19.services.GenerateTrendingInsightsResponse> generateTrendingInsights(
        com.google.ads.googleads.v19.services.GenerateTrendingInsightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateTrendingInsightsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_CREATOR_INSIGHTS = 0;
  private static final int METHODID_GENERATE_TRENDING_INSIGHTS = 1;

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
        case METHODID_GENERATE_CREATOR_INSIGHTS:
          serviceImpl.generateCreatorInsights((com.google.ads.googleads.v19.services.GenerateCreatorInsightsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.GenerateCreatorInsightsResponse>) responseObserver);
          break;
        case METHODID_GENERATE_TRENDING_INSIGHTS:
          serviceImpl.generateTrendingInsights((com.google.ads.googleads.v19.services.GenerateTrendingInsightsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.GenerateTrendingInsightsResponse>) responseObserver);
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
          getGenerateCreatorInsightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v19.services.GenerateCreatorInsightsRequest,
              com.google.ads.googleads.v19.services.GenerateCreatorInsightsResponse>(
                service, METHODID_GENERATE_CREATOR_INSIGHTS)))
        .addMethod(
          getGenerateTrendingInsightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v19.services.GenerateTrendingInsightsRequest,
              com.google.ads.googleads.v19.services.GenerateTrendingInsightsResponse>(
                service, METHODID_GENERATE_TRENDING_INSIGHTS)))
        .build();
  }

  private static abstract class ContentCreatorInsightsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContentCreatorInsightsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v19.services.ContentCreatorInsightsServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContentCreatorInsightsService");
    }
  }

  private static final class ContentCreatorInsightsServiceFileDescriptorSupplier
      extends ContentCreatorInsightsServiceBaseDescriptorSupplier {
    ContentCreatorInsightsServiceFileDescriptorSupplier() {}
  }

  private static final class ContentCreatorInsightsServiceMethodDescriptorSupplier
      extends ContentCreatorInsightsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ContentCreatorInsightsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ContentCreatorInsightsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContentCreatorInsightsServiceFileDescriptorSupplier())
              .addMethod(getGenerateCreatorInsightsMethod())
              .addMethod(getGenerateTrendingInsightsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
