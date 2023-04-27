package com.google.ads.googleads.v13.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage ad parameters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v13/services/ad_parameter_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdParameterServiceGrpc {

  private AdParameterServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v13.services.AdParameterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateAdParametersRequest,
      com.google.ads.googleads.v13.services.MutateAdParametersResponse> getMutateAdParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdParameters",
      requestType = com.google.ads.googleads.v13.services.MutateAdParametersRequest.class,
      responseType = com.google.ads.googleads.v13.services.MutateAdParametersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateAdParametersRequest,
      com.google.ads.googleads.v13.services.MutateAdParametersResponse> getMutateAdParametersMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateAdParametersRequest, com.google.ads.googleads.v13.services.MutateAdParametersResponse> getMutateAdParametersMethod;
    if ((getMutateAdParametersMethod = AdParameterServiceGrpc.getMutateAdParametersMethod) == null) {
      synchronized (AdParameterServiceGrpc.class) {
        if ((getMutateAdParametersMethod = AdParameterServiceGrpc.getMutateAdParametersMethod) == null) {
          AdParameterServiceGrpc.getMutateAdParametersMethod = getMutateAdParametersMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v13.services.MutateAdParametersRequest, com.google.ads.googleads.v13.services.MutateAdParametersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateAdParametersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateAdParametersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdParameterServiceMethodDescriptorSupplier("MutateAdParameters"))
              .build();
        }
      }
    }
    return getMutateAdParametersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdParameterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdParameterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdParameterServiceStub>() {
        @java.lang.Override
        public AdParameterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdParameterServiceStub(channel, callOptions);
        }
      };
    return AdParameterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdParameterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdParameterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdParameterServiceBlockingStub>() {
        @java.lang.Override
        public AdParameterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdParameterServiceBlockingStub(channel, callOptions);
        }
      };
    return AdParameterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdParameterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdParameterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdParameterServiceFutureStub>() {
        @java.lang.Override
        public AdParameterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdParameterServiceFutureStub(channel, callOptions);
        }
      };
    return AdParameterServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage ad parameters.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes ad parameters. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AdParameterError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void mutateAdParameters(com.google.ads.googleads.v13.services.MutateAdParametersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateAdParametersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdParametersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AdParameterService.
   * <pre>
   * Service to manage ad parameters.
   * </pre>
   */
  public static abstract class AdParameterServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdParameterServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdParameterService.
   * <pre>
   * Service to manage ad parameters.
   * </pre>
   */
  public static final class AdParameterServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdParameterServiceStub> {
    private AdParameterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdParameterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdParameterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad parameters. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AdParameterError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateAdParameters(com.google.ads.googleads.v13.services.MutateAdParametersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateAdParametersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdParametersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AdParameterService.
   * <pre>
   * Service to manage ad parameters.
   * </pre>
   */
  public static final class AdParameterServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdParameterServiceBlockingStub> {
    private AdParameterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdParameterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdParameterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad parameters. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AdParameterError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v13.services.MutateAdParametersResponse mutateAdParameters(com.google.ads.googleads.v13.services.MutateAdParametersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdParametersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdParameterService.
   * <pre>
   * Service to manage ad parameters.
   * </pre>
   */
  public static final class AdParameterServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdParameterServiceFutureStub> {
    private AdParameterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdParameterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdParameterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad parameters. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AdParameterError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v13.services.MutateAdParametersResponse> mutateAdParameters(
        com.google.ads.googleads.v13.services.MutateAdParametersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdParametersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_AD_PARAMETERS = 0;

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
        case METHODID_MUTATE_AD_PARAMETERS:
          serviceImpl.mutateAdParameters((com.google.ads.googleads.v13.services.MutateAdParametersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateAdParametersResponse>) responseObserver);
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
          getMutateAdParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v13.services.MutateAdParametersRequest,
              com.google.ads.googleads.v13.services.MutateAdParametersResponse>(
                service, METHODID_MUTATE_AD_PARAMETERS)))
        .build();
  }

  private static abstract class AdParameterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdParameterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v13.services.AdParameterServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdParameterService");
    }
  }

  private static final class AdParameterServiceFileDescriptorSupplier
      extends AdParameterServiceBaseDescriptorSupplier {
    AdParameterServiceFileDescriptorSupplier() {}
  }

  private static final class AdParameterServiceMethodDescriptorSupplier
      extends AdParameterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdParameterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdParameterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdParameterServiceFileDescriptorSupplier())
              .addMethod(getMutateAdParametersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
