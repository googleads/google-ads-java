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
 * Service to fetch location views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v2/services/location_view_service.proto")
public final class LocationViewServiceGrpc {

  private LocationViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.LocationViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetLocationViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetLocationViewRequest,
      com.google.ads.googleads.v2.resources.LocationView> METHOD_GET_LOCATION_VIEW = getGetLocationViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetLocationViewRequest,
      com.google.ads.googleads.v2.resources.LocationView> getGetLocationViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetLocationViewRequest,
      com.google.ads.googleads.v2.resources.LocationView> getGetLocationViewMethod() {
    return getGetLocationViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetLocationViewRequest,
      com.google.ads.googleads.v2.resources.LocationView> getGetLocationViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetLocationViewRequest, com.google.ads.googleads.v2.resources.LocationView> getGetLocationViewMethod;
    if ((getGetLocationViewMethod = LocationViewServiceGrpc.getGetLocationViewMethod) == null) {
      synchronized (LocationViewServiceGrpc.class) {
        if ((getGetLocationViewMethod = LocationViewServiceGrpc.getGetLocationViewMethod) == null) {
          LocationViewServiceGrpc.getGetLocationViewMethod = getGetLocationViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetLocationViewRequest, com.google.ads.googleads.v2.resources.LocationView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.LocationViewService", "GetLocationView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetLocationViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.LocationView.getDefaultInstance()))
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
    return new LocationViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocationViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LocationViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocationViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LocationViewServiceFutureStub(channel);
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
     * </pre>
     */
    public void getLocationView(com.google.ads.googleads.v2.services.GetLocationViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.LocationView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLocationViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLocationViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetLocationViewRequest,
                com.google.ads.googleads.v2.resources.LocationView>(
                  this, METHODID_GET_LOCATION_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch location views.
   * </pre>
   */
  public static final class LocationViewServiceStub extends io.grpc.stub.AbstractStub<LocationViewServiceStub> {
    private LocationViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocationViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocationViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested location view in full detail.
     * </pre>
     */
    public void getLocationView(com.google.ads.googleads.v2.services.GetLocationViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.LocationView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLocationViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch location views.
   * </pre>
   */
  public static final class LocationViewServiceBlockingStub extends io.grpc.stub.AbstractStub<LocationViewServiceBlockingStub> {
    private LocationViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocationViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocationViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested location view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.LocationView getLocationView(com.google.ads.googleads.v2.services.GetLocationViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLocationViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch location views.
   * </pre>
   */
  public static final class LocationViewServiceFutureStub extends io.grpc.stub.AbstractStub<LocationViewServiceFutureStub> {
    private LocationViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocationViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocationViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested location view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.LocationView> getLocationView(
        com.google.ads.googleads.v2.services.GetLocationViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLocationViewMethodHelper(), getCallOptions()), request);
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
          serviceImpl.getLocationView((com.google.ads.googleads.v2.services.GetLocationViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.LocationView>) responseObserver);
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
      return com.google.ads.googleads.v2.services.LocationViewServiceProto.getDescriptor();
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
              .addMethod(getGetLocationViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
