package webdrivermethod;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Open a popup window")).click();
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		System.out.println("---------------------------------------");
		Set<String> allHandle = driver.getWindowHandles();
		for(String wh:allHandle)
		{
		System.out.println(wh);
		}

	}

}
