package dataDrivenFrameworks;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-148c48n/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Flib flib = new Flib();
		String username = flib.readData("./data/ActiTimeTestData.xlsx", "validcred", 1, 0);
		String password = flib.readData("./data/ActiTimeTestData.xlsx", "validcred", 1, 1);

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		 
		
		
		if (driver.getTitle().equals("actiTIME - Enter Time-Track")) 
		{
			
			flib.writeExcelData("./data/ActiTimeTestData.xlsx", "validcred", 1, 2,"Pass");
			
		} 
		else
		{
			flib.writeExcelData("./data/ActiTimeTestData.xlsx", "validcred", 1, 2,"Fail");
		}
     
		driver.quit();


	}

}
