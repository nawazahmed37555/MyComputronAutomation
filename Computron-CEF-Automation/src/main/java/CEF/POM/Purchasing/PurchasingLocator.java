package CEF.POM.Purchasing;

import CEF.Base.LocatorBase;
import io.appium.java_client.windows.WindowsDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
@Slf4j
class PurchasingLocator extends LocatorBase {
  PurchasingLocator(WindowsDriver CrmDriver) {
    super(CrmDriver);
  }

  WebElement getPOMatchingModuleButton(){
    return driver.findElementByAccessibilityId("PO Matching Module");
  }

  WebElement getPOProcessingModuleButton(){
    return driver.findElementByAccessibilityId("PO Processing Module");
  }

  WebElement getRequisitioningModuleButton(){
    return driver.findElementByAccessibilityId("Requisitioning Module");
  }

  WebElement getItemFileProcessingModuleButton(){
    return driver.findElementByAccessibilityId("Item File Processing Module");
  }

  WebElement getBillOfMaterialsMenuButton(){
    return driver.findElementByAccessibilityId("Bill Of Materials Menu");
  }

  WebElement getBidsAndQuotesMenuButton(){
    return driver.findElementByAccessibilityId("Bids & Quotes Menu");
  }

  WebElement getPOSystemAdministratorButton(){
    return driver.findElementByAccessibilityId("PO System Administrator");
  }

  /*Level 2 menu locators*/

  WebElement getPOVoucherMaintenanceMenuButton(){
    return driver.findElementByAccessibilityId("PO Voucher Maintenance Menu");
  }

  WebElement getManualAssignmentRCtoICButton(){
    return driver.findElementByAccessibilityId("Manual Assignment(RC to IC)");
  }

  WebElement getInvoiceMatchingProcessButton(){
    return driver.findElementByAccessibilityId("Invoice Matching Process");
  }

  WebElement getProblemResolutionInquiryButton(){
    return driver.findElementByAccessibilityId("Problem Resolution/Inquiry");
  }

  WebElement getEarlyWarningReportingButton(){
    return driver.findElementByAccessibilityId("Early Warning Reporting");
  }

  WebElement getPOTablesMaintenanceButton(){
    return driver.findElementByAccessibilityId("PO Tables Maintenance");
  }

  WebElement getPurchaseOrderMaintenanceButton(){
    return driver.findElementByAccessibilityId("Purchase Order Maintenance");
  }

  WebElement getQuickPOMaintenanceButton(){
    return driver.findElementByAccessibilityId("Quick PO Maintenance");
  }

  WebElement getReceiverMaintenanceButton(){
    return driver.findElementByAccessibilityId("Receiver Maintenance");
  }

  WebElement getPurchaseOrderZoomInquiryButton(){
    return driver.findElementByAccessibilityId("Purchase Order Zoom Inquiry");
  }

  WebElement getReceiverZoomInquiryButton(){
    return driver.findElementByAccessibilityId("Receiver Zoom Inquiry");
  }

  WebElement getPOVoucherZoomMenuButton(){
    return driver.findElementByAccessibilityId("PO Voucher Zoom Menu");
  }

  WebElement getPOProcessPrintButton(){
    return driver.findElementByAccessibilityId("PO Process/Print");
  }

  WebElement getPOReportingMenuButton(){
    return driver.findElementByAccessibilityId("PO Reporting Menu");
  }

  WebElement getPOGENEXExternalInterfacesButton(){
    return driver.findElementByAccessibilityId("PO GENEX - External Interfaces");
  }

  WebElement getRQTablesMaintenanceButton(){
    return driver.findElementByAccessibilityId("RQ Tables Maintenance");
  }

  WebElement getRequisitionMaintenanceButton(){
    return driver.findElementByAccessibilityId("Requisition Maintenance");
  }

  WebElement getCatalogMaintenanceButton(){
    return driver.findElementByAccessibilityId("Catalog Maintenance");
  }

  WebElement getSearchPathMaintenanceButton(){
    return driver.findElementByAccessibilityId("Search Path Maintenance");
  }

  WebElement getBuyerSourcingFacilityButton(){
    return driver.findElementByAccessibilityId("Buyer Sourcing Facility");
  }

  WebElement getRequisitionPOConversionButton(){
    return driver.findElementByAccessibilityId("Requisition/PO Conversion");
  }

  WebElement getBuyerReRoutingFacilityButton(){
    return driver.findElementByAccessibilityId("Buyer Re-Routing Facility");
  }

