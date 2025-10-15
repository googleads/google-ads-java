package com.google.ads.googleads.v22.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage customer conversion goal.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v22/services/customer_conversion_goal_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerConversionGoalServiceGrpc {

  private CustomerConversionGoalServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v22.services.CustomerConversionGoalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsRequest,
      com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsResponse> getMutateCustomerConversionGoalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerConversionGoals",
      requestType = com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsRequest.class,
      responseType = com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsRequest,
      com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsResponse> getMutateCustomerConversionGoalsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsRequest, com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsResponse> getMutateCustomerConversionGoalsMethod;
    if ((getMutateCustomerConversionGoalsMethod = CustomerConversionGoalServiceGrpc.getMutateCustomerConversionGoalsMethod) == null) {
      synchronized (CustomerConversionGoalServiceGrpc.class) {
        if ((getMutateCustomerConversionGoalsMethod = CustomerConversionGoalServiceGrpc.getMutateCustomerConversionGoalsMethod) == null) {
          CustomerConversionGoalServiceGrpc.getMutateCustomerConversionGoalsMethod = getMutateCustomerConversionGoalsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsRequest, com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerConversionGoals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerConversionGoalServiceMethodDescriptorSupplier("MutateCustomerConversionGoals"))
              .build();
        }
      }
    }
    return getMutateCustomerConversionGoalsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerConversionGoalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerConversionGoalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerConversionGoalServiceStub>() {
        @java.lang.Override
        public CustomerConversionGoalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerConversionGoalServiceStub(channel, callOptions);
        }
      };
    return CustomerConversionGoalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CustomerConversionGoalServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerConversionGoalServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerConversionGoalServiceBlockingV2Stub>() {
        @java.lang.Override
        public CustomerConversionGoalServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerConversionGoalServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CustomerConversionGoalServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerConversionGoalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerConversionGoalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerConversionGoalServiceBlockingStub>() {
        @java.lang.Override
        public CustomerConversionGoalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerConversionGoalServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerConversionGoalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerConversionGoalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerConversionGoalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerConversionGoalServiceFutureStub>() {
        @java.lang.Override
        public CustomerConversionGoalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerConversionGoalServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerConversionGoalServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage customer conversion goal.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates or removes customer conversion goals. Operation statuses
     * are returned.
     * </pre>
     */
    default void mutateCustomerConversionGoals(com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerConversionGoalsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerConversionGoalService.
   * <pre>
   * Service to manage customer conversion goal.
   * </pre>
   */
  public static abstract class CustomerConversionGoalServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerConversionGoalServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerConversionGoalService.
   * <pre>
   * Service to manage customer conversion goal.
   * </pre>
   */
  public static final class CustomerConversionGoalServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerConversionGoalServiceStub> {
    private CustomerConversionGoalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerConversionGoalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerConversionGoalServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes customer conversion goals. Operation statuses
     * are returned.
     * </pre>
     */
    public void mutateCustomerConversionGoals(com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerConversionGoalsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerConversionGoalService.
   * <pre>
   * Service to manage customer conversion goal.
   * </pre>
   */
  public static final class CustomerConversionGoalServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CustomerConversionGoalServiceBlockingV2Stub> {
    private CustomerConversionGoalServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerConversionGoalServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerConversionGoalServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes customer conversion goals. Operation statuses
     * are returned.
     * </pre>
     */
    public com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsResponse mutateCustomerConversionGoals(com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerConversionGoalsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CustomerConversionGoalService.
   * <pre>
   * Service to manage customer conversion goal.
   * </pre>
   */
  public static final class CustomerConversionGoalServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerConversionGoalServiceBlockingStub> {
    private CustomerConversionGoalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerConversionGoalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerConversionGoalServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes customer conversion goals. Operation statuses
     * are returned.
     * </pre>
     */
    public com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsResponse mutateCustomerConversionGoals(com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerConversionGoalsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerConversionGoalService.
   * <pre>
   * Service to manage customer conversion goal.
   * </pre>
   */
  public static final class CustomerConversionGoalServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerConversionGoalServiceFutureStub> {
    private CustomerConversionGoalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerConversionGoalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerConversionGoalServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes customer conversion goals. Operation statuses
     * are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsResponse> mutateCustomerConversionGoals(
        com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerConversionGoalsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOMER_CONVERSION_GOALS = 0;

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
        case METHODID_MUTATE_CUSTOMER_CONVERSION_GOALS:
          serviceImpl.mutateCustomerConversionGoals((com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsResponse>) responseObserver);
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
          getMutateCustomerConversionGoalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsRequest,
              com.google.ads.googleads.v22.services.MutateCustomerConversionGoalsResponse>(
                service, METHODID_MUTATE_CUSTOMER_CONVERSION_GOALS)))
        .build();
  }

  private static abstract class CustomerConversionGoalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerConversionGoalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v22.services.CustomerConversionGoalServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerConversionGoalService");
    }
  }

  private static final class CustomerConversionGoalServiceFileDescriptorSupplier
      extends CustomerConversionGoalServiceBaseDescriptorSupplier {
    CustomerConversionGoalServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerConversionGoalServiceMethodDescriptorSupplier
      extends CustomerConversionGoalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CustomerConversionGoalServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CustomerConversionGoalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerConversionGoalServiceFileDescriptorSupplier())
              .addMethod(getMutateCustomerConversionGoalsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
