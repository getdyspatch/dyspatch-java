/*
 * Dyspatch API
 * # Introduction  The Dyspatch API is based on the REST paradigm, and features resource based URLs with standard HTTP response codes to indicate errors. We use standard HTTP authentication and request verbs, and all responses are JSON formatted. See our [Implementation Guide](https://docs.dyspatch.io/development/implementing_dyspatch/) for more details on how to implement Dyspatch.  ## API Client Libraries  Dyspatch provides API Clients for popular languages and web frameworks.   - [Java](https://github.com/getdyspatch/dyspatch-java) - [Javascript](https://github.com/getdyspatch/dyspatch-javascript) - [Python](https://github.com/getdyspatch/dyspatch-python) - [C#](https://github.com/getdyspatch/dyspatch-dotnet) - [Go](https://github.com/getdyspatch/dyspatch-golang) - [Ruby](https://github.com/getdyspatch/dyspatch-ruby) 
 *
 * OpenAPI spec version: 2019.03
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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * CompiledRead
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-06-06T15:58:00.720-07:00[America/Vancouver]")public class CompiledRead {

  @SerializedName("sender")
  private String sender = null;

  @SerializedName("replyTo")
  private String replyTo = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("html")
  private String html = null;

  @SerializedName("text")
  private String text = null;
  public CompiledRead sender(String sender) {
    this.sender = sender;
    return this;
  }

  

  /**
  * Sender address
  * @return sender
  **/
  @Schema(example = "Example <example@dyspatch.io>", description = "Sender address")
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
  @Schema(example = "Example <example@dyspatch.io>", description = "Reply-To address")
  public String getReplyTo() {
    return replyTo;
  }
  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }
  public CompiledRead subject(String subject) {
    this.subject = subject;
    return this;
  }

  

  /**
  * Base64 encoded template subject line
  * @return subject
  **/
  @Schema(example = "PGh0bWw+PC9odG1sPgo=", description = "Base64 encoded template subject line")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }
  public CompiledRead html(String html) {
    this.html = html;
    return this;
  }

  

  /**
  * Base64 encoded template HTML body
  * @return html
  **/
  @Schema(example = "PGh0bWw+PC9odG1sPgo=", description = "Base64 encoded template HTML body")
  public String getHtml() {
    return html;
  }
  public void setHtml(String html) {
    this.html = html;
  }
  public CompiledRead text(String text) {
    this.text = text;
    return this;
  }

  

  /**
  * Base64 encoded template text body
  * @return text
  **/
  @Schema(example = "PGh0bWw+PC9odG1sPgo=", description = "Base64 encoded template text body")
  public String getText() {
    return text;
  }
  public void setText(String text) {
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
        Objects.equals(this.subject, compiledRead.subject) &&
        Objects.equals(this.html, compiledRead.html) &&
        Objects.equals(this.text, compiledRead.text);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(sender, replyTo, subject, html, text);
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
