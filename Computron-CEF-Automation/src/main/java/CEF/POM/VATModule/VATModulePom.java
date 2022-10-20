package CEF.POM.VATModule;

import CEF.Base.PomBase;
import io.appium.java_client.windows.WindowsDriver;

public class VATModulePom extends PomBase {
  VATModuleLocator locator;
  public VATModulePom(WindowsDriver crmDriver) {
    super(crmDriver);
    locator = new VATModuleLocator(driver);
  }
}
