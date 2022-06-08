package readDataExcel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDrivenFrameworks.Flib;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-148c48n/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Flib flib = new Flib();
		int rc = flib.getrowCount("./data/ActiTimeTestData.xlsx", "invalidcred");

		for (int i = 1; i <= rc; i++) {
			String username = flib.readData("./data/ActiTimeTestData.xlsx", "invalidcred", i, 0);
			String password = flib.readData("./data/ActiTimeTestData.xlsx", "invalidcred", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();

		}

	}

}
