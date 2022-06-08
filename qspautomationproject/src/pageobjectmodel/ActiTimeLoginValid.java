package pageobjectmodel;

import java.io.IOException;

public class ActiTimeLoginValid extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.setUp();

		Flib flib = new Flib();
		String validUsername = flib.readpropertyFile(PROP_PATH, "username");
		String validPassword = flib.readpropertyFile(PROP_PATH, "password");

		LoginPage lp = new LoginPage(driver);
		lp.actiTimeinvalidLogin(validUsername, validPassword);

	}

}
