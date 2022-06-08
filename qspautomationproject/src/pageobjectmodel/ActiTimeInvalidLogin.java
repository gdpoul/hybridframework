package pageobjectmodel;

import java.io.IOException;

public class ActiTimeInvalidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.setUp();
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH, "invalidcred");
		for (int i = 1; i < rc; i++) {
			String invalidUser = flib.readExcelData(EXCEL_PATH, "invalidcred", i, 0);
			String invalidPass = flib.readExcelData(EXCEL_PATH, "invalidcred", i, 1);
			
			lp.actiTimeinvalidLogin(invalidUser, invalidPass);

		}
		bt.tearDown();

	}

}
