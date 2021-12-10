package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage labels on customers.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/customer_label_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerLabelServiceGrpc {

  private CustomerLabelServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.CustomerLabelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCustomerLabelRequest,
      com.google.ads.googleads.v9.resources.CustomerLabel> getGetCustomerLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerLabel",
      requestType = com.google.ads.googleads.v9.services.GetCustomerLabelRequest.class,
      responseType = com.google.ads.googleads.v9.resources.CustomerLabel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCustomerLabelRequest,
      com.google.ads.googleads.v9.resources.CustomerLabel> getGetCustomerLabelMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetCustomerLabelRequest, com.google.ads.googleads.v9.resources.CustomerLabel> getGetCustomerLabelMethod;
    if ((getGetCustomerLabelMethod = CustomerLabelServiceGrpc.getGetCustomerLabelMethod) == null) {
      synchronized (CustomerLabelServiceGrpc.class) {
        if ((getGetCustomerLabelMethod = CustomerLabelServiceGrpc.getGetCustomerLabelMethod) == null) {
          CustomerLabelServiceGrpc.getGetCustomerLabelMethod = getGetCustomerLabelMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetCustomerLabelRequest, com.google.ads.googleads.v9.resources.CustomerLabel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetCustomerLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.CustomerLabel.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerLabelServiceMethodDescriptorSupplier("GetCustomerLabel"))
              .build();
        }
      }
    }
    return getGetCustomerLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCustomerLabelsRequest,
      com.google.ads.googleads.v9.services.MutateCustomerLabelsResponse> getMutateCustomerLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerLabels",
      requestType = com.google.ads.googleads.v9.services.MutateCustomerLabelsRequest.class,
      responseType = com.google.ads.googleads.v9.services.MutateCustomerLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCustomerLabelsRequest,
      com.google.ads.googleads.v9.services.MutateCustomerLabelsResponse> getMutateCustomerLabelsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCustomerLabelsRequest, com.google.ads.googleads.v9.services.MutateCustomerLabelsResponse> getMutateCustomerLabelsMethod;
    if ((getMutateCustomerLabelsMethod = CustomerLabelServiceGrpc.getMutateCustomerLabelsMethod) == null) {
      synchronized (CustomerLabelServiceGrpc.class) {
        if ((getMutateCustomerLabelsMethod = CustomerLabelServiceGrpc.getMutateCustomerLabelsMethod) == null) {
          CustomerLabelServiceGrpc.getMutateCustomerLabelsMethod = getMutateCustomerLabelsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.MutateCustomerLabelsRequest, com.google.ads.googleads.v9.services.MutateCustomerLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateCustomerLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateCustomerLabelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerLabelServiceMethodDescriptorSupplier("MutateCustomerLabels"))
              .build();
        }
      }
    }
    return getMutateCustomerLabelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerLabelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerLabelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerLabelServiceStub>() {
        @java.lang.Override
        public CustomerLabelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerLabelServiceStub(channel, callOptions);
        }
      };
    return CustomerLabelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerLabelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerLabelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerLabelServiceBlockingStub>() {
        @java.lang.Override
        public CustomerLabelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerLabelServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerLabelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerLabelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerLabelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerLabelServiceFutureStub>() {
        @java.lang.Override
        public CustomerLabelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerLabelServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerLabelServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage labels on customers.
   * </pre>
   */
  public static abstract class CustomerLabelServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested customer-label relationship in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCustomerLabel(com.google.ads.googleads.v9.services.GetCustomerLabelRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CustomerLabel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCustomerLabelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates and removes customer-label relationships.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [LabelError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateCustomerLabels(com.google.ads.googleads.v9.services.MutateCustomerLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCustomerLabelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerLabelsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerLabelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetCustomerLabelRequest,
                com.google.ads.googleads.v9.resources.CustomerLabel>(
                  this, METHODID_GET_CUSTOMER_LABEL)))
          .addMethod(
            getMutateCustomerLabelsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.MutateCustomerLabelsRequest,
                com.google.ads.googleads.v9.services.MutateCustomerLabelsResponse>(
                  this, METHODID_MUTATE_CUSTOMER_LABELS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage labels on customers.
   * </pre>
   */
  public static final class CustomerLabelServiceStub extends io.grpc.stub.AbstractAsyncStub<CustomerLabelServiceStub> {
    private CustomerLabelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerLabelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerLabelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer-label relationship in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCustomerLabel(com.google.ads.googleads.v9.services.GetCustomerLabelRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CustomerLabel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCustomerLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates and removes customer-label relationships.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [LabelError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateCustomerLabels(com.google.ads.googleads.v9.services.MutateCustomerLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCustomerLabelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerLabelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage labels on customers.
   * </pre>
   */
  public static final class CustomerLabelServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CustomerLabelServiceBlockingStub> {
    private CustomerLabelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerLabelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerLabelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer-label relationship in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.CustomerLabel getCustomerLabel(com.google.ads.googleads.v9.services.GetCustomerLabelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCustomerLabelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates and removes customer-label relationships.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [LabelError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.services.MutateCustomerLabelsResponse mutateCustomerLabels(com.google.ads.googleads.v9.services.MutateCustomerLabelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerLabelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage labels on customers.
   * </pre>
   */
  public static final class CustomerLabelServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CustomerLabelServiceFutureStub> {
    private CustomerLabelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerLabelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerLabelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested customer-label relationship in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.CustomerLabel> getCustomerLabel(
        com.google.ads.googleads.v9.services.GetCustomerLabelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCustomerLabelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates and removes customer-label relationships.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [LabelError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.MutateCustomerLabelsResponse> mutateCustomerLabels(
        com.google.ads.googleads.v9.services.MutateCustomerLabelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerLabelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER_LABEL = 0;
  private static final int METHODID_MUTATE_CUSTOMER_LABELS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerLabelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerLabelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER_LABEL:
          serviceImpl.getCustomerLabel((com.google.ads.googleads.v9.services.GetCustomerLabelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.CustomerLabel>) responseObserver);
          break;
        case METHODID_MUTATE_CUSTOMER_LABELS:
          serviceImpl.mutateCustomerLabels((com.google.ads.googleads.v9.services.MutateCustomerLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCustomerLabelsResponse>) responseObserver);
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

  private static abstract class CustomerLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerLabelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.CustomerLabelServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerLabelService");
    }
  }

  private static final class CustomerLabelServiceFileDescriptorSupplier
      extends CustomerLabelServiceBaseDescriptorSupplier {
    CustomerLabelServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerLabelServiceMethodDescriptorSupplier
      extends CustomerLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerLabelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerLabelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerLabelServiceFileDescriptorSupplier())
              .addMethod(getGetCustomerLabelMethod())
              .addMethod(getMutateCustomerLabelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
