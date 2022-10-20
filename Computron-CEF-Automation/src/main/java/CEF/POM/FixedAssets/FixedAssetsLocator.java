package CEF.POM.FixedAssets;

import CEF.Base.LocatorBase;
import io.appium.java_client.windows.WindowsDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
@Slf4j
class FixedAssetsLocator extends LocatorBase {
  FixedAssetsLocator(WindowsDriver CrmDriver) {
    super(CrmDriver);
  }

  WebElement getFASystemParametersButton(){
    return driver.findElementByAccessibilityId("FA System Parameters");
  }

  WebElement getFACodesMaintenanceMenuButton(){
    return driver.findElementByAccessibilityId("FA Codes Maintenance Menu");
  }

  WebElement getFATransactionEntryMenuButton(){
    return driver.findElementByAccessibilityId("FA Transaction Entry Menu");
  }

  WebElement getFATransactionProcessAndPostButton(){
    return driver.findElementByAccessibilityId("FA Transaction Process & Post");
  }

  WebElement getFAZOOMInquiryButton(){
    return driver.findElementByAccessibilityId("FA ZOOM Inquiry");
  }

  WebElement getFAReportGeneratorMenuButton(){
    return driver.findElementByAccessibilityId("FA Report Generator Menu");
  }

  WebElement getExtendedFixedAssetsMenuButton(){
    return driver.findElementByAccessibilityId("Extended Fixed Assets Menu");
  }

  WebElement getFASystemAdministratorButton(){
    return driver.findElementByAccessibilityId("FA System Administrator");
  }

  /*Level 2 menu locators*/

  WebElement getIDSSUDKeyFormatMaintButton(){
    return driver.findElementByAccessibilityId("ID/SS/UD Key Format Maint");
  }

  WebElement getFACompanyFileMaintenanceButton(){
    return driver.findElementByAccessibilityId("FA Company File Maintenance");
  }

  WebElement getFACompanyFileInqListButton(){
    return driver.findElementByAccessibilityId("FA Company File Inq/List");
  }

  WebElement getCompanySetMaintenanceButton(){
    return driver.findElementByAccessibilityId("Company Set Maintenance");
  }

  WebElement getCompanySetInqListButton(){
    return driver.findElementByAccessibilityId("Company Set Inq/List");
  }

  WebElement getFACalendarMaintenanceMenuButton(){
    return driver.findElementByAccessibilityId("FA Calendar Maintenance Menu");
  }

  WebElement getFACurrencyMaintenanceMenuButton(){
    return driver.findElementByAccessibilityId("FA Currency Maintenance Menu");
  }

  WebElement getFACompanyParametersMaintButton(){
    return driver.findElementByAccessibilityId("FA Company Parameters Maint");
  }

  WebElement getFAParametersInquiryListButton(){
    return driver.findElementByAccessibilityId("FA Parameters Inquiry/List");
  }

  WebElement getCoDCCalendarMaintButton(){
    return driver.findElementByAccessibilityId("Co/DC/Calendar Maint");
  }

  WebElement getCoDCCalendarInqListButton(){
    return driver.findElementByAccessibilityId("Co/DC/Calendar Inq/List");
  }

  WebElement getCoDCYrConventionMaintButton(){
    return driver.findElementByAccessibilityId("Co/DC/Yr/Convention Maint");
  }

  WebElement getCoDCYrConventionInqlistButton(){
    return driver.findElementByAccessibilityId("Co/DC/Yr/Convention Inq/list");
  }

  WebElement getFAAccountCodesMenuButton(){
    return driver.findElementByAccessibilityId("FA Account Codes Menu");
  }

  WebElement getFADataClassMaintMenuButton(){
    return driver.findElementByAccessibilityId("FA Data Class Maint Menu");
  }

  WebElement getAssetClassMaintMenuButton(){
    return driver.findElementByAccessibilityId("Asset Class Maint Menu");
  }

  WebElement getDataAssetClassDftMaintButton(){
    return driver.findElementByAccessibilityId("Data/Asset Class Dft Maint");
  }

  WebElement getDataAssetClassDftInqLisButton(){
    return driver.findElementByAccessibilityId("Data/Asset Class Dft Inq/Lis");
  }

  WebElement getAltKeyPathIndMaintenanceButton(){
    return driver.findElementByAccessibilityId("Alt Key Path Ind Maintenance");
  }

  WebElement getAltKeyPathIndInqListButton(){
    return driver.findElementByAccessibilityId("Alt Key Path Ind Inq/List");
  }

