package com.google.ads.googleads.v1.services;

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
 * Service to manage customer-manager links.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v1/services/customer_manager_link_service.proto")
public final class CustomerManagerLinkServiceGrpc {

  private CustomerManagerLinkServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v1.services.CustomerManagerLinkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetCustomerManagerLinkRequest,
      com.google.ads.googleads.v1.resources.CustomerManagerLink> getGetCustomerManagerLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerManagerLink",
      requestType = com.google.ads.googleads.v1.services.GetCustomerManagerLinkRequest.class,
      responseType = com.google.ads.googleads.v1.resources.CustomerManagerLink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetCustomerManagerLinkRequest,
      com.google.ads.googleads.v1.resources.CustomerManagerLink> getGetCustomerManagerLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.GetCustomerManagerLinkRequest, com.google.ads.googleads.v1.resources.CustomerManagerLink> getGetCustomerManagerLinkMethod;
    if ((getGetCustomerManagerLinkMethod = CustomerManagerLinkServiceGrpc.getGetCustomerManagerLinkMethod) == null) {
      synchronized (CustomerManagerLinkServiceGrpc.class) {
        if ((getGetCustomerManagerLinkMethod = CustomerManagerLinkServiceGrpc.getGetCustomerManagerLinkMethod) == null) {
          CustomerManagerLinkServiceGrpc.getGetCustomerManagerLinkMethod = getGetCustomerManagerLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.GetCustomerManagerLinkRequest, com.google.ads.googleads.v1.resources.CustomerManagerLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerManagerLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.GetCustomerManagerLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.resources.CustomerManagerLink.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerManagerLinkServiceMethodDescriptorSupplier("GetCustomerManagerLink"))
              .build();
        }
      }
    }
    return getGetCustomerManagerLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateCustomerManagerLinkRequest,
      com.google.ads.googleads.v1.services.MutateCustomerManagerLinkResponse> getMutateCustomerManagerLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerManagerLink",
      requestType = com.google.ads.googleads.v1.services.MutateCustomerManagerLinkRequest.class,
      responseType = com.google.ads.googleads.v1.services.MutateCustomerManagerLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateCustomerManagerLinkRequest,
      com.google.ads.googleads.v1.services.MutateCustomerManagerLinkResponse> getMutateCustomerManagerLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v1.services.MutateCustomerManagerLinkRequest, com.google.ads.googleads.v1.services.MutateCustomerManagerLinkResponse> getMutateCustomerManagerLinkMethod;
    if ((getMutateCustomerManagerLinkMethod = CustomerManagerLinkServiceGrpc.getMutateCustomerManagerLinkMethod) == null) {
      synchronized (CustomerManagerLinkServiceGrpc.class) {
        if ((getMutateCustomerManagerLinkMethod = CustomerManagerLinkServiceGrpc.getMutateCustomerManagerLinkMethod) == null) {
          CustomerManagerLinkServiceGrpc.getMutateCustomerManagerLinkMethod = getMutateCustomerManagerLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v1.services.MutateCustomerManagerLinkRequest, com.google.ads.googleads.v1.services.MutateCustomerManagerLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerManagerLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateCustomerManagerLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v1.services.MutateCustomerManagerLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerManagerLinkServiceMethodDescriptorSupplier("MutateCustomerManagerLink"))
              .build();
        }
      }
    }
    return getMutateCustomerManagerLinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerManagerLinkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerManagerLinkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerManagerLinkServiceStub>() {
        @java.lang.Override
        public CustomerManagerLinkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerManagerLinkServiceStub(channel, callOptions);
        }
      };
    return CustomerManagerLinkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerManagerLinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerManagerLinkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerManagerLinkServiceBlockingStub>() {
        @java.lang.Override
        public CustomerManagerLinkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerManagerLinkServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerManagerLinkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerManagerLinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerManagerLinkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerManagerLinkServiceFutureStub>() {
        @java.lang.Override
        public CustomerManagerLinkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerManagerLinkServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerManagerLinkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage customer-manager links.
   * </pre>
   */
  public static abstract class CustomerManagerLinkServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested CustomerManagerLink in full detail.
     * </pre>
     */
    public void getCustomerManagerLink(com.google.ads.googleads.v1.services.GetCustomerManagerLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.CustomerManagerLink> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerManagerLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates or updates customer manager links. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomerManagerLink(com.google.ads.googleads.v1.services.MutateCustomerManagerLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateCustomerManagerLinkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCustomerManagerLinkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerManagerLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.GetCustomerManagerLinkRequest,
                com.google.ads.googleads.v1.resources.CustomerManagerLink>(
                  this, METHODID_GET_CUSTOMER_MANAGER_LINK)))
          .addMethod(
            getMutateCustomerManagerLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v1.services.MutateCustomerManagerLinkRequest,
                com.google.ads.googleads.v1.services.MutateCustomerManagerLinkResponse>(
                  this, METHODID_MUTATE_CUSTOMER_MANAGER_LINK)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage customer-manager links.
   * </pre>
   */
  public static final class CustomerManagerLinkServiceStub extends io.grpc.stub.AbstractAsyncStub<CustomerManagerLinkServiceStub> {
    private CustomerManagerLinkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerManagerLinkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerManagerLinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested CustomerManagerLink in full detail.
     * </pre>
     */
    public void getCustomerManagerLink(com.google.ads.googleads.v1.services.GetCustomerManagerLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.CustomerManagerLink> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerManagerLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or updates customer manager links. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomerManagerLink(com.google.ads.googleads.v1.services.MutateCustomerManagerLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateCustomerManagerLinkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCustomerManagerLinkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage customer-manager links.
   * </pre>
   */
  public static final class CustomerManagerLinkServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CustomerManagerLinkServiceBlockingStub> {
    private CustomerManagerLinkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerManagerLinkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerManagerLinkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested CustomerManagerLink in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v1.resources.CustomerManagerLink getCustomerManagerLink(com.google.ads.googleads.v1.services.GetCustomerManagerLinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerManagerLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or updates customer manager links. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v1.services.MutateCustomerManagerLinkResponse mutateCustomerManagerLink(com.google.ads.googleads.v1.services.MutateCustomerManagerLinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCustomerManagerLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage customer-manager links.
   * </pre>
   */
  public static final class CustomerManagerLinkServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CustomerManagerLinkServiceFutureStub> {
    private CustomerManagerLinkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerManagerLinkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerManagerLinkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested CustomerManagerLink in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.resources.CustomerManagerLink> getCustomerManagerLink(
        com.google.ads.googleads.v1.services.GetCustomerManagerLinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerManagerLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or updates customer manager links. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v1.services.MutateCustomerManagerLinkResponse> mutateCustomerManagerLink(
        com.google.ads.googleads.v1.services.MutateCustomerManagerLinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCustomerManagerLinkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER_MANAGER_LINK = 0;
  private static final int METHODID_MUTATE_CUSTOMER_MANAGER_LINK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerManagerLinkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerManagerLinkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER_MANAGER_LINK:
          serviceImpl.getCustomerManagerLink((com.google.ads.googleads.v1.services.GetCustomerManagerLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.resources.CustomerManagerLink>) responseObserver);
          break;
        case METHODID_MUTATE_CUSTOMER_MANAGER_LINK:
          serviceImpl.mutateCustomerManagerLink((com.google.ads.googleads.v1.services.MutateCustomerManagerLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v1.services.MutateCustomerManagerLinkResponse>) responseObserver);
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

  private static abstract class CustomerManagerLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerManagerLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v1.services.CustomerManagerLinkServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerManagerLinkService");
    }
  }

  private static final class CustomerManagerLinkServiceFileDescriptorSupplier
      extends CustomerManagerLinkServiceBaseDescriptorSupplier {
    CustomerManagerLinkServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerManagerLinkServiceMethodDescriptorSupplier
      extends CustomerManagerLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerManagerLinkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerManagerLinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerManagerLinkServiceFileDescriptorSupplier())
              .addMethod(getGetCustomerManagerLinkMethod())
              .addMethod(getMutateCustomerManagerLinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
