package webelementmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement news = driver.findElement(By.xpath("//h2[.='News']"));
		Rectangle rect = news.getRect();
		int h = rect.getHeight();
		int w = rect.getWidth();
		System.out.println(h);
		System.out.println(w);
	}

}
