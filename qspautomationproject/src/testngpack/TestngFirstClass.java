package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngFirstClass {
	
  @Test
  public void method1()
  {
	  Reporter.log("Method 1 excuted",true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("Method 2 excuted",true);
  }
  
  @Test
  public void method3()
  {
	  Reporter.log("Method 3 excuted",true);
  }
  
  @Test
  public void method4()
  {
	  System.out.println(1/0);
	  Reporter.log("Method 4 excuted",true);
  }
  
  @Test
  public void method5()
  {
	  Reporter.log("Method 5 excuted",true);
  }
  
  
}
