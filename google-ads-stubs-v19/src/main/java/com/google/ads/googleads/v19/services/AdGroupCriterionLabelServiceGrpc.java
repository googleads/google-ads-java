package com.google.ads.googleads.v19.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage labels on ad group criteria.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v19/services/ad_group_criterion_label_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdGroupCriterionLabelServiceGrpc {

  private AdGroupCriterionLabelServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v19.services.AdGroupCriterionLabelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsRequest,
      com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsResponse> getMutateAdGroupCriterionLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupCriterionLabels",
      requestType = com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsRequest.class,
      responseType = com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsRequest,
      com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsResponse> getMutateAdGroupCriterionLabelsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsRequest, com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsResponse> getMutateAdGroupCriterionLabelsMethod;
    if ((getMutateAdGroupCriterionLabelsMethod = AdGroupCriterionLabelServiceGrpc.getMutateAdGroupCriterionLabelsMethod) == null) {
      synchronized (AdGroupCriterionLabelServiceGrpc.class) {
        if ((getMutateAdGroupCriterionLabelsMethod = AdGroupCriterionLabelServiceGrpc.getMutateAdGroupCriterionLabelsMethod) == null) {
          AdGroupCriterionLabelServiceGrpc.getMutateAdGroupCriterionLabelsMethod = getMutateAdGroupCriterionLabelsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsRequest, com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupCriterionLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupCriterionLabelServiceMethodDescriptorSupplier("MutateAdGroupCriterionLabels"))
              .build();
        }
      }
    }
    return getMutateAdGroupCriterionLabelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupCriterionLabelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionLabelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionLabelServiceStub>() {
        @java.lang.Override
        public AdGroupCriterionLabelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCriterionLabelServiceStub(channel, callOptions);
        }
      };
    return AdGroupCriterionLabelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AdGroupCriterionLabelServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionLabelServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionLabelServiceBlockingV2Stub>() {
        @java.lang.Override
        public AdGroupCriterionLabelServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCriterionLabelServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AdGroupCriterionLabelServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupCriterionLabelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionLabelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionLabelServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupCriterionLabelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCriterionLabelServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupCriterionLabelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupCriterionLabelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionLabelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupCriterionLabelServiceFutureStub>() {
        @java.lang.Override
        public AdGroupCriterionLabelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupCriterionLabelServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupCriterionLabelServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage labels on ad group criteria.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates and removes ad group criterion labels.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void mutateAdGroupCriterionLabels(com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdGroupCriterionLabelsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AdGroupCriterionLabelService.
   * <pre>
   * Service to manage labels on ad group criteria.
   * </pre>
   */
  public static abstract class AdGroupCriterionLabelServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdGroupCriterionLabelServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdGroupCriterionLabelService.
   * <pre>
   * Service to manage labels on ad group criteria.
   * </pre>
   */
  public static final class AdGroupCriterionLabelServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdGroupCriterionLabelServiceStub> {
    private AdGroupCriterionLabelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionLabelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionLabelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates and removes ad group criterion labels.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateAdGroupCriterionLabels(com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupCriterionLabelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AdGroupCriterionLabelService.
   * <pre>
   * Service to manage labels on ad group criteria.
   * </pre>
   */
  public static final class AdGroupCriterionLabelServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupCriterionLabelServiceBlockingV2Stub> {
    private AdGroupCriterionLabelServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionLabelServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionLabelServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates and removes ad group criterion labels.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsResponse mutateAdGroupCriterionLabels(com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupCriterionLabelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AdGroupCriterionLabelService.
   * <pre>
   * Service to manage labels on ad group criteria.
   * </pre>
   */
  public static final class AdGroupCriterionLabelServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupCriterionLabelServiceBlockingStub> {
    private AdGroupCriterionLabelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionLabelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionLabelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates and removes ad group criterion labels.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsResponse mutateAdGroupCriterionLabels(com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupCriterionLabelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdGroupCriterionLabelService.
   * <pre>
   * Service to manage labels on ad group criteria.
   * </pre>
   */
  public static final class AdGroupCriterionLabelServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdGroupCriterionLabelServiceFutureStub> {
    private AdGroupCriterionLabelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupCriterionLabelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupCriterionLabelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates and removes ad group criterion labels.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsResponse> mutateAdGroupCriterionLabels(
        com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdGroupCriterionLabelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_AD_GROUP_CRITERION_LABELS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_AD_GROUP_CRITERION_LABELS:
          serviceImpl.mutateAdGroupCriterionLabels((com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMutateAdGroupCriterionLabelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsRequest,
              com.google.ads.googleads.v19.services.MutateAdGroupCriterionLabelsResponse>(
                service, METHODID_MUTATE_AD_GROUP_CRITERION_LABELS)))
        .build();
  }

  private static abstract class AdGroupCriterionLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupCriterionLabelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v19.services.AdGroupCriterionLabelServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupCriterionLabelService");
    }
  }

  private static final class AdGroupCriterionLabelServiceFileDescriptorSupplier
      extends AdGroupCriterionLabelServiceBaseDescriptorSupplier {
    AdGroupCriterionLabelServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupCriterionLabelServiceMethodDescriptorSupplier
      extends AdGroupCriterionLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AdGroupCriterionLabelServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AdGroupCriterionLabelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupCriterionLabelServiceFileDescriptorSupplier())
              .addMethod(getMutateAdGroupCriterionLabelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
