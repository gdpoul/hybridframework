package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// declaration

	@FindBy(name = "username")
	private WebElement usn;
	@FindBy(name = "pwd")
	private WebElement pass;
	@FindBy(id = "loginButton")
	private WebElement loginBtn;
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepMeLoggedInCheckBox;
	@FindBy(xpath = "//img[contains(@src,'timer')]")
	private WebElement logo;
	@FindBy(id = "licenseLink")
	private WebElement licenseLink;

	// initialization

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization

	public WebElement getUsn() {
		return usn;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getLicenseLink() {
		return licenseLink;
	}

	// generic reusable method

	public void actiTimeValidLogin(String Username, String Password) {
		usn.sendKeys(Username);
		pass.sendKeys(Password);
		loginBtn.click();
	}

	public void actiTimeinvalidLogin(String Username, String Password) throws InterruptedException {
		usn.sendKeys(Username);
		pass.sendKeys(Password);
		loginBtn.click();
		Thread.sleep(1000);
		usn.clear();
	}

	// operational methods

}
