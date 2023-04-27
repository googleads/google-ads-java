package com.google.ads.googleads.v13.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage campaign criteria.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v13/services/campaign_criterion_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampaignCriterionServiceGrpc {

  private CampaignCriterionServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v13.services.CampaignCriterionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateCampaignCriteriaRequest,
      com.google.ads.googleads.v13.services.MutateCampaignCriteriaResponse> getMutateCampaignCriteriaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignCriteria",
      requestType = com.google.ads.googleads.v13.services.MutateCampaignCriteriaRequest.class,
      responseType = com.google.ads.googleads.v13.services.MutateCampaignCriteriaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateCampaignCriteriaRequest,
      com.google.ads.googleads.v13.services.MutateCampaignCriteriaResponse> getMutateCampaignCriteriaMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateCampaignCriteriaRequest, com.google.ads.googleads.v13.services.MutateCampaignCriteriaResponse> getMutateCampaignCriteriaMethod;
    if ((getMutateCampaignCriteriaMethod = CampaignCriterionServiceGrpc.getMutateCampaignCriteriaMethod) == null) {
      synchronized (CampaignCriterionServiceGrpc.class) {
        if ((getMutateCampaignCriteriaMethod = CampaignCriterionServiceGrpc.getMutateCampaignCriteriaMethod) == null) {
          CampaignCriterionServiceGrpc.getMutateCampaignCriteriaMethod = getMutateCampaignCriteriaMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v13.services.MutateCampaignCriteriaRequest, com.google.ads.googleads.v13.services.MutateCampaignCriteriaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignCriteria"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateCampaignCriteriaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateCampaignCriteriaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignCriterionServiceMethodDescriptorSupplier("MutateCampaignCriteria"))
              .build();
        }
      }
    }
    return getMutateCampaignCriteriaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignCriterionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignCriterionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignCriterionServiceStub>() {
        @java.lang.Override
        public CampaignCriterionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignCriterionServiceStub(channel, callOptions);
        }
      };
    return CampaignCriterionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignCriterionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignCriterionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignCriterionServiceBlockingStub>() {
        @java.lang.Override
        public CampaignCriterionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignCriterionServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignCriterionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignCriterionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignCriterionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignCriterionServiceFutureStub>() {
        @java.lang.Override
        public CampaignCriterionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignCriterionServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignCriterionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage campaign criteria.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes criteria. Operation statuses are returned.
     * List of thrown errors:
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignCriterionError]()
     *   [CollectionSizeError]()
     *   [ContextError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [FunctionError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RegionCodeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    default void mutateCampaignCriteria(com.google.ads.googleads.v13.services.MutateCampaignCriteriaRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateCampaignCriteriaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCampaignCriteriaMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CampaignCriterionService.
   * <pre>
   * Service to manage campaign criteria.
   * </pre>
   */
  public static abstract class CampaignCriterionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CampaignCriterionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CampaignCriterionService.
   * <pre>
   * Service to manage campaign criteria.
   * </pre>
   */
  public static final class CampaignCriterionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CampaignCriterionServiceStub> {
    private CampaignCriterionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignCriterionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignCriterionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes criteria. Operation statuses are returned.
     * List of thrown errors:
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignCriterionError]()
     *   [CollectionSizeError]()
     *   [ContextError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [FunctionError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RegionCodeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateCampaignCriteria(com.google.ads.googleads.v13.services.MutateCampaignCriteriaRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateCampaignCriteriaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCampaignCriteriaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CampaignCriterionService.
   * <pre>
   * Service to manage campaign criteria.
   * </pre>
   */
  public static final class CampaignCriterionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CampaignCriterionServiceBlockingStub> {
    private CampaignCriterionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignCriterionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignCriterionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes criteria. Operation statuses are returned.
     * List of thrown errors:
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignCriterionError]()
     *   [CollectionSizeError]()
     *   [ContextError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [FunctionError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RegionCodeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v13.services.MutateCampaignCriteriaResponse mutateCampaignCriteria(com.google.ads.googleads.v13.services.MutateCampaignCriteriaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignCriteriaMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CampaignCriterionService.
   * <pre>
   * Service to manage campaign criteria.
   * </pre>
   */
  public static final class CampaignCriterionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CampaignCriterionServiceFutureStub> {
    private CampaignCriterionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignCriterionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignCriterionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes criteria. Operation statuses are returned.
     * List of thrown errors:
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignCriterionError]()
     *   [CollectionSizeError]()
     *   [ContextError]()
     *   [CriterionError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [FunctionError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RegionCodeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v13.services.MutateCampaignCriteriaResponse> mutateCampaignCriteria(
        com.google.ads.googleads.v13.services.MutateCampaignCriteriaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCampaignCriteriaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CAMPAIGN_CRITERIA = 0;

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
        case METHODID_MUTATE_CAMPAIGN_CRITERIA:
          serviceImpl.mutateCampaignCriteria((com.google.ads.googleads.v13.services.MutateCampaignCriteriaRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateCampaignCriteriaResponse>) responseObserver);
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
          getMutateCampaignCriteriaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v13.services.MutateCampaignCriteriaRequest,
              com.google.ads.googleads.v13.services.MutateCampaignCriteriaResponse>(
                service, METHODID_MUTATE_CAMPAIGN_CRITERIA)))
        .build();
  }

  private static abstract class CampaignCriterionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignCriterionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v13.services.CampaignCriterionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignCriterionService");
    }
  }

  private static final class CampaignCriterionServiceFileDescriptorSupplier
      extends CampaignCriterionServiceBaseDescriptorSupplier {
    CampaignCriterionServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignCriterionServiceMethodDescriptorSupplier
      extends CampaignCriterionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignCriterionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignCriterionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignCriterionServiceFileDescriptorSupplier())
              .addMethod(getMutateCampaignCriteriaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
