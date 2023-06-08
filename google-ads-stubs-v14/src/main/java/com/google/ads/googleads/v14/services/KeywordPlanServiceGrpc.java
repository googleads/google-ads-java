package com.google.ads.googleads.v14.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage keyword plans.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v14/services/keyword_plan_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KeywordPlanServiceGrpc {

  private KeywordPlanServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v14.services.KeywordPlanService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateKeywordPlansRequest,
      com.google.ads.googleads.v14.services.MutateKeywordPlansResponse> getMutateKeywordPlansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateKeywordPlans",
      requestType = com.google.ads.googleads.v14.services.MutateKeywordPlansRequest.class,
      responseType = com.google.ads.googleads.v14.services.MutateKeywordPlansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateKeywordPlansRequest,
      com.google.ads.googleads.v14.services.MutateKeywordPlansResponse> getMutateKeywordPlansMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateKeywordPlansRequest, com.google.ads.googleads.v14.services.MutateKeywordPlansResponse> getMutateKeywordPlansMethod;
    if ((getMutateKeywordPlansMethod = KeywordPlanServiceGrpc.getMutateKeywordPlansMethod) == null) {
      synchronized (KeywordPlanServiceGrpc.class) {
        if ((getMutateKeywordPlansMethod = KeywordPlanServiceGrpc.getMutateKeywordPlansMethod) == null) {
          KeywordPlanServiceGrpc.getMutateKeywordPlansMethod = getMutateKeywordPlansMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v14.services.MutateKeywordPlansRequest, com.google.ads.googleads.v14.services.MutateKeywordPlansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateKeywordPlans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateKeywordPlansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateKeywordPlansResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanServiceMethodDescriptorSupplier("MutateKeywordPlans"))
              .build();
        }
      }
    }
    return getMutateKeywordPlansMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeywordPlanServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanServiceStub>() {
        @java.lang.Override
        public KeywordPlanServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanServiceStub(channel, callOptions);
        }
      };
    return KeywordPlanServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordPlanServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanServiceBlockingStub>() {
        @java.lang.Override
        public KeywordPlanServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanServiceBlockingStub(channel, callOptions);
        }
      };
    return KeywordPlanServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordPlanServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanServiceFutureStub>() {
        @java.lang.Override
        public KeywordPlanServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanServiceFutureStub(channel, callOptions);
        }
      };
    return KeywordPlanServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage keyword plans.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    default void mutateKeywordPlans(com.google.ads.googleads.v14.services.MutateKeywordPlansRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateKeywordPlansResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateKeywordPlansMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service KeywordPlanService.
   * <pre>
   * Service to manage keyword plans.
   * </pre>
   */
  public static abstract class KeywordPlanServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return KeywordPlanServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service KeywordPlanService.
   * <pre>
   * Service to manage keyword plans.
   * </pre>
   */
  public static final class KeywordPlanServiceStub
      extends io.grpc.stub.AbstractAsyncStub<KeywordPlanServiceStub> {
    private KeywordPlanServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateKeywordPlans(com.google.ads.googleads.v14.services.MutateKeywordPlansRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateKeywordPlansResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateKeywordPlansMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service KeywordPlanService.
   * <pre>
   * Service to manage keyword plans.
   * </pre>
   */
  public static final class KeywordPlanServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<KeywordPlanServiceBlockingStub> {
    private KeywordPlanServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v14.services.MutateKeywordPlansResponse mutateKeywordPlans(com.google.ads.googleads.v14.services.MutateKeywordPlansRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateKeywordPlansMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service KeywordPlanService.
   * <pre>
   * Service to manage keyword plans.
   * </pre>
   */
  public static final class KeywordPlanServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<KeywordPlanServiceFutureStub> {
    private KeywordPlanServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes keyword plans. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v14.services.MutateKeywordPlansResponse> mutateKeywordPlans(
        com.google.ads.googleads.v14.services.MutateKeywordPlansRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateKeywordPlansMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_KEYWORD_PLANS = 0;

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
        case METHODID_MUTATE_KEYWORD_PLANS:
          serviceImpl.mutateKeywordPlans((com.google.ads.googleads.v14.services.MutateKeywordPlansRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateKeywordPlansResponse>) responseObserver);
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
          getMutateKeywordPlansMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v14.services.MutateKeywordPlansRequest,
              com.google.ads.googleads.v14.services.MutateKeywordPlansResponse>(
                service, METHODID_MUTATE_KEYWORD_PLANS)))
        .build();
  }

  private static abstract class KeywordPlanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeywordPlanServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v14.services.KeywordPlanServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeywordPlanService");
    }
  }

  private static final class KeywordPlanServiceFileDescriptorSupplier
      extends KeywordPlanServiceBaseDescriptorSupplier {
    KeywordPlanServiceFileDescriptorSupplier() {}
  }

  private static final class KeywordPlanServiceMethodDescriptorSupplier
      extends KeywordPlanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeywordPlanServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeywordPlanServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeywordPlanServiceFileDescriptorSupplier())
              .addMethod(getMutateKeywordPlansMethod())
              .build();
        }
      }
    }
    return result;
  }
}
