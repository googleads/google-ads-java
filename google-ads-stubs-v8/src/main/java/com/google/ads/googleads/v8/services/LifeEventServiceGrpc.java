package com.google.ads.googleads.v8.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to fetch Google Ads Life Events.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v8/services/life_event_service.proto")
public final class LifeEventServiceGrpc {

  private LifeEventServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v8.services.LifeEventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetLifeEventRequest,
      com.google.ads.googleads.v8.resources.LifeEvent> getGetLifeEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLifeEvent",
      requestType = com.google.ads.googleads.v8.services.GetLifeEventRequest.class,
      responseType = com.google.ads.googleads.v8.resources.LifeEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetLifeEventRequest,
      com.google.ads.googleads.v8.resources.LifeEvent> getGetLifeEventMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v8.services.GetLifeEventRequest, com.google.ads.googleads.v8.resources.LifeEvent> getGetLifeEventMethod;
    if ((getGetLifeEventMethod = LifeEventServiceGrpc.getGetLifeEventMethod) == null) {
      synchronized (LifeEventServiceGrpc.class) {
        if ((getGetLifeEventMethod = LifeEventServiceGrpc.getGetLifeEventMethod) == null) {
          LifeEventServiceGrpc.getGetLifeEventMethod = getGetLifeEventMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v8.services.GetLifeEventRequest, com.google.ads.googleads.v8.resources.LifeEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLifeEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.services.GetLifeEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v8.resources.LifeEvent.getDefaultInstance()))
              .setSchemaDescriptor(new LifeEventServiceMethodDescriptorSupplier("GetLifeEvent"))
              .build();
        }
      }
    }
    return getGetLifeEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LifeEventServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LifeEventServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LifeEventServiceStub>() {
        @java.lang.Override
        public LifeEventServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LifeEventServiceStub(channel, callOptions);
        }
      };
    return LifeEventServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LifeEventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LifeEventServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LifeEventServiceBlockingStub>() {
        @java.lang.Override
        public LifeEventServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LifeEventServiceBlockingStub(channel, callOptions);
        }
      };
    return LifeEventServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LifeEventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LifeEventServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LifeEventServiceFutureStub>() {
        @java.lang.Override
        public LifeEventServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LifeEventServiceFutureStub(channel, callOptions);
        }
      };
    return LifeEventServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to fetch Google Ads Life Events.
   * </pre>
   */
  public static abstract class LifeEventServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested life event in full detail.
     * </pre>
     */
    public void getLifeEvent(com.google.ads.googleads.v8.services.GetLifeEventRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.LifeEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLifeEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLifeEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v8.services.GetLifeEventRequest,
                com.google.ads.googleads.v8.resources.LifeEvent>(
                  this, METHODID_GET_LIFE_EVENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to fetch Google Ads Life Events.
   * </pre>
   */
  public static final class LifeEventServiceStub extends io.grpc.stub.AbstractAsyncStub<LifeEventServiceStub> {
    private LifeEventServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LifeEventServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LifeEventServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested life event in full detail.
     * </pre>
     */
    public void getLifeEvent(com.google.ads.googleads.v8.services.GetLifeEventRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.LifeEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLifeEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to fetch Google Ads Life Events.
   * </pre>
   */
  public static final class LifeEventServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LifeEventServiceBlockingStub> {
    private LifeEventServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LifeEventServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LifeEventServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested life event in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v8.resources.LifeEvent getLifeEvent(com.google.ads.googleads.v8.services.GetLifeEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLifeEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to fetch Google Ads Life Events.
   * </pre>
   */
  public static final class LifeEventServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LifeEventServiceFutureStub> {
    private LifeEventServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LifeEventServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LifeEventServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested life event in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v8.resources.LifeEvent> getLifeEvent(
        com.google.ads.googleads.v8.services.GetLifeEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLifeEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LIFE_EVENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LifeEventServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LifeEventServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LIFE_EVENT:
          serviceImpl.getLifeEvent((com.google.ads.googleads.v8.services.GetLifeEventRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v8.resources.LifeEvent>) responseObserver);
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

  private static abstract class LifeEventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LifeEventServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v8.services.LifeEventServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LifeEventService");
    }
  }

  private static final class LifeEventServiceFileDescriptorSupplier
      extends LifeEventServiceBaseDescriptorSupplier {
    LifeEventServiceFileDescriptorSupplier() {}
  }

  private static final class LifeEventServiceMethodDescriptorSupplier
      extends LifeEventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LifeEventServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LifeEventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LifeEventServiceFileDescriptorSupplier())
              .addMethod(getGetLifeEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
