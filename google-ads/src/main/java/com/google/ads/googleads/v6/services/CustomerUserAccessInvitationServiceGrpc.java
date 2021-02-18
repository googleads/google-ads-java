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
 * This service manages the access invitation extended to users for a given
 * customer.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/customer_user_access_invitation_service.proto")
public final class CustomerUserAccessInvitationServiceGrpc {

  private CustomerUserAccessInvitationServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.CustomerUserAccessInvitationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCustomerUserAccessInvitationRequest,
      com.google.ads.googleads.v6.resources.CustomerUserAccessInvitation> getGetCustomerUserAccessInvitationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerUserAccessInvitation",
      requestType = com.google.ads.googleads.v6.services.GetCustomerUserAccessInvitationRequest.class,
      responseType = com.google.ads.googleads.v6.resources.CustomerUserAccessInvitation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCustomerUserAccessInvitationRequest,
      com.google.ads.googleads.v6.resources.CustomerUserAccessInvitation> getGetCustomerUserAccessInvitationMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCustomerUserAccessInvitationRequest, com.google.ads.googleads.v6.resources.CustomerUserAccessInvitation> getGetCustomerUserAccessInvitationMethod;
    if ((getGetCustomerUserAccessInvitationMethod = CustomerUserAccessInvitationServiceGrpc.getGetCustomerUserAccessInvitationMethod) == null) {
      synchronized (CustomerUserAccessInvitationServiceGrpc.class) {
        if ((getGetCustomerUserAccessInvitationMethod = CustomerUserAccessInvitationServiceGrpc.getGetCustomerUserAccessInvitationMethod) == null) {
          CustomerUserAccessInvitationServiceGrpc.getGetCustomerUserAccessInvitationMethod = getGetCustomerUserAccessInvitationMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetCustomerUserAccessInvitationRequest, com.google.ads.googleads.v6.resources.CustomerUserAccessInvitation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerUserAccessInvitation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetCustomerUserAccessInvitationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.CustomerUserAccessInvitation.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerUserAccessInvitationServiceMethodDescriptorSupplier("GetCustomerUserAccessInvitation"))
              .build();
        }
      }
    }
    return getGetCustomerUserAccessInvitationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationRequest,
      com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationResponse> getMutateCustomerUserAccessInvitationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerUserAccessInvitation",
      requestType = com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationRequest.class,
      responseType = com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationRequest,
      com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationResponse> getMutateCustomerUserAccessInvitationMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationRequest, com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationResponse> getMutateCustomerUserAccessInvitationMethod;
    if ((getMutateCustomerUserAccessInvitationMethod = CustomerUserAccessInvitationServiceGrpc.getMutateCustomerUserAccessInvitationMethod) == null) {
      synchronized (CustomerUserAccessInvitationServiceGrpc.class) {
        if ((getMutateCustomerUserAccessInvitationMethod = CustomerUserAccessInvitationServiceGrpc.getMutateCustomerUserAccessInvitationMethod) == null) {
          CustomerUserAccessInvitationServiceGrpc.getMutateCustomerUserAccessInvitationMethod = getMutateCustomerUserAccessInvitationMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationRequest, com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerUserAccessInvitation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationResponse.getDefaultInstance()))
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
  public static abstract class CustomerUserAccessInvitationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested access invitation in full detail.
     * </pre>
     */
    public void getCustomerUserAccessInvitation(com.google.ads.googleads.v6.services.GetCustomerUserAccessInvitationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.CustomerUserAccessInvitation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerUserAccessInvitationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates or removes an access invitation.
     * </pre>
     */
    public void mutateCustomerUserAccessInvitation(com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCustomerUserAccessInvitationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerUserAccessInvitationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetCustomerUserAccessInvitationRequest,
                com.google.ads.googleads.v6.resources.CustomerUserAccessInvitation>(
                  this, METHODID_GET_CUSTOMER_USER_ACCESS_INVITATION)))
          .addMethod(
            getMutateCustomerUserAccessInvitationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationRequest,
                com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationResponse>(
                  this, METHODID_MUTATE_CUSTOMER_USER_ACCESS_INVITATION)))
          .build();
    }
  }

  /**
   * <pre>
   * This service manages the access invitation extended to users for a given
   * customer.
   * </pre>
   */
  public static final class CustomerUserAccessInvitationServiceStub extends io.grpc.stub.AbstractAsyncStub<CustomerUserAccessInvitationServiceStub> {
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
     * Returns the requested access invitation in full detail.
     * </pre>
     */
    public void getCustomerUserAccessInvitation(com.google.ads.googleads.v6.services.GetCustomerUserAccessInvitationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.CustomerUserAccessInvitation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerUserAccessInvitationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or removes an access invitation.
     * </pre>
     */
    public void mutateCustomerUserAccessInvitation(com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCustomerUserAccessInvitationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This service manages the access invitation extended to users for a given
   * customer.
   * </pre>
   */
  public static final class CustomerUserAccessInvitationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CustomerUserAccessInvitationServiceBlockingStub> {
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
     * Returns the requested access invitation in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.CustomerUserAccessInvitation getCustomerUserAccessInvitation(com.google.ads.googleads.v6.services.GetCustomerUserAccessInvitationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerUserAccessInvitationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or removes an access invitation.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationResponse mutateCustomerUserAccessInvitation(com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCustomerUserAccessInvitationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This service manages the access invitation extended to users for a given
   * customer.
   * </pre>
   */
  public static final class CustomerUserAccessInvitationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CustomerUserAccessInvitationServiceFutureStub> {
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
     * Returns the requested access invitation in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.CustomerUserAccessInvitation> getCustomerUserAccessInvitation(
        com.google.ads.googleads.v6.services.GetCustomerUserAccessInvitationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerUserAccessInvitationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or removes an access invitation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationResponse> mutateCustomerUserAccessInvitation(
        com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCustomerUserAccessInvitationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER_USER_ACCESS_INVITATION = 0;
  private static final int METHODID_MUTATE_CUSTOMER_USER_ACCESS_INVITATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerUserAccessInvitationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerUserAccessInvitationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER_USER_ACCESS_INVITATION:
          serviceImpl.getCustomerUserAccessInvitation((com.google.ads.googleads.v6.services.GetCustomerUserAccessInvitationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.CustomerUserAccessInvitation>) responseObserver);
          break;
        case METHODID_MUTATE_CUSTOMER_USER_ACCESS_INVITATION:
          serviceImpl.mutateCustomerUserAccessInvitation((com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCustomerUserAccessInvitationResponse>) responseObserver);
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

  private static abstract class CustomerUserAccessInvitationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerUserAccessInvitationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.CustomerUserAccessInvitationServiceProto.getDescriptor();
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
    private final String methodName;

    CustomerUserAccessInvitationServiceMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getGetCustomerUserAccessInvitationMethod())
              .addMethod(getMutateCustomerUserAccessInvitationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
