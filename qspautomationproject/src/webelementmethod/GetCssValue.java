package webelementmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//getCssValue
		WebElement credential = driver.findElement(By.xpath("//span[contains(.,'admin123')]"));
		
		String value = credential.getCssValue("color");
		String value1= credential.getCssValue("font-weight");
		System.out.println(value);
		System.out.println(value1);
		
		
		
		
		
		
		
	}
}
