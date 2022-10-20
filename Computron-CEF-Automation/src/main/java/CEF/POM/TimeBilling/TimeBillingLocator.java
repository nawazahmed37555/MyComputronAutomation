package CEF.POM.TimeBilling;

import CEF.Base.LocatorBase;
import io.appium.java_client.windows.WindowsDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
@Slf4j
class TimeBillingLocator extends LocatorBase {
  TimeBillingLocator(WindowsDriver CrmDriver) {
    super(CrmDriver);
  }

  WebElement getCommonCodesMaintenancesButton(){
    return driver.findElementByAccessibilityId("Common Codes Maintenances");
  }

  WebElement getMasterFileCodesMaintButton(){
    return driver.findElementByAccessibilityId("Master File Codes Maint");
  }

  WebElement getMasterFileMaintenanceButton(){
    return driver.findElementByAccessibilityId("Master File Maintenance");
  }

  WebElement getTBBudgetMaintenanceButton(){
    return driver.findElementByAccessibilityId("TB Budget Maintenance");
  }

  WebElement getTBTransactionProcessingButton(){
    return driver.findElementByAccessibilityId("TB Transaction Processing");
  }

  WebElement getTBBillProcessingButton(){
    return driver.findElementByAccessibilityId("TB Bill Processing");
  }

  WebElement getTBZOOMInquiryButton(){
    return driver.findElementByAccessibilityId("TB ZOOM Inquiry");
  }

  WebElement getManagementReportsButton(){
    return driver.findElementByAccessibilityId("Management Reports");
  }

  WebElement getTBExternalInterfacesMenuButton(){
    return driver.findElementByAccessibilityId("TB External Interfaces Menu");
  }

  WebElement getTBSystemAdministratorButton(){
    return driver.findElementByAccessibilityId("TB System Administrator");
  }

  /*Level 2 menu locators*/

  WebElement getGeneralCodesMaintMenuButton(){
    return driver.findElementByAccessibilityId("General Codes Maint Menu");
  }

  WebElement getGeneralCodesInqListMenuButton(){
    return driver.findElementByAccessibilityId("General Codes Inq/List Menu");
  }

  WebElement getTransactionCodesMaintMenuButton(){
    return driver.findElementByAccessibilityId("Transaction Codes Maint Menu");
  }

  WebElement getTransactionCodesInqListButton(){
    return driver.findElementByAccessibilityId("Transaction Codes Inq/List");
  }

  WebElement getBillingCodesMaintMenuButton(){
    return driver.findElementByAccessibilityId("Billing Codes Maint Menu");
  }

  WebElement getBillingCodesInqListMenuButton(){
    return driver.findElementByAccessibilityId("Billing Codes Inq/List Menu");
  }

  WebElement getEmployeeCodesMaintMenuButton(){
    return driver.findElementByAccessibilityId("Employee Codes Maint Menu");
  }

  WebElement getEmployeeCodesInqListMenuButton(){
    return driver.findElementByAccessibilityId("Employee Codes Inq/List Menu");
  }

  WebElement getClientCodesMaintMenuButton(){
    return driver.findElementByAccessibilityId("Client Codes Maint Menu");
  }

  WebElement getClientCodesInqListMenuButton(){
    return driver.findElementByAccessibilityId("Client Codes Inq/List Menu");
  }

  WebElement getEngagementCodesMaintMenuButton(){
    return driver.findElementByAccessibilityId("Engagement Codes Maint Menu");
  }

  WebElement getEngageCodesInqListMenuButton(){
    return driver.findElementByAccessibilityId("Engage Codes Inq/List Menu");
  }

  WebElement getProjectCodesMaintMenuButton(){
    return driver.findElementByAccessibilityId("Project Codes Maint Menu");
  }

  WebElement getProjectCodesInqListMenuButton(){
    return driver.findElementByAccessibilityId("Project Codes Inq/List Menu");
  }

