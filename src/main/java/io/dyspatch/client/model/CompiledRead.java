/*
 * Dyspatch API
 * # Introduction  The Dyspatch API is based on the REST paradigm, and features resource based URLs with standard HTTP response codes to indicate errors. We use standard HTTP authentication and request verbs, and all responses are JSON formatted. See our [Implementation Guide](https://docs.dyspatch.io/development/implementing_dyspatch/) for more details on how to implement Dyspatch.  ## API Client Libraries Dyspatch provides API Clients for popular languages and web frameworks.  - [Java](https://github.com/getdyspatch/dyspatch-java) - [Javascript](https://github.com/getdyspatch/dyspatch-javascript) - [Python](https://github.com/getdyspatch/dyspatch-python) - [C#](https://github.com/getdyspatch/dyspatch-dotnet) - [Go](https://github.com/getdyspatch/dyspatch-golang) - [Ruby](https://github.com/getdyspatch/dyspatch-ruby)  
 *
 * The version of the OpenAPI document: 2019.10
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * revision data
 */
@ApiModel(description = "revision data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-02T21:31:14.752Z[GMT]")
public class CompiledRead {
  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  public static final String SERIALIZED_NAME_REPLY_TO = "replyTo";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private String replyTo;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private byte[] subject;

  public static final String SERIALIZED_NAME_HTML = "html";
  @SerializedName(SERIALIZED_NAME_HTML)
  private byte[] html;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private byte[] text;


  public CompiledRead sender(String sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Sender address
   * @return sender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Example", value = "Sender address")

  public String getSender() {
    return sender;
  }


  public void setSender(String sender) {
    this.sender = sender;
  }


  public CompiledRead replyTo(String replyTo) {
    
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Reply-To address
   * @return replyTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Example", value = "Reply-To address")

  public String getReplyTo() {
    return replyTo;
  }


  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }


  public CompiledRead subject(byte[] subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Base64 encoded template subject line
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded template subject line")

  public byte[] getSubject() {
    return subject;
  }


  public void setSubject(byte[] subject) {
    this.subject = subject;
  }


  public CompiledRead html(byte[] html) {
    
    this.html = html;
    return this;
  }

   /**
   * Base64 encoded template HTML body
   * @return html
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded template HTML body")

  public byte[] getHtml() {
    return html;
  }


  public void setHtml(byte[] html) {
    this.html = html;
  }


  public CompiledRead text(byte[] text) {
    
    this.text = text;
    return this;
  }

   /**
   * Base64 encoded template text body
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded template text body")

  public byte[] getText() {
    return text;
  }


  public void setText(byte[] text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompiledRead compiledRead = (CompiledRead) o;
    return Objects.equals(this.sender, compiledRead.sender) &&
        Objects.equals(this.replyTo, compiledRead.replyTo) &&
        Arrays.equals(this.subject, compiledRead.subject) &&
        Arrays.equals(this.html, compiledRead.html) &&
        Arrays.equals(this.text, compiledRead.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sender, replyTo, Arrays.hashCode(subject), Arrays.hashCode(html), Arrays.hashCode(text));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompiledRead {\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

