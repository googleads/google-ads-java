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
 * Service to manage ad group criteria.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/ad_group_criterion_service.proto")
public final class AdGroupCriterionServiceGrpc {

  private AdGroupCriterionServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.AdGroupCriterionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetAdGroupCriterionRequest,
      com.google.ads.googleads.v6.resources.AdGroupCriterion> getGetAdGroupCriterionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdGroupCriterion",
      requestType = com.google.ads.googleads.v6.services.GetAdGroupCriterionRequest.class,
      responseType = com.google.ads.googleads.v6.resources.AdGroupCriterion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetAdGroupCriterionRequest,
      com.google.ads.googleads.v6.resources.AdGroupCriterion> getGetAdGroupCriterionMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetAdGroupCriterionRequest, com.google.ads.googleads.v6.resources.AdGroupCriterion> getGetAdGroupCriterionMethod;
    if ((getGetAdGroupCriterionMethod = AdGroupCriterionServiceGrpc.getGetAdGroupCriterionMethod) == null) {
      synchronized (AdGroupCriterionServiceGrpc.class) {
        if ((getGetAdGroupCriterionMethod = AdGroupCriterionServiceGrpc.getGetAdGroupCriterionMethod) == null) {
          AdGroupCriterionServiceGrpc.getGetAdGroupCriterionMethod = getGetAdGroupCriterionMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetAdGroupCriterionRequest, com.google.ads.googleads.v6.resources.AdGroupCriterion>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdGroupCriterion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetAdGroupCriterionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.AdGroupCriterion.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupCriterionServiceMethodDescriptorSupplier("GetAdGroupCriterion"))
              .build();
        }
      }
    }
    return getGetAdGroupCriterionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest,
      com.google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse> getMutateAdGroupCriteriaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupCriteria",
      requestType = com.google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest.class,
      responseType = com.google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest,
      com.google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse> getMutateAdGroupCriteriaMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest, com.google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse> getMutateAdGroupCriteriaMethod;
    if ((getMutateAdGroupCriteriaMethod = AdGroupCriterionServiceGrpc.getMutateAdGroupCriteriaMethod) == null) {
      synchronized (AdGroupCriterionServiceGrpc.class) {
        if ((getMutateAdGroupCriteriaMethod = AdGroupCriterionServiceGrpc.getMutateAdGroupCriteriaMethod) == null) {
          AdGroupCriterionServiceGrpc.getMutateAdGroupCriteriaMethod = getMutateAdGroupCriteriaMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest, com.google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupCriteria"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupCriterionServiceMethodDescriptorSupplier("MutateAdGroupCriteria"))
              .build();
        }
      }
    }
    return getMutateAdGroupCriteriaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupCriterionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionServiceStub>() {
        @java.lang.Override
        public AdGroupCriterionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCriterionServiceStub(channel, callOptions);
        }
      };
    return AdGroupCriterionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupCriterionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupCriterionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCriterionServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupCriterionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupCriterionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionServiceFutureStub>() {
        @java.lang.Override
        public AdGroupCriterionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCriterionServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupCriterionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage ad group criteria.
   * </pre>
   */
  public static abstract class AdGroupCriterionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested criterion in full detail.
     * </pre>
     */
    public void getAdGroupCriterion(com.google.ads.googleads.v6.services.GetAdGroupCriterionRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.AdGroupCriterion> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdGroupCriterionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes criteria. Operation statuses are returned.
     * </pre>
     */
    public void mutateAdGroupCriteria(com.google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateAdGroupCriteriaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupCriterionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetAdGroupCriterionRequest,
                com.google.ads.googleads.v6.resources.AdGroupCriterion>(
                  this, METHODID_GET_AD_GROUP_CRITERION)))
          .addMethod(
            getMutateAdGroupCriteriaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest,
                com.google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse>(
                  this, METHODID_MUTATE_AD_GROUP_CRITERIA)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ad group criteria.
   * </pre>
   */
  public static final class AdGroupCriterionServiceStub extends io.grpc.stub.AbstractAsyncStub<AdGroupCriterionServiceStub> {
    private AdGroupCriterionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested criterion in full detail.
     * </pre>
     */
    public void getAdGroupCriterion(com.google.ads.googleads.v6.services.GetAdGroupCriterionRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.AdGroupCriterion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdGroupCriterionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes criteria. Operation statuses are returned.
     * </pre>
     */
    public void mutateAdGroupCriteria(com.google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupCriteriaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ad group criteria.
   * </pre>
   */
  public static final class AdGroupCriterionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AdGroupCriterionServiceBlockingStub> {
    private AdGroupCriterionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested criterion in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.AdGroupCriterion getAdGroupCriterion(com.google.ads.googleads.v6.services.GetAdGroupCriterionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdGroupCriterionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes criteria. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse mutateAdGroupCriteria(com.google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateAdGroupCriteriaMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ad group criteria.
   * </pre>
   */
  public static final class AdGroupCriterionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AdGroupCriterionServiceFutureStub> {
    private AdGroupCriterionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested criterion in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.AdGroupCriterion> getAdGroupCriterion(
        com.google.ads.googleads.v6.services.GetAdGroupCriterionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdGroupCriterionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes criteria. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse> mutateAdGroupCriteria(
        com.google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateAdGroupCriteriaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP_CRITERION = 0;
  private static final int METHODID_MUTATE_AD_GROUP_CRITERIA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupCriterionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupCriterionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP_CRITERION:
          serviceImpl.getAdGroupCriterion((com.google.ads.googleads.v6.services.GetAdGroupCriterionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.AdGroupCriterion>) responseObserver);
          break;
        case METHODID_MUTATE_AD_GROUP_CRITERIA:
          serviceImpl.mutateAdGroupCriteria((com.google.ads.googleads.v6.services.MutateAdGroupCriteriaRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse>) responseObserver);
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

  private static abstract class AdGroupCriterionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupCriterionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v6.services.AdGroupCriterionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupCriterionService");
    }
  }

  private static final class AdGroupCriterionServiceFileDescriptorSupplier
      extends AdGroupCriterionServiceBaseDescriptorSupplier {
    AdGroupCriterionServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupCriterionServiceMethodDescriptorSupplier
      extends AdGroupCriterionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdGroupCriterionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdGroupCriterionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupCriterionServiceFileDescriptorSupplier())
              .addMethod(getGetAdGroupCriterionMethod())
              .addMethod(getMutateAdGroupCriteriaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
