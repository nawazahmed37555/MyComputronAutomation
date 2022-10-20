package CEF.POM.TimeBilling;

import CEF.Base.PomBase;
import io.appium.java_client.windows.WindowsDriver;

public class TimeBillingPom extends PomBase {
  private TimeBillingLocator locator;
  public TimeBillingPom(WindowsDriver crmDriver) {
    super(crmDriver);
    locator = new TimeBillingLocator(driver);
  }

  public void goToMasterFileCodesMaintButton(){
    locator.getMasterFileCodesMaintButton().click();
  }

  public void goToMasterFileMaintenanceButton(){
    locator.getMasterFileMaintenanceButton().click();
  }

  public void goTogetTBBudgetMaintenanceButton(){
    locator.getTBBudgetMaintenanceButton().click();
  }

  public void goToTBTransactionProcessingButton(){
    locator.getTBTransactionProcessingButton().click();
  }

  public void goToTBBillProcessingButton(){
    locator.getTBBillProcessingButton().click();
  }

  public void goToTBZOOMInquiryButton(){
    locator.getTBZOOMInquiryButton().click();
  }

  public void goToManagementReportsButton(){
    locator.getManagementReportsButton().click();
  }

  public void goToTBExternalInterfacesMenuButton(){
    locator.getTBExternalInterfacesMenuButton().click();
  }

  public void goToTBSystemAdministratorButton(){
    locator.getTBSystemAdministratorButton().click();
  }
}
