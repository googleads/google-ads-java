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
 * Service to manage Keyword Plan ad groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v6/services/keyword_plan_ad_group_service.proto")
public final class KeywordPlanAdGroupServiceGrpc {

  private KeywordPlanAdGroupServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v6.services.KeywordPlanAdGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetKeywordPlanAdGroupRequest,
      com.google.ads.googleads.v6.resources.KeywordPlanAdGroup> getGetKeywordPlanAdGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKeywordPlanAdGroup",
      requestType = com.google.ads.googleads.v6.services.GetKeywordPlanAdGroupRequest.class,
      responseType = com.google.ads.googleads.v6.resources.KeywordPlanAdGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetKeywordPlanAdGroupRequest,
      com.google.ads.googleads.v6.resources.KeywordPlanAdGroup> getGetKeywordPlanAdGroupMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.GetKeywordPlanAdGroupRequest, com.google.ads.googleads.v6.resources.KeywordPlanAdGroup> getGetKeywordPlanAdGroupMethod;
    if ((getGetKeywordPlanAdGroupMethod = KeywordPlanAdGroupServiceGrpc.getGetKeywordPlanAdGroupMethod) == null) {
      synchronized (KeywordPlanAdGroupServiceGrpc.class) {
        if ((getGetKeywordPlanAdGroupMethod = KeywordPlanAdGroupServiceGrpc.getGetKeywordPlanAdGroupMethod) == null) {
          KeywordPlanAdGroupServiceGrpc.getGetKeywordPlanAdGroupMethod = getGetKeywordPlanAdGroupMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.GetKeywordPlanAdGroupRequest, com.google.ads.googleads.v6.resources.KeywordPlanAdGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKeywordPlanAdGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.GetKeywordPlanAdGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.resources.KeywordPlanAdGroup.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanAdGroupServiceMethodDescriptorSupplier("GetKeywordPlanAdGroup"))
              .build();
        }
      }
    }
    return getGetKeywordPlanAdGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsRequest,
      com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsResponse> getMutateKeywordPlanAdGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MutateKeywordPlanAdGroups",
      requestType = com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsRequest.class,
      responseType = com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsRequest,
      com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsResponse> getMutateKeywordPlanAdGroupsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsRequest, com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsResponse> getMutateKeywordPlanAdGroupsMethod;
    if ((getMutateKeywordPlanAdGroupsMethod = KeywordPlanAdGroupServiceGrpc.getMutateKeywordPlanAdGroupsMethod) == null) {
      synchronized (KeywordPlanAdGroupServiceGrpc.class) {
        if ((getMutateKeywordPlanAdGroupsMethod = KeywordPlanAdGroupServiceGrpc.getMutateKeywordPlanAdGroupsMethod) == null) {
          KeywordPlanAdGroupServiceGrpc.getMutateKeywordPlanAdGroupsMethod = getMutateKeywordPlanAdGroupsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsRequest, com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MutateKeywordPlanAdGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsResponse.getDefaultInstance()))
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
     * Returns the requested Keyword Plan ad group in full detail.
     * </pre>
     */
    public void getKeywordPlanAdGroup(com.google.ads.googleads.v6.services.GetKeywordPlanAdGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.KeywordPlanAdGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetKeywordPlanAdGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad groups. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateKeywordPlanAdGroups(com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateKeywordPlanAdGroupsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetKeywordPlanAdGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.GetKeywordPlanAdGroupRequest,
                com.google.ads.googleads.v6.resources.KeywordPlanAdGroup>(
                  this, METHODID_GET_KEYWORD_PLAN_AD_GROUP)))
          .addMethod(
            getMutateKeywordPlanAdGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsRequest,
                com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsResponse>(
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
     * Returns the requested Keyword Plan ad group in full detail.
     * </pre>
     */
    public void getKeywordPlanAdGroup(com.google.ads.googleads.v6.services.GetKeywordPlanAdGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.KeywordPlanAdGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetKeywordPlanAdGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad groups. Operation statuses are
     * returned.
     * </pre>
     */
    public void mutateKeywordPlanAdGroups(com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsResponse> responseObserver) {
      asyncUnaryCall(
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
     * Returns the requested Keyword Plan ad group in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v6.resources.KeywordPlanAdGroup getKeywordPlanAdGroup(com.google.ads.googleads.v6.services.GetKeywordPlanAdGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetKeywordPlanAdGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad groups. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsResponse mutateKeywordPlanAdGroups(com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsRequest request) {
      return blockingUnaryCall(
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
     * Returns the requested Keyword Plan ad group in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.resources.KeywordPlanAdGroup> getKeywordPlanAdGroup(
        com.google.ads.googleads.v6.services.GetKeywordPlanAdGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetKeywordPlanAdGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes Keyword Plan ad groups. Operation statuses are
     * returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsResponse> mutateKeywordPlanAdGroups(
        com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateKeywordPlanAdGroupsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_KEYWORD_PLAN_AD_GROUP = 0;
  private static final int METHODID_MUTATE_KEYWORD_PLAN_AD_GROUPS = 1;

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
        case METHODID_GET_KEYWORD_PLAN_AD_GROUP:
          serviceImpl.getKeywordPlanAdGroup((com.google.ads.googleads.v6.services.GetKeywordPlanAdGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.resources.KeywordPlanAdGroup>) responseObserver);
          break;
        case METHODID_MUTATE_KEYWORD_PLAN_AD_GROUPS:
          serviceImpl.mutateKeywordPlanAdGroups((com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v6.services.MutateKeywordPlanAdGroupsResponse>) responseObserver);
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
      return com.google.ads.googleads.v6.services.KeywordPlanAdGroupServiceProto.getDescriptor();
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
              .addMethod(getGetKeywordPlanAdGroupMethod())
              .addMethod(getMutateKeywordPlanAdGroupsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
