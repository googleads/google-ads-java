package com.google.ads.googleads.v11.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage Keyword Plan ad group keywords. KeywordPlanAdGroup is
 * required to add ad group keywords. Positive and negative keywords are
 * supported. A maximum of 10,000 positive keywords are allowed per keyword
 * plan. A maximum of 1,000 negative keywords are allower per keyword plan. This
 * includes campaign negative keywords and ad group negative keywords.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v11/services/keyword_plan_ad_group_keyword_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KeywordPlanAdGroupKeywordServiceGrpc {

  private KeywordPlanAdGroupKeywordServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v11.services.KeywordPlanAdGroupKeywordService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsRequest,
      com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsResponse> getMutateKeywordPlanAdGroupKeywordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateKeywordPlanAdGroupKeywords",
      requestType = com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsRequest.class,
      responseType = com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsRequest,
      com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsResponse> getMutateKeywordPlanAdGroupKeywordsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsRequest, com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsResponse> getMutateKeywordPlanAdGroupKeywordsMethod;
    if ((getMutateKeywordPlanAdGroupKeywordsMethod = KeywordPlanAdGroupKeywordServiceGrpc.getMutateKeywordPlanAdGroupKeywordsMethod) == null) {
      synchronized (KeywordPlanAdGroupKeywordServiceGrpc.class) {
        if ((getMutateKeywordPlanAdGroupKeywordsMethod = KeywordPlanAdGroupKeywordServiceGrpc.getMutateKeywordPlanAdGroupKeywordsMethod) == null) {
          KeywordPlanAdGroupKeywordServiceGrpc.getMutateKeywordPlanAdGroupKeywordsMethod = getMutateKeywordPlanAdGroupKeywordsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsRequest, com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateKeywordPlanAdGroupKeywords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanAdGroupKeywordServiceMethodDescriptorSupplier("MutateKeywordPlanAdGroupKeywords"))
              .build();
        }
      }
    }
    return getMutateKeywordPlanAdGroupKeywordsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeywordPlanAdGroupKeywordServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanAdGroupKeywordServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanAdGroupKeywordServiceStub>() {
        @java.lang.Override
        public KeywordPlanAdGroupKeywordServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanAdGroupKeywordServiceStub(channel, callOptions);
        }
      };
    return KeywordPlanAdGroupKeywordServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordPlanAdGroupKeywordServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanAdGroupKeywordServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanAdGroupKeywordServiceBlockingStub>() {
        @java.lang.Override
        public KeywordPlanAdGroupKeywordServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanAdGroupKeywordServiceBlockingStub(channel, callOptions);
        }
      };
    return KeywordPlanAdGroupKeywordServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordPlanAdGroupKeywordServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanAdGroupKeywordServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanAdGroupKeywordServiceFutureStub>() {
        @java.lang.Override
        public KeywordPlanAdGroupKeywordServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanAdGroupKeywordServiceFutureStub(channel, callOptions);
        }
      };
    return KeywordPlanAdGroupKeywordServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage Keyword Plan ad group keywords. KeywordPlanAdGroup is
   * required to add ad group keywords. Positive and negative keywords are
   * supported. A maximum of 10,000 positive keywords are allowed per keyword
   * plan. A maximum of 1,000 negative keywords are allower per keyword plan. This
   * includes campaign negative keywords and ad group negative keywords.
   * </pre>
   */
  public static abstract class KeywordPlanAdGroupKeywordServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad group keywords. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanAdGroupKeywordError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public void mutateKeywordPlanAdGroupKeywords(com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMutateKeywordPlanAdGroupKeywordsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMutateKeywordPlanAdGroupKeywordsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsRequest,
                com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsResponse>(
                  this, METHODID_MUTATE_KEYWORD_PLAN_AD_GROUP_KEYWORDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan ad group keywords. KeywordPlanAdGroup is
   * required to add ad group keywords. Positive and negative keywords are
   * supported. A maximum of 10,000 positive keywords are allowed per keyword
   * plan. A maximum of 1,000 negative keywords are allower per keyword plan. This
   * includes campaign negative keywords and ad group negative keywords.
   * </pre>
   */
  public static final class KeywordPlanAdGroupKeywordServiceStub extends io.grpc.stub.AbstractAsyncStub<KeywordPlanAdGroupKeywordServiceStub> {
    private KeywordPlanAdGroupKeywordServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanAdGroupKeywordServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanAdGroupKeywordServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad group keywords. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanAdGroupKeywordError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public void mutateKeywordPlanAdGroupKeywords(com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMutateKeywordPlanAdGroupKeywordsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan ad group keywords. KeywordPlanAdGroup is
   * required to add ad group keywords. Positive and negative keywords are
   * supported. A maximum of 10,000 positive keywords are allowed per keyword
   * plan. A maximum of 1,000 negative keywords are allower per keyword plan. This
   * includes campaign negative keywords and ad group negative keywords.
   * </pre>
   */
  public static final class KeywordPlanAdGroupKeywordServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeywordPlanAdGroupKeywordServiceBlockingStub> {
    private KeywordPlanAdGroupKeywordServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanAdGroupKeywordServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanAdGroupKeywordServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad group keywords. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanAdGroupKeywordError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsResponse mutateKeywordPlanAdGroupKeywords(com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMutateKeywordPlanAdGroupKeywordsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan ad group keywords. KeywordPlanAdGroup is
   * required to add ad group keywords. Positive and negative keywords are
   * supported. A maximum of 10,000 positive keywords are allowed per keyword
   * plan. A maximum of 1,000 negative keywords are allower per keyword plan. This
   * includes campaign negative keywords and ad group negative keywords.
   * </pre>
   */
  public static final class KeywordPlanAdGroupKeywordServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeywordPlanAdGroupKeywordServiceFutureStub> {
    private KeywordPlanAdGroupKeywordServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanAdGroupKeywordServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanAdGroupKeywordServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad group keywords. Operation
     * statuses are returned.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [DatabaseError]()
     *   [FieldError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanAdGroupKeywordError]()
     *   [KeywordPlanError]()
     *   [MutateError]()
     *   [QuotaError]()
     *   [RequestError]()
     *   [ResourceCountLimitExceededError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsResponse> mutateKeywordPlanAdGroupKeywords(
        com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMutateKeywordPlanAdGroupKeywordsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MUTATE_KEYWORD_PLAN_AD_GROUP_KEYWORDS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeywordPlanAdGroupKeywordServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeywordPlanAdGroupKeywordServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MUTATE_KEYWORD_PLAN_AD_GROUP_KEYWORDS:
          serviceImpl.mutateKeywordPlanAdGroupKeywords((com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v11.services.MutateKeywordPlanAdGroupKeywordsResponse>) responseObserver);
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

  private static abstract class KeywordPlanAdGroupKeywordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeywordPlanAdGroupKeywordServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v11.services.KeywordPlanAdGroupKeywordServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeywordPlanAdGroupKeywordService");
    }
  }

  private static final class KeywordPlanAdGroupKeywordServiceFileDescriptorSupplier
      extends KeywordPlanAdGroupKeywordServiceBaseDescriptorSupplier {
    KeywordPlanAdGroupKeywordServiceFileDescriptorSupplier() {}
  }

  private static final class KeywordPlanAdGroupKeywordServiceMethodDescriptorSupplier
      extends KeywordPlanAdGroupKeywordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeywordPlanAdGroupKeywordServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeywordPlanAdGroupKeywordServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeywordPlanAdGroupKeywordServiceFileDescriptorSupplier())
              .addMethod(getMutateKeywordPlanAdGroupKeywordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
