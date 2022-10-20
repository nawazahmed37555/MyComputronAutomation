package CEF.POM.GeneralLedger;

import CEF.Base.LocatorBase;
import CEF.Base.TestBase;
import io.appium.java_client.windows.WindowsDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
@Slf4j
public class GeneralLedgerLocator extends TestBase {



	public WebElement getGLSystemParametersButton(){
	  if (driver.findElementsByAccessibilityId("GL System Parameters").size()>0) {
		  return driver.findElementByAccessibilityId("GL System Parameters");
	  }
	  else {
		  return driver.findElementByAccessibilityId("System Parameters");
	  }
  }

	public WebElement getPostingAccountStructureButton(){
    return driver.findElementByAccessibilityId("Posting Account Structure");
  }

	public  WebElement getPostingAccountMaintenanceButton(){
    return driver.findElementByAccessibilityId("Posting Account Maintenance");
  }

	public WebElement getTransactionParametersButton(){
    return driver.findElementByAccessibilityId("Transaction Parameters");
  }

	public WebElement getGLTransactionProcessingButton(){
    return driver.findElementByAccessibilityId("GL Transaction Processing");
  }

	public WebElement getMemosandBudgetsButton(){
    return driver.findElementByAccessibilityId("Memos and Budgets");
  }

	public  WebElement getGeneratedTransactionsButton(){
    return driver.findElementByAccessibilityId("Generated Transactions");
  }

  WebElement getEDE_EnhancedDataEntryButton(){
    return driver.findElementByAccessibilityId("EDE - Enhanced Data Entry");
  }

  WebElement getPowerReportWriterButton(){
    return driver.findElementByAccessibilityId("Power Report Writer");
  }

  WebElement getTrialBalanceAndLedgerRptsButton(){
    return driver.findElementByAccessibilityId("Trial Balance & Ledger Rpts");
  }

  WebElement getGENEX_ExternalInterfacesButton(){
    return driver.findElementByAccessibilityId("GENEX - External Interfaces");
  }

  WebElement getRelationshipsButton(){
    return driver.findElementByAccessibilityId("Relationships");
  }

  WebElement getGLSystemAdministratorButton(){
    return driver.findElementByAccessibilityId("GL System Administrator");
  }

  WebElement getEncumbranceProcessingButton(){
    return driver.findElementByAccessibilityId("Encumbrance Processing");
  }

  WebElement getW3schoolsButton(){
    return driver.findElementByAccessibilityId("W3schools");
  }

  /*Level 2 menu locators*/

  WebElement getGLCompanyFileMaintenanceButton(){
    return driver.findElementByAccessibilityId("GL Company File Maintenance");
  }

  WebElement getGLCompanyFileInqListButton(){
    return driver.findElementByAccessibilityId("GL Company File Inq/List");
  }

  WebElement getGLCompanyParametersMaintButton(){
    return driver.findElementByAccessibilityId("GL Company Parameters Maint");
  }

  WebElement getGLParametersInquiryListButton(){
    return driver.findElementByAccessibilityId("GL Parameters Inquiry/List");
  }

  WebElement getEndofPeriodEndofYearButton(){
    return driver.findElementByAccessibilityId("End of Period/End of Year");
  }

  WebElement getGLCalendarMaintenanceMenuButton(){
    return driver.findElementByAccessibilityId("GL Calendar Maintenance Menu");
  }

  WebElement getGLCurrencyMaintenanceMenuButton(){
    return driver.findElementByAccessibilityId("GL Currency Maintenance Menu");
  }

  WebElement getGLDataClassMaintenanceMenuButton(){
    return driver.findElementByAccessibilityId("GL Data Class Maintenance Menu");
  }

  WebElement getGLDataClassInquiryListButton(){
    return driver.findElementByAccessibilityId("GL Data Class Inquiry/List");
  }

  WebElement getAutoBalancePAIMaintButton(){
    return driver.findElementByAccessibilityId("Auto Balance PAI Maint");
  }

  WebElement getEntityInquiryListButton(){
    return driver.findElementByAccessibilityId("Entity Inquiry/List");
  }

  WebElement getFormatMaintenanceButton(){
    return driver.findElementByAccessibilityId("Format Maintenance");
  }

  WebElement getFormatInquiryListButton(){
    return driver.findElementByAccessibilityId("Format Inquiry/List");
  }

