package com.google.ads.googleads.v21.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage CustomerSkAdNetworkConversionValueSchema.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v21/services/customer_sk_ad_network_conversion_value_schema_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerSkAdNetworkConversionValueSchemaServiceGrpc {

  private CustomerSkAdNetworkConversionValueSchemaServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v21.services.CustomerSkAdNetworkConversionValueSchemaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaRequest,
      com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaResponse> getMutateCustomerSkAdNetworkConversionValueSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerSkAdNetworkConversionValueSchema",
      requestType = com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaRequest.class,
      responseType = com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaRequest,
      com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaResponse> getMutateCustomerSkAdNetworkConversionValueSchemaMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaRequest, com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaResponse> getMutateCustomerSkAdNetworkConversionValueSchemaMethod;
    if ((getMutateCustomerSkAdNetworkConversionValueSchemaMethod = CustomerSkAdNetworkConversionValueSchemaServiceGrpc.getMutateCustomerSkAdNetworkConversionValueSchemaMethod) == null) {
      synchronized (CustomerSkAdNetworkConversionValueSchemaServiceGrpc.class) {
        if ((getMutateCustomerSkAdNetworkConversionValueSchemaMethod = CustomerSkAdNetworkConversionValueSchemaServiceGrpc.getMutateCustomerSkAdNetworkConversionValueSchemaMethod) == null) {
          CustomerSkAdNetworkConversionValueSchemaServiceGrpc.getMutateCustomerSkAdNetworkConversionValueSchemaMethod = getMutateCustomerSkAdNetworkConversionValueSchemaMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaRequest, com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerSkAdNetworkConversionValueSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerSkAdNetworkConversionValueSchemaServiceMethodDescriptorSupplier("MutateCustomerSkAdNetworkConversionValueSchema"))
              .build();
        }
      }
    }
    return getMutateCustomerSkAdNetworkConversionValueSchemaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerSkAdNetworkConversionValueSchemaServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerSkAdNetworkConversionValueSchemaServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerSkAdNetworkConversionValueSchemaServiceStub>() {
        @java.lang.Override
        public CustomerSkAdNetworkConversionValueSchemaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerSkAdNetworkConversionValueSchemaServiceStub(channel, callOptions);
        }
      };
    return CustomerSkAdNetworkConversionValueSchemaServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CustomerSkAdNetworkConversionValueSchemaServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerSkAdNetworkConversionValueSchemaServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerSkAdNetworkConversionValueSchemaServiceBlockingV2Stub>() {
        @java.lang.Override
        public CustomerSkAdNetworkConversionValueSchemaServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerSkAdNetworkConversionValueSchemaServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CustomerSkAdNetworkConversionValueSchemaServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerSkAdNetworkConversionValueSchemaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerSkAdNetworkConversionValueSchemaServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerSkAdNetworkConversionValueSchemaServiceBlockingStub>() {
        @java.lang.Override
        public CustomerSkAdNetworkConversionValueSchemaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerSkAdNetworkConversionValueSchemaServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerSkAdNetworkConversionValueSchemaServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerSkAdNetworkConversionValueSchemaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerSkAdNetworkConversionValueSchemaServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerSkAdNetworkConversionValueSchemaServiceFutureStub>() {
        @java.lang.Override
        public CustomerSkAdNetworkConversionValueSchemaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerSkAdNetworkConversionValueSchemaServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerSkAdNetworkConversionValueSchemaServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage CustomerSkAdNetworkConversionValueSchema.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates or updates the CustomerSkAdNetworkConversionValueSchema.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [InternalError]()
     *   [MutateError]()
     * </pre>
     */
    default void mutateCustomerSkAdNetworkConversionValueSchema(com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerSkAdNetworkConversionValueSchemaMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerSkAdNetworkConversionValueSchemaService.
   * <pre>
   * Service to manage CustomerSkAdNetworkConversionValueSchema.
   * </pre>
   */
  public static abstract class CustomerSkAdNetworkConversionValueSchemaServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerSkAdNetworkConversionValueSchemaServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerSkAdNetworkConversionValueSchemaService.
   * <pre>
   * Service to manage CustomerSkAdNetworkConversionValueSchema.
   * </pre>
   */
  public static final class CustomerSkAdNetworkConversionValueSchemaServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerSkAdNetworkConversionValueSchemaServiceStub> {
    private CustomerSkAdNetworkConversionValueSchemaServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerSkAdNetworkConversionValueSchemaServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerSkAdNetworkConversionValueSchemaServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or updates the CustomerSkAdNetworkConversionValueSchema.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [InternalError]()
     *   [MutateError]()
     * </pre>
     */
    public void mutateCustomerSkAdNetworkConversionValueSchema(com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerSkAdNetworkConversionValueSchemaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerSkAdNetworkConversionValueSchemaService.
   * <pre>
   * Service to manage CustomerSkAdNetworkConversionValueSchema.
   * </pre>
   */
  public static final class CustomerSkAdNetworkConversionValueSchemaServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CustomerSkAdNetworkConversionValueSchemaServiceBlockingV2Stub> {
    private CustomerSkAdNetworkConversionValueSchemaServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerSkAdNetworkConversionValueSchemaServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerSkAdNetworkConversionValueSchemaServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or updates the CustomerSkAdNetworkConversionValueSchema.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [InternalError]()
     *   [MutateError]()
     * </pre>
     */
    public com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaResponse mutateCustomerSkAdNetworkConversionValueSchema(com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerSkAdNetworkConversionValueSchemaMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CustomerSkAdNetworkConversionValueSchemaService.
   * <pre>
   * Service to manage CustomerSkAdNetworkConversionValueSchema.
   * </pre>
   */
  public static final class CustomerSkAdNetworkConversionValueSchemaServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerSkAdNetworkConversionValueSchemaServiceBlockingStub> {
    private CustomerSkAdNetworkConversionValueSchemaServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerSkAdNetworkConversionValueSchemaServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerSkAdNetworkConversionValueSchemaServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or updates the CustomerSkAdNetworkConversionValueSchema.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [InternalError]()
     *   [MutateError]()
     * </pre>
     */
    public com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaResponse mutateCustomerSkAdNetworkConversionValueSchema(com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerSkAdNetworkConversionValueSchemaMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerSkAdNetworkConversionValueSchemaService.
   * <pre>
   * Service to manage CustomerSkAdNetworkConversionValueSchema.
   * </pre>
   */
  public static final class CustomerSkAdNetworkConversionValueSchemaServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerSkAdNetworkConversionValueSchemaServiceFutureStub> {
    private CustomerSkAdNetworkConversionValueSchemaServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerSkAdNetworkConversionValueSchemaServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerSkAdNetworkConversionValueSchemaServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or updates the CustomerSkAdNetworkConversionValueSchema.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [FieldError]()
     *   [InternalError]()
     *   [MutateError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaResponse> mutateCustomerSkAdNetworkConversionValueSchema(
        com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerSkAdNetworkConversionValueSchemaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOMER_SK_AD_NETWORK_CONVERSION_VALUE_SCHEMA = 0;

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
        case METHODID_MUTATE_CUSTOMER_SK_AD_NETWORK_CONVERSION_VALUE_SCHEMA:
          serviceImpl.mutateCustomerSkAdNetworkConversionValueSchema((com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaResponse>) responseObserver);
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
          getMutateCustomerSkAdNetworkConversionValueSchemaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaRequest,
              com.google.ads.googleads.v21.services.MutateCustomerSkAdNetworkConversionValueSchemaResponse>(
                service, METHODID_MUTATE_CUSTOMER_SK_AD_NETWORK_CONVERSION_VALUE_SCHEMA)))
        .build();
  }

  private static abstract class CustomerSkAdNetworkConversionValueSchemaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerSkAdNetworkConversionValueSchemaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v21.services.CustomerSkAdNetworkConversionValueSchemaServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerSkAdNetworkConversionValueSchemaService");
    }
  }

  private static final class CustomerSkAdNetworkConversionValueSchemaServiceFileDescriptorSupplier
      extends CustomerSkAdNetworkConversionValueSchemaServiceBaseDescriptorSupplier {
    CustomerSkAdNetworkConversionValueSchemaServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerSkAdNetworkConversionValueSchemaServiceMethodDescriptorSupplier
      extends CustomerSkAdNetworkConversionValueSchemaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CustomerSkAdNetworkConversionValueSchemaServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CustomerSkAdNetworkConversionValueSchemaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerSkAdNetworkConversionValueSchemaServiceFileDescriptorSupplier())
              .addMethod(getMutateCustomerSkAdNetworkConversionValueSchemaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
