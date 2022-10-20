package CEF.POM.JobProcessor;

import CEF.Base.LocatorBase;
import io.appium.java_client.windows.WindowsDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
@Slf4j
class JobProcessorLocator extends LocatorBase {
  JobProcessorLocator(WindowsDriver CrmDriver) {
    super(CrmDriver);
  }

  WebElement getJobSchedulerCodeListMntButton(){
    return driver.findElementByAccessibilityId("Job Scheduler Code List Mnt");
  }

  WebElement getJobSchedulerDirectoryMntButton(){
    return driver.findElementByAccessibilityId("Job Scheduler Directory Mnt");
  }

  WebElement getJobSchedulerDirectoryILButton(){
    return driver.findElementByAccessibilityId("Job Scheduler Directory I/L");
  }

  WebElement getUserCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("User Code Maintenance");
  }

  WebElement getUserDistributionListMntButton(){
    return driver.findElementByAccessibilityId("User Distribution List Mnt");
  }

  WebElement getUserDistributionListILButton(){
    return driver.findElementByAccessibilityId("User Distribution List I/L");
  }

  WebElement getJobProcessorButton(){
    return driver.findElementByAccessibilityId("Job Processor");
  }

  WebElement getAuditProcessorButton(){
    return driver.findElementByAccessibilityId("Audit Processor");
  }

  WebElement getReturnCodeInquiryListButton(){
    return driver.findElementByAccessibilityId("Return Code Inquiry/List");
  }

  WebElement getJobSchedulerApplicationsButton(){
    return driver.findElementByAccessibilityId("Job Scheduler  Applications");
  }

  /*Level 2 menu locators*/

  WebElement getDistributionCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Distribution Code Maintenance");
  }

  WebElement getDistributionCodeListButton(){
    return driver.findElementByAccessibilityId("Distribution Code List");
  }

  WebElement getGlobalAlphaCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Global Alpha Code Maintenance");
  }

  WebElement getGlobalAlphaCodeListButton(){
    return driver.findElementByAccessibilityId("Global Alpha Code List");
  }

  WebElement getGlobalDateCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Global Date Code Maintenance");
  }

  WebElement getGlobalDateCodeListButton(){
    return driver.findElementByAccessibilityId("Global Date Code List");
  }

  WebElement getGlobalFiscalCodeMaintButton(){
    return driver.findElementByAccessibilityId("Global Fiscal Code Maint");
  }

  WebElement getGlobalFiscalCodeListButton(){
    return driver.findElementByAccessibilityId("Global Fiscal Code List");
  }

  WebElement getApplicationCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Application Code Maintenance");
  }

  WebElement getApplicationCodeListButton(){
    return driver.findElementByAccessibilityId("Application Code List");
  }

  WebElement getFrequencyCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Frequency Code Maintenance");
  }

  WebElement getFrequencyCodeListButton(){
    return driver.findElementByAccessibilityId("Frequency Code List");
  }

  WebElement getJobCategoryCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Job Category Code Maintenance");
  }

  WebElement getJobCategoryCodeListButton(){
    return driver.findElementByAccessibilityId("Job Category Code List");
  }

  WebElement getJobSchedulerinAPButton(){
    return driver.findElementByAccessibilityId("Job Scheduler in AP");
  }

  WebElement getJobSchedulerinARButton(){
    return driver.findElementByAccessibilityId("Job Scheduler in AR");
  }

  WebElement getJobSchedulerinDIButton(){
    return driver.findElementByAccessibilityId("Job Scheduler in DI");
  }

  WebElement getJobSchedulerinFAButton(){
    return driver.findElementByAccessibilityId("Job Scheduler in FA");
  }

  WebElement getJobSchedulerinGLButton(){
    return driver.findElementByAccessibilityId("Job Scheduler in GL");
  }

  WebElement getJobSchedulerinINVButton(){
    return driver.findElementByAccessibilityId("Job Scheduler in INV");
  }

  WebElement getJobSchedulerinPOButton(){
    return driver.findElementByAccessibilityId("Job Scheduler in PO");
  }

  WebElement getJobSchedulerinTBButton(){
    return driver.findElementByAccessibilityId("Job Scheduler in TB");
  }

  WebElement getJobSchedulerinVATButton(){
    return driver.findElementByAccessibilityId("Job Scheduler in VAT");
  }


}
