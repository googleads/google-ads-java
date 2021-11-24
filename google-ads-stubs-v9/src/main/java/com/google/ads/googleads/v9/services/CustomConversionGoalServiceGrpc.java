package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage custom conversion goal.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/custom_conversion_goal_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomConversionGoalServiceGrpc {

  private CustomConversionGoalServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.CustomConversionGoalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCustomConversionGoalsRequest,
      com.google.ads.googleads.v9.services.MutateCustomConversionGoalsResponse> getMutateCustomConversionGoalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomConversionGoals",
      requestType = com.google.ads.googleads.v9.services.MutateCustomConversionGoalsRequest.class,
      responseType = com.google.ads.googleads.v9.services.MutateCustomConversionGoalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCustomConversionGoalsRequest,
      com.google.ads.googleads.v9.services.MutateCustomConversionGoalsResponse> getMutateCustomConversionGoalsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.MutateCustomConversionGoalsRequest, com.google.ads.googleads.v9.services.MutateCustomConversionGoalsResponse> getMutateCustomConversionGoalsMethod;
    if ((getMutateCustomConversionGoalsMethod = CustomConversionGoalServiceGrpc.getMutateCustomConversionGoalsMethod) == null) {
      synchronized (CustomConversionGoalServiceGrpc.class) {
        if ((getMutateCustomConversionGoalsMethod = CustomConversionGoalServiceGrpc.getMutateCustomConversionGoalsMethod) == null) {
          CustomConversionGoalServiceGrpc.getMutateCustomConversionGoalsMethod = getMutateCustomConversionGoalsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.MutateCustomConversionGoalsRequest, com.google.ads.googleads.v9.services.MutateCustomConversionGoalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomConversionGoals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateCustomConversionGoalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.MutateCustomConversionGoalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomConversionGoalServiceMethodDescriptorSupplier("MutateCustomConversionGoals"))
              .build();
        }
      }
    }
    return getMutateCustomConversionGoalsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomConversionGoalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomConversionGoalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomConversionGoalServiceStub>() {
        @java.lang.Override
        public CustomConversionGoalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomConversionGoalServiceStub(channel, callOptions);
        }
      };
    return CustomConversionGoalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomConversionGoalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomConversionGoalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomConversionGoalServiceBlockingStub>() {
        @java.lang.Override
        public CustomConversionGoalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomConversionGoalServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomConversionGoalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomConversionGoalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomConversionGoalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomConversionGoalServiceFutureStub>() {
        @java.lang.Override
        public CustomConversionGoalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomConversionGoalServiceFutureStub(channel, callOptions);
        }
      };
    return CustomConversionGoalServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage custom conversion goal.
   * </pre>
   */
  public static abstract class CustomConversionGoalServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates, updates or removes custom conversion goals. Operation statuses
     * are returned.
     * </pre>
     */
    public void mutateCustomConversionGoals(com.google.ads.googleads.v9.services.MutateCustomConversionGoalsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCustomConversionGoalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateCustomConversionGoalsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateCustomConversionGoalsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.MutateCustomConversionGoalsRequest,
                com.google.ads.googleads.v9.services.MutateCustomConversionGoalsResponse>(
                  this, METHODID_MUTATE_CUSTOM_CONVERSION_GOALS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage custom conversion goal.
   * </pre>
   */
  public static final class CustomConversionGoalServiceStub extends io.grpc.stub.AbstractAsyncStub<CustomConversionGoalServiceStub> {
    private CustomConversionGoalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomConversionGoalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomConversionGoalServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes custom conversion goals. Operation statuses
     * are returned.
     * </pre>
     */
    public void mutateCustomConversionGoals(com.google.ads.googleads.v9.services.MutateCustomConversionGoalsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCustomConversionGoalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateCustomConversionGoalsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage custom conversion goal.
   * </pre>
   */
  public static final class CustomConversionGoalServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CustomConversionGoalServiceBlockingStub> {
    private CustomConversionGoalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomConversionGoalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomConversionGoalServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes custom conversion goals. Operation statuses
     * are returned.
     * </pre>
     */
    public com.google.ads.googleads.v9.services.MutateCustomConversionGoalsResponse mutateCustomConversionGoals(com.google.ads.googleads.v9.services.MutateCustomConversionGoalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateCustomConversionGoalsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage custom conversion goal.
   * </pre>
   */
  public static final class CustomConversionGoalServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CustomConversionGoalServiceFutureStub> {
    private CustomConversionGoalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomConversionGoalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomConversionGoalServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes custom conversion goals. Operation statuses
     * are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.services.MutateCustomConversionGoalsResponse> mutateCustomConversionGoals(
        com.google.ads.googleads.v9.services.MutateCustomConversionGoalsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateCustomConversionGoalsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CUSTOM_CONVERSION_GOALS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomConversionGoalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomConversionGoalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_CUSTOM_CONVERSION_GOALS:
          serviceImpl.mutateCustomConversionGoals((com.google.ads.googleads.v9.services.MutateCustomConversionGoalsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.services.MutateCustomConversionGoalsResponse>) responseObserver);
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

  private static abstract class CustomConversionGoalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomConversionGoalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.CustomConversionGoalServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomConversionGoalService");
    }
  }

  private static final class CustomConversionGoalServiceFileDescriptorSupplier
      extends CustomConversionGoalServiceBaseDescriptorSupplier {
    CustomConversionGoalServiceFileDescriptorSupplier() {}
  }

  private static final class CustomConversionGoalServiceMethodDescriptorSupplier
      extends CustomConversionGoalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomConversionGoalServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomConversionGoalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomConversionGoalServiceFileDescriptorSupplier())
              .addMethod(getMutateCustomConversionGoalsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
