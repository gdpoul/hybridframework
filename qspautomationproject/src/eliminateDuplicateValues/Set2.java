package eliminateDuplicateValues;
import java.util.LinkedHashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Set2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shree/Desktop/html/multiselectdropdown.html");
		WebElement dropdownelement = driver.findElement(By.id("menu"));
		Select sel=new Select(dropdownelement);
		List<WebElement> options = sel.getOptions();
		
		//declare a LinkedHashSet to eliminate duplicate data
		LinkedHashSet<String> s=new LinkedHashSet<String>();
		
		//read the list and get the text
		for(int i=0;i<options.size();i++)
		{
			WebElement ops = options.get(i);
			String text=ops.getText();
			
			//add the text to LinkedHashSet so that duplicate wont be accepted,and order of insertion is maintained
			s.add(text);
		}
		
		//read the LinkedHashSet
		for(String se:s)
		{
			System.out.println(se);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
