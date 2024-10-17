package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage campaign shared sets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/campaign_shared_set_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampaignSharedSetServiceGrpc {

  private CampaignSharedSetServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.CampaignSharedSetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateCampaignSharedSetsRequest,
      com.google.ads.googleads.v18.services.MutateCampaignSharedSetsResponse> getMutateCampaignSharedSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignSharedSets",
      requestType = com.google.ads.googleads.v18.services.MutateCampaignSharedSetsRequest.class,
      responseType = com.google.ads.googleads.v18.services.MutateCampaignSharedSetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateCampaignSharedSetsRequest,
      com.google.ads.googleads.v18.services.MutateCampaignSharedSetsResponse> getMutateCampaignSharedSetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateCampaignSharedSetsRequest, com.google.ads.googleads.v18.services.MutateCampaignSharedSetsResponse> getMutateCampaignSharedSetsMethod;
    if ((getMutateCampaignSharedSetsMethod = CampaignSharedSetServiceGrpc.getMutateCampaignSharedSetsMethod) == null) {
      synchronized (CampaignSharedSetServiceGrpc.class) {
        if ((getMutateCampaignSharedSetsMethod = CampaignSharedSetServiceGrpc.getMutateCampaignSharedSetsMethod) == null) {
          CampaignSharedSetServiceGrpc.getMutateCampaignSharedSetsMethod = getMutateCampaignSharedSetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.MutateCampaignSharedSetsRequest, com.google.ads.googleads.v18.services.MutateCampaignSharedSetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignSharedSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateCampaignSharedSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateCampaignSharedSetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignSharedSetServiceMethodDescriptorSupplier("MutateCampaignSharedSets"))
              .build();
        }
      }
    }
    return getMutateCampaignSharedSetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignSharedSetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignSharedSetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignSharedSetServiceStub>() {
        @java.lang.Override
        public CampaignSharedSetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignSharedSetServiceStub(channel, callOptions);
        }
      };
    return CampaignSharedSetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignSharedSetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignSharedSetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignSharedSetServiceBlockingStub>() {
        @java.lang.Override
        public CampaignSharedSetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignSharedSetServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignSharedSetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignSharedSetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignSharedSetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignSharedSetServiceFutureStub>() {
        @java.lang.Override
        public CampaignSharedSetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignSharedSetServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignSharedSetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage campaign shared sets.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates or removes campaign shared sets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignSharedSetError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
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
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    default void mutateCampaignSharedSets(com.google.ads.googleads.v18.services.MutateCampaignSharedSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateCampaignSharedSetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCampaignSharedSetsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CampaignSharedSetService.
   * <pre>
   * Service to manage campaign shared sets.
   * </pre>
   */
  public static abstract class CampaignSharedSetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CampaignSharedSetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CampaignSharedSetService.
   * <pre>
   * Service to manage campaign shared sets.
   * </pre>
   */
  public static final class CampaignSharedSetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CampaignSharedSetServiceStub> {
    private CampaignSharedSetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignSharedSetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignSharedSetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes campaign shared sets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignSharedSetError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
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
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateCampaignSharedSets(com.google.ads.googleads.v18.services.MutateCampaignSharedSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateCampaignSharedSetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCampaignSharedSetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CampaignSharedSetService.
   * <pre>
   * Service to manage campaign shared sets.
   * </pre>
   */
  public static final class CampaignSharedSetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CampaignSharedSetServiceBlockingStub> {
    private CampaignSharedSetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignSharedSetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignSharedSetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes campaign shared sets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignSharedSetError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
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
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.MutateCampaignSharedSetsResponse mutateCampaignSharedSets(com.google.ads.googleads.v18.services.MutateCampaignSharedSetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignSharedSetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CampaignSharedSetService.
   * <pre>
   * Service to manage campaign shared sets.
   * </pre>
   */
  public static final class CampaignSharedSetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CampaignSharedSetServiceFutureStub> {
    private CampaignSharedSetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignSharedSetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignSharedSetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes campaign shared sets. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignSharedSetError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
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
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.MutateCampaignSharedSetsResponse> mutateCampaignSharedSets(
        com.google.ads.googleads.v18.services.MutateCampaignSharedSetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCampaignSharedSetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CAMPAIGN_SHARED_SETS = 0;

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
        case METHODID_MUTATE_CAMPAIGN_SHARED_SETS:
          serviceImpl.mutateCampaignSharedSets((com.google.ads.googleads.v18.services.MutateCampaignSharedSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateCampaignSharedSetsResponse>) responseObserver);
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
          getMutateCampaignSharedSetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.MutateCampaignSharedSetsRequest,
              com.google.ads.googleads.v18.services.MutateCampaignSharedSetsResponse>(
                service, METHODID_MUTATE_CAMPAIGN_SHARED_SETS)))
        .build();
  }

  private static abstract class CampaignSharedSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignSharedSetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.CampaignSharedSetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignSharedSetService");
    }
  }

  private static final class CampaignSharedSetServiceFileDescriptorSupplier
      extends CampaignSharedSetServiceBaseDescriptorSupplier {
    CampaignSharedSetServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignSharedSetServiceMethodDescriptorSupplier
      extends CampaignSharedSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CampaignSharedSetServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CampaignSharedSetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignSharedSetServiceFileDescriptorSupplier())
              .addMethod(getMutateCampaignSharedSetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
