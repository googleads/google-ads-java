package com.google.ads.googleads.v5.services;

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
 * Service to manage customer client links.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v5/services/customer_client_link_service.proto")
public final class CustomerClientLinkServiceGrpc {

  private CustomerClientLinkServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v5.services.CustomerClientLinkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetCustomerClientLinkRequest,
      com.google.ads.googleads.v5.resources.CustomerClientLink> getGetCustomerClientLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerClientLink",
      requestType = com.google.ads.googleads.v5.services.GetCustomerClientLinkRequest.class,
      responseType = com.google.ads.googleads.v5.resources.CustomerClientLink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetCustomerClientLinkRequest,
      com.google.ads.googleads.v5.resources.CustomerClientLink> getGetCustomerClientLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetCustomerClientLinkRequest, com.google.ads.googleads.v5.resources.CustomerClientLink> getGetCustomerClientLinkMethod;
    if ((getGetCustomerClientLinkMethod = CustomerClientLinkServiceGrpc.getGetCustomerClientLinkMethod) == null) {
      synchronized (CustomerClientLinkServiceGrpc.class) {
        if ((getGetCustomerClientLinkMethod = CustomerClientLinkServiceGrpc.getGetCustomerClientLinkMethod) == null) {
          CustomerClientLinkServiceGrpc.getGetCustomerClientLinkMethod = getGetCustomerClientLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.GetCustomerClientLinkRequest, com.google.ads.googleads.v5.resources.CustomerClientLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerClientLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.GetCustomerClientLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.resources.CustomerClientLink.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerClientLinkServiceMethodDescriptorSupplier("GetCustomerClientLink"))
              .build();
        }
      }
    }
    return getGetCustomerClientLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateCustomerClientLinkRequest,
      com.google.ads.googleads.v5.services.MutateCustomerClientLinkResponse> getMutateCustomerClientLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerClientLink",
      requestType = com.google.ads.googleads.v5.services.MutateCustomerClientLinkRequest.class,
      responseType = com.google.ads.googleads.v5.services.MutateCustomerClientLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateCustomerClientLinkRequest,
      com.google.ads.googleads.v5.services.MutateCustomerClientLinkResponse> getMutateCustomerClientLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateCustomerClientLinkRequest, com.google.ads.googleads.v5.services.MutateCustomerClientLinkResponse> getMutateCustomerClientLinkMethod;
    if ((getMutateCustomerClientLinkMethod = CustomerClientLinkServiceGrpc.getMutateCustomerClientLinkMethod) == null) {
      synchronized (CustomerClientLinkServiceGrpc.class) {
        if ((getMutateCustomerClientLinkMethod = CustomerClientLinkServiceGrpc.getMutateCustomerClientLinkMethod) == null) {
          CustomerClientLinkServiceGrpc.getMutateCustomerClientLinkMethod = getMutateCustomerClientLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.MutateCustomerClientLinkRequest, com.google.ads.googleads.v5.services.MutateCustomerClientLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerClientLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.MutateCustomerClientLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.MutateCustomerClientLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerClientLinkServiceMethodDescriptorSupplier("MutateCustomerClientLink"))
              .build();
        }
      }
    }
    return getMutateCustomerClientLinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerClientLinkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerClientLinkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerClientLinkServiceStub>() {
        @java.lang.Override
        public CustomerClientLinkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerClientLinkServiceStub(channel, callOptions);
        }
      };
    return CustomerClientLinkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerClientLinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerClientLinkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerClientLinkServiceBlockingStub>() {
        @java.lang.Override
        public CustomerClientLinkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerClientLinkServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerClientLinkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerClientLinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerClientLinkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerClientLinkServiceFutureStub>() {
        @java.lang.Override
        public CustomerClientLinkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerClientLinkServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerClientLinkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage customer client links.
   * </pre>
   */
  public static abstract class CustomerClientLinkServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested CustomerClientLink in full detail.
     * </pre>
     */
    public void getCustomerClientLink(com.google.ads.googleads.v5.services.GetCustomerClientLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.CustomerClientLink> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerClientLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates or updates a customer client link. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomerClientLink(com.google.ads.googleads.v5.services.MutateCustomerClientLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateCustomerClientLinkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCustomerClientLinkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerClientLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.GetCustomerClientLinkRequest,
                com.google.ads.googleads.v5.resources.CustomerClientLink>(
                  this, METHODID_GET_CUSTOMER_CLIENT_LINK)))
          .addMethod(
            getMutateCustomerClientLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.MutateCustomerClientLinkRequest,
                com.google.ads.googleads.v5.services.MutateCustomerClientLinkResponse>(
                  this, METHODID_MUTATE_CUSTOMER_CLIENT_LINK)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage customer client links.
   * </pre>
   */
  public static final class CustomerClientLinkServiceStub extends io.grpc.stub.AbstractAsyncStub<CustomerClientLinkServiceStub> {
    private CustomerClientLinkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerClientLinkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerClientLinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested CustomerClientLink in full detail.
     * </pre>
     */
    public void getCustomerClientLink(com.google.ads.googleads.v5.services.GetCustomerClientLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.CustomerClientLink> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerClientLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or updates a customer client link. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomerClientLink(com.google.ads.googleads.v5.services.MutateCustomerClientLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateCustomerClientLinkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCustomerClientLinkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage customer client links.
   * </pre>
   */
  public static final class CustomerClientLinkServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CustomerClientLinkServiceBlockingStub> {
    private CustomerClientLinkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerClientLinkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerClientLinkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested CustomerClientLink in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v5.resources.CustomerClientLink getCustomerClientLink(com.google.ads.googleads.v5.services.GetCustomerClientLinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerClientLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or updates a customer client link. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v5.services.MutateCustomerClientLinkResponse mutateCustomerClientLink(com.google.ads.googleads.v5.services.MutateCustomerClientLinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCustomerClientLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage customer client links.
   * </pre>
   */
  public static final class CustomerClientLinkServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CustomerClientLinkServiceFutureStub> {
    private CustomerClientLinkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerClientLinkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerClientLinkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested CustomerClientLink in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.resources.CustomerClientLink> getCustomerClientLink(
        com.google.ads.googleads.v5.services.GetCustomerClientLinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerClientLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or updates a customer client link. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.services.MutateCustomerClientLinkResponse> mutateCustomerClientLink(
        com.google.ads.googleads.v5.services.MutateCustomerClientLinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCustomerClientLinkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER_CLIENT_LINK = 0;
  private static final int METHODID_MUTATE_CUSTOMER_CLIENT_LINK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerClientLinkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerClientLinkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER_CLIENT_LINK:
          serviceImpl.getCustomerClientLink((com.google.ads.googleads.v5.services.GetCustomerClientLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.CustomerClientLink>) responseObserver);
          break;
        case METHODID_MUTATE_CUSTOMER_CLIENT_LINK:
          serviceImpl.mutateCustomerClientLink((com.google.ads.googleads.v5.services.MutateCustomerClientLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateCustomerClientLinkResponse>) responseObserver);
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

  private static abstract class CustomerClientLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerClientLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v5.services.CustomerClientLinkServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerClientLinkService");
    }
  }

  private static final class CustomerClientLinkServiceFileDescriptorSupplier
      extends CustomerClientLinkServiceBaseDescriptorSupplier {
    CustomerClientLinkServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerClientLinkServiceMethodDescriptorSupplier
      extends CustomerClientLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerClientLinkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerClientLinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerClientLinkServiceFileDescriptorSupplier())
              .addMethod(getGetCustomerClientLinkMethod())
              .addMethod(getMutateCustomerClientLinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
