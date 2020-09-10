# TemplatesApi

All URIs are relative to *https://api.dyspatch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTemplateById**](TemplatesApi.md#getTemplateById) | **GET** /templates/{templateId} | Get Template by ID
[**getTemplates**](TemplatesApi.md#getTemplates) | **GET** /templates | List Templates


<a name="getTemplateById"></a>
# **getTemplateById**
> TemplateRead getTemplateById(templateId, targetLanguage, accept)

Get Template by ID

Gets a template object with the matching ID. If the template has published content the \&quot;compiled\&quot; field will contain the template .

### Example
```java
// Import classes:
import io.dyspatch.client.ApiClient;
import io.dyspatch.client.ApiException;
import io.dyspatch.client.Configuration;
import io.dyspatch.client.auth.*;
import io.dyspatch.client.models.*;
import io.dyspatch.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dyspatch.io");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String templateId = "templateId_example"; // String | A template ID
    String targetLanguage = "targetLanguage_example"; // String | The type of templating language to compile as. Should only be used for visual templates.
    String accept = "accept_example"; // String | A version of the API that should be used for the request. For example, to use version \"2020.08\", set the value to \"application/vnd.dyspatch.2020.08+json\"
    try {
      TemplateRead result = apiInstance.getTemplateById(templateId, targetLanguage, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#getTemplateById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**| A template ID |
<<<<<<< HEAD
 **targetLanguage** | **String**| The type of templating language to compile as. Should only be used for visual templates. | [enum: html, handlebars, ampscript, freemarker, cheetah, jinja, liquid]
=======
 **targetLanguage** | **String**| The type of templating language to compile as. Should only be used for visual templates. | [enum: html, handlebars, ampscript, freemarker, cheetah, jinja]
>>>>>>> 535fad06e0787601d1b54f7f96a1986d72cd999f
 **accept** | **String**| A version of the API that should be used for the request. For example, to use version \&quot;2020.08\&quot;, set the value to \&quot;application/vnd.dyspatch.2020.08+json\&quot; |

### Return type

[**TemplateRead**](TemplateRead.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2020.08+json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A template object with the requested ID. If the template has no published content the \&quot;compiled\&quot; field will be *null*. |  * X-RateLimit-Remaining - The number of requests left for the current time window <br>  |
**400** | Invalid request |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**401** | Unauthenticated |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**403** | Unauthorized |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**404** | Resource not found |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**429** | Rate limit exceeded |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**500** | Server error |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**0** | Server error |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |

<a name="getTemplates"></a>
# **getTemplates**
> TemplatesRead getTemplates(accept, cursor)

List Templates

Gets a list of Template Metadata objects for all templates. Up to 25 results returned before results are paginated.

### Example
```java
// Import classes:
import io.dyspatch.client.ApiClient;
import io.dyspatch.client.ApiException;
import io.dyspatch.client.Configuration;
import io.dyspatch.client.auth.*;
import io.dyspatch.client.models.*;
import io.dyspatch.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dyspatch.io");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String accept = "accept_example"; // String | A version of the API that should be used for the request. For example, to use version \"2020.08\", set the value to \"application/vnd.dyspatch.2020.08+json\"
    String cursor = "cursor_example"; // String | A cursor value used to retrieve a specific page from a paginated result set.
    try {
      TemplatesRead result = apiInstance.getTemplates(accept, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#getTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**| A version of the API that should be used for the request. For example, to use version \&quot;2020.08\&quot;, set the value to \&quot;application/vnd.dyspatch.2020.08+json\&quot; |
 **cursor** | **String**| A cursor value used to retrieve a specific page from a paginated result set. | [optional]

### Return type

[**TemplatesRead**](TemplatesRead.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2020.08+json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of templates |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**400** | Invalid request |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**401** | Unauthenticated |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**403** | Unauthorized |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**429** | Rate limit exceeded |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**500** | Server error |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**0** | Server error |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |

