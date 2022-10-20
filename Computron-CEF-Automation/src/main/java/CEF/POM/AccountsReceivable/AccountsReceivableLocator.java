package CEF.POM.AccountsReceivable;

import CEF.Base.LocatorBase;
import io.appium.java_client.windows.WindowsDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
@Slf4j
class AccountsReceivableLocator extends LocatorBase {

  WebElement getARSystemParametersButton(){
    return driver.findElementByAccessibilityId("AR System Parameters");
  }

  WebElement getCodesMaintenanceButton(){
    return driver.findElementByAccessibilityId("Codes Maintenance");
  }

  WebElement getCustomerMaintenanceButton(){
    return driver.findElementByAccessibilityId("Customer Maintenance");
  }

  WebElement getARTransactionEntryButton(){
    return driver.findElementByAccessibilityId("AR Transaction Entry");
  }

  WebElement getARTransactionProcessingButton(){
    return driver.findElementByAccessibilityId("AR Transaction Processing");
  }

  WebElement getCashManagementButton(){
    return driver.findElementByAccessibilityId("Cash Management");
  }

  WebElement getAccountsReceivableReportsButton(){
    return driver.findElementByAccessibilityId("Accounts Receivable Reports");
  }

  WebElement getARZoomInquiryButton(){
    return driver.findElementByAccessibilityId("AR Zoom Inquiry");
  }

  WebElement getARGENEXExternalInterfacesButton(){
    return driver.findElementByAccessibilityId("AR GENEX - External Interfaces");
  }

  WebElement getARSystemAdministratorButton(){
    return driver.findElementByAccessibilityId("AR System Administrator");
  }

  WebElement getDirectInvoicingButton(){
    return driver.findElementByAccessibilityId("Direct Invoicing");
  }

  WebElement getCreditMgmtPortalParametersButton(){
    return driver.findElementByAccessibilityId("Credit Mgmt Portal Parameters");
  }

  WebElement getARCompanyParameterMaintButton(){
    return driver.findElementByAccessibilityId("AR Company Parameter Maint");
  }

  WebElement getARParameterInquiryListButton(){
    return driver.findElementByAccessibilityId("AR Parameter Inquiry/List");
  }

