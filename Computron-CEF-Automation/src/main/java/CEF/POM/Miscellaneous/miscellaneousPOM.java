package CEF.POM.Miscellaneous;

import org.testng.Assert;

import CEF.Base.ConstantBase;
import CEF.Base.PomBase;
import CEF.Base.TestBase;

public class miscellaneousPOM extends TestBase{
	public PomBase pombase =new PomBase();

	public boolean searchProgram(String programName) throws InterruptedException {
		pombase.getWindowByName("Computron Financials 16.0");
		driver.findElementByXPath("//Window[@ClassName=\"Window\"][@Name=\"Computron Financials 16.0\"]/StatusBar[@ClassName=\"StatusBar\"]/Button[@ClassName=\"Button\"][9]").click();
		driver.findElementByAccessibilityId("SearchComboBox").clear();
		driver.findElementByAccessibilityId("SearchComboBox").sendKeys(programName);
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("AutoFilterRow").click();
		driver.findElementByAccessibilityId("AutoFilterRow").clear();
		driver.findElementByAccessibilityId("AutoFilterRow").sendKeys(programName);
		Thread.sleep(3000);
		if(driver.findElementsByName(programName).size()>0) {
			driver.findElementByName(programName).click();
			return true;
			}
		else {
			Assert.fail("Search results not found");
			return false;
		}
	}
	
	
}
