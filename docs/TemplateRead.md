

# TemplateRead

list of template metadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | An opaque, unique identifier for a template |  [optional]
**name** | **String** | The name of a template |  [optional]
**description** | **String** | A description of the template |  [optional]
**url** | **String** | The API url for a specific template |  [optional]
**compiled** | [**CompiledRead**](CompiledRead.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time of initial creation |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The time of last update |  [optional]
**localizations** | [**List&lt;LocalizationMetaRead&gt;**](LocalizationMetaRead.md) | A list of the Template&#39;s available localizations |  [optional]



