package CEF.Base;



import io.appium.java_client.windows.WindowsDriver;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import CEF.POM.ManageEntities.ManageEntitiesPOM;
import CEF.Utils.PackageProperties;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
public class PomBase extends TestBase {
 
  private DesiredCapabilities rootCapabilities = new DesiredCapabilities();
  private static LocatorBase locator = new LocatorBase();
  public static String[] title = new String[10];
  

  public WindowsDriver startCEF(String appPath){
    try {
       rootCapabilities.setCapability("app", "Root");
      WindowsDriver desktopSession = null;
     desktopSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), rootCapabilities);
     
      desktopSession.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      desktopSession.findElementByClassName("Start").click();
      desktopSession.findElementByAccessibilityId("SearchTextBox").sendKeys("CEF Client");
      
     if(desktopSession.findElementsByName("CEF Client, App, Press right to switch preview").size() > 0) {
    	  desktopSession.findElementByName("CEF Client, App, Press right to switch preview").click();
      }
      else if (desktopSession.findElementsByName("CEF Client, Desktop app").size()>0) {
    	  desktopSession.findElementByName("CEF Client, Desktop app").click();
      }
      else {
    	  desktopSession.findElement(By.xpath(".//*[contains(@Name,'CEF Client,')]")).click();
    	 
      }
      
      WebElement arcMapWindow;
      WebElement session = desktopSession.findElementByName("User Logon");

      arcMapWindow = session;
      String arcMapTopLevelWindowHandle = arcMapWindow.getAttribute("NativeWindowHandle");
      arcMapTopLevelWindowHandle = Integer.toHexString(Integer.parseInt(arcMapTopLevelWindowHandle));
      DesiredCapabilities appCapabilities = new DesiredCapabilities();
      appCapabilities.setCapability("appTopLevelWindow", arcMapTopLevelWindowHandle);
      driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), appCapabilities);
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }catch(Exception e){
      e.printStackTrace();
    }
    return driver;
  }

  @Step("Closing CEF")
public
  void closeCEF(){
    driver.closeApp();
    driver.quit();
  }

  @Step("Sign in to CEF")
