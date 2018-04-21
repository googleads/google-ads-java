# Google Ads Test Protos

The .proto files in this directory are used to generate the classes in the
`src/test/java/com/google/ads/googleads/test` directory. Those classes can be regenerated using the
[protobuf compiler (protoc)](https://github.com/google/protobuf/releases).

To regenerate, run:
```
$ cd src/test/proto
$ protoc --java_out ../java/ google/ads/googleads/test/tester.proto
```
