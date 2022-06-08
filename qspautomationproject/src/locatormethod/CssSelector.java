package locatormethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("pass");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
