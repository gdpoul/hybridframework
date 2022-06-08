package javascriptExecutorOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shree/Desktop/html/Login%20page.html");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement user = driver.findElement(By.id("i1"));
		
		if(user.isEnabled())
		{
			user.sendKeys("admin");
		}
		else
		{
			
			jse.executeScript("document.getElementById('i1').value='admin'");
			
		}
		
		WebElement pwd = driver.findElement(By.id("id2"));
       if (pwd.isEnabled()) 
       {
    	   pwd.sendKeys("manager");
       }
       else
       {
    	   
    	   jse.executeScript("document.getElementById('id2').value='manager'");
       }
	}

}
