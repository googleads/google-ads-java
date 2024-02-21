package com.google.ads.googleads.v14.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage Keyword Plan campaigns.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v14/services/keyword_plan_campaign_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KeywordPlanCampaignServiceGrpc {

  private KeywordPlanCampaignServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v14.services.KeywordPlanCampaignService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsRequest,
      com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsResponse> getMutateKeywordPlanCampaignsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateKeywordPlanCampaigns",
      requestType = com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsRequest.class,
      responseType = com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsRequest,
      com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsResponse> getMutateKeywordPlanCampaignsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsRequest, com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsResponse> getMutateKeywordPlanCampaignsMethod;
    if ((getMutateKeywordPlanCampaignsMethod = KeywordPlanCampaignServiceGrpc.getMutateKeywordPlanCampaignsMethod) == null) {
      synchronized (KeywordPlanCampaignServiceGrpc.class) {
        if ((getMutateKeywordPlanCampaignsMethod = KeywordPlanCampaignServiceGrpc.getMutateKeywordPlanCampaignsMethod) == null) {
          KeywordPlanCampaignServiceGrpc.getMutateKeywordPlanCampaignsMethod = getMutateKeywordPlanCampaignsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsRequest, com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateKeywordPlanCampaigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanCampaignServiceMethodDescriptorSupplier("MutateKeywordPlanCampaigns"))
              .build();
        }
      }
    }
    return getMutateKeywordPlanCampaignsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeywordPlanCampaignServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanCampaignServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanCampaignServiceStub>() {
        @java.lang.Override
        public KeywordPlanCampaignServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanCampaignServiceStub(channel, callOptions);
        }
      };
    return KeywordPlanCampaignServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordPlanCampaignServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanCampaignServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanCampaignServiceBlockingStub>() {
        @java.lang.Override
        public KeywordPlanCampaignServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanCampaignServiceBlockingStub(channel, callOptions);
        }
      };
    return KeywordPlanCampaignServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordPlanCampaignServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanCampaignServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanCampaignServiceFutureStub>() {
        @java.lang.Override
        public KeywordPlanCampaignServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanCampaignServiceFutureStub(channel, callOptions);
        }
      };
    return KeywordPlanCampaignServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage Keyword Plan campaigns.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan campaigns. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanCampaignError]()
     *   [KeywordPlanError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    default void mutateKeywordPlanCampaigns(com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateKeywordPlanCampaignsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service KeywordPlanCampaignService.
   * <pre>
   * Service to manage Keyword Plan campaigns.
   * </pre>
   */
  public static abstract class KeywordPlanCampaignServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return KeywordPlanCampaignServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service KeywordPlanCampaignService.
   * <pre>
   * Service to manage Keyword Plan campaigns.
   * </pre>
   */
  public static final class KeywordPlanCampaignServiceStub
      extends io.grpc.stub.AbstractAsyncStub<KeywordPlanCampaignServiceStub> {
    private KeywordPlanCampaignServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanCampaignServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanCampaignServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan campaigns. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanCampaignError]()
     *   [KeywordPlanError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public void mutateKeywordPlanCampaigns(com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateKeywordPlanCampaignsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service KeywordPlanCampaignService.
   * <pre>
   * Service to manage Keyword Plan campaigns.
   * </pre>
   */
  public static final class KeywordPlanCampaignServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<KeywordPlanCampaignServiceBlockingStub> {
    private KeywordPlanCampaignServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanCampaignServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanCampaignServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan campaigns. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanCampaignError]()
     *   [KeywordPlanError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsResponse mutateKeywordPlanCampaigns(com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateKeywordPlanCampaignsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service KeywordPlanCampaignService.
   * <pre>
   * Service to manage Keyword Plan campaigns.
   * </pre>
   */
  public static final class KeywordPlanCampaignServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<KeywordPlanCampaignServiceFutureStub> {
    private KeywordPlanCampaignServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanCampaignServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanCampaignServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan campaigns. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanCampaignError]()
     *   [KeywordPlanError]()
     *   [ListOperationError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsResponse> mutateKeywordPlanCampaigns(
        com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateKeywordPlanCampaignsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_KEYWORD_PLAN_CAMPAIGNS = 0;

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
        case METHODID_MUTATE_KEYWORD_PLAN_CAMPAIGNS:
          serviceImpl.mutateKeywordPlanCampaigns((com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsResponse>) responseObserver);
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
          getMutateKeywordPlanCampaignsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsRequest,
              com.google.ads.googleads.v14.services.MutateKeywordPlanCampaignsResponse>(
                service, METHODID_MUTATE_KEYWORD_PLAN_CAMPAIGNS)))
        .build();
  }

  private static abstract class KeywordPlanCampaignServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeywordPlanCampaignServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v14.services.KeywordPlanCampaignServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeywordPlanCampaignService");
    }
  }

  private static final class KeywordPlanCampaignServiceFileDescriptorSupplier
      extends KeywordPlanCampaignServiceBaseDescriptorSupplier {
    KeywordPlanCampaignServiceFileDescriptorSupplier() {}
  }

  private static final class KeywordPlanCampaignServiceMethodDescriptorSupplier
      extends KeywordPlanCampaignServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    KeywordPlanCampaignServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (KeywordPlanCampaignServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeywordPlanCampaignServiceFileDescriptorSupplier())
              .addMethod(getMutateKeywordPlanCampaignsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
