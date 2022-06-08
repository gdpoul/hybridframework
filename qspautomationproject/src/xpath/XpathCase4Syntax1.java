package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathCase4Syntax1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		// or attribute
		
		driver.findElement(By.xpath("//a[contains(@class,'webdriver') or contains(@class,'ide') or contains(@class,'grid')]")).click();
		
		
	}

}
