package eliminateDuplicateValues;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Set1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shree/Desktop/html/multiselectdropdown.html");
		WebElement dropdownelement = driver.findElement(By.id("menu"));
		Select sel=new Select(dropdownelement);
		List<WebElement> options = sel.getOptions();
		
		//declare a HashSet to eliminate duplicate data
		HashSet<String> s=new HashSet<String>();
		
		//read the list and get the text
		for(int i=0;i<options.size();i++)
		{
			WebElement ops = options.get(i);
			String text=ops.getText();
			
			//add the text to HashSet so that duplicate wont be accepted
			s.add(text);
		}
		
		//read the HashSet
		for(String se:s)
		{
			System.out.println(se);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
