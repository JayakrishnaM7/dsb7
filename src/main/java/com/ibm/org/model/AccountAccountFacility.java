package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountAccountFacility
 */


public class AccountAccountFacility   {
  @JsonProperty("AccountNumber")
  private String accountNumber;

  @JsonProperty("CustomerReference")
  private Object customerReference = null;

  @JsonProperty("BankBranchOrLocationReference")
  private Object bankBranchOrLocationReference = null;

  @JsonProperty("AccountType")
  private String accountType;

  @JsonProperty("AccountCurrency")
  private String accountCurrency;

  @JsonProperty("TaxReference")
  private Object taxReference = null;

  @JsonProperty("EntitlementOptionDefinition")
  private String entitlementOptionDefinition;

  @JsonProperty("EntitlementOptionSetting")
  private String entitlementOptionSetting;

  @JsonProperty("RestrictionOptionDefinition")
  private String restrictionOptionDefinition;

  @JsonProperty("RestrictionOptionSetting")
  private String restrictionOptionSetting;

  @JsonProperty("Associations")
  private String associations;

  @JsonProperty("AssociationType")
  private String associationType;

  @JsonProperty("AssociationObligationOrEntitlement")
  private String associationObligationOrEntitlement;

  @JsonProperty("AssociationReference")
  private String associationReference;

  @JsonProperty("ProductType")
  private String productType;

  @JsonProperty("LinkedAccounts")
  private String linkedAccounts;

  @JsonProperty("LinkType")
  private String linkType;

  @JsonProperty("AccountDetails")
  private String accountDetails;

  @JsonProperty("AccountAvailableBalance")
  private String accountAvailableBalance;

  @JsonProperty("AccountEffectiveAvailableBalance")
  private String accountEffectiveAvailableBalance;

  @JsonProperty("PositionLimits")
  private String positionLimits;

  @JsonProperty("PositionLimitType")
  private String positionLimitType;

  @JsonProperty("PositionLimitSettings")
  private String positionLimitSettings;

  @JsonProperty("PositionLimitValue")
  private String positionLimitValue;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("StatementsSchedule")
  private String statementsSchedule;

  @JsonProperty("StatementType")
  private String statementType;

  @JsonProperty("StatementTransactionType")
  private String statementTransactionType;

  @JsonProperty("StatementPeriod")
  private String statementPeriod;

  @JsonProperty("StatementReport")
  private String statementReport;

  @JsonProperty("Optional1")
  private String optional1;

  @JsonProperty("Optional2")
  private String optional2;

  @JsonProperty("Optional3")
  private String optional3;

  @JsonProperty("Optional4")
  private String optional4;

  public AccountAccountFacility accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  */
  @ApiModelProperty(value = "")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AccountAccountFacility customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public AccountAccountFacility bankBranchOrLocationReference(Object bankBranchOrLocationReference) {
    this.bankBranchOrLocationReference = bankBranchOrLocationReference;
    return this;
  }

