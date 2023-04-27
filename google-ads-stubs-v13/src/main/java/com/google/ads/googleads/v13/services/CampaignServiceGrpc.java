package com.google.ads.googleads.v13.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage campaigns.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v13/services/campaign_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampaignServiceGrpc {

  private CampaignServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v13.services.CampaignService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateCampaignsRequest,
      com.google.ads.googleads.v13.services.MutateCampaignsResponse> getMutateCampaignsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaigns",
      requestType = com.google.ads.googleads.v13.services.MutateCampaignsRequest.class,
      responseType = com.google.ads.googleads.v13.services.MutateCampaignsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateCampaignsRequest,
      com.google.ads.googleads.v13.services.MutateCampaignsResponse> getMutateCampaignsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.MutateCampaignsRequest, com.google.ads.googleads.v13.services.MutateCampaignsResponse> getMutateCampaignsMethod;
    if ((getMutateCampaignsMethod = CampaignServiceGrpc.getMutateCampaignsMethod) == null) {
      synchronized (CampaignServiceGrpc.class) {
        if ((getMutateCampaignsMethod = CampaignServiceGrpc.getMutateCampaignsMethod) == null) {
          CampaignServiceGrpc.getMutateCampaignsMethod = getMutateCampaignsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v13.services.MutateCampaignsRequest, com.google.ads.googleads.v13.services.MutateCampaignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateCampaignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.MutateCampaignsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignServiceMethodDescriptorSupplier("MutateCampaigns"))
              .build();
        }
      }
    }
    return getMutateCampaignsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignServiceStub>() {
        @java.lang.Override
        public CampaignServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignServiceStub(channel, callOptions);
        }
      };
    return CampaignServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignServiceBlockingStub>() {
        @java.lang.Override
        public CampaignServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignServiceFutureStub>() {
        @java.lang.Override
        public CampaignServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage campaigns.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes campaigns. Operation statuses are returned.
     * List of thrown errors:
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BiddingError]()
     *   [BiddingStrategyError]()
     *   [CampaignBudgetError]()
     *   [CampaignError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DateRangeError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotAllowlistedError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RegionCodeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SettingError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    default void mutateCampaigns(com.google.ads.googleads.v13.services.MutateCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateCampaignsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCampaignsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CampaignService.
   * <pre>
   * Service to manage campaigns.
   * </pre>
   */
  public static abstract class CampaignServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CampaignServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CampaignService.
   * <pre>
   * Service to manage campaigns.
   * </pre>
   */
  public static final class CampaignServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CampaignServiceStub> {
    private CampaignServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaigns. Operation statuses are returned.
     * List of thrown errors:
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BiddingError]()
     *   [BiddingStrategyError]()
     *   [CampaignBudgetError]()
     *   [CampaignError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DateRangeError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotAllowlistedError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RegionCodeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SettingError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public void mutateCampaigns(com.google.ads.googleads.v13.services.MutateCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateCampaignsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCampaignsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CampaignService.
   * <pre>
   * Service to manage campaigns.
   * </pre>
   */
  public static final class CampaignServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CampaignServiceBlockingStub> {
    private CampaignServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaigns. Operation statuses are returned.
     * List of thrown errors:
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BiddingError]()
     *   [BiddingStrategyError]()
     *   [CampaignBudgetError]()
     *   [CampaignError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DateRangeError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotAllowlistedError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RegionCodeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SettingError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.ads.googleads.v13.services.MutateCampaignsResponse mutateCampaigns(com.google.ads.googleads.v13.services.MutateCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CampaignService.
   * <pre>
   * Service to manage campaigns.
   * </pre>
   */
  public static final class CampaignServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CampaignServiceFutureStub> {
    private CampaignServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaigns. Operation statuses are returned.
     * List of thrown errors:
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BiddingError]()
     *   [BiddingStrategyError]()
     *   [CampaignBudgetError]()
     *   [CampaignError]()
     *   [ContextError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DateRangeError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotAllowlistedError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RegionCodeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SettingError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v13.services.MutateCampaignsResponse> mutateCampaigns(
        com.google.ads.googleads.v13.services.MutateCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCampaignsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CAMPAIGNS = 0;

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
        case METHODID_MUTATE_CAMPAIGNS:
          serviceImpl.mutateCampaigns((com.google.ads.googleads.v13.services.MutateCampaignsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.MutateCampaignsResponse>) responseObserver);
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
          getMutateCampaignsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v13.services.MutateCampaignsRequest,
              com.google.ads.googleads.v13.services.MutateCampaignsResponse>(
                service, METHODID_MUTATE_CAMPAIGNS)))
        .build();
  }

  private static abstract class CampaignServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v13.services.CampaignServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignService");
    }
  }

  private static final class CampaignServiceFileDescriptorSupplier
      extends CampaignServiceBaseDescriptorSupplier {
    CampaignServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignServiceMethodDescriptorSupplier
      extends CampaignServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignServiceFileDescriptorSupplier())
              .addMethod(getMutateCampaignsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
