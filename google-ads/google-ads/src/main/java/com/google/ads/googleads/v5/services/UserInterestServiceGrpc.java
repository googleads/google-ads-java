package com.google.ads.googleads.v5.services;

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
 * Service to fetch Google Ads User Interest.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v5/services/user_interest_service.proto")
public final class UserInterestServiceGrpc {

  private UserInterestServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v5.services.UserInterestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetUserInterestRequest,
      com.google.ads.googleads.v5.resources.UserInterest> getGetUserInterestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserInterest",
      requestType = com.google.ads.googleads.v5.services.GetUserInterestRequest.class,
      responseType = com.google.ads.googleads.v5.resources.UserInterest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetUserInterestRequest,
      com.google.ads.googleads.v5.resources.UserInterest> getGetUserInterestMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v5.services.GetUserInterestRequest, com.google.ads.googleads.v5.resources.UserInterest> getGetUserInterestMethod;
    if ((getGetUserInterestMethod = UserInterestServiceGrpc.getGetUserInterestMethod) == null) {
      synchronized (UserInterestServiceGrpc.class) {
        if ((getGetUserInterestMethod = UserInterestServiceGrpc.getGetUserInterestMethod) == null) {
          UserInterestServiceGrpc.getGetUserInterestMethod = getGetUserInterestMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v5.services.GetUserInterestRequest, com.google.ads.googleads.v5.resources.UserInterest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserInterest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.services.GetUserInterestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v5.resources.UserInterest.getDefaultInstance()))
              .setSchemaDescriptor(new UserInterestServiceMethodDescriptorSupplier("GetUserInterest"))
              .build();
        }
      }
    }
    return getGetUserInterestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserInterestServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserInterestServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserInterestServiceStub>() {
        @java.lang.Override
        public UserInterestServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserInterestServiceStub(channel, callOptions);
        }
      };
    return UserInterestServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserInterestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserInterestServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserInterestServiceBlockingStub>() {
        @java.lang.Override
        public UserInterestServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserInterestServiceBlockingStub(channel, callOptions);
        }
      };
    return UserInterestServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserInterestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserInterestServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserInterestServiceFutureStub>() {
        @java.lang.Override
        public UserInterestServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserInterestServiceFutureStub(channel, callOptions);
        }
      };
    return UserInterestServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch Google Ads User Interest.
   * </pre>
   */
  public static abstract class UserInterestServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested user interest in full detail
     * </pre>
     */
    public void getUserInterest(com.google.ads.googleads.v5.services.GetUserInterestRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.UserInterest> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserInterestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserInterestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v5.services.GetUserInterestRequest,
                com.google.ads.googleads.v5.resources.UserInterest>(
                  this, METHODID_GET_USER_INTEREST)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch Google Ads User Interest.
   * </pre>
   */
  public static final class UserInterestServiceStub extends io.grpc.stub.AbstractAsyncStub<UserInterestServiceStub> {
    private UserInterestServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserInterestServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserInterestServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested user interest in full detail
     * </pre>
     */
    public void getUserInterest(com.google.ads.googleads.v5.services.GetUserInterestRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.UserInterest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserInterestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch Google Ads User Interest.
   * </pre>
   */
  public static final class UserInterestServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserInterestServiceBlockingStub> {
    private UserInterestServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserInterestServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserInterestServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested user interest in full detail
     * </pre>
     */
    public com.google.ads.googleads.v5.resources.UserInterest getUserInterest(com.google.ads.googleads.v5.services.GetUserInterestRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserInterestMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch Google Ads User Interest.
   * </pre>
   */
  public static final class UserInterestServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserInterestServiceFutureStub> {
    private UserInterestServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserInterestServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserInterestServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested user interest in full detail
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v5.resources.UserInterest> getUserInterest(
        com.google.ads.googleads.v5.services.GetUserInterestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserInterestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_INTEREST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserInterestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserInterestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_INTEREST:
          serviceImpl.getUserInterest((com.google.ads.googleads.v5.services.GetUserInterestRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v5.resources.UserInterest>) responseObserver);
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

  private static abstract class UserInterestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserInterestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v5.services.UserInterestServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserInterestService");
    }
  }

  private static final class UserInterestServiceFileDescriptorSupplier
      extends UserInterestServiceBaseDescriptorSupplier {
    UserInterestServiceFileDescriptorSupplier() {}
  }

  private static final class UserInterestServiceMethodDescriptorSupplier
      extends UserInterestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserInterestServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserInterestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserInterestServiceFileDescriptorSupplier())
              .addMethod(getGetUserInterestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
