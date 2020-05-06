package com.google.ads.googleads.v3.services;

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
 * Service to manage user data uploads.
 * Accessible to whitelisted customers only.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/user_data_service.proto")
public final class UserDataServiceGrpc {

  private UserDataServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.UserDataService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUploadUserDataMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.UploadUserDataRequest,
      com.google.ads.googleads.v3.services.UploadUserDataResponse> METHOD_UPLOAD_USER_DATA = getUploadUserDataMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.UploadUserDataRequest,
      com.google.ads.googleads.v3.services.UploadUserDataResponse> getUploadUserDataMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.UploadUserDataRequest,
      com.google.ads.googleads.v3.services.UploadUserDataResponse> getUploadUserDataMethod() {
    return getUploadUserDataMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.UploadUserDataRequest,
      com.google.ads.googleads.v3.services.UploadUserDataResponse> getUploadUserDataMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.UploadUserDataRequest, com.google.ads.googleads.v3.services.UploadUserDataResponse> getUploadUserDataMethod;
    if ((getUploadUserDataMethod = UserDataServiceGrpc.getUploadUserDataMethod) == null) {
      synchronized (UserDataServiceGrpc.class) {
        if ((getUploadUserDataMethod = UserDataServiceGrpc.getUploadUserDataMethod) == null) {
          UserDataServiceGrpc.getUploadUserDataMethod = getUploadUserDataMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.UploadUserDataRequest, com.google.ads.googleads.v3.services.UploadUserDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.UserDataService", "UploadUserData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.UploadUserDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.UploadUserDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserDataServiceMethodDescriptorSupplier("UploadUserData"))
                  .build();
          }
        }
     }
     return getUploadUserDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserDataServiceStub newStub(io.grpc.Channel channel) {
    return new UserDataServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserDataServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserDataServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage user data uploads.
   * Accessible to whitelisted customers only.
   * </pre>
   */
  public static abstract class UserDataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Uploads the given user data.
     * </pre>
     */
    public void uploadUserData(com.google.ads.googleads.v3.services.UploadUserDataRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.UploadUserDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadUserDataMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadUserDataMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.UploadUserDataRequest,
                com.google.ads.googleads.v3.services.UploadUserDataResponse>(
                  this, METHODID_UPLOAD_USER_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage user data uploads.
   * Accessible to whitelisted customers only.
   * </pre>
   */
  public static final class UserDataServiceStub extends io.grpc.stub.AbstractStub<UserDataServiceStub> {
    private UserDataServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserDataServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserDataServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserDataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Uploads the given user data.
     * </pre>
     */
    public void uploadUserData(com.google.ads.googleads.v3.services.UploadUserDataRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.UploadUserDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadUserDataMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage user data uploads.
   * Accessible to whitelisted customers only.
   * </pre>
   */
  public static final class UserDataServiceBlockingStub extends io.grpc.stub.AbstractStub<UserDataServiceBlockingStub> {
    private UserDataServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserDataServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserDataServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserDataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Uploads the given user data.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.UploadUserDataResponse uploadUserData(com.google.ads.googleads.v3.services.UploadUserDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getUploadUserDataMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage user data uploads.
   * Accessible to whitelisted customers only.
   * </pre>
   */
  public static final class UserDataServiceFutureStub extends io.grpc.stub.AbstractStub<UserDataServiceFutureStub> {
    private UserDataServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserDataServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserDataServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserDataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Uploads the given user data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.UploadUserDataResponse> uploadUserData(
        com.google.ads.googleads.v3.services.UploadUserDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadUserDataMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_USER_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserDataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserDataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_USER_DATA:
          serviceImpl.uploadUserData((com.google.ads.googleads.v3.services.UploadUserDataRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.UploadUserDataResponse>) responseObserver);
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

  private static abstract class UserDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v3.services.UserDataServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserDataService");
    }
  }

  private static final class UserDataServiceFileDescriptorSupplier
      extends UserDataServiceBaseDescriptorSupplier {
    UserDataServiceFileDescriptorSupplier() {}
  }

  private static final class UserDataServiceMethodDescriptorSupplier
      extends UserDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserDataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserDataServiceFileDescriptorSupplier())
              .addMethod(getUploadUserDataMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
