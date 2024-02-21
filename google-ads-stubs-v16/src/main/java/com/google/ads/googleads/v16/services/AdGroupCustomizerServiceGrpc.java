package com.google.ads.googleads.v16.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage ad group customizer
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v16/services/ad_group_customizer_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdGroupCustomizerServiceGrpc {

  private AdGroupCustomizerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v16.services.AdGroupCustomizerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateAdGroupCustomizersRequest,
      com.google.ads.googleads.v16.services.MutateAdGroupCustomizersResponse> getMutateAdGroupCustomizersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupCustomizers",
      requestType = com.google.ads.googleads.v16.services.MutateAdGroupCustomizersRequest.class,
      responseType = com.google.ads.googleads.v16.services.MutateAdGroupCustomizersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateAdGroupCustomizersRequest,
      com.google.ads.googleads.v16.services.MutateAdGroupCustomizersResponse> getMutateAdGroupCustomizersMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateAdGroupCustomizersRequest, com.google.ads.googleads.v16.services.MutateAdGroupCustomizersResponse> getMutateAdGroupCustomizersMethod;
    if ((getMutateAdGroupCustomizersMethod = AdGroupCustomizerServiceGrpc.getMutateAdGroupCustomizersMethod) == null) {
      synchronized (AdGroupCustomizerServiceGrpc.class) {
        if ((getMutateAdGroupCustomizersMethod = AdGroupCustomizerServiceGrpc.getMutateAdGroupCustomizersMethod) == null) {
          AdGroupCustomizerServiceGrpc.getMutateAdGroupCustomizersMethod = getMutateAdGroupCustomizersMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v16.services.MutateAdGroupCustomizersRequest, com.google.ads.googleads.v16.services.MutateAdGroupCustomizersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupCustomizers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v16.services.MutateAdGroupCustomizersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v16.services.MutateAdGroupCustomizersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupCustomizerServiceMethodDescriptorSupplier("MutateAdGroupCustomizers"))
              .build();
        }
      }
    }
    return getMutateAdGroupCustomizersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupCustomizerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCustomizerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCustomizerServiceStub>() {
        @java.lang.Override
        public AdGroupCustomizerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCustomizerServiceStub(channel, callOptions);
        }
      };
    return AdGroupCustomizerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupCustomizerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCustomizerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCustomizerServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupCustomizerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCustomizerServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupCustomizerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupCustomizerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCustomizerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCustomizerServiceFutureStub>() {
        @java.lang.Override
        public AdGroupCustomizerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCustomizerServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupCustomizerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage ad group customizer
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, updates or removes ad group customizers. Operation statuses are
     * returned.
     * </pre>
     */
    default void mutateAdGroupCustomizers(com.google.ads.googleads.v16.services.MutateAdGroupCustomizersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateAdGroupCustomizersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdGroupCustomizersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AdGroupCustomizerService.
   * <pre>
   * Service to manage ad group customizer
   * </pre>
   */
  public static abstract class AdGroupCustomizerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdGroupCustomizerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdGroupCustomizerService.
   * <pre>
   * Service to manage ad group customizer
   * </pre>
   */
  public static final class AdGroupCustomizerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdGroupCustomizerServiceStub> {
    private AdGroupCustomizerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCustomizerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCustomizerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes ad group customizers. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAdGroupCustomizers(com.google.ads.googleads.v16.services.MutateAdGroupCustomizersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateAdGroupCustomizersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupCustomizersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AdGroupCustomizerService.
   * <pre>
   * Service to manage ad group customizer
   * </pre>
   */
  public static final class AdGroupCustomizerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupCustomizerServiceBlockingStub> {
    private AdGroupCustomizerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCustomizerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCustomizerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes ad group customizers. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v16.services.MutateAdGroupCustomizersResponse mutateAdGroupCustomizers(com.google.ads.googleads.v16.services.MutateAdGroupCustomizersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupCustomizersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdGroupCustomizerService.
   * <pre>
   * Service to manage ad group customizer
   * </pre>
   */
  public static final class AdGroupCustomizerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdGroupCustomizerServiceFutureStub> {
    private AdGroupCustomizerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCustomizerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCustomizerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates or removes ad group customizers. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v16.services.MutateAdGroupCustomizersResponse> mutateAdGroupCustomizers(
        com.google.ads.googleads.v16.services.MutateAdGroupCustomizersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdGroupCustomizersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_AD_GROUP_CUSTOMIZERS = 0;

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
        case METHODID_MUTATE_AD_GROUP_CUSTOMIZERS:
          serviceImpl.mutateAdGroupCustomizers((com.google.ads.googleads.v16.services.MutateAdGroupCustomizersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateAdGroupCustomizersResponse>) responseObserver);
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
          getMutateAdGroupCustomizersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v16.services.MutateAdGroupCustomizersRequest,
              com.google.ads.googleads.v16.services.MutateAdGroupCustomizersResponse>(
                service, METHODID_MUTATE_AD_GROUP_CUSTOMIZERS)))
        .build();
  }

  private static abstract class AdGroupCustomizerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupCustomizerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v16.services.AdGroupCustomizerServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupCustomizerService");
    }
  }

  private static final class AdGroupCustomizerServiceFileDescriptorSupplier
      extends AdGroupCustomizerServiceBaseDescriptorSupplier {
    AdGroupCustomizerServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupCustomizerServiceMethodDescriptorSupplier
      extends AdGroupCustomizerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AdGroupCustomizerServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AdGroupCustomizerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupCustomizerServiceFileDescriptorSupplier())
              .addMethod(getMutateAdGroupCustomizersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
