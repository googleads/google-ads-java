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
 * Service to manage customers.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/customer_service.proto")
public final class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.CustomerService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCustomerMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetCustomerRequest,
      com.google.ads.googleads.v3.resources.Customer> METHOD_GET_CUSTOMER = getGetCustomerMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetCustomerRequest,
      com.google.ads.googleads.v3.resources.Customer> getGetCustomerMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetCustomerRequest,
      com.google.ads.googleads.v3.resources.Customer> getGetCustomerMethod() {
    return getGetCustomerMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetCustomerRequest,
      com.google.ads.googleads.v3.resources.Customer> getGetCustomerMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetCustomerRequest, com.google.ads.googleads.v3.resources.Customer> getGetCustomerMethod;
    if ((getGetCustomerMethod = CustomerServiceGrpc.getGetCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCustomerMethod = CustomerServiceGrpc.getGetCustomerMethod) == null) {
          CustomerServiceGrpc.getGetCustomerMethod = getGetCustomerMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetCustomerRequest, com.google.ads.googleads.v3.resources.Customer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.CustomerService", "GetCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.Customer.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("GetCustomer"))
                  .build();
          }
        }
     }
     return getGetCustomerMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateCustomerMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateCustomerRequest,
      com.google.ads.googleads.v3.services.MutateCustomerResponse> METHOD_MUTATE_CUSTOMER = getMutateCustomerMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateCustomerRequest,
      com.google.ads.googleads.v3.services.MutateCustomerResponse> getMutateCustomerMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateCustomerRequest,
      com.google.ads.googleads.v3.services.MutateCustomerResponse> getMutateCustomerMethod() {
    return getMutateCustomerMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateCustomerRequest,
      com.google.ads.googleads.v3.services.MutateCustomerResponse> getMutateCustomerMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateCustomerRequest, com.google.ads.googleads.v3.services.MutateCustomerResponse> getMutateCustomerMethod;
    if ((getMutateCustomerMethod = CustomerServiceGrpc.getMutateCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getMutateCustomerMethod = CustomerServiceGrpc.getMutateCustomerMethod) == null) {
          CustomerServiceGrpc.getMutateCustomerMethod = getMutateCustomerMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.MutateCustomerRequest, com.google.ads.googleads.v3.services.MutateCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.CustomerService", "MutateCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateCustomerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("MutateCustomer"))
                  .build();
          }
        }
     }
     return getMutateCustomerMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListAccessibleCustomersMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListAccessibleCustomersRequest,
      com.google.ads.googleads.v3.services.ListAccessibleCustomersResponse> METHOD_LIST_ACCESSIBLE_CUSTOMERS = getListAccessibleCustomersMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListAccessibleCustomersRequest,
      com.google.ads.googleads.v3.services.ListAccessibleCustomersResponse> getListAccessibleCustomersMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListAccessibleCustomersRequest,
      com.google.ads.googleads.v3.services.ListAccessibleCustomersResponse> getListAccessibleCustomersMethod() {
    return getListAccessibleCustomersMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListAccessibleCustomersRequest,
      com.google.ads.googleads.v3.services.ListAccessibleCustomersResponse> getListAccessibleCustomersMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.ListAccessibleCustomersRequest, com.google.ads.googleads.v3.services.ListAccessibleCustomersResponse> getListAccessibleCustomersMethod;
    if ((getListAccessibleCustomersMethod = CustomerServiceGrpc.getListAccessibleCustomersMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getListAccessibleCustomersMethod = CustomerServiceGrpc.getListAccessibleCustomersMethod) == null) {
          CustomerServiceGrpc.getListAccessibleCustomersMethod = getListAccessibleCustomersMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.ListAccessibleCustomersRequest, com.google.ads.googleads.v3.services.ListAccessibleCustomersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.CustomerService", "ListAccessibleCustomers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.ListAccessibleCustomersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.ListAccessibleCustomersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("ListAccessibleCustomers"))
                  .build();
          }
        }
     }
     return getListAccessibleCustomersMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateCustomerClientMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.CreateCustomerClientRequest,
      com.google.ads.googleads.v3.services.CreateCustomerClientResponse> METHOD_CREATE_CUSTOMER_CLIENT = getCreateCustomerClientMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.CreateCustomerClientRequest,
      com.google.ads.googleads.v3.services.CreateCustomerClientResponse> getCreateCustomerClientMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.CreateCustomerClientRequest,
      com.google.ads.googleads.v3.services.CreateCustomerClientResponse> getCreateCustomerClientMethod() {
    return getCreateCustomerClientMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.CreateCustomerClientRequest,
      com.google.ads.googleads.v3.services.CreateCustomerClientResponse> getCreateCustomerClientMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.CreateCustomerClientRequest, com.google.ads.googleads.v3.services.CreateCustomerClientResponse> getCreateCustomerClientMethod;
    if ((getCreateCustomerClientMethod = CustomerServiceGrpc.getCreateCustomerClientMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getCreateCustomerClientMethod = CustomerServiceGrpc.getCreateCustomerClientMethod) == null) {
          CustomerServiceGrpc.getCreateCustomerClientMethod = getCreateCustomerClientMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.CreateCustomerClientRequest, com.google.ads.googleads.v3.services.CreateCustomerClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.CustomerService", "CreateCustomerClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.CreateCustomerClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.CreateCustomerClientResponse.getDefaultInstance()))
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
    public void getCustomer(com.google.ads.googleads.v3.services.GetCustomerRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.Customer> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Updates a customer. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomer(com.google.ads.googleads.v3.services.MutateCustomerRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCustomerMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Returns resource names of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     */
    public void listAccessibleCustomers(com.google.ads.googleads.v3.services.ListAccessibleCustomersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.ListAccessibleCustomersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAccessibleCustomersMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new client under manager. The new client customer is returned.
     * </pre>
     */
    public void createCustomerClient(com.google.ads.googleads.v3.services.CreateCustomerClientRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.CreateCustomerClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCustomerClientMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetCustomerRequest,
                com.google.ads.googleads.v3.resources.Customer>(
                  this, METHODID_GET_CUSTOMER)))
          .addMethod(
            getMutateCustomerMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.MutateCustomerRequest,
                com.google.ads.googleads.v3.services.MutateCustomerResponse>(
                  this, METHODID_MUTATE_CUSTOMER)))
          .addMethod(
            getListAccessibleCustomersMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.ListAccessibleCustomersRequest,
                com.google.ads.googleads.v3.services.ListAccessibleCustomersResponse>(
                  this, METHODID_LIST_ACCESSIBLE_CUSTOMERS)))
          .addMethod(
            getCreateCustomerClientMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.CreateCustomerClientRequest,
                com.google.ads.googleads.v3.services.CreateCustomerClientResponse>(
                  this, METHODID_CREATE_CUSTOMER_CLIENT)))
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
    public void getCustomer(com.google.ads.googleads.v3.services.GetCustomerRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.Customer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a customer. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomer(com.google.ads.googleads.v3.services.MutateCustomerRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCustomerMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns resource names of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     */
    public void listAccessibleCustomers(com.google.ads.googleads.v3.services.ListAccessibleCustomersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.ListAccessibleCustomersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAccessibleCustomersMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new client under manager. The new client customer is returned.
     * </pre>
     */
    public void createCustomerClient(com.google.ads.googleads.v3.services.CreateCustomerClientRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.CreateCustomerClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCustomerClientMethodHelper(), getCallOptions()), request, responseObserver);
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
    public com.google.ads.googleads.v3.resources.Customer getCustomer(com.google.ads.googleads.v3.services.GetCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a customer. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.MutateCustomerResponse mutateCustomer(com.google.ads.googleads.v3.services.MutateCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCustomerMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns resource names of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.ListAccessibleCustomersResponse listAccessibleCustomers(com.google.ads.googleads.v3.services.ListAccessibleCustomersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAccessibleCustomersMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new client under manager. The new client customer is returned.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.CreateCustomerClientResponse createCustomerClient(com.google.ads.googleads.v3.services.CreateCustomerClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCustomerClientMethodHelper(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.Customer> getCustomer(
        com.google.ads.googleads.v3.services.GetCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a customer. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.MutateCustomerResponse> mutateCustomer(
        com.google.ads.googleads.v3.services.MutateCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCustomerMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns resource names of customers directly accessible by the
     * user authenticating the call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.ListAccessibleCustomersResponse> listAccessibleCustomers(
        com.google.ads.googleads.v3.services.ListAccessibleCustomersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAccessibleCustomersMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new client under manager. The new client customer is returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.CreateCustomerClientResponse> createCustomerClient(
        com.google.ads.googleads.v3.services.CreateCustomerClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCustomerClientMethodHelper(), getCallOptions()), request);
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
          serviceImpl.getCustomer((com.google.ads.googleads.v3.services.GetCustomerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.Customer>) responseObserver);
          break;
        case METHODID_MUTATE_CUSTOMER:
          serviceImpl.mutateCustomer((com.google.ads.googleads.v3.services.MutateCustomerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateCustomerResponse>) responseObserver);
          break;
        case METHODID_LIST_ACCESSIBLE_CUSTOMERS:
          serviceImpl.listAccessibleCustomers((com.google.ads.googleads.v3.services.ListAccessibleCustomersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.ListAccessibleCustomersResponse>) responseObserver);
          break;
        case METHODID_CREATE_CUSTOMER_CLIENT:
          serviceImpl.createCustomerClient((com.google.ads.googleads.v3.services.CreateCustomerClientRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.CreateCustomerClientResponse>) responseObserver);
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
      return com.google.ads.googleads.v3.services.CustomerServiceProto.getDescriptor();
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
              .addMethod(getMutateCustomerMethodHelper())
              .addMethod(getListAccessibleCustomersMethodHelper())
              .addMethod(getCreateCustomerClientMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
