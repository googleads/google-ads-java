# Google Ads API Client Library for Java

This project hosts the Java client library for the Google Ads API.

## Features

  * Distributed via [Maven](https://maven.apache.org/).
  * Easy management of credentials.
  * Easy creation of Google Ads API service clients.

## Requirements

  * Java 1.8+
  * Maven 3.0+ or Gradle 5.0+

## Bill of Materials (BOM)

Use the [Google Ads API Bill of Materials (BOM)](https://developers.google.com/google-ads/api/docs/client-libs/java/bill-of-materials) to manage dependency versions and avoid conflicts with shared transitive dependencies such as Guava, Protobuf, GAX, and gRPC.

Maven (`pom.xml`):

```xml
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.google.api-ads</groupId>
      <artifactId>google-ads-bom</artifactId>
      <version>48.2.0</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency>
  </dependencies>
</dependencyManagement>

<dependencies>
  <dependency>
    <groupId>com.google.api-ads</groupId>
    <artifactId>google-ads</artifactId>
  </dependency>
</dependencies>
```

Gradle (`build.gradle`):

```groovy
implementation platform('com.google.api-ads:google-ads-bom:48.2.0')
implementation 'com.google.api-ads:google-ads'
```

## Maven artifacts

```xml
<dependency>
  <groupId>com.google.api-ads</groupId>
  <artifactId>google-ads</artifactId>
  <version>48.2.0</version>
</dependency>
```

## Gradle dependency

```groovy
implementation 'com.google.api-ads:google-ads:48.2.0'
```

## Documentation

See the [Google Ads API client library for Java documentation](https://developers.google.com/google-ads/api/docs/client-libs/java).

## Miscellaneous

### Wiki

- https://github.com/googleads/google-ads-java/wiki

### Issue tracker

- https://github.com/googleads/google-ads-java/issues

### API documentation

- https://developers.google.com/google-ads/api

### Support

- https://developers.google.com/google-ads/api/support

### Authors

- [Josh Radcliff](https://github.com/jradcliff)
- [Natalie Ng](https://github.com/ngnatng)
- [Sarah Botwinick Pollack](https://github.com/sarahcaseybot)
