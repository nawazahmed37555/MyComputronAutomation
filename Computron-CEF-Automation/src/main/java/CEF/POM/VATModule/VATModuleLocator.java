package CEF.POM.VATModule;

import CEF.Base.LocatorBase;
import io.appium.java_client.windows.WindowsDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
@Slf4j
class VATModuleLocator extends LocatorBase {
  VATModuleLocator(WindowsDriver CrmDriver) {
    super(CrmDriver);
  }

  WebElement getVATCompanyParametersMaintButton(){
    return driver.findElementByAccessibilityId("VAT Company Parameters Maint");
  }

  WebElement getCompanyParametersInqListButton(){
    return driver.findElementByAccessibilityId("Company Parameters Inq/List");
  }

  WebElement getRateMaintenanceButton(){
    return driver.findElementByAccessibilityId("Rate Maintenance");
  }

  WebElement getRateInquiryListButton(){
    return driver.findElementByAccessibilityId("Rate Inquiry/List");
  }

  WebElement getVATMiscCodesMenuButton(){
    return driver.findElementByAccessibilityId("VAT Misc Codes Menu");
  }

  WebElement getNewRateMaintenanceButton(){
    return driver.findElementByAccessibilityId("New Rate Maintenance");
  }

  WebElement getNewRateInquiryListButton(){
    return driver.findElementByAccessibilityId("New Rate Inquiry/List");
  }

  WebElement getGENEXExternalInterfaceButton(){
    return driver.findElementByAccessibilityId("GENEX External Interface");
  }

  WebElement getDetailMaintenanceButton(){
    return driver.findElementByAccessibilityId("Detail Maintenance");
  }

  WebElement getDetailInquiryListButton(){
    return driver.findElementByAccessibilityId("Detail Inquiry/List");
  }

  WebElement getVATProcessEditAndUpdateButton(){
    return driver.findElementByAccessibilityId("VAT Process Edit & Update");
  }

  WebElement getWithholdingInquiryListButton(){
    return driver.findElementByAccessibilityId("Withholding Inquiry/List");
  }

  WebElement getWithholdingProcessPrintButton(){
    return driver.findElementByAccessibilityId("Withholding Process/Print");
  }

  WebElement getVATSystemAdministratorButton(){
    return driver.findElementByAccessibilityId("VAT System Administrator");
  }

  WebElement getVATStandaloneMenuButton(){
    return driver.findElementByAccessibilityId("VAT Standalone Menu");
  }

  /*Level 2 menu locators*/

  WebElement getRateReportingCodeButton(){
    return driver.findElementByAccessibilityId("Rate Reporting Code");
  }

  WebElement getRateReportCodeInqListButton(){
    return driver.findElementByAccessibilityId("Rate Report Code Inq/List");
  }

  WebElement getMiscellaneousReportCode1Button(){
    return driver.findElementByAccessibilityId("Miscellaneous Report Code 1");
  }

  WebElement getMiscReportCode1InqListButton(){
    return driver.findElementByAccessibilityId("Misc Report Code 1 Inq/List");
  }

  WebElement getMiscellaneousReportCode2Button(){
    return driver.findElementByAccessibilityId("Miscellaneous Report Code 2");
  }

  WebElement getMiscReportCode2InqListButton(){
    return driver.findElementByAccessibilityId("Misc Report Code 2 Inq/List");
  }

  WebElement getMiscellaneousReportCode3Button(){
    return driver.findElementByAccessibilityId("Miscellaneous Report Code 3");
  }

  WebElement getMiscReportCode3InqListButton(){
    return driver.findElementByAccessibilityId("Misc Report Code 3 Inq/List");
  }

  WebElement getExternalSourceMaintenanceButton(){
    return driver.findElementByAccessibilityId("External Source Maintenance");
  }

  WebElement getVATDetailINButton(){
    return driver.findElementByAccessibilityId("VAT Detail - IN");
  }

  WebElement getVATGlobalParametersMaintButton(){
    return driver.findElementByAccessibilityId("VAT Global Parameters Maint");
  }

  WebElement getVATGlobalParametersInqListButton(){
    return driver.findElementByAccessibilityId("VAT Global Parameters Inq/List");
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

  WebElement getVATPurgeButton(){
    return driver.findElementByAccessibilityId("VAT Purge");
  }

  WebElement getUniversalUtilitiesButton(){
    return driver.findElementByAccessibilityId("Universal Utilities");
  }

  WebElement getEPICinVATButton(){
    return driver.findElementByAccessibilityId("EPIC in VAT");
  }

  WebElement getVATCompanyFileMaintenanceButton(){
    return driver.findElementByAccessibilityId("VAT Company File Maintenance");
  }

  WebElement getVATCompanyFileInqListButton(){
    return driver.findElementByAccessibilityId("VAT Company File Inq/List");
  }

  WebElement getVATCalendarCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("VAT Calendar Code Maintenance");
  }

  WebElement getVATCalendarCodeInqListButton(){
    return driver.findElementByAccessibilityId("VAT Calendar Code Inq/List");
  }

  WebElement getVATCalendarYearMaintenanceButton(){
    return driver.findElementByAccessibilityId("VAT Calendar Year Maintenance");
  }

  WebElement getVATCalendarYearInqListButton(){
    return driver.findElementByAccessibilityId("VAT Calendar Year Inq/List");
  }


}
