package com.google.ads.googleads.v7.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This service allows management of links between Google Ads and Google
 * Merchant Center.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v7/services/merchant_center_link_service.proto")
public final class MerchantCenterLinkServiceGrpc {

  private MerchantCenterLinkServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v7.services.MerchantCenterLinkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.ListMerchantCenterLinksRequest,
      com.google.ads.googleads.v7.services.ListMerchantCenterLinksResponse> getListMerchantCenterLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMerchantCenterLinks",
      requestType = com.google.ads.googleads.v7.services.ListMerchantCenterLinksRequest.class,
      responseType = com.google.ads.googleads.v7.services.ListMerchantCenterLinksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.ListMerchantCenterLinksRequest,
      com.google.ads.googleads.v7.services.ListMerchantCenterLinksResponse> getListMerchantCenterLinksMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.ListMerchantCenterLinksRequest, com.google.ads.googleads.v7.services.ListMerchantCenterLinksResponse> getListMerchantCenterLinksMethod;
    if ((getListMerchantCenterLinksMethod = MerchantCenterLinkServiceGrpc.getListMerchantCenterLinksMethod) == null) {
      synchronized (MerchantCenterLinkServiceGrpc.class) {
        if ((getListMerchantCenterLinksMethod = MerchantCenterLinkServiceGrpc.getListMerchantCenterLinksMethod) == null) {
          MerchantCenterLinkServiceGrpc.getListMerchantCenterLinksMethod = getListMerchantCenterLinksMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.ListMerchantCenterLinksRequest, com.google.ads.googleads.v7.services.ListMerchantCenterLinksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMerchantCenterLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.ListMerchantCenterLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.ListMerchantCenterLinksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MerchantCenterLinkServiceMethodDescriptorSupplier("ListMerchantCenterLinks"))
              .build();
        }
      }
    }
    return getListMerchantCenterLinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetMerchantCenterLinkRequest,
      com.google.ads.googleads.v7.resources.MerchantCenterLink> getGetMerchantCenterLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMerchantCenterLink",
      requestType = com.google.ads.googleads.v7.services.GetMerchantCenterLinkRequest.class,
      responseType = com.google.ads.googleads.v7.resources.MerchantCenterLink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetMerchantCenterLinkRequest,
      com.google.ads.googleads.v7.resources.MerchantCenterLink> getGetMerchantCenterLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.GetMerchantCenterLinkRequest, com.google.ads.googleads.v7.resources.MerchantCenterLink> getGetMerchantCenterLinkMethod;
    if ((getGetMerchantCenterLinkMethod = MerchantCenterLinkServiceGrpc.getGetMerchantCenterLinkMethod) == null) {
      synchronized (MerchantCenterLinkServiceGrpc.class) {
        if ((getGetMerchantCenterLinkMethod = MerchantCenterLinkServiceGrpc.getGetMerchantCenterLinkMethod) == null) {
          MerchantCenterLinkServiceGrpc.getGetMerchantCenterLinkMethod = getGetMerchantCenterLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.GetMerchantCenterLinkRequest, com.google.ads.googleads.v7.resources.MerchantCenterLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMerchantCenterLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.GetMerchantCenterLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.resources.MerchantCenterLink.getDefaultInstance()))
              .setSchemaDescriptor(new MerchantCenterLinkServiceMethodDescriptorSupplier("GetMerchantCenterLink"))
              .build();
        }
      }
    }
    return getGetMerchantCenterLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.MutateMerchantCenterLinkRequest,
      com.google.ads.googleads.v7.services.MutateMerchantCenterLinkResponse> getMutateMerchantCenterLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateMerchantCenterLink",
      requestType = com.google.ads.googleads.v7.services.MutateMerchantCenterLinkRequest.class,
      responseType = com.google.ads.googleads.v7.services.MutateMerchantCenterLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.MutateMerchantCenterLinkRequest,
      com.google.ads.googleads.v7.services.MutateMerchantCenterLinkResponse> getMutateMerchantCenterLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v7.services.MutateMerchantCenterLinkRequest, com.google.ads.googleads.v7.services.MutateMerchantCenterLinkResponse> getMutateMerchantCenterLinkMethod;
    if ((getMutateMerchantCenterLinkMethod = MerchantCenterLinkServiceGrpc.getMutateMerchantCenterLinkMethod) == null) {
      synchronized (MerchantCenterLinkServiceGrpc.class) {
        if ((getMutateMerchantCenterLinkMethod = MerchantCenterLinkServiceGrpc.getMutateMerchantCenterLinkMethod) == null) {
          MerchantCenterLinkServiceGrpc.getMutateMerchantCenterLinkMethod = getMutateMerchantCenterLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v7.services.MutateMerchantCenterLinkRequest, com.google.ads.googleads.v7.services.MutateMerchantCenterLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateMerchantCenterLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.MutateMerchantCenterLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v7.services.MutateMerchantCenterLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MerchantCenterLinkServiceMethodDescriptorSupplier("MutateMerchantCenterLink"))
              .build();
        }
      }
    }
    return getMutateMerchantCenterLinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MerchantCenterLinkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MerchantCenterLinkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MerchantCenterLinkServiceStub>() {
        @java.lang.Override
        public MerchantCenterLinkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MerchantCenterLinkServiceStub(channel, callOptions);
        }
      };
    return MerchantCenterLinkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MerchantCenterLinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MerchantCenterLinkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MerchantCenterLinkServiceBlockingStub>() {
        @java.lang.Override
        public MerchantCenterLinkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MerchantCenterLinkServiceBlockingStub(channel, callOptions);
        }
      };
    return MerchantCenterLinkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MerchantCenterLinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MerchantCenterLinkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MerchantCenterLinkServiceFutureStub>() {
        @java.lang.Override
        public MerchantCenterLinkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MerchantCenterLinkServiceFutureStub(channel, callOptions);
        }
      };
    return MerchantCenterLinkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads and Google
   * Merchant Center.
   * </pre>
   */
  public static abstract class MerchantCenterLinkServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns Merchant Center links available for this customer.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void listMerchantCenterLinks(com.google.ads.googleads.v7.services.ListMerchantCenterLinksRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.ListMerchantCenterLinksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMerchantCenterLinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the Merchant Center link in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getMerchantCenterLink(com.google.ads.googleads.v7.services.GetMerchantCenterLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.MerchantCenterLink> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMerchantCenterLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates status or removes a Merchant Center link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateMerchantCenterLink(com.google.ads.googleads.v7.services.MutateMerchantCenterLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.MutateMerchantCenterLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateMerchantCenterLinkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMerchantCenterLinksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.ListMerchantCenterLinksRequest,
                com.google.ads.googleads.v7.services.ListMerchantCenterLinksResponse>(
                  this, METHODID_LIST_MERCHANT_CENTER_LINKS)))
          .addMethod(
            getGetMerchantCenterLinkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.GetMerchantCenterLinkRequest,
                com.google.ads.googleads.v7.resources.MerchantCenterLink>(
                  this, METHODID_GET_MERCHANT_CENTER_LINK)))
          .addMethod(
            getMutateMerchantCenterLinkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v7.services.MutateMerchantCenterLinkRequest,
                com.google.ads.googleads.v7.services.MutateMerchantCenterLinkResponse>(
                  this, METHODID_MUTATE_MERCHANT_CENTER_LINK)))
          .build();
    }
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads and Google
   * Merchant Center.
   * </pre>
   */
  public static final class MerchantCenterLinkServiceStub extends io.grpc.stub.AbstractAsyncStub<MerchantCenterLinkServiceStub> {
    private MerchantCenterLinkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MerchantCenterLinkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MerchantCenterLinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns Merchant Center links available for this customer.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void listMerchantCenterLinks(com.google.ads.googleads.v7.services.ListMerchantCenterLinksRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.ListMerchantCenterLinksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMerchantCenterLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the Merchant Center link in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getMerchantCenterLink(com.google.ads.googleads.v7.services.GetMerchantCenterLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.MerchantCenterLink> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMerchantCenterLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates status or removes a Merchant Center link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateMerchantCenterLink(com.google.ads.googleads.v7.services.MutateMerchantCenterLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.MutateMerchantCenterLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateMerchantCenterLinkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads and Google
   * Merchant Center.
   * </pre>
   */
  public static final class MerchantCenterLinkServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MerchantCenterLinkServiceBlockingStub> {
    private MerchantCenterLinkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MerchantCenterLinkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MerchantCenterLinkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns Merchant Center links available for this customer.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v7.services.ListMerchantCenterLinksResponse listMerchantCenterLinks(com.google.ads.googleads.v7.services.ListMerchantCenterLinksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMerchantCenterLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the Merchant Center link in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v7.resources.MerchantCenterLink getMerchantCenterLink(com.google.ads.googleads.v7.services.GetMerchantCenterLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMerchantCenterLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates status or removes a Merchant Center link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v7.services.MutateMerchantCenterLinkResponse mutateMerchantCenterLink(com.google.ads.googleads.v7.services.MutateMerchantCenterLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateMerchantCenterLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads and Google
   * Merchant Center.
   * </pre>
   */
  public static final class MerchantCenterLinkServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MerchantCenterLinkServiceFutureStub> {
    private MerchantCenterLinkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MerchantCenterLinkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MerchantCenterLinkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns Merchant Center links available for this customer.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.services.ListMerchantCenterLinksResponse> listMerchantCenterLinks(
        com.google.ads.googleads.v7.services.ListMerchantCenterLinksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMerchantCenterLinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the Merchant Center link in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.resources.MerchantCenterLink> getMerchantCenterLink(
        com.google.ads.googleads.v7.services.GetMerchantCenterLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMerchantCenterLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates status or removes a Merchant Center link.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v7.services.MutateMerchantCenterLinkResponse> mutateMerchantCenterLink(
        com.google.ads.googleads.v7.services.MutateMerchantCenterLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateMerchantCenterLinkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_MERCHANT_CENTER_LINKS = 0;
  private static final int METHODID_GET_MERCHANT_CENTER_LINK = 1;
  private static final int METHODID_MUTATE_MERCHANT_CENTER_LINK = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MerchantCenterLinkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MerchantCenterLinkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_MERCHANT_CENTER_LINKS:
          serviceImpl.listMerchantCenterLinks((com.google.ads.googleads.v7.services.ListMerchantCenterLinksRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.ListMerchantCenterLinksResponse>) responseObserver);
          break;
        case METHODID_GET_MERCHANT_CENTER_LINK:
          serviceImpl.getMerchantCenterLink((com.google.ads.googleads.v7.services.GetMerchantCenterLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.resources.MerchantCenterLink>) responseObserver);
          break;
        case METHODID_MUTATE_MERCHANT_CENTER_LINK:
          serviceImpl.mutateMerchantCenterLink((com.google.ads.googleads.v7.services.MutateMerchantCenterLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v7.services.MutateMerchantCenterLinkResponse>) responseObserver);
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

  private static abstract class MerchantCenterLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MerchantCenterLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v7.services.MerchantCenterLinkServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MerchantCenterLinkService");
    }
  }

  private static final class MerchantCenterLinkServiceFileDescriptorSupplier
      extends MerchantCenterLinkServiceBaseDescriptorSupplier {
    MerchantCenterLinkServiceFileDescriptorSupplier() {}
  }

  private static final class MerchantCenterLinkServiceMethodDescriptorSupplier
      extends MerchantCenterLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MerchantCenterLinkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MerchantCenterLinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MerchantCenterLinkServiceFileDescriptorSupplier())
              .addMethod(getListMerchantCenterLinksMethod())
              .addMethod(getGetMerchantCenterLinkMethod())
              .addMethod(getMutateMerchantCenterLinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
