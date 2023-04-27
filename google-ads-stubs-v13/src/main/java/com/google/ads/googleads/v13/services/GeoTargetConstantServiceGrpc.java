package com.google.ads.googleads.v13.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch geo target constants.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v13/services/geo_target_constant_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GeoTargetConstantServiceGrpc {

  private GeoTargetConstantServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v13.services.GeoTargetConstantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsRequest,
      com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsResponse> getSuggestGeoTargetConstantsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuggestGeoTargetConstants",
      requestType = com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsRequest.class,
      responseType = com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsRequest,
      com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsResponse> getSuggestGeoTargetConstantsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsRequest, com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsResponse> getSuggestGeoTargetConstantsMethod;
    if ((getSuggestGeoTargetConstantsMethod = GeoTargetConstantServiceGrpc.getSuggestGeoTargetConstantsMethod) == null) {
      synchronized (GeoTargetConstantServiceGrpc.class) {
        if ((getSuggestGeoTargetConstantsMethod = GeoTargetConstantServiceGrpc.getSuggestGeoTargetConstantsMethod) == null) {
          GeoTargetConstantServiceGrpc.getSuggestGeoTargetConstantsMethod = getSuggestGeoTargetConstantsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsRequest, com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuggestGeoTargetConstants"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsResponse.getDefaultInstance()))
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
  public interface AsyncService {

    /**
     * <pre>
     * Returns GeoTargetConstant suggestions by location name or by resource name.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [GeoTargetConstantSuggestionError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void suggestGeoTargetConstants(com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestGeoTargetConstantsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GeoTargetConstantService.
   * <pre>
   * Service to fetch geo target constants.
   * </pre>
   */
  public static abstract class GeoTargetConstantServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GeoTargetConstantServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GeoTargetConstantService.
   * <pre>
   * Service to fetch geo target constants.
   * </pre>
   */
  public static final class GeoTargetConstantServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GeoTargetConstantServiceStub> {
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
     * Returns GeoTargetConstant suggestions by location name or by resource name.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [GeoTargetConstantSuggestionError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void suggestGeoTargetConstants(com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestGeoTargetConstantsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GeoTargetConstantService.
   * <pre>
   * Service to fetch geo target constants.
   * </pre>
   */
  public static final class GeoTargetConstantServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GeoTargetConstantServiceBlockingStub> {
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
     * Returns GeoTargetConstant suggestions by location name or by resource name.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [GeoTargetConstantSuggestionError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsResponse suggestGeoTargetConstants(com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestGeoTargetConstantsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GeoTargetConstantService.
   * <pre>
   * Service to fetch geo target constants.
   * </pre>
   */
  public static final class GeoTargetConstantServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GeoTargetConstantServiceFutureStub> {
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
     * Returns GeoTargetConstant suggestions by location name or by resource name.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [GeoTargetConstantSuggestionError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsResponse> suggestGeoTargetConstants(
        com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestGeoTargetConstantsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUGGEST_GEO_TARGET_CONSTANTS = 0;

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
        case METHODID_SUGGEST_GEO_TARGET_CONSTANTS:
          serviceImpl.suggestGeoTargetConstants((com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsResponse>) responseObserver);
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
          getSuggestGeoTargetConstantsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsRequest,
              com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsResponse>(
                service, METHODID_SUGGEST_GEO_TARGET_CONSTANTS)))
        .build();
  }

  private static abstract class GeoTargetConstantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GeoTargetConstantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v13.services.GeoTargetConstantServiceProto.getDescriptor();
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
              .addMethod(getSuggestGeoTargetConstantsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
