package CEF.Tests;

import java.io.IOException;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import CEF.Base.TestBase;
import CEF.POM.ManageEntities.ManageEntitiesPOM;
import CEF.Utils.PackageProperties;

public class manageEntitiesTests extends TestBase{
	
	String Entity=null;
	String Host=null;
	String Port=null;
	String Type=null;
	String User=null;
	String Password=null;
	
	
	ManageEntitiesPOM manageEntitiesPOM = new ManageEntitiesPOM();
	
	
	

	@Test(priority=0)
	public void addEntityTest() throws InterruptedException, IOException {
		 Entity=PackageProperties.GetProperty("Entity");
		 Host=PackageProperties.GetProperty("Host");
		 Port=PackageProperties.GetProperty("Port");
		 Type=PackageProperties.GetProperty("Type");
		 User=PackageProperties.GetProperty("User");
		 Password=PackageProperties.GetProperty("Password");
		 String CEFPath = PackageProperties.GetProperty("CEFPath");
		 
		 if(manageEntitiesPOM.isEntityAvailable(Entity)) {
				 manageEntitiesPOM.deleteEntity(Entity);
				 driver = base.startCEF(CEFPath);
				 Assert.assertEquals(manageEntitiesPOM.addEntity(Entity, Host, Port, Type, User, Password), true);
		 }
		 else {
			 Assert.assertEquals(manageEntitiesPOM.addEntity(Entity, Host, Port, Type, User, Password), true);
		 }
	}
	
	@Test(priority=1)
	public void editEntityTest() throws InterruptedException, IOException {
		Entity=PackageProperties.GetProperty("Entity");
		 Host=PackageProperties.GetProperty("Host");
		 Port=PackageProperties.GetProperty("Port");
		 Type=PackageProperties.GetProperty("Type");
		 User=PackageProperties.GetProperty("User");
		 Password=PackageProperties.GetProperty("Password");
		 //Chaning the entity details
		 Assert.assertTrue(manageEntitiesPOM.editEntity(Entity, "10.10.10.10", "10.10.10.10", "1000", "Solaris", "TestUser", "Test1234"));
		//Rechanging the entity details to the defaults.
		 manageEntitiesPOM.editEntity("10.10.10.10", Entity, Host, Port, Type, User, Password);
	}
	@Test(priority=2)
	public void multipleEntityTest() throws InterruptedException, IOException {
	//	manageEntitiesPOM.deleteEntity(Entity);
		Assert.assertEquals(manageEntitiesPOM.addEntity( "10.10.10.10", "10.10.10.10", "1000", "Solaris", "TestUser", "Test1234"), true);
		
	}
	
	@Test(priority=3)
	public void deleteEntityTest() throws InterruptedException, IOException {
		 Assert.assertTrue(manageEntitiesPOM.deleteEntity("10.10.10.10"));
	}
	
	@AfterClass
	public void closeCEF() {
		base.getWindowByName("User Logon");
		driver.findElementByName("Close").click();	
	}
}


