package CEF.POM.UniversalUtilities;

import CEF.Base.PomBase;
import io.appium.java_client.windows.WindowsDriver;

public class UniversalUtilitiesPom extends PomBase {
  UniversalUtilitiesLocator locator;
  public UniversalUtilitiesPom(WindowsDriver crmDriver) {
    super(crmDriver);
    locator = new UniversalUtilitiesLocator(driver);
  }
}
