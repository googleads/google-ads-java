package com.google.ads.googleads.v12.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage customizer attribute
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v12/services/customizer_attribute_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomizerAttributeServiceGrpc {

  private CustomizerAttributeServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v12.services.CustomizerAttributeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateCustomizerAttributesRequest,
      com.google.ads.googleads.v12.services.MutateCustomizerAttributesResponse> getMutateCustomizerAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomizerAttributes",
      requestType = com.google.ads.googleads.v12.services.MutateCustomizerAttributesRequest.class,
      responseType = com.google.ads.googleads.v12.services.MutateCustomizerAttributesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateCustomizerAttributesRequest,
      com.google.ads.googleads.v12.services.MutateCustomizerAttributesResponse> getMutateCustomizerAttributesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateCustomizerAttributesRequest, com.google.ads.googleads.v12.services.MutateCustomizerAttributesResponse> getMutateCustomizerAttributesMethod;
    if ((getMutateCustomizerAttributesMethod = CustomizerAttributeServiceGrpc.getMutateCustomizerAttributesMethod) == null) {
      synchronized (CustomizerAttributeServiceGrpc.class) {
        if ((getMutateCustomizerAttributesMethod = CustomizerAttributeServiceGrpc.getMutateCustomizerAttributesMethod) == null) {
          CustomizerAttributeServiceGrpc.getMutateCustomizerAttributesMethod = getMutateCustomizerAttributesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v12.services.MutateCustomizerAttributesRequest, com.google.ads.googleads.v12.services.MutateCustomizerAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomizerAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateCustomizerAttributesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateCustomizerAttributesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomizerAttributeServiceMethodDescriptorSupplier("MutateCustomizerAttributes"))
              .build();
        }
      }
    }
    return getMutateCustomizerAttributesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomizerAttributeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomizerAttributeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomizerAttributeServiceStub>() {
        @java.lang.Override
        public CustomizerAttributeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomizerAttributeServiceStub(channel, callOptions);
        }
      };
    return CustomizerAttributeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomizerAttributeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomizerAttributeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomizerAttributeServiceBlockingStub>() {
        @java.lang.Override
        public CustomizerAttributeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomizerAttributeServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomizerAttributeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomizerAttributeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomizerAttributeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomizerAttributeServiceFutureStub>() {
        @java.lang.Override
        public CustomizerAttributeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomizerAttributeServiceFutureStub(channel, callOptions);
        }
      };
    return CustomizerAttributeServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage customizer attribute
   * </pre>
   */
  public static abstract class CustomizerAttributeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates, updates or removes customizer attributes. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCustomizerAttributes(com.google.ads.googleads.v12.services.MutateCustomizerAttributesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateCustomizerAttributesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomizerAttributesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateCustomizerAttributesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v12.services.MutateCustomizerAttributesRequest,
                com.google.ads.googleads.v12.services.MutateCustomizerAttributesResponse>(
                  this, METHODID_MUTATE_CUSTOMIZER_ATTRIBUTES)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage customizer attribute
   * </pre>
   */
  public static final class CustomizerAttributeServiceStub extends io.grpc.stub.AbstractAsyncStub<CustomizerAttributeServiceStub> {
    private CustomizerAttributeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomizerAttributeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomizerAttributeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes customizer attributes. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateCustomizerAttributes(com.google.ads.googleads.v12.services.MutateCustomizerAttributesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateCustomizerAttributesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomizerAttributesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage customizer attribute
   * </pre>
   */
  public static final class CustomizerAttributeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CustomizerAttributeServiceBlockingStub> {
    private CustomizerAttributeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomizerAttributeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomizerAttributeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes customizer attributes. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v12.services.MutateCustomizerAttributesResponse mutateCustomizerAttributes(com.google.ads.googleads.v12.services.MutateCustomizerAttributesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomizerAttributesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage customizer attribute
   * </pre>
   */
  public static final class CustomizerAttributeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CustomizerAttributeServiceFutureStub> {
    private CustomizerAttributeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomizerAttributeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomizerAttributeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes customizer attributes. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v12.services.MutateCustomizerAttributesResponse> mutateCustomizerAttributes(
        com.google.ads.googleads.v12.services.MutateCustomizerAttributesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomizerAttributesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOMIZER_ATTRIBUTES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomizerAttributeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomizerAttributeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_CUSTOMIZER_ATTRIBUTES:
          serviceImpl.mutateCustomizerAttributes((com.google.ads.googleads.v12.services.MutateCustomizerAttributesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateCustomizerAttributesResponse>) responseObserver);
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

  private static abstract class CustomizerAttributeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomizerAttributeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v12.services.CustomizerAttributeServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomizerAttributeService");
    }
  }

  private static final class CustomizerAttributeServiceFileDescriptorSupplier
      extends CustomizerAttributeServiceBaseDescriptorSupplier {
    CustomizerAttributeServiceFileDescriptorSupplier() {}
  }

  private static final class CustomizerAttributeServiceMethodDescriptorSupplier
      extends CustomizerAttributeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomizerAttributeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomizerAttributeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomizerAttributeServiceFileDescriptorSupplier())
              .addMethod(getMutateCustomizerAttributesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
