package CEF.POM.FixedAssets;

import CEF.Base.PomBase;
import io.appium.java_client.windows.WindowsDriver;

public class FixedAssetsPom extends PomBase {
  FixedAssetsLocator locator;
  public FixedAssetsPom(WindowsDriver crmDriver) {
    super(crmDriver);
    locator = new FixedAssetsLocator(driver);
  }
}
