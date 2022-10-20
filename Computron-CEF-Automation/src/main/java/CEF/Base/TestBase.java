package CEF.Base;

import CEF.Utils.PackageProperties;
import io.appium.java_client.windows.WindowsDriver;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

@Slf4j
public class TestBase {
  public static WindowsDriver driver = null;
  public PomBase base;
  static Process p;
  
  
  @BeforeSuite 
  public void startWinAppDriver() throws IOException {
	//Launch WinAppDriver application
	  try{		 
		  String winAppDriverPath = PackageProperties.GetProperty("winAppDriverPath");
		  ProcessBuilder builder = new ProcessBuilder(winAppDriverPath).inheritIO();
			p=builder.start();
			Reporter.log("WinAppdriver started");
	  }
	  catch (Exception ex) {
	      Reporter.log("WinAppdriver can not be started");
	      Assert.fail();
	    }
	  
  }
  @BeforeSuite(dependsOnMethods="startWinAppDriver")
  public void launchCEF() {
   base = new PomBase();
    try{
      String CEFPath = PackageProperties.GetProperty("CEFPath");
      log.info(CEFPath);
      log.info("CEF starting");
      driver = base.startCEF(CEFPath);
      log.info("CEF Started");
    }
    catch (Exception ex) {
      Reporter.log("CEF can not be started");
      Assert.fail();
    }
  }

@AfterSuite
public void  killCEF() throws   InterruptedException, IOException {
	
		//base.killCEFCLientFromTaskBar(driver);
		//base.closeCEF();
	//base.signOutCEF(driver);
}

  @AfterSuite (dependsOnMethods="killCEF")
  public void tearDown(){
   
    p.destroy();
  }
}
