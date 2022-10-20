package CEF.POM.GeneralLedger;

import CEF.Base.PomBase;
import CEF.Base.TestBase;
import CEF.Utils.LoggerUtil;
import io.appium.java_client.windows.WindowsDriver;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GeneralLedgerPom extends TestBase {
  public GeneralLedgerLocator locator=new GeneralLedgerLocator();
  public PomBase pomBase=new PomBase();
  


  public void goToPowerReportWriter(){
    locator.getPowerReportWriterButton().click();
  }

  public void goToBasicAndExtended(){
    locator.getBasicAndExtendedButton().click();
  }

  public void goToPRWPRO(){
    locator.getPRWPROButton().click();
  }

  @Step("Adding new company")
  public String addNewCompany(String companyNumber, String companyName, String companyAddress, String compnayPhone){

    locator.getCompanyNumber().sendKeys(companyNumber);
    pomBase.title[1] = driver.getTitle();
    log.info("Title : " + pomBase.title[1]);
    locator.getAddButton().click();
    pomBase. waitForWindowDisappear(locator.getAddButton());

    log.info("Session id : " + driver.getSessionId().toString());
    driver = pomBase.getWindowByName(GeneralLedgerConstant.CompanyFileMaintenance);
    log.info("Session id : " + driver.getSessionId().toString());
   
    LoggerUtil.logStep("Entering company form data");
    locator.getCompanyName().click();
    locator.getCompanyName().sendKeys(companyName);
    locator.getCompanyAddress().click();
    locator.getCompanyAddress().sendKeys(companyAddress);
    locator.getCompanyTelephone().click();
    locator.getCompanyTelephone().sendKeys(compnayPhone);
    LoggerUtil.logStep("Clicking on Save button");
    locator.getSaveButton().click();
    pomBase.waitForWindowDisappear(locator.getSaveButton());
    driver = pomBase.getWindowByName(pomBase.title[1]);
    log.info(driver.getTitle()+"#########");
   // locator.setDriver(driver);
    log.info("Session id : " + driver.getSessionId().toString());
    return pomBase.getStatus();
  }

  public void openGLCompanyFileMaintenance(){
    LoggerUtil.logStep("Clicking on 'GL System Parameter'");
    locator.getGLSystemParametersButton().click();
    pomBase.title[0] = driver.getTitle();
    log.info("Title : " + pomBase.title[0]);
    locator.getGLCompanyFileMaintenanceButton().click();
    pomBase.waitForWindowDisappear(locator.getGLCompanyFileMaintenanceButton());

    driver = pomBase.getWindowByName(GeneralLedgerConstant.CompanyFileMaintenance);
  
  }

  public void closeGLCompanyFileMaintenance(){
	  pomBase.closeWindow();
    driver = pomBase.getWindowByName(pomBase.title[0]);
 
  }

  @Step("Changing company data")
  public String updateCompany(String companyNumber, String companyCity){

    locator.getCompanyNumber().sendKeys(companyNumber);
    pomBase.title[1] = driver.getTitle();
    log.info("Title : " + pomBase.title[1]);
    locator.getChangeButton().click();
    pomBase.waitForWindowDisappear(locator.getAddButton());

    driver = pomBase.getWindowByName(GeneralLedgerConstant.CompanyFileMaintenance);
    locator.getCompanyAddress().click();
    locator.getCompanyAddress().clear();
    locator.getCompanyAddress().sendKeys(companyCity);
    LoggerUtil.logStep("Clicking on Save button");
    locator.getSaveButton().click();
    pomBase.waitForWindowDisappear(locator.getSaveButton());
    driver = pomBase.getWindowByName(pomBase.title[1]);
   // locator.setDriver(driver);
    log.info("Session id : " + driver.getSessionId().toString());
    return pomBase.getStatus();
  }

  @Step("Deleting company {0}")
  public String deleteCompany(String companyNumber){
    locator.getCompanyNumber().sendKeys(companyNumber);
    pomBase.title[1] = driver.getTitle();
    log.info("Title : " + pomBase.title[1]);
    locator.getDeleteButton().click();
    pomBase.waitForWindowDisappear(locator.getAddButton());

    driver = pomBase.getWindowByName(GeneralLedgerConstant.CompanyFileMaintenance);
   // locator.setDriver(driver);
    LoggerUtil.logStep("Clicking on Confirm Delete button");
    locator.getConfirmDeleteButton().click();
    pomBase.waitForWindowDisappear(locator.getSaveButton());
    driver = pomBase.getWindowByName(pomBase.title[1]);
   // locator.setDriver(driver);
    log.info("Session id : " + driver.getSessionId().toString());
    return pomBase.getStatus();
  }

}
