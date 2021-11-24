package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage combined audiences. This service can be used to list all
 * your combined audiences with metadata, but won't show the structure and
 * components of the combined audience.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/combined_audience_service.proto")
public final class CombinedAudienceServiceGrpc {

  private CombinedAudienceServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.CombinedAudienceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetCombinedAudienceRequest,
      com.google.ads.googleads.v8.resources.CombinedAudience> getGetCombinedAudienceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCombinedAudience",
      requestType = com.google.ads.googleads.v8.services.GetCombinedAudienceRequest.class,
      responseType = com.google.ads.googleads.v8.resources.CombinedAudience.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetCombinedAudienceRequest,
      com.google.ads.googleads.v8.resources.CombinedAudience> getGetCombinedAudienceMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetCombinedAudienceRequest, com.google.ads.googleads.v8.resources.CombinedAudience> getGetCombinedAudienceMethod;
    if ((getGetCombinedAudienceMethod = CombinedAudienceServiceGrpc.getGetCombinedAudienceMethod) == null) {
      synchronized (CombinedAudienceServiceGrpc.class) {
        if ((getGetCombinedAudienceMethod = CombinedAudienceServiceGrpc.getGetCombinedAudienceMethod) == null) {
          CombinedAudienceServiceGrpc.getGetCombinedAudienceMethod = getGetCombinedAudienceMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetCombinedAudienceRequest, com.google.ads.googleads.v8.resources.CombinedAudience>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCombinedAudience"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetCombinedAudienceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.CombinedAudience.getDefaultInstance()))
              .setSchemaDescriptor(new CombinedAudienceServiceMethodDescriptorSupplier("GetCombinedAudience"))
              .build();
        }
      }
    }
    return getGetCombinedAudienceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CombinedAudienceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CombinedAudienceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CombinedAudienceServiceStub>() {
        @java.lang.Override
        public CombinedAudienceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CombinedAudienceServiceStub(channel, callOptions);
        }
      };
    return CombinedAudienceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CombinedAudienceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CombinedAudienceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CombinedAudienceServiceBlockingStub>() {
        @java.lang.Override
        public CombinedAudienceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CombinedAudienceServiceBlockingStub(channel, callOptions);
        }
      };
    return CombinedAudienceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CombinedAudienceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CombinedAudienceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CombinedAudienceServiceFutureStub>() {
        @java.lang.Override
        public CombinedAudienceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CombinedAudienceServiceFutureStub(channel, callOptions);
        }
      };
    return CombinedAudienceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage combined audiences. This service can be used to list all
   * your combined audiences with metadata, but won't show the structure and
   * components of the combined audience.
   * </pre>
   */
  public static abstract class CombinedAudienceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested combined audience in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCombinedAudience(com.google.ads.googleads.v8.services.GetCombinedAudienceRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.CombinedAudience> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCombinedAudienceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCombinedAudienceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetCombinedAudienceRequest,
                com.google.ads.googleads.v8.resources.CombinedAudience>(
                  this, METHODID_GET_COMBINED_AUDIENCE)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage combined audiences. This service can be used to list all
   * your combined audiences with metadata, but won't show the structure and
   * components of the combined audience.
   * </pre>
   */
  public static final class CombinedAudienceServiceStub extends io.grpc.stub.AbstractAsyncStub<CombinedAudienceServiceStub> {
    private CombinedAudienceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CombinedAudienceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CombinedAudienceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested combined audience in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getCombinedAudience(com.google.ads.googleads.v8.services.GetCombinedAudienceRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.CombinedAudience> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCombinedAudienceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage combined audiences. This service can be used to list all
   * your combined audiences with metadata, but won't show the structure and
   * components of the combined audience.
   * </pre>
   */
  public static final class CombinedAudienceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CombinedAudienceServiceBlockingStub> {
    private CombinedAudienceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CombinedAudienceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CombinedAudienceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested combined audience in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.CombinedAudience getCombinedAudience(com.google.ads.googleads.v8.services.GetCombinedAudienceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCombinedAudienceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage combined audiences. This service can be used to list all
   * your combined audiences with metadata, but won't show the structure and
   * components of the combined audience.
   * </pre>
   */
  public static final class CombinedAudienceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CombinedAudienceServiceFutureStub> {
    private CombinedAudienceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CombinedAudienceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CombinedAudienceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested combined audience in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.CombinedAudience> getCombinedAudience(
        com.google.ads.googleads.v8.services.GetCombinedAudienceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCombinedAudienceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_COMBINED_AUDIENCE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CombinedAudienceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CombinedAudienceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_COMBINED_AUDIENCE:
          serviceImpl.getCombinedAudience((com.google.ads.googleads.v8.services.GetCombinedAudienceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.CombinedAudience>) responseObserver);
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

  private static abstract class CombinedAudienceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CombinedAudienceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.CombinedAudienceServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CombinedAudienceService");
    }
  }

  private static final class CombinedAudienceServiceFileDescriptorSupplier
      extends CombinedAudienceServiceBaseDescriptorSupplier {
    CombinedAudienceServiceFileDescriptorSupplier() {}
  }

  private static final class CombinedAudienceServiceMethodDescriptorSupplier
      extends CombinedAudienceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CombinedAudienceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CombinedAudienceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CombinedAudienceServiceFileDescriptorSupplier())
              .addMethod(getGetCombinedAudienceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
