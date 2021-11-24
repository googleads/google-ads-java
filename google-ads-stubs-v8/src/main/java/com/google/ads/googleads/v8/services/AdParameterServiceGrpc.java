package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage ad parameters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/ad_parameter_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdParameterServiceGrpc {

  private AdParameterServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.AdParameterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetAdParameterRequest,
      com.google.ads.googleads.v8.resources.AdParameter> getGetAdParameterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdParameter",
      requestType = com.google.ads.googleads.v8.services.GetAdParameterRequest.class,
      responseType = com.google.ads.googleads.v8.resources.AdParameter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetAdParameterRequest,
      com.google.ads.googleads.v8.resources.AdParameter> getGetAdParameterMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetAdParameterRequest, com.google.ads.googleads.v8.resources.AdParameter> getGetAdParameterMethod;
    if ((getGetAdParameterMethod = AdParameterServiceGrpc.getGetAdParameterMethod) == null) {
      synchronized (AdParameterServiceGrpc.class) {
        if ((getGetAdParameterMethod = AdParameterServiceGrpc.getGetAdParameterMethod) == null) {
          AdParameterServiceGrpc.getGetAdParameterMethod = getGetAdParameterMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetAdParameterRequest, com.google.ads.googleads.v8.resources.AdParameter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdParameter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetAdParameterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.AdParameter.getDefaultInstance()))
              .setSchemaDescriptor(new AdParameterServiceMethodDescriptorSupplier("GetAdParameter"))
              .build();
        }
      }
    }
    return getGetAdParameterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateAdParametersRequest,
      com.google.ads.googleads.v8.services.MutateAdParametersResponse> getMutateAdParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdParameters",
      requestType = com.google.ads.googleads.v8.services.MutateAdParametersRequest.class,
      responseType = com.google.ads.googleads.v8.services.MutateAdParametersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateAdParametersRequest,
      com.google.ads.googleads.v8.services.MutateAdParametersResponse> getMutateAdParametersMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.MutateAdParametersRequest, com.google.ads.googleads.v8.services.MutateAdParametersResponse> getMutateAdParametersMethod;
    if ((getMutateAdParametersMethod = AdParameterServiceGrpc.getMutateAdParametersMethod) == null) {
      synchronized (AdParameterServiceGrpc.class) {
        if ((getMutateAdParametersMethod = AdParameterServiceGrpc.getMutateAdParametersMethod) == null) {
          AdParameterServiceGrpc.getMutateAdParametersMethod = getMutateAdParametersMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.MutateAdParametersRequest, com.google.ads.googleads.v8.services.MutateAdParametersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.MutateAdParametersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.MutateAdParametersResponse.getDefaultInstance()))
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
  public static abstract class AdParameterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad parameter in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAdParameter(com.google.ads.googleads.v8.services.GetAdParameterRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.AdParameter> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAdParameterMethod(), responseObserver);
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
    public void mutateAdParameters(com.google.ads.googleads.v8.services.MutateAdParametersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateAdParametersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdParametersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdParameterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetAdParameterRequest,
                com.google.ads.googleads.v8.resources.AdParameter>(
                  this, METHODID_GET_AD_PARAMETER)))
          .addMethod(
            getMutateAdParametersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.MutateAdParametersRequest,
                com.google.ads.googleads.v8.services.MutateAdParametersResponse>(
                  this, METHODID_MUTATE_AD_PARAMETERS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ad parameters.
   * </pre>
   */
  public static final class AdParameterServiceStub extends io.grpc.stub.AbstractAsyncStub<AdParameterServiceStub> {
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
     * Returns the requested ad parameter in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAdParameter(com.google.ads.googleads.v8.services.GetAdParameterRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.AdParameter> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAdParameterMethod(), getCallOptions()), request, responseObserver);
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
    public void mutateAdParameters(com.google.ads.googleads.v8.services.MutateAdParametersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateAdParametersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdParametersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ad parameters.
   * </pre>
   */
  public static final class AdParameterServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdParameterServiceBlockingStub> {
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
     * Returns the requested ad parameter in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.AdParameter getAdParameter(com.google.ads.googleads.v8.services.GetAdParameterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAdParameterMethod(), getCallOptions(), request);
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
    public com.google.ads.googleads.v8.services.MutateAdParametersResponse mutateAdParameters(com.google.ads.googleads.v8.services.MutateAdParametersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdParametersMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ad parameters.
   * </pre>
   */
  public static final class AdParameterServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AdParameterServiceFutureStub> {
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
     * Returns the requested ad parameter in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.AdParameter> getAdParameter(
        com.google.ads.googleads.v8.services.GetAdParameterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAdParameterMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.services.MutateAdParametersResponse> mutateAdParameters(
        com.google.ads.googleads.v8.services.MutateAdParametersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdParametersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_PARAMETER = 0;
  private static final int METHODID_MUTATE_AD_PARAMETERS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdParameterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdParameterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_PARAMETER:
          serviceImpl.getAdParameter((com.google.ads.googleads.v8.services.GetAdParameterRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.AdParameter>) responseObserver);
          break;
        case METHODID_MUTATE_AD_PARAMETERS:
          serviceImpl.mutateAdParameters((com.google.ads.googleads.v8.services.MutateAdParametersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.services.MutateAdParametersResponse>) responseObserver);
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

  private static abstract class AdParameterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdParameterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.AdParameterServiceProto.getDescriptor();
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
              .addMethod(getGetAdParameterMethod())
              .addMethod(getMutateAdParametersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
