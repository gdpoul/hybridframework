package webelementmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-148c48n/login.do");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.id("loginButton"));
		login.click();
		
		
		
	}

}
