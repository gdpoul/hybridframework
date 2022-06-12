package annotationTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider {
	WebDriver driver;
	
	
   @BeforeMethod
  public void setUp()
  {
	   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://desktop-148c48n/login.do");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }
   
 @org.testng.annotations.DataProvider(name="testActiTimeInvalidData")
 public Object[][] dataProvider()
 {
	 Object data[][]=new Object[5][2];
	 
	 data[0][0]="admin";
	 data[0][1]="man ager";
	 
	 data[1][0]="admin123";
	 data[1][1]="manager123";
	 
	 data[2][0]="@123";
	 data[2][1]="manger";
	 
	 data[3][0]="admin12";
	 data[3][1]="manager";
	 
	 data[4][0]="admin@123";
	 data[4][1]="manager";
	 
	 
	return data;
	 
 }
   
   @Test(dataProvider = "testActiTimeInvalidData")
   public void loginToActiTime(String username,String password) 
   {
	   driver.findElement(By.name("username")).sendKeys(username);
	   driver.findElement(By.name("pwd")).sendKeys(password);
	   driver.findElement(By.id("loginButton")).click();
   }

  @AfterMethod
  public void tearDown() 
  {
	  driver.quit();
  }

}
