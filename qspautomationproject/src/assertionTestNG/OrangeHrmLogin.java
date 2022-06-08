package assertionTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHrmLogin {
	WebDriver driver;
	
	@BeforeTest
	public void setProperty() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@BeforeMethod
	public void setUp() 
	{
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@Test
	public void testCase() throws InterruptedException 
	{
		String loginPageTitle = driver.getTitle();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(loginPageTitle, "OrangeHRM");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement dashBoard = driver.findElement(By.xpath("//h1[.='Dashboard']"));
		boolean statusOfdashBoard = dashBoard.isDisplayed();
		Assert.assertEquals(statusOfdashBoard, true);
		Thread.sleep(3000);
		
		String homePageTitle = driver.getTitle();
		softAssert.assertEquals(homePageTitle,"OrangeHRMHomePage");	
		
		Reporter.log("create User",true);
		Reporter.log("Create Contact",true);
		
		softAssert.assertAll();

	}
}
