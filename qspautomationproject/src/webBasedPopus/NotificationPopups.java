package webBasedPopus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.addArguments("-start-maximized");
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://optinmonster.com/what-is-a-popup-notification/");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.get("https://optinmonster.com/what-is-a-popup-notification/");
	}

}
