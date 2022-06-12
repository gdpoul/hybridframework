package takeScreenshotsDynamically;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomeListner.class)
public class TestCase extends BaseTest {
	
	@BeforeMethod
	public void setUp()
	{
		intilization();
	}

	@Test
	public void validLogin() throws InterruptedException {

		String loginPageTitle = driver.getTitle();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(loginPageTitle, "OrangeHRM");

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin12");
		driver.findElement(By.id("btnLogin")).click();

		WebElement dashBoard = driver.findElement(By.xpath("//h1[.='Dashboard']"));
		boolean statusOfdashBoard = dashBoard.isDisplayed();
		Assert.assertEquals(statusOfdashBoard, true);
		Thread.sleep(3000);
	}
	@Test
	public void test2()
	{
		Assert.fail();
	}
	
	@Test
	public void test3()
	{
		Assert.fail();
	}
	
	@Test
	public void test4()
	{
		Assert.fail();
	}
	
	@Test
	public void test5()
	{
		Assert.fail();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
