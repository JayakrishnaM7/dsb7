package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.AccountAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * updatepayment payment
 */
@ApiModel(description = "updatepayment payment")


public class Account   {
  @JsonProperty("Account Facility")
  private AccountAccountFacility accountFacility = null;

  public Account accountFacility(AccountAccountFacility accountFacility) {
    this.accountFacility = accountFacility;
    return this;
  }

  /**
   * Get accountFacility
   * @return accountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountAccountFacility getAccountFacility() {
    return accountFacility;
  }

  public void setAccountFacility(AccountAccountFacility accountFacility) {
    this.accountFacility = accountFacility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountFacility, account.accountFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountFacility: ").append(toIndentedString(accountFacility)).append("\n");
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

