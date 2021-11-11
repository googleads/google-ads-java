package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage conversion custom variables.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/conversion_custom_variable_service.proto")
public final class ConversionCustomVariableServiceGrpc {

  private ConversionCustomVariableServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.ConversionCustomVariableService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetConversionCustomVariableRequest,
      com.google.ads.googleads.v9.resources.ConversionCustomVariable> getGetConversionCustomVariableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConversionCustomVariable",
      requestType = com.google.ads.googleads.v9.services.GetConversionCustomVariableRequest.class,
      responseType = com.google.ads.googleads.v9.resources.ConversionCustomVariable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetConversionCustomVariableRequest,
      com.google.ads.googleads.v9.resources.ConversionCustomVariable> getGetConversionCustomVariableMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetConversionCustomVariableRequest, com.google.ads.googleads.v9.resources.ConversionCustomVariable> getGetConversionCustomVariableMethod;
    if ((getGetConversionCustomVariableMethod = ConversionCustomVariableServiceGrpc.getGetConversionCustomVariableMethod) == null) {
      synchronized (ConversionCustomVariableServiceGrpc.class) {
        if ((getGetConversionCustomVariableMethod = ConversionCustomVariableServiceGrpc.getGetConversionCustomVariableMethod) == null) {
          ConversionCustomVariableServiceGrpc.getGetConversionCustomVariableMethod = getGetConversionCustomVariableMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetConversionCustomVariableRequest, com.google.ads.googleads.v9.resources.ConversionCustomVariable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConversionCustomVariable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetConversionCustomVariableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.ConversionCustomVariable.getDefaultInstance()))
              .setSchemaDescriptor(new ConversionCustomVariableServiceMethodDescriptorSupplier("GetConversionCustomVariable"))
              .build();
        }
      }
    }
    return getGetConversionCustomVariableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateConversionCustomVariablesRequest,
      com.google.ads.googleads.v9.services.MutateConversionCustomVariablesResponse> getMutateConversionCustomVariablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateConversionCustomVariables",
      requestType = com.google.ads.googleads.v9.services.MutateConversionCustomVariablesRequest.class,
      responseType = com.google.ads.googleads.v9.services.MutateConversionCustomVariablesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateConversionCustomVariablesRequest,
      com.google.ads.googleads.v9.services.MutateConversionCustomVariablesResponse> getMutateConversionCustomVariablesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateConversionCustomVariablesRequest, com.google.ads.googleads.v9.services.MutateConversionCustomVariablesResponse> getMutateConversionCustomVariablesMethod;
    if ((getMutateConversionCustomVariablesMethod = ConversionCustomVariableServiceGrpc.getMutateConversionCustomVariablesMethod) == null) {
      synchronized (ConversionCustomVariableServiceGrpc.class) {
        if ((getMutateConversionCustomVariablesMethod = ConversionCustomVariableServiceGrpc.getMutateConversionCustomVariablesMethod) == null) {
          ConversionCustomVariableServiceGrpc.getMutateConversionCustomVariablesMethod = getMutateConversionCustomVariablesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.MutateConversionCustomVariablesRequest, com.google.ads.googleads.v9.services.MutateConversionCustomVariablesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateConversionCustomVariables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateConversionCustomVariablesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateConversionCustomVariablesResponse.getDefaultInstance()))
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
  public static abstract class ConversionCustomVariableServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested conversion custom variable.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getConversionCustomVariable(com.google.ads.googleads.v9.services.GetConversionCustomVariableRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.ConversionCustomVariable> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConversionCustomVariableMethod(), responseObserver);
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
    public void mutateConversionCustomVariables(com.google.ads.googleads.v9.services.MutateConversionCustomVariablesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateConversionCustomVariablesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateConversionCustomVariablesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetConversionCustomVariableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetConversionCustomVariableRequest,
                com.google.ads.googleads.v9.resources.ConversionCustomVariable>(
                  this, METHODID_GET_CONVERSION_CUSTOM_VARIABLE)))
          .addMethod(
            getMutateConversionCustomVariablesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.MutateConversionCustomVariablesRequest,
                com.google.ads.googleads.v9.services.MutateConversionCustomVariablesResponse>(
                  this, METHODID_MUTATE_CONVERSION_CUSTOM_VARIABLES)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage conversion custom variables.
   * </pre>
   */
  public static final class ConversionCustomVariableServiceStub extends io.grpc.stub.AbstractAsyncStub<ConversionCustomVariableServiceStub> {
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
     * Returns the requested conversion custom variable.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getConversionCustomVariable(com.google.ads.googleads.v9.services.GetConversionCustomVariableRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.ConversionCustomVariable> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConversionCustomVariableMethod(), getCallOptions()), request, responseObserver);
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
    public void mutateConversionCustomVariables(com.google.ads.googleads.v9.services.MutateConversionCustomVariablesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateConversionCustomVariablesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateConversionCustomVariablesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage conversion custom variables.
   * </pre>
   */
  public static final class ConversionCustomVariableServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConversionCustomVariableServiceBlockingStub> {
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
     * Returns the requested conversion custom variable.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.ConversionCustomVariable getConversionCustomVariable(com.google.ads.googleads.v9.services.GetConversionCustomVariableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConversionCustomVariableMethod(), getCallOptions(), request);
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
    public com.google.ads.googleads.v9.services.MutateConversionCustomVariablesResponse mutateConversionCustomVariables(com.google.ads.googleads.v9.services.MutateConversionCustomVariablesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateConversionCustomVariablesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage conversion custom variables.
   * </pre>
   */
  public static final class ConversionCustomVariableServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ConversionCustomVariableServiceFutureStub> {
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
     * Returns the requested conversion custom variable.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.ConversionCustomVariable> getConversionCustomVariable(
        com.google.ads.googleads.v9.services.GetConversionCustomVariableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConversionCustomVariableMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.MutateConversionCustomVariablesResponse> mutateConversionCustomVariables(
        com.google.ads.googleads.v9.services.MutateConversionCustomVariablesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateConversionCustomVariablesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CONVERSION_CUSTOM_VARIABLE = 0;
  private static final int METHODID_MUTATE_CONVERSION_CUSTOM_VARIABLES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConversionCustomVariableServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConversionCustomVariableServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CONVERSION_CUSTOM_VARIABLE:
          serviceImpl.getConversionCustomVariable((com.google.ads.googleads.v9.services.GetConversionCustomVariableRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.ConversionCustomVariable>) responseObserver);
          break;
        case METHODID_MUTATE_CONVERSION_CUSTOM_VARIABLES:
          serviceImpl.mutateConversionCustomVariables((com.google.ads.googleads.v9.services.MutateConversionCustomVariablesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateConversionCustomVariablesResponse>) responseObserver);
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

  private static abstract class ConversionCustomVariableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConversionCustomVariableServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.ConversionCustomVariableServiceProto.getDescriptor();
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
              .addMethod(getGetConversionCustomVariableMethod())
              .addMethod(getMutateConversionCustomVariablesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
