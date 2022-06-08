package scenario11_20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("denyBtn")).click();

		// click on Offer

		driver.findElement(By.xpath("//span[.='Offers ']")).click();
		WebElement target = driver.findElement(By.xpath("//span[.='Offers']/ancestor::section[@id='Offers-form']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//span[contains(@onclick,'20% Making Charge Off')]")).click();
		
WebElement text = driver.findElement(By.xpath("(//span[.=' 20% off on making charge '])[1]"));
		
		System.out.println(text.getText());

	}

}
