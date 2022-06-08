package assignmenttss;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Scenario8 {
	public static void main(String[] args) throws InterruptedException, IOException {
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
		String parentW = driver.getWindowHandle();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='The Ranveer Kada for Him']")).click();
		
		Set<String> allW = driver.getWindowHandles();
		for(String s:allW)
		{
			if(!s.equals(parentW))
			{
				driver.switchTo().window(s);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[@class='size-box-overlay']")).click();
				WebElement selectedSize = driver.findElement(By.xpath("//span[.='2-2(2 2/16\")']"));
				String s1 = selectedSize.getText();
				selectedSize.click();
				
				driver.findElement(By.xpath("//input[@id='buy-now']")).click();
				
				WebElement cartSize = driver.findElement(By.xpath("//div[@class='select-size']"));
				String s2 = cartSize.getText();
				
				System.out.println(s1.equals(s2));
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
