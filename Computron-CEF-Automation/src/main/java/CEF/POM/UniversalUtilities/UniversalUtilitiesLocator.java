package CEF.POM.UniversalUtilities;

import CEF.Base.LocatorBase;
import io.appium.java_client.windows.WindowsDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
@Slf4j
class UniversalUtilitiesLocator extends LocatorBase {
  UniversalUtilitiesLocator(WindowsDriver CrmDriver) {
    super(CrmDriver);
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

  /*Level 2 menu locators*/

  WebElement getRDBMAPMaintenanceButton(){
    return driver.findElementByAccessibilityId("RDBMAP  Maintenance");
  }

  WebElement getXMLMAPMaintenanceButton(){
    return driver.findElementByAccessibilityId("XMLMAP  Maintenance");
  }

  WebElement getUEXTMAPMaintenanceButton(){
    return driver.findElementByAccessibilityId("UEXTMAP Maintenance");
  }

  WebElement getCaptureLogFileToPrintButton(){
    return driver.findElementByAccessibilityId("Capture Log File to Print");
  }

  WebElement getLockoutUtilityButton(){
    return driver.findElementByAccessibilityId("Lockout Utility");
  }

  WebElement getLockoutInquiryButton(){
    return driver.findElementByAccessibilityId("Lockout Inquiry");
  }

  WebElement getLockoutDeleteByUserButton(){
    return driver.findElementByAccessibilityId("Lockout Delete by User");
  }

  WebElement getSystemAccessInqListButton(){
    return driver.findElementByAccessibilityId("System Access Inq/List");
  }

  WebElement getECTradingProfileButton(){
    return driver.findElementByAccessibilityId("EC Trading Profile");
  }

  WebElement getDefineDataDescriptionListButton(){
    return driver.findElementByAccessibilityId("Define Data Description List");
  }

  WebElement getDefineLogicalFilesButton(){
    return driver.findElementByAccessibilityId("Define Logical Files");
  }

  WebElement getDefineViewsButton(){
    return driver.findElementByAccessibilityId("Define Views");
  }

  WebElement getDefineNewFieldsButton(){
    return driver.findElementByAccessibilityId("Define New Fields");
  }

  WebElement getDefineSecurityButton(){
    return driver.findElementByAccessibilityId("Define Security");
  }

  WebElement getDefineReportsButton(){
    return driver.findElementByAccessibilityId("Define Reports");
  }

  WebElement getRunReportsButton(){
    return driver.findElementByAccessibilityId("Run Reports");
  }

  WebElement getReportProceduresButton(){
    return driver.findElementByAccessibilityId("Report Procedures");
  }

  WebElement getReportFilingButton(){
    return driver.findElementByAccessibilityId("Report Filing");
  }


}
