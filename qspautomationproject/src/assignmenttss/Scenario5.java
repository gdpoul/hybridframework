package assignmenttss;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//a[@title='Diamond Rings']/ancestor::div[@class='wh-submenu medium-width']/descendant::a[.='Diamond']"))
				.click();
		List<WebElement> price1 = driver.findElements(By.xpath("//span[@class='new-price']"));
		Thread.sleep(3000);

		for (WebElement p : price1) {

			System.out.println(p.getText());
		}
		System.out.println("------------------------------------------");

		WebElement target1 = driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(target1).perform();
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();

		List<WebElement> price2 = driver.findElements(By.xpath("//span[@class='new-price']"));

		for (WebElement p2 : price2) {
			System.out.println(p2.getText());
		}
		if (price1.equals(price2) == true) {
			System.out.println("both list is same");
		} else {
			System.out.println("both list is vary by price");
		}
		driver.quit();

	}

}
