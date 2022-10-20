package CEF.POM.EpicReportQueryGenerator;

import CEF.Base.LocatorBase;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.WebElement;

class EpicReportQueryLocator extends LocatorBase {
  EpicReportQueryLocator(WindowsDriver CrmDriver) {
    super(CrmDriver);
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
