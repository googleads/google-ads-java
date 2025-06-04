package com.google.ads.googleads.v20.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage ad groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v20/services/ad_group_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdGroupServiceGrpc {

  private AdGroupServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v20.services.AdGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateAdGroupsRequest,
      com.google.ads.googleads.v20.services.MutateAdGroupsResponse> getMutateAdGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroups",
      requestType = com.google.ads.googleads.v20.services.MutateAdGroupsRequest.class,
      responseType = com.google.ads.googleads.v20.services.MutateAdGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateAdGroupsRequest,
      com.google.ads.googleads.v20.services.MutateAdGroupsResponse> getMutateAdGroupsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateAdGroupsRequest, com.google.ads.googleads.v20.services.MutateAdGroupsResponse> getMutateAdGroupsMethod;
    if ((getMutateAdGroupsMethod = AdGroupServiceGrpc.getMutateAdGroupsMethod) == null) {
      synchronized (AdGroupServiceGrpc.class) {
        if ((getMutateAdGroupsMethod = AdGroupServiceGrpc.getMutateAdGroupsMethod) == null) {
          AdGroupServiceGrpc.getMutateAdGroupsMethod = getMutateAdGroupsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v20.services.MutateAdGroupsRequest, com.google.ads.googleads.v20.services.MutateAdGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.MutateAdGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.MutateAdGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupServiceMethodDescriptorSupplier("MutateAdGroups"))
              .build();
        }
      }
    }
    return getMutateAdGroupsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupServiceStub>() {
        @java.lang.Override
        public AdGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupServiceStub(channel, callOptions);
        }
      };
    return AdGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AdGroupServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupServiceBlockingV2Stub>() {
        @java.lang.Override
        public AdGroupServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AdGroupServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupServiceFutureStub>() {
        @java.lang.Override
        public AdGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage ad groups.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes ad groups. Operation statuses are returned.
     * List of thrown errors:
     *   [AdGroupError]()
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BiddingError]()
     *   [BiddingStrategyError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MultiplierError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SettingError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    default void mutateAdGroups(com.google.ads.googleads.v20.services.MutateAdGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateAdGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdGroupsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AdGroupService.
   * <pre>
   * Service to manage ad groups.
   * </pre>
   */
  public static abstract class AdGroupServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdGroupServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdGroupService.
   * <pre>
   * Service to manage ad groups.
   * </pre>
   */
  public static final class AdGroupServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdGroupServiceStub> {
    private AdGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad groups. Operation statuses are returned.
     * List of thrown errors:
     *   [AdGroupError]()
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BiddingError]()
     *   [BiddingStrategyError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MultiplierError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SettingError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public void mutateAdGroups(com.google.ads.googleads.v20.services.MutateAdGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateAdGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AdGroupService.
   * <pre>
   * Service to manage ad groups.
   * </pre>
   */
  public static final class AdGroupServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupServiceBlockingV2Stub> {
    private AdGroupServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad groups. Operation statuses are returned.
     * List of thrown errors:
     *   [AdGroupError]()
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BiddingError]()
     *   [BiddingStrategyError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MultiplierError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SettingError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.ads.googleads.v20.services.MutateAdGroupsResponse mutateAdGroups(com.google.ads.googleads.v20.services.MutateAdGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AdGroupService.
   * <pre>
   * Service to manage ad groups.
   * </pre>
   */
  public static final class AdGroupServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupServiceBlockingStub> {
    private AdGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad groups. Operation statuses are returned.
     * List of thrown errors:
     *   [AdGroupError]()
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BiddingError]()
     *   [BiddingStrategyError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MultiplierError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SettingError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.ads.googleads.v20.services.MutateAdGroupsResponse mutateAdGroups(com.google.ads.googleads.v20.services.MutateAdGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdGroupService.
   * <pre>
   * Service to manage ad groups.
   * </pre>
   */
  public static final class AdGroupServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdGroupServiceFutureStub> {
    private AdGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad groups. Operation statuses are returned.
     * List of thrown errors:
     *   [AdGroupError]()
     *   [AdxError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [BiddingError]()
     *   [BiddingStrategyError]()
     *   [DatabaseError]()
     *   [DateError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [ListOperationError]()
     *   [MultiplierError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     *   [SettingError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     *   [UrlFieldError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v20.services.MutateAdGroupsResponse> mutateAdGroups(
        com.google.ads.googleads.v20.services.MutateAdGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdGroupsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_AD_GROUPS = 0;

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
        case METHODID_MUTATE_AD_GROUPS:
          serviceImpl.mutateAdGroups((com.google.ads.googleads.v20.services.MutateAdGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateAdGroupsResponse>) responseObserver);
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
          getMutateAdGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v20.services.MutateAdGroupsRequest,
              com.google.ads.googleads.v20.services.MutateAdGroupsResponse>(
                service, METHODID_MUTATE_AD_GROUPS)))
        .build();
  }

  private static abstract class AdGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v20.services.AdGroupServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupService");
    }
  }

  private static final class AdGroupServiceFileDescriptorSupplier
      extends AdGroupServiceBaseDescriptorSupplier {
    AdGroupServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupServiceMethodDescriptorSupplier
      extends AdGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AdGroupServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AdGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupServiceFileDescriptorSupplier())
              .addMethod(getMutateAdGroupsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
