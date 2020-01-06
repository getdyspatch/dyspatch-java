# Dyspatch Java API client

Dyspatch API
- API version: 2019.10
  - Build date: 2020-01-02T21:36:38.986Z[GMT]

# Introduction

The Dyspatch API is based on the REST paradigm and features resource based URLs
with standard HTTP response codes to indicate errors. We use standard HTTP
authentication and request verbs and all responses are JSON formatted. See our
[Implementation
Guide](https://docs.dyspatch.io/development/implementing_dyspatch/) for more
details on how to implement Dyspatch.

For more information, please visit [https://docs.dyspatch.io](https://docs.dyspatch.io)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

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
  <version>4.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.dyspatch:dyspatch-java:4.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/dyspatch-java-4.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import io.dyspatch.client.ApiClient;
import io.dyspatch.client.ApiException;
import io.dyspatch.client.Configuration;
import io.dyspatch.client.auth.*;
import io.dyspatch.client.models.*;
import io.dyspatch.client.api.DraftsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dyspatch.io");

    // Configure API key authorization: Bearer
    defaultClient.setApiKey(System.getenv("DYSPATCH_API_KEY"));
    defaultClient.setApiKeyPrefix("Bearer");

    // Initialize your API objects:
    DraftsApi apiInstance = new DraftsApi(defaultClient);
    String draftId = "draftId_example"; // String | A draft ID
    String languageId = "languageId_example"; // String | A language ID (eg: en-US)
    String accept = "application/vnd.dyspatch.2019.10+json";
    try {
      apiInstance.deleteLocalization(draftId, languageId, accept);
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#deleteLocalization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.dyspatch.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DraftsApi* | [**deleteLocalization**](docs/DraftsApi.md#deleteLocalization) | **DELETE** /drafts/{draftId}/localizations/{languageId} | Remove a localization
*DraftsApi* | [**getDraftById**](docs/DraftsApi.md#getDraftById) | **GET** /drafts/{draftId} | Get Draft by ID
*DraftsApi* | [**getDraftLocalizationKeys**](docs/DraftsApi.md#getDraftLocalizationKeys) | **GET** /drafts/{draftId}/localizationKeys | Get localization keys
*DraftsApi* | [**getDrafts**](docs/DraftsApi.md#getDrafts) | **GET** /drafts | List Drafts
*DraftsApi* | [**getLocalizationForDraft**](docs/DraftsApi.md#getLocalizationForDraft) | **GET** /drafts/{draftId}/localizations | Get localizations on a draft
*DraftsApi* | [**saveLocalization**](docs/DraftsApi.md#saveLocalization) | **PUT** /drafts/{draftId}/localizations/{languageId} | Create or update a localization
*DraftsApi* | [**setTranslation**](docs/DraftsApi.md#setTranslation) | **PUT** /drafts/{draftId}/localizations/{languageId}/translations | Set translations for language
*DraftsApi* | [**submitDraftForApproval**](docs/DraftsApi.md#submitDraftForApproval) | **POST** /drafts/{draftId}/publishRequest | Submit the draft for approval
*LocalizationsApi* | [**getLocalizationById**](docs/LocalizationsApi.md#getLocalizationById) | **GET** /localizations/{localizationId} | Get Localization Object by ID
*TemplatesApi* | [**getTemplateById**](docs/TemplatesApi.md#getTemplateById) | **GET** /templates/{templateId} | Get Template by ID
*TemplatesApi* | [**getTemplates**](docs/TemplatesApi.md#getTemplates) | **GET** /templates | List Templates


## Documentation for Models

 - [APIError](docs/APIError.md)
 - [CompiledRead](docs/CompiledRead.md)
 - [Cursor](docs/Cursor.md)
 - [DraftMetaRead](docs/DraftMetaRead.md)
 - [DraftRead](docs/DraftRead.md)
 - [DraftsRead](docs/DraftsRead.md)
 - [InlineObject](docs/InlineObject.md)
 - [LocalizationKeyRead](docs/LocalizationKeyRead.md)
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