  WebElement getOfficeCodesMaintMenuButton(){
    return driver.findElementByAccessibilityId("Office Codes Maint Menu");
  }

  WebElement getOfficeCodesInqListMenuButton(){
    return driver.findElementByAccessibilityId("Office Codes  Inq/List Menu");
  }

  WebElement getTableRateSheetMaintMenuButton(){
    return driver.findElementByAccessibilityId("Table/Rate Sheet Maint Menu");
  }

  WebElement getTblRateSheetInqListMenuButton(){
    return driver.findElementByAccessibilityId("Tbl/Rate Sheet Inq/List Menu");
  }

  WebElement getApprTableCodesMaintMenuButton(){
    return driver.findElementByAccessibilityId("Appr Table Codes Maint Menu");
  }

  WebElement getApprTableCodesInqListButton(){
    return driver.findElementByAccessibilityId("Appr Table Codes Inq/List");
  }

  WebElement getEmployeeMasterMaintenanceButton(){
    return driver.findElementByAccessibilityId("Employee Master Maintenance");
  }

  WebElement getClientMasterMaintenanceButton(){
    return driver.findElementByAccessibilityId("Client Master Maintenance");
  }

  WebElement getOriginatingEmployeeMaintButton(){
    return driver.findElementByAccessibilityId("Originating Employee Maint");
  }

  WebElement getSpecialTablesMaintenanceButton(){
    return driver.findElementByAccessibilityId("Special Tables Maintenance");
  }

  WebElement getMailToMaintenanceButton(){
    return driver.findElementByAccessibilityId("Mail-To Maintenance");
  }

  WebElement getBudgetDataCategoryButton(){
    return driver.findElementByAccessibilityId("Budget Data Category");
  }

  WebElement getBudgetDataCatgryInqListButton(){
    return driver.findElementByAccessibilityId("Budget Data Catgry Inq/List");
  }

  WebElement getBudgetRecordTypeButton(){
    return driver.findElementByAccessibilityId("Budget Record Type");
  }

  WebElement getBudgetRecordTypeInqListButton(){
    return driver.findElementByAccessibilityId("Budget Record Type Inq/List");
  }

  WebElement getBudgetMaintbyProjAliasButton(){
    return driver.findElementByAccessibilityId("Budget Maint by Proj Alias");
  }

  WebElement getBudgetMaintbyEngageAliasButton(){
    return driver.findElementByAccessibilityId("Budget Maint by Engage Alias");
  }

  WebElement getBudgetMaintbyClientButton(){
    return driver.findElementByAccessibilityId("Budget Maint by Client");
  }

  WebElement getBudgetMaintbyEmployeeButton(){
    return driver.findElementByAccessibilityId("Budget Maint by Employee");
  }

  WebElement getTimeandExpenseEntryButton(){
    return driver.findElementByAccessibilityId("Time and Expense Entry");
  }

  WebElement getBatchTimeExpenseInquiryButton(){
    return driver.findElementByAccessibilityId("Batch Time/Expense Inquiry");
  }

  WebElement getBatchTimeEditReportButton(){
    return driver.findElementByAccessibilityId("Batch Time Edit Report");
  }

  WebElement getBatchExpensesEditReportButton(){
    return driver.findElementByAccessibilityId("Batch Expenses Edit Report");
  }

  WebElement getUpdateTransactionstoWIPButton(){
    return driver.findElementByAccessibilityId("Update Transactions to WIP");
  }

  WebElement getWorkinProgressInquiryButton(){
    return driver.findElementByAccessibilityId("Work in Progress Inquiry");
  }

  WebElement getWorkinProgressEditButton(){
    return driver.findElementByAccessibilityId("Work in Progress Edit");
  }

  WebElement getOverheadUpdatetoHistoryButton(){
    return driver.findElementByAccessibilityId("Overhead Update to History");
  }

