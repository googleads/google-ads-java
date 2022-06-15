package com.google.ads.googleads.v11.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage customer customizer
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v11/services/customer_customizer_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerCustomizerServiceGrpc {

  private CustomerCustomizerServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v11.services.CustomerCustomizerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v11.services.MutateCustomerCustomizersRequest,
      com.google.ads.googleads.v11.services.MutateCustomerCustomizersResponse> getMutateCustomerCustomizersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomerCustomizers",
      requestType = com.google.ads.googleads.v11.services.MutateCustomerCustomizersRequest.class,
      responseType = com.google.ads.googleads.v11.services.MutateCustomerCustomizersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v11.services.MutateCustomerCustomizersRequest,
      com.google.ads.googleads.v11.services.MutateCustomerCustomizersResponse> getMutateCustomerCustomizersMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v11.services.MutateCustomerCustomizersRequest, com.google.ads.googleads.v11.services.MutateCustomerCustomizersResponse> getMutateCustomerCustomizersMethod;
    if ((getMutateCustomerCustomizersMethod = CustomerCustomizerServiceGrpc.getMutateCustomerCustomizersMethod) == null) {
      synchronized (CustomerCustomizerServiceGrpc.class) {
        if ((getMutateCustomerCustomizersMethod = CustomerCustomizerServiceGrpc.getMutateCustomerCustomizersMethod) == null) {
          CustomerCustomizerServiceGrpc.getMutateCustomerCustomizersMethod = getMutateCustomerCustomizersMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v11.services.MutateCustomerCustomizersRequest, com.google.ads.googleads.v11.services.MutateCustomerCustomizersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomerCustomizers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v11.services.MutateCustomerCustomizersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v11.services.MutateCustomerCustomizersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerCustomizerServiceMethodDescriptorSupplier("MutateCustomerCustomizers"))
              .build();
        }
      }
    }
    return getMutateCustomerCustomizersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerCustomizerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerCustomizerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerCustomizerServiceStub>() {
        @java.lang.Override
        public CustomerCustomizerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerCustomizerServiceStub(channel, callOptions);
        }
      };
    return CustomerCustomizerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerCustomizerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerCustomizerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerCustomizerServiceBlockingStub>() {
        @java.lang.Override
        public CustomerCustomizerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerCustomizerServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerCustomizerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerCustomizerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerCustomizerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerCustomizerServiceFutureStub>() {
        @java.lang.Override
        public CustomerCustomizerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerCustomizerServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerCustomizerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage customer customizer
   * </pre>
   */
  public static abstract class CustomerCustomizerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates, updates or removes customer customizers. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCustomerCustomizers(com.google.ads.googleads.v11.services.MutateCustomerCustomizersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v11.services.MutateCustomerCustomizersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomerCustomizersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateCustomerCustomizersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v11.services.MutateCustomerCustomizersRequest,
                com.google.ads.googleads.v11.services.MutateCustomerCustomizersResponse>(
                  this, METHODID_MUTATE_CUSTOMER_CUSTOMIZERS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage customer customizer
   * </pre>
   */
  public static final class CustomerCustomizerServiceStub extends io.grpc.stub.AbstractAsyncStub<CustomerCustomizerServiceStub> {
    private CustomerCustomizerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerCustomizerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerCustomizerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes customer customizers. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCustomerCustomizers(com.google.ads.googleads.v11.services.MutateCustomerCustomizersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v11.services.MutateCustomerCustomizersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomerCustomizersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage customer customizer
   * </pre>
   */
  public static final class CustomerCustomizerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CustomerCustomizerServiceBlockingStub> {
    private CustomerCustomizerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerCustomizerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerCustomizerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes customer customizers. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v11.services.MutateCustomerCustomizersResponse mutateCustomerCustomizers(com.google.ads.googleads.v11.services.MutateCustomerCustomizersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomerCustomizersMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage customer customizer
   * </pre>
   */
  public static final class CustomerCustomizerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CustomerCustomizerServiceFutureStub> {
    private CustomerCustomizerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerCustomizerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerCustomizerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes customer customizers. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v11.services.MutateCustomerCustomizersResponse> mutateCustomerCustomizers(
        com.google.ads.googleads.v11.services.MutateCustomerCustomizersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomerCustomizersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOMER_CUSTOMIZERS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerCustomizerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerCustomizerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_CUSTOMER_CUSTOMIZERS:
          serviceImpl.mutateCustomerCustomizers((com.google.ads.googleads.v11.services.MutateCustomerCustomizersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v11.services.MutateCustomerCustomizersResponse>) responseObserver);
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

  private static abstract class CustomerCustomizerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerCustomizerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v11.services.CustomerCustomizerServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerCustomizerService");
    }
  }

  private static final class CustomerCustomizerServiceFileDescriptorSupplier
      extends CustomerCustomizerServiceBaseDescriptorSupplier {
    CustomerCustomizerServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerCustomizerServiceMethodDescriptorSupplier
      extends CustomerCustomizerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerCustomizerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerCustomizerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerCustomizerServiceFileDescriptorSupplier())
              .addMethod(getMutateCustomerCustomizersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
