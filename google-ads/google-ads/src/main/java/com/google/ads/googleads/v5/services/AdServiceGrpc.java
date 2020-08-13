package com.google.ads.googleads.v5.services;

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
 * Service to manage ads.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v5/services/ad_service.proto")
public final class AdServiceGrpc {

  private AdServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v5.services.AdService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetAdRequest,
      com.google.ads.googleads.v5.resources.Ad> getGetAdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAd",
      requestType = com.google.ads.googleads.v5.services.GetAdRequest.class,
      responseType = com.google.ads.googleads.v5.resources.Ad.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetAdRequest,
      com.google.ads.googleads.v5.resources.Ad> getGetAdMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetAdRequest, com.google.ads.googleads.v5.resources.Ad> getGetAdMethod;
    if ((getGetAdMethod = AdServiceGrpc.getGetAdMethod) == null) {
      synchronized (AdServiceGrpc.class) {
        if ((getGetAdMethod = AdServiceGrpc.getGetAdMethod) == null) {
          AdServiceGrpc.getGetAdMethod = getGetAdMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.GetAdRequest, com.google.ads.googleads.v5.resources.Ad>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.GetAdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.resources.Ad.getDefaultInstance()))
              .setSchemaDescriptor(new AdServiceMethodDescriptorSupplier("GetAd"))
              .build();
        }
      }
    }
    return getGetAdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateAdsRequest,
      com.google.ads.googleads.v5.services.MutateAdsResponse> getMutateAdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAds",
      requestType = com.google.ads.googleads.v5.services.MutateAdsRequest.class,
      responseType = com.google.ads.googleads.v5.services.MutateAdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateAdsRequest,
      com.google.ads.googleads.v5.services.MutateAdsResponse> getMutateAdsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.MutateAdsRequest, com.google.ads.googleads.v5.services.MutateAdsResponse> getMutateAdsMethod;
    if ((getMutateAdsMethod = AdServiceGrpc.getMutateAdsMethod) == null) {
      synchronized (AdServiceGrpc.class) {
        if ((getMutateAdsMethod = AdServiceGrpc.getMutateAdsMethod) == null) {
          AdServiceGrpc.getMutateAdsMethod = getMutateAdsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.MutateAdsRequest, com.google.ads.googleads.v5.services.MutateAdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.MutateAdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.MutateAdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdServiceMethodDescriptorSupplier("MutateAds"))
              .build();
        }
      }
    }
    return getMutateAdsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdServiceStub>() {
        @java.lang.Override
        public AdServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdServiceStub(channel, callOptions);
        }
      };
    return AdServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdServiceBlockingStub>() {
        @java.lang.Override
        public AdServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdServiceBlockingStub(channel, callOptions);
        }
      };
    return AdServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdServiceFutureStub>() {
        @java.lang.Override
        public AdServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdServiceFutureStub(channel, callOptions);
        }
      };
    return AdServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage ads.
   * </pre>
   */
  public static abstract class AdServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad in full detail.
     * </pre>
     */
    public void getAd(com.google.ads.googleads.v5.services.GetAdRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.Ad> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates ads. Operation statuses are returned. Updating ads is not supported
     * for TextAd, ExpandedDynamicSearchAd, GmailAd and ImageAd.
     * </pre>
     */
    public void mutateAds(com.google.ads.googleads.v5.services.MutateAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateAdsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAdsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.GetAdRequest,
                com.google.ads.googleads.v5.resources.Ad>(
                  this, METHODID_GET_AD)))
          .addMethod(
            getMutateAdsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.MutateAdsRequest,
                com.google.ads.googleads.v5.services.MutateAdsResponse>(
                  this, METHODID_MUTATE_ADS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ads.
   * </pre>
   */
  public static final class AdServiceStub extends io.grpc.stub.AbstractAsyncStub<AdServiceStub> {
    private AdServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad in full detail.
     * </pre>
     */
    public void getAd(com.google.ads.googleads.v5.services.GetAdRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.Ad> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates ads. Operation statuses are returned. Updating ads is not supported
     * for TextAd, ExpandedDynamicSearchAd, GmailAd and ImageAd.
     * </pre>
     */
    public void mutateAds(com.google.ads.googleads.v5.services.MutateAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateAdsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAdsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ads.
   * </pre>
   */
  public static final class AdServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdServiceBlockingStub> {
    private AdServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v5.resources.Ad getAd(com.google.ads.googleads.v5.services.GetAdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates ads. Operation statuses are returned. Updating ads is not supported
     * for TextAd, ExpandedDynamicSearchAd, GmailAd and ImageAd.
     * </pre>
     */
    public com.google.ads.googleads.v5.services.MutateAdsResponse mutateAds(com.google.ads.googleads.v5.services.MutateAdsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAdsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ads.
   * </pre>
   */
  public static final class AdServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AdServiceFutureStub> {
    private AdServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.resources.Ad> getAd(
        com.google.ads.googleads.v5.services.GetAdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates ads. Operation statuses are returned. Updating ads is not supported
     * for TextAd, ExpandedDynamicSearchAd, GmailAd and ImageAd.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.services.MutateAdsResponse> mutateAds(
        com.google.ads.googleads.v5.services.MutateAdsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAdsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD = 0;
  private static final int METHODID_MUTATE_ADS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD:
          serviceImpl.getAd((com.google.ads.googleads.v5.services.GetAdRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.Ad>) responseObserver);
          break;
        case METHODID_MUTATE_ADS:
          serviceImpl.mutateAds((com.google.ads.googleads.v5.services.MutateAdsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.services.MutateAdsResponse>) responseObserver);
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

  private static abstract class AdServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v5.services.AdServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdService");
    }
  }

  private static final class AdServiceFileDescriptorSupplier
      extends AdServiceBaseDescriptorSupplier {
    AdServiceFileDescriptorSupplier() {}
  }

  private static final class AdServiceMethodDescriptorSupplier
      extends AdServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdServiceFileDescriptorSupplier())
              .addMethod(getGetAdMethod())
              .addMethod(getMutateAdsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
