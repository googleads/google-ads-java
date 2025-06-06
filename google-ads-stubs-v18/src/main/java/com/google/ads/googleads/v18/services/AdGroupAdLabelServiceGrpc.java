package com.google.ads.googleads.v18.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage labels on ad group ads.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v18/services/ad_group_ad_label_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdGroupAdLabelServiceGrpc {

  private AdGroupAdLabelServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.ads.googleads.v18.services.AdGroupAdLabelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsRequest,
      com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsResponse> getMutateAdGroupAdLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateAdGroupAdLabels",
      requestType = com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsRequest.class,
      responseType = com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsRequest,
      com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsResponse> getMutateAdGroupAdLabelsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsRequest, com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsResponse> getMutateAdGroupAdLabelsMethod;
    if ((getMutateAdGroupAdLabelsMethod = AdGroupAdLabelServiceGrpc.getMutateAdGroupAdLabelsMethod) == null) {
      synchronized (AdGroupAdLabelServiceGrpc.class) {
        if ((getMutateAdGroupAdLabelsMethod = AdGroupAdLabelServiceGrpc.getMutateAdGroupAdLabelsMethod) == null) {
          AdGroupAdLabelServiceGrpc.getMutateAdGroupAdLabelsMethod = getMutateAdGroupAdLabelsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsRequest, com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateAdGroupAdLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdGroupAdLabelServiceMethodDescriptorSupplier("MutateAdGroupAdLabels"))
              .build();
        }
      }
    }
    return getMutateAdGroupAdLabelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupAdLabelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAdLabelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAdLabelServiceStub>() {
        @java.lang.Override
        public AdGroupAdLabelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAdLabelServiceStub(channel, callOptions);
        }
      };
    return AdGroupAdLabelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static AdGroupAdLabelServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAdLabelServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAdLabelServiceBlockingV2Stub>() {
        @java.lang.Override
        public AdGroupAdLabelServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAdLabelServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return AdGroupAdLabelServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupAdLabelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAdLabelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAdLabelServiceBlockingStub>() {
        @java.lang.Override
        public AdGroupAdLabelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAdLabelServiceBlockingStub(channel, callOptions);
        }
      };
    return AdGroupAdLabelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupAdLabelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdGroupAdLabelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdGroupAdLabelServiceFutureStub>() {
        @java.lang.Override
        public AdGroupAdLabelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdGroupAdLabelServiceFutureStub(channel, callOptions);
        }
      };
    return AdGroupAdLabelServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage labels on ad group ads.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates and removes ad group ad labels.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [LabelError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    default void mutateAdGroupAdLabels(com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateAdGroupAdLabelsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AdGroupAdLabelService.
   * <pre>
   * Service to manage labels on ad group ads.
   * </pre>
   */
  public static abstract class AdGroupAdLabelServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdGroupAdLabelServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdGroupAdLabelService.
   * <pre>
   * Service to manage labels on ad group ads.
   * </pre>
   */
  public static final class AdGroupAdLabelServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdGroupAdLabelServiceStub> {
    private AdGroupAdLabelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdLabelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAdLabelServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates and removes ad group ad labels.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [LabelError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void mutateAdGroupAdLabels(com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateAdGroupAdLabelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AdGroupAdLabelService.
   * <pre>
   * Service to manage labels on ad group ads.
   * </pre>
   */
  public static final class AdGroupAdLabelServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupAdLabelServiceBlockingV2Stub> {
    private AdGroupAdLabelServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdLabelServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAdLabelServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates and removes ad group ad labels.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [LabelError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsResponse mutateAdGroupAdLabels(com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupAdLabelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service AdGroupAdLabelService.
   * <pre>
   * Service to manage labels on ad group ads.
   * </pre>
   */
  public static final class AdGroupAdLabelServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdGroupAdLabelServiceBlockingStub> {
    private AdGroupAdLabelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdLabelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAdLabelServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates and removes ad group ad labels.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [LabelError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsResponse mutateAdGroupAdLabels(com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateAdGroupAdLabelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdGroupAdLabelService.
   * <pre>
   * Service to manage labels on ad group ads.
   * </pre>
   */
  public static final class AdGroupAdLabelServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdGroupAdLabelServiceFutureStub> {
    private AdGroupAdLabelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAdLabelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdGroupAdLabelServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates and removes ad group ad labels.
     * Operation statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [LabelError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsResponse> mutateAdGroupAdLabels(
        com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateAdGroupAdLabelsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_AD_GROUP_AD_LABELS = 0;

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
        case METHODID_MUTATE_AD_GROUP_AD_LABELS:
          serviceImpl.mutateAdGroupAdLabels((com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsResponse>) responseObserver);
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
          getMutateAdGroupAdLabelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsRequest,
              com.google.ads.googleads.v18.services.MutateAdGroupAdLabelsResponse>(
                service, METHODID_MUTATE_AD_GROUP_AD_LABELS)))
        .build();
  }

  private static abstract class AdGroupAdLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupAdLabelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v18.services.AdGroupAdLabelServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupAdLabelService");
    }
  }

  private static final class AdGroupAdLabelServiceFileDescriptorSupplier
      extends AdGroupAdLabelServiceBaseDescriptorSupplier {
    AdGroupAdLabelServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupAdLabelServiceMethodDescriptorSupplier
      extends AdGroupAdLabelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AdGroupAdLabelServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AdGroupAdLabelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupAdLabelServiceFileDescriptorSupplier())
              .addMethod(getMutateAdGroupAdLabelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
