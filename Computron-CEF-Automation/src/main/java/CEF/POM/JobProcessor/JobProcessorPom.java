package CEF.POM.JobProcessor;

import CEF.Base.PomBase;
import io.appium.java_client.windows.WindowsDriver;

public class JobProcessorPom extends PomBase {
  JobProcessorLocator locator;
  public JobProcessorPom(WindowsDriver crmDriver) {
    super(crmDriver);
    locator = new JobProcessorLocator(driver);
  }
}
