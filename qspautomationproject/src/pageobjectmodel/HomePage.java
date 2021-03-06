package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// declaration

	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logoutLink;
	@FindBy(xpath = "//a[.='Create new tasks']")
	private WebElement createNewTask;
	@FindBy(linkText = "Settings")
	private WebElement settings;

	// initialization

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getCreateNewTask() {
		return createNewTask;
	}

	public WebElement getSettings() {
		return settings;
	}

	// Generalization method

	public void performLogOut() {
		logoutLink.click();
	}

}
