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
 * This service allows management of links between Google Ads and Google
 * Merchant Center.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v2/services/merchant_center_link_service.proto")
public final class MerchantCenterLinkServiceGrpc {

  private MerchantCenterLinkServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v2.services.MerchantCenterLinkService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListMerchantCenterLinksMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.ListMerchantCenterLinksRequest,
      com.google.ads.googleads.v2.services.ListMerchantCenterLinksResponse> METHOD_LIST_MERCHANT_CENTER_LINKS = getListMerchantCenterLinksMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.ListMerchantCenterLinksRequest,
      com.google.ads.googleads.v2.services.ListMerchantCenterLinksResponse> getListMerchantCenterLinksMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.ListMerchantCenterLinksRequest,
      com.google.ads.googleads.v2.services.ListMerchantCenterLinksResponse> getListMerchantCenterLinksMethod() {
    return getListMerchantCenterLinksMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.ListMerchantCenterLinksRequest,
      com.google.ads.googleads.v2.services.ListMerchantCenterLinksResponse> getListMerchantCenterLinksMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.ListMerchantCenterLinksRequest, com.google.ads.googleads.v2.services.ListMerchantCenterLinksResponse> getListMerchantCenterLinksMethod;
    if ((getListMerchantCenterLinksMethod = MerchantCenterLinkServiceGrpc.getListMerchantCenterLinksMethod) == null) {
      synchronized (MerchantCenterLinkServiceGrpc.class) {
        if ((getListMerchantCenterLinksMethod = MerchantCenterLinkServiceGrpc.getListMerchantCenterLinksMethod) == null) {
          MerchantCenterLinkServiceGrpc.getListMerchantCenterLinksMethod = getListMerchantCenterLinksMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.ListMerchantCenterLinksRequest, com.google.ads.googleads.v2.services.ListMerchantCenterLinksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.MerchantCenterLinkService", "ListMerchantCenterLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.ListMerchantCenterLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.ListMerchantCenterLinksResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MerchantCenterLinkServiceMethodDescriptorSupplier("ListMerchantCenterLinks"))
                  .build();
          }
        }
     }
     return getListMerchantCenterLinksMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetMerchantCenterLinkMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetMerchantCenterLinkRequest,
      com.google.ads.googleads.v2.resources.MerchantCenterLink> METHOD_GET_MERCHANT_CENTER_LINK = getGetMerchantCenterLinkMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetMerchantCenterLinkRequest,
      com.google.ads.googleads.v2.resources.MerchantCenterLink> getGetMerchantCenterLinkMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetMerchantCenterLinkRequest,
      com.google.ads.googleads.v2.resources.MerchantCenterLink> getGetMerchantCenterLinkMethod() {
    return getGetMerchantCenterLinkMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetMerchantCenterLinkRequest,
      com.google.ads.googleads.v2.resources.MerchantCenterLink> getGetMerchantCenterLinkMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.GetMerchantCenterLinkRequest, com.google.ads.googleads.v2.resources.MerchantCenterLink> getGetMerchantCenterLinkMethod;
    if ((getGetMerchantCenterLinkMethod = MerchantCenterLinkServiceGrpc.getGetMerchantCenterLinkMethod) == null) {
      synchronized (MerchantCenterLinkServiceGrpc.class) {
        if ((getGetMerchantCenterLinkMethod = MerchantCenterLinkServiceGrpc.getGetMerchantCenterLinkMethod) == null) {
          MerchantCenterLinkServiceGrpc.getGetMerchantCenterLinkMethod = getGetMerchantCenterLinkMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.GetMerchantCenterLinkRequest, com.google.ads.googleads.v2.resources.MerchantCenterLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.MerchantCenterLinkService", "GetMerchantCenterLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.GetMerchantCenterLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.resources.MerchantCenterLink.getDefaultInstance()))
                  .setSchemaDescriptor(new MerchantCenterLinkServiceMethodDescriptorSupplier("GetMerchantCenterLink"))
                  .build();
          }
        }
     }
     return getGetMerchantCenterLinkMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateMerchantCenterLinkMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateMerchantCenterLinkRequest,
      com.google.ads.googleads.v2.services.MutateMerchantCenterLinkResponse> METHOD_MUTATE_MERCHANT_CENTER_LINK = getMutateMerchantCenterLinkMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateMerchantCenterLinkRequest,
      com.google.ads.googleads.v2.services.MutateMerchantCenterLinkResponse> getMutateMerchantCenterLinkMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateMerchantCenterLinkRequest,
      com.google.ads.googleads.v2.services.MutateMerchantCenterLinkResponse> getMutateMerchantCenterLinkMethod() {
    return getMutateMerchantCenterLinkMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateMerchantCenterLinkRequest,
      com.google.ads.googleads.v2.services.MutateMerchantCenterLinkResponse> getMutateMerchantCenterLinkMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v2.services.MutateMerchantCenterLinkRequest, com.google.ads.googleads.v2.services.MutateMerchantCenterLinkResponse> getMutateMerchantCenterLinkMethod;
    if ((getMutateMerchantCenterLinkMethod = MerchantCenterLinkServiceGrpc.getMutateMerchantCenterLinkMethod) == null) {
      synchronized (MerchantCenterLinkServiceGrpc.class) {
        if ((getMutateMerchantCenterLinkMethod = MerchantCenterLinkServiceGrpc.getMutateMerchantCenterLinkMethod) == null) {
          MerchantCenterLinkServiceGrpc.getMutateMerchantCenterLinkMethod = getMutateMerchantCenterLinkMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v2.services.MutateMerchantCenterLinkRequest, com.google.ads.googleads.v2.services.MutateMerchantCenterLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v2.services.MerchantCenterLinkService", "MutateMerchantCenterLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateMerchantCenterLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v2.services.MutateMerchantCenterLinkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MerchantCenterLinkServiceMethodDescriptorSupplier("MutateMerchantCenterLink"))
                  .build();
          }
        }
     }
     return getMutateMerchantCenterLinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MerchantCenterLinkServiceStub newStub(io.grpc.Channel channel) {
    return new MerchantCenterLinkServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MerchantCenterLinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MerchantCenterLinkServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MerchantCenterLinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MerchantCenterLinkServiceFutureStub(channel);
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads and Google
   * Merchant Center.
   * </pre>
   */
  public static abstract class MerchantCenterLinkServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns Merchant Center links available tor this customer.
     * </pre>
     */
    public void listMerchantCenterLinks(com.google.ads.googleads.v2.services.ListMerchantCenterLinksRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.ListMerchantCenterLinksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMerchantCenterLinksMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Returns the Merchant Center link in full detail.
     * </pre>
     */
    public void getMerchantCenterLink(com.google.ads.googleads.v2.services.GetMerchantCenterLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.MerchantCenterLink> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMerchantCenterLinkMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Updates status or removes a Merchant Center link.
     * </pre>
     */
    public void mutateMerchantCenterLink(com.google.ads.googleads.v2.services.MutateMerchantCenterLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateMerchantCenterLinkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateMerchantCenterLinkMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMerchantCenterLinksMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.ListMerchantCenterLinksRequest,
                com.google.ads.googleads.v2.services.ListMerchantCenterLinksResponse>(
                  this, METHODID_LIST_MERCHANT_CENTER_LINKS)))
          .addMethod(
            getGetMerchantCenterLinkMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.GetMerchantCenterLinkRequest,
                com.google.ads.googleads.v2.resources.MerchantCenterLink>(
                  this, METHODID_GET_MERCHANT_CENTER_LINK)))
          .addMethod(
            getMutateMerchantCenterLinkMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v2.services.MutateMerchantCenterLinkRequest,
                com.google.ads.googleads.v2.services.MutateMerchantCenterLinkResponse>(
                  this, METHODID_MUTATE_MERCHANT_CENTER_LINK)))
          .build();
    }
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads and Google
   * Merchant Center.
   * </pre>
   */
  public static final class MerchantCenterLinkServiceStub extends io.grpc.stub.AbstractStub<MerchantCenterLinkServiceStub> {
    private MerchantCenterLinkServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MerchantCenterLinkServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MerchantCenterLinkServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MerchantCenterLinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns Merchant Center links available tor this customer.
     * </pre>
     */
    public void listMerchantCenterLinks(com.google.ads.googleads.v2.services.ListMerchantCenterLinksRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.ListMerchantCenterLinksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMerchantCenterLinksMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the Merchant Center link in full detail.
     * </pre>
     */
    public void getMerchantCenterLink(com.google.ads.googleads.v2.services.GetMerchantCenterLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.MerchantCenterLink> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMerchantCenterLinkMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates status or removes a Merchant Center link.
     * </pre>
     */
    public void mutateMerchantCenterLink(com.google.ads.googleads.v2.services.MutateMerchantCenterLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateMerchantCenterLinkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateMerchantCenterLinkMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads and Google
   * Merchant Center.
   * </pre>
   */
  public static final class MerchantCenterLinkServiceBlockingStub extends io.grpc.stub.AbstractStub<MerchantCenterLinkServiceBlockingStub> {
    private MerchantCenterLinkServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MerchantCenterLinkServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MerchantCenterLinkServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MerchantCenterLinkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns Merchant Center links available tor this customer.
     * </pre>
     */
    public com.google.ads.googleads.v2.services.ListMerchantCenterLinksResponse listMerchantCenterLinks(com.google.ads.googleads.v2.services.ListMerchantCenterLinksRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMerchantCenterLinksMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the Merchant Center link in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v2.resources.MerchantCenterLink getMerchantCenterLink(com.google.ads.googleads.v2.services.GetMerchantCenterLinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMerchantCenterLinkMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates status or removes a Merchant Center link.
     * </pre>
     */
    public com.google.ads.googleads.v2.services.MutateMerchantCenterLinkResponse mutateMerchantCenterLink(com.google.ads.googleads.v2.services.MutateMerchantCenterLinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateMerchantCenterLinkMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This service allows management of links between Google Ads and Google
   * Merchant Center.
   * </pre>
   */
  public static final class MerchantCenterLinkServiceFutureStub extends io.grpc.stub.AbstractStub<MerchantCenterLinkServiceFutureStub> {
    private MerchantCenterLinkServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MerchantCenterLinkServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MerchantCenterLinkServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MerchantCenterLinkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns Merchant Center links available tor this customer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.services.ListMerchantCenterLinksResponse> listMerchantCenterLinks(
        com.google.ads.googleads.v2.services.ListMerchantCenterLinksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMerchantCenterLinksMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the Merchant Center link in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.resources.MerchantCenterLink> getMerchantCenterLink(
        com.google.ads.googleads.v2.services.GetMerchantCenterLinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMerchantCenterLinkMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates status or removes a Merchant Center link.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v2.services.MutateMerchantCenterLinkResponse> mutateMerchantCenterLink(
        com.google.ads.googleads.v2.services.MutateMerchantCenterLinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateMerchantCenterLinkMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_MERCHANT_CENTER_LINKS = 0;
  private static final int METHODID_GET_MERCHANT_CENTER_LINK = 1;
  private static final int METHODID_MUTATE_MERCHANT_CENTER_LINK = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MerchantCenterLinkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MerchantCenterLinkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_MERCHANT_CENTER_LINKS:
          serviceImpl.listMerchantCenterLinks((com.google.ads.googleads.v2.services.ListMerchantCenterLinksRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.ListMerchantCenterLinksResponse>) responseObserver);
          break;
        case METHODID_GET_MERCHANT_CENTER_LINK:
          serviceImpl.getMerchantCenterLink((com.google.ads.googleads.v2.services.GetMerchantCenterLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.resources.MerchantCenterLink>) responseObserver);
          break;
        case METHODID_MUTATE_MERCHANT_CENTER_LINK:
          serviceImpl.mutateMerchantCenterLink((com.google.ads.googleads.v2.services.MutateMerchantCenterLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v2.services.MutateMerchantCenterLinkResponse>) responseObserver);
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

  private static abstract class MerchantCenterLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MerchantCenterLinkServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v2.services.MerchantCenterLinkServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MerchantCenterLinkService");
    }
  }

  private static final class MerchantCenterLinkServiceFileDescriptorSupplier
      extends MerchantCenterLinkServiceBaseDescriptorSupplier {
    MerchantCenterLinkServiceFileDescriptorSupplier() {}
  }

  private static final class MerchantCenterLinkServiceMethodDescriptorSupplier
      extends MerchantCenterLinkServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MerchantCenterLinkServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MerchantCenterLinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MerchantCenterLinkServiceFileDescriptorSupplier())
              .addMethod(getListMerchantCenterLinksMethodHelper())
              .addMethod(getGetMerchantCenterLinkMethodHelper())
              .addMethod(getMutateMerchantCenterLinkMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