  WebElement getRelieveTransAuditRecordsButton(){
    return driver.findElementByAccessibilityId("Relieve Trans Audit Records");
  }

  WebElement getNetAndSTDRatesRevaluationButton(){
    return driver.findElementByAccessibilityId("Net & STD Rates Revaluation");
  }

  WebElement getRatesRevaluationButton(){
    return driver.findElementByAccessibilityId("Rates Revaluation");
  }

  WebElement getAdjTimeAndExpenseEntryButton(){
    return driver.findElementByAccessibilityId("Adj Time & Expense Entry");
  }

  WebElement getWoffsDeletesOverheadsButton(){
    return driver.findElementByAccessibilityId("Woffs/Deletes/Overheads");
  }

  WebElement getBillingSelectionButton(){
    return driver.findElementByAccessibilityId("Billing Selection");
  }

  WebElement getBillMemoReportsMenuButton(){
    return driver.findElementByAccessibilityId("Bill Memo Reports Menu");
  }

  WebElement getCustomBMSTDClassRatesButton(){
    return driver.findElementByAccessibilityId("Custom B-M: STD Class Rates");
  }

  WebElement getOpenBillMemosInquiryButton(){
    return driver.findElementByAccessibilityId("Open Bill Memos Inquiry");
  }

  WebElement getOpenBillMemosEditButton(){
    return driver.findElementByAccessibilityId("Open Bill Memos Edit");
  }

  WebElement getReleaseMemostoBillingButton(){
    return driver.findElementByAccessibilityId("Release Memos to Billing");
  }

  WebElement getBillMemoMaintenanceButton(){
    return driver.findElementByAccessibilityId("Bill Memo Maintenance");
  }

  WebElement getInvoiceUpdateButton(){
    return driver.findElementByAccessibilityId("Invoice Update");
  }

  WebElement getPartiallyUpdatedInvoicesButton(){
    return driver.findElementByAccessibilityId("Partially Updated Invoices");
  }

  WebElement getRptsFollowingInvoiceUpdButton(){
    return driver.findElementByAccessibilityId("Rpts Following Invoice Upd");
  }

  WebElement getReinstateInvoiceButton(){
    return driver.findElementByAccessibilityId("Reinstate Invoice");
  }

  WebElement getRetroBillMemosProcessButton(){
    return driver.findElementByAccessibilityId("Retro Bill Memos Process");
  }

  WebElement getTBAdditionalProcessingMenuButton(){
    return driver.findElementByAccessibilityId("TB Additional Processing Menu");
  }

  WebElement getResetProcessingMenuButton(){
    return driver.findElementByAccessibilityId("Reset Processing Menu");
  }

  WebElement getTimeBillingSystemZoomButton(){
    return driver.findElementByAccessibilityId("Time Billing System Zoom");
  }

  WebElement getTBZoomSingleOptionButton(){
    return driver.findElementByAccessibilityId("TB Zoom - Single Option");
  }

  WebElement getTimeAndExpZoombyEmployeeButton(){
    return driver.findElementByAccessibilityId("Time & Exp Zoom by Employee");
  }

  WebElement getTimeAndExpZoomEmpArchiveButton(){
    return driver.findElementByAccessibilityId("Time & Exp Zoom Emp Archive");
  }

  WebElement getTimeAndExpZoombyClientButton(){
    return driver.findElementByAccessibilityId("Time & Exp Zoom by Client");
  }

  WebElement getTimeAndExpZoomClientArchiveButton(){
    return driver.findElementByAccessibilityId("Time & Exp Zoom Client Archive");
  }

  WebElement getTimeAndExpZoombyBothEmpClButton(){
    return driver.findElementByAccessibilityId("Time & Exp Zoom by Both Emp/Cl");
  }

  WebElement getTimeAndExpZoomClEmpArchiveButton(){
    return driver.findElementByAccessibilityId("Time & Exp Zoom Cl/Emp Archive");
  }

