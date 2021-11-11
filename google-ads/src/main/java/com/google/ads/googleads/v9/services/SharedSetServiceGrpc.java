package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage shared sets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/shared_set_service.proto")
public final class SharedSetServiceGrpc {

  private SharedSetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.SharedSetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetSharedSetRequest,
      com.google.ads.googleads.v9.resources.SharedSet> getGetSharedSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSharedSet",
      requestType = com.google.ads.googleads.v9.services.GetSharedSetRequest.class,
      responseType = com.google.ads.googleads.v9.resources.SharedSet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetSharedSetRequest,
      com.google.ads.googleads.v9.resources.SharedSet> getGetSharedSetMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetSharedSetRequest, com.google.ads.googleads.v9.resources.SharedSet> getGetSharedSetMethod;
    if ((getGetSharedSetMethod = SharedSetServiceGrpc.getGetSharedSetMethod) == null) {
      synchronized (SharedSetServiceGrpc.class) {
        if ((getGetSharedSetMethod = SharedSetServiceGrpc.getGetSharedSetMethod) == null) {
          SharedSetServiceGrpc.getGetSharedSetMethod = getGetSharedSetMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetSharedSetRequest, com.google.ads.googleads.v9.resources.SharedSet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSharedSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetSharedSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.SharedSet.getDefaultInstance()))
              .setSchemaDescriptor(new SharedSetServiceMethodDescriptorSupplier("GetSharedSet"))
              .build();
        }
      }
    }
    return getGetSharedSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateSharedSetsRequest,
      com.google.ads.googleads.v9.services.MutateSharedSetsResponse> getMutateSharedSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateSharedSets",
      requestType = com.google.ads.googleads.v9.services.MutateSharedSetsRequest.class,
      responseType = com.google.ads.googleads.v9.services.MutateSharedSetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateSharedSetsRequest,
      com.google.ads.googleads.v9.services.MutateSharedSetsResponse> getMutateSharedSetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateSharedSetsRequest, com.google.ads.googleads.v9.services.MutateSharedSetsResponse> getMutateSharedSetsMethod;
    if ((getMutateSharedSetsMethod = SharedSetServiceGrpc.getMutateSharedSetsMethod) == null) {
      synchronized (SharedSetServiceGrpc.class) {
        if ((getMutateSharedSetsMethod = SharedSetServiceGrpc.getMutateSharedSetsMethod) == null) {
          SharedSetServiceGrpc.getMutateSharedSetsMethod = getMutateSharedSetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.MutateSharedSetsRequest, com.google.ads.googleads.v9.services.MutateSharedSetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateSharedSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateSharedSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateSharedSetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SharedSetServiceMethodDescriptorSupplier("MutateSharedSets"))
              .build();
        }
      }
    }
    return getMutateSharedSetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SharedSetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SharedSetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SharedSetServiceStub>() {
        @java.lang.Override
        public SharedSetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SharedSetServiceStub(channel, callOptions);
        }
      };
    return SharedSetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SharedSetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SharedSetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SharedSetServiceBlockingStub>() {
        @java.lang.Override
        public SharedSetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SharedSetServiceBlockingStub(channel, callOptions);
        }
      };
    return SharedSetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SharedSetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SharedSetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SharedSetServiceFutureStub>() {
        @java.lang.Override
        public SharedSetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SharedSetServiceFutureStub(channel, callOptions);
        }
      };
    return SharedSetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage shared sets.
   * </pre>
   */
  public static abstract class SharedSetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested shared set in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getSharedSet(com.google.ads.googleads.v9.services.GetSharedSetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.SharedSet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSharedSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes shared sets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SharedSetError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateSharedSets(com.google.ads.googleads.v9.services.MutateSharedSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateSharedSetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateSharedSetsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSharedSetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetSharedSetRequest,
                com.google.ads.googleads.v9.resources.SharedSet>(
                  this, METHODID_GET_SHARED_SET)))
          .addMethod(
            getMutateSharedSetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.MutateSharedSetsRequest,
                com.google.ads.googleads.v9.services.MutateSharedSetsResponse>(
                  this, METHODID_MUTATE_SHARED_SETS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage shared sets.
   * </pre>
   */
  public static final class SharedSetServiceStub extends io.grpc.stub.AbstractAsyncStub<SharedSetServiceStub> {
    private SharedSetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SharedSetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SharedSetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested shared set in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getSharedSet(com.google.ads.googleads.v9.services.GetSharedSetRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.SharedSet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSharedSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes shared sets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SharedSetError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateSharedSets(com.google.ads.googleads.v9.services.MutateSharedSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateSharedSetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateSharedSetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage shared sets.
   * </pre>
   */
  public static final class SharedSetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SharedSetServiceBlockingStub> {
    private SharedSetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SharedSetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SharedSetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested shared set in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.SharedSet getSharedSet(com.google.ads.googleads.v9.services.GetSharedSetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSharedSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes shared sets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SharedSetError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.services.MutateSharedSetsResponse mutateSharedSets(com.google.ads.googleads.v9.services.MutateSharedSetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateSharedSetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage shared sets.
   * </pre>
   */
  public static final class SharedSetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SharedSetServiceFutureStub> {
    private SharedSetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SharedSetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SharedSetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested shared set in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.SharedSet> getSharedSet(
        com.google.ads.googleads.v9.services.GetSharedSetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSharedSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes shared sets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SharedSetError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.MutateSharedSetsResponse> mutateSharedSets(
        com.google.ads.googleads.v9.services.MutateSharedSetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateSharedSetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SHARED_SET = 0;
  private static final int METHODID_MUTATE_SHARED_SETS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SharedSetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SharedSetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SHARED_SET:
          serviceImpl.getSharedSet((com.google.ads.googleads.v9.services.GetSharedSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.SharedSet>) responseObserver);
          break;
        case METHODID_MUTATE_SHARED_SETS:
          serviceImpl.mutateSharedSets((com.google.ads.googleads.v9.services.MutateSharedSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateSharedSetsResponse>) responseObserver);
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

  private static abstract class SharedSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SharedSetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.SharedSetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SharedSetService");
    }
  }

  private static final class SharedSetServiceFileDescriptorSupplier
      extends SharedSetServiceBaseDescriptorSupplier {
    SharedSetServiceFileDescriptorSupplier() {}
  }

  private static final class SharedSetServiceMethodDescriptorSupplier
      extends SharedSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SharedSetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SharedSetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SharedSetServiceFileDescriptorSupplier())
              .addMethod(getGetSharedSetMethod())
              .addMethod(getMutateSharedSetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
