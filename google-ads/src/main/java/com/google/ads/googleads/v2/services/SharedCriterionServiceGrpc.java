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
 * Service to manage shared criteria.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v2/services/shared_criterion_service.proto")
public final class SharedCriterionServiceGrpc {

  private SharedCriterionServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.SharedCriterionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetSharedCriterionRequest,
      com.google.ads.googleads.v2.resources.SharedCriterion> getGetSharedCriterionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSharedCriterion",
      requestType = com.google.ads.googleads.v2.services.GetSharedCriterionRequest.class,
      responseType = com.google.ads.googleads.v2.resources.SharedCriterion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetSharedCriterionRequest,
      com.google.ads.googleads.v2.resources.SharedCriterion> getGetSharedCriterionMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetSharedCriterionRequest, com.google.ads.googleads.v2.resources.SharedCriterion> getGetSharedCriterionMethod;
    if ((getGetSharedCriterionMethod = SharedCriterionServiceGrpc.getGetSharedCriterionMethod) == null) {
      synchronized (SharedCriterionServiceGrpc.class) {
        if ((getGetSharedCriterionMethod = SharedCriterionServiceGrpc.getGetSharedCriterionMethod) == null) {
          SharedCriterionServiceGrpc.getGetSharedCriterionMethod = getGetSharedCriterionMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetSharedCriterionRequest, com.google.ads.googleads.v2.resources.SharedCriterion>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSharedCriterion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetSharedCriterionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.SharedCriterion.getDefaultInstance()))
              .setSchemaDescriptor(new SharedCriterionServiceMethodDescriptorSupplier("GetSharedCriterion"))
              .build();
        }
      }
    }
    return getGetSharedCriterionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateSharedCriteriaRequest,
      com.google.ads.googleads.v2.services.MutateSharedCriteriaResponse> getMutateSharedCriteriaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateSharedCriteria",
      requestType = com.google.ads.googleads.v2.services.MutateSharedCriteriaRequest.class,
      responseType = com.google.ads.googleads.v2.services.MutateSharedCriteriaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateSharedCriteriaRequest,
      com.google.ads.googleads.v2.services.MutateSharedCriteriaResponse> getMutateSharedCriteriaMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateSharedCriteriaRequest, com.google.ads.googleads.v2.services.MutateSharedCriteriaResponse> getMutateSharedCriteriaMethod;
    if ((getMutateSharedCriteriaMethod = SharedCriterionServiceGrpc.getMutateSharedCriteriaMethod) == null) {
      synchronized (SharedCriterionServiceGrpc.class) {
        if ((getMutateSharedCriteriaMethod = SharedCriterionServiceGrpc.getMutateSharedCriteriaMethod) == null) {
          SharedCriterionServiceGrpc.getMutateSharedCriteriaMethod = getMutateSharedCriteriaMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.MutateSharedCriteriaRequest, com.google.ads.googleads.v2.services.MutateSharedCriteriaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateSharedCriteria"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateSharedCriteriaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateSharedCriteriaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SharedCriterionServiceMethodDescriptorSupplier("MutateSharedCriteria"))
              .build();
        }
      }
    }
    return getMutateSharedCriteriaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SharedCriterionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SharedCriterionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SharedCriterionServiceStub>() {
        @java.lang.Override
        public SharedCriterionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SharedCriterionServiceStub(channel, callOptions);
        }
      };
    return SharedCriterionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SharedCriterionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SharedCriterionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SharedCriterionServiceBlockingStub>() {
        @java.lang.Override
        public SharedCriterionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SharedCriterionServiceBlockingStub(channel, callOptions);
        }
      };
    return SharedCriterionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SharedCriterionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SharedCriterionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SharedCriterionServiceFutureStub>() {
        @java.lang.Override
        public SharedCriterionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SharedCriterionServiceFutureStub(channel, callOptions);
        }
      };
    return SharedCriterionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage shared criteria.
   * </pre>
   */
  public static abstract class SharedCriterionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested shared criterion in full detail.
     * </pre>
     */
    public void getSharedCriterion(com.google.ads.googleads.v2.services.GetSharedCriterionRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.SharedCriterion> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSharedCriterionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates or removes shared criteria. Operation statuses are returned.
     * </pre>
     */
    public void mutateSharedCriteria(com.google.ads.googleads.v2.services.MutateSharedCriteriaRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateSharedCriteriaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateSharedCriteriaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSharedCriterionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetSharedCriterionRequest,
                com.google.ads.googleads.v2.resources.SharedCriterion>(
                  this, METHODID_GET_SHARED_CRITERION)))
          .addMethod(
            getMutateSharedCriteriaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.MutateSharedCriteriaRequest,
                com.google.ads.googleads.v2.services.MutateSharedCriteriaResponse>(
                  this, METHODID_MUTATE_SHARED_CRITERIA)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage shared criteria.
   * </pre>
   */
  public static final class SharedCriterionServiceStub extends io.grpc.stub.AbstractAsyncStub<SharedCriterionServiceStub> {
    private SharedCriterionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SharedCriterionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SharedCriterionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested shared criterion in full detail.
     * </pre>
     */
    public void getSharedCriterion(com.google.ads.googleads.v2.services.GetSharedCriterionRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.SharedCriterion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSharedCriterionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates or removes shared criteria. Operation statuses are returned.
     * </pre>
     */
    public void mutateSharedCriteria(com.google.ads.googleads.v2.services.MutateSharedCriteriaRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateSharedCriteriaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateSharedCriteriaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage shared criteria.
   * </pre>
   */
  public static final class SharedCriterionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SharedCriterionServiceBlockingStub> {
    private SharedCriterionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SharedCriterionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SharedCriterionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested shared criterion in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.SharedCriterion getSharedCriterion(com.google.ads.googleads.v2.services.GetSharedCriterionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSharedCriterionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates or removes shared criteria. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v2.services.MutateSharedCriteriaResponse mutateSharedCriteria(com.google.ads.googleads.v2.services.MutateSharedCriteriaRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateSharedCriteriaMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage shared criteria.
   * </pre>
   */
  public static final class SharedCriterionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SharedCriterionServiceFutureStub> {
    private SharedCriterionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SharedCriterionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SharedCriterionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested shared criterion in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.SharedCriterion> getSharedCriterion(
        com.google.ads.googleads.v2.services.GetSharedCriterionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSharedCriterionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates or removes shared criteria. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.services.MutateSharedCriteriaResponse> mutateSharedCriteria(
        com.google.ads.googleads.v2.services.MutateSharedCriteriaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateSharedCriteriaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SHARED_CRITERION = 0;
  private static final int METHODID_MUTATE_SHARED_CRITERIA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SharedCriterionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SharedCriterionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SHARED_CRITERION:
          serviceImpl.getSharedCriterion((com.google.ads.googleads.v2.services.GetSharedCriterionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.SharedCriterion>) responseObserver);
          break;
        case METHODID_MUTATE_SHARED_CRITERIA:
          serviceImpl.mutateSharedCriteria((com.google.ads.googleads.v2.services.MutateSharedCriteriaRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateSharedCriteriaResponse>) responseObserver);
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

  private static abstract class SharedCriterionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SharedCriterionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v2.services.SharedCriterionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SharedCriterionService");
    }
  }

  private static final class SharedCriterionServiceFileDescriptorSupplier
      extends SharedCriterionServiceBaseDescriptorSupplier {
    SharedCriterionServiceFileDescriptorSupplier() {}
  }

  private static final class SharedCriterionServiceMethodDescriptorSupplier
      extends SharedCriterionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SharedCriterionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SharedCriterionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SharedCriterionServiceFileDescriptorSupplier())
              .addMethod(getGetSharedCriterionMethod())
              .addMethod(getMutateSharedCriteriaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
