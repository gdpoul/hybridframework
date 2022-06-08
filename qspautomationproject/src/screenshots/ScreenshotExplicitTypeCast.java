package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotExplicitTypeCast {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver1.get("http://desktop-148c48n/login.do");

		// 3rd way by using explicit type casting

		TakesScreenshot driver = (TakesScreenshot) driver1;

		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/screenshot3.png");
		Files.copy(src, des);

	}

}
