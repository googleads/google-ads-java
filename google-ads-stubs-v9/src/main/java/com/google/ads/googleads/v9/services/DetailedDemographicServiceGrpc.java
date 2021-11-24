package com.google.ads.googleads.v9.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch Google Ads Detailed Demographics.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v9/services/detailed_demographic_service.proto")
public final class DetailedDemographicServiceGrpc {

  private DetailedDemographicServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v9.services.DetailedDemographicService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetDetailedDemographicRequest,
      com.google.ads.googleads.v9.resources.DetailedDemographic> getGetDetailedDemographicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDetailedDemographic",
      requestType = com.google.ads.googleads.v9.services.GetDetailedDemographicRequest.class,
      responseType = com.google.ads.googleads.v9.resources.DetailedDemographic.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetDetailedDemographicRequest,
      com.google.ads.googleads.v9.resources.DetailedDemographic> getGetDetailedDemographicMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v9.services.GetDetailedDemographicRequest, com.google.ads.googleads.v9.resources.DetailedDemographic> getGetDetailedDemographicMethod;
    if ((getGetDetailedDemographicMethod = DetailedDemographicServiceGrpc.getGetDetailedDemographicMethod) == null) {
      synchronized (DetailedDemographicServiceGrpc.class) {
        if ((getGetDetailedDemographicMethod = DetailedDemographicServiceGrpc.getGetDetailedDemographicMethod) == null) {
          DetailedDemographicServiceGrpc.getGetDetailedDemographicMethod = getGetDetailedDemographicMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v9.services.GetDetailedDemographicRequest, com.google.ads.googleads.v9.resources.DetailedDemographic>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDetailedDemographic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.services.GetDetailedDemographicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v9.resources.DetailedDemographic.getDefaultInstance()))
              .setSchemaDescriptor(new DetailedDemographicServiceMethodDescriptorSupplier("GetDetailedDemographic"))
              .build();
        }
      }
    }
    return getGetDetailedDemographicMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DetailedDemographicServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DetailedDemographicServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DetailedDemographicServiceStub>() {
        @java.lang.Override
        public DetailedDemographicServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DetailedDemographicServiceStub(channel, callOptions);
        }
      };
    return DetailedDemographicServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DetailedDemographicServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DetailedDemographicServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DetailedDemographicServiceBlockingStub>() {
        @java.lang.Override
        public DetailedDemographicServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DetailedDemographicServiceBlockingStub(channel, callOptions);
        }
      };
    return DetailedDemographicServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DetailedDemographicServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DetailedDemographicServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DetailedDemographicServiceFutureStub>() {
        @java.lang.Override
        public DetailedDemographicServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DetailedDemographicServiceFutureStub(channel, callOptions);
        }
      };
    return DetailedDemographicServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch Google Ads Detailed Demographics.
   * </pre>
   */
  public static abstract class DetailedDemographicServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested detailed demographic in full detail.
     * </pre>
     */
    public void getDetailedDemographic(com.google.ads.googleads.v9.services.GetDetailedDemographicRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.DetailedDemographic> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDetailedDemographicMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDetailedDemographicMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v9.services.GetDetailedDemographicRequest,
                com.google.ads.googleads.v9.resources.DetailedDemographic>(
                  this, METHODID_GET_DETAILED_DEMOGRAPHIC)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch Google Ads Detailed Demographics.
   * </pre>
   */
  public static final class DetailedDemographicServiceStub extends io.grpc.stub.AbstractAsyncStub<DetailedDemographicServiceStub> {
    private DetailedDemographicServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DetailedDemographicServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DetailedDemographicServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested detailed demographic in full detail.
     * </pre>
     */
    public void getDetailedDemographic(com.google.ads.googleads.v9.services.GetDetailedDemographicRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.DetailedDemographic> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDetailedDemographicMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch Google Ads Detailed Demographics.
   * </pre>
   */
  public static final class DetailedDemographicServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DetailedDemographicServiceBlockingStub> {
    private DetailedDemographicServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DetailedDemographicServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DetailedDemographicServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested detailed demographic in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v9.resources.DetailedDemographic getDetailedDemographic(com.google.ads.googleads.v9.services.GetDetailedDemographicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDetailedDemographicMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch Google Ads Detailed Demographics.
   * </pre>
   */
  public static final class DetailedDemographicServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DetailedDemographicServiceFutureStub> {
    private DetailedDemographicServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DetailedDemographicServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DetailedDemographicServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested detailed demographic in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v9.resources.DetailedDemographic> getDetailedDemographic(
        com.google.ads.googleads.v9.services.GetDetailedDemographicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDetailedDemographicMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DETAILED_DEMOGRAPHIC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DetailedDemographicServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DetailedDemographicServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DETAILED_DEMOGRAPHIC:
          serviceImpl.getDetailedDemographic((com.google.ads.googleads.v9.services.GetDetailedDemographicRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v9.resources.DetailedDemographic>) responseObserver);
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

  private static abstract class DetailedDemographicServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DetailedDemographicServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v9.services.DetailedDemographicServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DetailedDemographicService");
    }
  }

  private static final class DetailedDemographicServiceFileDescriptorSupplier
      extends DetailedDemographicServiceBaseDescriptorSupplier {
    DetailedDemographicServiceFileDescriptorSupplier() {}
  }

  private static final class DetailedDemographicServiceMethodDescriptorSupplier
      extends DetailedDemographicServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DetailedDemographicServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DetailedDemographicServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DetailedDemographicServiceFileDescriptorSupplier())
              .addMethod(getGetDetailedDemographicMethod())
              .build();
        }
      }
    }
    return result;
  }
}
