package com.google.ads.googleads.v6.services;

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
 * Service to fetch geo target constants.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/geo_target_constant_service.proto")
public final class GeoTargetConstantServiceGrpc {

  private GeoTargetConstantServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.GeoTargetConstantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetGeoTargetConstantRequest,
      com.google.ads.googleads.v6.resources.GeoTargetConstant> getGetGeoTargetConstantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGeoTargetConstant",
      requestType = com.google.ads.googleads.v6.services.GetGeoTargetConstantRequest.class,
      responseType = com.google.ads.googleads.v6.resources.GeoTargetConstant.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetGeoTargetConstantRequest,
      com.google.ads.googleads.v6.resources.GeoTargetConstant> getGetGeoTargetConstantMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetGeoTargetConstantRequest, com.google.ads.googleads.v6.resources.GeoTargetConstant> getGetGeoTargetConstantMethod;
    if ((getGetGeoTargetConstantMethod = GeoTargetConstantServiceGrpc.getGetGeoTargetConstantMethod) == null) {
      synchronized (GeoTargetConstantServiceGrpc.class) {
        if ((getGetGeoTargetConstantMethod = GeoTargetConstantServiceGrpc.getGetGeoTargetConstantMethod) == null) {
          GeoTargetConstantServiceGrpc.getGetGeoTargetConstantMethod = getGetGeoTargetConstantMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetGeoTargetConstantRequest, com.google.ads.googleads.v6.resources.GeoTargetConstant>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGeoTargetConstant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetGeoTargetConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.GeoTargetConstant.getDefaultInstance()))
              .setSchemaDescriptor(new GeoTargetConstantServiceMethodDescriptorSupplier("GetGeoTargetConstant"))
              .build();
        }
      }
    }
    return getGetGeoTargetConstantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsRequest,
      com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsResponse> getSuggestGeoTargetConstantsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuggestGeoTargetConstants",
      requestType = com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsRequest.class,
      responseType = com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsRequest,
      com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsResponse> getSuggestGeoTargetConstantsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsRequest, com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsResponse> getSuggestGeoTargetConstantsMethod;
    if ((getSuggestGeoTargetConstantsMethod = GeoTargetConstantServiceGrpc.getSuggestGeoTargetConstantsMethod) == null) {
      synchronized (GeoTargetConstantServiceGrpc.class) {
        if ((getSuggestGeoTargetConstantsMethod = GeoTargetConstantServiceGrpc.getSuggestGeoTargetConstantsMethod) == null) {
          GeoTargetConstantServiceGrpc.getSuggestGeoTargetConstantsMethod = getSuggestGeoTargetConstantsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsRequest, com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuggestGeoTargetConstants"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeoTargetConstantServiceMethodDescriptorSupplier("SuggestGeoTargetConstants"))
              .build();
        }
      }
    }
    return getSuggestGeoTargetConstantsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GeoTargetConstantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeoTargetConstantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeoTargetConstantServiceStub>() {
        @java.lang.Override
        public GeoTargetConstantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeoTargetConstantServiceStub(channel, callOptions);
        }
      };
    return GeoTargetConstantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GeoTargetConstantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeoTargetConstantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeoTargetConstantServiceBlockingStub>() {
        @java.lang.Override
        public GeoTargetConstantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeoTargetConstantServiceBlockingStub(channel, callOptions);
        }
      };
    return GeoTargetConstantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GeoTargetConstantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeoTargetConstantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeoTargetConstantServiceFutureStub>() {
        @java.lang.Override
        public GeoTargetConstantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeoTargetConstantServiceFutureStub(channel, callOptions);
        }
      };
    return GeoTargetConstantServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch geo target constants.
   * </pre>
   */
  public static abstract class GeoTargetConstantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested geo target constant in full detail.
     * </pre>
     */
    public void getGeoTargetConstant(com.google.ads.googleads.v6.services.GetGeoTargetConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.GeoTargetConstant> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGeoTargetConstantMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns GeoTargetConstant suggestions by location name or by resource name.
     * </pre>
     */
    public void suggestGeoTargetConstants(com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSuggestGeoTargetConstantsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGeoTargetConstantMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetGeoTargetConstantRequest,
                com.google.ads.googleads.v6.resources.GeoTargetConstant>(
                  this, METHODID_GET_GEO_TARGET_CONSTANT)))
          .addMethod(
            getSuggestGeoTargetConstantsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsRequest,
                com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsResponse>(
                  this, METHODID_SUGGEST_GEO_TARGET_CONSTANTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch geo target constants.
   * </pre>
   */
  public static final class GeoTargetConstantServiceStub extends io.grpc.stub.AbstractAsyncStub<GeoTargetConstantServiceStub> {
    private GeoTargetConstantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeoTargetConstantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeoTargetConstantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested geo target constant in full detail.
     * </pre>
     */
    public void getGeoTargetConstant(com.google.ads.googleads.v6.services.GetGeoTargetConstantRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.GeoTargetConstant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGeoTargetConstantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns GeoTargetConstant suggestions by location name or by resource name.
     * </pre>
     */
    public void suggestGeoTargetConstants(com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSuggestGeoTargetConstantsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch geo target constants.
   * </pre>
   */
  public static final class GeoTargetConstantServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GeoTargetConstantServiceBlockingStub> {
    private GeoTargetConstantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeoTargetConstantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeoTargetConstantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested geo target constant in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.GeoTargetConstant getGeoTargetConstant(com.google.ads.googleads.v6.services.GetGeoTargetConstantRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGeoTargetConstantMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns GeoTargetConstant suggestions by location name or by resource name.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsResponse suggestGeoTargetConstants(com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSuggestGeoTargetConstantsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch geo target constants.
   * </pre>
   */
  public static final class GeoTargetConstantServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GeoTargetConstantServiceFutureStub> {
    private GeoTargetConstantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeoTargetConstantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeoTargetConstantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested geo target constant in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.GeoTargetConstant> getGeoTargetConstant(
        com.google.ads.googleads.v6.services.GetGeoTargetConstantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGeoTargetConstantMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns GeoTargetConstant suggestions by location name or by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsResponse> suggestGeoTargetConstants(
        com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSuggestGeoTargetConstantsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GEO_TARGET_CONSTANT = 0;
  private static final int METHODID_SUGGEST_GEO_TARGET_CONSTANTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GeoTargetConstantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GeoTargetConstantServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GEO_TARGET_CONSTANT:
          serviceImpl.getGeoTargetConstant((com.google.ads.googleads.v6.services.GetGeoTargetConstantRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.GeoTargetConstant>) responseObserver);
          break;
        case METHODID_SUGGEST_GEO_TARGET_CONSTANTS:
          serviceImpl.suggestGeoTargetConstants((com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.SuggestGeoTargetConstantsResponse>) responseObserver);
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

  private static abstract class GeoTargetConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GeoTargetConstantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.GeoTargetConstantServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GeoTargetConstantService");
    }
  }

  private static final class GeoTargetConstantServiceFileDescriptorSupplier
      extends GeoTargetConstantServiceBaseDescriptorSupplier {
    GeoTargetConstantServiceFileDescriptorSupplier() {}
  }

  private static final class GeoTargetConstantServiceMethodDescriptorSupplier
      extends GeoTargetConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GeoTargetConstantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GeoTargetConstantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GeoTargetConstantServiceFileDescriptorSupplier())
              .addMethod(getGetGeoTargetConstantMethod())
              .addMethod(getSuggestGeoTargetConstantsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
