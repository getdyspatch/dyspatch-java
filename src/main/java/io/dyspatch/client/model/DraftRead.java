/*
 * Dyspatch API
 * # Introduction  The Dyspatch API is based on the REST paradigm, and features resource based URLs with standard HTTP response codes to indicate errors. We use standard HTTP authentication and request verbs, and all responses are JSON formatted. See our [Implementation Guide](https://docs.dyspatch.io/development/implementing_dyspatch/) for more details on how to implement Dyspatch.  ## API Client Libraries Dyspatch provides API Clients for popular languages and web frameworks.  - [Java](https://github.com/getdyspatch/dyspatch-java) - [Javascript](https://github.com/getdyspatch/dyspatch-javascript) - [Python](https://github.com/getdyspatch/dyspatch-python) - [C#](https://github.com/getdyspatch/dyspatch-dotnet) - [Go](https://github.com/getdyspatch/dyspatch-golang) - [Ruby](https://github.com/getdyspatch/dyspatch-ruby) 
 *
 * The version of the OpenAPI document: 2020.08
 * Contact: support@dyspatch.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.dyspatch.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.dyspatch.client.model.CompiledRead;
import io.dyspatch.client.model.LocalizationMetaRead;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * template draft metadata included latest draft revision
 */
@ApiModel(description = "template draft metadata included latest draft revision")

public class DraftRead {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_COMPILED = "compiled";
  @SerializedName(SERIALIZED_NAME_COMPILED)
  private CompiledRead compiled;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_LOCALIZATIONS = "localizations";
  @SerializedName(SERIALIZED_NAME_LOCALIZATIONS)
  private List<LocalizationMetaRead> localizations = null;


  public DraftRead id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * An opaque, unique identifier for a draft
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tdft_g3L7Cw6Hp5wU", value = "An opaque, unique identifier for a draft")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DraftRead template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * An opaque, unique identifier for a template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tem_g3L7Cw6Hp5wU", value = "An opaque, unique identifier for a template")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public DraftRead name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of a draft
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a draft")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DraftRead url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The API url for a specific draft
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/drafts/tdft_g3L7Cw6Hp5wUaf395LehwK/dft_g3L7Cw6Hp5wU", value = "The API url for a specific draft")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public DraftRead compiled(CompiledRead compiled) {
    
    this.compiled = compiled;
    return this;
  }

   /**
   * Get compiled
   * @return compiled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompiledRead getCompiled() {
    return compiled;
  }


  public void setCompiled(CompiledRead compiled) {
    this.compiled = compiled;
  }


  public DraftRead createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time of initial creation
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time of initial creation")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public DraftRead updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time of last update
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time of last update")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public DraftRead localizations(List<LocalizationMetaRead> localizations) {
    
    this.localizations = localizations;
    return this;
  }

  public DraftRead addLocalizationsItem(LocalizationMetaRead localizationsItem) {
    if (this.localizations == null) {
      this.localizations = new ArrayList<>();
    }
    this.localizations.add(localizationsItem);
    return this;
  }

   /**
   * A list of the Template&#39;s available localizations
   * @return localizations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the Template's available localizations")

  public List<LocalizationMetaRead> getLocalizations() {
    return localizations;
  }


  public void setLocalizations(List<LocalizationMetaRead> localizations) {
    this.localizations = localizations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DraftRead draftRead = (DraftRead) o;
    return Objects.equals(this.id, draftRead.id) &&
        Objects.equals(this.template, draftRead.template) &&
        Objects.equals(this.name, draftRead.name) &&
        Objects.equals(this.url, draftRead.url) &&
        Objects.equals(this.compiled, draftRead.compiled) &&
        Objects.equals(this.createdAt, draftRead.createdAt) &&
        Objects.equals(this.updatedAt, draftRead.updatedAt) &&
        Objects.equals(this.localizations, draftRead.localizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, template, name, url, compiled, createdAt, updatedAt, localizations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftRead {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    compiled: ").append(toIndentedString(compiled)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    localizations: ").append(toIndentedString(localizations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