  WebElement getIdentifierMaintenanceButton(){
    return driver.findElementByAccessibilityId("Identifier Maintenance");
  }

  WebElement getIdentifierInquiryListButton(){
    return driver.findElementByAccessibilityId("Identifier Inquiry/List");
  }

  WebElement getCombinationIdentifierMaintButton(){
    return driver.findElementByAccessibilityId("Combination Identifier Maint");
  }

  WebElement getIdentifierReorganizationButton(){
    return driver.findElementByAccessibilityId("Identifier Reorganization");
  }

  WebElement getDimensionSetMaintenanceButton(){
    return driver.findElementByAccessibilityId("Dimension Set Maintenance");
  }

  WebElement getDimensionSetInqListButton(){
    return driver.findElementByAccessibilityId("Dimension Set Inq/List");
  }

  WebElement getAlternatePathDefinitionButton(){
    return driver.findElementByAccessibilityId("Alternate Path Definition");
  }

  WebElement getAltPathsInquiryListButton(){
    return driver.findElementByAccessibilityId("Alt Paths Inquiry/List");
  }

  WebElement getBuildAlternatePathFileButton(){
    return driver.findElementByAccessibilityId("Build Alternate Path File");
  }

  WebElement getEstablishNewAccountsButton(){
    return driver.findElementByAccessibilityId("Establish New Accounts");
  }

  WebElement getChangeDelVerifyAccountsButton(){
    return driver.findElementByAccessibilityId("Change/Del/Verify Accounts");
  }

  WebElement getReorganizeandReclassifyButton(){
    return driver.findElementByAccessibilityId("Reorganize and Reclassify");
  }

  WebElement getMassMaintenanceButton(){
    return driver.findElementByAccessibilityId("Mass Maintenance");
  }

  WebElement getGLZOOMInquiryButton(){
    return driver.findElementByAccessibilityId("GL ZOOM Inquiry");
  }

  WebElement getJournalMaintenanceButton(){
    return driver.findElementByAccessibilityId("Journal Maintenance");
  }

  WebElement getJournalInquiryListButton(){
    return driver.findElementByAccessibilityId("Journal Inquiry/List");
  }

  WebElement getStdDistributionMaintenanceButton(){
    return driver.findElementByAccessibilityId("Std Distribution Maintenance");
  }

  WebElement getStandardDistribInqListButton(){
    return driver.findElementByAccessibilityId("Standard Distrib Inq/List");
  }

  WebElement getRestrictPostingbyDimDateButton(){
    return driver.findElementByAccessibilityId("Restrict Posting by Dim/Date");
  }

  WebElement getRestrictDateInqListButton(){
    return driver.findElementByAccessibilityId("Restrict Date Inq/List");
  }

  WebElement getRestrictDynamicPAICreateButton(){
    return driver.findElementByAccessibilityId("Restrict Dynamic PAI Create");
  }

  WebElement getTransactionHeaderRefButton(){
    return driver.findElementByAccessibilityId("Transaction Header Ref");
  }

  WebElement getTransactionLineRefButton(){
    return driver.findElementByAccessibilityId("Transaction Line Ref");
  }

  WebElement getOnLineTransactionEntryButton(){
    return driver.findElementByAccessibilityId("On Line Transaction Entry");
  }

  WebElement getOnLineTransQuickEntryButton(){
    return driver.findElementByAccessibilityId("On Line Trans Quick Entry");
  }

  WebElement getAccrualReversalEntryButton(){
    return driver.findElementByAccessibilityId("Accrual / Reversal Entry");
  }

  WebElement getAccrualRevQuickEntryButton(){
    return driver.findElementByAccessibilityId("Accrual / Rev Quick Entry");
  }

  WebElement getRecurringJournalEntryButton(){
    return driver.findElementByAccessibilityId("Recurring Journal Entry");
  }

  WebElement getRecurringJrnQuickEntryButton(){
    return driver.findElementByAccessibilityId("Recurring Jrn Quick Entry");
  }

  WebElement getBalanceEntryActualsButton(){
    return driver.findElementByAccessibilityId("Balance Entry - Actuals");
  }

  WebElement getTransactionEditAndDeleteButton(){
    return driver.findElementByAccessibilityId("Transaction Edit & Delete");
  }

