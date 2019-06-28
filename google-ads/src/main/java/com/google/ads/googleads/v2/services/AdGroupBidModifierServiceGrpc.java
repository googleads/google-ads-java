package com.google.ads.googleads.v2.services;

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
 * Service to manage ad group bid modifiers.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v2/services/ad_group_bid_modifier_service.proto")
public final class AdGroupBidModifierServiceGrpc {

  private AdGroupBidModifierServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.AdGroupBidModifierService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAdGroupBidModifierMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetAdGroupBidModifierRequest,
      com.google.ads.googleads.v2.resources.AdGroupBidModifier> METHOD_GET_AD_GROUP_BID_MODIFIER = getGetAdGroupBidModifierMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetAdGroupBidModifierRequest,
      com.google.ads.googleads.v2.resources.AdGroupBidModifier> getGetAdGroupBidModifierMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetAdGroupBidModifierRequest,
      com.google.ads.googleads.v2.resources.AdGroupBidModifier> getGetAdGroupBidModifierMethod() {
    return getGetAdGroupBidModifierMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetAdGroupBidModifierRequest,
      com.google.ads.googleads.v2.resources.AdGroupBidModifier> getGetAdGroupBidModifierMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetAdGroupBidModifierRequest, com.google.ads.googleads.v2.resources.AdGroupBidModifier> getGetAdGroupBidModifierMethod;
    if ((getGetAdGroupBidModifierMethod = AdGroupBidModifierServiceGrpc.getGetAdGroupBidModifierMethod) == null) {
      synchronized (AdGroupBidModifierServiceGrpc.class) {
        if ((getGetAdGroupBidModifierMethod = AdGroupBidModifierServiceGrpc.getGetAdGroupBidModifierMethod) == null) {
          AdGroupBidModifierServiceGrpc.getGetAdGroupBidModifierMethod = getGetAdGroupBidModifierMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetAdGroupBidModifierRequest, com.google.ads.googleads.v2.resources.AdGroupBidModifier>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.AdGroupBidModifierService", "GetAdGroupBidModifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetAdGroupBidModifierRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.AdGroupBidModifier.getDefaultInstance()))
                  .setSchemaDescriptor(new AdGroupBidModifierServiceMethodDescriptorSupplier("GetAdGroupBidModifier"))
                  .build();
          }
        }
     }
     return getGetAdGroupBidModifierMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateAdGroupBidModifiersMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersRequest,
      com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersResponse> METHOD_MUTATE_AD_GROUP_BID_MODIFIERS = getMutateAdGroupBidModifiersMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersRequest,
      com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersResponse> getMutateAdGroupBidModifiersMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersRequest,
      com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersResponse> getMutateAdGroupBidModifiersMethod() {
    return getMutateAdGroupBidModifiersMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersRequest,
      com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersResponse> getMutateAdGroupBidModifiersMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersRequest, com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersResponse> getMutateAdGroupBidModifiersMethod;
    if ((getMutateAdGroupBidModifiersMethod = AdGroupBidModifierServiceGrpc.getMutateAdGroupBidModifiersMethod) == null) {
      synchronized (AdGroupBidModifierServiceGrpc.class) {
        if ((getMutateAdGroupBidModifiersMethod = AdGroupBidModifierServiceGrpc.getMutateAdGroupBidModifiersMethod) == null) {
          AdGroupBidModifierServiceGrpc.getMutateAdGroupBidModifiersMethod = getMutateAdGroupBidModifiersMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersRequest, com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.AdGroupBidModifierService", "MutateAdGroupBidModifiers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdGroupBidModifierServiceMethodDescriptorSupplier("MutateAdGroupBidModifiers"))
                  .build();
          }
        }
     }
     return getMutateAdGroupBidModifiersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupBidModifierServiceStub newStub(io.grpc.Channel channel) {
    return new AdGroupBidModifierServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupBidModifierServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdGroupBidModifierServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupBidModifierServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdGroupBidModifierServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage ad group bid modifiers.
   * </pre>
   */
  public static abstract class AdGroupBidModifierServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad group bid modifier in full detail.
     * </pre>
     */
    public void getAdGroupBidModifier(com.google.ads.googleads.v2.services.GetAdGroupBidModifierRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.AdGroupBidModifier> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdGroupBidModifierMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group bid modifiers.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateAdGroupBidModifiers(com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAdGroupBidModifiersMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupBidModifierMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetAdGroupBidModifierRequest,
                com.google.ads.googleads.v2.resources.AdGroupBidModifier>(
                  this, METHODID_GET_AD_GROUP_BID_MODIFIER)))
          .addMethod(
            getMutateAdGroupBidModifiersMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersRequest,
                com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersResponse>(
                  this, METHODID_MUTATE_AD_GROUP_BID_MODIFIERS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ad group bid modifiers.
   * </pre>
   */
  public static final class AdGroupBidModifierServiceStub extends io.grpc.stub.AbstractStub<AdGroupBidModifierServiceStub> {
    private AdGroupBidModifierServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupBidModifierServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupBidModifierServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupBidModifierServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group bid modifier in full detail.
     * </pre>
     */
    public void getAdGroupBidModifier(com.google.ads.googleads.v2.services.GetAdGroupBidModifierRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.AdGroupBidModifier> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdGroupBidModifierMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group bid modifiers.
     * Operation statuses are returned.
     * </pre>
     */
    public void mutateAdGroupBidModifiers(com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupBidModifiersMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ad group bid modifiers.
   * </pre>
   */
  public static final class AdGroupBidModifierServiceBlockingStub extends io.grpc.stub.AbstractStub<AdGroupBidModifierServiceBlockingStub> {
    private AdGroupBidModifierServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupBidModifierServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupBidModifierServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupBidModifierServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group bid modifier in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.AdGroupBidModifier getAdGroupBidModifier(com.google.ads.googleads.v2.services.GetAdGroupBidModifierRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdGroupBidModifierMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group bid modifiers.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersResponse mutateAdGroupBidModifiers(com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAdGroupBidModifiersMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ad group bid modifiers.
   * </pre>
   */
  public static final class AdGroupBidModifierServiceFutureStub extends io.grpc.stub.AbstractStub<AdGroupBidModifierServiceFutureStub> {
    private AdGroupBidModifierServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupBidModifierServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupBidModifierServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupBidModifierServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group bid modifier in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.AdGroupBidModifier> getAdGroupBidModifier(
        com.google.ads.googleads.v2.services.GetAdGroupBidModifierRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdGroupBidModifierMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes ad group bid modifiers.
     * Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersResponse> mutateAdGroupBidModifiers(
        com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAdGroupBidModifiersMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP_BID_MODIFIER = 0;
  private static final int METHODID_MUTATE_AD_GROUP_BID_MODIFIERS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupBidModifierServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupBidModifierServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP_BID_MODIFIER:
          serviceImpl.getAdGroupBidModifier((com.google.ads.googleads.v2.services.GetAdGroupBidModifierRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.AdGroupBidModifier>) responseObserver);
          break;
        case METHODID_MUTATE_AD_GROUP_BID_MODIFIERS:
          serviceImpl.mutateAdGroupBidModifiers((com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateAdGroupBidModifiersResponse>) responseObserver);
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

  private static abstract class AdGroupBidModifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupBidModifierServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v2.services.AdGroupBidModifierServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupBidModifierService");
    }
  }

  private static final class AdGroupBidModifierServiceFileDescriptorSupplier
      extends AdGroupBidModifierServiceBaseDescriptorSupplier {
    AdGroupBidModifierServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupBidModifierServiceMethodDescriptorSupplier
      extends AdGroupBidModifierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdGroupBidModifierServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdGroupBidModifierServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupBidModifierServiceFileDescriptorSupplier())
              .addMethod(getGetAdGroupBidModifierMethodHelper())
              .addMethod(getMutateAdGroupBidModifiersMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
