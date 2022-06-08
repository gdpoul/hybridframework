package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Apple macbook",Keys.ENTER);
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();
	    Thread.sleep(7000);
	    driver.findElement(By.xpath("//button[@id='add-to-wishlist-button-4']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[text()='Email a friend']")).click();
	    
	    driver.findElement(By.id("FriendEmail")).sendKeys("rajputrahul12797@gmail.com");
	    driver.findElement(By.id("YourEmailAddress")).sendKeys("gdpoul333@gmail.com");
	    driver.findElement(By.id("PersonalMessage")).sendKeys("Check the configuration of mack,I want to buy this laptop");
	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[text()='Send email']")).click();
	    
	    
	    
	}

}
