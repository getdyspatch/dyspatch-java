/*
 * Dyspatch API
 * # Introduction  The Dyspatch API is based on the REST paradigm and features resource based URLs with standard HTTP response codes to indicate errors. We use standard HTTP authentication and request verbs and all responses are JSON formatted. See our [Implementation Guide](https://docs.dyspatch.io/development/implementing_dyspatch/) for more details on how to implement Dyspatch.  ## API Client Libraries  Dyspatch provides API Clients for the following languages and web frameworks:  - [Java](https://github.com/getdyspatch/dyspatch-java) - [Javascript](https://github.com/getdyspatch/dyspatch-javascript) - [Python](https://github.com/getdyspatch/dyspatch-python) - [C#](https://github.com/getdyspatch/dyspatch-dotnet) - [Go](https://github.com/getdyspatch/dyspatch-golang) - [Ruby](https://github.com/getdyspatch/dyspatch-ruby) 
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * DraftMetaRead
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-04T10:55:38.642-08:00")
public class DraftMetaRead {
  @SerializedName("id")
  private String id = null;

  @SerializedName("templateId")
  private String templateId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  public DraftMetaRead id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An opaque, unique identifier for a draft
   * @return id
  **/
  @ApiModelProperty(example = "tdft_g3L7Cw6Hp5wU", value = "An opaque, unique identifier for a draft")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DraftMetaRead templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * An opaque, unique identifier for a template
   * @return templateId
  **/
  @ApiModelProperty(example = "tem_g3L7Cw6Hp5wU", value = "An opaque, unique identifier for a template")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public DraftMetaRead name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of a draft
   * @return name
  **/
  @ApiModelProperty(value = "The name of a draft")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DraftMetaRead description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the draft
   * @return description
  **/
  @ApiModelProperty(value = "A description of the draft")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DraftMetaRead url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The API url for a specific draft
   * @return url
  **/
  @ApiModelProperty(example = "/drafts/tdft_g3L7Cw6Hp5wUaf395LehwK/dft_g3L7Cw6Hp5wU", value = "The API url for a specific draft")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public DraftMetaRead createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time of initial creation
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time of initial creation")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DraftMetaRead updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time of last update
   * @return updatedAt
  **/
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
    DraftMetaRead draftMetaRead = (DraftMetaRead) o;
    return Objects.equals(this.id, draftMetaRead.id) &&
        Objects.equals(this.templateId, draftMetaRead.templateId) &&
        Objects.equals(this.name, draftMetaRead.name) &&
        Objects.equals(this.description, draftMetaRead.description) &&
        Objects.equals(this.url, draftMetaRead.url) &&
        Objects.equals(this.createdAt, draftMetaRead.createdAt) &&
        Objects.equals(this.updatedAt, draftMetaRead.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, templateId, name, description, url, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftMetaRead {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
