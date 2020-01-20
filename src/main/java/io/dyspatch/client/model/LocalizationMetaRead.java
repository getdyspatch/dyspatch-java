/*
 * Dyspatch API
 * # Introduction The Dyspatch API is based on the REST paradigm, and features resource based URLs with standard HTTP response codes to indicate errors. We use standard HTTP authentication and request verbs, and all responses are JSON formatted. See our [Implementation Guide](https://docs.dyspatch.io/development/implementing_dyspatch/) for more details on how to implement Dyspatch. ## API Client Libraries Dyspatch provides API Clients for popular languages and web frameworks. - [Java](https://github.com/getdyspatch/dyspatch-java) - [Javascript](https://github.com/getdyspatch/dyspatch-javascript) - [Python](https://github.com/getdyspatch/dyspatch-python) - [C#](https://github.com/getdyspatch/dyspatch-dotnet) - [Go](https://github.com/getdyspatch/dyspatch-golang) - [Ruby](https://github.com/getdyspatch/dyspatch-ruby) 
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
 * localization metadata
 */
@ApiModel(description = "localization metadata")

public class LocalizationMetaRead {
  public static final String SERIALIZED_NAME_LOCALIZATION = "localization";
  @SerializedName(SERIALIZED_NAME_LOCALIZATION)
  private String localization;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public LocalizationMetaRead localization(String localization) {
    
    this.localization = localization;
    return this;
  }

   /**
   * An opaque, unique identifier for a localization
   * @return localization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "loc_g3L7Cw6Hp5wUaf395LehwK", value = "An opaque, unique identifier for a localization")

  public String getLocalization() {
    return localization;
  }


  public void setLocalization(String localization) {
    this.localization = localization;
  }


  public LocalizationMetaRead language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * A language identifier comprised of a language and a country identifier. See [supported languages](https://docs.dyspatch.io/localization/supported_languages/). 
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en-US", value = "A language identifier comprised of a language and a country identifier. See [supported languages](https://docs.dyspatch.io/localization/supported_languages/). ")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public LocalizationMetaRead name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The user-specified name of a localization
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "English (US)", value = "The user-specified name of a localization")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LocalizationMetaRead url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The API url for a specific localization
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/localizations/loc_g3L7Cw6Hp5wUaf395LehwK", value = "The API url for a specific localization")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalizationMetaRead localizationMetaRead = (LocalizationMetaRead) o;
    return Objects.equals(this.localization, localizationMetaRead.localization) &&
        Objects.equals(this.language, localizationMetaRead.language) &&
        Objects.equals(this.name, localizationMetaRead.name) &&
        Objects.equals(this.url, localizationMetaRead.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localization, language, name, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalizationMetaRead {\n");
    sb.append("    localization: ").append(toIndentedString(localization)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