public
  WindowsDriver signInCEF(WindowsDriver driver) throws IOException{
	  if(isCEFRunning(driver)!=true) {
		  String CEFPath = PackageProperties.GetProperty("CEFPath");
		  driver = startCEF(CEFPath);
	  }
	  ManageEntitiesPOM manageEntitiesPOM = new ManageEntitiesPOM();
	 String Entity=PackageProperties.GetProperty("Entity");
	  manageEntitiesPOM.selectEntity(Entity);
	  driver=  getWindowByName("User Logon");
    driver.findElementByAccessibilityId("SignInButton").click();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.textToBePresentInElement(driver.findElementByAccessibilityId("SignInButton"),
            "CONTINUE"));
    driver.findElementByAccessibilityId("SignInButton").click();

    rootCapabilities.setCapability("app", "Root");
    WindowsDriver desktopSession = null;
    try {
      desktopSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), rootCapabilities);
      desktopSession.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      driver=  getWindowByName("Computron Financials 16.0");
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
     return driver;
  }
  
  public boolean isCEFRunning(WindowsDriver driver) throws MalformedURLException {
	  rootCapabilities.setCapability("app", "Root");
	  driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), rootCapabilities);
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  if(driver.findElementsByName("User Logon").size()>0) {
			return true;	
		}
	
	  else {
		  return false;
	  }
	  
  }
  
  
  public void signOutCEF(WindowsDriver driver) throws IOException{
	  driver=  getWindowByName("Computron Financials 16.0");
	  driver.findElementByName("Sign off").click();
	try {
	  if(driver.findElementsByName("Yes").size()>0) {
			driver.findElementByName("Yes").click();	
		}
	}
	catch(Exception e){
		//do nothing
	}
  }
 	  
  @Step("Navigating to tab {0}")
  public void navigateToTab(String tab){
    switch (tab){
      case "General Ledger": locator.getGeneralLedgerButton().click();
        break;
      case "Accounts Payable": locator.getAccountsPayableButton().click();
        break;
      case "Accounts Receivable": locator.getAccountsReceivableButton().click();
        break;
      case "Time Billing": locator.getTimeBillingButton().click();
        break;
      case "VAT Module": locator.getVATModuleButton().click();
        break;
      case "Purchasing": locator.getPurchasingButton().click();
        break;
      case "Fixed Assets": locator.getFixedAssetsButton().click();
        break;
      case "Universal Utilities": locator.getUniversalUtilitiesButton().click();
        break;
      case "Job Processor": locator.getJobProcessorButton().click();
        break;
      case "Workflow": locator.getWorkflowButton().click();
        break;
      case "Inventory": locator.getInventoryButton().click();
        break;
      case "Epic Report Query Generator": locator.getEpicReportQueryGeneratorButton().click();
        break;
      case "Home": locator.getHomeButton().click();
        break;
    }

  }
  
	public void killCEFCLientFromTaskBar(WindowsDriver driver) throws InterruptedException, MalformedURLException {
		
		Thread.sleep(1000);
		rootCapabilities.setCapability("app", "Root");
		driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), rootCapabilities);
		Actions actions = new Actions(driver);
		WebElement elementLocator =  driver.findElementByAccessibilityId("C:\\CEFClient\\CSNet\\CEFClient.exe");
		actions.contextClick(elementLocator).perform();
		Thread.sleep(1000);
						
		if(driver.findElementsByName("Close window").size()>0) {
			driver.findElementByName("Close window").click();
		}
		else {
			driver.findElementByName("Close all windows").click();
		}
		if(driver.findElementsByName("Yes").size()>0) {
			driver.findElementByName("Yes").click();	
	}			
}

  public void clickRunAnyProgram(){
    locator.getRunAnyProgramButton().click();
  }

  public void clickPrintQueue(){
    locator.getPrintQueueButton().click();
  }

  public void clickChangeDBMap(){
    locator.getChangeDBButton().click();
  }

  public void clickUserDefault(){
    locator.getUserDefaultButton().click();
  }

  public void clickUserPreferences(){
    locator.getUserPreferenceButton().click();
  }

  public void clickCustomization(){
    locator.getCustomizationButton().click();
  }

  public String getMenuNavigationText(){
    List<WebElement> menuNaviItems = locator.getMenuNavigatorItems();
    String menu = "";
    for (WebElement menuNaviItem:menuNaviItems){
      menu = menu + menuNaviItem.getText() + " > ";
    }
    return menu;
  }

  public void goToParentMenu(){
    List<WebElement> menuNaviItems = locator.getMenuNavigatorItems();
    if(menuNaviItems.size()>1){
      menuNaviItems.get(menuNaviItems.size()-2).click();
    }
  }

  public int getReportLevel(){
    return locator.getMenuNavigatorItems().size();
  }

  public void getInternalMenuCode(){
    List<WebElement> menuItems = locator.getAllMenuDisplay();
    int limit = menuItems.size();
    for(int i=0;i<limit;i++){
      WebElement menuItem = menuItems.get(i);
      menuItem.click();
      if(getReportLevel()>1){
        List<WebElement> childMenuItems = locator.getAllMenuDisplay();
        for(WebElement childMenuItem:childMenuItems){
          String function = "WebElement get" + childMenuItem.getAttribute("AutomationId").replace(" ", "")
                  .replace("-","").replace("/","").replace("&","And")+
                  "Button(){\n\treturn driver.findElementByAccessibilityId(\"" + childMenuItem.getAttribute("AutomationId") +
                  "\");\n}\n";
          System.out.println(function);
        }
        goToParentMenu();
        menuItems = locator.getAllMenuDisplay();
      }
    }
  }

  public void getMenuCode(){
    List<WebElement> menuItems = locator.getAllMenuDisplay();
    for(WebElement menuItem:menuItems){
      String function = "WebElement get" + menuItem.getAttribute("AutomationId").replace(" ", "")
              .replace("-","").replace("/","").replace("&","And")+
              "Button(){\n\treturn driver.findElementByAccessibilityId(\"" + menuItem.getAttribute("AutomationId") +
              "\");\n}\n";
      System.out.println(function);
   }
  }

  public WindowsDriver getWindowByName(String windowName){
    rootCapabilities.setCapability("app", "Root");
    WindowsDriver desktopSession = null;
    try {
      desktopSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), rootCapabilities);
      desktopSession.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      WebElement arcMapWindow;
      WebElement session = desktopSession.findElementByName(windowName);

      arcMapWindow = session;
      String arcMapTopLevelWindowHandle = arcMapWindow.getAttribute("NativeWindowHandle");
      arcMapTopLevelWindowHandle = Integer.toHexString(Integer.parseInt(arcMapTopLevelWindowHandle));
      DesiredCapabilities appCapabilities = new DesiredCapabilities();
      appCapabilities.setCapability("appTopLevelWindow", arcMapTopLevelWindowHandle);
      driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), appCapabilities);
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
   // locator.setDriver(driver);
    return driver;
  }

  public void closeWindow(){
    locator.getCloseWindowElement().click();
  }

  public String getStatus(){
	  System.out.println(driver.getTitle()+"@@@@@@@@@@@@@@1");
    return locator.getStatusBar().getText();
  }

  public void waitForWindowToAppear(String windowName){
	    WebDriverWait wait = new WebDriverWait(driver, 60);
	    
	    try{
	      wait.until(ExpectedConditions.titleIs(windowName));
	      wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAccessibilityId(windowName)));
	    }
	    catch (TimeoutException ex){
	      log.info("Element already stale");
	    }
	  }
  public void waitForWindowDisappear(WebElement elementToCheck){
    WebDriverWait wait = new WebDriverWait(driver, 2);
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    try{
      wait.until(ExpectedConditions
              .stalenessOf(elementToCheck));
    }
    catch (TimeoutException ex){
      log.info("Element already stale");
    }
  }
  
  
}
