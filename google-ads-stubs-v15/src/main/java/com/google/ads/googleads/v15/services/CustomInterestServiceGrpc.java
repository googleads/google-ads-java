package com.google.ads.googleads.v15.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage custom interests.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v15/services/custom_interest_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomInterestServiceGrpc {

  private CustomInterestServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v15.services.CustomInterestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v15.services.MutateCustomInterestsRequest,
      com.google.ads.googleads.v15.services.MutateCustomInterestsResponse> getMutateCustomInterestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomInterests",
      requestType = com.google.ads.googleads.v15.services.MutateCustomInterestsRequest.class,
      responseType = com.google.ads.googleads.v15.services.MutateCustomInterestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v15.services.MutateCustomInterestsRequest,
      com.google.ads.googleads.v15.services.MutateCustomInterestsResponse> getMutateCustomInterestsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v15.services.MutateCustomInterestsRequest, com.google.ads.googleads.v15.services.MutateCustomInterestsResponse> getMutateCustomInterestsMethod;
    if ((getMutateCustomInterestsMethod = CustomInterestServiceGrpc.getMutateCustomInterestsMethod) == null) {
      synchronized (CustomInterestServiceGrpc.class) {
        if ((getMutateCustomInterestsMethod = CustomInterestServiceGrpc.getMutateCustomInterestsMethod) == null) {
          CustomInterestServiceGrpc.getMutateCustomInterestsMethod = getMutateCustomInterestsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v15.services.MutateCustomInterestsRequest, com.google.ads.googleads.v15.services.MutateCustomInterestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomInterests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v15.services.MutateCustomInterestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v15.services.MutateCustomInterestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomInterestServiceMethodDescriptorSupplier("MutateCustomInterests"))
              .build();
        }
      }
    }
    return getMutateCustomInterestsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomInterestServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomInterestServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomInterestServiceStub>() {
        @java.lang.Override
        public CustomInterestServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomInterestServiceStub(channel, callOptions);
        }
      };
    return CustomInterestServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomInterestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomInterestServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomInterestServiceBlockingStub>() {
        @java.lang.Override
        public CustomInterestServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomInterestServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomInterestServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomInterestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomInterestServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomInterestServiceFutureStub>() {
        @java.lang.Override
        public CustomInterestServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomInterestServiceFutureStub(channel, callOptions);
        }
      };
    return CustomInterestServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage custom interests.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates or updates custom interests. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CriterionError]()
     *   [CustomInterestError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [PolicyViolationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [StringLengthError]()
     * </pre>
     */
    default void mutateCustomInterests(com.google.ads.googleads.v15.services.MutateCustomInterestsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v15.services.MutateCustomInterestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomInterestsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomInterestService.
   * <pre>
   * Service to manage custom interests.
   * </pre>
   */
  public static abstract class CustomInterestServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomInterestServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomInterestService.
   * <pre>
   * Service to manage custom interests.
   * </pre>
   */
  public static final class CustomInterestServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomInterestServiceStub> {
    private CustomInterestServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomInterestServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomInterestServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or updates custom interests. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CriterionError]()
     *   [CustomInterestError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [PolicyViolationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateCustomInterests(com.google.ads.googleads.v15.services.MutateCustomInterestsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v15.services.MutateCustomInterestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomInterestsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomInterestService.
   * <pre>
   * Service to manage custom interests.
   * </pre>
   */
  public static final class CustomInterestServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomInterestServiceBlockingStub> {
    private CustomInterestServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomInterestServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomInterestServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or updates custom interests. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CriterionError]()
     *   [CustomInterestError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [PolicyViolationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v15.services.MutateCustomInterestsResponse mutateCustomInterests(com.google.ads.googleads.v15.services.MutateCustomInterestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomInterestsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomInterestService.
   * <pre>
   * Service to manage custom interests.
   * </pre>
   */
  public static final class CustomInterestServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomInterestServiceFutureStub> {
    private CustomInterestServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomInterestServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomInterestServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or updates custom interests. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CriterionError]()
     *   [CustomInterestError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [PolicyViolationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v15.services.MutateCustomInterestsResponse> mutateCustomInterests(
        com.google.ads.googleads.v15.services.MutateCustomInterestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomInterestsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOM_INTERESTS = 0;

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
        case METHODID_MUTATE_CUSTOM_INTERESTS:
          serviceImpl.mutateCustomInterests((com.google.ads.googleads.v15.services.MutateCustomInterestsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v15.services.MutateCustomInterestsResponse>) responseObserver);
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
          getMutateCustomInterestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v15.services.MutateCustomInterestsRequest,
              com.google.ads.googleads.v15.services.MutateCustomInterestsResponse>(
                service, METHODID_MUTATE_CUSTOM_INTERESTS)))
        .build();
  }

  private static abstract class CustomInterestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomInterestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v15.services.CustomInterestServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomInterestService");
    }
  }

  private static final class CustomInterestServiceFileDescriptorSupplier
      extends CustomInterestServiceBaseDescriptorSupplier {
    CustomInterestServiceFileDescriptorSupplier() {}
  }

  private static final class CustomInterestServiceMethodDescriptorSupplier
      extends CustomInterestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CustomInterestServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CustomInterestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomInterestServiceFileDescriptorSupplier())
              .addMethod(getMutateCustomInterestsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
