# dyspatch-java

Dyspatch API
- API version: 2019.03
  - Build date: 2019-06-06T15:58:00.720-07:00[America/Vancouver]

# Introduction  
The Dyspatch API is based on the REST paradigm, and features resource based URLs with standard HTTP response codes to indicate errors. We use standard HTTP authentication and request verbs, and all responses are JSON formatted. 

## API Client Libraries  
Dyspatch provides API Clients for popular languages and web frameworks.   
- [Java](https://github.com/getdyspatch/dyspatch-java) 
- [Javascript](https://github.com/getdyspatch/dyspatch-javascript) 
- [Python](https://github.com/getdyspatch/dyspatch-python) 
- [C#](https://github.com/getdyspatch/dyspatch-dotnet) 
- [Go](https://github.com/getdyspatch/dyspatch-golang) 
- [Ruby](https://github.com/getdyspatch/dyspatch-ruby) 

For more information, please visit [https://docs.dyspatch.io](https://docs.dyspatch.io)


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.dyspatch</groupId>
  <artifactId>dyspatch-java</artifactId>
  <version>2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.dyspatch:dyspatch-java:2.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/dyspatch-java-2.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
package io.dyspatch.client;
import io.dyspatch.client.auth.*;
import io.dyspatch.client.model.*;
import io.dyspatch.client.api.LocalizationsApi;

public class LocalizationsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: Bearer
        ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setApiKey("YOUR API KEY");
        Bearer.setApiKeyPrefix("Bearer");

        LocalizationsApi apiInstance = new LocalizationsApi();
        String localizationId = "localizationId_example"; // String | A localization ID
        String targetLanguage = "targetLanguage_example"; // String | The type of templating language to compile as. Required for visual templates only.
        String accept = "application/vnd.dyspatch.2019.03+json"; // Optional String | A version of the API that should be used for the request. This client has been built for version 2.0 set the value to "application/vnd.dyspatch.2019.03+json"
        
        try {
            LocalizationRead result = apiInstance.localizationsLocalizationIdGet(localizationId, targetLanguage, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LocalizationsApi#localizationsLocalizationIdGet");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.dyspatch.io/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*LocalizationsApi* | [**localizationsLocalizationIdGet**](docs/LocalizationsApi.md#localizationsLocalizationIdGet) | **GET** /localizations/{localizationId} | Get Localization Object by ID
*TemplatesApi* | [**templatesGet**](docs/TemplatesApi.md#templatesGet) | **GET** /templates | List Templates
*TemplatesApi* | [**templatesTemplateIdGet**](docs/TemplatesApi.md#templatesTemplateIdGet) | **GET** /templates/{templateId} | Get Template by ID

## Documentation for Models

 - [APIError](docs/APIError.md)
 - [CompiledRead](docs/CompiledRead.md)
 - [Cursor](docs/Cursor.md)
 - [LocalizationMetaRead](docs/LocalizationMetaRead.md)
 - [LocalizationRead](docs/LocalizationRead.md)
 - [TemplateMetaRead](docs/TemplateMetaRead.md)
 - [TemplateRead](docs/TemplateRead.md)
 - [TemplatesRead](docs/TemplatesRead.md)

## Documentation for Authorization

Authentication schemes defined for the API:

### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@dyspatch.io
