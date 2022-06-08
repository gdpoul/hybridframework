package assignmenttss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//span[.='Kadas']/ancestor::ul[@class='odd-even-bg']/descendant::span[@data-p='mens-jewellery-kadas,m']")).click();
		
		driver.findElement(By.xpath("//img[@alt='The Ranveer Kada for Him']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='buynow-block col-xs-7']")).click();

	}

}
