package com.google.ads.googleads.v13.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage conversion custom variables.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v13/services/conversion_custom_variable_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConversionCustomVariableServiceGrpc {

  private ConversionCustomVariableServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v13.services.ConversionCustomVariableService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateConversionCustomVariablesRequest,
      com.google.ads.googleads.v13.services.MutateConversionCustomVariablesResponse> getMutateConversionCustomVariablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateConversionCustomVariables",
      requestType = com.google.ads.googleads.v13.services.MutateConversionCustomVariablesRequest.class,
      responseType = com.google.ads.googleads.v13.services.MutateConversionCustomVariablesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateConversionCustomVariablesRequest,
      com.google.ads.googleads.v13.services.MutateConversionCustomVariablesResponse> getMutateConversionCustomVariablesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateConversionCustomVariablesRequest, com.google.ads.googleads.v13.services.MutateConversionCustomVariablesResponse> getMutateConversionCustomVariablesMethod;
    if ((getMutateConversionCustomVariablesMethod = ConversionCustomVariableServiceGrpc.getMutateConversionCustomVariablesMethod) == null) {
      synchronized (ConversionCustomVariableServiceGrpc.class) {
        if ((getMutateConversionCustomVariablesMethod = ConversionCustomVariableServiceGrpc.getMutateConversionCustomVariablesMethod) == null) {
          ConversionCustomVariableServiceGrpc.getMutateConversionCustomVariablesMethod = getMutateConversionCustomVariablesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v13.services.MutateConversionCustomVariablesRequest, com.google.ads.googleads.v13.services.MutateConversionCustomVariablesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateConversionCustomVariables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateConversionCustomVariablesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateConversionCustomVariablesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConversionCustomVariableServiceMethodDescriptorSupplier("MutateConversionCustomVariables"))
              .build();
        }
      }
    }
    return getMutateConversionCustomVariablesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConversionCustomVariableServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionCustomVariableServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionCustomVariableServiceStub>() {
        @java.lang.Override
        public ConversionCustomVariableServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionCustomVariableServiceStub(channel, callOptions);
        }
      };
    return ConversionCustomVariableServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConversionCustomVariableServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionCustomVariableServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionCustomVariableServiceBlockingStub>() {
        @java.lang.Override
        public ConversionCustomVariableServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionCustomVariableServiceBlockingStub(channel, callOptions);
        }
      };
    return ConversionCustomVariableServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConversionCustomVariableServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionCustomVariableServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionCustomVariableServiceFutureStub>() {
        @java.lang.Override
        public ConversionCustomVariableServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionCustomVariableServiceFutureStub(channel, callOptions);
        }
      };
    return ConversionCustomVariableServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage conversion custom variables.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates or updates conversion custom variables. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ConversionCustomVariableError]()
     *   [DatabaseError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void mutateConversionCustomVariables(com.google.ads.googleads.v13.services.MutateConversionCustomVariablesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateConversionCustomVariablesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateConversionCustomVariablesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ConversionCustomVariableService.
   * <pre>
   * Service to manage conversion custom variables.
   * </pre>
   */
  public static abstract class ConversionCustomVariableServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ConversionCustomVariableServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ConversionCustomVariableService.
   * <pre>
   * Service to manage conversion custom variables.
   * </pre>
   */
  public static final class ConversionCustomVariableServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ConversionCustomVariableServiceStub> {
    private ConversionCustomVariableServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionCustomVariableServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionCustomVariableServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or updates conversion custom variables. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ConversionCustomVariableError]()
     *   [DatabaseError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateConversionCustomVariables(com.google.ads.googleads.v13.services.MutateConversionCustomVariablesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateConversionCustomVariablesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateConversionCustomVariablesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ConversionCustomVariableService.
   * <pre>
   * Service to manage conversion custom variables.
   * </pre>
   */
  public static final class ConversionCustomVariableServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ConversionCustomVariableServiceBlockingStub> {
    private ConversionCustomVariableServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionCustomVariableServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionCustomVariableServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or updates conversion custom variables. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ConversionCustomVariableError]()
     *   [DatabaseError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v13.services.MutateConversionCustomVariablesResponse mutateConversionCustomVariables(com.google.ads.googleads.v13.services.MutateConversionCustomVariablesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateConversionCustomVariablesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ConversionCustomVariableService.
   * <pre>
   * Service to manage conversion custom variables.
   * </pre>
   */
  public static final class ConversionCustomVariableServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ConversionCustomVariableServiceFutureStub> {
    private ConversionCustomVariableServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionCustomVariableServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionCustomVariableServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or updates conversion custom variables. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ConversionCustomVariableError]()
     *   [DatabaseError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v13.services.MutateConversionCustomVariablesResponse> mutateConversionCustomVariables(
        com.google.ads.googleads.v13.services.MutateConversionCustomVariablesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateConversionCustomVariablesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CONVERSION_CUSTOM_VARIABLES = 0;

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
        case METHODID_MUTATE_CONVERSION_CUSTOM_VARIABLES:
          serviceImpl.mutateConversionCustomVariables((com.google.ads.googleads.v13.services.MutateConversionCustomVariablesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateConversionCustomVariablesResponse>) responseObserver);
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
          getMutateConversionCustomVariablesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v13.services.MutateConversionCustomVariablesRequest,
              com.google.ads.googleads.v13.services.MutateConversionCustomVariablesResponse>(
                service, METHODID_MUTATE_CONVERSION_CUSTOM_VARIABLES)))
        .build();
  }

  private static abstract class ConversionCustomVariableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConversionCustomVariableServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v13.services.ConversionCustomVariableServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConversionCustomVariableService");
    }
  }

  private static final class ConversionCustomVariableServiceFileDescriptorSupplier
      extends ConversionCustomVariableServiceBaseDescriptorSupplier {
    ConversionCustomVariableServiceFileDescriptorSupplier() {}
  }

  private static final class ConversionCustomVariableServiceMethodDescriptorSupplier
      extends ConversionCustomVariableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConversionCustomVariableServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConversionCustomVariableServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConversionCustomVariableServiceFileDescriptorSupplier())
              .addMethod(getMutateConversionCustomVariablesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