  WebElement getManagementReportsMenu1Button(){
    return driver.findElementByAccessibilityId("Management Reports Menu 1");
  }

  WebElement getManagementReportsMenu2Button(){
    return driver.findElementByAccessibilityId("Management Reports Menu 2");
  }

  WebElement getManagementReportsMenu3Button(){
    return driver.findElementByAccessibilityId("Management Reports Menu 3");
  }

  WebElement getManagementRpts4EMPREVHButton(){
    return driver.findElementByAccessibilityId("Management Rpts 4 (EMPREVH)");
  }

  WebElement getExpensesBilledReportButton(){
    return driver.findElementByAccessibilityId("Expenses Billed Report");
  }

  WebElement getJobCostReportsButton(){
    return driver.findElementByAccessibilityId("Job Cost Reports");
  }

  WebElement getWOFFReportbyReasonCodeButton(){
    return driver.findElementByAccessibilityId("WOFF Report by Reason Code");
  }

  WebElement getTEAMtoARReconciliationButton(){
    return driver.findElementByAccessibilityId("TEAM to AR Reconciliation");
  }

  WebElement getTEAMtoTEAMReconciliationButton(){
    return driver.findElementByAccessibilityId("TEAM to TEAM Reconciliation");
  }

  WebElement getEmployeeTimeRecordedButton(){
    return driver.findElementByAccessibilityId("Employee Time Recorded");
  }

  WebElement getMissingTimeReportsButton(){
    return driver.findElementByAccessibilityId("Missing Time Reports");
  }

  WebElement getTIMEDRMenutempButton(){
    return driver.findElementByAccessibilityId("TIMEDR Menu  (temp)");
  }

  WebElement getAgedWIPReportButton(){
    return driver.findElementByAccessibilityId("Aged WIP Report");
  }

  WebElement getGENEXDatatoTEAMMenuButton(){
    return driver.findElementByAccessibilityId("GENEX Data to TEAM Menu");
  }

  WebElement getSuspenseFilesMaintenanceButton(){
    return driver.findElementByAccessibilityId("Suspense Files Maintenance");
  }

  WebElement getInterfacefromAPButton(){
    return driver.findElementByAccessibilityId("Interface from AP");
  }

  WebElement getUpdateInvcBatchtoARButton(){
    return driver.findElementByAccessibilityId("Update Invc Batch to AR");
  }

  WebElement getInterfacetoAPButton(){
    return driver.findElementByAccessibilityId("Interface to AP");
  }

  WebElement getGlobalParametersMaintListButton(){
    return driver.findElementByAccessibilityId("Global Parameters Maint/List");
  }

  WebElement getOfficeMaintenanceMenuButton(){
    return driver.findElementByAccessibilityId("Office Maintenance Menu");
  }

  WebElement getTBAlternateKeyMaintenanceButton(){
    return driver.findElementByAccessibilityId("TB Alternate Key Maintenance");
  }

  WebElement getClearLockedRecordsButton(){
    return driver.findElementByAccessibilityId("Clear Locked Records");
  }

