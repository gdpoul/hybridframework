package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Prop1 {
  @Test
  public void method1() {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log(threadId+"  thread id ",true);
	  Reporter.log("Method1",true);
  }
  
  @Test
  public void method2() {
	  
	  long threadId = Thread.currentThread().getId();
	  Reporter.log(threadId+"  thread id ",true);
	  Reporter.log("Method2",true);
  }
}
