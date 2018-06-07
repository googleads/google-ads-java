package com.google.ads.googleads.v0.services;

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
 * Service to manage customers.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v0/services/customer_service.proto")
public final class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.CustomerService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCustomerMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCustomerRequest,
      com.google.ads.googleads.v0.resources.Customer> METHOD_GET_CUSTOMER = getGetCustomerMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCustomerRequest,
      com.google.ads.googleads.v0.resources.Customer> getGetCustomerMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCustomerRequest,
      com.google.ads.googleads.v0.resources.Customer> getGetCustomerMethod() {
    return getGetCustomerMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCustomerRequest,
      com.google.ads.googleads.v0.resources.Customer> getGetCustomerMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCustomerRequest, com.google.ads.googleads.v0.resources.Customer> getGetCustomerMethod;
    if ((getGetCustomerMethod = CustomerServiceGrpc.getGetCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCustomerMethod = CustomerServiceGrpc.getGetCustomerMethod) == null) {
          CustomerServiceGrpc.getGetCustomerMethod = getGetCustomerMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.GetCustomerRequest, com.google.ads.googleads.v0.resources.Customer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.CustomerService", "GetCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.GetCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.resources.Customer.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("GetCustomer"))
                  .build();
          }
        }
     }
     return getGetCustomerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage customers.
   * </pre>
   */
  public static abstract class CustomerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested customer in full detail.
     * </pre>
     */
    public void getCustomer(com.google.ads.googleads.v0.services.GetCustomerRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.Customer> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.GetCustomerRequest,
                com.google.ads.googleads.v0.resources.Customer>(
                  this, METHODID_GET_CUSTOMER)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage customers.
   * </pre>
   */
  public static final class CustomerServiceStub extends io.grpc.stub.AbstractStub<CustomerServiceStub> {
    private CustomerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer in full detail.
     * </pre>
     */
    public void getCustomer(com.google.ads.googleads.v0.services.GetCustomerRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.Customer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage customers.
   * </pre>
   */
  public static final class CustomerServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerServiceBlockingStub> {
    private CustomerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v0.resources.Customer getCustomer(com.google.ads.googleads.v0.services.GetCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage customers.
   * </pre>
   */
  public static final class CustomerServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerServiceFutureStub> {
    private CustomerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.resources.Customer> getCustomer(
        com.google.ads.googleads.v0.services.GetCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER:
          serviceImpl.getCustomer((com.google.ads.googleads.v0.services.GetCustomerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.Customer>) responseObserver);
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

  private static abstract class CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.CustomerServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerService");
    }
  }

  private static final class CustomerServiceFileDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier {
    CustomerServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerServiceMethodDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerServiceFileDescriptorSupplier())
              .addMethod(getGetCustomerMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
