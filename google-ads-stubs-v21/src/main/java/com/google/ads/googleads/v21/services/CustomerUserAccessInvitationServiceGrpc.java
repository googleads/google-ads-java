package com.google.ads.googleads.v21.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * This service manages the access invitation extended to users for a given
 * customer.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v21/services/customer_user_access_invitation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerUserAccessInvitationServiceGrpc {

  private CustomerUserAccessInvitationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v21.services.CustomerUserAccessInvitationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationRequest,
      com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationResponse> getMutateCustomerUserAccessInvitationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerUserAccessInvitation",
      requestType = com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationRequest.class,
      responseType = com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationRequest,
      com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationResponse> getMutateCustomerUserAccessInvitationMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationRequest, com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationResponse> getMutateCustomerUserAccessInvitationMethod;
    if ((getMutateCustomerUserAccessInvitationMethod = CustomerUserAccessInvitationServiceGrpc.getMutateCustomerUserAccessInvitationMethod) == null) {
      synchronized (CustomerUserAccessInvitationServiceGrpc.class) {
        if ((getMutateCustomerUserAccessInvitationMethod = CustomerUserAccessInvitationServiceGrpc.getMutateCustomerUserAccessInvitationMethod) == null) {
          CustomerUserAccessInvitationServiceGrpc.getMutateCustomerUserAccessInvitationMethod = getMutateCustomerUserAccessInvitationMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationRequest, com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerUserAccessInvitation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerUserAccessInvitationServiceMethodDescriptorSupplier("MutateCustomerUserAccessInvitation"))
              .build();
        }
      }
    }
    return getMutateCustomerUserAccessInvitationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerUserAccessInvitationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessInvitationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessInvitationServiceStub>() {
        @java.lang.Override
        public CustomerUserAccessInvitationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerUserAccessInvitationServiceStub(channel, callOptions);
        }
      };
    return CustomerUserAccessInvitationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CustomerUserAccessInvitationServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessInvitationServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessInvitationServiceBlockingV2Stub>() {
        @java.lang.Override
        public CustomerUserAccessInvitationServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerUserAccessInvitationServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CustomerUserAccessInvitationServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerUserAccessInvitationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessInvitationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessInvitationServiceBlockingStub>() {
        @java.lang.Override
        public CustomerUserAccessInvitationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerUserAccessInvitationServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerUserAccessInvitationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerUserAccessInvitationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessInvitationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerUserAccessInvitationServiceFutureStub>() {
        @java.lang.Override
        public CustomerUserAccessInvitationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerUserAccessInvitationServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerUserAccessInvitationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service manages the access invitation extended to users for a given
   * customer.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates or removes an access invitation.
     * List of thrown errors:
     *   [AccessInvitationError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void mutateCustomerUserAccessInvitation(com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerUserAccessInvitationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerUserAccessInvitationService.
   * <pre>
   * This service manages the access invitation extended to users for a given
   * customer.
   * </pre>
   */
  public static abstract class CustomerUserAccessInvitationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerUserAccessInvitationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerUserAccessInvitationService.
   * <pre>
   * This service manages the access invitation extended to users for a given
   * customer.
   * </pre>
   */
  public static final class CustomerUserAccessInvitationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerUserAccessInvitationServiceStub> {
    private CustomerUserAccessInvitationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerUserAccessInvitationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerUserAccessInvitationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes an access invitation.
     * List of thrown errors:
     *   [AccessInvitationError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateCustomerUserAccessInvitation(com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerUserAccessInvitationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerUserAccessInvitationService.
   * <pre>
   * This service manages the access invitation extended to users for a given
   * customer.
   * </pre>
   */
  public static final class CustomerUserAccessInvitationServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CustomerUserAccessInvitationServiceBlockingV2Stub> {
    private CustomerUserAccessInvitationServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerUserAccessInvitationServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerUserAccessInvitationServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes an access invitation.
     * List of thrown errors:
     *   [AccessInvitationError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationResponse mutateCustomerUserAccessInvitation(com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerUserAccessInvitationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CustomerUserAccessInvitationService.
   * <pre>
   * This service manages the access invitation extended to users for a given
   * customer.
   * </pre>
   */
  public static final class CustomerUserAccessInvitationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerUserAccessInvitationServiceBlockingStub> {
    private CustomerUserAccessInvitationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerUserAccessInvitationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerUserAccessInvitationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes an access invitation.
     * List of thrown errors:
     *   [AccessInvitationError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationResponse mutateCustomerUserAccessInvitation(com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerUserAccessInvitationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerUserAccessInvitationService.
   * <pre>
   * This service manages the access invitation extended to users for a given
   * customer.
   * </pre>
   */
  public static final class CustomerUserAccessInvitationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerUserAccessInvitationServiceFutureStub> {
    private CustomerUserAccessInvitationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerUserAccessInvitationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerUserAccessInvitationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates or removes an access invitation.
     * List of thrown errors:
     *   [AccessInvitationError]()
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationResponse> mutateCustomerUserAccessInvitation(
        com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerUserAccessInvitationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOMER_USER_ACCESS_INVITATION = 0;

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
        case METHODID_MUTATE_CUSTOMER_USER_ACCESS_INVITATION:
          serviceImpl.mutateCustomerUserAccessInvitation((com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationResponse>) responseObserver);
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
          getMutateCustomerUserAccessInvitationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationRequest,
              com.google.ads.googleads.v21.services.MutateCustomerUserAccessInvitationResponse>(
                service, METHODID_MUTATE_CUSTOMER_USER_ACCESS_INVITATION)))
        .build();
  }

  private static abstract class CustomerUserAccessInvitationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerUserAccessInvitationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v21.services.CustomerUserAccessInvitationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerUserAccessInvitationService");
    }
  }

  private static final class CustomerUserAccessInvitationServiceFileDescriptorSupplier
      extends CustomerUserAccessInvitationServiceBaseDescriptorSupplier {
    CustomerUserAccessInvitationServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerUserAccessInvitationServiceMethodDescriptorSupplier
      extends CustomerUserAccessInvitationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CustomerUserAccessInvitationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CustomerUserAccessInvitationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerUserAccessInvitationServiceFileDescriptorSupplier())
              .addMethod(getMutateCustomerUserAccessInvitationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
