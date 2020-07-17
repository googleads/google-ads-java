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
 * Service to manage user location views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/user_location_view_service.proto")
public final class UserLocationViewServiceGrpc {

  private UserLocationViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.UserLocationViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetUserLocationViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetUserLocationViewRequest,
      com.google.ads.googleads.v4.resources.UserLocationView> METHOD_GET_USER_LOCATION_VIEW = getGetUserLocationViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetUserLocationViewRequest,
      com.google.ads.googleads.v4.resources.UserLocationView> getGetUserLocationViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetUserLocationViewRequest,
      com.google.ads.googleads.v4.resources.UserLocationView> getGetUserLocationViewMethod() {
    return getGetUserLocationViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetUserLocationViewRequest,
      com.google.ads.googleads.v4.resources.UserLocationView> getGetUserLocationViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetUserLocationViewRequest, com.google.ads.googleads.v4.resources.UserLocationView> getGetUserLocationViewMethod;
    if ((getGetUserLocationViewMethod = UserLocationViewServiceGrpc.getGetUserLocationViewMethod) == null) {
      synchronized (UserLocationViewServiceGrpc.class) {
        if ((getGetUserLocationViewMethod = UserLocationViewServiceGrpc.getGetUserLocationViewMethod) == null) {
          UserLocationViewServiceGrpc.getGetUserLocationViewMethod = getGetUserLocationViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetUserLocationViewRequest, com.google.ads.googleads.v4.resources.UserLocationView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.UserLocationViewService", "GetUserLocationView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetUserLocationViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.UserLocationView.getDefaultInstance()))
                  .setSchemaDescriptor(new UserLocationViewServiceMethodDescriptorSupplier("GetUserLocationView"))
                  .build();
          }
        }
     }
     return getGetUserLocationViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserLocationViewServiceStub newStub(io.grpc.Channel channel) {
    return new UserLocationViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserLocationViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserLocationViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserLocationViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserLocationViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage user location views.
   * </pre>
   */
  public static abstract class UserLocationViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested user location view in full detail.
     * </pre>
     */
    public void getUserLocationView(com.google.ads.googleads.v4.services.GetUserLocationViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.UserLocationView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserLocationViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserLocationViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetUserLocationViewRequest,
                com.google.ads.googleads.v4.resources.UserLocationView>(
                  this, METHODID_GET_USER_LOCATION_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage user location views.
   * </pre>
   */
  public static final class UserLocationViewServiceStub extends io.grpc.stub.AbstractStub<UserLocationViewServiceStub> {
    private UserLocationViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserLocationViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserLocationViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserLocationViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested user location view in full detail.
     * </pre>
     */
    public void getUserLocationView(com.google.ads.googleads.v4.services.GetUserLocationViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.UserLocationView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserLocationViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage user location views.
   * </pre>
   */
  public static final class UserLocationViewServiceBlockingStub extends io.grpc.stub.AbstractStub<UserLocationViewServiceBlockingStub> {
    private UserLocationViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserLocationViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserLocationViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserLocationViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested user location view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.UserLocationView getUserLocationView(com.google.ads.googleads.v4.services.GetUserLocationViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserLocationViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage user location views.
   * </pre>
   */
  public static final class UserLocationViewServiceFutureStub extends io.grpc.stub.AbstractStub<UserLocationViewServiceFutureStub> {
    private UserLocationViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserLocationViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserLocationViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserLocationViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested user location view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.UserLocationView> getUserLocationView(
        com.google.ads.googleads.v4.services.GetUserLocationViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserLocationViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_LOCATION_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserLocationViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserLocationViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_LOCATION_VIEW:
          serviceImpl.getUserLocationView((com.google.ads.googleads.v4.services.GetUserLocationViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.UserLocationView>) responseObserver);
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

  private static abstract class UserLocationViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserLocationViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.UserLocationViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserLocationViewService");
    }
  }

  private static final class UserLocationViewServiceFileDescriptorSupplier
      extends UserLocationViewServiceBaseDescriptorSupplier {
    UserLocationViewServiceFileDescriptorSupplier() {}
  }

  private static final class UserLocationViewServiceMethodDescriptorSupplier
      extends UserLocationViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserLocationViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserLocationViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserLocationViewServiceFileDescriptorSupplier())
              .addMethod(getGetUserLocationViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
