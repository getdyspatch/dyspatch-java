/*
 * Dyspatch API
 * # Introduction The Dyspatch API is based on the REST paradigm, and features resource based URLs with standard HTTP response codes to indicate errors. We use standard HTTP authentication and request verbs, and all responses are JSON formatted. See our [Implementation Guide](https://docs.dyspatch.io/development/implementing_dyspatch/) for more details on how to implement Dyspatch. ## API Client Libraries Dyspatch provides API Clients for popular languages and web frameworks. - [Java](https://github.com/getdyspatch/dyspatch-java) - [Javascript](https://github.com/getdyspatch/dyspatch-javascript) - [Python](https://github.com/getdyspatch/dyspatch-python) - [C#](https://github.com/getdyspatch/dyspatch-dotnet) - [Go](https://github.com/getdyspatch/dyspatch-golang) - [Ruby](https://github.com/getdyspatch/dyspatch-ruby) 
 *
 * The version of the OpenAPI document: 2020.04
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
import io.dyspatch.client.model.LocalizationMetaRead;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * the template metadata
 */
@ApiModel(description = "the template metadata")

public class TemplateMetaRead {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_LOCALIZATIONS = "localizations";
  @SerializedName(SERIALIZED_NAME_LOCALIZATIONS)
  private List<LocalizationMetaRead> localizations = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public TemplateMetaRead id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * An opaque, unique identifier for a template
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tem_g3L7Cw6Hp5wU", value = "An opaque, unique identifier for a template")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TemplateMetaRead name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of a template
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a template")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TemplateMetaRead description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the template
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of the template")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TemplateMetaRead url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The API url for a specific template
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/templates/tem_g3L7Cw6Hp5wUaf395LehwK", value = "The API url for a specific template")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public TemplateMetaRead localizations(List<LocalizationMetaRead> localizations) {
    
    this.localizations = localizations;
    return this;
  }

  public TemplateMetaRead addLocalizationsItem(LocalizationMetaRead localizationsItem) {
    if (this.localizations == null) {
      this.localizations = new ArrayList<LocalizationMetaRead>();
    }
    this.localizations.add(localizationsItem);
    return this;
  }

   /**
   * A list of the template&#39;s available localization objects
   * @return localizations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the template's available localization objects")

  public List<LocalizationMetaRead> getLocalizations() {
    return localizations;
  }


  public void setLocalizations(List<LocalizationMetaRead> localizations) {
    this.localizations = localizations;
  }


  public TemplateMetaRead createdAt(OffsetDateTime createdAt) {
    
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


  public TemplateMetaRead updatedAt(OffsetDateTime updatedAt) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateMetaRead templateMetaRead = (TemplateMetaRead) o;
    return Objects.equals(this.id, templateMetaRead.id) &&
        Objects.equals(this.name, templateMetaRead.name) &&
        Objects.equals(this.description, templateMetaRead.description) &&
        Objects.equals(this.url, templateMetaRead.url) &&
        Objects.equals(this.localizations, templateMetaRead.localizations) &&
        Objects.equals(this.createdAt, templateMetaRead.createdAt) &&
        Objects.equals(this.updatedAt, templateMetaRead.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, url, localizations, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateMetaRead {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    localizations: ").append(toIndentedString(localizations)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

