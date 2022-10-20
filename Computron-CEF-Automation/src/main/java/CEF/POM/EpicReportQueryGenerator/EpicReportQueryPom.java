package CEF.POM.EpicReportQueryGenerator;

import CEF.Base.PomBase;
import io.appium.java_client.windows.WindowsDriver;

public class EpicReportQueryPom extends PomBase {
  EpicReportQueryLocator locator;
  public EpicReportQueryPom(WindowsDriver crmDriver) {
    super(crmDriver);
    locator = new EpicReportQueryLocator(driver);
  }
}
