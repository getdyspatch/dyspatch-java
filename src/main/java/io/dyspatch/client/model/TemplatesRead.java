/*
 * Dyspatch API
 * # Introduction  The Dyspatch API is based on the REST paradigm, and features resource based URLs with standard HTTP response codes to indicate errors. We use standard HTTP authentication and request verbs, and all responses are JSON formatted. See our [Implementation Guide](https://docs.dyspatch.io/development/implementing_dyspatch/) for more details on how to implement Dyspatch.  ## API Client Libraries  Dyspatch provides API Clients for popular languages and web frameworks.   - [Java](https://github.com/getdyspatch/dyspatch-java) - [Javascript](https://github.com/getdyspatch/dyspatch-javascript) - [Python](https://github.com/getdyspatch/dyspatch-python) 
 *
 * OpenAPI spec version: 2018.08
 * Contact: support@dyspatch.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.dyspatch.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.dyspatch.client.model.Cursor;
import io.dyspatch.client.model.TemplateMetaRead;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TemplatesRead
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-26T14:43:45.770-07:00")
public class TemplatesRead {
  @SerializedName("cursor")
  private Cursor cursor = null;

  @SerializedName("data")
  private List<TemplateMetaRead> data = null;

  public TemplatesRead cursor(Cursor cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @ApiModelProperty(value = "")
  public Cursor getCursor() {
    return cursor;
  }

  public void setCursor(Cursor cursor) {
    this.cursor = cursor;
  }

  public TemplatesRead data(List<TemplateMetaRead> data) {
    this.data = data;
    return this;
  }

  public TemplatesRead addDataItem(TemplateMetaRead dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<TemplateMetaRead>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * A list of template metadata objects
   * @return data
  **/
  @ApiModelProperty(value = "A list of template metadata objects")
  public List<TemplateMetaRead> getData() {
    return data;
  }

  public void setData(List<TemplateMetaRead> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplatesRead templatesRead = (TemplatesRead) o;
    return Objects.equals(this.cursor, templatesRead.cursor) &&
        Objects.equals(this.data, templatesRead.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplatesRead {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

