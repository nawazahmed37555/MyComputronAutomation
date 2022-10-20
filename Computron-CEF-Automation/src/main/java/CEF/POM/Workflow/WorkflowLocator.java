package CEF.POM.Workflow;

import CEF.Base.LocatorBase;
import io.appium.java_client.windows.WindowsDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
@Slf4j
class WorkflowLocator extends LocatorBase {
  WorkflowLocator(WindowsDriver CrmDriver) {
    super(CrmDriver);
  }

  WebElement getJournalCycleManagementButton(){
    return driver.findElementByAccessibilityId("Journal Cycle Management");
  }

  WebElement getEcmPcmEcmExecutiveButton(){
    return driver.findElementByAccessibilityId("ECM/PCM/ECM Executive");
  }

  WebElement getCreditManagementPortalButton(){
    return driver.findElementByAccessibilityId("Credit Management Portal");
  }

  WebElement getPurchaseCycleManagementButton(){
    return driver.findElementByAccessibilityId("Purchase Cycle Management");
  }

  WebElement getExpenseCycleManagementButton(){
    return driver.findElementByAccessibilityId("Expense Cycle Management");
  }

  WebElement getBusinessPartnerAdminButton(){
    return driver.findElementByAccessibilityId("Business Partner Admin");
  }

  WebElement getUniversalUtilitiesButton(){
    return driver.findElementByAccessibilityId("Universal Utilities");
  }

  WebElement getElectronicOfficeButton(){
    return driver.findElementByAccessibilityId("Electronic Office");
  }

  WebElement getDisbursementApprovalsButton(){
    return driver.findElementByAccessibilityId("Disbursement Approvals");
  }

  WebElement getWorkflowDirectInvoicingButton(){
    return driver.findElementByAccessibilityId("Workflow Direct Invoicing");
  }

  WebElement getWorkflowSetupButton(){
    return driver.findElementByAccessibilityId("Workflow Setup");
  }

  WebElement getWorkflowEnabledVendorMaintButton(){
    return driver.findElementByAccessibilityId("Workflow Enabled Vendor Maint.");
  }

  /*Level 2 menu locators*/

  WebElement getSystemAdministratorButton(){
    return driver.findElementByAccessibilityId("System Administrator");
  }

  WebElement getApproversButton(){
    return driver.findElementByAccessibilityId("Approvers");
  }

  WebElement getIdentifierApprovalButton(){
    return driver.findElementByAccessibilityId("Identifier Approval");
  }

  WebElement getInquiriesReportButton(){
    return driver.findElementByAccessibilityId("Inquiries / Report");
  }

  WebElement getGLTransactionsButton(){
    return driver.findElementByAccessibilityId("GL Transactions");
  }

  WebElement getIdentifierMaintButton(){
    return driver.findElementByAccessibilityId("Identifier Maint");
  }

  WebElement getGLApprovalsButton(){
    return driver.findElementByAccessibilityId("GL Approvals");
  }

  WebElement getApprovers1Button(){
    return driver.findElementByAccessibilityId("Approvers 1");
  }

  WebElement getApprovers2Button(){
    return driver.findElementByAccessibilityId("Approvers 2");
  }

  WebElement getGLExcelButton(){
    return driver.findElementByAccessibilityId("GL Excel");
  }

  WebElement getCASAPClerkButton(){
    return driver.findElementByAccessibilityId("CAS AP Clerk");
  }

  WebElement getDataConversionTasksButton(){
    return driver.findElementByAccessibilityId("Data Conversion Tasks");
  }

  WebElement getDirectInvoicePurgeButton(){
    return driver.findElementByAccessibilityId("Direct Invoice Purge");
  }

  WebElement getIdentifierApprovalsButton(){
    return driver.findElementByAccessibilityId("Identifier Approvals");
  }

  WebElement getIdentifierMaintenanceButton(){
    return driver.findElementByAccessibilityId("Identifier Maintenance");
  }

  WebElement getDisbursementApprovalButton(){
    return driver.findElementByAccessibilityId("Disbursement Approval");
  }

  WebElement getECMAgentTasksButton(){
    return driver.findElementByAccessibilityId("ECM Agent Tasks");
  }

  WebElement getMoreFunctionsButton(){
    return driver.findElementByAccessibilityId("More Functions....");
  }

  WebElement getErrorResolution003Button(){
    return driver.findElementByAccessibilityId("Error Resolution 003");
  }

  WebElement getErrorResolution101Button(){
    return driver.findElementByAccessibilityId("Error Resolution 101");
  }

  WebElement getErrorResolution401Button(){
    return driver.findElementByAccessibilityId("Error Resolution 401");
  }

  WebElement getErrorResolution501Button(){
    return driver.findElementByAccessibilityId("Error Resolution 501");
  }

  WebElement getMQErrorProcessingButton(){
    return driver.findElementByAccessibilityId("MQ Error Processing");
  }

  WebElement getPOProcessingModuleButton(){
    return driver.findElementByAccessibilityId("PO Processing Module");
  }

  WebElement getPOAcknowledgementsButton(){
    return driver.findElementByAccessibilityId("PO Acknowledgements");
  }

  WebElement getPOApprovalButton(){
    return driver.findElementByAccessibilityId("PO Approval");
  }

  WebElement getRCDiscrepanciesButton(){
    return driver.findElementByAccessibilityId("RC Discrepancies");
  }

  WebElement getRequisitioningModuleButton(){
    return driver.findElementByAccessibilityId("Requisitioning Module");
  }

