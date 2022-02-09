package com.google.ads.googleads.v10.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage Keyword Plan ad groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v10/services/keyword_plan_ad_group_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KeywordPlanAdGroupServiceGrpc {

  private KeywordPlanAdGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v10.services.KeywordPlanAdGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsRequest,
      com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsResponse> getMutateKeywordPlanAdGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateKeywordPlanAdGroups",
      requestType = com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsRequest.class,
      responseType = com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsRequest,
      com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsResponse> getMutateKeywordPlanAdGroupsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsRequest, com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsResponse> getMutateKeywordPlanAdGroupsMethod;
    if ((getMutateKeywordPlanAdGroupsMethod = KeywordPlanAdGroupServiceGrpc.getMutateKeywordPlanAdGroupsMethod) == null) {
      synchronized (KeywordPlanAdGroupServiceGrpc.class) {
        if ((getMutateKeywordPlanAdGroupsMethod = KeywordPlanAdGroupServiceGrpc.getMutateKeywordPlanAdGroupsMethod) == null) {
          KeywordPlanAdGroupServiceGrpc.getMutateKeywordPlanAdGroupsMethod = getMutateKeywordPlanAdGroupsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsRequest, com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateKeywordPlanAdGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanAdGroupServiceMethodDescriptorSupplier("MutateKeywordPlanAdGroups"))
              .build();
        }
      }
    }
    return getMutateKeywordPlanAdGroupsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeywordPlanAdGroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanAdGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanAdGroupServiceStub>() {
        @java.lang.Override
        public KeywordPlanAdGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanAdGroupServiceStub(channel, callOptions);
        }
      };
    return KeywordPlanAdGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordPlanAdGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanAdGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanAdGroupServiceBlockingStub>() {
        @java.lang.Override
        public KeywordPlanAdGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanAdGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return KeywordPlanAdGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordPlanAdGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanAdGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanAdGroupServiceFutureStub>() {
        @java.lang.Override
        public KeywordPlanAdGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanAdGroupServiceFutureStub(channel, callOptions);
        }
      };
    return KeywordPlanAdGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage Keyword Plan ad groups.
   * </pre>
   */
  public static abstract class KeywordPlanAdGroupServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad groups. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanAdGroupError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public void mutateKeywordPlanAdGroups(com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateKeywordPlanAdGroupsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateKeywordPlanAdGroupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsRequest,
                com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsResponse>(
                  this, METHODID_MUTATE_KEYWORD_PLAN_AD_GROUPS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan ad groups.
   * </pre>
   */
  public static final class KeywordPlanAdGroupServiceStub extends io.grpc.stub.AbstractAsyncStub<KeywordPlanAdGroupServiceStub> {
    private KeywordPlanAdGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanAdGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanAdGroupServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad groups. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanAdGroupError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public void mutateKeywordPlanAdGroups(com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateKeywordPlanAdGroupsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan ad groups.
   * </pre>
   */
  public static final class KeywordPlanAdGroupServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeywordPlanAdGroupServiceBlockingStub> {
    private KeywordPlanAdGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanAdGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanAdGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad groups. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanAdGroupError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsResponse mutateKeywordPlanAdGroups(com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateKeywordPlanAdGroupsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan ad groups.
   * </pre>
   */
  public static final class KeywordPlanAdGroupServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeywordPlanAdGroupServiceFutureStub> {
    private KeywordPlanAdGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanAdGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanAdGroupServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad groups. Operation statuses are
     * returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [FieldMaskError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanAdGroupError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [NewResourceCreationError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsResponse> mutateKeywordPlanAdGroups(
        com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateKeywordPlanAdGroupsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_KEYWORD_PLAN_AD_GROUPS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeywordPlanAdGroupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeywordPlanAdGroupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_KEYWORD_PLAN_AD_GROUPS:
          serviceImpl.mutateKeywordPlanAdGroups((com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupsResponse>) responseObserver);
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

  private static abstract class KeywordPlanAdGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeywordPlanAdGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v10.services.KeywordPlanAdGroupServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeywordPlanAdGroupService");
    }
  }

  private static final class KeywordPlanAdGroupServiceFileDescriptorSupplier
      extends KeywordPlanAdGroupServiceBaseDescriptorSupplier {
    KeywordPlanAdGroupServiceFileDescriptorSupplier() {}
  }

  private static final class KeywordPlanAdGroupServiceMethodDescriptorSupplier
      extends KeywordPlanAdGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeywordPlanAdGroupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeywordPlanAdGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeywordPlanAdGroupServiceFileDescriptorSupplier())
              .addMethod(getMutateKeywordPlanAdGroupsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
