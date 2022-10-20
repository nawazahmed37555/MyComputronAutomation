package CEF.Base;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class LocatorBase extends TestBase{

  WebElement getHomeButton(){
    return driver.findElementByAccessibilityId("btnHome");
  }

  public WebElement getGeneralLedgerButton(){
    //return driver.findElementByAccessibilityId("btnMenu1");
	  return driver.findElementByName("General Ledger");
   
  }
public
  WebElement getAccountsPayableButton(){
   // return driver.findElementByAccessibilityId("btnMenu2");
    return driver.findElementByName("Accounts Payable");
    
  }
public
  WebElement getAccountsReceivableButton(){
    return driver.findElementByName("Accounts Receivable");
  }
public
  WebElement getTimeBillingButton(){
    return driver.findElementByName("Time Billing");
  }
public
  WebElement getVATModuleButton(){
    return driver.findElementByName("VAT Module");
  }
public
  WebElement getPurchasingButton(){
    return driver.findElementByName("Purchasing");
  }
public
  WebElement getFixedAssetsButton(){
    return driver.findElementByName("Fixed Assets");
  }
public
  WebElement getUniversalUtilitiesButton(){
    return driver.findElementByName("Universal Utilities");
  }
public
  WebElement getJobProcessorButton(){
    return driver.findElementByName("Job Processor");
  }
public
  WebElement getWorkflowButton(){
    return driver.findElementByName("Workflow");
  }
public
  WebElement getInventoryButton(){
    return driver.findElementByName("Inventory");
  }
public
  WebElement getEpicReportQueryGeneratorButton(){
    return driver.findElementByName("Epic Report & Query Generator");
  }
public
  WebElement getRunAnyProgramButton(){
    return driver.findElementByAccessibilityId("But_RunAnyProg");
  }
public
  WebElement getPrintQueueButton(){
    return driver.findElementByAccessibilityId("But_PrntQueue");
  }
public
  WebElement getChangeDBButton(){
    return driver.findElementByAccessibilityId("But_ChangeDB");
  }
public
  WebElement getUserDefaultButton(){
    return driver.findElementByAccessibilityId("But_UserDef");
  }
public
  WebElement getUserPreferenceButton(){
    return driver.findElementByAccessibilityId("But_UserPref");
  }
public
  WebElement getCustomizationButton(){
    return driver.findElementByAccessibilityId("But_Customization");
  }
public
  WebElement getMenuNavigator(){
    return driver.findElementByAccessibilityId("MenuNav");
  }
public
  List<WebElement> getMenuNavigatorItems(){
    return getMenuNavigator().findElements(By.xpath(ConstantBase.Text));
  }
public
  List<WebElement> getAllMenuDisplay(){
    return driver.findElementByAccessibilityId("MenuDisplay")
            .findElements(By.xpath("//*[attribute::LocalizedControlType='button' " +
                    "and attribute::ClassName='Tile']"));
  }
public
  WebElement getCloseWindowElement(){
    return driver.findElementByAccessibilityId("TitleBar")
            .findElement(By.name("Close"));
  }
public
  WebElement getStatusBar(){
    return driver.findElementByAccessibilityId("StatusBar1")
    		.findElement(By.xpath(ConstantBase.Text));
  }

}
