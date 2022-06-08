package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartAssign {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Laptop");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Brand']")).click();
		driver.findElement(By.xpath("//div[.='HP' and @class='_4921Z t0pPfW']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='Operating System']")).click();
        driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
        
        Thread.sleep(5000);
        String TextOfWebElement = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
        System.out.println( TextOfWebElement);
        
        
        
        

	}
}
