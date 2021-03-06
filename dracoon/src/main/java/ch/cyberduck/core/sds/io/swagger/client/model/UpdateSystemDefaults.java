/*
 * DRACOON
 * REST Web Services for DRACOON<br>Version: 4.8.0-LTS  - built at: 2018-05-03 15:44:37<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a>
 *
 * OpenAPI spec version: 4.8.0-LTS
 * Contact: develop@dracoon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

/*
 * Copyright (c) 2002-2018 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * UpdateSystemDefaults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-23T09:31:14.222+02:00")
public class UpdateSystemDefaults {
  @JsonProperty("languageDefault")
  private String languageDefault = null;

  @JsonProperty("downloadShareDefaultExpirationPeriod")
  private Integer downloadShareDefaultExpirationPeriod = null;

  @JsonProperty("uploadShareDefaultExpirationPeriod")
  private Integer uploadShareDefaultExpirationPeriod = null;

  @JsonProperty("fileDefaultExpirationPeriod")
  private Integer fileDefaultExpirationPeriod = null;

  public UpdateSystemDefaults languageDefault(String languageDefault) {
    this.languageDefault = languageDefault;
    return this;
  }

   /**
   * Define which language should be default.
   * @return languageDefault
  **/
  @ApiModelProperty(example = "de-DE", value = "Define which language should be default.")
  public String getLanguageDefault() {
    return languageDefault;
  }

  public void setLanguageDefault(String languageDefault) {
    this.languageDefault = languageDefault;
  }

  public UpdateSystemDefaults downloadShareDefaultExpirationPeriod(Integer downloadShareDefaultExpirationPeriod) {
    this.downloadShareDefaultExpirationPeriod = downloadShareDefaultExpirationPeriod;
    return this;
  }

   /**
   * Default expiration period for Download Shares in days.
   * @return downloadShareDefaultExpirationPeriod
  **/
  @ApiModelProperty(value = "Default expiration period for Download Shares in days.")
  public Integer getDownloadShareDefaultExpirationPeriod() {
    return downloadShareDefaultExpirationPeriod;
  }

  public void setDownloadShareDefaultExpirationPeriod(Integer downloadShareDefaultExpirationPeriod) {
    this.downloadShareDefaultExpirationPeriod = downloadShareDefaultExpirationPeriod;
  }

  public UpdateSystemDefaults uploadShareDefaultExpirationPeriod(Integer uploadShareDefaultExpirationPeriod) {
    this.uploadShareDefaultExpirationPeriod = uploadShareDefaultExpirationPeriod;
    return this;
  }

   /**
   * Default expiration period for Upload Shares in days.
   * @return uploadShareDefaultExpirationPeriod
  **/
  @ApiModelProperty(value = "Default expiration period for Upload Shares in days.")
  public Integer getUploadShareDefaultExpirationPeriod() {
    return uploadShareDefaultExpirationPeriod;
  }

  public void setUploadShareDefaultExpirationPeriod(Integer uploadShareDefaultExpirationPeriod) {
    this.uploadShareDefaultExpirationPeriod = uploadShareDefaultExpirationPeriod;
  }

  public UpdateSystemDefaults fileDefaultExpirationPeriod(Integer fileDefaultExpirationPeriod) {
    this.fileDefaultExpirationPeriod = fileDefaultExpirationPeriod;
    return this;
  }

   /**
   * Default expiration period for all uploaded files in days.
   * @return fileDefaultExpirationPeriod
  **/
  @ApiModelProperty(value = "Default expiration period for all uploaded files in days.")
  public Integer getFileDefaultExpirationPeriod() {
    return fileDefaultExpirationPeriod;
  }

  public void setFileDefaultExpirationPeriod(Integer fileDefaultExpirationPeriod) {
    this.fileDefaultExpirationPeriod = fileDefaultExpirationPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSystemDefaults updateSystemDefaults = (UpdateSystemDefaults) o;
    return Objects.equals(this.languageDefault, updateSystemDefaults.languageDefault) &&
        Objects.equals(this.downloadShareDefaultExpirationPeriod, updateSystemDefaults.downloadShareDefaultExpirationPeriod) &&
        Objects.equals(this.uploadShareDefaultExpirationPeriod, updateSystemDefaults.uploadShareDefaultExpirationPeriod) &&
        Objects.equals(this.fileDefaultExpirationPeriod, updateSystemDefaults.fileDefaultExpirationPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageDefault, downloadShareDefaultExpirationPeriod, uploadShareDefaultExpirationPeriod, fileDefaultExpirationPeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSystemDefaults {\n");

    sb.append("    languageDefault: ").append(toIndentedString(languageDefault)).append("\n");
    sb.append("    downloadShareDefaultExpirationPeriod: ").append(toIndentedString(downloadShareDefaultExpirationPeriod)).append("\n");
    sb.append("    uploadShareDefaultExpirationPeriod: ").append(toIndentedString(uploadShareDefaultExpirationPeriod)).append("\n");
    sb.append("    fileDefaultExpirationPeriod: ").append(toIndentedString(fileDefaultExpirationPeriod)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

