package com.google.ads.googleads.v20.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage conversion value rule sets.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v20/services/conversion_value_rule_set_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConversionValueRuleSetServiceGrpc {

  private ConversionValueRuleSetServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v20.services.ConversionValueRuleSetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsRequest,
      com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsResponse> getMutateConversionValueRuleSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateConversionValueRuleSets",
      requestType = com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsRequest.class,
      responseType = com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsRequest,
      com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsResponse> getMutateConversionValueRuleSetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsRequest, com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsResponse> getMutateConversionValueRuleSetsMethod;
    if ((getMutateConversionValueRuleSetsMethod = ConversionValueRuleSetServiceGrpc.getMutateConversionValueRuleSetsMethod) == null) {
      synchronized (ConversionValueRuleSetServiceGrpc.class) {
        if ((getMutateConversionValueRuleSetsMethod = ConversionValueRuleSetServiceGrpc.getMutateConversionValueRuleSetsMethod) == null) {
          ConversionValueRuleSetServiceGrpc.getMutateConversionValueRuleSetsMethod = getMutateConversionValueRuleSetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsRequest, com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateConversionValueRuleSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConversionValueRuleSetServiceMethodDescriptorSupplier("MutateConversionValueRuleSets"))
              .build();
        }
      }
    }
    return getMutateConversionValueRuleSetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConversionValueRuleSetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionValueRuleSetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionValueRuleSetServiceStub>() {
        @java.lang.Override
        public ConversionValueRuleSetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionValueRuleSetServiceStub(channel, callOptions);
        }
      };
    return ConversionValueRuleSetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ConversionValueRuleSetServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionValueRuleSetServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionValueRuleSetServiceBlockingV2Stub>() {
        @java.lang.Override
        public ConversionValueRuleSetServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionValueRuleSetServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ConversionValueRuleSetServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConversionValueRuleSetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionValueRuleSetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionValueRuleSetServiceBlockingStub>() {
        @java.lang.Override
        public ConversionValueRuleSetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionValueRuleSetServiceBlockingStub(channel, callOptions);
        }
      };
    return ConversionValueRuleSetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConversionValueRuleSetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionValueRuleSetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionValueRuleSetServiceFutureStub>() {
        @java.lang.Override
        public ConversionValueRuleSetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionValueRuleSetServiceFutureStub(channel, callOptions);
        }
      };
    return ConversionValueRuleSetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage conversion value rule sets.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates or removes conversion value rule sets. Operation statuses
     * are returned.
     * </pre>
     */
    default void mutateConversionValueRuleSets(com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateConversionValueRuleSetsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ConversionValueRuleSetService.
   * <pre>
   * Service to manage conversion value rule sets.
   * </pre>
   */
  public static abstract class ConversionValueRuleSetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ConversionValueRuleSetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ConversionValueRuleSetService.
   * <pre>
   * Service to manage conversion value rule sets.
   * </pre>
   */
  public static final class ConversionValueRuleSetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ConversionValueRuleSetServiceStub> {
    private ConversionValueRuleSetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionValueRuleSetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionValueRuleSetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes conversion value rule sets. Operation statuses
     * are returned.
     * </pre>
     */
    public void mutateConversionValueRuleSets(com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateConversionValueRuleSetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ConversionValueRuleSetService.
   * <pre>
   * Service to manage conversion value rule sets.
   * </pre>
   */
  public static final class ConversionValueRuleSetServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ConversionValueRuleSetServiceBlockingV2Stub> {
    private ConversionValueRuleSetServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionValueRuleSetServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionValueRuleSetServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes conversion value rule sets. Operation statuses
     * are returned.
     * </pre>
     */
    public com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsResponse mutateConversionValueRuleSets(com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateConversionValueRuleSetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ConversionValueRuleSetService.
   * <pre>
   * Service to manage conversion value rule sets.
   * </pre>
   */
  public static final class ConversionValueRuleSetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ConversionValueRuleSetServiceBlockingStub> {
    private ConversionValueRuleSetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionValueRuleSetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionValueRuleSetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes conversion value rule sets. Operation statuses
     * are returned.
     * </pre>
     */
    public com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsResponse mutateConversionValueRuleSets(com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateConversionValueRuleSetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ConversionValueRuleSetService.
   * <pre>
   * Service to manage conversion value rule sets.
   * </pre>
   */
  public static final class ConversionValueRuleSetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ConversionValueRuleSetServiceFutureStub> {
    private ConversionValueRuleSetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionValueRuleSetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionValueRuleSetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes conversion value rule sets. Operation statuses
     * are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsResponse> mutateConversionValueRuleSets(
        com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateConversionValueRuleSetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CONVERSION_VALUE_RULE_SETS = 0;

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
        case METHODID_MUTATE_CONVERSION_VALUE_RULE_SETS:
          serviceImpl.mutateConversionValueRuleSets((com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsResponse>) responseObserver);
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
          getMutateConversionValueRuleSetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsRequest,
              com.google.ads.googleads.v20.services.MutateConversionValueRuleSetsResponse>(
                service, METHODID_MUTATE_CONVERSION_VALUE_RULE_SETS)))
        .build();
  }

  private static abstract class ConversionValueRuleSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConversionValueRuleSetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v20.services.ConversionValueRuleSetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConversionValueRuleSetService");
    }
  }

  private static final class ConversionValueRuleSetServiceFileDescriptorSupplier
      extends ConversionValueRuleSetServiceBaseDescriptorSupplier {
    ConversionValueRuleSetServiceFileDescriptorSupplier() {}
  }

  private static final class ConversionValueRuleSetServiceMethodDescriptorSupplier
      extends ConversionValueRuleSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ConversionValueRuleSetServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ConversionValueRuleSetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConversionValueRuleSetServiceFileDescriptorSupplier())
              .addMethod(getMutateConversionValueRuleSetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
