package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	
  @Test(priority = 5)
  public void f() 
  {
	  Reporter.log("f",true);
  }
  @Test(priority = 1)
  public void a() 
  {
	  Reporter.log("a",true);
  }
  @Test
  public void b() 
  {
	  Reporter.log("b",true);
  }
  @Test(priority = 7)
  public void z() 
  {
	  Reporter.log("z",true);
  }
  @Test()
  public void m() 
  {
	  Reporter.log("m",true);
  }
  @Test(priority=4)
  public void g() 
  {
	  Reporter.log("g",true);
  }
  @Test()
  public void o() 
  {
	  Reporter.log("o",true);
  }
  @Test(priority = 6)
  public void d() 
  {
	  System.out.println(1/0);
	  Reporter.log("d",true);
  }
  @Test(priority = 6)
  public void q() 
  {
	  Reporter.log("q",true);
  }
  @Test(priority=0)
  public void r() 
  {
	  Reporter.log("r",true);
  }
}
