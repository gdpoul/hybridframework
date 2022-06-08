package webBasedPopus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentCalender {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,' px-1 py-1 hover:bg-neutral-0 flex flex-middle nmx-1')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'pr-')]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@aria-label='Sat Jun 04 2022']")).click();
		
	}

}
