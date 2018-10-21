package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DevelopmentWithIds
 */
public class DevelopmentWithIds   {
  private String leadOpportunityDevelopmentTaskReference = null;

  private String leadOpportunityReference = null;

  private String customerReference = null;

  private String productServiceReference = null;

  private String employeeBusinessUnitReference = null;

  private String customerContactReference = null;

  private String correspondenceReference = null;

  private String dateTime = null;

  private String leadOpportunityDescription = null;

  private String leadOpportunityStatus = null;


  /**
   * `status: Provisionally Registered` bian-reference: SalesLeadManagement.SalesLead.StructuredInteraction 
   * @return leadOpportunityDevelopmentTaskReference
  **/

  public String getLeadOpportunityDevelopmentTaskReference() {
    return leadOpportunityDevelopmentTaskReference;
  }

  public void setLeadOpportunityDevelopmentTaskReference(String leadOpportunityDevelopmentTaskReference) {
    this.leadOpportunityDevelopmentTaskReference = leadOpportunityDevelopmentTaskReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: SalesLeadManagement.SalesLead 
   * @return leadOpportunityReference
  **/

  public String getLeadOpportunityReference() {
    return leadOpportunityReference;
  }

  public void setLeadOpportunityReference(String leadOpportunityReference) {
    this.leadOpportunityReference = leadOpportunityReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: SalesLeadManagement.SalesLead(as PartyRelationshipLifecyclePhase).PartyRelationship(as CustomerRelationship).Customer 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: SalesLeadManagement.SalesLead.ProductToSell general-info: 'target of the opportunity' 
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: SalesLeadManagement.SalesLead(as PartyRelationshipLifecyclePhase).PartyRelationship(as CustomerRelationship).Customer.RelationshipManager.Business Unit 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: SalesLeadManagement.SalesLead(as PartyRelationshipLifecyclePhase).PartyRelationship(as CustomerRelationship).Customer.RepresentativeOfCustomer general-info: 'if customer contacted directly' 
   * @return customerContactReference
  **/

  public String getCustomerContactReference() {
    return customerContactReference;
  }

  public void setCustomerContactReference(String customerContactReference) {
    this.customerContactReference = customerContactReference;
  }


  /**
   * `status: Registered` bian-reference: SalesLeadManagement.SalesLead(as PartyRelationshipLifecyclePhase).PartyRelationship(as CustomerRelationship).Customer(as Role).Player(as Party).ContactPoint iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_FEHzOMTGEeChad0JzLk7QA_-1894201405) general-info: 'if customer contacted indirectly' 
   * @return correspondenceReference
  **/

  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: SalesLeadManagement.SalesLead.StructuredInteraction.TimeBracket general-info: 'date/time of update to the lead/opportunity' 
   * @return dateTime
  **/

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }


  /**
   * `status: Provisionally Registered` bian-reference: SalesLeadManagement.SalesLead.StructuredInteraction.Description general-info: 'narrative/description of opportunity' 
   * @return leadOpportunityDescription
  **/

  public String getLeadOpportunityDescription() {
    return leadOpportunityDescription;
  }

  public void setLeadOpportunityDescription(String leadOpportunityDescription) {
    this.leadOpportunityDescription = leadOpportunityDescription;
  }


  /**
   * `status: Provisionally Registered` bian-reference: SalesLeadManagement.SalesLead(as PartyRelationshipLifecyclePhase).Status 
   * @return leadOpportunityStatus
  **/

  public String getLeadOpportunityStatus() {
    return leadOpportunityStatus;
  }

  public void setLeadOpportunityStatus(String leadOpportunityStatus) {
    this.leadOpportunityStatus = leadOpportunityStatus;
  }


}