  WebElement getRequisitionApprovalButton(){
    return driver.findElementByAccessibilityId("Requisition Approval");
  }

  WebElement getScanningFunctionsButton(){
    return driver.findElementByAccessibilityId("Scanning Functions");
  }

  WebElement getWorkflowTablesButton(){
    return driver.findElementByAccessibilityId("Workflow Tables");
  }

  WebElement getUserFileMaintenanceButton(){
    return driver.findElementByAccessibilityId("User File Maintenance");
  }

  WebElement getUserFileInquiryListButton(){
    return driver.findElementByAccessibilityId("User File Inquiry/List");
  }

  WebElement getMenuFileMaintenanceButton(){
    return driver.findElementByAccessibilityId("Menu File Maintenance");
  }

  WebElement getMenuFilePrintButton(){
    return driver.findElementByAccessibilityId("Menu File Print");
  }

  WebElement getDataBaseMapMaintenanceButton(){
    return driver.findElementByAccessibilityId("Data Base Map Maintenance");
  }

  WebElement getMAPMaintenanceButton(){
    return driver.findElementByAccessibilityId("MAP Maintenance");
  }

  WebElement getGlobalVariableMaintenanceButton(){
    return driver.findElementByAccessibilityId("Global Variable Maintenance");
  }

  WebElement getGlobalVariableInqListButton(){
    return driver.findElementByAccessibilityId("Global Variable Inq/List");
  }

  WebElement getSoftScreenMaintenanceButton(){
    return driver.findElementByAccessibilityId("Soft Screen Maintenance");
  }

  WebElement getRestartRecoveryButton(){
    return driver.findElementByAccessibilityId("Restart Recovery");
  }

  WebElement getSystemUtilitiesMenuButton(){
    return driver.findElementByAccessibilityId("System Utilities Menu");
  }

  WebElement getPrintAuditFileButton(){
    return driver.findElementByAccessibilityId("Print Audit File");
  }

  WebElement getEPICinUVButton(){
    return driver.findElementByAccessibilityId("EPIC in UV");
  }

  WebElement getAdministrationButton(){
    return driver.findElementByAccessibilityId("Administration");
  }

  WebElement getWorkflowPurgeMenuButton(){
    return driver.findElementByAccessibilityId("Workflow Purge Menu");
  }

  WebElement getScanningButton(){
    return driver.findElementByAccessibilityId("Scanning");
  }

  WebElement getSetupButton(){
    return driver.findElementByAccessibilityId("Setup");
  }

  WebElement getSystemAdminButton(){
    return driver.findElementByAccessibilityId("System Admin");
  }

  WebElement getAPApprovalsButton(){
    return driver.findElementByAccessibilityId("AP Approvals");
  }

  WebElement getTransactionApprovalButton(){
    return driver.findElementByAccessibilityId("Transaction Approval");
  }

  WebElement getDirectInvoicingWorkflowButton(){
    return driver.findElementByAccessibilityId("Direct Invoicing Workflow");
  }

  WebElement getDirectInvoicePurgesButton(){
    return driver.findElementByAccessibilityId("Direct Invoice Purges");
  }

  WebElement getELECTRONICOFFICETASKSButton(){
    return driver.findElementByAccessibilityId("ELECTRONIC OFFICE TASKS");
  }

  WebElement getEmailApprovalProcessingButton(){
    return driver.findElementByAccessibilityId("Email Approval Processing");
  }

  WebElement getelectronicofficeinquiryButton(){
    return driver.findElementByAccessibilityId("electronic office inquiry");
  }

  WebElement getImportsButton(){
    return driver.findElementByAccessibilityId("Imports");
  }

  WebElement getIndexingButton(){
    return driver.findElementByAccessibilityId("Indexing");
  }

  WebElement getInquiriesButton(){
    return driver.findElementByAccessibilityId("Inquiries");
  }

  WebElement getTileButton(){
    return driver.findElementByAccessibilityId("Tile");
  }

  WebElement getActivityCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Activity Code Maintenance");
  }

  WebElement getBatchDefinitionButton(){
    return driver.findElementByAccessibilityId("Batch Definition");
  }

  WebElement getCaseDefinitionButton(){
    return driver.findElementByAccessibilityId("Case Definition");
  }

  WebElement getDocumentDefinitionButton(){
    return driver.findElementByAccessibilityId("Document Definition");
  }

  WebElement getDocumentGroupDefinitionButton(){
    return driver.findElementByAccessibilityId("Document Group Definition");
  }

  WebElement getFolderDefinitionButton(){
    return driver.findElementByAccessibilityId("Folder Definition");
  }

  WebElement getQueueDefinitionButton(){
    return driver.findElementByAccessibilityId("Queue Definition");
  }

  WebElement getTaskDefinitionButton(){
    return driver.findElementByAccessibilityId("Task Definition");
  }

  WebElement getWorkGroupMaintenanceButton(){
    return driver.findElementByAccessibilityId("Work Group Maintenance");
  }

  WebElement getRoutingRuleMaintenanceButton(){
    return driver.findElementByAccessibilityId("Routing Rule Maintenance");
  }

  WebElement getImageLocatorMaintenanceButton(){
    return driver.findElementByAccessibilityId("Image Locator Maintenance");
  }

  WebElement getWorkflowSetupTablesButton(){
    return driver.findElementByAccessibilityId("Workflow Setup Tables");
  }

  WebElement getInitializeDatabaseButton(){
    return driver.findElementByAccessibilityId("Initialize Database");
  }

  WebElement getAccountsPayableButton(){
    return driver.findElementByAccessibilityId("Accounts Payable");
  }

}
