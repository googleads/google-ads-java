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
 * Service to manage Keyword Plan negative keywords.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/keyword_plan_negative_keyword_service.proto")
public final class KeywordPlanNegativeKeywordServiceGrpc {

  private KeywordPlanNegativeKeywordServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.KeywordPlanNegativeKeywordService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetKeywordPlanNegativeKeywordMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest,
      com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword> METHOD_GET_KEYWORD_PLAN_NEGATIVE_KEYWORD = getGetKeywordPlanNegativeKeywordMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest,
      com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword> getGetKeywordPlanNegativeKeywordMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest,
      com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword> getGetKeywordPlanNegativeKeywordMethod() {
    return getGetKeywordPlanNegativeKeywordMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest,
      com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword> getGetKeywordPlanNegativeKeywordMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest, com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword> getGetKeywordPlanNegativeKeywordMethod;
    if ((getGetKeywordPlanNegativeKeywordMethod = KeywordPlanNegativeKeywordServiceGrpc.getGetKeywordPlanNegativeKeywordMethod) == null) {
      synchronized (KeywordPlanNegativeKeywordServiceGrpc.class) {
        if ((getGetKeywordPlanNegativeKeywordMethod = KeywordPlanNegativeKeywordServiceGrpc.getGetKeywordPlanNegativeKeywordMethod) == null) {
          KeywordPlanNegativeKeywordServiceGrpc.getGetKeywordPlanNegativeKeywordMethod = getGetKeywordPlanNegativeKeywordMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest, com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.KeywordPlanNegativeKeywordService", "GetKeywordPlanNegativeKeyword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword.getDefaultInstance()))
                  .setSchemaDescriptor(new KeywordPlanNegativeKeywordServiceMethodDescriptorSupplier("GetKeywordPlanNegativeKeyword"))
                  .build();
          }
        }
     }
     return getGetKeywordPlanNegativeKeywordMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateKeywordPlanNegativeKeywordsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest,
      com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse> METHOD_MUTATE_KEYWORD_PLAN_NEGATIVE_KEYWORDS = getMutateKeywordPlanNegativeKeywordsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest,
      com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse> getMutateKeywordPlanNegativeKeywordsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest,
      com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse> getMutateKeywordPlanNegativeKeywordsMethod() {
    return getMutateKeywordPlanNegativeKeywordsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest,
      com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse> getMutateKeywordPlanNegativeKeywordsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest, com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse> getMutateKeywordPlanNegativeKeywordsMethod;
    if ((getMutateKeywordPlanNegativeKeywordsMethod = KeywordPlanNegativeKeywordServiceGrpc.getMutateKeywordPlanNegativeKeywordsMethod) == null) {
      synchronized (KeywordPlanNegativeKeywordServiceGrpc.class) {
        if ((getMutateKeywordPlanNegativeKeywordsMethod = KeywordPlanNegativeKeywordServiceGrpc.getMutateKeywordPlanNegativeKeywordsMethod) == null) {
          KeywordPlanNegativeKeywordServiceGrpc.getMutateKeywordPlanNegativeKeywordsMethod = getMutateKeywordPlanNegativeKeywordsMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest, com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.KeywordPlanNegativeKeywordService", "MutateKeywordPlanNegativeKeywords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KeywordPlanNegativeKeywordServiceMethodDescriptorSupplier("MutateKeywordPlanNegativeKeywords"))
                  .build();
          }
        }
     }
     return getMutateKeywordPlanNegativeKeywordsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeywordPlanNegativeKeywordServiceStub newStub(io.grpc.Channel channel) {
    return new KeywordPlanNegativeKeywordServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordPlanNegativeKeywordServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KeywordPlanNegativeKeywordServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordPlanNegativeKeywordServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KeywordPlanNegativeKeywordServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage Keyword Plan negative keywords.
   * </pre>
   */
  public static abstract class KeywordPlanNegativeKeywordServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested plan in full detail.
     * </pre>
     */
    public void getKeywordPlanNegativeKeyword(com.google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword> responseObserver) {
      asyncUnimplementedUnaryCall(getGetKeywordPlanNegativeKeywordMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan negative keywords. Operation
     * statuses are returned.
     * </pre>
     */
    public void mutateKeywordPlanNegativeKeywords(com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateKeywordPlanNegativeKeywordsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetKeywordPlanNegativeKeywordMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest,
                com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword>(
                  this, METHODID_GET_KEYWORD_PLAN_NEGATIVE_KEYWORD)))
          .addMethod(
            getMutateKeywordPlanNegativeKeywordsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest,
                com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse>(
                  this, METHODID_MUTATE_KEYWORD_PLAN_NEGATIVE_KEYWORDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan negative keywords.
   * </pre>
   */
  public static final class KeywordPlanNegativeKeywordServiceStub extends io.grpc.stub.AbstractStub<KeywordPlanNegativeKeywordServiceStub> {
    private KeywordPlanNegativeKeywordServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordPlanNegativeKeywordServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanNegativeKeywordServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordPlanNegativeKeywordServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested plan in full detail.
     * </pre>
     */
    public void getKeywordPlanNegativeKeyword(com.google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetKeywordPlanNegativeKeywordMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan negative keywords. Operation
     * statuses are returned.
     * </pre>
     */
    public void mutateKeywordPlanNegativeKeywords(com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateKeywordPlanNegativeKeywordsMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan negative keywords.
   * </pre>
   */
  public static final class KeywordPlanNegativeKeywordServiceBlockingStub extends io.grpc.stub.AbstractStub<KeywordPlanNegativeKeywordServiceBlockingStub> {
    private KeywordPlanNegativeKeywordServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordPlanNegativeKeywordServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanNegativeKeywordServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordPlanNegativeKeywordServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested plan in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword getKeywordPlanNegativeKeyword(com.google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetKeywordPlanNegativeKeywordMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan negative keywords. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse mutateKeywordPlanNegativeKeywords(com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateKeywordPlanNegativeKeywordsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage Keyword Plan negative keywords.
   * </pre>
   */
  public static final class KeywordPlanNegativeKeywordServiceFutureStub extends io.grpc.stub.AbstractStub<KeywordPlanNegativeKeywordServiceFutureStub> {
    private KeywordPlanNegativeKeywordServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeywordPlanNegativeKeywordServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanNegativeKeywordServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeywordPlanNegativeKeywordServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested plan in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword> getKeywordPlanNegativeKeyword(
        com.google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetKeywordPlanNegativeKeywordMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan negative keywords. Operation
     * statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse> mutateKeywordPlanNegativeKeywords(
        com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateKeywordPlanNegativeKeywordsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_KEYWORD_PLAN_NEGATIVE_KEYWORD = 0;
  private static final int METHODID_MUTATE_KEYWORD_PLAN_NEGATIVE_KEYWORDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeywordPlanNegativeKeywordServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeywordPlanNegativeKeywordServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_KEYWORD_PLAN_NEGATIVE_KEYWORD:
          serviceImpl.getKeywordPlanNegativeKeyword((com.google.ads.googleads.v3.services.GetKeywordPlanNegativeKeywordRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.KeywordPlanNegativeKeyword>) responseObserver);
          break;
        case METHODID_MUTATE_KEYWORD_PLAN_NEGATIVE_KEYWORDS:
          serviceImpl.mutateKeywordPlanNegativeKeywords((com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.services.MutateKeywordPlanNegativeKeywordsResponse>) responseObserver);
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

  private static abstract class KeywordPlanNegativeKeywordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeywordPlanNegativeKeywordServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v3.services.KeywordPlanNegativeKeywordServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeywordPlanNegativeKeywordService");
    }
  }

  private static final class KeywordPlanNegativeKeywordServiceFileDescriptorSupplier
      extends KeywordPlanNegativeKeywordServiceBaseDescriptorSupplier {
    KeywordPlanNegativeKeywordServiceFileDescriptorSupplier() {}
  }

  private static final class KeywordPlanNegativeKeywordServiceMethodDescriptorSupplier
      extends KeywordPlanNegativeKeywordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeywordPlanNegativeKeywordServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeywordPlanNegativeKeywordServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeywordPlanNegativeKeywordServiceFileDescriptorSupplier())
              .addMethod(getGetKeywordPlanNegativeKeywordMethodHelper())
              .addMethod(getMutateKeywordPlanNegativeKeywordsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
