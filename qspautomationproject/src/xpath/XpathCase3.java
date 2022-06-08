package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathCase3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("0987654321");
		driver.findElement(By.xpath("//input[@name=txtPassword']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}

}
