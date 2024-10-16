package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A service for managing Identity Verification Service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/identity_verification_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IdentityVerificationServiceGrpc {

  private IdentityVerificationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.IdentityVerificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.StartIdentityVerificationRequest,
      com.google.protobuf.Empty> getStartIdentityVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartIdentityVerification",
      requestType = com.google.ads.googleads.v18.services.StartIdentityVerificationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.StartIdentityVerificationRequest,
      com.google.protobuf.Empty> getStartIdentityVerificationMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.StartIdentityVerificationRequest, com.google.protobuf.Empty> getStartIdentityVerificationMethod;
    if ((getStartIdentityVerificationMethod = IdentityVerificationServiceGrpc.getStartIdentityVerificationMethod) == null) {
      synchronized (IdentityVerificationServiceGrpc.class) {
        if ((getStartIdentityVerificationMethod = IdentityVerificationServiceGrpc.getStartIdentityVerificationMethod) == null) {
          IdentityVerificationServiceGrpc.getStartIdentityVerificationMethod = getStartIdentityVerificationMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.StartIdentityVerificationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartIdentityVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.StartIdentityVerificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityVerificationServiceMethodDescriptorSupplier("StartIdentityVerification"))
              .build();
        }
      }
    }
    return getStartIdentityVerificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GetIdentityVerificationRequest,
      com.google.ads.googleads.v18.services.GetIdentityVerificationResponse> getGetIdentityVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIdentityVerification",
      requestType = com.google.ads.googleads.v18.services.GetIdentityVerificationRequest.class,
      responseType = com.google.ads.googleads.v18.services.GetIdentityVerificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GetIdentityVerificationRequest,
      com.google.ads.googleads.v18.services.GetIdentityVerificationResponse> getGetIdentityVerificationMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.GetIdentityVerificationRequest, com.google.ads.googleads.v18.services.GetIdentityVerificationResponse> getGetIdentityVerificationMethod;
    if ((getGetIdentityVerificationMethod = IdentityVerificationServiceGrpc.getGetIdentityVerificationMethod) == null) {
      synchronized (IdentityVerificationServiceGrpc.class) {
        if ((getGetIdentityVerificationMethod = IdentityVerificationServiceGrpc.getGetIdentityVerificationMethod) == null) {
          IdentityVerificationServiceGrpc.getGetIdentityVerificationMethod = getGetIdentityVerificationMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.GetIdentityVerificationRequest, com.google.ads.googleads.v18.services.GetIdentityVerificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIdentityVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GetIdentityVerificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.GetIdentityVerificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityVerificationServiceMethodDescriptorSupplier("GetIdentityVerification"))
              .build();
        }
      }
    }
    return getGetIdentityVerificationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IdentityVerificationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityVerificationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityVerificationServiceStub>() {
        @java.lang.Override
        public IdentityVerificationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityVerificationServiceStub(channel, callOptions);
        }
      };
    return IdentityVerificationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IdentityVerificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityVerificationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityVerificationServiceBlockingStub>() {
        @java.lang.Override
        public IdentityVerificationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityVerificationServiceBlockingStub(channel, callOptions);
        }
      };
    return IdentityVerificationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IdentityVerificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityVerificationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityVerificationServiceFutureStub>() {
        @java.lang.Override
        public IdentityVerificationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityVerificationServiceFutureStub(channel, callOptions);
        }
      };
    return IdentityVerificationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A service for managing Identity Verification Service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Starts Identity Verification for a given verification program type.
     *  Statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void startIdentityVerification(com.google.ads.googleads.v18.services.StartIdentityVerificationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartIdentityVerificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns Identity Verification information.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void getIdentityVerification(com.google.ads.googleads.v18.services.GetIdentityVerificationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GetIdentityVerificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIdentityVerificationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service IdentityVerificationService.
   * <pre>
   * A service for managing Identity Verification Service.
   * </pre>
   */
  public static abstract class IdentityVerificationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IdentityVerificationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service IdentityVerificationService.
   * <pre>
   * A service for managing Identity Verification Service.
   * </pre>
   */
  public static final class IdentityVerificationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<IdentityVerificationServiceStub> {
    private IdentityVerificationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityVerificationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityVerificationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts Identity Verification for a given verification program type.
     *  Statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void startIdentityVerification(com.google.ads.googleads.v18.services.StartIdentityVerificationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartIdentityVerificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns Identity Verification information.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getIdentityVerification(com.google.ads.googleads.v18.services.GetIdentityVerificationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GetIdentityVerificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIdentityVerificationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service IdentityVerificationService.
   * <pre>
   * A service for managing Identity Verification Service.
   * </pre>
   */
  public static final class IdentityVerificationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IdentityVerificationServiceBlockingStub> {
    private IdentityVerificationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityVerificationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityVerificationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts Identity Verification for a given verification program type.
     *  Statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.protobuf.Empty startIdentityVerification(com.google.ads.googleads.v18.services.StartIdentityVerificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartIdentityVerificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns Identity Verification information.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.GetIdentityVerificationResponse getIdentityVerification(com.google.ads.googleads.v18.services.GetIdentityVerificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIdentityVerificationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service IdentityVerificationService.
   * <pre>
   * A service for managing Identity Verification Service.
   * </pre>
   */
  public static final class IdentityVerificationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<IdentityVerificationServiceFutureStub> {
    private IdentityVerificationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityVerificationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityVerificationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts Identity Verification for a given verification program type.
     *  Statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> startIdentityVerification(
        com.google.ads.googleads.v18.services.StartIdentityVerificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartIdentityVerificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns Identity Verification information.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.GetIdentityVerificationResponse> getIdentityVerification(
        com.google.ads.googleads.v18.services.GetIdentityVerificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIdentityVerificationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_IDENTITY_VERIFICATION = 0;
  private static final int METHODID_GET_IDENTITY_VERIFICATION = 1;

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
        case METHODID_START_IDENTITY_VERIFICATION:
          serviceImpl.startIdentityVerification((com.google.ads.googleads.v18.services.StartIdentityVerificationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_IDENTITY_VERIFICATION:
          serviceImpl.getIdentityVerification((com.google.ads.googleads.v18.services.GetIdentityVerificationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.GetIdentityVerificationResponse>) responseObserver);
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
          getStartIdentityVerificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.StartIdentityVerificationRequest,
              com.google.protobuf.Empty>(
                service, METHODID_START_IDENTITY_VERIFICATION)))
        .addMethod(
          getGetIdentityVerificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.GetIdentityVerificationRequest,
              com.google.ads.googleads.v18.services.GetIdentityVerificationResponse>(
                service, METHODID_GET_IDENTITY_VERIFICATION)))
        .build();
  }

  private static abstract class IdentityVerificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IdentityVerificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.IdentityVerificationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IdentityVerificationService");
    }
  }

  private static final class IdentityVerificationServiceFileDescriptorSupplier
      extends IdentityVerificationServiceBaseDescriptorSupplier {
    IdentityVerificationServiceFileDescriptorSupplier() {}
  }

  private static final class IdentityVerificationServiceMethodDescriptorSupplier
      extends IdentityVerificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IdentityVerificationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IdentityVerificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IdentityVerificationServiceFileDescriptorSupplier())
              .addMethod(getStartIdentityVerificationMethod())
              .addMethod(getGetIdentityVerificationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
