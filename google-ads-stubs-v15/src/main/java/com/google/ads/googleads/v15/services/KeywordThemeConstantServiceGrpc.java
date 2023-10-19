package com.google.ads.googleads.v15.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch Smart Campaign keyword themes.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v15/services/keyword_theme_constant_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KeywordThemeConstantServiceGrpc {

  private KeywordThemeConstantServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v15.services.KeywordThemeConstantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsRequest,
      com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsResponse> getSuggestKeywordThemeConstantsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuggestKeywordThemeConstants",
      requestType = com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsRequest.class,
      responseType = com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsRequest,
      com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsResponse> getSuggestKeywordThemeConstantsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsRequest, com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsResponse> getSuggestKeywordThemeConstantsMethod;
    if ((getSuggestKeywordThemeConstantsMethod = KeywordThemeConstantServiceGrpc.getSuggestKeywordThemeConstantsMethod) == null) {
      synchronized (KeywordThemeConstantServiceGrpc.class) {
        if ((getSuggestKeywordThemeConstantsMethod = KeywordThemeConstantServiceGrpc.getSuggestKeywordThemeConstantsMethod) == null) {
          KeywordThemeConstantServiceGrpc.getSuggestKeywordThemeConstantsMethod = getSuggestKeywordThemeConstantsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsRequest, com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuggestKeywordThemeConstants"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordThemeConstantServiceMethodDescriptorSupplier("SuggestKeywordThemeConstants"))
              .build();
        }
      }
    }
    return getSuggestKeywordThemeConstantsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeywordThemeConstantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordThemeConstantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordThemeConstantServiceStub>() {
        @java.lang.Override
        public KeywordThemeConstantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordThemeConstantServiceStub(channel, callOptions);
        }
      };
    return KeywordThemeConstantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordThemeConstantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordThemeConstantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordThemeConstantServiceBlockingStub>() {
        @java.lang.Override
        public KeywordThemeConstantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordThemeConstantServiceBlockingStub(channel, callOptions);
        }
      };
    return KeywordThemeConstantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordThemeConstantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordThemeConstantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordThemeConstantServiceFutureStub>() {
        @java.lang.Override
        public KeywordThemeConstantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordThemeConstantServiceFutureStub(channel, callOptions);
        }
      };
    return KeywordThemeConstantServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch Smart Campaign keyword themes.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns KeywordThemeConstant suggestions by keyword themes.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void suggestKeywordThemeConstants(com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestKeywordThemeConstantsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service KeywordThemeConstantService.
   * <pre>
   * Service to fetch Smart Campaign keyword themes.
   * </pre>
   */
  public static abstract class KeywordThemeConstantServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return KeywordThemeConstantServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service KeywordThemeConstantService.
   * <pre>
   * Service to fetch Smart Campaign keyword themes.
   * </pre>
   */
  public static final class KeywordThemeConstantServiceStub
      extends io.grpc.stub.AbstractAsyncStub<KeywordThemeConstantServiceStub> {
    private KeywordThemeConstantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordThemeConstantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordThemeConstantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns KeywordThemeConstant suggestions by keyword themes.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void suggestKeywordThemeConstants(com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestKeywordThemeConstantsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service KeywordThemeConstantService.
   * <pre>
   * Service to fetch Smart Campaign keyword themes.
   * </pre>
   */
  public static final class KeywordThemeConstantServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<KeywordThemeConstantServiceBlockingStub> {
    private KeywordThemeConstantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordThemeConstantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordThemeConstantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns KeywordThemeConstant suggestions by keyword themes.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsResponse suggestKeywordThemeConstants(com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestKeywordThemeConstantsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service KeywordThemeConstantService.
   * <pre>
   * Service to fetch Smart Campaign keyword themes.
   * </pre>
   */
  public static final class KeywordThemeConstantServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<KeywordThemeConstantServiceFutureStub> {
    private KeywordThemeConstantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordThemeConstantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordThemeConstantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns KeywordThemeConstant suggestions by keyword themes.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsResponse> suggestKeywordThemeConstants(
        com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestKeywordThemeConstantsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUGGEST_KEYWORD_THEME_CONSTANTS = 0;

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
        case METHODID_SUGGEST_KEYWORD_THEME_CONSTANTS:
          serviceImpl.suggestKeywordThemeConstants((com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsResponse>) responseObserver);
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
          getSuggestKeywordThemeConstantsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsRequest,
              com.google.ads.googleads.v15.services.SuggestKeywordThemeConstantsResponse>(
                service, METHODID_SUGGEST_KEYWORD_THEME_CONSTANTS)))
        .build();
  }

  private static abstract class KeywordThemeConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeywordThemeConstantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v15.services.KeywordThemeConstantServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeywordThemeConstantService");
    }
  }

  private static final class KeywordThemeConstantServiceFileDescriptorSupplier
      extends KeywordThemeConstantServiceBaseDescriptorSupplier {
    KeywordThemeConstantServiceFileDescriptorSupplier() {}
  }

  private static final class KeywordThemeConstantServiceMethodDescriptorSupplier
      extends KeywordThemeConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    KeywordThemeConstantServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (KeywordThemeConstantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeywordThemeConstantServiceFileDescriptorSupplier())
              .addMethod(getSuggestKeywordThemeConstantsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
