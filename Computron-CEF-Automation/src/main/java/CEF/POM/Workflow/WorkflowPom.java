package CEF.POM.Workflow;

import CEF.Base.PomBase;
import io.appium.java_client.windows.WindowsDriver;

public class WorkflowPom extends PomBase {
  WorkflowLocator locator;
  public WorkflowPom(WindowsDriver crmDriver) {
    super(crmDriver);
    locator = new WorkflowLocator(driver);
  }
}
