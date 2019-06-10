# TemplatesApi

All URIs are relative to *https://api.dyspatch.io/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**templatesGet**](TemplatesApi.md#templatesGet) | **GET** /templates | List Templates
[**templatesTemplateIdGet**](TemplatesApi.md#templatesTemplateIdGet) | **GET** /templates/{templateId} | Get Template by ID

<a name="templatesGet"></a>
# **templatesGet**
> TemplatesRead templatesGet(cursor, accept)

List Templates

Gets a list of Template Metadata objects for all templates. Up to 25 results returned before results are paginated.

### Example
```java
// Import classes:
//import io.dyspatch.client.ApiClient;
//import io.dyspatch.client.ApiException;
//import io.dyspatch.client.Configuration;
//import io.dyspatch.client.auth.*;
//import io.dyspatch.client.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

TemplatesApi apiInstance = new TemplatesApi();
String cursor = "cursor_example"; // String | A cursor value used to retrieve a specific page from a paginated result set.
String accept = "accept_example"; // String | A version of the API that should be used for the request. For example, to use version "2019.03", set the value to "application/vnd.dyspatch.2019.03+json"
try {
    TemplatesRead result = apiInstance.templatesGet(cursor, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#templatesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cursor** | **String**| A cursor value used to retrieve a specific page from a paginated result set. | [optional]
 **accept** | **String**| A version of the API that should be used for the request. For example, to use version "2019.03", set the value to "application/vnd.dyspatch.2019.03+json" | [optional]

### Return type

[**TemplatesRead**](TemplatesRead.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2019.03+json

<a name="templatesTemplateIdGet"></a>
# **templatesTemplateIdGet**
> TemplateRead templatesTemplateIdGet(templateId, targetLanguage, accept)

Get Template by ID

Gets a template object with the matching ID. If the template has published content the "compiled" field will contain the template .

### Example
```java
// Import classes:
//import io.dyspatch.client.ApiClient;
//import io.dyspatch.client.ApiException;
//import io.dyspatch.client.Configuration;
//import io.dyspatch.client.auth.*;
//import io.dyspatch.client.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

TemplatesApi apiInstance = new TemplatesApi();
String templateId = "templateId_example"; // String | A template ID
String targetLanguage = "targetLanguage_example"; // String | The type of templating language to compile as. Should only be used for visual templates.
String accept = "accept_example"; // String | A version of the API that should be used for the request. For example, to use version \"2019.03\", set the value to \"application/vnd.dyspatch.2019.03+json\"
try {
    TemplateRead result = apiInstance.templatesTemplateIdGet(templateId, targetLanguage, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#templatesTemplateIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**| A template ID |
 **targetLanguage** | **String**| The type of templating language to compile as. Should only be used for visual templates. | [optional] [enum: html, jinja, handlebars, ampscript, freemarker, cheetah]
 **accept** | **String**| A version of the API that should be used for the request. For example, to use version "2019.03", set the value to "application/vnd.dyspatch.2019.03+json" | [optional]

### Return type

[**TemplateRead**](TemplateRead.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2019.03+json

