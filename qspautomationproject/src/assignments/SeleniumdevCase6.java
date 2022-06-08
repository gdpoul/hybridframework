package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumdevCase6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		Thread.sleep(4000);
		String TextOfWebElement = driver.findElement(By.xpath("//a[.='API Docs']/ancestor::div[@class='card-body px-0 text-center']/descendant::p[.='Java']")).getText();
		System.out.println(TextOfWebElement);
	}

}
