package CEF.POM.AccountPayable;

import CEF.Base.LocatorBase;
import CEF.Base.TestBase;
import io.appium.java_client.windows.WindowsDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
@Slf4j
class AccountPayableLocator extends TestBase {

  AccountPayableLocator(WindowsDriver CrmDriver) {

  }


  WebElement getAPSystemParametersButton(){
    return driver.findElementByAccessibilityId("AP System Parameters");
  }

  WebElement getVendorCodesButton(){
    return driver.findElementByAccessibilityId("Vendor Codes");
  }

  WebElement getVoucherCodesButton(){
    return driver.findElementByAccessibilityId("Voucher Codes");
  }

  WebElement getPaymentAndMiscCodesButton(){
    return driver.findElementByAccessibilityId("Payment and Misc Codes");
  }

  WebElement getVendorAndFactorMaintButton(){
    return driver.findElementByAccessibilityId("Vendor and Factor Maint");
  }

  WebElement getAPTransactionProcessingButton(){
    return driver.findElementByAccessibilityId("AP Transaction Processing");
  }

  WebElement getPaymentPostingFunctionsButton(){
    return driver.findElementByAccessibilityId("Payment/Posting Functions");
  }

  WebElement getVoucherAndRegisterReportsButton(){
    return driver.findElementByAccessibilityId("Voucher & Register Reports");
  }

  WebElement getHistoryAndOtherReportsButton(){
    return driver.findElementByAccessibilityId("History and Other Reports");
  }

  WebElement getAPGENEXExternalInterfacesButton(){
    return driver.findElementByAccessibilityId("AP GENEX - External Interfaces");
  }

  WebElement getAPSystemAdministratorButton(){
    return driver.findElementByAccessibilityId("AP System Administrator");
  }

  WebElement getGSTMenuButton(){
    return driver.findElementByAccessibilityId("GST Menu");
  }

  /* Child report locators
   */

  WebElement getAPCompanyParametersMaintButton(){
    return driver.findElementByAccessibilityId("AP Company Parameters Maint");
  }

