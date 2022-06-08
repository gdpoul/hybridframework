package keywordDrivenFrmework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {

		// create object of to access the method
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();

		// open the browser
		bt.openBrowser();

		// read property file to access the key
		String username = flib.readPropertyFile(PROP_PATH, "username");
		String password = flib.readPropertyFile(PROP_PATH, "password");
		Thread.sleep(3000);

		// perform login operation
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);

		// close the browser
		bt.closeBrowser();

	}

}
