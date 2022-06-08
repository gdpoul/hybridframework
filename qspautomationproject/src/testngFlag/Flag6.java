package testngFlag;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
	
	
	@Test
	  public void login() {
		  Reporter.log("login Operation",true);
	  }
	  
	  @Test(dependsOnMethods = "login")
	  public void createUser() 
	  {   Assert.fail();
		  Reporter.log("user Created",true);
	  }
	  
	  @Test(dependsOnMethods ="createUser",alwaysRun = true )
	  public void logOut() {
		  Reporter.log("logout Operation",true);
	  }
	  
}
