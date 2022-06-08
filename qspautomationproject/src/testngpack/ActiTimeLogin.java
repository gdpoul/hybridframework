package testngpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiTimeLogin {

	WebDriver driver;

	@Test
	@Parameters({ "browser", "username", "password","url" })
	public void actiTimeLogin(String browserValue, String validUser, String validPass,String url) {

		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.findElement(By.name("username")).sendKeys(validUser);
			driver.findElement(By.name("pwd")).sendKeys(validPass);
			driver.findElement(By.id("loginButton")).click();
			

		}
		else if (browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.findElement(By.name("username")).sendKeys(validUser);
			driver.findElement(By.name("pwd")).sendKeys(validPass);
			driver.findElement(By.id("loginButton")).click();

		}
		else
		{
			System.out.println("Enter valid Input");
		}

	}
}
