package assignmenttss;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario6 {
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
		TreeSet sort = new TreeSet();

		for (WebElement p2 : price2) {

			String s = p2.getText();
			sort.add(s);
			System.out.println(s);
		}
         System.out.println(sort);
	}

}
