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
 * This service allows management of links between Google Ads and third party
 * app analytics.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/third_party_app_analytics_link_service.proto")
public final class ThirdPartyAppAnalyticsLinkServiceGrpc {

  private ThirdPartyAppAnalyticsLinkServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.ThirdPartyAppAnalyticsLinkService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetThirdPartyAppAnalyticsLinkMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetThirdPartyAppAnalyticsLinkRequest,
      com.google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLink> METHOD_GET_THIRD_PARTY_APP_ANALYTICS_LINK = getGetThirdPartyAppAnalyticsLinkMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetThirdPartyAppAnalyticsLinkRequest,
      com.google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLink> getGetThirdPartyAppAnalyticsLinkMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetThirdPartyAppAnalyticsLinkRequest,
      com.google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLink> getGetThirdPartyAppAnalyticsLinkMethod() {
    return getGetThirdPartyAppAnalyticsLinkMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetThirdPartyAppAnalyticsLinkRequest,
      com.google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLink> getGetThirdPartyAppAnalyticsLinkMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetThirdPartyAppAnalyticsLinkRequest, com.google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLink> getGetThirdPartyAppAnalyticsLinkMethod;
    if ((getGetThirdPartyAppAnalyticsLinkMethod = ThirdPartyAppAnalyticsLinkServiceGrpc.getGetThirdPartyAppAnalyticsLinkMethod) == null) {
      synchronized (ThirdPartyAppAnalyticsLinkServiceGrpc.class) {
        if ((getGetThirdPartyAppAnalyticsLinkMethod = ThirdPartyAppAnalyticsLinkServiceGrpc.getGetThirdPartyAppAnalyticsLinkMethod) == null) {
          ThirdPartyAppAnalyticsLinkServiceGrpc.getGetThirdPartyAppAnalyticsLinkMethod = getGetThirdPartyAppAnalyticsLinkMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetThirdPartyAppAnalyticsLinkRequest, com.google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.ThirdPartyAppAnalyticsLinkService", "GetThirdPartyAppAnalyticsLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetThirdPartyAppAnalyticsLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLink.getDefaultInstance()))
                  .setSchemaDescriptor(new ThirdPartyAppAnalyticsLinkServiceMethodDescriptorSupplier("GetThirdPartyAppAnalyticsLink"))
                  .build();
          }
        }
     }
     return getGetThirdPartyAppAnalyticsLinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ThirdPartyAppAnalyticsLinkServiceStub newStub(io.grpc.Channel channel) {
    return new ThirdPartyAppAnalyticsLinkServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ThirdPartyAppAnalyticsLinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ThirdPartyAppAnalyticsLinkServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ThirdPartyAppAnalyticsLinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ThirdPartyAppAnalyticsLinkServiceFutureStub(channel);
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads and third party
   * app analytics.
   * </pre>
   */
  public static abstract class ThirdPartyAppAnalyticsLinkServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the third party app analytics link in full detail.
     * </pre>
     */
    public void getThirdPartyAppAnalyticsLink(com.google.ads.googleads.v4.services.GetThirdPartyAppAnalyticsLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLink> responseObserver) {
      asyncUnimplementedUnaryCall(getGetThirdPartyAppAnalyticsLinkMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetThirdPartyAppAnalyticsLinkMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetThirdPartyAppAnalyticsLinkRequest,
                com.google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLink>(
                  this, METHODID_GET_THIRD_PARTY_APP_ANALYTICS_LINK)))
          .build();
    }
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads and third party
   * app analytics.
   * </pre>
   */
  public static final class ThirdPartyAppAnalyticsLinkServiceStub extends io.grpc.stub.AbstractStub<ThirdPartyAppAnalyticsLinkServiceStub> {
    private ThirdPartyAppAnalyticsLinkServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ThirdPartyAppAnalyticsLinkServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThirdPartyAppAnalyticsLinkServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ThirdPartyAppAnalyticsLinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the third party app analytics link in full detail.
     * </pre>
     */
    public void getThirdPartyAppAnalyticsLink(com.google.ads.googleads.v4.services.GetThirdPartyAppAnalyticsLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLink> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetThirdPartyAppAnalyticsLinkMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads and third party
   * app analytics.
   * </pre>
   */
  public static final class ThirdPartyAppAnalyticsLinkServiceBlockingStub extends io.grpc.stub.AbstractStub<ThirdPartyAppAnalyticsLinkServiceBlockingStub> {
    private ThirdPartyAppAnalyticsLinkServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ThirdPartyAppAnalyticsLinkServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThirdPartyAppAnalyticsLinkServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ThirdPartyAppAnalyticsLinkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the third party app analytics link in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLink getThirdPartyAppAnalyticsLink(com.google.ads.googleads.v4.services.GetThirdPartyAppAnalyticsLinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetThirdPartyAppAnalyticsLinkMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads and third party
   * app analytics.
   * </pre>
   */
  public static final class ThirdPartyAppAnalyticsLinkServiceFutureStub extends io.grpc.stub.AbstractStub<ThirdPartyAppAnalyticsLinkServiceFutureStub> {
    private ThirdPartyAppAnalyticsLinkServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ThirdPartyAppAnalyticsLinkServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThirdPartyAppAnalyticsLinkServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ThirdPartyAppAnalyticsLinkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the third party app analytics link in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLink> getThirdPartyAppAnalyticsLink(
        com.google.ads.googleads.v4.services.GetThirdPartyAppAnalyticsLinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetThirdPartyAppAnalyticsLinkMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_THIRD_PARTY_APP_ANALYTICS_LINK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ThirdPartyAppAnalyticsLinkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ThirdPartyAppAnalyticsLinkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_THIRD_PARTY_APP_ANALYTICS_LINK:
          serviceImpl.getThirdPartyAppAnalyticsLink((com.google.ads.googleads.v4.services.GetThirdPartyAppAnalyticsLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLink>) responseObserver);
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

  private static abstract class ThirdPartyAppAnalyticsLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ThirdPartyAppAnalyticsLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.ThirdPartyAppAnalyticsLinkServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ThirdPartyAppAnalyticsLinkService");
    }
  }

  private static final class ThirdPartyAppAnalyticsLinkServiceFileDescriptorSupplier
      extends ThirdPartyAppAnalyticsLinkServiceBaseDescriptorSupplier {
    ThirdPartyAppAnalyticsLinkServiceFileDescriptorSupplier() {}
  }

  private static final class ThirdPartyAppAnalyticsLinkServiceMethodDescriptorSupplier
      extends ThirdPartyAppAnalyticsLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ThirdPartyAppAnalyticsLinkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ThirdPartyAppAnalyticsLinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ThirdPartyAppAnalyticsLinkServiceFileDescriptorSupplier())
              .addMethod(getGetThirdPartyAppAnalyticsLinkMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
