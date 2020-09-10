# DraftsApi

All URIs are relative to *https://api.dyspatch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteLocalization**](DraftsApi.md#deleteLocalization) | **DELETE** /drafts/{draftId}/localizations/{languageId} | Remove a localization
[**getDraftById**](DraftsApi.md#getDraftById) | **GET** /drafts/{draftId} | Get Draft by ID
[**getDraftLocalizationKeys**](DraftsApi.md#getDraftLocalizationKeys) | **GET** /drafts/{draftId}/localizationKeys | Get localization keys
[**getDrafts**](DraftsApi.md#getDrafts) | **GET** /drafts | List Drafts
[**getLocalizationForDraft**](DraftsApi.md#getLocalizationForDraft) | **GET** /drafts/{draftId}/localizations | Get localizations on a draft
[**saveLocalization**](DraftsApi.md#saveLocalization) | **PUT** /drafts/{draftId}/localizations/{languageId} | Create or update a localization
[**setTranslation**](DraftsApi.md#setTranslation) | **PUT** /drafts/{draftId}/localizations/{languageId}/translations | Set translations for language
[**submitDraftForApproval**](DraftsApi.md#submitDraftForApproval) | **POST** /drafts/{draftId}/publishRequest | Submit the draft for approval


<a name="deleteLocalization"></a>
# **deleteLocalization**
> deleteLocalization(draftId, languageId, accept)

Remove a localization

Deletes the localization with the given language ID if it exists

### Example
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
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DraftsApi apiInstance = new DraftsApi(defaultClient);
    String draftId = "draftId_example"; // String | A draft ID
    String languageId = "languageId_example"; // String | A language ID (eg: en-US)
    String accept = "accept_example"; // String | A version of the API that should be used for the request. For example, to use version \"2020.08\", set the value to \"application/vnd.dyspatch.2020.08+json\"
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **String**| A draft ID |
 **languageId** | **String**| A language ID (eg: en-US) |
 **accept** | **String**| A version of the API that should be used for the request. For example, to use version \&quot;2020.08\&quot;, set the value to \&quot;application/vnd.dyspatch.2020.08+json\&quot; |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful delete |  -  |

<a name="getDraftById"></a>
# **getDraftById**
> DraftRead getDraftById(draftId, targetLanguage, accept)

Get Draft by ID

Gets a draft object with the matching ID. The \&quot;compiled\&quot; field will contain the template in the default, unlocalized form.

### Example
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
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DraftsApi apiInstance = new DraftsApi(defaultClient);
    String draftId = "draftId_example"; // String | A draft ID
    String targetLanguage = "targetLanguage_example"; // String | The type of templating language to compile as. Should only be used for visual templates.
    String accept = "accept_example"; // String | A version of the API that should be used for the request. For example, to use version \"2020.08\", set the value to \"application/vnd.dyspatch.2020.08+json\"
    try {
      DraftRead result = apiInstance.getDraftById(draftId, targetLanguage, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#getDraftById");
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
 **draftId** | **String**| A draft ID |
 **targetLanguage** | **String**| The type of templating language to compile as. Should only be used for visual templates. | [enum: html, handlebars, ampscript, freemarker, cheetah, jinja]
 **accept** | **String**| A version of the API that should be used for the request. For example, to use version \&quot;2020.08\&quot;, set the value to \&quot;application/vnd.dyspatch.2020.08+json\&quot; |

### Return type

[**DraftRead**](DraftRead.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2020.08+json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A draft object with the requested ID. |  * X-RateLimit-Remaining - The number of requests left for the current time window <br>  |
**400** | Invalid request |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**401** | Unauthenticated |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**403** | Unauthorized |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**404** | Resource not found |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**429** | Rate limit exceeded |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**500** | Server error |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**0** | Server error |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |

<a name="getDraftLocalizationKeys"></a>
# **getDraftLocalizationKeys**
> List&lt;LocalizationKeyRead&gt; getDraftLocalizationKeys(draftId, accept)

Get localization keys

Returns the list of values that need to be translated for the draft. Set the &#x60;Accept&#x60; header to &#x60;application/vnd.dyspatch.2020.08+json&#x60; to get a JSON object, or &#x60;text/vnd.dyspatch.2020.08+x-gettext-translation&#x60; to get the POT file.

### Example
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
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DraftsApi apiInstance = new DraftsApi(defaultClient);
    String draftId = "draftId_example"; // String | A draft ID
    String accept = "accept_example"; // String | A version of the API that should be used for the request. For example, to use version \"2020.08\", set the value to \"application/vnd.dyspatch.2020.08+json\"
    try {
      List<LocalizationKeyRead> result = apiInstance.getDraftLocalizationKeys(draftId, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#getDraftLocalizationKeys");
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
 **draftId** | **String**| A draft ID |
 **accept** | **String**| A version of the API that should be used for the request. For example, to use version \&quot;2020.08\&quot;, set the value to \&quot;application/vnd.dyspatch.2020.08+json\&quot; |

### Return type

[**List&lt;LocalizationKeyRead&gt;**](LocalizationKeyRead.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2020.08+json, text/vnd.dyspatch.2020.08+x-gettext-translation

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Localization keys |  -  |

<a name="getDrafts"></a>
# **getDrafts**
> DraftsRead getDrafts(accept, cursor, status)

List Drafts

Returns all drafts for your organization.

### Example
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
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DraftsApi apiInstance = new DraftsApi(defaultClient);
    String accept = "accept_example"; // String | A version of the API that should be used for the request. For example, to use version \"2020.08\", set the value to \"application/vnd.dyspatch.2020.08+json\"
    String cursor = "cursor_example"; // String | A cursor value used to retrieve a specific page from a paginated result set.
    String status = "status_example"; // String | Filter the list of drafts by a particular status
    try {
      DraftsRead result = apiInstance.getDrafts(accept, cursor, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#getDrafts");
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
 **status** | **String**| Filter the list of drafts by a particular status | [optional] [enum: awaitingTranslation]

### Return type

[**DraftsRead**](DraftsRead.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2020.08+json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Drafts |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**400** | Invalid request |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**401** | Unauthenticated |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**403** | Unauthorized |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**404** | Resource not found |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**429** | Rate limit exceeded |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**500** | Server error |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**0** | Server error |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |

<a name="getLocalizationForDraft"></a>
# **getLocalizationForDraft**
> List&lt;LocalizationMetaRead&gt; getLocalizationForDraft(draftId, accept)

Get localizations on a draft

Returns localization metadata for the draft

### Example
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
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DraftsApi apiInstance = new DraftsApi(defaultClient);
    String draftId = "draftId_example"; // String | A draft ID
    String accept = "accept_example"; // String | A version of the API that should be used for the request. For example, to use version \"2020.08\", set the value to \"application/vnd.dyspatch.2020.08+json\"
    try {
      List<LocalizationMetaRead> result = apiInstance.getLocalizationForDraft(draftId, accept);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#getLocalizationForDraft");
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
 **draftId** | **String**| A draft ID |
 **accept** | **String**| A version of the API that should be used for the request. For example, to use version \&quot;2020.08\&quot;, set the value to \&quot;application/vnd.dyspatch.2020.08+json\&quot; |

### Return type

[**List&lt;LocalizationMetaRead&gt;**](LocalizationMetaRead.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2020.08+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of localizations |  * X-RateLimit-Remaining - The number of requests left for the current time window <br>  |

<a name="saveLocalization"></a>
# **saveLocalization**
> saveLocalization(draftId, languageId, accept, inlineObject)

Create or update a localization

Inserts a localization or sets the name on an existing localization that already uses the languageId

### Example
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
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DraftsApi apiInstance = new DraftsApi(defaultClient);
    String draftId = "draftId_example"; // String | A draft ID
    String languageId = "languageId_example"; // String | A language ID (eg: en-US)
    String accept = "accept_example"; // String | A version of the API that should be used for the request. For example, to use version \"2020.08\", set the value to \"application/vnd.dyspatch.2020.08+json\"
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      apiInstance.saveLocalization(draftId, languageId, accept, inlineObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#saveLocalization");
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
 **draftId** | **String**| A draft ID |
 **languageId** | **String**| A language ID (eg: en-US) |
 **accept** | **String**| A version of the API that should be used for the request. For example, to use version \&quot;2020.08\&quot;, set the value to \&quot;application/vnd.dyspatch.2020.08+json\&quot; |
 **inlineObject** | [**InlineObject**](InlineObject.md)|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful upsert |  -  |

<a name="setTranslation"></a>
# **setTranslation**
> setTranslation(draftId, languageId, accept, requestBody)

Set translations for language

Completely replaces any existing translations for the given language with those provided in request body. Variables embedded in keys or values are expected to be in the format &#x60;%(my_variable)s&#x60; and will automatically convert to the correct Dyspatch format depending on the type of template. Accepts key/value pairs in JSON format or in gettext PO file format. For JSON set &#x60;Content-Type&#x60; header to &#x60;application/json&#x60;. For gettext PO format set &#x60;Content-Type&#x60; header to &#x60;text/x-gettext-translation&#x60;.

### Example
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
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DraftsApi apiInstance = new DraftsApi(defaultClient);
    String draftId = "draftId_example"; // String | A draft ID
    String languageId = "languageId_example"; // String | A language ID (eg: en-US)
    String accept = "accept_example"; // String | A version of the API that should be used for the request. For example, to use version \"2020.08\", set the value to \"application/vnd.dyspatch.2020.08+json\"
    Map<String, String> requestBody = new HashMap(); // Map<String, String> | 
    try {
      apiInstance.setTranslation(draftId, languageId, accept, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#setTranslation");
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
 **draftId** | **String**| A draft ID |
 **languageId** | **String**| A language ID (eg: en-US) |
 **accept** | **String**| A version of the API that should be used for the request. For example, to use version \&quot;2020.08\&quot;, set the value to \&quot;application/vnd.dyspatch.2020.08+json\&quot; |
 **requestBody** | [**Map&lt;String, String&gt;**](String.md)|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful |  -  |
**403** | Unauthorized |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |

<a name="submitDraftForApproval"></a>
# **submitDraftForApproval**
> submitDraftForApproval(draftId, accept)

Submit the draft for approval

Moves the draft into submitted state.

### Example
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
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DraftsApi apiInstance = new DraftsApi(defaultClient);
    String draftId = "draftId_example"; // String | A draft ID
    String accept = "accept_example"; // String | A version of the API that should be used for the request. For example, to use version \"2020.08\", set the value to \"application/vnd.dyspatch.2020.08+json\"
    try {
      apiInstance.submitDraftForApproval(draftId, accept);
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#submitDraftForApproval");
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
 **draftId** | **String**| A draft ID |
 **accept** | **String**| A version of the API that should be used for the request. For example, to use version \&quot;2020.08\&quot;, set the value to \&quot;application/vnd.dyspatch.2020.08+json\&quot; |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully submitted |  -  |
**400** | Invalid request |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**401** | Unauthenticated |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**403** | Unauthorized |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**404** | Resource not found |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**429** | Rate limit exceeded |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**500** | Server error |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |
**0** | Server error |  * X-RateLimit-Remaining - The number of requests left for the time window. <br>  |

