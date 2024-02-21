package com.google.ads.googleads.v14.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage ad group criterion customizer
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v14/services/ad_group_criterion_customizer_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdGroupCriterionCustomizerServiceGrpc {

  private AdGroupCriterionCustomizerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v14.services.AdGroupCriterionCustomizerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersRequest,
      com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersResponse> getMutateAdGroupCriterionCustomizersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupCriterionCustomizers",
      requestType = com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersRequest.class,
      responseType = com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersRequest,
      com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersResponse> getMutateAdGroupCriterionCustomizersMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersRequest, com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersResponse> getMutateAdGroupCriterionCustomizersMethod;
    if ((getMutateAdGroupCriterionCustomizersMethod = AdGroupCriterionCustomizerServiceGrpc.getMutateAdGroupCriterionCustomizersMethod) == null) {
      synchronized (AdGroupCriterionCustomizerServiceGrpc.class) {
        if ((getMutateAdGroupCriterionCustomizersMethod = AdGroupCriterionCustomizerServiceGrpc.getMutateAdGroupCriterionCustomizersMethod) == null) {
          AdGroupCriterionCustomizerServiceGrpc.getMutateAdGroupCriterionCustomizersMethod = getMutateAdGroupCriterionCustomizersMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersRequest, com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupCriterionCustomizers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupCriterionCustomizerServiceMethodDescriptorSupplier("MutateAdGroupCriterionCustomizers"))
              .build();
        }
      }
    }
    return getMutateAdGroupCriterionCustomizersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupCriterionCustomizerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionCustomizerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionCustomizerServiceStub>() {
        @java.lang.Override
        public AdGroupCriterionCustomizerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCriterionCustomizerServiceStub(channel, callOptions);
        }
      };
    return AdGroupCriterionCustomizerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupCriterionCustomizerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionCustomizerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionCustomizerServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupCriterionCustomizerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCriterionCustomizerServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupCriterionCustomizerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupCriterionCustomizerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionCustomizerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionCustomizerServiceFutureStub>() {
        @java.lang.Override
        public AdGroupCriterionCustomizerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCriterionCustomizerServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupCriterionCustomizerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage ad group criterion customizer
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates or removes ad group criterion customizers. Operation
     * statuses are returned.
     * </pre>
     */
    default void mutateAdGroupCriterionCustomizers(com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdGroupCriterionCustomizersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AdGroupCriterionCustomizerService.
   * <pre>
   * Service to manage ad group criterion customizer
   * </pre>
   */
  public static abstract class AdGroupCriterionCustomizerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdGroupCriterionCustomizerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdGroupCriterionCustomizerService.
   * <pre>
   * Service to manage ad group criterion customizer
   * </pre>
   */
  public static final class AdGroupCriterionCustomizerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdGroupCriterionCustomizerServiceStub> {
    private AdGroupCriterionCustomizerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionCustomizerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionCustomizerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes ad group criterion customizers. Operation
     * statuses are returned.
     * </pre>
     */
    public void mutateAdGroupCriterionCustomizers(com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupCriterionCustomizersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AdGroupCriterionCustomizerService.
   * <pre>
   * Service to manage ad group criterion customizer
   * </pre>
   */
  public static final class AdGroupCriterionCustomizerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupCriterionCustomizerServiceBlockingStub> {
    private AdGroupCriterionCustomizerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionCustomizerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionCustomizerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes ad group criterion customizers. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersResponse mutateAdGroupCriterionCustomizers(com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupCriterionCustomizersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdGroupCriterionCustomizerService.
   * <pre>
   * Service to manage ad group criterion customizer
   * </pre>
   */
  public static final class AdGroupCriterionCustomizerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdGroupCriterionCustomizerServiceFutureStub> {
    private AdGroupCriterionCustomizerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionCustomizerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionCustomizerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes ad group criterion customizers. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersResponse> mutateAdGroupCriterionCustomizers(
        com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdGroupCriterionCustomizersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_AD_GROUP_CRITERION_CUSTOMIZERS = 0;

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
        case METHODID_MUTATE_AD_GROUP_CRITERION_CUSTOMIZERS:
          serviceImpl.mutateAdGroupCriterionCustomizers((com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersResponse>) responseObserver);
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
          getMutateAdGroupCriterionCustomizersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersRequest,
              com.google.ads.googleads.v14.services.MutateAdGroupCriterionCustomizersResponse>(
                service, METHODID_MUTATE_AD_GROUP_CRITERION_CUSTOMIZERS)))
        .build();
  }

  private static abstract class AdGroupCriterionCustomizerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupCriterionCustomizerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v14.services.AdGroupCriterionCustomizerServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupCriterionCustomizerService");
    }
  }

  private static final class AdGroupCriterionCustomizerServiceFileDescriptorSupplier
      extends AdGroupCriterionCustomizerServiceBaseDescriptorSupplier {
    AdGroupCriterionCustomizerServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupCriterionCustomizerServiceMethodDescriptorSupplier
      extends AdGroupCriterionCustomizerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AdGroupCriterionCustomizerServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AdGroupCriterionCustomizerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupCriterionCustomizerServiceFileDescriptorSupplier())
              .addMethod(getMutateAdGroupCriterionCustomizersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
