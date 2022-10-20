package CEF.POM.Purchasing;

import CEF.Base.PomBase;
import io.appium.java_client.windows.WindowsDriver;

public class PurchasingPom extends PomBase {
  PurchasingLocator locator;
  public PurchasingPom(WindowsDriver crmDriver) {
    super(crmDriver);
    locator = new PurchasingLocator(driver);
  }
}
