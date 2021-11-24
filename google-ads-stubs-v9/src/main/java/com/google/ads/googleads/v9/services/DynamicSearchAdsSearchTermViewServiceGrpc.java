package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch dynamic search ads views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/dynamic_search_ads_search_term_view_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DynamicSearchAdsSearchTermViewServiceGrpc {

  private DynamicSearchAdsSearchTermViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.DynamicSearchAdsSearchTermViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetDynamicSearchAdsSearchTermViewRequest,
      com.google.ads.googleads.v9.resources.DynamicSearchAdsSearchTermView> getGetDynamicSearchAdsSearchTermViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDynamicSearchAdsSearchTermView",
      requestType = com.google.ads.googleads.v9.services.GetDynamicSearchAdsSearchTermViewRequest.class,
      responseType = com.google.ads.googleads.v9.resources.DynamicSearchAdsSearchTermView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetDynamicSearchAdsSearchTermViewRequest,
      com.google.ads.googleads.v9.resources.DynamicSearchAdsSearchTermView> getGetDynamicSearchAdsSearchTermViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetDynamicSearchAdsSearchTermViewRequest, com.google.ads.googleads.v9.resources.DynamicSearchAdsSearchTermView> getGetDynamicSearchAdsSearchTermViewMethod;
    if ((getGetDynamicSearchAdsSearchTermViewMethod = DynamicSearchAdsSearchTermViewServiceGrpc.getGetDynamicSearchAdsSearchTermViewMethod) == null) {
      synchronized (DynamicSearchAdsSearchTermViewServiceGrpc.class) {
        if ((getGetDynamicSearchAdsSearchTermViewMethod = DynamicSearchAdsSearchTermViewServiceGrpc.getGetDynamicSearchAdsSearchTermViewMethod) == null) {
          DynamicSearchAdsSearchTermViewServiceGrpc.getGetDynamicSearchAdsSearchTermViewMethod = getGetDynamicSearchAdsSearchTermViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetDynamicSearchAdsSearchTermViewRequest, com.google.ads.googleads.v9.resources.DynamicSearchAdsSearchTermView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDynamicSearchAdsSearchTermView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetDynamicSearchAdsSearchTermViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.DynamicSearchAdsSearchTermView.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicSearchAdsSearchTermViewServiceMethodDescriptorSupplier("GetDynamicSearchAdsSearchTermView"))
              .build();
        }
      }
    }
    return getGetDynamicSearchAdsSearchTermViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DynamicSearchAdsSearchTermViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DynamicSearchAdsSearchTermViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DynamicSearchAdsSearchTermViewServiceStub>() {
        @java.lang.Override
        public DynamicSearchAdsSearchTermViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DynamicSearchAdsSearchTermViewServiceStub(channel, callOptions);
        }
      };
    return DynamicSearchAdsSearchTermViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DynamicSearchAdsSearchTermViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DynamicSearchAdsSearchTermViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DynamicSearchAdsSearchTermViewServiceBlockingStub>() {
        @java.lang.Override
        public DynamicSearchAdsSearchTermViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DynamicSearchAdsSearchTermViewServiceBlockingStub(channel, callOptions);
        }
      };
    return DynamicSearchAdsSearchTermViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DynamicSearchAdsSearchTermViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DynamicSearchAdsSearchTermViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DynamicSearchAdsSearchTermViewServiceFutureStub>() {
        @java.lang.Override
        public DynamicSearchAdsSearchTermViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DynamicSearchAdsSearchTermViewServiceFutureStub(channel, callOptions);
        }
      };
    return DynamicSearchAdsSearchTermViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch dynamic search ads views.
   * </pre>
   */
  public static abstract class DynamicSearchAdsSearchTermViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested dynamic search ads search term view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getDynamicSearchAdsSearchTermView(com.google.ads.googleads.v9.services.GetDynamicSearchAdsSearchTermViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.DynamicSearchAdsSearchTermView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDynamicSearchAdsSearchTermViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDynamicSearchAdsSearchTermViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetDynamicSearchAdsSearchTermViewRequest,
                com.google.ads.googleads.v9.resources.DynamicSearchAdsSearchTermView>(
                  this, METHODID_GET_DYNAMIC_SEARCH_ADS_SEARCH_TERM_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch dynamic search ads views.
   * </pre>
   */
  public static final class DynamicSearchAdsSearchTermViewServiceStub extends io.grpc.stub.AbstractAsyncStub<DynamicSearchAdsSearchTermViewServiceStub> {
    private DynamicSearchAdsSearchTermViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DynamicSearchAdsSearchTermViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DynamicSearchAdsSearchTermViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested dynamic search ads search term view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getDynamicSearchAdsSearchTermView(com.google.ads.googleads.v9.services.GetDynamicSearchAdsSearchTermViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.DynamicSearchAdsSearchTermView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDynamicSearchAdsSearchTermViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch dynamic search ads views.
   * </pre>
   */
  public static final class DynamicSearchAdsSearchTermViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DynamicSearchAdsSearchTermViewServiceBlockingStub> {
    private DynamicSearchAdsSearchTermViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DynamicSearchAdsSearchTermViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DynamicSearchAdsSearchTermViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested dynamic search ads search term view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.DynamicSearchAdsSearchTermView getDynamicSearchAdsSearchTermView(com.google.ads.googleads.v9.services.GetDynamicSearchAdsSearchTermViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDynamicSearchAdsSearchTermViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch dynamic search ads views.
   * </pre>
   */
  public static final class DynamicSearchAdsSearchTermViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DynamicSearchAdsSearchTermViewServiceFutureStub> {
    private DynamicSearchAdsSearchTermViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DynamicSearchAdsSearchTermViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DynamicSearchAdsSearchTermViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested dynamic search ads search term view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.DynamicSearchAdsSearchTermView> getDynamicSearchAdsSearchTermView(
        com.google.ads.googleads.v9.services.GetDynamicSearchAdsSearchTermViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDynamicSearchAdsSearchTermViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DYNAMIC_SEARCH_ADS_SEARCH_TERM_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DynamicSearchAdsSearchTermViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DynamicSearchAdsSearchTermViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DYNAMIC_SEARCH_ADS_SEARCH_TERM_VIEW:
          serviceImpl.getDynamicSearchAdsSearchTermView((com.google.ads.googleads.v9.services.GetDynamicSearchAdsSearchTermViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.DynamicSearchAdsSearchTermView>) responseObserver);
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

  private static abstract class DynamicSearchAdsSearchTermViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DynamicSearchAdsSearchTermViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.DynamicSearchAdsSearchTermViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DynamicSearchAdsSearchTermViewService");
    }
  }

  private static final class DynamicSearchAdsSearchTermViewServiceFileDescriptorSupplier
      extends DynamicSearchAdsSearchTermViewServiceBaseDescriptorSupplier {
    DynamicSearchAdsSearchTermViewServiceFileDescriptorSupplier() {}
  }

  private static final class DynamicSearchAdsSearchTermViewServiceMethodDescriptorSupplier
      extends DynamicSearchAdsSearchTermViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DynamicSearchAdsSearchTermViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DynamicSearchAdsSearchTermViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DynamicSearchAdsSearchTermViewServiceFileDescriptorSupplier())
              .addMethod(getGetDynamicSearchAdsSearchTermViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
