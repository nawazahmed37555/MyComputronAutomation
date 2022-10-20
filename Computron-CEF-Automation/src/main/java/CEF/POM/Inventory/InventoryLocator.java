package CEF.POM.Inventory;

import CEF.Base.LocatorBase;
import io.appium.java_client.windows.WindowsDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
@Slf4j
class InventoryLocator extends LocatorBase {
  InventoryLocator(WindowsDriver CrmDriver) {
    super(CrmDriver);
  }

  WebElement getIVSystemParametersButton(){
    return driver.findElementByAccessibilityId("IV System Parameters");
  }

  WebElement getInventoryModuleButton(){
    return driver.findElementByAccessibilityId("Inventory Module");
  }

  WebElement getItemFileProcessingMenuButton(){
    return driver.findElementByAccessibilityId("Item File Processing Menu");
  }

  WebElement getBillOfMaterialsMenuButton(){
    return driver.findElementByAccessibilityId("Bill Of Materials Menu");
  }

  WebElement getPickListProcessingMenuButton(){
    return driver.findElementByAccessibilityId("Pick List Processing Menu");
  }

  WebElement getIVSystemAdministratorButton(){
    return driver.findElementByAccessibilityId("IV System Administrator");
  }

  /*Level 2 menu locators*/

  WebElement getIVCompanyParametersMaintButton(){
    return driver.findElementByAccessibilityId("IV Company Parameters Maint");
  }

  WebElement getDimensionSetMapMaintenanceButton(){
    return driver.findElementByAccessibilityId("Dimension Set Map Maintenance");
  }

  WebElement getDimensionSetMapInqListButton(){
    return driver.findElementByAccessibilityId("Dimension Set Map Inq/List");
  }

  WebElement getIVAlternateKeyMaintenanceButton(){
    return driver.findElementByAccessibilityId("IV Alternate Key Maintenance");
  }

  WebElement getIVTransactionProcessingButton(){
    return driver.findElementByAccessibilityId("IV Transaction Processing");
  }

  WebElement getPhysicalInventoryCountingButton(){
    return driver.findElementByAccessibilityId("Physical Inventory Counting");
  }

  WebElement getExtExpirationDateMaintButton(){
    return driver.findElementByAccessibilityId("Ext Expiration Date Maint");
  }

  WebElement getAccountingZoomInquiryListButton(){
    return driver.findElementByAccessibilityId("Accounting Zoom Inquiry/List");
  }

  WebElement getPhysicalZoomInquiryListButton(){
    return driver.findElementByAccessibilityId("Physical Zoom Inquiry/List");
  }

  WebElement getInventoryReportingMenuButton(){
    return driver.findElementByAccessibilityId("Inventory Reporting Menu");
  }

  WebElement getExternalInterfacesMenuButton(){
    return driver.findElementByAccessibilityId("External Interfaces Menu");
  }

  WebElement getIVTablesMaintenanceButton(){
    return driver.findElementByAccessibilityId("IV Tables Maintenance");
  }

  WebElement getItemFileMaintenanceButton(){
    return driver.findElementByAccessibilityId("Item File Maintenance");
  }

  WebElement getMassChangeItemMaintButton(){
    return driver.findElementByAccessibilityId("Mass Change Item Maint");
  }

  WebElement getItemZoomInquirylistButton(){
    return driver.findElementByAccessibilityId("Item Zoom Inquiry/list");
  }

  WebElement getItemGENEXInButton(){
    return driver.findElementByAccessibilityId("Item GENEX-In");
  }

  WebElement getBillOfMaterialMaintenanceButton(){
    return driver.findElementByAccessibilityId("Bill Of Material Maintenance");
  }

  WebElement getBOMVerificationProcessingButton(){
    return driver.findElementByAccessibilityId("BOM Verification Processing");
  }

  WebElement getPickListGenerationButton(){
    return driver.findElementByAccessibilityId("Pick List Generation");
  }

  WebElement getPickListAcknowledgementButton(){
    return driver.findElementByAccessibilityId("Pick List Acknowledgement");
  }

  WebElement getPickListReceiverEntryButton(){
    return driver.findElementByAccessibilityId("Pick List Receiver Entry");
  }

  WebElement getClearAVLPHSWKSessionButton(){
    return driver.findElementByAccessibilityId("Clear AVLPHSWK Session");
  }

  WebElement getPickListPrintReprintButton(){
    return driver.findElementByAccessibilityId("Pick List Print/Re-print");
  }

  WebElement getPickListInquiryListButton(){
    return driver.findElementByAccessibilityId("Pick List Inquiry/List");
  }

  WebElement getInventoryIssueInquiryListButton(){
    return driver.findElementByAccessibilityId("Inventory Issue Inquiry/List");
  }

  WebElement getGlobalParametersMaintListButton(){
    return driver.findElementByAccessibilityId("Global Parameters Maint/List");
  }

  WebElement getOwnerCodeMaintenanceButton(){
    return driver.findElementByAccessibilityId("Owner Code Maintenance");
  }

  WebElement getOwnerCodeInqListButton(){
    return driver.findElementByAccessibilityId("Owner Code Inq/List");
  }

  WebElement getUserProfileMaintenanceButton(){
    return driver.findElementByAccessibilityId("User Profile Maintenance");
  }

  WebElement getUserProfileInqListButton(){
    return driver.findElementByAccessibilityId("User Profile Inq/List");
  }

  WebElement getInventoryFilesSoftkeyReconsButton(){
    return driver.findElementByAccessibilityId("Inventory Files Softkey Recons");
  }

  WebElement getPickListPurgeButton(){
    return driver.findElementByAccessibilityId("Pick List Purge");
  }

  WebElement getInventoryTransactionPurgeButton(){
    return driver.findElementByAccessibilityId("Inventory Transaction Purge");
  }

  WebElement getIVAuditReportsButton(){
    return driver.findElementByAccessibilityId("IV Audit Reports");
  }

  WebElement getUniversalUtilitiesButton(){
    return driver.findElementByAccessibilityId("Universal Utilities");
  }

  WebElement getEPICinIVButton(){
    return driver.findElementByAccessibilityId("EPIC in IV");
  }
}
