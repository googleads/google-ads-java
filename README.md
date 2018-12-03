# Google Ads API Client Library for Java

This project hosts the Java client library for the Google Ads API.

## Features

  * Distributed via [Maven](https://maven.apache.org/).
  * Easy management of credentials.
  * Easy creation of Google Ads API service clients.

## Requirements

  * Java 1.7+
  * Maven 3.0+

## Maven artifacts

    <dependency>
      <groupId>com.google.api-ads</groupId>
      <artifactId>google-ads</artifactId>
      <version>0.1.0</version>
    </dependency>

## Getting started

1.  Clone this project in the directory of your choice via:

        git clone https://github.com/googleads/google-ads-java.git

2.  Change into the `google-ads-java` directory.

        cd google-ads-java

    You'll see a parent `pom.xml` for the project, as well as the following
    subdirectories:

    *   `google-ads`: source code for the library.
    *   `google-ads-examples`: multiple examples that demonstrate how to use
        the library to execute common use cases via the Google Ads API.

3.  To run examples, you'll need to compile the `google-ads` and
    `google-ads-examples` code.

    **If you are using an IDE...**

    *   Import the `google-ads-examples` project and confirm that your IDE
        builds the project successfully.

    **If you are using Maven from the command line...**

    *   From the `google-ads-java` directory, install the snapshot version
        of the library.

            mvn install

    *   Change into the `google-ads-examples` directory.

            cd google-ads-examples

    *   Compile the examples project via:

            mvn compile

4.  Setup your OAuth2 credentials.

    The Google Ads API uses [OAuth2](http://oauth.net/2/) as the authentication
    mechanism. Choose the appropriate option below based on your use case, and
    read and follow the instructions that the example prints to the console.

    **If you already have credentials for the AdWords API...**

    *   You can use the same `ads.properties` file you used for the
        AdWords API. Simply copy the lines for the following keys and
        change the `api.adwords` prefix in each key from `api.adwords` to
        `api.googleads`:

            api.adwords.clientId       --> api.googleads.clientId
            api.adwords.clientSecret   --> api.googleads.clientSecret
            api.adwords.refreshToken   --> api.googleads.refreshToken
            api.adwords.developerToken --> api.googleads.developerToken

        If you are authenticating as a manager account, additionally you must specify:

            api.googleads.loginCustomerId --> Manager account ID (with hyphens removed).

    **If you're accessing the Google Ads API using your own credentials...**

    *   Follow the instructions at
        https://developers.google.com/google-ads/api/docs/oauth/cloud-project
        to create an OAuth2 client ID and secret for the **installed application**
        OAuth2 flow.

    *   Run the
        [AuthenticateInStandaloneApplication](https://github.com/googleads/google-ads-java/blob/master/google-ads-examples/src/main/java/com/google/ads/googleads/examples/authentication/AuthenticateInStandaloneApplication.java)
        example, which will prompt you for your OAuth2 client ID and secret.

        **If using an IDE:**

        The example may fail with an `IllegalArgumentException`
        if your IDE does not support using `System.console`. If the example
        fails, replace the `INSERT_CLIENT_ID_HERE` and `INSERT_CLIENT_SECRET_HERE`
        values in the
        [AuthenticateInStandaloneApplication](https://github.com/googleads/google-ads-java/blob/master/google-ads-examples/src/main/java/com/google/ads/googleads/examples/authentication/AuthenticateInStandaloneApplication.java)
        example with the client ID and secret from the step above, then run the
        example again.

        **If using the command line:**

        ```
        $ mvn exec:java -Dexec.mainClass="com.google.ads.googleads.examples.authentication.AuthenticateInStandaloneApplication"
        ```

    *   Copy the output from the last step of the example into a file named
        `ads.properties` in your home directory.

    **If you're accessing the Google Ads API on behalf of clients...**

    *   Follow the instructions at
        https://developers.google.com/google-ads/api/docs/oauth/cloud-project
        to create an OAuth2 client ID and secret for the **web application**
        OAuth2 flow.

    *   Run the
        [AuthenticateInWebApplication](https://github.com/googleads/google-ads-java/blob/master/google-ads-examples/src/main/java/com/google/ads/googleads/examples/authentication/AuthenticateInWebApplication.java)
        example, which will prompt you for your OAuth2 client ID and secret.

        **If using an IDE:**

        The example may fail with an `IllegalArgumentException`
        if your IDE does not support using `System.console`. If the example
        fails, replace the `INSERT_CLIENT_ID_HERE` and `INSERT_CLIENT_SECRET_HERE`
        values in the
        [AuthenticateInWebApplication](https://github.com/googleads/google-ads-java/blob/master/google-ads-examples/src/main/java/com/google/ads/googleads/examples/authentication/AuthenticateInWebApplication.java)
        example with the client ID and secret from the step above, then run the
        example again.

        **If using the command line:**

        ```
        $ mvn exec:java -Dexec.mainClass="com.google.ads.googleads.examples.authentication.AuthenticateInWebApplication"
        ```

    *   Copy the output from the last step of the example into a file named
        `ads.properties` in your home directory.

5.  After following the instructions printed to the console, you should have a
    file named `ads.properties` in your home directory.

    To ensure that the credentials in that file are valid, run the
    [GetCampaigns example](https://github.com/googleads/google-ads-java/tree/master/google-ads-examples/src/main/java/com/google/ads/googleads/examples/basicoperations/GetCampaigns.java),
    either via your IDE or from the command line using Maven. This example
    requires a `--customerId` parameter where the value is your Google Ads
    account's customer ID without dashes. Here's how you can pass that
    information if you are using Maven from the command line.

    ```
    $ mvn exec:java -Dexec.mainClass="com.google.ads.googleads.examples.basicoperations.GetCampaigns" \
        -Dexec.args="--customerId INSERT_CUSTOMER_ID_HERE"
    ```

6.  Explore other examples.

    The [examples](https://github.com/googleads/google-ads-java/tree/master/google-ads-examples/src/main/java/com/google/ads/googleads/examples)
    package in `google-ads-examples` contains several useful examples. Most
    of the examples require parameters. You can either pass the parameters as
    arguments (recommended) or edit the `INSERT_XXXXX_HERE` values in the
    source code. To see a usage statement for an example, pass `--help` as the
    only argument.

        $ mvn exec:java -Dexec.mainClass="com.google.ads.googleads.examples.basicoperations.GetCampaigns" \
            -Dexec.args="--help"

## Basic usage

### Create a GoogleAdsClient

To issue requests via the Google Ads API, you first need to create a
[GoogleAdsClient](https://github.com/googleads/google-ads-java/blob/master/google-ads/src/main/java/com/google/googleads/lib/GoogleAdsClient.java).
For convenience, you can store the required settings in a properties file with
the following format:

    # Credential for accessing Google's OAuth servers.
    # Provided by https://console.developers.google.com.
    api.googleads.clientId=INSERT_CLIENT_ID_HERE

    # Credential for accessing Google's OAuth servers.
    # Provided by https://console.developers.google.com.
    api.googleads.clientSecret=INSERT_CLIENT_SECRET_HERE

    # Renewable OAuth credential associated with 1 or more Google Ads accounts.
    api.googleads.refreshToken=INSERT_REFRESH_TOKEN_HERE

    # Token which provides access to the Google Ads API in general. It does not grant access to any
    # particular ad account (OAuth is used for this purpose).
    api.googleads.developerToken=INSERT_DEVELOPER_TOKEN_HERE

    # Required for manager accounts only: Specify the login customer ID used to
    # authenticate API calls. This will be the customer ID of the authenticated
    # manager account. You can also specify this later in code if your application
    # uses multiple manager account + OAuth pairs.
    #
    # api.googleads.loginCustomerId=INSERT_LOGIN_CUSTOEMR_ID_HERE

This configuration file format is similar to the format used in the AdWords
API's
[client library for Java](https://github.com/googleads/googleads-java-lib), but
uses property keys with the prefix `api.googleads` instead of `api.adwords`
so you can have separate configuration settings for the AdWords API and the
Google Ads API.

If you have an `ads.properties` configuration file in the above format in your
home directory, you can use the no-arg version of `fromPropertiesFile` as
follows:

```java
GoogleAdsClient googleAdsClient =
    GoogleAdsClient.newBuilder()
        .fromPropertiesFile().build();
```

If your configuration file is not in your home directory, you can pass the
file location to the `fromPropertiesFile` method as follows:

```java
GoogleAdsClient googleAdsClient =
    GoogleAdsClient.newBuilder()
        .fromPropertiesFile("/path/to/ads.properties").build();
```

You can also construct a `Credentials` object by specifying the client ID,
client secret, and refresh token at runtime, then pass that to the
`GoogleAdsClient` builder as follows:

```java
Credentials credentials =
    UserCredentials.newBuilder()
        .setClientId("INSERT_CLIENT_ID")
        .setClientSecret("INSERT_CLIENT_SECRET")
        .setRefreshToken("INSERT_REFRESH_TOKEN")
        .build();
GoogleAdsClient googleAdsClient =
    GoogleAdsClient.newBuilder()
        .setCredentials(credentials)
        .setDeveloperToken("INSERT_DEVELOPER_TOKEN_HERE")
        .setLoginCustomerId("INSERT_LOGIN_CUSTOMER_ID_HERE") // Manager accounts only.
        .build();
```

### Get a service client

Once you have an instance of `GoogleAdsClient`, you can obtain a service client
for a particular service using one of the `get...ServiceClient()` methods.
Wrapping this call in a try with resources block ensures that any
resources required to make the Google Ads API request are released upon exit
from the `try` block.

```java
try (CampaignServiceClient reportingServiceClient = googleAdsClient.getCampaignServiceClient()) {
  // Send a request...
}
```

## Miscellaneous

### Wiki

- https://github.com/googleads/google-ads-java/wiki

### Issue tracker

- https://github.com/googleads/google-ads-java/issues

### API Documentation:

- https://developers.google.com/google-ads/api/docs

### Support forum

- https://groups.google.com/forum/#!forum/adwords-api

### Authors

- [Josh Radcliff](https://github.com/jradcliff)
