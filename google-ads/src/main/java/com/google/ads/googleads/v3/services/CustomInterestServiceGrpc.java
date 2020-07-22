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
 * Service to manage custom interests.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v3/services/custom_interest_service.proto")
public final class CustomInterestServiceGrpc {

  private CustomInterestServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.CustomInterestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetCustomInterestRequest,
      com.google.ads.googleads.v3.resources.CustomInterest> getGetCustomInterestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomInterest",
      requestType = com.google.ads.googleads.v3.services.GetCustomInterestRequest.class,
      responseType = com.google.ads.googleads.v3.resources.CustomInterest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetCustomInterestRequest,
      com.google.ads.googleads.v3.resources.CustomInterest> getGetCustomInterestMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetCustomInterestRequest, com.google.ads.googleads.v3.resources.CustomInterest> getGetCustomInterestMethod;
    if ((getGetCustomInterestMethod = CustomInterestServiceGrpc.getGetCustomInterestMethod) == null) {
      synchronized (CustomInterestServiceGrpc.class) {
        if ((getGetCustomInterestMethod = CustomInterestServiceGrpc.getGetCustomInterestMethod) == null) {
          CustomInterestServiceGrpc.getGetCustomInterestMethod = getGetCustomInterestMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetCustomInterestRequest, com.google.ads.googleads.v3.resources.CustomInterest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomInterest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetCustomInterestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.CustomInterest.getDefaultInstance()))
              .setSchemaDescriptor(new CustomInterestServiceMethodDescriptorSupplier("GetCustomInterest"))
              .build();
        }
      }
    }
    return getGetCustomInterestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateCustomInterestsRequest,
      com.google.ads.googleads.v3.services.MutateCustomInterestsResponse> getMutateCustomInterestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateCustomInterests",
      requestType = com.google.ads.googleads.v3.services.MutateCustomInterestsRequest.class,
      responseType = com.google.ads.googleads.v3.services.MutateCustomInterestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateCustomInterestsRequest,
      com.google.ads.googleads.v3.services.MutateCustomInterestsResponse> getMutateCustomInterestsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateCustomInterestsRequest, com.google.ads.googleads.v3.services.MutateCustomInterestsResponse> getMutateCustomInterestsMethod;
    if ((getMutateCustomInterestsMethod = CustomInterestServiceGrpc.getMutateCustomInterestsMethod) == null) {
      synchronized (CustomInterestServiceGrpc.class) {
        if ((getMutateCustomInterestsMethod = CustomInterestServiceGrpc.getMutateCustomInterestsMethod) == null) {
          CustomInterestServiceGrpc.getMutateCustomInterestsMethod = getMutateCustomInterestsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.MutateCustomInterestsRequest, com.google.ads.googleads.v3.services.MutateCustomInterestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateCustomInterests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateCustomInterestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateCustomInterestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomInterestServiceMethodDescriptorSupplier("MutateCustomInterests"))
              .build();
        }
      }
    }
    return getMutateCustomInterestsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomInterestServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomInterestServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomInterestServiceStub>() {
        @java.lang.Override
        public CustomInterestServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomInterestServiceStub(channel, callOptions);
        }
      };
    return CustomInterestServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomInterestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomInterestServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomInterestServiceBlockingStub>() {
        @java.lang.Override
        public CustomInterestServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomInterestServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomInterestServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomInterestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomInterestServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomInterestServiceFutureStub>() {
        @java.lang.Override
        public CustomInterestServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomInterestServiceFutureStub(channel, callOptions);
        }
      };
    return CustomInterestServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage custom interests.
   * </pre>
   */
  public static abstract class CustomInterestServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested custom interest in full detail.
     * </pre>
     */
    public void getCustomInterest(com.google.ads.googleads.v3.services.GetCustomInterestRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.CustomInterest> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomInterestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates or updates custom interests. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomInterests(com.google.ads.googleads.v3.services.MutateCustomInterestsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateCustomInterestsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCustomInterestsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomInterestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetCustomInterestRequest,
                com.google.ads.googleads.v3.resources.CustomInterest>(
                  this, METHODID_GET_CUSTOM_INTEREST)))
          .addMethod(
            getMutateCustomInterestsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.MutateCustomInterestsRequest,
                com.google.ads.googleads.v3.services.MutateCustomInterestsResponse>(
                  this, METHODID_MUTATE_CUSTOM_INTERESTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage custom interests.
   * </pre>
   */
  public static final class CustomInterestServiceStub extends io.grpc.stub.AbstractAsyncStub<CustomInterestServiceStub> {
    private CustomInterestServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomInterestServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomInterestServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested custom interest in full detail.
     * </pre>
     */
    public void getCustomInterest(com.google.ads.googleads.v3.services.GetCustomInterestRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.CustomInterest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomInterestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or updates custom interests. Operation statuses are returned.
     * </pre>
     */
    public void mutateCustomInterests(com.google.ads.googleads.v3.services.MutateCustomInterestsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateCustomInterestsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCustomInterestsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage custom interests.
   * </pre>
   */
  public static final class CustomInterestServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CustomInterestServiceBlockingStub> {
    private CustomInterestServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomInterestServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomInterestServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested custom interest in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.CustomInterest getCustomInterest(com.google.ads.googleads.v3.services.GetCustomInterestRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomInterestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or updates custom interests. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.MutateCustomInterestsResponse mutateCustomInterests(com.google.ads.googleads.v3.services.MutateCustomInterestsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCustomInterestsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage custom interests.
   * </pre>
   */
  public static final class CustomInterestServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CustomInterestServiceFutureStub> {
    private CustomInterestServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomInterestServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomInterestServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested custom interest in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.CustomInterest> getCustomInterest(
        com.google.ads.googleads.v3.services.GetCustomInterestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomInterestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or updates custom interests. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.MutateCustomInterestsResponse> mutateCustomInterests(
        com.google.ads.googleads.v3.services.MutateCustomInterestsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCustomInterestsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOM_INTEREST = 0;
  private static final int METHODID_MUTATE_CUSTOM_INTERESTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomInterestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomInterestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOM_INTEREST:
          serviceImpl.getCustomInterest((com.google.ads.googleads.v3.services.GetCustomInterestRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.CustomInterest>) responseObserver);
          break;
        case METHODID_MUTATE_CUSTOM_INTERESTS:
          serviceImpl.mutateCustomInterests((com.google.ads.googleads.v3.services.MutateCustomInterestsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateCustomInterestsResponse>) responseObserver);
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

  private static abstract class CustomInterestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomInterestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v3.services.CustomInterestServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomInterestService");
    }
  }

  private static final class CustomInterestServiceFileDescriptorSupplier
      extends CustomInterestServiceBaseDescriptorSupplier {
    CustomInterestServiceFileDescriptorSupplier() {}
  }

  private static final class CustomInterestServiceMethodDescriptorSupplier
      extends CustomInterestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomInterestServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomInterestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomInterestServiceFileDescriptorSupplier())
              .addMethod(getGetCustomInterestMethod())
              .addMethod(getMutateCustomInterestsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
