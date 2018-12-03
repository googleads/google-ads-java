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
 * Service to manage customer clients in a manager hierarchy.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v0/services/customer_client_service.proto")
public final class CustomerClientServiceGrpc {

  private CustomerClientServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.CustomerClientService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCustomerClientMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCustomerClientRequest,
      com.google.ads.googleads.v0.resources.CustomerClient> METHOD_GET_CUSTOMER_CLIENT = getGetCustomerClientMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCustomerClientRequest,
      com.google.ads.googleads.v0.resources.CustomerClient> getGetCustomerClientMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCustomerClientRequest,
      com.google.ads.googleads.v0.resources.CustomerClient> getGetCustomerClientMethod() {
    return getGetCustomerClientMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCustomerClientRequest,
      com.google.ads.googleads.v0.resources.CustomerClient> getGetCustomerClientMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCustomerClientRequest, com.google.ads.googleads.v0.resources.CustomerClient> getGetCustomerClientMethod;
    if ((getGetCustomerClientMethod = CustomerClientServiceGrpc.getGetCustomerClientMethod) == null) {
      synchronized (CustomerClientServiceGrpc.class) {
        if ((getGetCustomerClientMethod = CustomerClientServiceGrpc.getGetCustomerClientMethod) == null) {
          CustomerClientServiceGrpc.getGetCustomerClientMethod = getGetCustomerClientMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.GetCustomerClientRequest, com.google.ads.googleads.v0.resources.CustomerClient>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.CustomerClientService", "GetCustomerClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.GetCustomerClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.resources.CustomerClient.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerClientServiceMethodDescriptorSupplier("GetCustomerClient"))
                  .build();
          }
        }
     }
     return getGetCustomerClientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerClientServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerClientServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerClientServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerClientServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage customer clients in a manager hierarchy.
   * </pre>
   */
  public static abstract class CustomerClientServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested customer client in full detail.
     * </pre>
     */
    public void getCustomerClient(com.google.ads.googleads.v0.services.GetCustomerClientRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CustomerClient> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerClientMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerClientMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.GetCustomerClientRequest,
                com.google.ads.googleads.v0.resources.CustomerClient>(
                  this, METHODID_GET_CUSTOMER_CLIENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage customer clients in a manager hierarchy.
   * </pre>
   */
  public static final class CustomerClientServiceStub extends io.grpc.stub.AbstractStub<CustomerClientServiceStub> {
    private CustomerClientServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerClientServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerClientServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerClientServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer client in full detail.
     * </pre>
     */
    public void getCustomerClient(com.google.ads.googleads.v0.services.GetCustomerClientRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CustomerClient> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerClientMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage customer clients in a manager hierarchy.
   * </pre>
   */
  public static final class CustomerClientServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerClientServiceBlockingStub> {
    private CustomerClientServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerClientServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerClientServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerClientServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer client in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v0.resources.CustomerClient getCustomerClient(com.google.ads.googleads.v0.services.GetCustomerClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerClientMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage customer clients in a manager hierarchy.
   * </pre>
   */
  public static final class CustomerClientServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerClientServiceFutureStub> {
    private CustomerClientServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerClientServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerClientServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerClientServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer client in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.resources.CustomerClient> getCustomerClient(
        com.google.ads.googleads.v0.services.GetCustomerClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerClientMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER_CLIENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerClientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerClientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER_CLIENT:
          serviceImpl.getCustomerClient((com.google.ads.googleads.v0.services.GetCustomerClientRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CustomerClient>) responseObserver);
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

  private static abstract class CustomerClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.CustomerClientServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerClientService");
    }
  }

  private static final class CustomerClientServiceFileDescriptorSupplier
      extends CustomerClientServiceBaseDescriptorSupplier {
    CustomerClientServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerClientServiceMethodDescriptorSupplier
      extends CustomerClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerClientServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerClientServiceFileDescriptorSupplier())
              .addMethod(getGetCustomerClientMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
