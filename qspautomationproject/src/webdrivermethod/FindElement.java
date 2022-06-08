package webdrivermethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-148c48n/login.do");
		WebElement usertextbox = driver.findElement(By.name("username"));
		usertextbox.sendKeys("admin");
		System.out.println(usertextbox);
		
	}

}