  WebElement getFATextTypeCodeMaintButton(){
    return driver.findElementByAccessibilityId("FA Text Type Code Maint");
  }

  WebElement getFATextTypeCodeInqListButton(){
    return driver.findElementByAccessibilityId("FA Text Type Code Inq/List");
  }

  WebElement getFADepreciationMaintMenuButton(){
    return driver.findElementByAccessibilityId("FA Depreciation Maint Menu");
  }

  WebElement getFAMiscAndTransCodeMenuButton(){
    return driver.findElementByAccessibilityId("FA Misc & Trans Code Menu");
  }

  WebElement getFAGeographicCodesMenuButton(){
    return driver.findElementByAccessibilityId("FA Geographic Codes Menu");
  }

  WebElement getFAExternalCodesMenuButton(){
    return driver.findElementByAccessibilityId("FA External Codes Menu");
  }

  WebElement getFARevalueCodesMenuButton(){
    return driver.findElementByAccessibilityId("FA Revalue Codes Menu");
  }

  WebElement getFAKeyCodesMenuButton(){
    return driver.findElementByAccessibilityId("FA Key Codes Menu");
  }

  WebElement getAssetMasterAcquisitionEntryButton(){
    return driver.findElementByAccessibilityId("Asset Master/Acquisition Entry");
  }

  WebElement getEnhancementEntryButton(){
    return driver.findElementByAccessibilityId("Enhancement Entry");
  }

  WebElement getTransferEntryButton(){
    return driver.findElementByAccessibilityId("Transfer Entry");
  }

  WebElement getDisposalRetirementEntryButton(){
    return driver.findElementByAccessibilityId("Disposal/Retirement Entry");
  }

  WebElement getNonDepreciatingClassEntryButton(){
    return driver.findElementByAccessibilityId("Non-Depreciating Class Entry");
  }

  WebElement getMidQuarterOverrideEntryButton(){
    return driver.findElementByAccessibilityId("Mid-Quarter Override Entry");
  }

  WebElement getMiscellaneousParameterEntryButton(){
    return driver.findElementByAccessibilityId("Miscellaneous Parameter Entry");
  }

  WebElement getDepreciationAdjustmentEntryButton(){
    return driver.findElementByAccessibilityId("Depreciation Adjustment Entry");
  }

  WebElement getProratedAnnualAdjustEntryButton(){
    return driver.findElementByAccessibilityId("Prorated Annual Adjust Entry");
  }

  WebElement getAssetClassChangeMassEntryButton(){
    return driver.findElementByAccessibilityId("Asset Class Change/Mass Entry");
  }

  WebElement getInterCompanyTransferEntryButton(){
    return driver.findElementByAccessibilityId("Inter-Company Transfer Entry");
  }

  WebElement getPartialTransferEntryButton(){
    return driver.findElementByAccessibilityId("Partial Transfer Entry");
  }

  WebElement getTransUnprocessChangeDeleteButton(){
    return driver.findElementByAccessibilityId("Trans Unprocess Change/Delete");
  }

  WebElement getTransProcessReverseButton(){
    return driver.findElementByAccessibilityId("Trans Process Reverse");
  }

  WebElement getTransInactiveReverseButton(){
    return driver.findElementByAccessibilityId("Trans Inactive Reverse");
  }

  WebElement getTransactionProcessorButton(){
    return driver.findElementByAccessibilityId("Transaction Processor");
  }

  WebElement getUnprocessedTransactionInqLButton(){
    return driver.findElementByAccessibilityId("Unprocessed Transaction Inq/L");
  }

  WebElement getProcessedTransactionInqLstButton(){
    return driver.findElementByAccessibilityId("Processed Transaction Inq/Lst");
  }

  WebElement getInactiveTransactionInqListButton(){
    return driver.findElementByAccessibilityId("Inactive Transaction Inq/List");
  }

  WebElement getActiveTransReportbyEventButton(){
    return driver.findElementByAccessibilityId("Active Trans Report by Event");
  }

  WebElement getFAtoGLPostingButton(){
    return driver.findElementByAccessibilityId("FA to GL Posting");
  }

  WebElement getMassRecalcofDepreciationButton(){
    return driver.findElementByAccessibilityId("Mass Recalc of Depreciation");
  }

  WebElement getUnprocessedTransQuickReportButton(){
    return driver.findElementByAccessibilityId("Unprocessed Trans Quick Report");
  }

  WebElement getProcessedTransQuickReportButton(){
    return driver.findElementByAccessibilityId("Processed Trans Quick Report");
  }

