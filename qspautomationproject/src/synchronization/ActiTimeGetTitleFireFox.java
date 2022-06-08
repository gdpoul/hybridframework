package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeGetTitleFireFox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-148c48n/login.do");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		String loginPageTitle = driver.getTitle();
		if(loginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("test case is passed. Login Page is Matched");
		}
		else
		{
			System.out.println("test case failed. login page is not matched");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String HomePageTitle = driver.getTitle();
		
		if(HomePageTitle.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("test case is passed. Home Page is Matched");
		}
		else
		{
			System.out.println("test case is failed. Home Page is Matched");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
