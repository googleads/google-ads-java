package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage campaign feeds.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/campaign_feed_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CampaignFeedServiceGrpc {

  private CampaignFeedServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.CampaignFeedService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCampaignFeedRequest,
      com.google.ads.googleads.v9.resources.CampaignFeed> getGetCampaignFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaignFeed",
      requestType = com.google.ads.googleads.v9.services.GetCampaignFeedRequest.class,
      responseType = com.google.ads.googleads.v9.resources.CampaignFeed.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCampaignFeedRequest,
      com.google.ads.googleads.v9.resources.CampaignFeed> getGetCampaignFeedMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCampaignFeedRequest, com.google.ads.googleads.v9.resources.CampaignFeed> getGetCampaignFeedMethod;
    if ((getGetCampaignFeedMethod = CampaignFeedServiceGrpc.getGetCampaignFeedMethod) == null) {
      synchronized (CampaignFeedServiceGrpc.class) {
        if ((getGetCampaignFeedMethod = CampaignFeedServiceGrpc.getGetCampaignFeedMethod) == null) {
          CampaignFeedServiceGrpc.getGetCampaignFeedMethod = getGetCampaignFeedMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetCampaignFeedRequest, com.google.ads.googleads.v9.resources.CampaignFeed>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaignFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetCampaignFeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.CampaignFeed.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignFeedServiceMethodDescriptorSupplier("GetCampaignFeed"))
              .build();
        }
      }
    }
    return getGetCampaignFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCampaignFeedsRequest,
      com.google.ads.googleads.v9.services.MutateCampaignFeedsResponse> getMutateCampaignFeedsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCampaignFeeds",
      requestType = com.google.ads.googleads.v9.services.MutateCampaignFeedsRequest.class,
      responseType = com.google.ads.googleads.v9.services.MutateCampaignFeedsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCampaignFeedsRequest,
      com.google.ads.googleads.v9.services.MutateCampaignFeedsResponse> getMutateCampaignFeedsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCampaignFeedsRequest, com.google.ads.googleads.v9.services.MutateCampaignFeedsResponse> getMutateCampaignFeedsMethod;
    if ((getMutateCampaignFeedsMethod = CampaignFeedServiceGrpc.getMutateCampaignFeedsMethod) == null) {
      synchronized (CampaignFeedServiceGrpc.class) {
        if ((getMutateCampaignFeedsMethod = CampaignFeedServiceGrpc.getMutateCampaignFeedsMethod) == null) {
          CampaignFeedServiceGrpc.getMutateCampaignFeedsMethod = getMutateCampaignFeedsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.MutateCampaignFeedsRequest, com.google.ads.googleads.v9.services.MutateCampaignFeedsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCampaignFeeds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateCampaignFeedsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateCampaignFeedsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CampaignFeedServiceMethodDescriptorSupplier("MutateCampaignFeeds"))
              .build();
        }
      }
    }
    return getMutateCampaignFeedsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignFeedServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignFeedServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignFeedServiceStub>() {
        @java.lang.Override
        public CampaignFeedServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignFeedServiceStub(channel, callOptions);
        }
      };
    return CampaignFeedServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignFeedServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignFeedServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignFeedServiceBlockingStub>() {
        @java.lang.Override
        public CampaignFeedServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignFeedServiceBlockingStub(channel, callOptions);
        }
      };
    return CampaignFeedServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignFeedServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CampaignFeedServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CampaignFeedServiceFutureStub>() {
        @java.lang.Override
        public CampaignFeedServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CampaignFeedServiceFutureStub(channel, callOptions);
        }
      };
    return CampaignFeedServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage campaign feeds.
   * </pre>
   */
  public static abstract class CampaignFeedServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested campaign feed in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCampaignFeed(com.google.ads.googleads.v9.services.GetCampaignFeedRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CampaignFeed> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCampaignFeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign feeds. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignFeedError]()
     *   [CollectionSizeError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateCampaignFeeds(com.google.ads.googleads.v9.services.MutateCampaignFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCampaignFeedsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCampaignFeedsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignFeedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetCampaignFeedRequest,
                com.google.ads.googleads.v9.resources.CampaignFeed>(
                  this, METHODID_GET_CAMPAIGN_FEED)))
          .addMethod(
            getMutateCampaignFeedsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.MutateCampaignFeedsRequest,
                com.google.ads.googleads.v9.services.MutateCampaignFeedsResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_FEEDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign feeds.
   * </pre>
   */
  public static final class CampaignFeedServiceStub extends io.grpc.stub.AbstractAsyncStub<CampaignFeedServiceStub> {
    private CampaignFeedServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignFeedServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignFeedServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign feed in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCampaignFeed(com.google.ads.googleads.v9.services.GetCampaignFeedRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CampaignFeed> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCampaignFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign feeds. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignFeedError]()
     *   [CollectionSizeError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public void mutateCampaignFeeds(com.google.ads.googleads.v9.services.MutateCampaignFeedsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCampaignFeedsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCampaignFeedsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign feeds.
   * </pre>
   */
  public static final class CampaignFeedServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CampaignFeedServiceBlockingStub> {
    private CampaignFeedServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignFeedServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignFeedServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign feed in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.CampaignFeed getCampaignFeed(com.google.ads.googleads.v9.services.GetCampaignFeedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCampaignFeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign feeds. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignFeedError]()
     *   [CollectionSizeError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.services.MutateCampaignFeedsResponse mutateCampaignFeeds(com.google.ads.googleads.v9.services.MutateCampaignFeedsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCampaignFeedsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign feeds.
   * </pre>
   */
  public static final class CampaignFeedServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CampaignFeedServiceFutureStub> {
    private CampaignFeedServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignFeedServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CampaignFeedServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested campaign feed in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.CampaignFeed> getCampaignFeed(
        com.google.ads.googleads.v9.services.GetCampaignFeedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCampaignFeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes campaign feeds. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CampaignFeedError]()
     *   [CollectionSizeError]()
     *   [DatabaseError]()
     *   [DistinctError]()
     *   [FieldError]()
     *   [FunctionError]()
     *   [FunctionParsingError]()
     *   [HeaderError]()
     *   [IdError]()
     *   [InternalError]()
     *   [MutateError]()
     *   [NotEmptyError]()
     *   [NullError]()
     *   [OperationAccessDeniedError]()
     *   [OperatorError]()
     *   [QuotaError]()
     *   [RangeError]()
     *   [RequestError]()
     *   [SizeLimitError]()
     *   [StringFormatError]()
     *   [StringLengthError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.MutateCampaignFeedsResponse> mutateCampaignFeeds(
        com.google.ads.googleads.v9.services.MutateCampaignFeedsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCampaignFeedsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_FEED = 0;
  private static final int METHODID_MUTATE_CAMPAIGN_FEEDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignFeedServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignFeedServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_FEED:
          serviceImpl.getCampaignFeed((com.google.ads.googleads.v9.services.GetCampaignFeedRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CampaignFeed>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_FEEDS:
          serviceImpl.mutateCampaignFeeds((com.google.ads.googleads.v9.services.MutateCampaignFeedsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCampaignFeedsResponse>) responseObserver);
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

  private static abstract class CampaignFeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignFeedServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.CampaignFeedServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignFeedService");
    }
  }

  private static final class CampaignFeedServiceFileDescriptorSupplier
      extends CampaignFeedServiceBaseDescriptorSupplier {
    CampaignFeedServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignFeedServiceMethodDescriptorSupplier
      extends CampaignFeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignFeedServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CampaignFeedServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignFeedServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignFeedMethod())
              .addMethod(getMutateCampaignFeedsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