  WebElement getTransactionInquiryEditButton(){
    return driver.findElementByAccessibilityId("Transaction Inquiry / Edit");
  }

  WebElement getGLTransactionPrintButton(){
    return driver.findElementByAccessibilityId("GL Transaction Print");
  }

  WebElement getGLTransactionPostingButton(){
    return driver.findElementByAccessibilityId("GL Transaction Posting");
  }

  WebElement getTransactionReversalButton(){
    return driver.findElementByAccessibilityId("Transaction Reversal");
  }

  WebElement getMemoTransactionEntryButton(){
    return driver.findElementByAccessibilityId("Memo Transaction Entry");
  }

  WebElement getBalanceEntryMemoButton(){
    return driver.findElementByAccessibilityId("Balance Entry - Memo");
  }

  WebElement getBudgetEntryAndMaintenanceButton(){
    return driver.findElementByAccessibilityId("Budget Entry & Maintenance");
  }

  WebElement getMassBudgetingButton(){
    return driver.findElementByAccessibilityId("Mass Budgeting");
  }

  WebElement getBCMCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("BCM Code Maintenance");
  }

  WebElement getTransGenFromLedgerDetailButton(){
    return driver.findElementByAccessibilityId("Trans Gen From Ledger Detail");
  }

  WebElement getTransGenFromAccountBalanceButton(){
    return driver.findElementByAccessibilityId("Trans Gen From Account Balance");
  }

  WebElement getAverageDailyBalanceCalcButton(){
    return driver.findElementByAccessibilityId("Average Daily Balance Calc");
  }

  WebElement getAllocationsMaintenanceButton(){
    return driver.findElementByAccessibilityId("Allocations Maintenance");
  }

  WebElement getAllocationsInquiryListButton(){
    return driver.findElementByAccessibilityId("Allocations Inquiry/List");
  }

  WebElement getAllocationsGeneratorButton(){
    return driver.findElementByAccessibilityId("Allocations Generator");
  }

  WebElement getEDESpecsAllocationsButton(){
    return driver.findElementByAccessibilityId("EDE Specs-Allocations");
  }

  WebElement getEDESpecsMassBudgetingButton(){
    return driver.findElementByAccessibilityId("EDE Specs-Mass Budgeting");
  }

  WebElement getEDESpecsStatisticalAccountsButton(){
    return driver.findElementByAccessibilityId("EDE Specs-Statistical Accounts");
  }

  WebElement getEDESpecsSubtotallingButton(){
    return driver.findElementByAccessibilityId("EDE Specs-Subtotalling");
  }

  WebElement getEDESpecsUniversalButton(){
    return driver.findElementByAccessibilityId("EDE Specs-Universal");
  }

  WebElement getSpecificationsListButton(){
    return driver.findElementByAccessibilityId("Specifications List");
  }

  WebElement getSharedEDEButton(){
    return driver.findElementByAccessibilityId("Shared EDE");
  }

  WebElement getMultipleEDEonlyButton(){
    return driver.findElementByAccessibilityId("Multiple EDE only");
  }

  WebElement getExclusiveEDEButton(){
    return driver.findElementByAccessibilityId("Exclusive EDE");
  }

  WebElement getBasicAndExtendedButton(){
    return driver.findElementByAccessibilityId("Basic & Extended");
  }

  WebElement getPRWPROButton(){
    return driver.findElementByAccessibilityId("PRW - PRO");
  }

  WebElement getTrialBalanceReportButton(){
    return driver.findElementByAccessibilityId("Trial Balance Report");
  }

  WebElement getLedgerReportbyJournalButton(){
    return driver.findElementByAccessibilityId("Ledger Report by Journal");
  }

  WebElement getLedgerReportbyAccountButton(){
    return driver.findElementByAccessibilityId("Ledger Report by Account");
  }

  WebElement getLedgerReportbyTransactionButton(){
    return driver.findElementByAccessibilityId("Ledger Report by Transaction");
  }

  WebElement getIntercompanyLedgerInqListButton(){
    return driver.findElementByAccessibilityId("Intercompany Ledger Inq/List");
  }

  WebElement getOpenPostedAndDelTransInqButton(){
    return driver.findElementByAccessibilityId("Open  Posted & Del  Trans Inq");
  }

  WebElement getOpenPostedAndDelTransRptButton(){
    return driver.findElementByAccessibilityId("Open  Posted & Del  Trans Rpt");
  }

  WebElement getGENEXInButton(){
    return driver.findElementByAccessibilityId("GENEX-In");
  }

  WebElement getExtendedGENEXInButton(){
    return driver.findElementByAccessibilityId("Extended GENEX-In");
  }

  WebElement getGENEXInputFormatMaintButton(){
    return driver.findElementByAccessibilityId("GENEX Input Format Maint");
  }

  WebElement getDataDescriptionListMaintButton(){
    return driver.findElementByAccessibilityId("Data Description List Maint");
  }

  WebElement getAnyToAnyandUtilitiesButton(){
    return driver.findElementByAccessibilityId("Any-To-Any and Utilities");
  }

  WebElement getGENEXOutButton(){
    return driver.findElementByAccessibilityId("GENEX-Out");
  }

  WebElement getIDTranslationFileMaintButton(){
    return driver.findElementByAccessibilityId("ID Translation File Maint");
  }

  WebElement getIDTransFileInqListButton(){
    return driver.findElementByAccessibilityId("ID Trans File Inq/List");
  }

  WebElement getPostAcctTransFileMaintButton(){
    return driver.findElementByAccessibilityId("Post Acct Trans File Maint");
  }

  WebElement getPostAcctTrnslFileInqLstButton(){
    return driver.findElementByAccessibilityId("PostAcct Trnsl File Inq/Lst");
  }

  WebElement getEntityCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Entity Code Maintenance");
  }

  WebElement getRelationshipIDMaintenanceButton(){
    return driver.findElementByAccessibilityId("Relationship ID Maintenance");
  }

  WebElement getSetListMaintenanceButton(){
    return driver.findElementByAccessibilityId("Set List Maintenance");
  }

  WebElement getSchemaMaintenanceButton(){
    return driver.findElementByAccessibilityId("Schema Maintenance");
  }

  WebElement getGlobalEnvironmentMaintListButton(){
    return driver.findElementByAccessibilityId("Global Environment Maint/List");
  }

  WebElement getGeneralLedgerAuditReportsButton(){
    return driver.findElementByAccessibilityId("General Ledger Audit Reports");
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

  WebElement getProfileSecurityReportButton(){
    return driver.findElementByAccessibilityId("Profile Security Report");
  }

  WebElement getJournalSecuritybyUserButton(){
    return driver.findElementByAccessibilityId("Journal Security by User");
  }

  WebElement getJNLSecuritybyUserInqListButton(){
    return driver.findElementByAccessibilityId("JNL Security by User Inq/List");
  }

  WebElement getTransferAuditProcessingButton(){
    return driver.findElementByAccessibilityId("Transfer Audit Processing");
  }

  WebElement getAccountDataVerificationRptButton(){
    return driver.findElementByAccessibilityId("Account Data Verification Rpt");
  }

  WebElement getRebuildShadowTableButton(){
    return driver.findElementByAccessibilityId("Rebuild Shadow Table");
  }

  WebElement getUniversalUtilitiesButton(){
    return driver.findElementByAccessibilityId("Universal Utilities");
  }

  WebElement getEPICinGLButton(){
    return driver.findElementByAccessibilityId("EPIC in GL");
  }

  WebElement getOnLineBudgetEntryButton(){
    return driver.findElementByAccessibilityId("On Line Budget Entry");
  }

  WebElement getQuickBudgetEntryButton(){
    return driver.findElementByAccessibilityId("Quick Budget Entry");
  }

  WebElement getTransactionPostingButton(){
    return driver.findElementByAccessibilityId("Transaction Posting");
  }

  WebElement getClearAVLFNDWKSessionButton(){
    return driver.findElementByAccessibilityId("Clear AVLFNDWK Session");
  }

  WebElement getYearEndRolloverButton(){
    return driver.findElementByAccessibilityId("Year-End Rollover");
  }

  WebElement getAccumulatorDefMaintButton(){
    return driver.findElementByAccessibilityId("Accumulator Def Maint");
  }

  WebElement getAccumulatorDefInqListButton(){
    return driver.findElementByAccessibilityId("Accumulator Def Inq/List");
  }

  WebElement getBasicColumnDefMaintButton(){
    return driver.findElementByAccessibilityId("Basic Column Def Maint");
  }

  WebElement getExtendedColumnDefMaintButton(){
    return driver.findElementByAccessibilityId("Extended Column Def Maint");
  }

  WebElement getBasicLineDefMaintButton(){
    return driver.findElementByAccessibilityId("Basic Line Def Maint");
  }

  WebElement getExtendedLineDefMaintButton(){
    return driver.findElementByAccessibilityId("Extended Line Def Maint");
  }

  WebElement getReportDefMaintButton(){
    return driver.findElementByAccessibilityId("Report Def Maint");
  }

  WebElement getCompanyGroupsMaintButton(){
    return driver.findElementByAccessibilityId("Company Groups Maint");
  }

  WebElement getDefinitionsPrintButton(){
    return driver.findElementByAccessibilityId("Definitions Print");
  }

  WebElement getExtractAndReportButton(){
    return driver.findElementByAccessibilityId("Extract & Report");
  }

  WebElement getExtractDataButton(){
    return driver.findElementByAccessibilityId("Extract Data");
  }

  WebElement getGenReportFromExtractButton(){
    return driver.findElementByAccessibilityId("Gen Report from Extract");
  }

  WebElement getAccumulatorSetMaintenanceButton(){
    return driver.findElementByAccessibilityId("Accumulator Set Maintenance");
  }

  WebElement getAccumulatorSetInqListButton(){
    return driver.findElementByAccessibilityId("Accumulator Set Inq/List");
  }

  WebElement getColumnSetMaintenanceButton(){
    return driver.findElementByAccessibilityId("Column Set Maintenance");
  }

  WebElement getColumnSetListButton(){
    return driver.findElementByAccessibilityId("Column Set List");
  }

  WebElement getLineSetMaintenanceButton(){
    return driver.findElementByAccessibilityId("Line Set Maintenance");
  }

  WebElement getLineSetListButton(){
    return driver.findElementByAccessibilityId("Line Set List");
  }

  WebElement getVerifyLineSetsButton(){
    return driver.findElementByAccessibilityId("Verify Line Sets");
  }

  WebElement getReportDirectoryMaintenanceButton(){
    return driver.findElementByAccessibilityId("Report Directory Maintenance");
  }

  WebElement getReportDirectoryListButton(){
    return driver.findElementByAccessibilityId("Report Directory List");
  }

  WebElement getSpecificationCrossReferenceButton(){
    return driver.findElementByAccessibilityId("Specification Cross Reference");
  }

  WebElement getSharedReportingButton(){
    return driver.findElementByAccessibilityId("Shared Reporting");
  }

  WebElement getMultipleReportingButton(){
    return driver.findElementByAccessibilityId("Multiple Reporting");
  }

  WebElement getCompanyNumber(){
    return driver.findElementByAccessibilityId("COMPNUM_01_I_8")
            .findElement(By.xpath(GeneralLedgerConstant.Edit));
  }

  WebElement getAddButton(){
    return driver.findElementByAccessibilityId("PFKEY01_01_F_2");
  }

  WebElement getCompanyName(){
    return driver.findElementByAccessibilityId("NAME_01_F_11")
            .findElement(By.xpath(GeneralLedgerConstant.Edit));
  }

  WebElement getCompanyAddress(){
    return driver.findElementByAccessibilityId("ADDRESS1_01_F_16")
            .findElement(By.xpath(GeneralLedgerConstant.Edit));
  }

  WebElement getCompanyTelephone(){
    return driver.findElementByAccessibilityId("TELEPHON_01_F_27")
            .findElement(By.xpath(GeneralLedgerConstant.Edit));
  }

  WebElement getSaveButton(){
    return driver.findElementByAccessibilityId("PFKEY00_01_F_1");
  }

  WebElement getChangeButton(){
    return driver.findElementByAccessibilityId("PFKEY02_01_F_3");
  }

  WebElement getCompanyCity(){
    return driver.findElementByAccessibilityId("CITY_01_F_20");
  }

  WebElement getDeleteButton(){
    return driver.findElementByAccessibilityId("PFKEY03_01_F_4");
  }

  WebElement getConfirmDeleteButton(){
    return driver.findElementByAccessibilityId("PFKEY17_01_F_3");
  }
}
