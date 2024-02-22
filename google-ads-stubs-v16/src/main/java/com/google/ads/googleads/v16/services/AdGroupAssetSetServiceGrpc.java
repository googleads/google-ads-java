package com.google.ads.googleads.v16.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage ad group asset set
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v16/services/ad_group_asset_set_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdGroupAssetSetServiceGrpc {

  private AdGroupAssetSetServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v16.services.AdGroupAssetSetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsRequest,
      com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsResponse> getMutateAdGroupAssetSetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupAssetSets",
      requestType = com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsRequest.class,
      responseType = com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsRequest,
      com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsResponse> getMutateAdGroupAssetSetsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsRequest, com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsResponse> getMutateAdGroupAssetSetsMethod;
    if ((getMutateAdGroupAssetSetsMethod = AdGroupAssetSetServiceGrpc.getMutateAdGroupAssetSetsMethod) == null) {
      synchronized (AdGroupAssetSetServiceGrpc.class) {
        if ((getMutateAdGroupAssetSetsMethod = AdGroupAssetSetServiceGrpc.getMutateAdGroupAssetSetsMethod) == null) {
          AdGroupAssetSetServiceGrpc.getMutateAdGroupAssetSetsMethod = getMutateAdGroupAssetSetsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsRequest, com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupAssetSets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupAssetSetServiceMethodDescriptorSupplier("MutateAdGroupAssetSets"))
              .build();
        }
      }
    }
    return getMutateAdGroupAssetSetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupAssetSetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAssetSetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAssetSetServiceStub>() {
        @java.lang.Override
        public AdGroupAssetSetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAssetSetServiceStub(channel, callOptions);
        }
      };
    return AdGroupAssetSetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupAssetSetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAssetSetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAssetSetServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupAssetSetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAssetSetServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupAssetSetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupAssetSetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAssetSetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAssetSetServiceFutureStub>() {
        @java.lang.Override
        public AdGroupAssetSetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAssetSetServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupAssetSetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage ad group asset set
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates, or removes ad group asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    default void mutateAdGroupAssetSets(com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdGroupAssetSetsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AdGroupAssetSetService.
   * <pre>
   * Service to manage ad group asset set
   * </pre>
   */
  public static abstract class AdGroupAssetSetServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdGroupAssetSetServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdGroupAssetSetService.
   * <pre>
   * Service to manage ad group asset set
   * </pre>
   */
  public static final class AdGroupAssetSetServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdGroupAssetSetServiceStub> {
    private AdGroupAssetSetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAssetSetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAssetSetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, or removes ad group asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateAdGroupAssetSets(com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupAssetSetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AdGroupAssetSetService.
   * <pre>
   * Service to manage ad group asset set
   * </pre>
   */
  public static final class AdGroupAssetSetServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupAssetSetServiceBlockingStub> {
    private AdGroupAssetSetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAssetSetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAssetSetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, or removes ad group asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsResponse mutateAdGroupAssetSets(com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupAssetSetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdGroupAssetSetService.
   * <pre>
   * Service to manage ad group asset set
   * </pre>
   */
  public static final class AdGroupAssetSetServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdGroupAssetSetServiceFutureStub> {
    private AdGroupAssetSetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAssetSetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAssetSetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, or removes ad group asset sets. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsResponse> mutateAdGroupAssetSets(
        com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdGroupAssetSetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_AD_GROUP_ASSET_SETS = 0;

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
        case METHODID_MUTATE_AD_GROUP_ASSET_SETS:
          serviceImpl.mutateAdGroupAssetSets((com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsResponse>) responseObserver);
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
          getMutateAdGroupAssetSetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsRequest,
              com.google.ads.googleads.v16.services.MutateAdGroupAssetSetsResponse>(
                service, METHODID_MUTATE_AD_GROUP_ASSET_SETS)))
        .build();
  }

  private static abstract class AdGroupAssetSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupAssetSetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v16.services.AdGroupAssetSetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupAssetSetService");
    }
  }

  private static final class AdGroupAssetSetServiceFileDescriptorSupplier
      extends AdGroupAssetSetServiceBaseDescriptorSupplier {
    AdGroupAssetSetServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupAssetSetServiceMethodDescriptorSupplier
      extends AdGroupAssetSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AdGroupAssetSetServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AdGroupAssetSetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupAssetSetServiceFileDescriptorSupplier())
              .addMethod(getMutateAdGroupAssetSetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
