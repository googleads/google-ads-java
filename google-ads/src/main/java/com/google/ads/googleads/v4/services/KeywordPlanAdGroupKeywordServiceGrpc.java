package com.google.ads.googleads.v4.services;

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
 * Service to manage Keyword Plan ad group keywords. KeywordPlanAdGroup is
 * required to add ad group keywords. Positive and negative keywords are
 * supported. A maximum of 10,000 positive keywords are allowed per keyword
 * plan. A maximum of 1,000 negative keywords are allower per keyword plan. This
 * includes campaign negative keywords and ad group negative keywords.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v4/services/keyword_plan_ad_group_keyword_service.proto")
public final class KeywordPlanAdGroupKeywordServiceGrpc {

  private KeywordPlanAdGroupKeywordServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.KeywordPlanAdGroupKeywordService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetKeywordPlanAdGroupKeywordMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetKeywordPlanAdGroupKeywordRequest,
      com.google.ads.googleads.v4.resources.KeywordPlanAdGroupKeyword> METHOD_GET_KEYWORD_PLAN_AD_GROUP_KEYWORD = getGetKeywordPlanAdGroupKeywordMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetKeywordPlanAdGroupKeywordRequest,
      com.google.ads.googleads.v4.resources.KeywordPlanAdGroupKeyword> getGetKeywordPlanAdGroupKeywordMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetKeywordPlanAdGroupKeywordRequest,
      com.google.ads.googleads.v4.resources.KeywordPlanAdGroupKeyword> getGetKeywordPlanAdGroupKeywordMethod() {
    return getGetKeywordPlanAdGroupKeywordMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetKeywordPlanAdGroupKeywordRequest,
      com.google.ads.googleads.v4.resources.KeywordPlanAdGroupKeyword> getGetKeywordPlanAdGroupKeywordMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetKeywordPlanAdGroupKeywordRequest, com.google.ads.googleads.v4.resources.KeywordPlanAdGroupKeyword> getGetKeywordPlanAdGroupKeywordMethod;
    if ((getGetKeywordPlanAdGroupKeywordMethod = KeywordPlanAdGroupKeywordServiceGrpc.getGetKeywordPlanAdGroupKeywordMethod) == null) {
      synchronized (KeywordPlanAdGroupKeywordServiceGrpc.class) {
        if ((getGetKeywordPlanAdGroupKeywordMethod = KeywordPlanAdGroupKeywordServiceGrpc.getGetKeywordPlanAdGroupKeywordMethod) == null) {
          KeywordPlanAdGroupKeywordServiceGrpc.getGetKeywordPlanAdGroupKeywordMethod = getGetKeywordPlanAdGroupKeywordMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetKeywordPlanAdGroupKeywordRequest, com.google.ads.googleads.v4.resources.KeywordPlanAdGroupKeyword>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.KeywordPlanAdGroupKeywordService", "GetKeywordPlanAdGroupKeyword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetKeywordPlanAdGroupKeywordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.KeywordPlanAdGroupKeyword.getDefaultInstance()))
                  .setSchemaDescriptor(new KeywordPlanAdGroupKeywordServiceMethodDescriptorSupplier("GetKeywordPlanAdGroupKeyword"))
                  .build();
          }
        }
     }
     return getGetKeywordPlanAdGroupKeywordMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateKeywordPlanAdGroupKeywordsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsRequest,
      com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsResponse> METHOD_MUTATE_KEYWORD_PLAN_AD_GROUP_KEYWORDS = getMutateKeywordPlanAdGroupKeywordsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsRequest,
      com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsResponse> getMutateKeywordPlanAdGroupKeywordsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsRequest,
      com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsResponse> getMutateKeywordPlanAdGroupKeywordsMethod() {
    return getMutateKeywordPlanAdGroupKeywordsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsRequest,
      com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsResponse> getMutateKeywordPlanAdGroupKeywordsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsRequest, com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsResponse> getMutateKeywordPlanAdGroupKeywordsMethod;
    if ((getMutateKeywordPlanAdGroupKeywordsMethod = KeywordPlanAdGroupKeywordServiceGrpc.getMutateKeywordPlanAdGroupKeywordsMethod) == null) {
      synchronized (KeywordPlanAdGroupKeywordServiceGrpc.class) {
        if ((getMutateKeywordPlanAdGroupKeywordsMethod = KeywordPlanAdGroupKeywordServiceGrpc.getMutateKeywordPlanAdGroupKeywordsMethod) == null) {
          KeywordPlanAdGroupKeywordServiceGrpc.getMutateKeywordPlanAdGroupKeywordsMethod = getMutateKeywordPlanAdGroupKeywordsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsRequest, com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v4.services.KeywordPlanAdGroupKeywordService", "MutateKeywordPlanAdGroupKeywords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsResponse.getDefaultInstance()))
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
    return new KeywordPlanAdGroupKeywordServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordPlanAdGroupKeywordServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KeywordPlanAdGroupKeywordServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordPlanAdGroupKeywordServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KeywordPlanAdGroupKeywordServiceFutureStub(channel);
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
     * Returns the requested Keyword Plan ad group keyword in full detail.
     * </pre>
     */
    public void getKeywordPlanAdGroupKeyword(com.google.ads.googleads.v4.services.GetKeywordPlanAdGroupKeywordRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.KeywordPlanAdGroupKeyword> responseObserver) {
      asyncUnimplementedUnaryCall(getGetKeywordPlanAdGroupKeywordMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad group keywords. Operation
     * statuses are returned.
     * </pre>
     */
    public void mutateKeywordPlanAdGroupKeywords(com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateKeywordPlanAdGroupKeywordsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetKeywordPlanAdGroupKeywordMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetKeywordPlanAdGroupKeywordRequest,
                com.google.ads.googleads.v4.resources.KeywordPlanAdGroupKeyword>(
                  this, METHODID_GET_KEYWORD_PLAN_AD_GROUP_KEYWORD)))
          .addMethod(
            getMutateKeywordPlanAdGroupKeywordsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsRequest,
                com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsResponse>(
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
  public static final class KeywordPlanAdGroupKeywordServiceStub extends io.grpc.stub.AbstractStub<KeywordPlanAdGroupKeywordServiceStub> {
    private KeywordPlanAdGroupKeywordServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordPlanAdGroupKeywordServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanAdGroupKeywordServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordPlanAdGroupKeywordServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan ad group keyword in full detail.
     * </pre>
     */
    public void getKeywordPlanAdGroupKeyword(com.google.ads.googleads.v4.services.GetKeywordPlanAdGroupKeywordRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.KeywordPlanAdGroupKeyword> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetKeywordPlanAdGroupKeywordMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad group keywords. Operation
     * statuses are returned.
     * </pre>
     */
    public void mutateKeywordPlanAdGroupKeywords(com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateKeywordPlanAdGroupKeywordsMethodHelper(), getCallOptions()), request, responseObserver);
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
  public static final class KeywordPlanAdGroupKeywordServiceBlockingStub extends io.grpc.stub.AbstractStub<KeywordPlanAdGroupKeywordServiceBlockingStub> {
    private KeywordPlanAdGroupKeywordServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordPlanAdGroupKeywordServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanAdGroupKeywordServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordPlanAdGroupKeywordServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan ad group keyword in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.KeywordPlanAdGroupKeyword getKeywordPlanAdGroupKeyword(com.google.ads.googleads.v4.services.GetKeywordPlanAdGroupKeywordRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetKeywordPlanAdGroupKeywordMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad group keywords. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsResponse mutateKeywordPlanAdGroupKeywords(com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateKeywordPlanAdGroupKeywordsMethodHelper(), getCallOptions(), request);
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
  public static final class KeywordPlanAdGroupKeywordServiceFutureStub extends io.grpc.stub.AbstractStub<KeywordPlanAdGroupKeywordServiceFutureStub> {
    private KeywordPlanAdGroupKeywordServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordPlanAdGroupKeywordServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanAdGroupKeywordServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordPlanAdGroupKeywordServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested Keyword Plan ad group keyword in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.KeywordPlanAdGroupKeyword> getKeywordPlanAdGroupKeyword(
        com.google.ads.googleads.v4.services.GetKeywordPlanAdGroupKeywordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetKeywordPlanAdGroupKeywordMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad group keywords. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsResponse> mutateKeywordPlanAdGroupKeywords(
        com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateKeywordPlanAdGroupKeywordsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_KEYWORD_PLAN_AD_GROUP_KEYWORD = 0;
  private static final int METHODID_MUTATE_KEYWORD_PLAN_AD_GROUP_KEYWORDS = 1;

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
        case METHODID_GET_KEYWORD_PLAN_AD_GROUP_KEYWORD:
          serviceImpl.getKeywordPlanAdGroupKeyword((com.google.ads.googleads.v4.services.GetKeywordPlanAdGroupKeywordRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.KeywordPlanAdGroupKeyword>) responseObserver);
          break;
        case METHODID_MUTATE_KEYWORD_PLAN_AD_GROUP_KEYWORDS:
          serviceImpl.mutateKeywordPlanAdGroupKeywords((com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsResponse>) responseObserver);
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
      return com.google.ads.googleads.v4.services.KeywordPlanAdGroupKeywordServiceProto.getDescriptor();
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
              .addMethod(getGetKeywordPlanAdGroupKeywordMethodHelper())
              .addMethod(getMutateKeywordPlanAdGroupKeywordsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
