package com.google.ads.googleads.v23.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for reservation related operations.
 * This service is not publicly available.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v23.services.ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.QuoteCampaignsRequest,
      com.google.ads.googleads.v23.services.QuoteCampaignsResponse> getQuoteCampaignsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuoteCampaigns",
      requestType = com.google.ads.googleads.v23.services.QuoteCampaignsRequest.class,
      responseType = com.google.ads.googleads.v23.services.QuoteCampaignsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.QuoteCampaignsRequest,
      com.google.ads.googleads.v23.services.QuoteCampaignsResponse> getQuoteCampaignsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.QuoteCampaignsRequest, com.google.ads.googleads.v23.services.QuoteCampaignsResponse> getQuoteCampaignsMethod;
    if ((getQuoteCampaignsMethod = ReservationServiceGrpc.getQuoteCampaignsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getQuoteCampaignsMethod = ReservationServiceGrpc.getQuoteCampaignsMethod) == null) {
          ReservationServiceGrpc.getQuoteCampaignsMethod = getQuoteCampaignsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v23.services.QuoteCampaignsRequest, com.google.ads.googleads.v23.services.QuoteCampaignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuoteCampaigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.QuoteCampaignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.QuoteCampaignsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("QuoteCampaigns"))
              .build();
        }
      }
    }
    return getQuoteCampaignsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.BookCampaignsRequest,
      com.google.ads.googleads.v23.services.BookCampaignsResponse> getBookCampaignsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BookCampaigns",
      requestType = com.google.ads.googleads.v23.services.BookCampaignsRequest.class,
      responseType = com.google.ads.googleads.v23.services.BookCampaignsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.BookCampaignsRequest,
      com.google.ads.googleads.v23.services.BookCampaignsResponse> getBookCampaignsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v23.services.BookCampaignsRequest, com.google.ads.googleads.v23.services.BookCampaignsResponse> getBookCampaignsMethod;
    if ((getBookCampaignsMethod = ReservationServiceGrpc.getBookCampaignsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getBookCampaignsMethod = ReservationServiceGrpc.getBookCampaignsMethod) == null) {
          ReservationServiceGrpc.getBookCampaignsMethod = getBookCampaignsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v23.services.BookCampaignsRequest, com.google.ads.googleads.v23.services.BookCampaignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BookCampaigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.BookCampaignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v23.services.BookCampaignsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("BookCampaigns"))
              .build();
        }
      }
    }
    return getBookCampaignsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceStub>() {
        @java.lang.Override
        public ReservationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceStub(channel, callOptions);
        }
      };
    return ReservationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ReservationServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceBlockingV2Stub>() {
        @java.lang.Override
        public ReservationServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ReservationServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceBlockingStub>() {
        @java.lang.Override
        public ReservationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceBlockingStub(channel, callOptions);
        }
      };
    return ReservationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceFutureStub>() {
        @java.lang.Override
        public ReservationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceFutureStub(channel, callOptions);
        }
      };
    return ReservationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for reservation related operations.
   * This service is not publicly available.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Proposes quotes for booking campaigns.
     * This request can have a latency of 30 seconds.
     * </pre>
     */
    default void quoteCampaigns(com.google.ads.googleads.v23.services.QuoteCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.QuoteCampaignsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuoteCampaignsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Books the requested campaigns.
     * This request can have a latency of 30 seconds.
     * </pre>
     */
    default void bookCampaigns(com.google.ads.googleads.v23.services.BookCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.BookCampaignsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBookCampaignsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ReservationService.
   * <pre>
   * Service for reservation related operations.
   * This service is not publicly available.
   * </pre>
   */
  public static abstract class ReservationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ReservationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ReservationService.
   * <pre>
   * Service for reservation related operations.
   * This service is not publicly available.
   * </pre>
   */
  public static final class ReservationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ReservationServiceStub> {
    private ReservationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Proposes quotes for booking campaigns.
     * This request can have a latency of 30 seconds.
     * </pre>
     */
    public void quoteCampaigns(com.google.ads.googleads.v23.services.QuoteCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.QuoteCampaignsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuoteCampaignsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Books the requested campaigns.
     * This request can have a latency of 30 seconds.
     * </pre>
     */
    public void bookCampaigns(com.google.ads.googleads.v23.services.BookCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.BookCampaignsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBookCampaignsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ReservationService.
   * <pre>
   * Service for reservation related operations.
   * This service is not publicly available.
   * </pre>
   */
  public static final class ReservationServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ReservationServiceBlockingV2Stub> {
    private ReservationServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Proposes quotes for booking campaigns.
     * This request can have a latency of 30 seconds.
     * </pre>
     */
    public com.google.ads.googleads.v23.services.QuoteCampaignsResponse quoteCampaigns(com.google.ads.googleads.v23.services.QuoteCampaignsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getQuoteCampaignsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Books the requested campaigns.
     * This request can have a latency of 30 seconds.
     * </pre>
     */
    public com.google.ads.googleads.v23.services.BookCampaignsResponse bookCampaigns(com.google.ads.googleads.v23.services.BookCampaignsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBookCampaignsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ReservationService.
   * <pre>
   * Service for reservation related operations.
   * This service is not publicly available.
   * </pre>
   */
  public static final class ReservationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Proposes quotes for booking campaigns.
     * This request can have a latency of 30 seconds.
     * </pre>
     */
    public com.google.ads.googleads.v23.services.QuoteCampaignsResponse quoteCampaigns(com.google.ads.googleads.v23.services.QuoteCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuoteCampaignsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Books the requested campaigns.
     * This request can have a latency of 30 seconds.
     * </pre>
     */
    public com.google.ads.googleads.v23.services.BookCampaignsResponse bookCampaigns(com.google.ads.googleads.v23.services.BookCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBookCampaignsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ReservationService.
   * <pre>
   * Service for reservation related operations.
   * This service is not publicly available.
   * </pre>
   */
  public static final class ReservationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Proposes quotes for booking campaigns.
     * This request can have a latency of 30 seconds.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v23.services.QuoteCampaignsResponse> quoteCampaigns(
        com.google.ads.googleads.v23.services.QuoteCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuoteCampaignsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Books the requested campaigns.
     * This request can have a latency of 30 seconds.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v23.services.BookCampaignsResponse> bookCampaigns(
        com.google.ads.googleads.v23.services.BookCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBookCampaignsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUOTE_CAMPAIGNS = 0;
  private static final int METHODID_BOOK_CAMPAIGNS = 1;

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
        case METHODID_QUOTE_CAMPAIGNS:
          serviceImpl.quoteCampaigns((com.google.ads.googleads.v23.services.QuoteCampaignsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.QuoteCampaignsResponse>) responseObserver);
          break;
        case METHODID_BOOK_CAMPAIGNS:
          serviceImpl.bookCampaigns((com.google.ads.googleads.v23.services.BookCampaignsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v23.services.BookCampaignsResponse>) responseObserver);
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
          getQuoteCampaignsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v23.services.QuoteCampaignsRequest,
              com.google.ads.googleads.v23.services.QuoteCampaignsResponse>(
                service, METHODID_QUOTE_CAMPAIGNS)))
        .addMethod(
          getBookCampaignsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v23.services.BookCampaignsRequest,
              com.google.ads.googleads.v23.services.BookCampaignsResponse>(
                service, METHODID_BOOK_CAMPAIGNS)))
        .build();
  }

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v23.services.ReservationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ReservationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getQuoteCampaignsMethod())
              .addMethod(getBookCampaignsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
