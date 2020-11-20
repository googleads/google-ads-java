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
 * Service to manage custom audiences.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/custom_audience_service.proto")
public final class CustomAudienceServiceGrpc {

  private CustomAudienceServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.CustomAudienceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCustomAudienceRequest,
      com.google.ads.googleads.v6.resources.CustomAudience> getGetCustomAudienceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomAudience",
      requestType = com.google.ads.googleads.v6.services.GetCustomAudienceRequest.class,
      responseType = com.google.ads.googleads.v6.resources.CustomAudience.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCustomAudienceRequest,
      com.google.ads.googleads.v6.resources.CustomAudience> getGetCustomAudienceMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetCustomAudienceRequest, com.google.ads.googleads.v6.resources.CustomAudience> getGetCustomAudienceMethod;
    if ((getGetCustomAudienceMethod = CustomAudienceServiceGrpc.getGetCustomAudienceMethod) == null) {
      synchronized (CustomAudienceServiceGrpc.class) {
        if ((getGetCustomAudienceMethod = CustomAudienceServiceGrpc.getGetCustomAudienceMethod) == null) {
          CustomAudienceServiceGrpc.getGetCustomAudienceMethod = getGetCustomAudienceMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetCustomAudienceRequest, com.google.ads.googleads.v6.resources.CustomAudience>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomAudience"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetCustomAudienceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.CustomAudience.getDefaultInstance()))
              .setSchemaDescriptor(new CustomAudienceServiceMethodDescriptorSupplier("GetCustomAudience"))
              .build();
        }
      }
    }
    return getGetCustomAudienceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCustomAudiencesRequest,
      com.google.ads.googleads.v6.services.MutateCustomAudiencesResponse> getMutateCustomAudiencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomAudiences",
      requestType = com.google.ads.googleads.v6.services.MutateCustomAudiencesRequest.class,
      responseType = com.google.ads.googleads.v6.services.MutateCustomAudiencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCustomAudiencesRequest,
      com.google.ads.googleads.v6.services.MutateCustomAudiencesResponse> getMutateCustomAudiencesMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateCustomAudiencesRequest, com.google.ads.googleads.v6.services.MutateCustomAudiencesResponse> getMutateCustomAudiencesMethod;
    if ((getMutateCustomAudiencesMethod = CustomAudienceServiceGrpc.getMutateCustomAudiencesMethod) == null) {
      synchronized (CustomAudienceServiceGrpc.class) {
        if ((getMutateCustomAudiencesMethod = CustomAudienceServiceGrpc.getMutateCustomAudiencesMethod) == null) {
          CustomAudienceServiceGrpc.getMutateCustomAudiencesMethod = getMutateCustomAudiencesMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.MutateCustomAudiencesRequest, com.google.ads.googleads.v6.services.MutateCustomAudiencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomAudiences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateCustomAudiencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateCustomAudiencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomAudienceServiceMethodDescriptorSupplier("MutateCustomAudiences"))
              .build();
        }
      }
    }
    return getMutateCustomAudiencesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomAudienceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomAudienceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomAudienceServiceStub>() {
        @java.lang.Override
        public CustomAudienceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomAudienceServiceStub(channel, callOptions);
        }
      };
    return CustomAudienceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomAudienceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomAudienceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomAudienceServiceBlockingStub>() {
        @java.lang.Override
        public CustomAudienceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomAudienceServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomAudienceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomAudienceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomAudienceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomAudienceServiceFutureStub>() {
        @java.lang.Override
        public CustomAudienceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomAudienceServiceFutureStub(channel, callOptions);
        }
      };
    return CustomAudienceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage custom audiences.
   * </pre>
   */
  public static abstract class CustomAudienceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested custom audience in full detail.
     * </pre>
     */
    public void getCustomAudience(com.google.ads.googleads.v6.services.GetCustomAudienceRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.CustomAudience> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomAudienceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates or updates custom audiences. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomAudiences(com.google.ads.googleads.v6.services.MutateCustomAudiencesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCustomAudiencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCustomAudiencesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomAudienceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetCustomAudienceRequest,
                com.google.ads.googleads.v6.resources.CustomAudience>(
                  this, METHODID_GET_CUSTOM_AUDIENCE)))
          .addMethod(
            getMutateCustomAudiencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.MutateCustomAudiencesRequest,
                com.google.ads.googleads.v6.services.MutateCustomAudiencesResponse>(
                  this, METHODID_MUTATE_CUSTOM_AUDIENCES)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage custom audiences.
   * </pre>
   */
  public static final class CustomAudienceServiceStub extends io.grpc.stub.AbstractAsyncStub<CustomAudienceServiceStub> {
    private CustomAudienceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomAudienceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomAudienceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested custom audience in full detail.
     * </pre>
     */
    public void getCustomAudience(com.google.ads.googleads.v6.services.GetCustomAudienceRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.CustomAudience> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomAudienceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or updates custom audiences. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomAudiences(com.google.ads.googleads.v6.services.MutateCustomAudiencesRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCustomAudiencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCustomAudiencesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage custom audiences.
   * </pre>
   */
  public static final class CustomAudienceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CustomAudienceServiceBlockingStub> {
    private CustomAudienceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomAudienceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomAudienceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested custom audience in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.CustomAudience getCustomAudience(com.google.ads.googleads.v6.services.GetCustomAudienceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomAudienceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or updates custom audiences. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.MutateCustomAudiencesResponse mutateCustomAudiences(com.google.ads.googleads.v6.services.MutateCustomAudiencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCustomAudiencesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage custom audiences.
   * </pre>
   */
  public static final class CustomAudienceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CustomAudienceServiceFutureStub> {
    private CustomAudienceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomAudienceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomAudienceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested custom audience in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.CustomAudience> getCustomAudience(
        com.google.ads.googleads.v6.services.GetCustomAudienceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomAudienceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or updates custom audiences. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.MutateCustomAudiencesResponse> mutateCustomAudiences(
        com.google.ads.googleads.v6.services.MutateCustomAudiencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCustomAudiencesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOM_AUDIENCE = 0;
  private static final int METHODID_MUTATE_CUSTOM_AUDIENCES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomAudienceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomAudienceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOM_AUDIENCE:
          serviceImpl.getCustomAudience((com.google.ads.googleads.v6.services.GetCustomAudienceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.CustomAudience>) responseObserver);
          break;
        case METHODID_MUTATE_CUSTOM_AUDIENCES:
          serviceImpl.mutateCustomAudiences((com.google.ads.googleads.v6.services.MutateCustomAudiencesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateCustomAudiencesResponse>) responseObserver);
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

  private static abstract class CustomAudienceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomAudienceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.CustomAudienceServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomAudienceService");
    }
  }

  private static final class CustomAudienceServiceFileDescriptorSupplier
      extends CustomAudienceServiceBaseDescriptorSupplier {
    CustomAudienceServiceFileDescriptorSupplier() {}
  }

  private static final class CustomAudienceServiceMethodDescriptorSupplier
      extends CustomAudienceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomAudienceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomAudienceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomAudienceServiceFileDescriptorSupplier())
              .addMethod(getGetCustomAudienceMethod())
              .addMethod(getMutateCustomAudiencesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
