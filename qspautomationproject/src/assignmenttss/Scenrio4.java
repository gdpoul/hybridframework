package assignmenttss;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenrio4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");

		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Apple Watches");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));

		Select sel = new Select(dropdown);

		sel.selectByVisibleText("Smart Watches");

		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

		List<WebElement> products = driver.findElements(By.xpath("//h3[@class='s-item__title']"));
		Scenrio4 s4 = new Scenrio4();
		s4.printProduct(products);
		s4.printNthProduct(products);

	}

	public void printProduct(List<WebElement> product) {
		for (WebElement w : product) {
			System.out.println(w.getText());
		}
	}

	public void printNthProduct(List<WebElement> all) {

		WebElement lastElement = all.get(all.size() - 1);
		System.out.println(lastElement.getText());

	}

}