  WebElement getOwnerCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Owner Code Maintenance");
  }

  WebElement getOwnerCodeInqListButton(){
    return driver.findElementByAccessibilityId("Owner Code Inq/List");
  }

  WebElement getUserProfileMaintenanceButton(){
    return driver.findElementByAccessibilityId("User Profile Maintenance");
  }

  WebElement getUserProfileInqListButton(){
    return driver.findElementByAccessibilityId("User Profile Inq/List");
  }

  WebElement getGLInterfaceParametersMenuButton(){
    return driver.findElementByAccessibilityId("GL Interface Parameters Menu");
  }

  WebElement getForeignGLInterfaceParameterButton(){
    return driver.findElementByAccessibilityId("Foreign GL Interface Parameter");
  }

  WebElement getTBMiscellaneousButton(){
    return driver.findElementByAccessibilityId("TB Miscellaneous");
  }

  WebElement getPurgeRecordsButton(){
    return driver.findElementByAccessibilityId("Purge Records");
  }

  WebElement getEPICinTEAMButton(){
    return driver.findElementByAccessibilityId("EPIC in TEAM");
  }

  WebElement getUniversalUtilitiesButton(){
    return driver.findElementByAccessibilityId("Universal Utilities");
  }

  /*Level 3 menu locator*/

  WebElement getEmployeeLevelCodeButton(){
    return driver.findElementByAccessibilityId("Employee Level Code");
  }

  WebElement getEmployeeGroupCodeButton(){
    return driver.findElementByAccessibilityId("Employee Group Code");
  }

  WebElement getEmployeeClassCodeButton(){
    return driver.findElementByAccessibilityId("Employee Class Code");
  }

  WebElement getClassificationCombinationsButton(){
    return driver.findElementByAccessibilityId("Classification Combinations");
  }

  WebElement getEmployeeTypeCodeButton(){
    return driver.findElementByAccessibilityId("Employee Type Code");
  }

  WebElement getEmplMiscellaneousCode1Button(){
    return driver.findElementByAccessibilityId("Empl Miscellaneous Code 1");
  }

  WebElement getEmplMiscellaneousCode2Button(){
    return driver.findElementByAccessibilityId("Empl Miscellaneous Code 2");
  }

  WebElement getEmplMiscellaneousCode3Button(){
    return driver.findElementByAccessibilityId("Empl Miscellaneous Code 3");
  }

  WebElement getEmplMiscellaneousCode4Button(){
    return driver.findElementByAccessibilityId("Empl Miscellaneous Code 4");
  }

  WebElement getHireSourceCodeButton(){
    return driver.findElementByAccessibilityId("Hire Source Code");
  }

  WebElement getTerminationReasonCodeButton(){
    return driver.findElementByAccessibilityId("Termination Reason Code");
  }

  WebElement getEEOCodeButton(){
    return driver.findElementByAccessibilityId("EEO  Code");
  }

  WebElement getEmployeeLevelCodeInqListButton(){
    return driver.findElementByAccessibilityId("Employee Level Code Inq/List");
  }

  WebElement getEmployeeGroupCodeInqListButton(){
    return driver.findElementByAccessibilityId("Employee Group Code Inq/List");
  }

  WebElement getEmployeeClassCodeInqListButton(){
    return driver.findElementByAccessibilityId("Employee Class Code Inq/List");
  }

  WebElement getEmplClassificationsInqListButton(){
    return driver.findElementByAccessibilityId("Empl Classifications Inq/List");
  }

  WebElement getHireSourceCodeInqListButton(){
    return driver.findElementByAccessibilityId("Hire Source Code Inq/List");
  }

  WebElement getTermReasonCodeInqListButton(){
    return driver.findElementByAccessibilityId("Term. Reason Code Inq/List");
  }

  WebElement getEEOCodeInqListButton(){
    return driver.findElementByAccessibilityId("EEO Code Inq/List");
  }

  WebElement getEmployeeTypeCodeInqButton(){
    return driver.findElementByAccessibilityId("Employee Type Code Inq");
  }

  WebElement getEmployeeTypeCodeListButton(){
    return driver.findElementByAccessibilityId("Employee Type Code List");
  }

  WebElement getEmplMiscCode1InqListButton(){
    return driver.findElementByAccessibilityId("Empl Misc Code 1 Inq/List");
  }

  WebElement getEmplMiscCode2InqListButton(){
    return driver.findElementByAccessibilityId("Empl Misc Code 2 Inq/List");
  }

  WebElement getEmplMiscCode3InqListButton(){
    return driver.findElementByAccessibilityId("Empl Misc Code 3 Inq/List");
  }

  WebElement getEmplMiscCode4InqListButton(){
    return driver.findElementByAccessibilityId("Empl Misc Code 4 Inq/List");
  }

  WebElement getParentIDCodeButton(){
    return driver.findElementByAccessibilityId("Parent ID Code");
  }

  WebElement getIndustryCode1Button(){
    return driver.findElementByAccessibilityId("Industry Code 1");
  }

  WebElement getIndustryCode2Button(){
    return driver.findElementByAccessibilityId("Industry Code 2");
  }

  WebElement getIndustryCode3Button(){
    return driver.findElementByAccessibilityId("Industry Code 3");
  }

  WebElement getIndustryCode4Button(){
    return driver.findElementByAccessibilityId("Industry Code 4");
  }

  WebElement getClientEntityDescriptionButton(){
    return driver.findElementByAccessibilityId("Client Entity Description");
  }

  WebElement getClientMiscellaneousCode1Button(){
    return driver.findElementByAccessibilityId("Client Miscellaneous Code 1");
  }

  WebElement getClientMiscellaneousCode2Button(){
    return driver.findElementByAccessibilityId("Client Miscellaneous Code 2");
  }

  WebElement getClientMiscellaneousCode3Button(){
    return driver.findElementByAccessibilityId("Client Miscellaneous Code 3");
  }

  WebElement getClientMiscellaneousCode4Button(){
    return driver.findElementByAccessibilityId("Client Miscellaneous Code 4");
  }

  WebElement getClientMiscellaneousCode5Button(){
    return driver.findElementByAccessibilityId("Client Miscellaneous Code 5");
  }

  WebElement getClientResponsibleEmpCodesButton(){
    return driver.findElementByAccessibilityId("Client Responsible Emp Codes");
  }

  WebElement getParentIDCodeInqListButton(){
    return driver.findElementByAccessibilityId("Parent ID Code Inq/List");
  }

  WebElement getIndustryCode1InqListButton(){
    return driver.findElementByAccessibilityId("Industry Code 1 Inq/List");
  }

  WebElement getIndustryCode2InqListButton(){
    return driver.findElementByAccessibilityId("Industry Code 2 Inq/List");
  }

  WebElement getIndustryCode3InqListButton(){
    return driver.findElementByAccessibilityId("Industry Code 3 Inq/List");
  }

  WebElement getIndustryCode4InqListButton(){
    return driver.findElementByAccessibilityId("Industry Code 4 Inq/List");
  }

  WebElement getClientEntityDescrInqListButton(){
    return driver.findElementByAccessibilityId("Client Entity Descr Inq/List");
  }

  WebElement getClientMiscCode1InqListButton(){
    return driver.findElementByAccessibilityId("Client Misc Code 1 Inq/List");
  }

  WebElement getClientMiscCode2InqListButton(){
    return driver.findElementByAccessibilityId("Client Misc Code 2 Inq/List");
  }

  WebElement getClientMiscCode3InqListButton(){
    return driver.findElementByAccessibilityId("Client Misc Code 3 Inq/List");
  }

  WebElement getClientMiscCode4InqListButton(){
    return driver.findElementByAccessibilityId("Client Misc Code 4 Inq/List");
  }

  WebElement getClientMiscCode5InqListButton(){
    return driver.findElementByAccessibilityId("Client Misc Code 5 Inq/List");
  }

  WebElement getClientResponsibleEmpILButton(){
    return driver.findElementByAccessibilityId("Client Responsible Emp I/L");
  }

  WebElement getEngageCategoryCodeButton(){
    return driver.findElementByAccessibilityId("Engage Category Code");
  }

  WebElement getEngageSubcategoryCodeButton(){
    return driver.findElementByAccessibilityId("Engage Subcategory Code");
  }

  WebElement getEngagementTypeCodeButton(){
    return driver.findElementByAccessibilityId("Engagement Type Code");
  }

  WebElement getEngagementCodeButton(){
    return driver.findElementByAccessibilityId("Engagement Code");
  }

  WebElement getEngageMiscellaneousCode1Button(){
    return driver.findElementByAccessibilityId("Engage Miscellaneous Code 1");
  }

  WebElement getEngageMiscellaneousCode2Button(){
    return driver.findElementByAccessibilityId("Engage Miscellaneous Code 2");
  }

  WebElement getEngageMiscellaneousCode3Button(){
    return driver.findElementByAccessibilityId("Engage Miscellaneous Code 3");
  }

  WebElement getEngageMiscellaneousCode4Button(){
    return driver.findElementByAccessibilityId("Engage Miscellaneous Code 4");
  }

  WebElement getEngageMiscellaneousCode5Button(){
    return driver.findElementByAccessibilityId("Engage Miscellaneous Code 5");
  }

  WebElement getEngageResponsibleEmpCodesButton(){
    return driver.findElementByAccessibilityId("Engage Responsible Emp Codes");
  }

  WebElement getEngageCategoryCodeInqListButton(){
    return driver.findElementByAccessibilityId("Engage Category Code Inq/List");
  }

  WebElement getEngageSubcatCodeInqListButton(){
    return driver.findElementByAccessibilityId("Engage Subcat Code Inq/List");
  }

  WebElement getEngagementTypeCodeInqListButton(){
    return driver.findElementByAccessibilityId("Engagement Type Code Inq/List");
  }

  WebElement getEngagementCodeInqListButton(){
    return driver.findElementByAccessibilityId("Engagement Code Inq/List");
  }

  WebElement getEngageMiscCode1InqListButton(){
    return driver.findElementByAccessibilityId("Engage Misc Code 1 Inq/List");
  }

  WebElement getEngageMiscCode2InqListButton(){
    return driver.findElementByAccessibilityId("Engage Misc Code 2 Inq/List");
  }

  WebElement getEngageMiscCode3InqListButton(){
    return driver.findElementByAccessibilityId("Engage Misc Code 3 Inq/List");
  }

  WebElement getEngageMiscCode4InqListButton(){
    return driver.findElementByAccessibilityId("Engage Misc Code 4 Inq/List");
  }

  WebElement getEngageMiscCode5InqListButton(){
    return driver.findElementByAccessibilityId("Engage Misc Code 5 Inq/List");
  }

  WebElement getEngageRespEmpCodesInqListButton(){
    return driver.findElementByAccessibilityId("Engage Resp Emp Codes Inq/List");
  }

  WebElement getProjectCategoryCodeButton(){
    return driver.findElementByAccessibilityId("Project Category Code");
  }

  WebElement getProjectSubcategoryCodeButton(){
    return driver.findElementByAccessibilityId("Project Subcategory Code");
  }

  WebElement getProjectCodeButton(){
    return driver.findElementByAccessibilityId("Project Code");
  }

  WebElement getProjectMiscellaneousCode1Button(){
    return driver.findElementByAccessibilityId("Project Miscellaneous Code 1");
  }

  WebElement getProjectMiscellaneousCode2Button(){
    return driver.findElementByAccessibilityId("Project Miscellaneous Code 2");
  }

  WebElement getProjectMiscellaneousCode3Button(){
    return driver.findElementByAccessibilityId("Project Miscellaneous Code 3");
  }

  WebElement getProjectResponsibleEmpCodesButton(){
    return driver.findElementByAccessibilityId("Project Responsible Emp Codes");
  }

  WebElement getProjectCategoryCodeInqListButton(){
    return driver.findElementByAccessibilityId("Project Category Code Inq/List");
  }

  WebElement getProjectSubcatCodeInqListButton(){
    return driver.findElementByAccessibilityId("Project Subcat Code Inq/List");
  }

  WebElement getProjectCodeInqListButton(){
    return driver.findElementByAccessibilityId("Project Code Inq/List");
  }

  WebElement getProjectMiscCode1InqListButton(){
    return driver.findElementByAccessibilityId("Project Misc Code 1 Inq/List");
  }

  WebElement getProjectMiscCode2InqListButton(){
    return driver.findElementByAccessibilityId("Project Misc Code 2 Inq/List");
  }

  WebElement getProjectMiscCode3InqListButton(){
    return driver.findElementByAccessibilityId("Project Misc Code 3 Inq/List");
  }

  WebElement getProjectResponsibleEmpILButton(){
    return driver.findElementByAccessibilityId("Project Responsible Emp I/L");
  }

  WebElement getOfficeMiscellaneousCode1Button(){
    return driver.findElementByAccessibilityId("Office Miscellaneous Code 1");
  }

  WebElement getOfficeMiscellaneousCode2Button(){
    return driver.findElementByAccessibilityId("Office Miscellaneous Code 2");
  }

  WebElement getOfficeMiscellaneousCode3Button(){
    return driver.findElementByAccessibilityId("Office Miscellaneous Code 3");
  }

  WebElement getOfficeMiscellaneousCode4Button(){
    return driver.findElementByAccessibilityId("Office Miscellaneous Code 4");
  }

  WebElement getOfficeMiscCode1InqListButton(){
    return driver.findElementByAccessibilityId("Office Misc Code 1 Inq/List");
  }

  WebElement getOfficeMiscCode2InqListButton(){
    return driver.findElementByAccessibilityId("Office Misc Code 2 Inq/List");
  }

  WebElement getOfficeMiscCode3InqListButton(){
    return driver.findElementByAccessibilityId("Office Misc Code 3 Inq/List");
  }

  WebElement getOfficeMiscCode4InqListButton(){
    return driver.findElementByAccessibilityId("Office Misc Code 4 Inq/List");
  }

  WebElement getExpensesProfileIDButton(){
    return driver.findElementByAccessibilityId("Expenses Profile ID");
  }

  WebElement getServicesProfileIDButton(){
    return driver.findElementByAccessibilityId("Services Profile ID");
  }

  WebElement getRateSheetTableButton(){
    return driver.findElementByAccessibilityId("Rate Sheet Table");
  }

  WebElement getExpensesProfileIDInqListButton(){
    return driver.findElementByAccessibilityId("Expenses Profile ID Inq/List");
  }

  WebElement getServicesProfileIDInqListButton(){
    return driver.findElementByAccessibilityId("Services Profile ID Inq/List");
  }

  WebElement getRateSheetIDInqListButton(){
    return driver.findElementByAccessibilityId("Rate Sheet ID Inq/List");
  }

  WebElement getApprtablMiscellaneousCode1Button(){
    return driver.findElementByAccessibilityId("Apprtabl Miscellaneous Code 1");
  }

  WebElement getApprtablMiscellaneousCode2Button(){
    return driver.findElementByAccessibilityId("Apprtabl Miscellaneous Code 2");
  }

  WebElement getApprtablMiscellaneousCode3Button(){
    return driver.findElementByAccessibilityId("Apprtabl Miscellaneous Code 3");
  }

  WebElement getApprtablMiscellaneousCode4Button(){
    return driver.findElementByAccessibilityId("Apprtabl Miscellaneous Code 4");
  }

  WebElement getApprtablMiscCode1InqListButton(){
    return driver.findElementByAccessibilityId("Apprtabl Misc Code 1 Inq/List");
  }

  WebElement getApprtablMiscCode2InqListButton(){
    return driver.findElementByAccessibilityId("Apprtabl Misc Code 2 Inq/List");
  }

  WebElement getApprtablMiscCode3InqListButton(){
    return driver.findElementByAccessibilityId("Apprtabl Misc Code 3 Inq/List");
  }

  WebElement getApprtablMiscCode4InqListButton(){
    return driver.findElementByAccessibilityId("Apprtabl Misc Code 4 Inq/List");
  }


}
