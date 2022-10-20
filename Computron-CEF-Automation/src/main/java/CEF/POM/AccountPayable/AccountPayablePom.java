package CEF.POM.AccountPayable;

import CEF.Base.PomBase;
import CEF.Base.TestBase;
import io.appium.java_client.windows.WindowsDriver;

public class AccountPayablePom extends TestBase {
  AccountPayableLocator locator=new AccountPayableLocator(driver);


  public void clickOnMenu(String menu){
    switch (menu){
      case "AP System Parameters" : locator.getAPSystemParametersButton().click();
      break;
      case "Vendor Codes" : locator.getVendorCodesButton().click();
      break;
      case "Voucher Codes" : locator.getVoucherCodesButton().click();
      break;
      case "Vendor and Factor Maint" : locator.getVendorAndFactorMaintButton().click();
      break;
      case "AP Transaction Processing" : locator.getAPTransactionProcessingButton().click();
      break;
      case "Payment/Posting Functions" : locator.getPaymentPostingFunctionsButton().click();
      break;
      case "Payment and Misc Codes" : locator.getPaymentAndMiscCodesButton().click();
      break;
      case "Voucher & Register Reports" : locator.getVoucherAndRegisterReportsButton().click();
      break;
      case "History and Other Reports" : locator.getHistoryAndOtherReportsButton().click();
      break;
      case "AP GENEX - External Interfaces" : locator.getAPGENEXExternalInterfacesButton().click();
      break;
      case "AP System Administrator" : locator.getAPSystemAdministratorButton().click();
      break;
      case "GST Menu" : locator.getGSTMenuButton().click();
      break;

    }


  }

}
