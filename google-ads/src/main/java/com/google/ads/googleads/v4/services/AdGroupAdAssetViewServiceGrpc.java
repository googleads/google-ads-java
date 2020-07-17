package com.google.ads.googleads.v4.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service to fetch ad group ad asset views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/ad_group_ad_asset_view_service.proto")
public final class AdGroupAdAssetViewServiceGrpc {

  private AdGroupAdAssetViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.AdGroupAdAssetViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAdGroupAdAssetViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAdGroupAdAssetViewRequest,
      com.google.ads.googleads.v4.resources.AdGroupAdAssetView> METHOD_GET_AD_GROUP_AD_ASSET_VIEW = getGetAdGroupAdAssetViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAdGroupAdAssetViewRequest,
      com.google.ads.googleads.v4.resources.AdGroupAdAssetView> getGetAdGroupAdAssetViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAdGroupAdAssetViewRequest,
      com.google.ads.googleads.v4.resources.AdGroupAdAssetView> getGetAdGroupAdAssetViewMethod() {
    return getGetAdGroupAdAssetViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAdGroupAdAssetViewRequest,
      com.google.ads.googleads.v4.resources.AdGroupAdAssetView> getGetAdGroupAdAssetViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetAdGroupAdAssetViewRequest, com.google.ads.googleads.v4.resources.AdGroupAdAssetView> getGetAdGroupAdAssetViewMethod;
    if ((getGetAdGroupAdAssetViewMethod = AdGroupAdAssetViewServiceGrpc.getGetAdGroupAdAssetViewMethod) == null) {
      synchronized (AdGroupAdAssetViewServiceGrpc.class) {
        if ((getGetAdGroupAdAssetViewMethod = AdGroupAdAssetViewServiceGrpc.getGetAdGroupAdAssetViewMethod) == null) {
          AdGroupAdAssetViewServiceGrpc.getGetAdGroupAdAssetViewMethod = getGetAdGroupAdAssetViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetAdGroupAdAssetViewRequest, com.google.ads.googleads.v4.resources.AdGroupAdAssetView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.AdGroupAdAssetViewService", "GetAdGroupAdAssetView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetAdGroupAdAssetViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.AdGroupAdAssetView.getDefaultInstance()))
                  .setSchemaDescriptor(new AdGroupAdAssetViewServiceMethodDescriptorSupplier("GetAdGroupAdAssetView"))
                  .build();
          }
        }
     }
     return getGetAdGroupAdAssetViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupAdAssetViewServiceStub newStub(io.grpc.Channel channel) {
    return new AdGroupAdAssetViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupAdAssetViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdGroupAdAssetViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupAdAssetViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdGroupAdAssetViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to fetch ad group ad asset views.
   * </pre>
   */
  public static abstract class AdGroupAdAssetViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad group ad asset view in full detail.
     * </pre>
     */
    public void getAdGroupAdAssetView(com.google.ads.googleads.v4.services.GetAdGroupAdAssetViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.AdGroupAdAssetView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdGroupAdAssetViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupAdAssetViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetAdGroupAdAssetViewRequest,
                com.google.ads.googleads.v4.resources.AdGroupAdAssetView>(
                  this, METHODID_GET_AD_GROUP_AD_ASSET_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch ad group ad asset views.
   * </pre>
   */
  public static final class AdGroupAdAssetViewServiceStub extends io.grpc.stub.AbstractStub<AdGroupAdAssetViewServiceStub> {
    private AdGroupAdAssetViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupAdAssetViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdAssetViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupAdAssetViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group ad asset view in full detail.
     * </pre>
     */
    public void getAdGroupAdAssetView(com.google.ads.googleads.v4.services.GetAdGroupAdAssetViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.AdGroupAdAssetView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdGroupAdAssetViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch ad group ad asset views.
   * </pre>
   */
  public static final class AdGroupAdAssetViewServiceBlockingStub extends io.grpc.stub.AbstractStub<AdGroupAdAssetViewServiceBlockingStub> {
    private AdGroupAdAssetViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupAdAssetViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdAssetViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupAdAssetViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group ad asset view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.AdGroupAdAssetView getAdGroupAdAssetView(com.google.ads.googleads.v4.services.GetAdGroupAdAssetViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdGroupAdAssetViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch ad group ad asset views.
   * </pre>
   */
  public static final class AdGroupAdAssetViewServiceFutureStub extends io.grpc.stub.AbstractStub<AdGroupAdAssetViewServiceFutureStub> {
    private AdGroupAdAssetViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupAdAssetViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdAssetViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupAdAssetViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group ad asset view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.AdGroupAdAssetView> getAdGroupAdAssetView(
        com.google.ads.googleads.v4.services.GetAdGroupAdAssetViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdGroupAdAssetViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP_AD_ASSET_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupAdAssetViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupAdAssetViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP_AD_ASSET_VIEW:
          serviceImpl.getAdGroupAdAssetView((com.google.ads.googleads.v4.services.GetAdGroupAdAssetViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.AdGroupAdAssetView>) responseObserver);
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

  private static abstract class AdGroupAdAssetViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupAdAssetViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.AdGroupAdAssetViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupAdAssetViewService");
    }
  }

  private static final class AdGroupAdAssetViewServiceFileDescriptorSupplier
      extends AdGroupAdAssetViewServiceBaseDescriptorSupplier {
    AdGroupAdAssetViewServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupAdAssetViewServiceMethodDescriptorSupplier
      extends AdGroupAdAssetViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdGroupAdAssetViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdGroupAdAssetViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupAdAssetViewServiceFileDescriptorSupplier())
              .addMethod(getGetAdGroupAdAssetViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
