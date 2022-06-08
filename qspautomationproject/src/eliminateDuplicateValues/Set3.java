package eliminateDuplicateValues;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Set3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shree/Desktop/html/multiselectdropdown.html");
		WebElement dropdownelement = driver.findElement(By.id("menu"));
		Select sel=new Select(dropdownelement);
		List<WebElement> options = sel.getOptions();
		
		//declare a TreeSet to eliminate duplicate data
		TreeSet<String> s=new TreeSet<String>();
		
		//read the list and get the text
		for(int i=0;i<options.size();i++)
		{
			WebElement ops = options.get(i);
			String text=ops.getText();
			
			//add the text to TreeSet so that duplicate wont be accepted,and order of insertion is alphabetical
			s.add(text);
		}
		
		//read the HashSet
		for(String se:s)
		{
			System.out.println(se);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
