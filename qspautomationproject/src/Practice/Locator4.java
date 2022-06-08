package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		//login instagram
		
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("9764471690");
		driver.findElement(By.name("password")).sendKeys("pass@1234");
		driver.findElement(By.cssSelector("button[class^='sqdOP  ']")).click();
	}

}
