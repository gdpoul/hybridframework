package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.com");
	  driver.manage().window().maximize();
	  Thread.sleep(10000);
	  
	  driver.close();   //it is used to close the parent  browser 
	 
}
}
