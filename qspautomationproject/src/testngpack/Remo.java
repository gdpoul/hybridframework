package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
	
	@Test
	public void b()
	{
		System.out.println(1/0);
		Reporter.log("Remo class method", true);
	}

}
