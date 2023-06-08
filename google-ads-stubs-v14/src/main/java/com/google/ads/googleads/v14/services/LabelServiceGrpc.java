package com.google.ads.googleads.v14.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage labels.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v14/services/label_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LabelServiceGrpc {

  private LabelServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v14.services.LabelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateLabelsRequest,
      com.google.ads.googleads.v14.services.MutateLabelsResponse> getMutateLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateLabels",
      requestType = com.google.ads.googleads.v14.services.MutateLabelsRequest.class,
      responseType = com.google.ads.googleads.v14.services.MutateLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateLabelsRequest,
      com.google.ads.googleads.v14.services.MutateLabelsResponse> getMutateLabelsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateLabelsRequest, com.google.ads.googleads.v14.services.MutateLabelsResponse> getMutateLabelsMethod;
    if ((getMutateLabelsMethod = LabelServiceGrpc.getMutateLabelsMethod) == null) {
      synchronized (LabelServiceGrpc.class) {
        if ((getMutateLabelsMethod = LabelServiceGrpc.getMutateLabelsMethod) == null) {
          LabelServiceGrpc.getMutateLabelsMethod = getMutateLabelsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v14.services.MutateLabelsRequest, com.google.ads.googleads.v14.services.MutateLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateLabelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LabelServiceMethodDescriptorSupplier("MutateLabels"))
              .build();
        }
      }
    }
    return getMutateLabelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LabelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LabelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LabelServiceStub>() {
        @java.lang.Override
        public LabelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LabelServiceStub(channel, callOptions);
        }
      };
    return LabelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LabelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LabelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LabelServiceBlockingStub>() {
        @java.lang.Override
        public LabelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LabelServiceBlockingStub(channel, callOptions);
        }
      };
    return LabelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LabelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LabelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LabelServiceFutureStub>() {
        @java.lang.Override
        public LabelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LabelServiceFutureStub(channel, callOptions);
        }
      };
    return LabelServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage labels.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes labels. Operation statuses are returned.
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
     *   [LabelError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    default void mutateLabels(com.google.ads.googleads.v14.services.MutateLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateLabelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateLabelsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LabelService.
   * <pre>
   * Service to manage labels.
   * </pre>
   */
  public static abstract class LabelServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LabelServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LabelService.
   * <pre>
   * Service to manage labels.
   * </pre>
   */
  public static final class LabelServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LabelServiceStub> {
    private LabelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LabelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes labels. Operation statuses are returned.
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
     *   [LabelError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateLabels(com.google.ads.googleads.v14.services.MutateLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateLabelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateLabelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LabelService.
   * <pre>
   * Service to manage labels.
   * </pre>
   */
  public static final class LabelServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LabelServiceBlockingStub> {
    private LabelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LabelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes labels. Operation statuses are returned.
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
     *   [LabelError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v14.services.MutateLabelsResponse mutateLabels(com.google.ads.googleads.v14.services.MutateLabelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateLabelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LabelService.
   * <pre>
   * Service to manage labels.
   * </pre>
   */
  public static final class LabelServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LabelServiceFutureStub> {
    private LabelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LabelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes labels. Operation statuses are returned.
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
     *   [LabelError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v14.services.MutateLabelsResponse> mutateLabels(
        com.google.ads.googleads.v14.services.MutateLabelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateLabelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_LABELS = 0;

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
        case METHODID_MUTATE_LABELS:
          serviceImpl.mutateLabels((com.google.ads.googleads.v14.services.MutateLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateLabelsResponse>) responseObserver);
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
          getMutateLabelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v14.services.MutateLabelsRequest,
              com.google.ads.googleads.v14.services.MutateLabelsResponse>(
                service, METHODID_MUTATE_LABELS)))
        .build();
  }

  private static abstract class LabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LabelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v14.services.LabelServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LabelService");
    }
  }

  private static final class LabelServiceFileDescriptorSupplier
      extends LabelServiceBaseDescriptorSupplier {
    LabelServiceFileDescriptorSupplier() {}
  }

  private static final class LabelServiceMethodDescriptorSupplier
      extends LabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LabelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LabelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LabelServiceFileDescriptorSupplier())
              .addMethod(getMutateLabelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