  WebElement getAccountTypeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Account Type Maintenance");
  }

  WebElement getAccountTypeInqListButton(){
    return driver.findElementByAccessibilityId("Account Type Inq/List");
  }

  WebElement getAccountMaintenanceButton(){
    return driver.findElementByAccessibilityId("Account Maintenance");
  }

  WebElement getAccountInqListButton(){
    return driver.findElementByAccessibilityId("Account Inq/List");
  }

  WebElement getARBankAccountMaintenanceButton(){
    return driver.findElementByAccessibilityId("AR Bank Account Maintenance");
  }

  WebElement getARBankAccountListButton(){
    return driver.findElementByAccessibilityId("AR Bank Account List");
  }

  WebElement getUsageFlagMaintenanceButton(){
    return driver.findElementByAccessibilityId("Usage Flag Maintenance");
  }

  WebElement getUsageFlagInqListButton(){
    return driver.findElementByAccessibilityId("Usage Flag Inq/List");
  }

  WebElement getTransactionControlMaintButton(){
    return driver.findElementByAccessibilityId("Transaction Control Maint");
  }

  WebElement getTransControlInqListButton(){
    return driver.findElementByAccessibilityId("Trans Control Inq/List");
  }

  WebElement getARAutoBalanceMaintenanceButton(){
    return driver.findElementByAccessibilityId("AR Auto-Balance Maintenance");
  }

  WebElement getAutomaticCashMethodMaintButton(){
    return driver.findElementByAccessibilityId("Automatic Cash Method Maint");
  }

  WebElement getEmployeeCodesMaintButton(){
    return driver.findElementByAccessibilityId("Employee Codes Maint");
  }

  WebElement getCustomerCodesIButton(){
    return driver.findElementByAccessibilityId("Customer Codes I");
  }

  WebElement getCustomerCodesIIButton(){
    return driver.findElementByAccessibilityId("Customer Codes II");
  }

  WebElement getCustomerCodesIIIButton(){
    return driver.findElementByAccessibilityId("Customer Codes III");
  }

  WebElement getItemCodesIButton(){
    return driver.findElementByAccessibilityId("Item Codes I");
  }

  WebElement getItemCodesIIButton(){
    return driver.findElementByAccessibilityId("Item Codes II");
  }

  WebElement getPaymentCodesIButton(){
    return driver.findElementByAccessibilityId("Payment Codes I");
  }

  WebElement getPaymentCodesIIButton(){
    return driver.findElementByAccessibilityId("Payment Codes II");
  }

  WebElement getCashManagementSetupIButton(){
    return driver.findElementByAccessibilityId("Cash Management Setup I");
  }

  WebElement getCashManagementSetupIIButton(){
    return driver.findElementByAccessibilityId("Cash Management Setup II");
  }

  WebElement getCorporateKeyMaintenanceButton(){
    return driver.findElementByAccessibilityId("Corporate Key Maintenance");
  }

  WebElement getMassCustomerMaintenanceButton(){
    return driver.findElementByAccessibilityId("Mass Customer Maintenance");
  }

  WebElement getMasterFileDetailListButton(){
    return driver.findElementByAccessibilityId("Master File Detail List");
  }

  WebElement getMasterFileAlphaListButton(){
    return driver.findElementByAccessibilityId("Master File Alpha List");
  }

  WebElement getMasterFileSummaryListButton(){
    return driver.findElementByAccessibilityId("Master File Summary List");
  }

  WebElement getCustCommentsMaintenanceButton(){
    return driver.findElementByAccessibilityId("Cust/Comments Maintenance");
  }

  WebElement getCallBackQueueMenuButton(){
    return driver.findElementByAccessibilityId("Call Back Queue Menu");
  }

  WebElement getAddressMaintenanceButton(){
    return driver.findElementByAccessibilityId("Address Maintenance");
  }

  WebElement getBatchControlMaintenanceButton(){
    return driver.findElementByAccessibilityId("Batch Control Maintenance");
  }

  WebElement getOpenItemEntryButton(){
    return driver.findElementByAccessibilityId("Open Item Entry");
  }

  WebElement getQuickItemEntryButton(){
    return driver.findElementByAccessibilityId("Quick Item Entry");
  }

  WebElement getOpenItemChangeButton(){
    return driver.findElementByAccessibilityId("Open Item Change");
  }

  WebElement getMassItemChangeButton(){
    return driver.findElementByAccessibilityId("Mass Item Change");
  }

  WebElement getTransferReverseDeleteButton(){
    return driver.findElementByAccessibilityId("Transfer/Reverse/Delete");
  }

  WebElement getMassOpenItemTransferButton(){
    return driver.findElementByAccessibilityId("Mass Open Item Transfer");
  }

  WebElement getAdjustmentItemMaintenanceButton(){
    return driver.findElementByAccessibilityId("Adjustment Item Maintenance");
  }

  WebElement getAdjustmentProcessEditButton(){
    return driver.findElementByAccessibilityId("Adjustment Process (Edit)");
  }

  WebElement getAdjustmentProcessButton(){
    return driver.findElementByAccessibilityId("Adjustment Process");
  }

  WebElement getMiscellaneousJournalEntryButton(){
    return driver.findElementByAccessibilityId("Miscellaneous Journal Entry");
  }

  WebElement getRecurringItemMaintenanceButton(){
    return driver.findElementByAccessibilityId("Recurring Item Maintenance");
  }

  WebElement getRecurringItemInqListButton(){
    return driver.findElementByAccessibilityId("Recurring Item Inq/List");
  }

  WebElement getRecurringItemProcessButton(){
    return driver.findElementByAccessibilityId("Recurring Item Process");
  }

  WebElement getBatchedTransactionsModuleButton(){
    return driver.findElementByAccessibilityId("Batched Transactions Module");
  }

  WebElement getARtoGLPostingEditButton(){
    return driver.findElementByAccessibilityId("AR to GL Posting (Edit)");
  }

  WebElement getARtoGLPostingUpdateButton(){
    return driver.findElementByAccessibilityId("AR to GL Posting (Update)");
  }

  WebElement getDunningLetterGenerationButton(){
    return driver.findElementByAccessibilityId("Dunning Letter Generation");
  }

  WebElement getARCurrencyRevaluationButton(){
    return driver.findElementByAccessibilityId("AR Currency Revaluation");
  }

  WebElement getFinanceChargeGenerationButton(){
    return driver.findElementByAccessibilityId("Finance Charge Generation");
  }

  WebElement getARStatementsMenuButton(){
    return driver.findElementByAccessibilityId("AR Statements Menu");
  }

  WebElement getCashBatchMaintenanceButton(){
    return driver.findElementByAccessibilityId("Cash Batch Maintenance");
  }

  WebElement getFastBatchPaymentsButton(){
    return driver.findElementByAccessibilityId("Fast Batch Payments");
  }

  WebElement getOnlinePaymentsButton(){
    return driver.findElementByAccessibilityId("Online Payments");
  }

  WebElement getVoidandReapplyPaymentsButton(){
    return driver.findElementByAccessibilityId("Void and Reapply Payments");
  }

  WebElement getARPaymentZoomButton(){
    return driver.findElementByAccessibilityId("AR Payment Zoom");
  }

  WebElement getAutomatedProcessesButton(){
    return driver.findElementByAccessibilityId("Automated Processes");
  }

  WebElement getCashDisbursementButton(){
    return driver.findElementByAccessibilityId("Cash Disbursement");
  }

  WebElement getAdHocWriteOffButton(){
    return driver.findElementByAccessibilityId("Ad Hoc Write Off");
  }

  WebElement getAdjustMiscellaneousCashButton(){
    return driver.findElementByAccessibilityId("Adjust Miscellaneous Cash");
  }

  WebElement getPaymentHistoryReportButton(){
    return driver.findElementByAccessibilityId("Payment History Report");
  }

  WebElement getCOAApplicationButton(){
    return driver.findElementByAccessibilityId("COA Application");
  }

  WebElement getARItemReportsButton(){
    return driver.findElementByAccessibilityId("A/R Item Reports");
  }

  WebElement getJournalDistAndOtherReportsButton(){
    return driver.findElementByAccessibilityId("Journal Dist & Other Reports");
  }

  WebElement getCustomerFileCreationButton(){
    return driver.findElementByAccessibilityId("Customer File Creation");
  }

  WebElement getCustomerContactsCreationButton(){
    return driver.findElementByAccessibilityId("Customer Contacts Creation");
  }

  WebElement getOpenItemCreationButton(){
    return driver.findElementByAccessibilityId("Open Item Creation");
  }

  WebElement getCallBackQueueCreationButton(){
    return driver.findElementByAccessibilityId("Call Back Queue Creation");
  }

  WebElement getCustomerAccountCreationButton(){
    return driver.findElementByAccessibilityId("Customer Account Creation");
  }

  WebElement getAddressCreationButton(){
    return driver.findElementByAccessibilityId("Address Creation");
  }

  WebElement getDownloadARItemDataButton(){
    return driver.findElementByAccessibilityId("Download AR Item Data");
  }

  WebElement getTradeTapeGenerationButton(){
    return driver.findElementByAccessibilityId("Trade Tape Generation");
  }

  WebElement getCustomerGENEXOutButton(){
    return driver.findElementByAccessibilityId("Customer GENEX-Out");
  }

  WebElement getARGlobalParametersMaintButton(){
    return driver.findElementByAccessibilityId("AR Global Parameters Maint");
  }

  WebElement getGlobalVariablesMaintButton(){
    return driver.findElementByAccessibilityId("Global Variables Maint");
  }

  WebElement getOwnershipCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Ownership Code Maintenance");
  }

  WebElement getOwnershipCodeInqListButton(){
    return driver.findElementByAccessibilityId("Ownership Code Inq/List");
  }

  WebElement getUserProfileSecurityButton(){
    return driver.findElementByAccessibilityId("User Profile Security");
  }

  WebElement getUserProfileInqListButton(){
    return driver.findElementByAccessibilityId("User Profile Inq/List");
  }

  WebElement getARAlternateKeyMaintenanceButton(){
    return driver.findElementByAccessibilityId("AR Alternate Key Maintenance");
  }

  WebElement getExternalTypeMaintenanceButton(){
    return driver.findElementByAccessibilityId("External Type Maintenance");
  }

  WebElement getARAndDIAuditReportsButton(){
    return driver.findElementByAccessibilityId("AR & DI Audit Reports");
  }

  WebElement getEPICinARMenuButton(){
    return driver.findElementByAccessibilityId("EPIC in AR Menu");
  }

  WebElement getARPurgeFunctionsMenuButton(){
    return driver.findElementByAccessibilityId("AR Purge Functions Menu");
  }

  WebElement getExternalItemKeyMaintButton(){
    return driver.findElementByAccessibilityId("External Item Key Maint");
  }

  WebElement getARFileMaintenanceMenuButton(){
    return driver.findElementByAccessibilityId("AR File Maintenance Menu");
  }

  WebElement getUniversalUtilitiesButton(){
    return driver.findElementByAccessibilityId("Universal Utilities");
  }

  WebElement getSubledgerMaintenanceButton(){
    return driver.findElementByAccessibilityId("Subledger Maintenance");
  }

  WebElement getSystemParametersButton(){
    return driver.findElementByAccessibilityId("System Parameters");
  }

  WebElement getInvoiceCodesMaintenanceButton(){
    return driver.findElementByAccessibilityId("Invoice Codes Maintenance");
  }

  WebElement getProductCodesMaintenanceButton(){
    return driver.findElementByAccessibilityId("Product Codes Maintenance");
  }

  WebElement getProductDealMaintenanceButton(){
    return driver.findElementByAccessibilityId("Product/Deal Maintenance");
  }

  WebElement getTransactionEntryButton(){
    return driver.findElementByAccessibilityId("Transaction Entry");
  }

  WebElement getTransactionProcessAndPostButton(){
    return driver.findElementByAccessibilityId("Transaction Process & Post");
  }

  WebElement getSalesAnalysisReportsButton(){
    return driver.findElementByAccessibilityId("Sales Analysis Reports");
  }

  WebElement getExternalInterfacesButton(){
    return driver.findElementByAccessibilityId("External Interfaces");
  }

  WebElement getZoomProcessingButton(){
    return driver.findElementByAccessibilityId("Zoom Processing");
  }

  WebElement getEPICReportMenuButton(){
    return driver.findElementByAccessibilityId("EPIC Report Menu");
  }

  WebElement getCreditMgmtGlobalParametersButton(){
    return driver.findElementByAccessibilityId("Credit Mgmt Global Parameters");
  }

  WebElement getCreditMgmtCompanyParametersButton(){
    return driver.findElementByAccessibilityId("Credit Mgmt Company Parameters");
  }

  WebElement getCollectorMaintenanceButton(){
    return driver.findElementByAccessibilityId("Collector Maintenance");
  }

  WebElement getEmployeeTypeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Employee Type Maintenance");
  }

  WebElement getEmployeeUserXRMaintenanceButton(){
    return driver.findElementByAccessibilityId("Employee/User XR Maintenance");
  }

  WebElement getCOAReasonCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("COA Reason Code Maintenance");
  }

  WebElement getItemStatusMaintenanceButton(){
    return driver.findElementByAccessibilityId("Item Status Maintenance");
  }

  WebElement getVoidReasonCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Void Reason Code Maintenance");
  }

  WebElement getTaskQueryActionsButton(){
    return driver.findElementByAccessibilityId("Task Query Actions");
  }

  WebElement getSystemCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("System Code Maintenance");
  }

  WebElement getDDLFacsMaintenanceButton(){
    return driver.findElementByAccessibilityId("DDL Facs Maintenance");
  }

  WebElement getFilterQueryMaintenanceButton(){
    return driver.findElementByAccessibilityId("Filter Query Maintenance");
  }

  WebElement getAutoResolveButton(){
    return driver.findElementByAccessibilityId("Auto Resolve");
  }

  WebElement getWorkflowMenuButton(){
    return driver.findElementByAccessibilityId("Workflow Menu");
  }


}
