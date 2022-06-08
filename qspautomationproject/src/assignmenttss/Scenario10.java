package assignmenttss;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario10 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("denyBtn")).click();

		WebElement elementAddress = driver.findElement(By.xpath("//iframe[@id='chat-widget']"));

		driver.switchTo().frame(elementAddress);
		driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Gamesh Poul");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gdpoul333@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='xp73x42lm3_146917605549304831']")).sendKeys("9876543210");

		driver.findElement(By.xpath("//span[.='Start the chat']")).click();

	}

}
