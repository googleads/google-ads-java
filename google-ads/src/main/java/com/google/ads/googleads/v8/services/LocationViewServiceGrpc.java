package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch location views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/location_view_service.proto")
public final class LocationViewServiceGrpc {

  private LocationViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.LocationViewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetLocationViewRequest,
      com.google.ads.googleads.v8.resources.LocationView> getGetLocationViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLocationView",
      requestType = com.google.ads.googleads.v8.services.GetLocationViewRequest.class,
      responseType = com.google.ads.googleads.v8.resources.LocationView.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetLocationViewRequest,
      com.google.ads.googleads.v8.resources.LocationView> getGetLocationViewMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetLocationViewRequest, com.google.ads.googleads.v8.resources.LocationView> getGetLocationViewMethod;
    if ((getGetLocationViewMethod = LocationViewServiceGrpc.getGetLocationViewMethod) == null) {
      synchronized (LocationViewServiceGrpc.class) {
        if ((getGetLocationViewMethod = LocationViewServiceGrpc.getGetLocationViewMethod) == null) {
          LocationViewServiceGrpc.getGetLocationViewMethod = getGetLocationViewMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetLocationViewRequest, com.google.ads.googleads.v8.resources.LocationView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLocationView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetLocationViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.LocationView.getDefaultInstance()))
              .setSchemaDescriptor(new LocationViewServiceMethodDescriptorSupplier("GetLocationView"))
              .build();
        }
      }
    }
    return getGetLocationViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LocationViewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationViewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationViewServiceStub>() {
        @java.lang.Override
        public LocationViewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationViewServiceStub(channel, callOptions);
        }
      };
    return LocationViewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocationViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationViewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationViewServiceBlockingStub>() {
        @java.lang.Override
        public LocationViewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationViewServiceBlockingStub(channel, callOptions);
        }
      };
    return LocationViewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocationViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationViewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationViewServiceFutureStub>() {
        @java.lang.Override
        public LocationViewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationViewServiceFutureStub(channel, callOptions);
        }
      };
    return LocationViewServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch location views.
   * </pre>
   */
  public static abstract class LocationViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested location view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getLocationView(com.google.ads.googleads.v8.services.GetLocationViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.LocationView> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocationViewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLocationViewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetLocationViewRequest,
                com.google.ads.googleads.v8.resources.LocationView>(
                  this, METHODID_GET_LOCATION_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch location views.
   * </pre>
   */
  public static final class LocationViewServiceStub extends io.grpc.stub.AbstractAsyncStub<LocationViewServiceStub> {
    private LocationViewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationViewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested location view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void getLocationView(com.google.ads.googleads.v8.services.GetLocationViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.LocationView> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLocationViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch location views.
   * </pre>
   */
  public static final class LocationViewServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LocationViewServiceBlockingStub> {
    private LocationViewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationViewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested location view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.LocationView getLocationView(com.google.ads.googleads.v8.services.GetLocationViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLocationViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch location views.
   * </pre>
   */
  public static final class LocationViewServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LocationViewServiceFutureStub> {
    private LocationViewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationViewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested location view in full detail.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.LocationView> getLocationView(
        com.google.ads.googleads.v8.services.GetLocationViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLocationViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LOCATION_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LocationViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LocationViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LOCATION_VIEW:
          serviceImpl.getLocationView((com.google.ads.googleads.v8.services.GetLocationViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.LocationView>) responseObserver);
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

  private static abstract class LocationViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LocationViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.LocationViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LocationViewService");
    }
  }

  private static final class LocationViewServiceFileDescriptorSupplier
      extends LocationViewServiceBaseDescriptorSupplier {
    LocationViewServiceFileDescriptorSupplier() {}
  }

  private static final class LocationViewServiceMethodDescriptorSupplier
      extends LocationViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LocationViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LocationViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LocationViewServiceFileDescriptorSupplier())
              .addMethod(getGetLocationViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
