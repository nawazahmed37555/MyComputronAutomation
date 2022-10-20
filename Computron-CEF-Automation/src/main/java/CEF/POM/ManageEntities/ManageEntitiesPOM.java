package CEF.POM.ManageEntities;

import java.io.IOException;

import org.testng.annotations.Test;

import CEF.Base.PomBase;
import CEF.Base.TestBase;
import CEF.Utils.PackageProperties;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ManageEntitiesPOM extends TestBase {
	PomBase  pomBase = new PomBase();
	
	public boolean isEntityAvailable(String Entity) {
		pomBase.getWindowByName("User Logon");
		driver.findElementByAccessibilityId("ManageEntityButton").click();
		pomBase.getWindowByName("Communication Setup");
		if(driver.findElementsByName(Entity).size()>0) {
			driver.findElementByName("Close").click();
			return true;
		}
		else {
			return false;
		}
	}

public boolean addEntity(String Entity,String Host,String Port,String Type,String User,String Password) throws InterruptedException, IOException {
		//Check if the Communication Setup window is already opened, if not open it now
		if(driver.findElementsByName("Communication Setup").size()>0) {
			driver=pomBase.getWindowByName("Communication Setup");
		}
		else {
			pomBase.getWindowByName("User Logon");
			driver.findElementByAccessibilityId("ManageEntityButton").click();
			driver=pomBase.getWindowByName("Communication Setup");
		}
		
		//Check if the entity is already added, if YES then return True, if NO then add the entity
		if(driver.findElementsByName(Entity).size()>0) {
			log.info("Entity exists already");
			driver.findElementByName("Close").click();
			return true;
		}
		else {
			//Check if there is any other entity added already. If yes, click 2 times on Add button to add a new entity
			if(driver.findElementByAccessibilityId("NameTextBox").getText()!=null) {
				driver.findElementByAccessibilityId("AddButton").click();
				driver.findElementByAccessibilityId("AddButton").click();
			}
			driver.findElementByAccessibilityId("NameTextBox").clear();
			driver.findElementByAccessibilityId("NameTextBox").sendKeys(Entity);
			driver.findElementByAccessibilityId("HostTextBox").clear();
			driver.findElementByAccessibilityId("HostTextBox").sendKeys(Host);
			driver.findElementByAccessibilityId("PortTextBox").clear();
			driver.findElementByAccessibilityId("PortTextBox").sendKeys(Port);
			driver.findElementByAccessibilityId("TypeComboBox").click();
			driver.findElementByName(Type).click();
			driver.findElementByAccessibilityId("digColor").click();
			driver.findElementByAccessibilityId("BarButtonItemLinkPART_ResetButton").click();
			driver.findElementByAccessibilityId("UserTextBox").clear();
			driver.findElementByAccessibilityId("UserTextBox").sendKeys(User);
			driver.findElementByAccessibilityId("PasswordPasswordBox").clear();
			driver.findElementByAccessibilityId("PasswordPasswordBox").sendKeys(Password);
			driver.findElementByAccessibilityId("SaveButton").click();
			
			pomBase.getWindowByName("User Logon");
			driver.findElementByAccessibilityId("ManageEntityButton").click();
			pomBase.getWindowByName("Communication Setup");
			if(driver.findElementsByName(Entity).size()>0) {
				driver.findElementByAccessibilityId("SaveButton").click();
				return true;
			}
			else {
				driver.findElementByAccessibilityId("SaveButton").click();
				return false;
			}
		}
	}
	
	
	public boolean editEntity(String EntityToEdit,String newEntityName,String newHost, String newPort, String newType, String newUser, String newPassword)   {
		pomBase.getWindowByName("User Logon");
		driver.findElementByAccessibilityId("ManageEntityButton").click();
		pomBase.getWindowByName("Communication Setup");
		driver.findElementByName(EntityToEdit).click();
		
		driver.findElementByAccessibilityId("NameTextBox").clear();
		driver.findElementByAccessibilityId("NameTextBox").sendKeys(newEntityName);
		driver.findElementByAccessibilityId("HostTextBox").clear();
		driver.findElementByAccessibilityId("HostTextBox").sendKeys(newHost);
		driver.findElementByAccessibilityId("PortTextBox").clear();
		driver.findElementByAccessibilityId("PortTextBox").sendKeys(newPort);
		driver.findElementByAccessibilityId("TypeComboBox").click();
		driver.findElementByName(newType).click();
		driver.findElementByAccessibilityId("digColor").click();
		driver.findElementByAccessibilityId("BarButtonItemLinkPART_ResetButton").click();
		driver.findElementByAccessibilityId("UserTextBox").clear();
		driver.findElementByAccessibilityId("UserTextBox").sendKeys(newUser);
		driver.findElementByAccessibilityId("PasswordPasswordBox").clear();
		driver.findElementByAccessibilityId("PasswordPasswordBox").sendKeys(newPassword);
		driver.findElementByAccessibilityId("SaveButton").click();
		pomBase.getWindowByName("User Logon");
		driver.findElementByAccessibilityId("ManageEntityButton").click();
		pomBase.getWindowByName("Communication Setup");
		if(driver.findElementsByName(newEntityName).size()>0) {
			driver.findElementByAccessibilityId("SaveButton").click();
			return true;
		}
		else {
			driver.findElementByAccessibilityId("SaveButton").click();
			return false;
		}
	}
	

	public boolean deleteEntity(String EntityToDelete) {
		
		pomBase.getWindowByName("User Logon");
		driver.findElementByAccessibilityId("ManageEntityButton").click();
		pomBase.getWindowByName("Communication Setup");
		driver.findElementByName(EntityToDelete).click();
		driver.findElementByAccessibilityId("DeleteButton").click();
		driver.findElementByName("Yes").click();
		driver.findElementByAccessibilityId("SaveAllButton").click();
		if(driver.findElementsByName(EntityToDelete).size()>0) {
			driver.findElementByName("Close").click();
			return false;
		}
		else {
			driver.findElementByName("Close").click();
			return true;
		}
	}
	
	public void selectEntity(String Entity) {
		pomBase.getWindowByName("User Logon");
		driver.findElementByAccessibilityId("ManageEntityButton").click();
		pomBase.getWindowByName("Communication Setup");
		driver.findElementByName(Entity).click();
		driver.findElementByAccessibilityId("SaveButton").click();
	}
	

}
