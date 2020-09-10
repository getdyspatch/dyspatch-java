# LocalizationsApi

All URIs are relative to *https://api.dyspatch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLocalizationById**](LocalizationsApi.md#getLocalizationById) | **GET** /localizations/{localizationId} | Get Localization Object by ID


<a name="getLocalizationById"></a>
# **getLocalizationById**
> LocalizationRead getLocalizationById(localizationId, targetLanguage, accept)

Get Localization Object by ID

Returns a specific localization object with a matching ID

### Example
```java
// Import classes:
import io.dyspatch.client.ApiClient;
import io.dyspatch.client.ApiException;
import io.dyspatch.client.Configuration;
import io.dyspatch.client.auth.*;
import io.dyspatch.client.models.*;
import io.dyspatch.client.api.LocalizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dyspatch.io");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    LocalizationsApi apiInstance = new LocalizationsApi(defaultClient);
    String localizationId = "localizationId_example"; // String | A localization ID
    String targetLanguage = "targetLanguage_example"; // String | The type of templating language to compile as. Should only be used for visual templates.
    String accept = "accept_example"; // String | A version of the API that should be used for the request. For example, to use version \"2020.08\", set the value to \"application/vnd.dyspatch.2020.08+json\"
    try {
      LocalizationRead result = apiInstance.getLocalizationById(localizationId, targetLanguage, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalizationsApi#getLocalizationById");
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
 **localizationId** | **String**| A localization ID |
 **targetLanguage** | **String**| The type of templating language to compile as. Should only be used for visual templates. | [enum: html, handlebars, ampscript, freemarker, cheetah, jinja, liquid]
 **accept** | **String**| A version of the API that should be used for the request. For example, to use version \&quot;2020.08\&quot;, set the value to \&quot;application/vnd.dyspatch.2020.08+json\&quot; |

### Return type

[**LocalizationRead**](LocalizationRead.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2020.08+json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A localization object with the requested ID |  * X-RateLimit-Remaining - The number of requests left for the current time window <br>  |
**400** | Invalid request |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**401** | Unauthenticated |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**403** | Unauthorized |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**404** | Resource not found |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**429** | Rate limit exceeded |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**500** | Server error |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**0** | Server error |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |

