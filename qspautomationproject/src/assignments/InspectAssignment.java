package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InspectAssignment {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.selenium.dev");
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    
	    //right click on page
	    Actions act = new Actions(driver);
	    act.contextClick().perform();
	    Thread.sleep(3000);
	    
	    Robot r = new Robot();
	    
	    //click on inspect
	    for(int i=1;i<=10;i++)
	    {
	    r.keyPress(KeyEvent.VK_PAGE_DOWN);
	    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(1000);
	    }
	    Thread.sleep(3000);
	    
	    //hit the enter button
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
	}

}
