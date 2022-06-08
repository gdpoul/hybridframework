package assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que5 {
	public static void main(String[] args) {

		// perform the action (for ex. maximize) on any of the child window

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Open a popup window")).click();

		String parentTitle = driver.getTitle();
		Set<String> allHandles = driver.getWindowHandles();

		for (String wh : allHandles) {
			driver.switchTo().window(wh);
			String currentTitle = driver.getTitle();
			if (!parentTitle.equals(currentTitle)) {
				driver.switchTo().window(wh).manage().window().maximize();
			} else {
				driver.close();
			}
		}

	}

}
