package keywordDrivenFrmework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {

	static WebDriver driver;

	// method to open the browser
	public void openBrowser() throws IOException {
		
		Flib filb = new Flib();
		
		// to get the browser from property file
		String BrowserValue = filb.readPropertyFile(PROP_PATH, "browser");
		
		// to get the url from property file
		String url = filb.readPropertyFile(PROP_PATH, "url");

		if (BrowserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} else if (BrowserValue.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} else {
			System.out.println("Enter Valid browser");
		}
	}

	// method to close the Browser
	public void closeBrowser() {
		driver.quit();
	}

}
