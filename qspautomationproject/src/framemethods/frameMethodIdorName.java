package framemethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameMethodIdorName {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.id("denyBtn")).click();
		
		driver.switchTo().frame("chat-widget");
		driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();
		
		driver.findElement(By.id("name")).sendKeys("abc");
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@id='rrc32ycna1k_146917605549304831']")).sendKeys("9876543210");
		
		
		
		
		
		
	}

}
