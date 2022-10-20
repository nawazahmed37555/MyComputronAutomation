package CEF.Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import CEF.Base.LocatorBase;
import CEF.Base.PomBase;
import CEF.Base.TestBase;
import CEF.POM.GeneralLedger.GeneralLedgerLocator;
import CEF.POM.Miscellaneous.miscellaneousPOM;


public class miscellaneousTests extends TestBase {
	public PomBase pombase =new PomBase();
	public LocatorBase locatorBase = new LocatorBase();
	public miscellaneousPOM miscellaneousPOMobj = new miscellaneousPOM();
	public GeneralLedgerLocator generalLedgerLocator = new GeneralLedgerLocator();
	
	@BeforeClass
	public void beforeClass() throws IOException {
		driver = pombase.signInCEF(driver);
	}
	
	@Test(priority=0)
	public void searchProgramTest() throws IOException, InterruptedException {
		
		miscellaneousPOMobj.searchProgram("GL Company File Maintenance");
		pombase.getWindowByName(" Company File Maintenance                   ");
		driver.findElementByAccessibilityId("Close").click();

	}
	@Test(priority=1)
	public void addProgramToFavouritesTest() throws IOException, InterruptedException {
		pombase.getWindowByName("Computron Financials 16.0");
		locatorBase.getGeneralLedgerButton().click();
		generalLedgerLocator.getGLSystemParametersButton().click();
		//Click on the star button to add to favorites
		driver.findElementByXPath("//Window[@ClassName=\"Window\"][@Name=\"Computron Financials 16.0\"]/Group[@Name=\"TileLayoutControl\"][@AutomationId=\"MenuDisplay\"]/Button[@Name=\"GL Company File Maintenance\"][@AutomationId=\"GL Company File Maintenance\"]/Button").click();
		driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Computron Financials 16.0\"]/Pane[@ClassName=\"ScrollViewer\"]/Group[@Name=\"New Group 1\"][starts-with(@AutomationId,\"Group\")]/Button[2]")).click();;
		pombase.getWindowByName(" Company File Maintenance                   ");
		driver.findElementByName("Close").click();
		pombase.getWindowByName("Computron Financials 16.0");
		Actions actions = new Actions(driver);
		WebElement elementLocator =  driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Computron Financials 16.0\"]/Pane[@ClassName=\"ScrollViewer\"]/Group[@Name=\"New Group 1\"][starts-with(@AutomationId,\"Group\")]/Button[2]"));
		actions.contextClick(elementLocator).perform();
		driver.findElementByName("Delete").click();
		driver.findElementByName("OK").click();
	}
	
	
	
	@AfterClass
	public void afterClass() throws IOException {
		pombase.signOutCEF(driver);
	}
}
