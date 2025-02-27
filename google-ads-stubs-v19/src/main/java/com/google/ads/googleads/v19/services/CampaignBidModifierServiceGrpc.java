package com.google.ads.googleads.v19.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage campaign bid modifiers.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v19/services/campaign_bid_modifier_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampaignBidModifierServiceGrpc {

  private CampaignBidModifierServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v19.services.CampaignBidModifierService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MutateCampaignBidModifiersRequest,
      com.google.ads.googleads.v19.services.MutateCampaignBidModifiersResponse> getMutateCampaignBidModifiersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignBidModifiers",
      requestType = com.google.ads.googleads.v19.services.MutateCampaignBidModifiersRequest.class,
      responseType = com.google.ads.googleads.v19.services.MutateCampaignBidModifiersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MutateCampaignBidModifiersRequest,
      com.google.ads.googleads.v19.services.MutateCampaignBidModifiersResponse> getMutateCampaignBidModifiersMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MutateCampaignBidModifiersRequest, com.google.ads.googleads.v19.services.MutateCampaignBidModifiersResponse> getMutateCampaignBidModifiersMethod;
    if ((getMutateCampaignBidModifiersMethod = CampaignBidModifierServiceGrpc.getMutateCampaignBidModifiersMethod) == null) {
      synchronized (CampaignBidModifierServiceGrpc.class) {
        if ((getMutateCampaignBidModifiersMethod = CampaignBidModifierServiceGrpc.getMutateCampaignBidModifiersMethod) == null) {
          CampaignBidModifierServiceGrpc.getMutateCampaignBidModifiersMethod = getMutateCampaignBidModifiersMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v19.services.MutateCampaignBidModifiersRequest, com.google.ads.googleads.v19.services.MutateCampaignBidModifiersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignBidModifiers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.MutateCampaignBidModifiersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.MutateCampaignBidModifiersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignBidModifierServiceMethodDescriptorSupplier("MutateCampaignBidModifiers"))
              .build();
        }
      }
    }
    return getMutateCampaignBidModifiersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignBidModifierServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignBidModifierServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignBidModifierServiceStub>() {
        @java.lang.Override
        public CampaignBidModifierServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignBidModifierServiceStub(channel, callOptions);
        }
      };
    return CampaignBidModifierServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CampaignBidModifierServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignBidModifierServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignBidModifierServiceBlockingV2Stub>() {
        @java.lang.Override
        public CampaignBidModifierServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignBidModifierServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CampaignBidModifierServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignBidModifierServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignBidModifierServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignBidModifierServiceBlockingStub>() {
        @java.lang.Override
        public CampaignBidModifierServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignBidModifierServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignBidModifierServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignBidModifierServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignBidModifierServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignBidModifierServiceFutureStub>() {
        @java.lang.Override
        public CampaignBidModifierServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignBidModifierServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignBidModifierServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage campaign bid modifiers.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes campaign bid modifiers.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [CriterionError]()
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
    default void mutateCampaignBidModifiers(com.google.ads.googleads.v19.services.MutateCampaignBidModifiersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MutateCampaignBidModifiersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCampaignBidModifiersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CampaignBidModifierService.
   * <pre>
   * Service to manage campaign bid modifiers.
   * </pre>
   */
  public static abstract class CampaignBidModifierServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CampaignBidModifierServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CampaignBidModifierService.
   * <pre>
   * Service to manage campaign bid modifiers.
   * </pre>
   */
  public static final class CampaignBidModifierServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CampaignBidModifierServiceStub> {
    private CampaignBidModifierServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBidModifierServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignBidModifierServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign bid modifiers.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [CriterionError]()
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
    public void mutateCampaignBidModifiers(com.google.ads.googleads.v19.services.MutateCampaignBidModifiersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MutateCampaignBidModifiersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCampaignBidModifiersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CampaignBidModifierService.
   * <pre>
   * Service to manage campaign bid modifiers.
   * </pre>
   */
  public static final class CampaignBidModifierServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CampaignBidModifierServiceBlockingV2Stub> {
    private CampaignBidModifierServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBidModifierServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignBidModifierServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign bid modifiers.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [CriterionError]()
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
    public com.google.ads.googleads.v19.services.MutateCampaignBidModifiersResponse mutateCampaignBidModifiers(com.google.ads.googleads.v19.services.MutateCampaignBidModifiersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignBidModifiersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CampaignBidModifierService.
   * <pre>
   * Service to manage campaign bid modifiers.
   * </pre>
   */
  public static final class CampaignBidModifierServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CampaignBidModifierServiceBlockingStub> {
    private CampaignBidModifierServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBidModifierServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignBidModifierServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign bid modifiers.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [CriterionError]()
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
    public com.google.ads.googleads.v19.services.MutateCampaignBidModifiersResponse mutateCampaignBidModifiers(com.google.ads.googleads.v19.services.MutateCampaignBidModifiersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignBidModifiersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CampaignBidModifierService.
   * <pre>
   * Service to manage campaign bid modifiers.
   * </pre>
   */
  public static final class CampaignBidModifierServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CampaignBidModifierServiceFutureStub> {
    private CampaignBidModifierServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignBidModifierServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignBidModifierServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign bid modifiers.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [ContextError]()
     *   [CriterionError]()
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v19.services.MutateCampaignBidModifiersResponse> mutateCampaignBidModifiers(
        com.google.ads.googleads.v19.services.MutateCampaignBidModifiersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCampaignBidModifiersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CAMPAIGN_BID_MODIFIERS = 0;

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
        case METHODID_MUTATE_CAMPAIGN_BID_MODIFIERS:
          serviceImpl.mutateCampaignBidModifiers((com.google.ads.googleads.v19.services.MutateCampaignBidModifiersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MutateCampaignBidModifiersResponse>) responseObserver);
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
          getMutateCampaignBidModifiersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v19.services.MutateCampaignBidModifiersRequest,
              com.google.ads.googleads.v19.services.MutateCampaignBidModifiersResponse>(
                service, METHODID_MUTATE_CAMPAIGN_BID_MODIFIERS)))
        .build();
  }

  private static abstract class CampaignBidModifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignBidModifierServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v19.services.CampaignBidModifierServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignBidModifierService");
    }
  }

  private static final class CampaignBidModifierServiceFileDescriptorSupplier
      extends CampaignBidModifierServiceBaseDescriptorSupplier {
    CampaignBidModifierServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignBidModifierServiceMethodDescriptorSupplier
      extends CampaignBidModifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CampaignBidModifierServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CampaignBidModifierServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignBidModifierServiceFileDescriptorSupplier())
              .addMethod(getMutateCampaignBidModifiersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
