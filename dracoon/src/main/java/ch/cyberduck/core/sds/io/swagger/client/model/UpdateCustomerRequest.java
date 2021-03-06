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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

/**
 * UpdateCustomerRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-23T09:31:14.222+02:00")
public class UpdateCustomerRequest {
  @JsonProperty("companyName")
  private String companyName = null;

  /**
   * Customer type
   */
  public enum CustomerContractTypeEnum {
    FREE("free"),
    
    DEMO("demo"),
    
    PAY("pay");

    private String value;

    CustomerContractTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomerContractTypeEnum fromValue(String text) {
      for (CustomerContractTypeEnum b : CustomerContractTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("customerContractType")
  private CustomerContractTypeEnum customerContractType = null;

  @JsonProperty("quotaMax")
  private Long quotaMax = null;

  @JsonProperty("userMax")
  private Integer userMax = null;

  @JsonProperty("lockStatus")
  private Boolean lockStatus = null;

  @JsonProperty("isLocked")
  private Boolean isLocked = null;

  @JsonProperty("providerCustomerId")
  private String providerCustomerId = null;

  public UpdateCustomerRequest companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Company name
   * @return companyName
  **/
  @ApiModelProperty(value = "Company name")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public UpdateCustomerRequest customerContractType(CustomerContractTypeEnum customerContractType) {
    this.customerContractType = customerContractType;
    return this;
  }

   /**
   * Customer type
   * @return customerContractType
  **/
  @ApiModelProperty(example = "pay", value = "Customer type")
  public CustomerContractTypeEnum getCustomerContractType() {
    return customerContractType;
  }

  public void setCustomerContractType(CustomerContractTypeEnum customerContractType) {
    this.customerContractType = customerContractType;
  }

  public UpdateCustomerRequest quotaMax(Long quotaMax) {
    this.quotaMax = quotaMax;
    return this;
  }

   /**
   * Maximal disc space which can be allocated by customer in bytes.
   * @return quotaMax
  **/
  @ApiModelProperty(value = "Maximal disc space which can be allocated by customer in bytes.")
  public Long getQuotaMax() {
    return quotaMax;
  }

  public void setQuotaMax(Long quotaMax) {
    this.quotaMax = quotaMax;
  }

  public UpdateCustomerRequest userMax(Integer userMax) {
    this.userMax = userMax;
    return this;
  }

   /**
   * Maximal number of users
   * @return userMax
  **/
  @ApiModelProperty(value = "Maximal number of users")
  public Integer getUserMax() {
    return userMax;
  }

  public void setUserMax(Integer userMax) {
    this.userMax = userMax;
  }

  public UpdateCustomerRequest lockStatus(Boolean lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }

   /**
   * DEPRECATED. Please use isLocked. Customer lock status: * &#x60;false&#x60; - unlocked * &#x60;true&#x60; - locked  All users of this customer will be blocked and can not login anymore. (default: false)
   * @return lockStatus
  **/
  @ApiModelProperty(example = "false", value = "DEPRECATED. Please use isLocked. Customer lock status: * `false` - unlocked * `true` - locked  All users of this customer will be blocked and can not login anymore. (default: false)")
  public Boolean getLockStatus() {
    return lockStatus;
  }

  public void setLockStatus(Boolean lockStatus) {
    this.lockStatus = lockStatus;
  }

  public UpdateCustomerRequest isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Customer is locked: * &#x60;false&#x60; - unlocked * &#x60;true&#x60; - locked  All users of this customer will be blocked and can not login anymore. (default: false)
   * @return isLocked
  **/
  @ApiModelProperty(example = "false", value = "Customer is locked: * `false` - unlocked * `true` - locked  All users of this customer will be blocked and can not login anymore. (default: false)")
  public Boolean getIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public UpdateCustomerRequest providerCustomerId(String providerCustomerId) {
    this.providerCustomerId = providerCustomerId;
    return this;
  }

   /**
   * &#x60;DEPRECATED&#x60;: Provider customer ID
   * @return providerCustomerId
  **/
  @ApiModelProperty(value = "`DEPRECATED`: Provider customer ID")
  public String getProviderCustomerId() {
    return providerCustomerId;
  }

  public void setProviderCustomerId(String providerCustomerId) {
    this.providerCustomerId = providerCustomerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomerRequest updateCustomerRequest = (UpdateCustomerRequest) o;
    return Objects.equals(this.companyName, updateCustomerRequest.companyName) &&
        Objects.equals(this.customerContractType, updateCustomerRequest.customerContractType) &&
        Objects.equals(this.quotaMax, updateCustomerRequest.quotaMax) &&
        Objects.equals(this.userMax, updateCustomerRequest.userMax) &&
        Objects.equals(this.lockStatus, updateCustomerRequest.lockStatus) &&
        Objects.equals(this.isLocked, updateCustomerRequest.isLocked) &&
        Objects.equals(this.providerCustomerId, updateCustomerRequest.providerCustomerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, customerContractType, quotaMax, userMax, lockStatus, isLocked, providerCustomerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomerRequest {\n");

    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    customerContractType: ").append(toIndentedString(customerContractType)).append("\n");
    sb.append("    quotaMax: ").append(toIndentedString(quotaMax)).append("\n");
    sb.append("    userMax: ").append(toIndentedString(userMax)).append("\n");
    sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    providerCustomerId: ").append(toIndentedString(providerCustomerId)).append("\n");
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

