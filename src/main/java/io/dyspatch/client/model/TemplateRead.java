/*
 * Dyspatch API
 * # Introduction  The Dyspatch API is based on the REST paradigm, and features resource based URLs with standard HTTP response codes to indicate errors. We use standard HTTP authentication and request verbs, and all responses are JSON formatted. See our [Implementation Guide](https://docs.dyspatch.io/development/implementing_dyspatch/) for more details on how to implement Dyspatch.  ## API Client Libraries  Dyspatch provides API Clients for popular languages and web frameworks.  - [Java](https://github.com/getdyspatch/dyspatch-java) - [Javascript](https://github.com/getdyspatch/dyspatch-javascript) - [Python](https://github.com/getdyspatch/dyspatch-python) - [C#](https://github.com/getdyspatch/dyspatch-dotnet) - [Go](https://github.com/getdyspatch/dyspatch-golang) - [Ruby](https://github.com/getdyspatch/dyspatch-ruby) 
 *
 * OpenAPI spec version: 2019.10
 * Contact: support@dyspatch.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
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
import java.util.ArrayList;
import java.util.List;

/**
 * TemplateRead
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T13:00:30.393-08:00")
public class TemplateRead {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("compiled")
  private CompiledRead compiled = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  @SerializedName("localizations")
  private List<LocalizationMetaRead> localizations = null;

  public TemplateRead id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TemplateRead name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TemplateRead description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TemplateRead url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public TemplateRead compiled(CompiledRead compiled) {
    this.compiled = compiled;
    return this;
  }

   /**
   * Get compiled
   * @return compiled
  **/
  @ApiModelProperty(value = "")
  public CompiledRead getCompiled() {
    return compiled;
  }

  public void setCompiled(CompiledRead compiled) {
    this.compiled = compiled;
  }

  public TemplateRead createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public TemplateRead updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public TemplateRead localizations(List<LocalizationMetaRead> localizations) {
    this.localizations = localizations;
    return this;
  }

  public TemplateRead addLocalizationsItem(LocalizationMetaRead localizationsItem) {
    if (this.localizations == null) {
      this.localizations = new ArrayList<LocalizationMetaRead>();
    }
    this.localizations.add(localizationsItem);
    return this;
  }

   /**
   * A list of the Template&#39;s available localizations
   * @return localizations
  **/
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
    TemplateRead templateRead = (TemplateRead) o;
    return Objects.equals(this.id, templateRead.id) &&
        Objects.equals(this.name, templateRead.name) &&
        Objects.equals(this.description, templateRead.description) &&
        Objects.equals(this.url, templateRead.url) &&
        Objects.equals(this.compiled, templateRead.compiled) &&
        Objects.equals(this.createdAt, templateRead.createdAt) &&
        Objects.equals(this.updatedAt, templateRead.updatedAt) &&
        Objects.equals(this.localizations, templateRead.localizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, url, compiled, createdAt, updatedAt, localizations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateRead {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

