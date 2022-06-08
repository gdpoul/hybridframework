package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
	
  @Test(enabled = true)
  public void logIn() 
  {
	  Reporter.log("Login Operation", true);
	  
  }
	
  @Test(enabled = true)
  public void logOut() 
  {
	  Reporter.log("Logout Operation", true);
	  
  }
  
}
