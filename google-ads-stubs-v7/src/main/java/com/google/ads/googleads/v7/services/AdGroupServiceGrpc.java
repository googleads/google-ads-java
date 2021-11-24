package com.google.ads.googleads.v7.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage ad groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v7/services/ad_group_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdGroupServiceGrpc {

  private AdGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v7.services.AdGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetAdGroupRequest,
      com.google.ads.googleads.v7.resources.AdGroup> getGetAdGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdGroup",
      requestType = com.google.ads.googleads.v7.services.GetAdGroupRequest.class,
      responseType = com.google.ads.googleads.v7.resources.AdGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetAdGroupRequest,
      com.google.ads.googleads.v7.resources.AdGroup> getGetAdGroupMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetAdGroupRequest, com.google.ads.googleads.v7.resources.AdGroup> getGetAdGroupMethod;
    if ((getGetAdGroupMethod = AdGroupServiceGrpc.getGetAdGroupMethod) == null) {
      synchronized (AdGroupServiceGrpc.class) {
        if ((getGetAdGroupMethod = AdGroupServiceGrpc.getGetAdGroupMethod) == null) {
          AdGroupServiceGrpc.getGetAdGroupMethod = getGetAdGroupMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.GetAdGroupRequest, com.google.ads.googleads.v7.resources.AdGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.GetAdGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.resources.AdGroup.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupServiceMethodDescriptorSupplier("GetAdGroup"))
              .build();
        }
      }
    }
    return getGetAdGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.MutateAdGroupsRequest,
      com.google.ads.googleads.v7.services.MutateAdGroupsResponse> getMutateAdGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroups",
      requestType = com.google.ads.googleads.v7.services.MutateAdGroupsRequest.class,
      responseType = com.google.ads.googleads.v7.services.MutateAdGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.MutateAdGroupsRequest,
      com.google.ads.googleads.v7.services.MutateAdGroupsResponse> getMutateAdGroupsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.MutateAdGroupsRequest, com.google.ads.googleads.v7.services.MutateAdGroupsResponse> getMutateAdGroupsMethod;
    if ((getMutateAdGroupsMethod = AdGroupServiceGrpc.getMutateAdGroupsMethod) == null) {
      synchronized (AdGroupServiceGrpc.class) {
        if ((getMutateAdGroupsMethod = AdGroupServiceGrpc.getMutateAdGroupsMethod) == null) {
          AdGroupServiceGrpc.getMutateAdGroupsMethod = getMutateAdGroupsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.MutateAdGroupsRequest, com.google.ads.googleads.v7.services.MutateAdGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.MutateAdGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.MutateAdGroupsResponse.getDefaultInstance()))
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
  public static abstract class AdGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad group in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAdGroup(com.google.ads.googleads.v7.services.GetAdGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.AdGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAdGroupMethod(), responseObserver);
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
    public void mutateAdGroups(com.google.ads.googleads.v7.services.MutateAdGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.MutateAdGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdGroupsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.GetAdGroupRequest,
                com.google.ads.googleads.v7.resources.AdGroup>(
                  this, METHODID_GET_AD_GROUP)))
          .addMethod(
            getMutateAdGroupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.MutateAdGroupsRequest,
                com.google.ads.googleads.v7.services.MutateAdGroupsResponse>(
                  this, METHODID_MUTATE_AD_GROUPS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ad groups.
   * </pre>
   */
  public static final class AdGroupServiceStub extends io.grpc.stub.AbstractAsyncStub<AdGroupServiceStub> {
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
     * Returns the requested ad group in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getAdGroup(com.google.ads.googleads.v7.services.GetAdGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.AdGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAdGroupMethod(), getCallOptions()), request, responseObserver);
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
    public void mutateAdGroups(com.google.ads.googleads.v7.services.MutateAdGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.MutateAdGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ad groups.
   * </pre>
   */
  public static final class AdGroupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdGroupServiceBlockingStub> {
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
     * Returns the requested ad group in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v7.resources.AdGroup getAdGroup(com.google.ads.googleads.v7.services.GetAdGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAdGroupMethod(), getCallOptions(), request);
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
    public com.google.ads.googleads.v7.services.MutateAdGroupsResponse mutateAdGroups(com.google.ads.googleads.v7.services.MutateAdGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ad groups.
   * </pre>
   */
  public static final class AdGroupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AdGroupServiceFutureStub> {
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
     * Returns the requested ad group in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.resources.AdGroup> getAdGroup(
        com.google.ads.googleads.v7.services.GetAdGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAdGroupMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.services.MutateAdGroupsResponse> mutateAdGroups(
        com.google.ads.googleads.v7.services.MutateAdGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdGroupsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP = 0;
  private static final int METHODID_MUTATE_AD_GROUPS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP:
          serviceImpl.getAdGroup((com.google.ads.googleads.v7.services.GetAdGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.AdGroup>) responseObserver);
          break;
        case METHODID_MUTATE_AD_GROUPS:
          serviceImpl.mutateAdGroups((com.google.ads.googleads.v7.services.MutateAdGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.MutateAdGroupsResponse>) responseObserver);
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

  private static abstract class AdGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v7.services.AdGroupServiceProto.getDescriptor();
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
    private final String methodName;

    AdGroupServiceMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getGetAdGroupMethod())
              .addMethod(getMutateAdGroupsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
