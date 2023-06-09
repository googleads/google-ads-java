package com.google.ads.googleads.v12.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage conversion value rules.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v12/services/conversion_value_rule_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConversionValueRuleServiceGrpc {

  private ConversionValueRuleServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v12.services.ConversionValueRuleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateConversionValueRulesRequest,
      com.google.ads.googleads.v12.services.MutateConversionValueRulesResponse> getMutateConversionValueRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateConversionValueRules",
      requestType = com.google.ads.googleads.v12.services.MutateConversionValueRulesRequest.class,
      responseType = com.google.ads.googleads.v12.services.MutateConversionValueRulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateConversionValueRulesRequest,
      com.google.ads.googleads.v12.services.MutateConversionValueRulesResponse> getMutateConversionValueRulesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v12.services.MutateConversionValueRulesRequest, com.google.ads.googleads.v12.services.MutateConversionValueRulesResponse> getMutateConversionValueRulesMethod;
    if ((getMutateConversionValueRulesMethod = ConversionValueRuleServiceGrpc.getMutateConversionValueRulesMethod) == null) {
      synchronized (ConversionValueRuleServiceGrpc.class) {
        if ((getMutateConversionValueRulesMethod = ConversionValueRuleServiceGrpc.getMutateConversionValueRulesMethod) == null) {
          ConversionValueRuleServiceGrpc.getMutateConversionValueRulesMethod = getMutateConversionValueRulesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v12.services.MutateConversionValueRulesRequest, com.google.ads.googleads.v12.services.MutateConversionValueRulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateConversionValueRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateConversionValueRulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v12.services.MutateConversionValueRulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConversionValueRuleServiceMethodDescriptorSupplier("MutateConversionValueRules"))
              .build();
        }
      }
    }
    return getMutateConversionValueRulesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConversionValueRuleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionValueRuleServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionValueRuleServiceStub>() {
        @java.lang.Override
        public ConversionValueRuleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionValueRuleServiceStub(channel, callOptions);
        }
      };
    return ConversionValueRuleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConversionValueRuleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionValueRuleServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionValueRuleServiceBlockingStub>() {
        @java.lang.Override
        public ConversionValueRuleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionValueRuleServiceBlockingStub(channel, callOptions);
        }
      };
    return ConversionValueRuleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConversionValueRuleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConversionValueRuleServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConversionValueRuleServiceFutureStub>() {
        @java.lang.Override
        public ConversionValueRuleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConversionValueRuleServiceFutureStub(channel, callOptions);
        }
      };
    return ConversionValueRuleServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage conversion value rules.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates, or removes conversion value rules. Operation statuses are
     * returned.
     * </pre>
     */
    default void mutateConversionValueRules(com.google.ads.googleads.v12.services.MutateConversionValueRulesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateConversionValueRulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateConversionValueRulesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ConversionValueRuleService.
   * <pre>
   * Service to manage conversion value rules.
   * </pre>
   */
  public static abstract class ConversionValueRuleServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ConversionValueRuleServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ConversionValueRuleService.
   * <pre>
   * Service to manage conversion value rules.
   * </pre>
   */
  public static final class ConversionValueRuleServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ConversionValueRuleServiceStub> {
    private ConversionValueRuleServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionValueRuleServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionValueRuleServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes conversion value rules. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateConversionValueRules(com.google.ads.googleads.v12.services.MutateConversionValueRulesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateConversionValueRulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateConversionValueRulesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ConversionValueRuleService.
   * <pre>
   * Service to manage conversion value rules.
   * </pre>
   */
  public static final class ConversionValueRuleServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ConversionValueRuleServiceBlockingStub> {
    private ConversionValueRuleServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionValueRuleServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionValueRuleServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes conversion value rules. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v12.services.MutateConversionValueRulesResponse mutateConversionValueRules(com.google.ads.googleads.v12.services.MutateConversionValueRulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateConversionValueRulesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ConversionValueRuleService.
   * <pre>
   * Service to manage conversion value rules.
   * </pre>
   */
  public static final class ConversionValueRuleServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ConversionValueRuleServiceFutureStub> {
    private ConversionValueRuleServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConversionValueRuleServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConversionValueRuleServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes conversion value rules. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v12.services.MutateConversionValueRulesResponse> mutateConversionValueRules(
        com.google.ads.googleads.v12.services.MutateConversionValueRulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateConversionValueRulesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_CONVERSION_VALUE_RULES = 0;

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
        case METHODID_MUTATE_CONVERSION_VALUE_RULES:
          serviceImpl.mutateConversionValueRules((com.google.ads.googleads.v12.services.MutateConversionValueRulesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v12.services.MutateConversionValueRulesResponse>) responseObserver);
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
          getMutateConversionValueRulesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v12.services.MutateConversionValueRulesRequest,
              com.google.ads.googleads.v12.services.MutateConversionValueRulesResponse>(
                service, METHODID_MUTATE_CONVERSION_VALUE_RULES)))
        .build();
  }

  private static abstract class ConversionValueRuleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConversionValueRuleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v12.services.ConversionValueRuleServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConversionValueRuleService");
    }
  }

  private static final class ConversionValueRuleServiceFileDescriptorSupplier
      extends ConversionValueRuleServiceBaseDescriptorSupplier {
    ConversionValueRuleServiceFileDescriptorSupplier() {}
  }

  private static final class ConversionValueRuleServiceMethodDescriptorSupplier
      extends ConversionValueRuleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConversionValueRuleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConversionValueRuleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConversionValueRuleServiceFileDescriptorSupplier())
              .addMethod(getMutateConversionValueRulesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
