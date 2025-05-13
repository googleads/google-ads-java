package com.google.ads.googleads.v20.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage labels on ad groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v20/services/ad_group_label_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdGroupLabelServiceGrpc {

  private AdGroupLabelServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v20.services.AdGroupLabelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateAdGroupLabelsRequest,
      com.google.ads.googleads.v20.services.MutateAdGroupLabelsResponse> getMutateAdGroupLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupLabels",
      requestType = com.google.ads.googleads.v20.services.MutateAdGroupLabelsRequest.class,
      responseType = com.google.ads.googleads.v20.services.MutateAdGroupLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateAdGroupLabelsRequest,
      com.google.ads.googleads.v20.services.MutateAdGroupLabelsResponse> getMutateAdGroupLabelsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v20.services.MutateAdGroupLabelsRequest, com.google.ads.googleads.v20.services.MutateAdGroupLabelsResponse> getMutateAdGroupLabelsMethod;
    if ((getMutateAdGroupLabelsMethod = AdGroupLabelServiceGrpc.getMutateAdGroupLabelsMethod) == null) {
      synchronized (AdGroupLabelServiceGrpc.class) {
        if ((getMutateAdGroupLabelsMethod = AdGroupLabelServiceGrpc.getMutateAdGroupLabelsMethod) == null) {
          AdGroupLabelServiceGrpc.getMutateAdGroupLabelsMethod = getMutateAdGroupLabelsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v20.services.MutateAdGroupLabelsRequest, com.google.ads.googleads.v20.services.MutateAdGroupLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.MutateAdGroupLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v20.services.MutateAdGroupLabelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupLabelServiceMethodDescriptorSupplier("MutateAdGroupLabels"))
              .build();
        }
      }
    }
    return getMutateAdGroupLabelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupLabelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupLabelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupLabelServiceStub>() {
        @java.lang.Override
        public AdGroupLabelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupLabelServiceStub(channel, callOptions);
        }
      };
    return AdGroupLabelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AdGroupLabelServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupLabelServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupLabelServiceBlockingV2Stub>() {
        @java.lang.Override
        public AdGroupLabelServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupLabelServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AdGroupLabelServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupLabelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupLabelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupLabelServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupLabelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupLabelServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupLabelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupLabelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupLabelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupLabelServiceFutureStub>() {
        @java.lang.Override
        public AdGroupLabelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupLabelServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupLabelServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage labels on ad groups.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates and removes ad group labels.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [LabelError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void mutateAdGroupLabels(com.google.ads.googleads.v20.services.MutateAdGroupLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateAdGroupLabelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdGroupLabelsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AdGroupLabelService.
   * <pre>
   * Service to manage labels on ad groups.
   * </pre>
   */
  public static abstract class AdGroupLabelServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdGroupLabelServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdGroupLabelService.
   * <pre>
   * Service to manage labels on ad groups.
   * </pre>
   */
  public static final class AdGroupLabelServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdGroupLabelServiceStub> {
    private AdGroupLabelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupLabelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupLabelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates and removes ad group labels.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [LabelError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateAdGroupLabels(com.google.ads.googleads.v20.services.MutateAdGroupLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateAdGroupLabelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupLabelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AdGroupLabelService.
   * <pre>
   * Service to manage labels on ad groups.
   * </pre>
   */
  public static final class AdGroupLabelServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupLabelServiceBlockingV2Stub> {
    private AdGroupLabelServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupLabelServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupLabelServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates and removes ad group labels.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [LabelError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v20.services.MutateAdGroupLabelsResponse mutateAdGroupLabels(com.google.ads.googleads.v20.services.MutateAdGroupLabelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupLabelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AdGroupLabelService.
   * <pre>
   * Service to manage labels on ad groups.
   * </pre>
   */
  public static final class AdGroupLabelServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupLabelServiceBlockingStub> {
    private AdGroupLabelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupLabelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupLabelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates and removes ad group labels.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [LabelError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v20.services.MutateAdGroupLabelsResponse mutateAdGroupLabels(com.google.ads.googleads.v20.services.MutateAdGroupLabelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupLabelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdGroupLabelService.
   * <pre>
   * Service to manage labels on ad groups.
   * </pre>
   */
  public static final class AdGroupLabelServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdGroupLabelServiceFutureStub> {
    private AdGroupLabelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupLabelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupLabelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates and removes ad group labels.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [LabelError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v20.services.MutateAdGroupLabelsResponse> mutateAdGroupLabels(
        com.google.ads.googleads.v20.services.MutateAdGroupLabelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdGroupLabelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_AD_GROUP_LABELS = 0;

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
        case METHODID_MUTATE_AD_GROUP_LABELS:
          serviceImpl.mutateAdGroupLabels((com.google.ads.googleads.v20.services.MutateAdGroupLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v20.services.MutateAdGroupLabelsResponse>) responseObserver);
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
          getMutateAdGroupLabelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v20.services.MutateAdGroupLabelsRequest,
              com.google.ads.googleads.v20.services.MutateAdGroupLabelsResponse>(
                service, METHODID_MUTATE_AD_GROUP_LABELS)))
        .build();
  }

  private static abstract class AdGroupLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupLabelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v20.services.AdGroupLabelServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupLabelService");
    }
  }

  private static final class AdGroupLabelServiceFileDescriptorSupplier
      extends AdGroupLabelServiceBaseDescriptorSupplier {
    AdGroupLabelServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupLabelServiceMethodDescriptorSupplier
      extends AdGroupLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AdGroupLabelServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AdGroupLabelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupLabelServiceFileDescriptorSupplier())
              .addMethod(getMutateAdGroupLabelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
