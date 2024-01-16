package test_Cases;

import org.testng.asserts.SoftAssert;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.Base_Class;
import resources.Constants_Data;
import resources.common_Methods;
import page_ObjectModel.Login_Page_Objects;

public class Login_Test_Cases extends Base_Class {
	@Test(dataProvider = "testData")
	public void Verify_Login(String username, String password) throws IOException {
		// Driver_Intialisation();
		// driver.get("https://login.salesforce.com/");

		Login_Page_Objects lpo = new Login_Page_Objects(driver);
		lpo.enterUsername().sendKeys(username);
		lpo.enterPassword().sendKeys(password);
		lpo.clickOnLogin().click();

		common_Methods.verifyAssertions(lpo.errorMessage(), Constants_Data.expectedErrorTextMesaage,
				Constants_Data.loginErrorMesaage);

	}

	// object is a class
	// object[][] is return type of data provider
	// testData() - data provider name

	@DataProvider
	public Object[][] testData() { // testData() - is dataprovider name
		Object[][] data = new Object[3][2]; // create the object of object class
		data[0][0] = Constants_Data.username1; // 1st username
		data[0][1] = Constants_Data.password1;// 1st password
		data[1][0] = Constants_Data.username2; // 2nd username
		data[1][1] = Constants_Data.password2; // 2nd password
		data[2][0] = Constants_Data.username; // 3rd username
		data[2][1] = Constants_Data.password; // 3rd password

		return data;

	}

}
