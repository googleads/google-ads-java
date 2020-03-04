package com.google.ads.googleads.v3.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * A service to fetch invoices issued for a billing setup during a given month.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/invoice_service.proto")
public final class InvoiceServiceGrpc {

  private InvoiceServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.InvoiceService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListInvoicesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListInvoicesRequest,
      com.google.ads.googleads.v3.services.ListInvoicesResponse> METHOD_LIST_INVOICES = getListInvoicesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListInvoicesRequest,
      com.google.ads.googleads.v3.services.ListInvoicesResponse> getListInvoicesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListInvoicesRequest,
      com.google.ads.googleads.v3.services.ListInvoicesResponse> getListInvoicesMethod() {
    return getListInvoicesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListInvoicesRequest,
      com.google.ads.googleads.v3.services.ListInvoicesResponse> getListInvoicesMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListInvoicesRequest, com.google.ads.googleads.v3.services.ListInvoicesResponse> getListInvoicesMethod;
    if ((getListInvoicesMethod = InvoiceServiceGrpc.getListInvoicesMethod) == null) {
      synchronized (InvoiceServiceGrpc.class) {
        if ((getListInvoicesMethod = InvoiceServiceGrpc.getListInvoicesMethod) == null) {
          InvoiceServiceGrpc.getListInvoicesMethod = getListInvoicesMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.ListInvoicesRequest, com.google.ads.googleads.v3.services.ListInvoicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.InvoiceService", "ListInvoices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.ListInvoicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.ListInvoicesResponse.getDefaultInstance()))
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
    return new InvoiceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InvoiceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InvoiceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InvoiceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InvoiceServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A service to fetch invoices issued for a billing setup during a given month.
   * </pre>
   */
  public static abstract class InvoiceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns all invoices associated with a billing setup, for a given month.
     * </pre>
     */
    public void listInvoices(com.google.ads.googleads.v3.services.ListInvoicesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.ListInvoicesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListInvoicesMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListInvoicesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.ListInvoicesRequest,
                com.google.ads.googleads.v3.services.ListInvoicesResponse>(
                  this, METHODID_LIST_INVOICES)))
          .build();
    }
  }

  /**
   * <pre>
   * A service to fetch invoices issued for a billing setup during a given month.
   * </pre>
   */
  public static final class InvoiceServiceStub extends io.grpc.stub.AbstractStub<InvoiceServiceStub> {
    private InvoiceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InvoiceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvoiceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InvoiceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all invoices associated with a billing setup, for a given month.
     * </pre>
     */
    public void listInvoices(com.google.ads.googleads.v3.services.ListInvoicesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.ListInvoicesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInvoicesMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A service to fetch invoices issued for a billing setup during a given month.
   * </pre>
   */
  public static final class InvoiceServiceBlockingStub extends io.grpc.stub.AbstractStub<InvoiceServiceBlockingStub> {
    private InvoiceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InvoiceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvoiceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InvoiceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all invoices associated with a billing setup, for a given month.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.ListInvoicesResponse listInvoices(com.google.ads.googleads.v3.services.ListInvoicesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListInvoicesMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A service to fetch invoices issued for a billing setup during a given month.
   * </pre>
   */
  public static final class InvoiceServiceFutureStub extends io.grpc.stub.AbstractStub<InvoiceServiceFutureStub> {
    private InvoiceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InvoiceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvoiceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InvoiceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns all invoices associated with a billing setup, for a given month.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.ListInvoicesResponse> listInvoices(
        com.google.ads.googleads.v3.services.ListInvoicesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListInvoicesMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_INVOICES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InvoiceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InvoiceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_INVOICES:
          serviceImpl.listInvoices((com.google.ads.googleads.v3.services.ListInvoicesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.ListInvoicesResponse>) responseObserver);
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

  private static abstract class InvoiceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InvoiceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v3.services.InvoiceServiceProto.getDescriptor();
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
    private final String methodName;

    InvoiceServiceMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getListInvoicesMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
