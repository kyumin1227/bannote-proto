package com.bannote.userservice.user.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The user service definition.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bannote.userservice.user.v1.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.GetUserRequest,
      com.bannote.userservice.user.v1.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.bannote.userservice.user.v1.GetUserRequest.class,
      responseType = com.bannote.userservice.user.v1.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.GetUserRequest,
      com.bannote.userservice.user.v1.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.GetUserRequest, com.bannote.userservice.user.v1.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.user.v1.GetUserRequest, com.bannote.userservice.user.v1.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.user.v1.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.user.v1.GetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.CheckRegistrationRequest,
      com.bannote.userservice.user.v1.CheckRegistrationResponse> getCheckRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckRegistration",
      requestType = com.bannote.userservice.user.v1.CheckRegistrationRequest.class,
      responseType = com.bannote.userservice.user.v1.CheckRegistrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.CheckRegistrationRequest,
      com.bannote.userservice.user.v1.CheckRegistrationResponse> getCheckRegistrationMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.CheckRegistrationRequest, com.bannote.userservice.user.v1.CheckRegistrationResponse> getCheckRegistrationMethod;
    if ((getCheckRegistrationMethod = UserServiceGrpc.getCheckRegistrationMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCheckRegistrationMethod = UserServiceGrpc.getCheckRegistrationMethod) == null) {
          UserServiceGrpc.getCheckRegistrationMethod = getCheckRegistrationMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.user.v1.CheckRegistrationRequest, com.bannote.userservice.user.v1.CheckRegistrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.user.v1.CheckRegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.user.v1.CheckRegistrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CheckRegistration"))
              .build();
        }
      }
    }
    return getCheckRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.CreateUserRequest,
      com.bannote.userservice.user.v1.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.bannote.userservice.user.v1.CreateUserRequest.class,
      responseType = com.bannote.userservice.user.v1.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.CreateUserRequest,
      com.bannote.userservice.user.v1.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.CreateUserRequest, com.bannote.userservice.user.v1.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.user.v1.CreateUserRequest, com.bannote.userservice.user.v1.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.user.v1.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.user.v1.CreateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.UpdateUserRequest,
      com.bannote.userservice.user.v1.UpdateUserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.bannote.userservice.user.v1.UpdateUserRequest.class,
      responseType = com.bannote.userservice.user.v1.UpdateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.UpdateUserRequest,
      com.bannote.userservice.user.v1.UpdateUserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.UpdateUserRequest, com.bannote.userservice.user.v1.UpdateUserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.user.v1.UpdateUserRequest, com.bannote.userservice.user.v1.UpdateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.user.v1.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.user.v1.UpdateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.SearchUsersByNameRequest,
      com.bannote.userservice.user.v1.SearchUsersByNameResponse> getSearchUsersByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchUsersByName",
      requestType = com.bannote.userservice.user.v1.SearchUsersByNameRequest.class,
      responseType = com.bannote.userservice.user.v1.SearchUsersByNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.SearchUsersByNameRequest,
      com.bannote.userservice.user.v1.SearchUsersByNameResponse> getSearchUsersByNameMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.SearchUsersByNameRequest, com.bannote.userservice.user.v1.SearchUsersByNameResponse> getSearchUsersByNameMethod;
    if ((getSearchUsersByNameMethod = UserServiceGrpc.getSearchUsersByNameMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSearchUsersByNameMethod = UserServiceGrpc.getSearchUsersByNameMethod) == null) {
          UserServiceGrpc.getSearchUsersByNameMethod = getSearchUsersByNameMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.user.v1.SearchUsersByNameRequest, com.bannote.userservice.user.v1.SearchUsersByNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchUsersByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.user.v1.SearchUsersByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.user.v1.SearchUsersByNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SearchUsersByName"))
              .build();
        }
      }
    }
    return getSearchUsersByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.ListUsersRequest,
      com.bannote.userservice.user.v1.ListUsersResponse> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsers",
      requestType = com.bannote.userservice.user.v1.ListUsersRequest.class,
      responseType = com.bannote.userservice.user.v1.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.ListUsersRequest,
      com.bannote.userservice.user.v1.ListUsersResponse> getListUsersMethod() {
    io.grpc.MethodDescriptor<com.bannote.userservice.user.v1.ListUsersRequest, com.bannote.userservice.user.v1.ListUsersResponse> getListUsersMethod;
    if ((getListUsersMethod = UserServiceGrpc.getListUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListUsersMethod = UserServiceGrpc.getListUsersMethod) == null) {
          UserServiceGrpc.getListUsersMethod = getListUsersMethod =
              io.grpc.MethodDescriptor.<com.bannote.userservice.user.v1.ListUsersRequest, com.bannote.userservice.user.v1.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.user.v1.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bannote.userservice.user.v1.ListUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListUsers"))
              .build();
        }
      }
    }
    return getListUsersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static UserServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingV2Stub>() {
        @java.lang.Override
        public UserServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return UserServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The user service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     *  유저 번호를 이용하여 유저를 가져오는 API
     * </pre>
     */
    default void getUser(com.bannote.userservice.user.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.GetUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     *  이메일로 회원 가입 여부 확인 API
     * </pre>
     */
    default void checkRegistration(com.bannote.userservice.user.v1.CheckRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.CheckRegistrationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     *  회원 가입 API
     * </pre>
     */
    default void createUser(com.bannote.userservice.user.v1.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.CreateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     *  본인이 스스로 변경 가능한 정보를 변경하는 API
     * </pre>
     */
    default void updateUser(com.bannote.userservice.user.v1.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     *  이름으로 유저 검색 API (부분 일치)
     * </pre>
     */
    default void searchUsersByName(com.bannote.userservice.user.v1.SearchUsersByNameRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.SearchUsersByNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchUsersByNameMethod(), responseObserver);
    }

    /**
     * <pre>
     *  유저 목록 조회 API (다양한 필터 지원)
     * </pre>
     */
    default void listUsers(com.bannote.userservice.user.v1.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.ListUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   * <pre>
   * The user service definition.
   * </pre>
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   * <pre>
   * The user service definition.
   * </pre>
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *  유저 번호를 이용하여 유저를 가져오는 API
     * </pre>
     */
    public void getUser(com.bannote.userservice.user.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.GetUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  이메일로 회원 가입 여부 확인 API
     * </pre>
     */
    public void checkRegistration(com.bannote.userservice.user.v1.CheckRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.CheckRegistrationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  회원 가입 API
     * </pre>
     */
    public void createUser(com.bannote.userservice.user.v1.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.CreateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  본인이 스스로 변경 가능한 정보를 변경하는 API
     * </pre>
     */
    public void updateUser(com.bannote.userservice.user.v1.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  이름으로 유저 검색 API (부분 일치)
     * </pre>
     */
    public void searchUsersByName(com.bannote.userservice.user.v1.SearchUsersByNameRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.SearchUsersByNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchUsersByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  유저 목록 조회 API (다양한 필터 지원)
     * </pre>
     */
    public void listUsers(com.bannote.userservice.user.v1.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.ListUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   * <pre>
   * The user service definition.
   * </pre>
   */
  public static final class UserServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingV2Stub> {
    private UserServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     *  유저 번호를 이용하여 유저를 가져오는 API
     * </pre>
     */
    public com.bannote.userservice.user.v1.GetUserResponse getUser(com.bannote.userservice.user.v1.GetUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  이메일로 회원 가입 여부 확인 API
     * </pre>
     */
    public com.bannote.userservice.user.v1.CheckRegistrationResponse checkRegistration(com.bannote.userservice.user.v1.CheckRegistrationRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCheckRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  회원 가입 API
     * </pre>
     */
    public com.bannote.userservice.user.v1.CreateUserResponse createUser(com.bannote.userservice.user.v1.CreateUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  본인이 스스로 변경 가능한 정보를 변경하는 API
     * </pre>
     */
    public com.bannote.userservice.user.v1.UpdateUserResponse updateUser(com.bannote.userservice.user.v1.UpdateUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  이름으로 유저 검색 API (부분 일치)
     * </pre>
     */
    public com.bannote.userservice.user.v1.SearchUsersByNameResponse searchUsersByName(com.bannote.userservice.user.v1.SearchUsersByNameRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getSearchUsersByNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  유저 목록 조회 API (다양한 필터 지원)
     * </pre>
     */
    public com.bannote.userservice.user.v1.ListUsersResponse listUsers(com.bannote.userservice.user.v1.ListUsersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service UserService.
   * <pre>
   * The user service definition.
   * </pre>
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *  유저 번호를 이용하여 유저를 가져오는 API
     * </pre>
     */
    public com.bannote.userservice.user.v1.GetUserResponse getUser(com.bannote.userservice.user.v1.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  이메일로 회원 가입 여부 확인 API
     * </pre>
     */
    public com.bannote.userservice.user.v1.CheckRegistrationResponse checkRegistration(com.bannote.userservice.user.v1.CheckRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  회원 가입 API
     * </pre>
     */
    public com.bannote.userservice.user.v1.CreateUserResponse createUser(com.bannote.userservice.user.v1.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  본인이 스스로 변경 가능한 정보를 변경하는 API
     * </pre>
     */
    public com.bannote.userservice.user.v1.UpdateUserResponse updateUser(com.bannote.userservice.user.v1.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  이름으로 유저 검색 API (부분 일치)
     * </pre>
     */
    public com.bannote.userservice.user.v1.SearchUsersByNameResponse searchUsersByName(com.bannote.userservice.user.v1.SearchUsersByNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchUsersByNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  유저 목록 조회 API (다양한 필터 지원)
     * </pre>
     */
    public com.bannote.userservice.user.v1.ListUsersResponse listUsers(com.bannote.userservice.user.v1.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   * <pre>
   * The user service definition.
   * </pre>
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *  유저 번호를 이용하여 유저를 가져오는 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.user.v1.GetUserResponse> getUser(
        com.bannote.userservice.user.v1.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  이메일로 회원 가입 여부 확인 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.user.v1.CheckRegistrationResponse> checkRegistration(
        com.bannote.userservice.user.v1.CheckRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  회원 가입 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.user.v1.CreateUserResponse> createUser(
        com.bannote.userservice.user.v1.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  본인이 스스로 변경 가능한 정보를 변경하는 API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.user.v1.UpdateUserResponse> updateUser(
        com.bannote.userservice.user.v1.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  이름으로 유저 검색 API (부분 일치)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.user.v1.SearchUsersByNameResponse> searchUsersByName(
        com.bannote.userservice.user.v1.SearchUsersByNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchUsersByNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  유저 목록 조회 API (다양한 필터 지원)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bannote.userservice.user.v1.ListUsersResponse> listUsers(
        com.bannote.userservice.user.v1.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;
  private static final int METHODID_CHECK_REGISTRATION = 1;
  private static final int METHODID_CREATE_USER = 2;
  private static final int METHODID_UPDATE_USER = 3;
  private static final int METHODID_SEARCH_USERS_BY_NAME = 4;
  private static final int METHODID_LIST_USERS = 5;

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
        case METHODID_GET_USER:
          serviceImpl.getUser((com.bannote.userservice.user.v1.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.GetUserResponse>) responseObserver);
          break;
        case METHODID_CHECK_REGISTRATION:
          serviceImpl.checkRegistration((com.bannote.userservice.user.v1.CheckRegistrationRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.CheckRegistrationResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.bannote.userservice.user.v1.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.CreateUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.bannote.userservice.user.v1.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.UpdateUserResponse>) responseObserver);
          break;
        case METHODID_SEARCH_USERS_BY_NAME:
          serviceImpl.searchUsersByName((com.bannote.userservice.user.v1.SearchUsersByNameRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.SearchUsersByNameResponse>) responseObserver);
          break;
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((com.bannote.userservice.user.v1.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.bannote.userservice.user.v1.ListUsersResponse>) responseObserver);
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
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.user.v1.GetUserRequest,
              com.bannote.userservice.user.v1.GetUserResponse>(
                service, METHODID_GET_USER)))
        .addMethod(
          getCheckRegistrationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.user.v1.CheckRegistrationRequest,
              com.bannote.userservice.user.v1.CheckRegistrationResponse>(
                service, METHODID_CHECK_REGISTRATION)))
        .addMethod(
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.user.v1.CreateUserRequest,
              com.bannote.userservice.user.v1.CreateUserResponse>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.user.v1.UpdateUserRequest,
              com.bannote.userservice.user.v1.UpdateUserResponse>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getSearchUsersByNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.user.v1.SearchUsersByNameRequest,
              com.bannote.userservice.user.v1.SearchUsersByNameResponse>(
                service, METHODID_SEARCH_USERS_BY_NAME)))
        .addMethod(
          getListUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bannote.userservice.user.v1.ListUsersRequest,
              com.bannote.userservice.user.v1.ListUsersResponse>(
                service, METHODID_LIST_USERS)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bannote.userservice.user.v1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUserMethod())
              .addMethod(getCheckRegistrationMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getSearchUsersByNameMethod())
              .addMethod(getListUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
