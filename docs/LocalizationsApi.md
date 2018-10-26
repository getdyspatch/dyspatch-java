# LocalizationsApi

All URIs are relative to *https://api.dyspatch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**localizationsLocalizationIdGet**](LocalizationsApi.md#localizationsLocalizationIdGet) | **GET** /localizations/{localizationId} | Get Localization Object by ID


<a name="localizationsLocalizationIdGet"></a>
# **localizationsLocalizationIdGet**
> LocalizationRead localizationsLocalizationIdGet(localizationId, accept)

Get Localization Object by ID

Returns a specific localization object with a matching ID

### Example
```java
// Import classes:
//import io.dyspatch.client.ApiClient;
//import io.dyspatch.client.ApiException;
//import io.dyspatch.client.Configuration;
//import io.dyspatch.client.auth.*;
//import io.dyspatch.client.api.LocalizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

LocalizationsApi apiInstance = new LocalizationsApi();
String localizationId = "localizationId_example"; // String | A localization ID
String accept = "accept_example"; // String | A version of the API that should be used for the request. For example, to use version 2018.08, set the value to application/vnd.dyspatch.2018.08+json
try {
    LocalizationRead result = apiInstance.localizationsLocalizationIdGet(localizationId, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalizationsApi#localizationsLocalizationIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localizationId** | **String**| A localization ID |
 **accept** | **String**| A version of the API that should be used for the request. For example, to use version 2018.08, set the value to application/vnd.dyspatch.2018.08+json |

### Return type

[**LocalizationRead**](LocalizationRead.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2018.08+json

