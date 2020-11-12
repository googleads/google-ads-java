package com.google.ads.googleads.v6.services;

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
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/customer_service.proto")
public final class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.CustomerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCustomerRequest,
      com.google.ads.googleads.v6.resources.Customer> getGetCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomer",
      requestType = com.google.ads.googleads.v6.services.GetCustomerRequest.class,
      responseType = com.google.ads.googleads.v6.resources.Customer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCustomerRequest,
      com.google.ads.googleads.v6.resources.Customer> getGetCustomerMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCustomerRequest, com.google.ads.googleads.v6.resources.Customer> getGetCustomerMethod;
    if ((getGetCustomerMethod = CustomerServiceGrpc.getGetCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCustomerMethod = CustomerServiceGrpc.getGetCustomerMethod) == null) {
          CustomerServiceGrpc.getGetCustomerMethod = getGetCustomerMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetCustomerRequest, com.google.ads.googleads.v6.resources.Customer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.Customer.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("GetCustomer"))
              .build();
        }
      }
    }
    return getGetCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCustomerRequest,
      com.google.ads.googleads.v6.services.MutateCustomerResponse> getMutateCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomer",
      requestType = com.google.ads.googleads.v6.services.MutateCustomerRequest.class,
      responseType = com.google.ads.googleads.v6.services.MutateCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCustomerRequest,
      com.google.ads.googleads.v6.services.MutateCustomerResponse> getMutateCustomerMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCustomerRequest, com.google.ads.googleads.v6.services.MutateCustomerResponse> getMutateCustomerMethod;
    if ((getMutateCustomerMethod = CustomerServiceGrpc.getMutateCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getMutateCustomerMethod = CustomerServiceGrpc.getMutateCustomerMethod) == null) {
          CustomerServiceGrpc.getMutateCustomerMethod = getMutateCustomerMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.MutateCustomerRequest, com.google.ads.googleads.v6.services.MutateCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateCustomerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("MutateCustomer"))
              .build();
        }
      }
    }
    return getMutateCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.ListAccessibleCustomersRequest,
      com.google.ads.googleads.v6.services.ListAccessibleCustomersResponse> getListAccessibleCustomersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessibleCustomers",
      requestType = com.google.ads.googleads.v6.services.ListAccessibleCustomersRequest.class,
      responseType = com.google.ads.googleads.v6.services.ListAccessibleCustomersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.ListAccessibleCustomersRequest,
      com.google.ads.googleads.v6.services.ListAccessibleCustomersResponse> getListAccessibleCustomersMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.ListAccessibleCustomersRequest, com.google.ads.googleads.v6.services.ListAccessibleCustomersResponse> getListAccessibleCustomersMethod;
    if ((getListAccessibleCustomersMethod = CustomerServiceGrpc.getListAccessibleCustomersMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getListAccessibleCustomersMethod = CustomerServiceGrpc.getListAccessibleCustomersMethod) == null) {
          CustomerServiceGrpc.getListAccessibleCustomersMethod = getListAccessibleCustomersMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.ListAccessibleCustomersRequest, com.google.ads.googleads.v6.services.ListAccessibleCustomersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessibleCustomers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.ListAccessibleCustomersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.ListAccessibleCustomersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("ListAccessibleCustomers"))
              .build();
        }
      }
    }
    return getListAccessibleCustomersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.CreateCustomerClientRequest,
      com.google.ads.googleads.v6.services.CreateCustomerClientResponse> getCreateCustomerClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCustomerClient",
      requestType = com.google.ads.googleads.v6.services.CreateCustomerClientRequest.class,
      responseType = com.google.ads.googleads.v6.services.CreateCustomerClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.CreateCustomerClientRequest,
      com.google.ads.googleads.v6.services.CreateCustomerClientResponse> getCreateCustomerClientMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.CreateCustomerClientRequest, com.google.ads.googleads.v6.services.CreateCustomerClientResponse> getCreateCustomerClientMethod;
    if ((getCreateCustomerClientMethod = CustomerServiceGrpc.getCreateCustomerClientMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getCreateCustomerClientMethod = CustomerServiceGrpc.getCreateCustomerClientMethod) == null) {
          CustomerServiceGrpc.getCreateCustomerClientMethod = getCreateCustomerClientMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.CreateCustomerClientRequest, com.google.ads.googleads.v6.services.CreateCustomerClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCustomerClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.CreateCustomerClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.CreateCustomerClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("CreateCustomerClient"))
              .build();
        }
      }
    }
    return getCreateCustomerClientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceStub>() {
        @java.lang.Override
        public CustomerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceStub(channel, callOptions);
        }
      };
    return CustomerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceBlockingStub>() {
        @java.lang.Override
        public CustomerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceFutureStub>() {
        @java.lang.Override
        public CustomerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerServiceFutureStub.newStub(factory, channel);
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
    public void getCustomer(com.google.ads.googleads.v6.services.GetCustomerRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.Customer> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a customer. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomer(com.google.ads.googleads.v6.services.MutateCustomerRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCustomerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns resource names of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     */
    public void listAccessibleCustomers(com.google.ads.googleads.v6.services.ListAccessibleCustomersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.ListAccessibleCustomersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAccessibleCustomersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new client under manager. The new client customer is returned.
     * </pre>
     */
    public void createCustomerClient(com.google.ads.googleads.v6.services.CreateCustomerClientRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.CreateCustomerClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCustomerClientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetCustomerRequest,
                com.google.ads.googleads.v6.resources.Customer>(
                  this, METHODID_GET_CUSTOMER)))
          .addMethod(
            getMutateCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.MutateCustomerRequest,
                com.google.ads.googleads.v6.services.MutateCustomerResponse>(
                  this, METHODID_MUTATE_CUSTOMER)))
          .addMethod(
            getListAccessibleCustomersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.ListAccessibleCustomersRequest,
                com.google.ads.googleads.v6.services.ListAccessibleCustomersResponse>(
                  this, METHODID_LIST_ACCESSIBLE_CUSTOMERS)))
          .addMethod(
            getCreateCustomerClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.CreateCustomerClientRequest,
                com.google.ads.googleads.v6.services.CreateCustomerClientResponse>(
                  this, METHODID_CREATE_CUSTOMER_CLIENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage customers.
   * </pre>
   */
  public static final class CustomerServiceStub extends io.grpc.stub.AbstractAsyncStub<CustomerServiceStub> {
    private CustomerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer in full detail.
     * </pre>
     */
    public void getCustomer(com.google.ads.googleads.v6.services.GetCustomerRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.Customer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a customer. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomer(com.google.ads.googleads.v6.services.MutateCustomerRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns resource names of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     */
    public void listAccessibleCustomers(com.google.ads.googleads.v6.services.ListAccessibleCustomersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.ListAccessibleCustomersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAccessibleCustomersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new client under manager. The new client customer is returned.
     * </pre>
     */
    public void createCustomerClient(com.google.ads.googleads.v6.services.CreateCustomerClientRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.CreateCustomerClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCustomerClientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage customers.
   * </pre>
   */
  public static final class CustomerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CustomerServiceBlockingStub> {
    private CustomerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.Customer getCustomer(com.google.ads.googleads.v6.services.GetCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a customer. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.MutateCustomerResponse mutateCustomer(com.google.ads.googleads.v6.services.MutateCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCustomerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns resource names of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.ListAccessibleCustomersResponse listAccessibleCustomers(com.google.ads.googleads.v6.services.ListAccessibleCustomersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAccessibleCustomersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new client under manager. The new client customer is returned.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.CreateCustomerClientResponse createCustomerClient(com.google.ads.googleads.v6.services.CreateCustomerClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCustomerClientMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage customers.
   * </pre>
   */
  public static final class CustomerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CustomerServiceFutureStub> {
    private CustomerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.Customer> getCustomer(
        com.google.ads.googleads.v6.services.GetCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a customer. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.MutateCustomerResponse> mutateCustomer(
        com.google.ads.googleads.v6.services.MutateCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCustomerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns resource names of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.ListAccessibleCustomersResponse> listAccessibleCustomers(
        com.google.ads.googleads.v6.services.ListAccessibleCustomersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAccessibleCustomersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new client under manager. The new client customer is returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.CreateCustomerClientResponse> createCustomerClient(
        com.google.ads.googleads.v6.services.CreateCustomerClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCustomerClientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER = 0;
  private static final int METHODID_MUTATE_CUSTOMER = 1;
  private static final int METHODID_LIST_ACCESSIBLE_CUSTOMERS = 2;
  private static final int METHODID_CREATE_CUSTOMER_CLIENT = 3;

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
          serviceImpl.getCustomer((com.google.ads.googleads.v6.services.GetCustomerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.Customer>) responseObserver);
          break;
        case METHODID_MUTATE_CUSTOMER:
          serviceImpl.mutateCustomer((com.google.ads.googleads.v6.services.MutateCustomerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCustomerResponse>) responseObserver);
          break;
        case METHODID_LIST_ACCESSIBLE_CUSTOMERS:
          serviceImpl.listAccessibleCustomers((com.google.ads.googleads.v6.services.ListAccessibleCustomersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.ListAccessibleCustomersResponse>) responseObserver);
          break;
        case METHODID_CREATE_CUSTOMER_CLIENT:
          serviceImpl.createCustomerClient((com.google.ads.googleads.v6.services.CreateCustomerClientRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.CreateCustomerClientResponse>) responseObserver);
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
      return com.google.ads.googleads.v6.services.CustomerServiceProto.getDescriptor();
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
              .addMethod(getGetCustomerMethod())
              .addMethod(getMutateCustomerMethod())
              .addMethod(getListAccessibleCustomersMethod())
              .addMethod(getCreateCustomerClientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
