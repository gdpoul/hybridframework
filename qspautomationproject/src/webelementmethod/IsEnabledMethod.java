package webelementmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("976447690");
		driver.findElement(By.name("password")).sendKeys("abcd@1234");
		WebElement element = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		boolean status = element.isEnabled();
		System.out.println(status);
	}
}
