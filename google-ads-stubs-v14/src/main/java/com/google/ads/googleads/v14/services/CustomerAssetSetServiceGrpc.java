package com.google.ads.googleads.v14.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage customer asset set
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v14/services/customer_asset_set_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerAssetSetServiceGrpc {

  private CustomerAssetSetServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v14.services.CustomerAssetSetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateCustomerAssetSetsRequest,
      com.google.ads.googleads.v14.services.MutateCustomerAssetSetsResponse> getMutateCustomerAssetSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerAssetSets",
      requestType = com.google.ads.googleads.v14.services.MutateCustomerAssetSetsRequest.class,
      responseType = com.google.ads.googleads.v14.services.MutateCustomerAssetSetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateCustomerAssetSetsRequest,
      com.google.ads.googleads.v14.services.MutateCustomerAssetSetsResponse> getMutateCustomerAssetSetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateCustomerAssetSetsRequest, com.google.ads.googleads.v14.services.MutateCustomerAssetSetsResponse> getMutateCustomerAssetSetsMethod;
    if ((getMutateCustomerAssetSetsMethod = CustomerAssetSetServiceGrpc.getMutateCustomerAssetSetsMethod) == null) {
      synchronized (CustomerAssetSetServiceGrpc.class) {
        if ((getMutateCustomerAssetSetsMethod = CustomerAssetSetServiceGrpc.getMutateCustomerAssetSetsMethod) == null) {
          CustomerAssetSetServiceGrpc.getMutateCustomerAssetSetsMethod = getMutateCustomerAssetSetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v14.services.MutateCustomerAssetSetsRequest, com.google.ads.googleads.v14.services.MutateCustomerAssetSetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerAssetSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateCustomerAssetSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateCustomerAssetSetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerAssetSetServiceMethodDescriptorSupplier("MutateCustomerAssetSets"))
              .build();
        }
      }
    }
    return getMutateCustomerAssetSetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerAssetSetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerAssetSetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerAssetSetServiceStub>() {
        @java.lang.Override
        public CustomerAssetSetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerAssetSetServiceStub(channel, callOptions);
        }
      };
    return CustomerAssetSetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerAssetSetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerAssetSetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerAssetSetServiceBlockingStub>() {
        @java.lang.Override
        public CustomerAssetSetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerAssetSetServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerAssetSetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerAssetSetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerAssetSetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerAssetSetServiceFutureStub>() {
        @java.lang.Override
        public CustomerAssetSetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerAssetSetServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerAssetSetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage customer asset set
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, or removes customer asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    default void mutateCustomerAssetSets(com.google.ads.googleads.v14.services.MutateCustomerAssetSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateCustomerAssetSetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerAssetSetsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerAssetSetService.
   * <pre>
   * Service to manage customer asset set
   * </pre>
   */
  public static abstract class CustomerAssetSetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerAssetSetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerAssetSetService.
   * <pre>
   * Service to manage customer asset set
   * </pre>
   */
  public static final class CustomerAssetSetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerAssetSetServiceStub> {
    private CustomerAssetSetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerAssetSetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerAssetSetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, or removes customer asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCustomerAssetSets(com.google.ads.googleads.v14.services.MutateCustomerAssetSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateCustomerAssetSetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerAssetSetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerAssetSetService.
   * <pre>
   * Service to manage customer asset set
   * </pre>
   */
  public static final class CustomerAssetSetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerAssetSetServiceBlockingStub> {
    private CustomerAssetSetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerAssetSetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerAssetSetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, or removes customer asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v14.services.MutateCustomerAssetSetsResponse mutateCustomerAssetSets(com.google.ads.googleads.v14.services.MutateCustomerAssetSetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerAssetSetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerAssetSetService.
   * <pre>
   * Service to manage customer asset set
   * </pre>
   */
  public static final class CustomerAssetSetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerAssetSetServiceFutureStub> {
    private CustomerAssetSetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerAssetSetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerAssetSetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, or removes customer asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v14.services.MutateCustomerAssetSetsResponse> mutateCustomerAssetSets(
        com.google.ads.googleads.v14.services.MutateCustomerAssetSetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerAssetSetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOMER_ASSET_SETS = 0;

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
        case METHODID_MUTATE_CUSTOMER_ASSET_SETS:
          serviceImpl.mutateCustomerAssetSets((com.google.ads.googleads.v14.services.MutateCustomerAssetSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateCustomerAssetSetsResponse>) responseObserver);
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
          getMutateCustomerAssetSetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v14.services.MutateCustomerAssetSetsRequest,
              com.google.ads.googleads.v14.services.MutateCustomerAssetSetsResponse>(
                service, METHODID_MUTATE_CUSTOMER_ASSET_SETS)))
        .build();
  }

  private static abstract class CustomerAssetSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerAssetSetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v14.services.CustomerAssetSetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerAssetSetService");
    }
  }

  private static final class CustomerAssetSetServiceFileDescriptorSupplier
      extends CustomerAssetSetServiceBaseDescriptorSupplier {
    CustomerAssetSetServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerAssetSetServiceMethodDescriptorSupplier
      extends CustomerAssetSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerAssetSetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerAssetSetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerAssetSetServiceFileDescriptorSupplier())
              .addMethod(getMutateCustomerAssetSetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
