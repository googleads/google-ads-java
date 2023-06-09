package com.google.ads.googleads.v12.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage customer client links.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v12/services/customer_client_link_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerClientLinkServiceGrpc {

  private CustomerClientLinkServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v12.services.CustomerClientLinkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateCustomerClientLinkRequest,
      com.google.ads.googleads.v12.services.MutateCustomerClientLinkResponse> getMutateCustomerClientLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerClientLink",
      requestType = com.google.ads.googleads.v12.services.MutateCustomerClientLinkRequest.class,
      responseType = com.google.ads.googleads.v12.services.MutateCustomerClientLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateCustomerClientLinkRequest,
      com.google.ads.googleads.v12.services.MutateCustomerClientLinkResponse> getMutateCustomerClientLinkMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateCustomerClientLinkRequest, com.google.ads.googleads.v12.services.MutateCustomerClientLinkResponse> getMutateCustomerClientLinkMethod;
    if ((getMutateCustomerClientLinkMethod = CustomerClientLinkServiceGrpc.getMutateCustomerClientLinkMethod) == null) {
      synchronized (CustomerClientLinkServiceGrpc.class) {
        if ((getMutateCustomerClientLinkMethod = CustomerClientLinkServiceGrpc.getMutateCustomerClientLinkMethod) == null) {
          CustomerClientLinkServiceGrpc.getMutateCustomerClientLinkMethod = getMutateCustomerClientLinkMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v12.services.MutateCustomerClientLinkRequest, com.google.ads.googleads.v12.services.MutateCustomerClientLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerClientLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateCustomerClientLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateCustomerClientLinkResponse.getDefaultInstance()))
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
  public interface AsyncService {

    /**
     * <pre>
     * Creates or updates a customer client link. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [ManagerLinkError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void mutateCustomerClientLink(com.google.ads.googleads.v12.services.MutateCustomerClientLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateCustomerClientLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerClientLinkMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerClientLinkService.
   * <pre>
   * Service to manage customer client links.
   * </pre>
   */
  public static abstract class CustomerClientLinkServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerClientLinkServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerClientLinkService.
   * <pre>
   * Service to manage customer client links.
   * </pre>
   */
  public static final class CustomerClientLinkServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerClientLinkServiceStub> {
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
     * Creates or updates a customer client link. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [ManagerLinkError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateCustomerClientLink(com.google.ads.googleads.v12.services.MutateCustomerClientLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateCustomerClientLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerClientLinkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerClientLinkService.
   * <pre>
   * Service to manage customer client links.
   * </pre>
   */
  public static final class CustomerClientLinkServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerClientLinkServiceBlockingStub> {
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
     * Creates or updates a customer client link. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [ManagerLinkError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v12.services.MutateCustomerClientLinkResponse mutateCustomerClientLink(com.google.ads.googleads.v12.services.MutateCustomerClientLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerClientLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerClientLinkService.
   * <pre>
   * Service to manage customer client links.
   * </pre>
   */
  public static final class CustomerClientLinkServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerClientLinkServiceFutureStub> {
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
     * Creates or updates a customer client link. Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [ManagerLinkError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v12.services.MutateCustomerClientLinkResponse> mutateCustomerClientLink(
        com.google.ads.googleads.v12.services.MutateCustomerClientLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerClientLinkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOMER_CLIENT_LINK = 0;

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
        case METHODID_MUTATE_CUSTOMER_CLIENT_LINK:
          serviceImpl.mutateCustomerClientLink((com.google.ads.googleads.v12.services.MutateCustomerClientLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateCustomerClientLinkResponse>) responseObserver);
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
          getMutateCustomerClientLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v12.services.MutateCustomerClientLinkRequest,
              com.google.ads.googleads.v12.services.MutateCustomerClientLinkResponse>(
                service, METHODID_MUTATE_CUSTOMER_CLIENT_LINK)))
        .build();
  }

  private static abstract class CustomerClientLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerClientLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v12.services.CustomerClientLinkServiceProto.getDescriptor();
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
              .addMethod(getMutateCustomerClientLinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