  WebElement getAccountTypeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Account Type Maintenance");
  }

  WebElement getAccountTypeInquiryListButton(){
    return driver.findElementByAccessibilityId("Account Type Inquiry/List");
  }

  WebElement getCompanyAccountsMaintenanceButton(){
    return driver.findElementByAccessibilityId("Company Accounts Maintenance");
  }

  WebElement getCompanyAccountsInqListButton(){
    return driver.findElementByAccessibilityId("Company Accounts Inq/List");
  }

  WebElement getAPBankAccountMaintenanceButton(){
    return driver.findElementByAccessibilityId("AP Bank Account Maintenance");
  }

  WebElement getBankRecordListButton(){
    return driver.findElementByAccessibilityId("Bank Record List");
  }

  WebElement getCurrencyDailyRatesMaintButton(){
    return driver.findElementByAccessibilityId("Currency Daily Rates Maint");
  }

  WebElement getCurrencyDailyRatesInqListButton(){
    return driver.findElementByAccessibilityId("Currency Daily Rates Inq/List");
  }

  WebElement getAutoBalanceMaintenanceMenuButton(){
    return driver.findElementByAccessibilityId("Auto Balance Maintenance Menu");
  }

  WebElement getPOVoucherTypeMaintenanceButton(){
    return driver.findElementByAccessibilityId("PO Voucher Type Maintenance");
  }

  WebElement getPOVoucherTypeInquiryListButton(){
    return driver.findElementByAccessibilityId("PO Voucher Type Inquiry/List");
  }

  WebElement getEmployeeCategoryMaintenanceButton(){
    return driver.findElementByAccessibilityId("Employee Category Maintenance");
  }

  WebElement getEmployeeCategoryInqListButton(){
    return driver.findElementByAccessibilityId("Employee Category Inq/List");
  }

  WebElement getVendorGroupMaintenanceButton(){
    return driver.findElementByAccessibilityId("Vendor Group Maintenance");
  }

  WebElement getVendorGroupInquiryListButton(){
    return driver.findElementByAccessibilityId("Vendor Group Inquiry/List");
  }

  WebElement getVendorCategoryMaintenanceButton(){
    return driver.findElementByAccessibilityId("Vendor Category Maintenance");
  }

  WebElement getVendorCategoryInqListButton(){
    return driver.findElementByAccessibilityId("Vendor Category Inq/List");
  }

  WebElement getVendorSubCategoryMaintButton(){
    return driver.findElementByAccessibilityId("Vendor Sub-Category Maint");
  }

  WebElement getVendSubCategoryInqListButton(){
    return driver.findElementByAccessibilityId("Vend Sub-Category Inq/List");
  }

  WebElement getStateCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("State Code Maintenance");
  }

  WebElement getStateCodeInquiryListButton(){
    return driver.findElementByAccessibilityId("State Code Inquiry/List");
  }

  WebElement getAPCountryCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("AP Country Code Maintenance");
  }

  WebElement getAPCountryCodeInquiryListButton(){
    return driver.findElementByAccessibilityId("AP Country Code Inquiry/List");
  }

  WebElement getUserVendorXrefMaintInqButton(){
    return driver.findElementByAccessibilityId("User/Vendor Xref Maint/Inq");
  }

  WebElement getVoucherCategoryMaintenanceButton(){
    return driver.findElementByAccessibilityId("Voucher Category Maintenance");
  }

  WebElement getVoucherCategoryInqListButton(){
    return driver.findElementByAccessibilityId("Voucher Category Inq/List");
  }

  WebElement getVoucherSubCategoryMaintButton(){
    return driver.findElementByAccessibilityId("Voucher Sub-Category Maint");
  }

  WebElement getVouSubCategoryInqListButton(){
    return driver.findElementByAccessibilityId("Vou Sub-Category Inq/List");
  }

  WebElement getVoucherMiscField1MaintButton(){
    return driver.findElementByAccessibilityId("Voucher Misc Field 1 Maint");
  }

  WebElement getVoucherMiscField1InqListButton(){
    return driver.findElementByAccessibilityId("Voucher Misc Field 1 Inq/List");
  }

  WebElement getVoucherMiscField2MaintButton(){
    return driver.findElementByAccessibilityId("Voucher Misc Field 2 Maint");
  }

  WebElement getVoucherMiscField2InqListButton(){
    return driver.findElementByAccessibilityId("Voucher Misc Field 2 Inq/List");
  }

  WebElement getVoucherMiscField3MaintButton(){
    return driver.findElementByAccessibilityId("Voucher Misc Field 3 Maint");
  }

  WebElement getVoucherMiscField3InqListButton(){
    return driver.findElementByAccessibilityId("Voucher Misc Field 3 Inq/List");
  }

  WebElement getVoucherMiscField4MaintButton(){
    return driver.findElementByAccessibilityId("Voucher Misc Field 4 Maint");
  }

  WebElement getVoucherMiscField4InqListButton(){
    return driver.findElementByAccessibilityId("Voucher Misc Field 4 Inq/List");
  }

  WebElement getExtendedDescriptionMaintButton(){
    return driver.findElementByAccessibilityId("Extended Description Maint");
  }

  WebElement getExtDescriptionInqListButton(){
    return driver.findElementByAccessibilityId("Ext Description Inq/List");
  }

  WebElement getAPPaymentTermsMaintenanceButton(){
    return driver.findElementByAccessibilityId("AP Payment Terms Maintenance");
  }

  WebElement getAPPaymentTermsInqListButton(){
    return driver.findElementByAccessibilityId("AP Payment Terms Inq/List");
  }

  WebElement getPaymentMethodMaintenanceButton(){
    return driver.findElementByAccessibilityId("Payment Method Maintenance");
  }

  WebElement getPaymentMethodInqListButton(){
    return driver.findElementByAccessibilityId("Payment Method Inq/List");
  }

  WebElement getAPHoldReasonMaintenanceButton(){
    return driver.findElementByAccessibilityId("AP Hold Reason Maintenance");
  }

  WebElement getAPHoldReasonInquiryListButton(){
    return driver.findElementByAccessibilityId("AP Hold Reason Inquiry/List");
  }

  WebElement getSeparateChckCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Separate Chck Code Maintenance");
  }

  WebElement getSeparateChckCodeInqListButton(){
    return driver.findElementByAccessibilityId("Separate Chck Code Inq/List");
  }

  WebElement getVoidReasonCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Void Reason Code Maintenance");
  }

  WebElement getVoidReasonCodeInqListButton(){
    return driver.findElementByAccessibilityId("Void Reason Code Inq/List");
  }

  WebElement getFinancialApprovalMenuButton(){
    return driver.findElementByAccessibilityId("Financial Approval Menu");
  }

  WebElement getTaxCodeMenuButton(){
    return driver.findElementByAccessibilityId("Tax Code Menu");
  }

  WebElement getAdjustmentAuthorizationMenuButton(){
    return driver.findElementByAccessibilityId("Adjustment Authorization Menu");
  }

  WebElement getExtendedEFTCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Extended EFT Code Maintenance");
  }

  WebElement getBankChargeCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Bank Charge Code Maintenance");
  }

  WebElement getVendorMaintenanceButton(){
    return driver.findElementByAccessibilityId("Vendor Maintenance");
  }

  WebElement getMassVendorMaintenanceButton(){
    return driver.findElementByAccessibilityId("Mass Vendor Maintenance");
  }

  WebElement getVendorMasterListButton(){
    return driver.findElementByAccessibilityId("Vendor Master List");
  }

  WebElement getVendorInquiryListButton(){
    return driver.findElementByAccessibilityId("Vendor Inquiry/List");
  }

  WebElement getVendorFilesListButton(){
    return driver.findElementByAccessibilityId("Vendor Files List");
  }

  WebElement getVendorRemittoInqListButton(){
    return driver.findElementByAccessibilityId("Vendor Remit-to Inq/List");
  }

  WebElement getApprovalofVendorChangeButton(){
    return driver.findElementByAccessibilityId("Approval of Vendor Change");
  }

  WebElement getWFVendorMaintenanceButton(){
    return driver.findElementByAccessibilityId("WF- Vendor Maintenance");
  }

  WebElement getWFVendorRemitApprovalsButton(){
    return driver.findElementByAccessibilityId("WF - Vendor Remit Approvals");
  }

  WebElement getVendorLabelsGenerationButton(){
    return driver.findElementByAccessibilityId("Vendor Labels Generation");
  }

  WebElement getFactorMaintenanceButton(){
    return driver.findElementByAccessibilityId("Factor Maintenance");
  }

  WebElement getFactorInquiryListButton(){
    return driver.findElementByAccessibilityId("Factor Inquiry/List");
  }

  WebElement getApprovalofFactorChangeButton(){
    return driver.findElementByAccessibilityId("Approval of Factor Change");
  }

  WebElement getVendorThresholdsButton(){
    return driver.findElementByAccessibilityId("Vendor Thresholds");
  }

  WebElement getBatchControlMaintenanceButton(){
    return driver.findElementByAccessibilityId("Batch Control Maintenance");
  }

  WebElement getVoucherEntryButton(){
    return driver.findElementByAccessibilityId("Voucher Entry");
  }

  WebElement getQuickVoucherEntryButton(){
    return driver.findElementByAccessibilityId("Quick Voucher Entry");
  }

  WebElement getVoucherChangeButton(){
    return driver.findElementByAccessibilityId("Voucher Change");
  }

  WebElement getVoucherTransferRevDelButton(){
    return driver.findElementByAccessibilityId("Voucher Transfer/Rev/Del");
  }

  WebElement getHoldReleaseMaintenanceButton(){
    return driver.findElementByAccessibilityId("Hold/Release Maintenance");
  }

  WebElement getRecurringTransactionsButton(){
    return driver.findElementByAccessibilityId("Recurring Transactions");
  }

  WebElement getMiscellaneousEntryEditButton(){
    return driver.findElementByAccessibilityId("Miscellaneous Entry/Edit");
  }

  WebElement getPayVouchersWriteChecksButton(){
    return driver.findElementByAccessibilityId("Pay Vouchers/Write Checks");
  }

  WebElement getManualandDamagedChecksButton(){
    return driver.findElementByAccessibilityId("Manual and Damaged Checks");
  }

  WebElement getVoidCheckEntryButton(){
    return driver.findElementByAccessibilityId("Void Check Entry");
  }

  WebElement getCheckReconandBankTransButton(){
    return driver.findElementByAccessibilityId("Check Recon and Bank Trans");
  }

  WebElement getAPCurrencyRevaluationButton(){
    return driver.findElementByAccessibilityId("AP Currency Revaluation");
  }

  WebElement getSpecialPaymentOptionsButton(){
    return driver.findElementByAccessibilityId("Special Payment Options");
  }

  WebElement getAPtoGLPostingMenuButton(){
    return driver.findElementByAccessibilityId("AP to GL Posting Menu");
  }

  WebElement getBankTapeReconciliationButton(){
    return driver.findElementByAccessibilityId("Bank Tape Reconciliation");
  }

  WebElement getNotesPayableClearButton(){
    return driver.findElementByAccessibilityId("Notes Payable Clear");
  }

  WebElement getStmtReconciliationMenuButton(){
    return driver.findElementByAccessibilityId("Stmt Reconciliation Menu");
  }

  WebElement getOpenVoucherInquiryListButton(){
    return driver.findElementByAccessibilityId("Open Voucher Inquiry/List");
  }

  WebElement getOpenClosedVoucherInqListButton(){
    return driver.findElementByAccessibilityId("Open/Closed Voucher Inq/List");
  }

  WebElement getVoucherReportGeneratorButton(){
    return driver.findElementByAccessibilityId("Voucher Report Generator");
  }

  WebElement getVoucherOpenAsOfReportButton(){
    return driver.findElementByAccessibilityId("Voucher \"Open As Of\" Report");
  }

  WebElement getBatchInquiryListButton(){
    return driver.findElementByAccessibilityId("Batch Inquiry/List");
  }

  WebElement getAgedCashRequirementsRptButton(){
    return driver.findElementByAccessibilityId("Aged Cash Requirements Rpt");
  }

  WebElement getAgedAsOfRequiremntsRptButton(){
    return driver.findElementByAccessibilityId("Aged \"As Of\" Requiremnts Rpt");
  }

  WebElement getOpenVoucherSummaryReportButton(){
    return driver.findElementByAccessibilityId("Open Voucher Summary Report");
  }

  WebElement getOpenVoucherDetailReportButton(){
    return driver.findElementByAccessibilityId("Open Voucher Detail Report");
  }

  WebElement getOpenVoucherSummarywDistButton(){
    return driver.findElementByAccessibilityId("Open Voucher Summary w/Dist");
  }

  WebElement getDistributionReportsButton(){
    return driver.findElementByAccessibilityId("Distribution Reports");
  }

  WebElement getPreliminaryCheckRegisterButton(){
    return driver.findElementByAccessibilityId("Preliminary Check Register");
  }

  WebElement getVendorHistoryInqListButton(){
    return driver.findElementByAccessibilityId("Vendor History Inq/List");
  }

  WebElement getDuplicateVoucherReportButton(){
    return driver.findElementByAccessibilityId("Duplicate Voucher Report");
  }

  WebElement getPurchaseTrendAnalysisButton(){
    return driver.findElementByAccessibilityId("Purchase Trend Analysis");
  }

  WebElement getInvoicePaymentAnalysisButton(){
    return driver.findElementByAccessibilityId("Invoice Payment Analysis");
  }

  WebElement getDiscountsLostReportButton(){
    return driver.findElementByAccessibilityId("Discounts Lost Report");
  }

  WebElement getUseTaxReportButton(){
    return driver.findElementByAccessibilityId("Use Tax Report");
  }

  WebElement getLineTaxReportButton(){
    return driver.findElementByAccessibilityId("Line Tax Report");
  }

  WebElement getDeletedVoucherInqReportButton(){
    return driver.findElementByAccessibilityId("Deleted Voucher Inq/Report");
  }

  WebElement getCheckReconciliationInqLstButton(){
    return driver.findElementByAccessibilityId("Check Reconciliation Inq/Lst");
  }

  WebElement getAPReconciliationReportButton(){
    return driver.findElementByAccessibilityId("AP Reconciliation Report");
  }

  WebElement getAPZOOMInquiryButton(){
    return driver.findElementByAccessibilityId("AP ZOOM Inquiry");
  }

  WebElement getGENEXInVendorsButton(){
    return driver.findElementByAccessibilityId("GENEX-In Vendors");
  }

  WebElement getGENEXInVouchersButton(){
    return driver.findElementByAccessibilityId("GENEX-In Vouchers");
  }

  WebElement getGENEXInCheckReconciliationButton(){
    return driver.findElementByAccessibilityId("GENEX-In Check Reconciliation");
  }

  WebElement getGENEXInFactorsButton(){
    return driver.findElementByAccessibilityId("GENEX-In Factors");
  }

  WebElement getGENEXInVoucherChangesButton(){
    return driver.findElementByAccessibilityId("GENEX-In Voucher Changes");
  }

  WebElement getGENEXInNonAPChecksButton(){
    return driver.findElementByAccessibilityId("GENEX-In Non-AP Checks");
  }

  WebElement getBankDataFormatMaintButton(){
    return driver.findElementByAccessibilityId("Bank Data Format Maint");
  }

  WebElement getDataDescriptionListMaintButton(){
    return driver.findElementByAccessibilityId("Data Description List Maint");
  }

  WebElement getGENEXOutVendor1099DataButton(){
    return driver.findElementByAccessibilityId("GENEX-Out Vendor 1099 Data");
  }

  WebElement getGENEXOut1099PrintButton(){
    return driver.findElementByAccessibilityId("GENEX-Out 1099 Print");
  }

  WebElement getGENEXOutVendor1042DataButton(){
    return driver.findElementByAccessibilityId("GENEX-Out Vendor 1042 Data");
  }

  WebElement getGENEXOut1042PrintButton(){
    return driver.findElementByAccessibilityId("GENEX-Out 1042 Print");
  }

  WebElement getGENEXOutVouchersButton(){
    return driver.findElementByAccessibilityId("GENEX-Out Vouchers");
  }

  WebElement getGENEXOutChecksButton(){
    return driver.findElementByAccessibilityId("GENEX-Out Checks");
  }

  WebElement getGlobalParametersMaintListButton(){
    return driver.findElementByAccessibilityId("Global Parameters Maint/List");
  }

  WebElement getAPAlternateKeyMaintenanceButton(){
    return driver.findElementByAccessibilityId("AP Alternate Key Maintenance");
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

  WebElement getUserProductAnalysisReportButton(){
    return driver.findElementByAccessibilityId("User Product Analysis Report");
  }

  WebElement getAPAuditReportsButton(){
    return driver.findElementByAccessibilityId("AP Audit Reports");
  }

  WebElement getPurgeFunctionsButton(){
    return driver.findElementByAccessibilityId("Purge Functions");
  }

  WebElement getFileMaintenanceButton(){
    return driver.findElementByAccessibilityId("File Maintenance");
  }

  WebElement getLockoutMaintenanceButton(){
    return driver.findElementByAccessibilityId("Lockout Maintenance");
  }

  WebElement getUniversalUtilitiesButton(){
    return driver.findElementByAccessibilityId("Universal Utilities");
  }

  WebElement getEPICinAPButton(){
    return driver.findElementByAccessibilityId("EPIC in AP");
  }

  WebElement getMicrLaserFormatCodeMaintButton(){
    return driver.findElementByAccessibilityId("Micr Laser Format Code Maint");
  }

  WebElement getNonRebateableAcctMaintButton(){
    return driver.findElementByAccessibilityId("Non-Rebateable Acct Maint");
  }

  WebElement getNonRebateableAcctListButton(){
    return driver.findElementByAccessibilityId("Non-Rebateable Acct List");
  }

  WebElement getExceptionAccountMaintenanceButton(){
    return driver.findElementByAccessibilityId("Exception Account Maintenance");
  }

  WebElement getExceptionAccountListButton(){
    return driver.findElementByAccessibilityId("Exception Account List");
  }

  WebElement getVATRateMaintenanceButton(){
    return driver.findElementByAccessibilityId("VAT Rate Maintenance");
  }

  WebElement getGSTPostingUpdateButton(){
    return driver.findElementByAccessibilityId("GST Posting Update");
  }

  WebElement getGSTPostingEditButton(){
    return driver.findElementByAccessibilityId("GST Posting Edit");
  }

}
