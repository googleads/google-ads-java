package com.google.ads.googleads.v12.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage conversion actions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v12/services/conversion_action_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConversionActionServiceGrpc {

  private ConversionActionServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v12.services.ConversionActionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateConversionActionsRequest,
      com.google.ads.googleads.v12.services.MutateConversionActionsResponse> getMutateConversionActionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateConversionActions",
      requestType = com.google.ads.googleads.v12.services.MutateConversionActionsRequest.class,
      responseType = com.google.ads.googleads.v12.services.MutateConversionActionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateConversionActionsRequest,
      com.google.ads.googleads.v12.services.MutateConversionActionsResponse> getMutateConversionActionsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateConversionActionsRequest, com.google.ads.googleads.v12.services.MutateConversionActionsResponse> getMutateConversionActionsMethod;
    if ((getMutateConversionActionsMethod = ConversionActionServiceGrpc.getMutateConversionActionsMethod) == null) {
      synchronized (ConversionActionServiceGrpc.class) {
        if ((getMutateConversionActionsMethod = ConversionActionServiceGrpc.getMutateConversionActionsMethod) == null) {
          ConversionActionServiceGrpc.getMutateConversionActionsMethod = getMutateConversionActionsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v12.services.MutateConversionActionsRequest, com.google.ads.googleads.v12.services.MutateConversionActionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateConversionActions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateConversionActionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateConversionActionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConversionActionServiceMethodDescriptorSupplier("MutateConversionActions"))
              .build();
        }
      }
    }
    return getMutateConversionActionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConversionActionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionActionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionActionServiceStub>() {
        @java.lang.Override
        public ConversionActionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionActionServiceStub(channel, callOptions);
        }
      };
    return ConversionActionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConversionActionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionActionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionActionServiceBlockingStub>() {
        @java.lang.Override
        public ConversionActionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionActionServiceBlockingStub(channel, callOptions);
        }
      };
    return ConversionActionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConversionActionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionActionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionActionServiceFutureStub>() {
        @java.lang.Override
        public ConversionActionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionActionServiceFutureStub(channel, callOptions);
        }
      };
    return ConversionActionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage conversion actions.
   * </pre>
   */
  public static abstract class ConversionActionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates, updates or removes conversion actions. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ConversionActionError]()
     *   [CurrencyCodeError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateConversionActions(com.google.ads.googleads.v12.services.MutateConversionActionsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateConversionActionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateConversionActionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateConversionActionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v12.services.MutateConversionActionsRequest,
                com.google.ads.googleads.v12.services.MutateConversionActionsResponse>(
                  this, METHODID_MUTATE_CONVERSION_ACTIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage conversion actions.
   * </pre>
   */
  public static final class ConversionActionServiceStub extends io.grpc.stub.AbstractAsyncStub<ConversionActionServiceStub> {
    private ConversionActionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionActionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionActionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes conversion actions. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ConversionActionError]()
     *   [CurrencyCodeError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateConversionActions(com.google.ads.googleads.v12.services.MutateConversionActionsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateConversionActionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateConversionActionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage conversion actions.
   * </pre>
   */
  public static final class ConversionActionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConversionActionServiceBlockingStub> {
    private ConversionActionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionActionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionActionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes conversion actions. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ConversionActionError]()
     *   [CurrencyCodeError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v12.services.MutateConversionActionsResponse mutateConversionActions(com.google.ads.googleads.v12.services.MutateConversionActionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateConversionActionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage conversion actions.
   * </pre>
   */
  public static final class ConversionActionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ConversionActionServiceFutureStub> {
    private ConversionActionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionActionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionActionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes conversion actions. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ConversionActionError]()
     *   [CurrencyCodeError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v12.services.MutateConversionActionsResponse> mutateConversionActions(
        com.google.ads.googleads.v12.services.MutateConversionActionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateConversionActionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CONVERSION_ACTIONS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConversionActionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConversionActionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_CONVERSION_ACTIONS:
          serviceImpl.mutateConversionActions((com.google.ads.googleads.v12.services.MutateConversionActionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateConversionActionsResponse>) responseObserver);
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

  private static abstract class ConversionActionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConversionActionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v12.services.ConversionActionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConversionActionService");
    }
  }

  private static final class ConversionActionServiceFileDescriptorSupplier
      extends ConversionActionServiceBaseDescriptorSupplier {
    ConversionActionServiceFileDescriptorSupplier() {}
  }

  private static final class ConversionActionServiceMethodDescriptorSupplier
      extends ConversionActionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConversionActionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConversionActionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConversionActionServiceFileDescriptorSupplier())
              .addMethod(getMutateConversionActionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
