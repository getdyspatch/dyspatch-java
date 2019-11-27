# DraftsApi

All URIs are relative to *https://api.dyspatch.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**draftsDraftIdGet**](DraftsApi.md#draftsDraftIdGet) | **GET** /drafts/{draftId} | Get Draft by ID
[**draftsDraftIdLocalizationKeysGet**](DraftsApi.md#draftsDraftIdLocalizationKeysGet) | **GET** /drafts/{draftId}/localizationKeys | Get localization keys
[**draftsDraftIdLocalizationsGet**](DraftsApi.md#draftsDraftIdLocalizationsGet) | **GET** /drafts/{draftId}/localizations | Get localizations on a draft
[**draftsDraftIdLocalizationsLanguageIdDelete**](DraftsApi.md#draftsDraftIdLocalizationsLanguageIdDelete) | **DELETE** /drafts/{draftId}/localizations/{languageId} | Remove a localization
[**draftsDraftIdLocalizationsLanguageIdPut**](DraftsApi.md#draftsDraftIdLocalizationsLanguageIdPut) | **PUT** /drafts/{draftId}/localizations/{languageId} | Create or update a localization
[**draftsDraftIdLocalizationsLanguageIdTranslationsPut**](DraftsApi.md#draftsDraftIdLocalizationsLanguageIdTranslationsPut) | **PUT** /drafts/{draftId}/localizations/{languageId}/translations | Set translations for language
[**draftsDraftIdPublishRequestPost**](DraftsApi.md#draftsDraftIdPublishRequestPost) | **POST** /drafts/{draftId}/publishRequest | Submit the draft for approval
[**draftsGet**](DraftsApi.md#draftsGet) | **GET** /drafts | List Drafts


<a name="draftsDraftIdGet"></a>
# **draftsDraftIdGet**
> DraftRead draftsDraftIdGet(draftId, targetLanguage)

Get Draft by ID

Gets a draft object with the matching ID. The \&quot;compiled\&quot; field will contain the template in the default, unlocalized form.

### Example
```java
// Import classes:
//import io.dyspatch.client.ApiClient;
//import io.dyspatch.client.ApiException;
//import io.dyspatch.client.Configuration;
//import io.dyspatch.client.auth.*;
//import io.dyspatch.client.api.DraftsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DraftsApi apiInstance = new DraftsApi();
String draftId = "draftId_example"; // String | A draft ID
String targetLanguage = "targetLanguage_example"; // String | The type of templating language to compile as. Should only be used for visual templates.
try {
    DraftRead result = apiInstance.draftsDraftIdGet(draftId, targetLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DraftsApi#draftsDraftIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **String**| A draft ID |
 **targetLanguage** | **String**| The type of templating language to compile as. Should only be used for visual templates. | [enum: html, jinja, handlebars, ampscript, freemarker, cheetah]

### Return type

[**DraftRead**](DraftRead.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2019.10+json

<a name="draftsDraftIdLocalizationKeysGet"></a>
# **draftsDraftIdLocalizationKeysGet**
> List&lt;LocalizationKeyRead&gt; draftsDraftIdLocalizationKeysGet(draftId, accept)

Get localization keys

Returns the list of values that need to be translated for the draft. Set the &#x60;Accept&#x60; header to &#x60;application/vnd.dyspatch.2019.10+json&#x60; to get a JSON object, or &#x60;text/vnd.dyspatch.2019.10+x-gettext-translation&#x60; to get the POT file.

### Example
```java
// Import classes:
//import io.dyspatch.client.ApiClient;
//import io.dyspatch.client.ApiException;
//import io.dyspatch.client.Configuration;
//import io.dyspatch.client.auth.*;
//import io.dyspatch.client.api.DraftsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DraftsApi apiInstance = new DraftsApi();
String draftId = "draftId_example"; // String | A draft ID
String accept = "accept_example"; // String | A version of the API that should be used for the request. For example, to use version \"2019.10\", set the value to \"application/vnd.dyspatch.2019.10+json\"
try {
    List<LocalizationKeyRead> result = apiInstance.draftsDraftIdLocalizationKeysGet(draftId, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DraftsApi#draftsDraftIdLocalizationKeysGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **String**| A draft ID |
 **accept** | **String**| A version of the API that should be used for the request. For example, to use version \&quot;2019.10\&quot;, set the value to \&quot;application/vnd.dyspatch.2019.10+json\&quot; | [optional]

### Return type

[**List&lt;LocalizationKeyRead&gt;**](LocalizationKeyRead.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2019.10+json, text/vnd.dyspatch.2019.10+x-gettext-translation

<a name="draftsDraftIdLocalizationsGet"></a>
# **draftsDraftIdLocalizationsGet**
> List&lt;LocalizationMetaRead&gt; draftsDraftIdLocalizationsGet(draftId)

Get localizations on a draft

Returns localization metadata for the draft

### Example
```java
// Import classes:
//import io.dyspatch.client.ApiClient;
//import io.dyspatch.client.ApiException;
//import io.dyspatch.client.Configuration;
//import io.dyspatch.client.auth.*;
//import io.dyspatch.client.api.DraftsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DraftsApi apiInstance = new DraftsApi();
String draftId = "draftId_example"; // String | A draft ID
try {
    List<LocalizationMetaRead> result = apiInstance.draftsDraftIdLocalizationsGet(draftId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DraftsApi#draftsDraftIdLocalizationsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **String**| A draft ID |

### Return type

[**List&lt;LocalizationMetaRead&gt;**](LocalizationMetaRead.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2019.10+json

<a name="draftsDraftIdLocalizationsLanguageIdDelete"></a>
# **draftsDraftIdLocalizationsLanguageIdDelete**
> draftsDraftIdLocalizationsLanguageIdDelete(draftId, languageId)

Remove a localization

Deletes the localization with the given language ID if it exists

### Example
```java
// Import classes:
//import io.dyspatch.client.ApiClient;
//import io.dyspatch.client.ApiException;
//import io.dyspatch.client.Configuration;
//import io.dyspatch.client.auth.*;
//import io.dyspatch.client.api.DraftsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DraftsApi apiInstance = new DraftsApi();
String draftId = "draftId_example"; // String | A draft ID
String languageId = "languageId_example"; // String | A language ID (eg: en-US)
try {
    apiInstance.draftsDraftIdLocalizationsLanguageIdDelete(draftId, languageId);
} catch (ApiException e) {
    System.err.println("Exception when calling DraftsApi#draftsDraftIdLocalizationsLanguageIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **String**| A draft ID |
 **languageId** | **String**| A language ID (eg: en-US) |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2019.10+json

<a name="draftsDraftIdLocalizationsLanguageIdPut"></a>
# **draftsDraftIdLocalizationsLanguageIdPut**
> draftsDraftIdLocalizationsLanguageIdPut(draftId, languageId, body)

Create or update a localization

Inserts a localization or sets the name on an existing localization that already uses the languageId

### Example
```java
// Import classes:
//import io.dyspatch.client.ApiClient;
//import io.dyspatch.client.ApiException;
//import io.dyspatch.client.Configuration;
//import io.dyspatch.client.auth.*;
//import io.dyspatch.client.api.DraftsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DraftsApi apiInstance = new DraftsApi();
String draftId = "draftId_example"; // String | A draft ID
String languageId = "languageId_example"; // String | A language ID (eg: en-US)
Body body = new Body(); // Body | 
try {
    apiInstance.draftsDraftIdLocalizationsLanguageIdPut(draftId, languageId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DraftsApi#draftsDraftIdLocalizationsLanguageIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **String**| A draft ID |
 **languageId** | **String**| A language ID (eg: en-US) |
 **body** | [**Body**](Body.md)|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2019.10+json

<a name="draftsDraftIdLocalizationsLanguageIdTranslationsPut"></a>
# **draftsDraftIdLocalizationsLanguageIdTranslationsPut**
> draftsDraftIdLocalizationsLanguageIdTranslationsPut(draftId, languageId, body)

Set translations for language

Completely replaces any existing translations for the given language with those provided in request body. Variables embedded in keys or values are expected to be in the format &#x60;%(my_variable)s&#x60; and will automatically convert to the correct Dyspatch format depending on the type of template. Accepts key/value pairs in JSON format or in gettext PO file format. For JSON set &#x60;Content-Type&#x60; header to &#x60;application/json&#x60;. For gettext PO format set &#x60;Content-Type&#x60; header to &#x60;text/x-gettext-translation&#x60;.

### Example
```java
// Import classes:
//import io.dyspatch.client.ApiClient;
//import io.dyspatch.client.ApiException;
//import io.dyspatch.client.Configuration;
//import io.dyspatch.client.auth.*;
//import io.dyspatch.client.api.DraftsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DraftsApi apiInstance = new DraftsApi();
String draftId = "draftId_example"; // String | A draft ID
String languageId = "languageId_example"; // String | A language ID (eg: en-US)
Body1 body = new Body1(); // Body1 | 
try {
    apiInstance.draftsDraftIdLocalizationsLanguageIdTranslationsPut(draftId, languageId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DraftsApi#draftsDraftIdLocalizationsLanguageIdTranslationsPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **String**| A draft ID |
 **languageId** | **String**| A language ID (eg: en-US) |
 **body** | [**Body1**](Body1.md)|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2019.10+json

<a name="draftsDraftIdPublishRequestPost"></a>
# **draftsDraftIdPublishRequestPost**
> draftsDraftIdPublishRequestPost(draftId)

Submit the draft for approval

Moves the draft into submitted state.

### Example
```java
// Import classes:
//import io.dyspatch.client.ApiClient;
//import io.dyspatch.client.ApiException;
//import io.dyspatch.client.Configuration;
//import io.dyspatch.client.auth.*;
//import io.dyspatch.client.api.DraftsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DraftsApi apiInstance = new DraftsApi();
String draftId = "draftId_example"; // String | A draft ID
try {
    apiInstance.draftsDraftIdPublishRequestPost(draftId);
} catch (ApiException e) {
    System.err.println("Exception when calling DraftsApi#draftsDraftIdPublishRequestPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **String**| A draft ID |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2019.10+json

<a name="draftsGet"></a>
# **draftsGet**
> DraftsRead draftsGet(status)

List Drafts

Returns all drafts for your organization.

### Example
```java
// Import classes:
//import io.dyspatch.client.ApiClient;
//import io.dyspatch.client.ApiException;
//import io.dyspatch.client.Configuration;
//import io.dyspatch.client.auth.*;
//import io.dyspatch.client.api.DraftsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DraftsApi apiInstance = new DraftsApi();
String status = "status_example"; // String | Filter the list of drafts by a particular status
try {
    DraftsRead result = apiInstance.draftsGet(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DraftsApi#draftsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**| Filter the list of drafts by a particular status | [optional] [enum: awaitingTranslation]

### Return type

[**DraftsRead**](DraftsRead.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.dyspatch.2019.10+json