  WebElement getInactiveTransQuickReportButton(){
    return driver.findElementByAccessibilityId("Inactive Trans Quick Report");
  }

  WebElement getFAGLReconciliationReportButton(){
    return driver.findElementByAccessibilityId("FA/GL Reconciliation Report");
  }

  WebElement getPropertyListingReportButton(){
    return driver.findElementByAccessibilityId("Property Listing Report");
  }

  WebElement getDepreciationExpenseReportButton(){
    return driver.findElementByAccessibilityId("Depreciation Expense Report");
  }

  WebElement getDisposalsReportButton(){
    return driver.findElementByAccessibilityId("Disposals Report");
  }

  WebElement getTransfersReportButton(){
    return driver.findElementByAccessibilityId("Transfers Report");
  }

  WebElement getDataAssetClassExceptionsButton(){
    return driver.findElementByAccessibilityId("Data/Asset Class Exceptions");
  }

  WebElement getITCReportSource3468Button(){
    return driver.findElementByAccessibilityId("ITC Report (Source 3468)");
  }

  WebElement getInterCompanyTransferReportButton(){
    return driver.findElementByAccessibilityId("Inter-Company Transfer Report");
  }

  WebElement getDepreciationSource4562Button(){
    return driver.findElementByAccessibilityId("Depreciation (Source 4562)");
  }

  WebElement getDataExtractionforAboveRptsButton(){
    return driver.findElementByAccessibilityId("Data Extraction for Above Rpts");
  }

  WebElement getSECReport10KButton(){
    return driver.findElementByAccessibilityId("SEC Report (10K)");
  }

  WebElement getMassTransactionEntryButton(){
    return driver.findElementByAccessibilityId("Mass Transaction Entry");
  }

  WebElement getDataClassCopyButton(){
    return driver.findElementByAccessibilityId("Data Class Copy");
  }

  WebElement getLikeKindExchangeMatchButton(){
    return driver.findElementByAccessibilityId("Like-Kind Exchange Match");
  }

  WebElement getLikeKindExchangeReversalButton(){
    return driver.findElementByAccessibilityId("Like-Kind Exchange Reversal");
  }

  WebElement getMassLegalSubsidiaryTransferButton(){
    return driver.findElementByAccessibilityId("Mass Legal/Subsidiary Transfer");
  }

  WebElement getFullDisposalDateFlagButton(){
    return driver.findElementByAccessibilityId("Full Disposal Date/Flag");
  }

  WebElement getRevaluationProcessReportButton(){
    return driver.findElementByAccessibilityId("Revaluation Process/Report");
  }

  WebElement getManualRevaluationEntryButton(){
    return driver.findElementByAccessibilityId("Manual Revaluation Entry");
  }

  WebElement getRevaluationReverseButton(){
    return driver.findElementByAccessibilityId("Revaluation Reverse");
  }

  WebElement getFAExternalInterfaceMenuButton(){
    return driver.findElementByAccessibilityId("FA External Interface Menu");
  }

  WebElement getFASB33MenuButton(){
    return driver.findElementByAccessibilityId("FASB 33 Menu");
  }

  WebElement getGlobalEnvironmentMaintButton(){
    return driver.findElementByAccessibilityId("Global Environment Maint");
  }

  WebElement getGlobalVariableMaintenanceButton(){
    return driver.findElementByAccessibilityId("Global Variable Maintenance");
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

  WebElement getFAPurgeProcessPrintButton(){
    return driver.findElementByAccessibilityId("FA Purge Process/Print");
  }

  WebElement getFAAuditReportsButton(){
    return driver.findElementByAccessibilityId("FA Audit Reports");
  }

  WebElement getAlternateKeyPathMaintButton(){
    return driver.findElementByAccessibilityId("Alternate Key Path Maint");
  }

  WebElement getFAPostingReversalButton(){
    return driver.findElementByAccessibilityId("FA Posting Reversal");
  }

  WebElement getFACalendarConversionButton(){
    return driver.findElementByAccessibilityId("FA Calendar Conversion");
  }

  WebElement getReorganizeAssetIDSSKeyButton(){
    return driver.findElementByAccessibilityId("Reorganize Asset ID/ SS Key");
  }

  WebElement getUniversalUtilitiesMenuButton(){
    return driver.findElementByAccessibilityId("Universal Utilities Menu");
  }

  WebElement getEPICinFAButton(){
    return driver.findElementByAccessibilityId("EPIC in FA");
  }


}
