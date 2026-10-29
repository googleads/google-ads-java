package com.google.ads.googleads.v26.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This service allows eligibility checking and discovery of category/job type
 * details for Local Services.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class LocalServicesEligibilityServiceGrpc {

  private LocalServicesEligibilityServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v26.services.LocalServicesEligibilityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityRequest,
      com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityResponse> getCheckLocalServicesEligibilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckLocalServicesEligibility",
      requestType = com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityRequest.class,
      responseType = com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityRequest,
      com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityResponse> getCheckLocalServicesEligibilityMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityRequest, com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityResponse> getCheckLocalServicesEligibilityMethod;
    if ((getCheckLocalServicesEligibilityMethod = LocalServicesEligibilityServiceGrpc.getCheckLocalServicesEligibilityMethod) == null) {
      synchronized (LocalServicesEligibilityServiceGrpc.class) {
        if ((getCheckLocalServicesEligibilityMethod = LocalServicesEligibilityServiceGrpc.getCheckLocalServicesEligibilityMethod) == null) {
          LocalServicesEligibilityServiceGrpc.getCheckLocalServicesEligibilityMethod = getCheckLocalServicesEligibilityMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityRequest, com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckLocalServicesEligibility"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LocalServicesEligibilityServiceMethodDescriptorSupplier("CheckLocalServicesEligibility"))
              .build();
        }
      }
    }
    return getCheckLocalServicesEligibilityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LocalServicesEligibilityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocalServicesEligibilityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocalServicesEligibilityServiceStub>() {
        @java.lang.Override
        public LocalServicesEligibilityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocalServicesEligibilityServiceStub(channel, callOptions);
        }
      };
    return LocalServicesEligibilityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static LocalServicesEligibilityServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocalServicesEligibilityServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocalServicesEligibilityServiceBlockingV2Stub>() {
        @java.lang.Override
        public LocalServicesEligibilityServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocalServicesEligibilityServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return LocalServicesEligibilityServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocalServicesEligibilityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocalServicesEligibilityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocalServicesEligibilityServiceBlockingStub>() {
        @java.lang.Override
        public LocalServicesEligibilityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocalServicesEligibilityServiceBlockingStub(channel, callOptions);
        }
      };
    return LocalServicesEligibilityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocalServicesEligibilityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocalServicesEligibilityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocalServicesEligibilityServiceFutureStub>() {
        @java.lang.Override
        public LocalServicesEligibilityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocalServicesEligibilityServiceFutureStub(channel, callOptions);
        }
      };
    return LocalServicesEligibilityServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service allows eligibility checking and discovery of category/job type
   * details for Local Services.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns the Local Services eligibility status and valid categories for a
     * given Customer and GBP Listing ID.
     * </pre>
     */
    default void checkLocalServicesEligibility(com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckLocalServicesEligibilityMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LocalServicesEligibilityService.
   * <pre>
   * This service allows eligibility checking and discovery of category/job type
   * details for Local Services.
   * </pre>
   */
  public static abstract class LocalServicesEligibilityServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LocalServicesEligibilityServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LocalServicesEligibilityService.
   * <pre>
   * This service allows eligibility checking and discovery of category/job type
   * details for Local Services.
   * </pre>
   */
  public static final class LocalServicesEligibilityServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LocalServicesEligibilityServiceStub> {
    private LocalServicesEligibilityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocalServicesEligibilityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocalServicesEligibilityServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the Local Services eligibility status and valid categories for a
     * given Customer and GBP Listing ID.
     * </pre>
     */
    public void checkLocalServicesEligibility(com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckLocalServicesEligibilityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LocalServicesEligibilityService.
   * <pre>
   * This service allows eligibility checking and discovery of category/job type
   * details for Local Services.
   * </pre>
   */
  public static final class LocalServicesEligibilityServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<LocalServicesEligibilityServiceBlockingV2Stub> {
    private LocalServicesEligibilityServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocalServicesEligibilityServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocalServicesEligibilityServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the Local Services eligibility status and valid categories for a
     * given Customer and GBP Listing ID.
     * </pre>
     */
    public com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityResponse checkLocalServicesEligibility(com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCheckLocalServicesEligibilityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service LocalServicesEligibilityService.
   * <pre>
   * This service allows eligibility checking and discovery of category/job type
   * details for Local Services.
   * </pre>
   */
  public static final class LocalServicesEligibilityServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LocalServicesEligibilityServiceBlockingStub> {
    private LocalServicesEligibilityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocalServicesEligibilityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocalServicesEligibilityServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the Local Services eligibility status and valid categories for a
     * given Customer and GBP Listing ID.
     * </pre>
     */
    public com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityResponse checkLocalServicesEligibility(com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckLocalServicesEligibilityMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LocalServicesEligibilityService.
   * <pre>
   * This service allows eligibility checking and discovery of category/job type
   * details for Local Services.
   * </pre>
   */
  public static final class LocalServicesEligibilityServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LocalServicesEligibilityServiceFutureStub> {
    private LocalServicesEligibilityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocalServicesEligibilityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocalServicesEligibilityServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the Local Services eligibility status and valid categories for a
     * given Customer and GBP Listing ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityResponse> checkLocalServicesEligibility(
        com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckLocalServicesEligibilityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_LOCAL_SERVICES_ELIGIBILITY = 0;

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
        case METHODID_CHECK_LOCAL_SERVICES_ELIGIBILITY:
          serviceImpl.checkLocalServicesEligibility((com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityResponse>) responseObserver);
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
          getCheckLocalServicesEligibilityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityRequest,
              com.google.ads.googleads.v26.services.CheckLocalServicesEligibilityResponse>(
                service, METHODID_CHECK_LOCAL_SERVICES_ELIGIBILITY)))
        .build();
  }

  private static abstract class LocalServicesEligibilityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LocalServicesEligibilityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v26.services.LocalServicesEligibilityServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LocalServicesEligibilityService");
    }
  }

  private static final class LocalServicesEligibilityServiceFileDescriptorSupplier
      extends LocalServicesEligibilityServiceBaseDescriptorSupplier {
    LocalServicesEligibilityServiceFileDescriptorSupplier() {}
  }

  private static final class LocalServicesEligibilityServiceMethodDescriptorSupplier
      extends LocalServicesEligibilityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LocalServicesEligibilityServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LocalServicesEligibilityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LocalServicesEligibilityServiceFileDescriptorSupplier())
              .addMethod(getCheckLocalServicesEligibilityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
