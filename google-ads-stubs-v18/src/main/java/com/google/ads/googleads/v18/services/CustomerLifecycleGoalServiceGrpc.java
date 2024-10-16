package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to configure customer lifecycle goals.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/customer_lifecycle_goal_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerLifecycleGoalServiceGrpc {

  private CustomerLifecycleGoalServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.CustomerLifecycleGoalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsRequest,
      com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsResponse> getConfigureCustomerLifecycleGoalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureCustomerLifecycleGoals",
      requestType = com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsRequest.class,
      responseType = com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsRequest,
      com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsResponse> getConfigureCustomerLifecycleGoalsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsRequest, com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsResponse> getConfigureCustomerLifecycleGoalsMethod;
    if ((getConfigureCustomerLifecycleGoalsMethod = CustomerLifecycleGoalServiceGrpc.getConfigureCustomerLifecycleGoalsMethod) == null) {
      synchronized (CustomerLifecycleGoalServiceGrpc.class) {
        if ((getConfigureCustomerLifecycleGoalsMethod = CustomerLifecycleGoalServiceGrpc.getConfigureCustomerLifecycleGoalsMethod) == null) {
          CustomerLifecycleGoalServiceGrpc.getConfigureCustomerLifecycleGoalsMethod = getConfigureCustomerLifecycleGoalsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsRequest, com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureCustomerLifecycleGoals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerLifecycleGoalServiceMethodDescriptorSupplier("ConfigureCustomerLifecycleGoals"))
              .build();
        }
      }
    }
    return getConfigureCustomerLifecycleGoalsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerLifecycleGoalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerLifecycleGoalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerLifecycleGoalServiceStub>() {
        @java.lang.Override
        public CustomerLifecycleGoalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerLifecycleGoalServiceStub(channel, callOptions);
        }
      };
    return CustomerLifecycleGoalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerLifecycleGoalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerLifecycleGoalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerLifecycleGoalServiceBlockingStub>() {
        @java.lang.Override
        public CustomerLifecycleGoalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerLifecycleGoalServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerLifecycleGoalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerLifecycleGoalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerLifecycleGoalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerLifecycleGoalServiceFutureStub>() {
        @java.lang.Override
        public CustomerLifecycleGoalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerLifecycleGoalServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerLifecycleGoalServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to configure customer lifecycle goals.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Process the given customer lifecycle configurations.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CustomerLifecycleGoalConfigError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void configureCustomerLifecycleGoals(com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfigureCustomerLifecycleGoalsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerLifecycleGoalService.
   * <pre>
   * Service to configure customer lifecycle goals.
   * </pre>
   */
  public static abstract class CustomerLifecycleGoalServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerLifecycleGoalServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerLifecycleGoalService.
   * <pre>
   * Service to configure customer lifecycle goals.
   * </pre>
   */
  public static final class CustomerLifecycleGoalServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerLifecycleGoalServiceStub> {
    private CustomerLifecycleGoalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerLifecycleGoalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerLifecycleGoalServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Process the given customer lifecycle configurations.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CustomerLifecycleGoalConfigError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void configureCustomerLifecycleGoals(com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfigureCustomerLifecycleGoalsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerLifecycleGoalService.
   * <pre>
   * Service to configure customer lifecycle goals.
   * </pre>
   */
  public static final class CustomerLifecycleGoalServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerLifecycleGoalServiceBlockingStub> {
    private CustomerLifecycleGoalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerLifecycleGoalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerLifecycleGoalServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Process the given customer lifecycle configurations.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CustomerLifecycleGoalConfigError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsResponse configureCustomerLifecycleGoals(com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfigureCustomerLifecycleGoalsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerLifecycleGoalService.
   * <pre>
   * Service to configure customer lifecycle goals.
   * </pre>
   */
  public static final class CustomerLifecycleGoalServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerLifecycleGoalServiceFutureStub> {
    private CustomerLifecycleGoalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerLifecycleGoalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerLifecycleGoalServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Process the given customer lifecycle configurations.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CustomerLifecycleGoalConfigError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsResponse> configureCustomerLifecycleGoals(
        com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfigureCustomerLifecycleGoalsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONFIGURE_CUSTOMER_LIFECYCLE_GOALS = 0;

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
        case METHODID_CONFIGURE_CUSTOMER_LIFECYCLE_GOALS:
          serviceImpl.configureCustomerLifecycleGoals((com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsResponse>) responseObserver);
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
          getConfigureCustomerLifecycleGoalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsRequest,
              com.google.ads.googleads.v18.services.ConfigureCustomerLifecycleGoalsResponse>(
                service, METHODID_CONFIGURE_CUSTOMER_LIFECYCLE_GOALS)))
        .build();
  }

  private static abstract class CustomerLifecycleGoalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerLifecycleGoalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.CustomerLifecycleGoalServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerLifecycleGoalService");
    }
  }

  private static final class CustomerLifecycleGoalServiceFileDescriptorSupplier
      extends CustomerLifecycleGoalServiceBaseDescriptorSupplier {
    CustomerLifecycleGoalServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerLifecycleGoalServiceMethodDescriptorSupplier
      extends CustomerLifecycleGoalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CustomerLifecycleGoalServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CustomerLifecycleGoalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerLifecycleGoalServiceFileDescriptorSupplier())
              .addMethod(getConfigureCustomerLifecycleGoalsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
