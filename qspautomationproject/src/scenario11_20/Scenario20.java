package scenario11_20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario20 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("denyBtn")).click();
		// mouseOver action
				WebElement tgt = driver.findElement(By.xpath("//a[.='Coins ']"));
				Actions act = new Actions(driver);
				act.moveToElement(tgt).perform();
				driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-10gms,m']")).click();

				WebElement element = driver.findElement(By.xpath("//span[@id='short_desc_goldWt']"));

				if (element.getText().equalsIgnoreCase("(10 gram)")) {
					System.out.println("Test Case Is Pass");

				} else {
					System.out.println("Test Case Is Fail");
				}
	}

}
