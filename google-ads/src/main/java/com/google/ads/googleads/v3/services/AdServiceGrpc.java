package com.google.ads.googleads.v3.services;

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
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/ad_service.proto")
public final class AdServiceGrpc {

  private AdServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.AdService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdRequest,
      com.google.ads.googleads.v3.resources.Ad> METHOD_GET_AD = getGetAdMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdRequest,
      com.google.ads.googleads.v3.resources.Ad> getGetAdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdRequest,
      com.google.ads.googleads.v3.resources.Ad> getGetAdMethod() {
    return getGetAdMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdRequest,
      com.google.ads.googleads.v3.resources.Ad> getGetAdMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdRequest, com.google.ads.googleads.v3.resources.Ad> getGetAdMethod;
    if ((getGetAdMethod = AdServiceGrpc.getGetAdMethod) == null) {
      synchronized (AdServiceGrpc.class) {
        if ((getGetAdMethod = AdServiceGrpc.getGetAdMethod) == null) {
          AdServiceGrpc.getGetAdMethod = getGetAdMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetAdRequest, com.google.ads.googleads.v3.resources.Ad>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.AdService", "GetAd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetAdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.Ad.getDefaultInstance()))
                  .setSchemaDescriptor(new AdServiceMethodDescriptorSupplier("GetAd"))
                  .build();
          }
        }
     }
     return getGetAdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateAdsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateAdsRequest,
      com.google.ads.googleads.v3.services.MutateAdsResponse> METHOD_MUTATE_ADS = getMutateAdsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateAdsRequest,
      com.google.ads.googleads.v3.services.MutateAdsResponse> getMutateAdsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateAdsRequest,
      com.google.ads.googleads.v3.services.MutateAdsResponse> getMutateAdsMethod() {
    return getMutateAdsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateAdsRequest,
      com.google.ads.googleads.v3.services.MutateAdsResponse> getMutateAdsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateAdsRequest, com.google.ads.googleads.v3.services.MutateAdsResponse> getMutateAdsMethod;
    if ((getMutateAdsMethod = AdServiceGrpc.getMutateAdsMethod) == null) {
      synchronized (AdServiceGrpc.class) {
        if ((getMutateAdsMethod = AdServiceGrpc.getMutateAdsMethod) == null) {
          AdServiceGrpc.getMutateAdsMethod = getMutateAdsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.MutateAdsRequest, com.google.ads.googleads.v3.services.MutateAdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.AdService", "MutateAds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateAdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateAdsResponse.getDefaultInstance()))
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
    return new AdServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdServiceFutureStub(channel);
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
    public void getAd(com.google.ads.googleads.v3.services.GetAdRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.Ad> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Updates ads. Operation statuses are returned.
     * </pre>
     */
    public void mutateAds(com.google.ads.googleads.v3.services.MutateAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateAdsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAdsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetAdRequest,
                com.google.ads.googleads.v3.resources.Ad>(
                  this, METHODID_GET_AD)))
          .addMethod(
            getMutateAdsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.MutateAdsRequest,
                com.google.ads.googleads.v3.services.MutateAdsResponse>(
                  this, METHODID_MUTATE_ADS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ads.
   * </pre>
   */
  public static final class AdServiceStub extends io.grpc.stub.AbstractStub<AdServiceStub> {
    private AdServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad in full detail.
     * </pre>
     */
    public void getAd(com.google.ads.googleads.v3.services.GetAdRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.Ad> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates ads. Operation statuses are returned.
     * </pre>
     */
    public void mutateAds(com.google.ads.googleads.v3.services.MutateAdsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateAdsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAdsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ads.
   * </pre>
   */
  public static final class AdServiceBlockingStub extends io.grpc.stub.AbstractStub<AdServiceBlockingStub> {
    private AdServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.Ad getAd(com.google.ads.googleads.v3.services.GetAdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates ads. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.MutateAdsResponse mutateAds(com.google.ads.googleads.v3.services.MutateAdsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAdsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ads.
   * </pre>
   */
  public static final class AdServiceFutureStub extends io.grpc.stub.AbstractStub<AdServiceFutureStub> {
    private AdServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.Ad> getAd(
        com.google.ads.googleads.v3.services.GetAdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates ads. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.MutateAdsResponse> mutateAds(
        com.google.ads.googleads.v3.services.MutateAdsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAdsMethodHelper(), getCallOptions()), request);
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
          serviceImpl.getAd((com.google.ads.googleads.v3.services.GetAdRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.Ad>) responseObserver);
          break;
        case METHODID_MUTATE_ADS:
          serviceImpl.mutateAds((com.google.ads.googleads.v3.services.MutateAdsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateAdsResponse>) responseObserver);
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
      return com.google.ads.googleads.v3.services.AdServiceProto.getDescriptor();
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
              .addMethod(getGetAdMethodHelper())
              .addMethod(getMutateAdsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
