package webelementmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement news = driver.findElement(By.xpath("//h2[.='News']"));
		String tag = news.getTagName();
		System.out.println(tag);
	}

}
