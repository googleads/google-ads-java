package com.google.ads.googleads.v20.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A service to fetch invoices issued for a billing setup during a given month.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v20/services/invoice_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InvoiceServiceGrpc {

  private InvoiceServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v20.services.InvoiceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.ListInvoicesRequest,
      com.google.ads.googleads.v20.services.ListInvoicesResponse> getListInvoicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInvoices",
      requestType = com.google.ads.googleads.v20.services.ListInvoicesRequest.class,
      responseType = com.google.ads.googleads.v20.services.ListInvoicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.ListInvoicesRequest,
      com.google.ads.googleads.v20.services.ListInvoicesResponse> getListInvoicesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.ListInvoicesRequest, com.google.ads.googleads.v20.services.ListInvoicesResponse> getListInvoicesMethod;
    if ((getListInvoicesMethod = InvoiceServiceGrpc.getListInvoicesMethod) == null) {
      synchronized (InvoiceServiceGrpc.class) {
        if ((getListInvoicesMethod = InvoiceServiceGrpc.getListInvoicesMethod) == null) {
          InvoiceServiceGrpc.getListInvoicesMethod = getListInvoicesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v20.services.ListInvoicesRequest, com.google.ads.googleads.v20.services.ListInvoicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInvoices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.ListInvoicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.ListInvoicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InvoiceServiceMethodDescriptorSupplier("ListInvoices"))
              .build();
        }
      }
    }
    return getListInvoicesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InvoiceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InvoiceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InvoiceServiceStub>() {
        @java.lang.Override
        public InvoiceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InvoiceServiceStub(channel, callOptions);
        }
      };
    return InvoiceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static InvoiceServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InvoiceServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InvoiceServiceBlockingV2Stub>() {
        @java.lang.Override
        public InvoiceServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InvoiceServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return InvoiceServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InvoiceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InvoiceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InvoiceServiceBlockingStub>() {
        @java.lang.Override
        public InvoiceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InvoiceServiceBlockingStub(channel, callOptions);
        }
      };
    return InvoiceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InvoiceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InvoiceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InvoiceServiceFutureStub>() {
        @java.lang.Override
        public InvoiceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InvoiceServiceFutureStub(channel, callOptions);
        }
      };
    return InvoiceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A service to fetch invoices issued for a billing setup during a given month.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns all invoices associated with a billing setup, for a given month.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [InvoiceError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void listInvoices(com.google.ads.googleads.v20.services.ListInvoicesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.ListInvoicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInvoicesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InvoiceService.
   * <pre>
   * A service to fetch invoices issued for a billing setup during a given month.
   * </pre>
   */
  public static abstract class InvoiceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InvoiceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InvoiceService.
   * <pre>
   * A service to fetch invoices issued for a billing setup during a given month.
   * </pre>
   */
  public static final class InvoiceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InvoiceServiceStub> {
    private InvoiceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvoiceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InvoiceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all invoices associated with a billing setup, for a given month.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [InvoiceError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void listInvoices(com.google.ads.googleads.v20.services.ListInvoicesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.ListInvoicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInvoicesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InvoiceService.
   * <pre>
   * A service to fetch invoices issued for a billing setup during a given month.
   * </pre>
   */
  public static final class InvoiceServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<InvoiceServiceBlockingV2Stub> {
    private InvoiceServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvoiceServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InvoiceServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all invoices associated with a billing setup, for a given month.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [InvoiceError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v20.services.ListInvoicesResponse listInvoices(com.google.ads.googleads.v20.services.ListInvoicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInvoicesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service InvoiceService.
   * <pre>
   * A service to fetch invoices issued for a billing setup during a given month.
   * </pre>
   */
  public static final class InvoiceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InvoiceServiceBlockingStub> {
    private InvoiceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvoiceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InvoiceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all invoices associated with a billing setup, for a given month.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [InvoiceError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v20.services.ListInvoicesResponse listInvoices(com.google.ads.googleads.v20.services.ListInvoicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInvoicesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InvoiceService.
   * <pre>
   * A service to fetch invoices issued for a billing setup during a given month.
   * </pre>
   */
  public static final class InvoiceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InvoiceServiceFutureStub> {
    private InvoiceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvoiceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InvoiceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all invoices associated with a billing setup, for a given month.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [InvoiceError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v20.services.ListInvoicesResponse> listInvoices(
        com.google.ads.googleads.v20.services.ListInvoicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInvoicesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_INVOICES = 0;

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
        case METHODID_LIST_INVOICES:
          serviceImpl.listInvoices((com.google.ads.googleads.v20.services.ListInvoicesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.ListInvoicesResponse>) responseObserver);
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
          getListInvoicesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v20.services.ListInvoicesRequest,
              com.google.ads.googleads.v20.services.ListInvoicesResponse>(
                service, METHODID_LIST_INVOICES)))
        .build();
  }

  private static abstract class InvoiceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InvoiceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v20.services.InvoiceServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InvoiceService");
    }
  }

  private static final class InvoiceServiceFileDescriptorSupplier
      extends InvoiceServiceBaseDescriptorSupplier {
    InvoiceServiceFileDescriptorSupplier() {}
  }

  private static final class InvoiceServiceMethodDescriptorSupplier
      extends InvoiceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InvoiceServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (InvoiceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InvoiceServiceFileDescriptorSupplier())
              .addMethod(getListInvoicesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
