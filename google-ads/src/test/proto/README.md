# Google Ads Test Protos

The .proto files in this directory are used to generate the classes in the
`src/test/java/com/google/ads/googleads/test` directory. Those classes can be regenerated using the
[protobuf compiler (protoc)](https://github.com/google/protobuf/releases).

To regenerate, run:
```
$ cd src/test/proto
$ protoc --java_out ../java/ google/ads/googleads/test/tester.proto
```

You must install protoc with proto3 presence support (>= 3.12.4).
For example: https://github.com/protocolbuffers/protobuf/releases/tag/v3.12.4