  WebElement getRequisitionZoomInqListButton(){
    return driver.findElementByAccessibilityId("Requisition Zoom Inq/List");
  }

  WebElement getCatalogZoomInquiryListButton(){
    return driver.findElementByAccessibilityId("Catalog Zoom Inquiry/List");
  }

  WebElement getCatalogGENEXButton(){
    return driver.findElementByAccessibilityId("Catalog GENEX");
  }

  WebElement getRequisitionGENEXButton(){
    return driver.findElementByAccessibilityId("Requisition GENEX");
  }

  WebElement getRequisitionPOBatchConvButton(){
    return driver.findElementByAccessibilityId("Requisition/PO Batch Conv");
  }

  WebElement getProcurementCatalogProcessButton(){
    return driver.findElementByAccessibilityId("Procurement Catalog Process");
  }

  WebElement getItemTablesMaintenanceButton(){
    return driver.findElementByAccessibilityId("Item Tables Maintenance");
  }

  WebElement getItemFileMaintenanceButton(){
    return driver.findElementByAccessibilityId("Item File Maintenance");
  }

  WebElement getMassChangeItemMaintButton(){
    return driver.findElementByAccessibilityId("Mass Change Item Maint");
  }

  WebElement getItemZoomInquiryListButton(){
    return driver.findElementByAccessibilityId("Item Zoom Inquiry/List");
  }

  WebElement getItemGenexButton(){
    return driver.findElementByAccessibilityId("Item Genex");
  }

  WebElement getBillOfMaterialMaintenanceButton(){
    return driver.findElementByAccessibilityId("Bill Of Material Maintenance");
  }

  WebElement getBOMVerificationProcessingButton(){
    return driver.findElementByAccessibilityId("BOM Verification Processing");
  }

  WebElement getPOSystemParametersButton(){
    return driver.findElementByAccessibilityId("PO System Parameters");
  }

  WebElement getBidTablesMaintenanceButton(){
    return driver.findElementByAccessibilityId("Bid Tables Maintenance");
  }

  WebElement getBidMaintenanceButton(){
    return driver.findElementByAccessibilityId("Bid Maintenance");
  }

  WebElement getVendorRosterMaintenanceButton(){
    return driver.findElementByAccessibilityId("Vendor Roster Maintenance");
  }

  WebElement getQuoteMaintenanceButton(){
    return driver.findElementByAccessibilityId("Quote Maintenance");
  }

  WebElement getBidZoomInquiryButton(){
    return driver.findElementByAccessibilityId("Bid Zoom Inquiry");
  }

  WebElement getVendorSelectionButton(){
    return driver.findElementByAccessibilityId("Vendor Selection");
  }

  WebElement getBidProcessPrintButton(){
    return driver.findElementByAccessibilityId("Bid Process/Print");
  }

  WebElement getBidAwardingProcessButton(){
    return driver.findElementByAccessibilityId("Bid Awarding Process");
  }

  WebElement getBidAwardingWithoutPOButton(){
    return driver.findElementByAccessibilityId("Bid Awarding Without PO");
  }

  WebElement getRequisitionBidBatchConvButton(){
    return driver.findElementByAccessibilityId("Requisition/Bid Batch Conv");
  }

  WebElement getBidGenexButton(){
    return driver.findElementByAccessibilityId("Bid Genex");
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

  WebElement getPOFilesSoftkeyReconstructButton(){
    return driver.findElementByAccessibilityId("PO Files Softkey Reconstruct");
  }

  WebElement getPOAuditReportsButton(){
    return driver.findElementByAccessibilityId("PO Audit Reports");
  }

  WebElement getPOPurgeFunctionsMenuButton(){
    return driver.findElementByAccessibilityId("PO Purge Functions Menu");
  }

  WebElement getPOCLOSEProcessPrintButton(){
    return driver.findElementByAccessibilityId("PO CLOSE Process/Print");
  }

  WebElement getPOCANCELProcessPrintButton(){
    return driver.findElementByAccessibilityId("PO CANCEL Process/Print");
  }

  WebElement getRQCANCELProcessPrintButton(){
    return driver.findElementByAccessibilityId("RQ CANCEL Process/Print");
  }

  WebElement getUniversalUtilitiesButton(){
    return driver.findElementByAccessibilityId("Universal Utilities");
  }

  WebElement getEPICinPOButton(){
    return driver.findElementByAccessibilityId("EPIC in PO");
  }

}