  /**
   * Get bankBranchOrLocationReference
   * @return bankBranchOrLocationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBankBranchOrLocationReference() {
    return bankBranchOrLocationReference;
  }

  public void setBankBranchOrLocationReference(Object bankBranchOrLocationReference) {
    this.bankBranchOrLocationReference = bankBranchOrLocationReference;
  }

  public AccountAccountFacility accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  */
  @ApiModelProperty(value = "")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public AccountAccountFacility accountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
    return this;
  }

  /**
   * Get accountCurrency
   * @return accountCurrency
  */
  @ApiModelProperty(value = "")


  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }

  public AccountAccountFacility taxReference(Object taxReference) {
    this.taxReference = taxReference;
    return this;
  }

  /**
   * Get taxReference
   * @return taxReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(Object taxReference) {
    this.taxReference = taxReference;
  }

  public AccountAccountFacility entitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
    return this;
  }

  /**
   * Get entitlementOptionDefinition
   * @return entitlementOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }

  public AccountAccountFacility entitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
    return this;
  }

  /**
   * Get entitlementOptionSetting
   * @return entitlementOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }

  public AccountAccountFacility restrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
    return this;
  }

  /**
   * Get restrictionOptionDefinition
   * @return restrictionOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }

  public AccountAccountFacility restrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
    return this;
  }

  /**
   * Get restrictionOptionSetting
   * @return restrictionOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }

  public AccountAccountFacility associations(String associations) {
    this.associations = associations;
    return this;
  }

  /**
   * Get associations
   * @return associations
  */
  @ApiModelProperty(value = "")


  public String getAssociations() {
    return associations;
  }

  public void setAssociations(String associations) {
    this.associations = associations;
  }

  public AccountAccountFacility associationType(String associationType) {
    this.associationType = associationType;
    return this;
  }

  /**
   * Get associationType
   * @return associationType
  */
  @ApiModelProperty(value = "")


  public String getAssociationType() {
    return associationType;
  }

  public void setAssociationType(String associationType) {
    this.associationType = associationType;
  }

  public AccountAccountFacility associationObligationOrEntitlement(String associationObligationOrEntitlement) {
    this.associationObligationOrEntitlement = associationObligationOrEntitlement;
    return this;
  }

  /**
   * Get associationObligationOrEntitlement
   * @return associationObligationOrEntitlement
  */
  @ApiModelProperty(value = "")


  public String getAssociationObligationOrEntitlement() {
    return associationObligationOrEntitlement;
  }

  public void setAssociationObligationOrEntitlement(String associationObligationOrEntitlement) {
    this.associationObligationOrEntitlement = associationObligationOrEntitlement;
  }

  public AccountAccountFacility associationReference(String associationReference) {
    this.associationReference = associationReference;
    return this;
  }

  /**
   * Get associationReference
   * @return associationReference
  */
  @ApiModelProperty(value = "")


  public String getAssociationReference() {
    return associationReference;
  }

  public void setAssociationReference(String associationReference) {
    this.associationReference = associationReference;
  }

  public AccountAccountFacility productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
  */
  @ApiModelProperty(value = "")


  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public AccountAccountFacility linkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
    return this;
  }

  /**
   * Get linkedAccounts
   * @return linkedAccounts
  */
  @ApiModelProperty(value = "")


  public String getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }

  public AccountAccountFacility linkType(String linkType) {
    this.linkType = linkType;
    return this;
  }

  /**
   * Get linkType
   * @return linkType
  */
  @ApiModelProperty(value = "")


  public String getLinkType() {
    return linkType;
  }

  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }

  public AccountAccountFacility accountDetails(String accountDetails) {
    this.accountDetails = accountDetails;
    return this;
  }

  /**
   * Get accountDetails
   * @return accountDetails
  */
  @ApiModelProperty(value = "")


  public String getAccountDetails() {
    return accountDetails;
  }

  public void setAccountDetails(String accountDetails) {
    this.accountDetails = accountDetails;
  }

  public AccountAccountFacility accountAvailableBalance(String accountAvailableBalance) {
    this.accountAvailableBalance = accountAvailableBalance;
    return this;
  }

  /**
   * Get accountAvailableBalance
   * @return accountAvailableBalance
  */
  @ApiModelProperty(value = "")


  public String getAccountAvailableBalance() {
    return accountAvailableBalance;
  }

  public void setAccountAvailableBalance(String accountAvailableBalance) {
    this.accountAvailableBalance = accountAvailableBalance;
  }

  public AccountAccountFacility accountEffectiveAvailableBalance(String accountEffectiveAvailableBalance) {
    this.accountEffectiveAvailableBalance = accountEffectiveAvailableBalance;
    return this;
  }

  /**
   * Get accountEffectiveAvailableBalance
   * @return accountEffectiveAvailableBalance
  */
  @ApiModelProperty(value = "")


  public String getAccountEffectiveAvailableBalance() {
    return accountEffectiveAvailableBalance;
  }

  public void setAccountEffectiveAvailableBalance(String accountEffectiveAvailableBalance) {
    this.accountEffectiveAvailableBalance = accountEffectiveAvailableBalance;
  }

  public AccountAccountFacility positionLimits(String positionLimits) {
    this.positionLimits = positionLimits;
    return this;
  }

  /**
   * Get positionLimits
   * @return positionLimits
  */
  @ApiModelProperty(value = "")


  public String getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(String positionLimits) {
    this.positionLimits = positionLimits;
  }

  public AccountAccountFacility positionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
    return this;
  }

  /**
   * Get positionLimitType
   * @return positionLimitType
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitType() {
    return positionLimitType;
  }

  public void setPositionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
  }

  public AccountAccountFacility positionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
    return this;
  }

  /**
   * Get positionLimitSettings
   * @return positionLimitSettings
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitSettings() {
    return positionLimitSettings;
  }

  public void setPositionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
  }

  public AccountAccountFacility positionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
    return this;
  }

  /**
   * Get positionLimitValue
   * @return positionLimitValue
  */
  @ApiModelProperty(value = "")


  public String getPositionLimitValue() {
    return positionLimitValue;
  }

  public void setPositionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
  }

  public AccountAccountFacility dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public AccountAccountFacility statementsSchedule(String statementsSchedule) {
    this.statementsSchedule = statementsSchedule;
    return this;
  }

  /**
   * Get statementsSchedule
   * @return statementsSchedule
  */
  @ApiModelProperty(value = "")


  public String getStatementsSchedule() {
    return statementsSchedule;
  }

  public void setStatementsSchedule(String statementsSchedule) {
    this.statementsSchedule = statementsSchedule;
  }

  public AccountAccountFacility statementType(String statementType) {
    this.statementType = statementType;
    return this;
  }

  /**
   * Get statementType
   * @return statementType
  */
  @ApiModelProperty(value = "")


  public String getStatementType() {
    return statementType;
  }

  public void setStatementType(String statementType) {
    this.statementType = statementType;
  }

  public AccountAccountFacility statementTransactionType(String statementTransactionType) {
    this.statementTransactionType = statementTransactionType;
    return this;
  }

  /**
   * Get statementTransactionType
   * @return statementTransactionType
  */
  @ApiModelProperty(value = "")


  public String getStatementTransactionType() {
    return statementTransactionType;
  }

  public void setStatementTransactionType(String statementTransactionType) {
    this.statementTransactionType = statementTransactionType;
  }

  public AccountAccountFacility statementPeriod(String statementPeriod) {
    this.statementPeriod = statementPeriod;
    return this;
  }

  /**
   * Get statementPeriod
   * @return statementPeriod
  */
  @ApiModelProperty(value = "")


  public String getStatementPeriod() {
    return statementPeriod;
  }

  public void setStatementPeriod(String statementPeriod) {
    this.statementPeriod = statementPeriod;
  }

  public AccountAccountFacility statementReport(String statementReport) {
    this.statementReport = statementReport;
    return this;
  }

  /**
   * Get statementReport
   * @return statementReport
  */
  @ApiModelProperty(value = "")


  public String getStatementReport() {
    return statementReport;
  }

  public void setStatementReport(String statementReport) {
    this.statementReport = statementReport;
  }

  public AccountAccountFacility optional1(String optional1) {
    this.optional1 = optional1;
    return this;
  }

  /**
   * Get optional1
   * @return optional1
  */
  @ApiModelProperty(value = "")


  public String getOptional1() {
    return optional1;
  }

  public void setOptional1(String optional1) {
    this.optional1 = optional1;
  }

  public AccountAccountFacility optional2(String optional2) {
    this.optional2 = optional2;
    return this;
  }

  /**
   * Get optional2
   * @return optional2
  */
  @ApiModelProperty(value = "")


  public String getOptional2() {
    return optional2;
  }

  public void setOptional2(String optional2) {
    this.optional2 = optional2;
  }

  public AccountAccountFacility optional3(String optional3) {
    this.optional3 = optional3;
    return this;
  }

  /**
   * Get optional3
   * @return optional3
  */
  @ApiModelProperty(value = "")


  public String getOptional3() {
    return optional3;
  }

  public void setOptional3(String optional3) {
    this.optional3 = optional3;
  }

  public AccountAccountFacility optional4(String optional4) {
    this.optional4 = optional4;
    return this;
  }

  /**
   * Get optional4
   * @return optional4
  */
  @ApiModelProperty(value = "")


  public String getOptional4() {
    return optional4;
  }

  public void setOptional4(String optional4) {
    this.optional4 = optional4;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAccountFacility accountAccountFacility = (AccountAccountFacility) o;
    return Objects.equals(this.accountNumber, accountAccountFacility.accountNumber) &&
        Objects.equals(this.customerReference, accountAccountFacility.customerReference) &&
        Objects.equals(this.bankBranchOrLocationReference, accountAccountFacility.bankBranchOrLocationReference) &&
        Objects.equals(this.accountType, accountAccountFacility.accountType) &&
        Objects.equals(this.accountCurrency, accountAccountFacility.accountCurrency) &&
        Objects.equals(this.taxReference, accountAccountFacility.taxReference) &&
        Objects.equals(this.entitlementOptionDefinition, accountAccountFacility.entitlementOptionDefinition) &&
        Objects.equals(this.entitlementOptionSetting, accountAccountFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionDefinition, accountAccountFacility.restrictionOptionDefinition) &&
        Objects.equals(this.restrictionOptionSetting, accountAccountFacility.restrictionOptionSetting) &&
        Objects.equals(this.associations, accountAccountFacility.associations) &&
        Objects.equals(this.associationType, accountAccountFacility.associationType) &&
        Objects.equals(this.associationObligationOrEntitlement, accountAccountFacility.associationObligationOrEntitlement) &&
        Objects.equals(this.associationReference, accountAccountFacility.associationReference) &&
        Objects.equals(this.productType, accountAccountFacility.productType) &&
        Objects.equals(this.linkedAccounts, accountAccountFacility.linkedAccounts) &&
        Objects.equals(this.linkType, accountAccountFacility.linkType) &&
        Objects.equals(this.accountDetails, accountAccountFacility.accountDetails) &&
        Objects.equals(this.accountAvailableBalance, accountAccountFacility.accountAvailableBalance) &&
        Objects.equals(this.accountEffectiveAvailableBalance, accountAccountFacility.accountEffectiveAvailableBalance) &&
        Objects.equals(this.positionLimits, accountAccountFacility.positionLimits) &&
        Objects.equals(this.positionLimitType, accountAccountFacility.positionLimitType) &&
        Objects.equals(this.positionLimitSettings, accountAccountFacility.positionLimitSettings) &&
        Objects.equals(this.positionLimitValue, accountAccountFacility.positionLimitValue) &&
        Objects.equals(this.dateType, accountAccountFacility.dateType) &&
        Objects.equals(this.statementsSchedule, accountAccountFacility.statementsSchedule) &&
        Objects.equals(this.statementType, accountAccountFacility.statementType) &&
        Objects.equals(this.statementTransactionType, accountAccountFacility.statementTransactionType) &&
        Objects.equals(this.statementPeriod, accountAccountFacility.statementPeriod) &&
        Objects.equals(this.statementReport, accountAccountFacility.statementReport) &&
        Objects.equals(this.optional1, accountAccountFacility.optional1) &&
        Objects.equals(this.optional2, accountAccountFacility.optional2) &&
        Objects.equals(this.optional3, accountAccountFacility.optional3) &&
        Objects.equals(this.optional4, accountAccountFacility.optional4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, customerReference, bankBranchOrLocationReference, accountType, accountCurrency, taxReference, entitlementOptionDefinition, entitlementOptionSetting, restrictionOptionDefinition, restrictionOptionSetting, associations, associationType, associationObligationOrEntitlement, associationReference, productType, linkedAccounts, linkType, accountDetails, accountAvailableBalance, accountEffectiveAvailableBalance, positionLimits, positionLimitType, positionLimitSettings, positionLimitValue, dateType, statementsSchedule, statementType, statementTransactionType, statementPeriod, statementReport, optional1, optional2, optional3, optional4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAccountFacility {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    bankBranchOrLocationReference: ").append(toIndentedString(bankBranchOrLocationReference)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    taxReference: ").append(toIndentedString(taxReference)).append("\n");
    sb.append("    entitlementOptionDefinition: ").append(toIndentedString(entitlementOptionDefinition)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionDefinition: ").append(toIndentedString(restrictionOptionDefinition)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    associationObligationOrEntitlement: ").append(toIndentedString(associationObligationOrEntitlement)).append("\n");
    sb.append("    associationReference: ").append(toIndentedString(associationReference)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    linkedAccounts: ").append(toIndentedString(linkedAccounts)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
    sb.append("    accountAvailableBalance: ").append(toIndentedString(accountAvailableBalance)).append("\n");
    sb.append("    accountEffectiveAvailableBalance: ").append(toIndentedString(accountEffectiveAvailableBalance)).append("\n");
    sb.append("    positionLimits: ").append(toIndentedString(positionLimits)).append("\n");
    sb.append("    positionLimitType: ").append(toIndentedString(positionLimitType)).append("\n");
    sb.append("    positionLimitSettings: ").append(toIndentedString(positionLimitSettings)).append("\n");
    sb.append("    positionLimitValue: ").append(toIndentedString(positionLimitValue)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    statementsSchedule: ").append(toIndentedString(statementsSchedule)).append("\n");
    sb.append("    statementType: ").append(toIndentedString(statementType)).append("\n");
    sb.append("    statementTransactionType: ").append(toIndentedString(statementTransactionType)).append("\n");
    sb.append("    statementPeriod: ").append(toIndentedString(statementPeriod)).append("\n");
    sb.append("    statementReport: ").append(toIndentedString(statementReport)).append("\n");
    sb.append("    optional1: ").append(toIndentedString(optional1)).append("\n");
    sb.append("    optional2: ").append(toIndentedString(optional2)).append("\n");
    sb.append("    optional3: ").append(toIndentedString(optional3)).append("\n");
    sb.append("    optional4: ").append(toIndentedString(optional4)).append("\n");
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

