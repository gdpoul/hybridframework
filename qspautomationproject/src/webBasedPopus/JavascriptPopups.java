package webBasedPopus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopups {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shree/Desktop/html/alert.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		//al.accept();
		al.dismiss();
		
		
		
	}

}
