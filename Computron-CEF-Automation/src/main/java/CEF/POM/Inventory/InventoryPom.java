package CEF.POM.Inventory;

import CEF.Base.PomBase;
import io.appium.java_client.windows.WindowsDriver;

public class InventoryPom extends PomBase {
  InventoryLocator locator;
  public InventoryPom(WindowsDriver crmDriver) {
    super(crmDriver);
    locator = new InventoryLocator(driver);
  }
}
