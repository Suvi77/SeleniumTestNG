package test_Cases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page_ObjectModel.Login_Page_Objects;
import page_ObjectModel.Signup_Page_Objects;
import resources.Base_Class;
import resources.Constants_Data;
import resources.common_Methods;

public class Signup_Test_Cases extends Base_Class {
	@Test
	public void Signup_Verification() throws IOException, InterruptedException {
		{
			// Driver_Intialisation();
			// driver.get("https://login.salesforce.com/");
			Login_Page_Objects lpo = new Login_Page_Objects(driver);
			lpo.clickOntryForFree().click();

			Signup_Page_Objects spo = new Signup_Page_Objects(driver);
			Thread.sleep(5000);
			spo.enterFirstName().sendKeys(Constants_Data.firstname);
			spo.enterLastName().sendKeys(Constants_Data.lastnamne);
			spo.enterJobTitle().sendKeys(Constants_Data.jobtitle);
			spo.clickOnNextButton().click();

			spo.enterPhoneNumber().sendKeys(Constants_Data.enterPhone);
			spo.enterEmail().sendKeys(Constants_Data.email);

			// Country Dropdown
			/*
			 * WebElement a = spo.selectCountry(); Select s = new Select(a);
			 * s.selectByIndex(11);
			 */
			common_Methods.selectDropdown(spo.selectCountry(), 11);

			spo.CLICKOnNextButton1().click();

			spo.EnterCompanyName().sendKeys(Constants_Data.companyName);

			// Employee Dropdown
			/*
			 * methods decalred in common methods class WebElement b =
			 * spo.NumberOfeEmployees(); Select c = new Select(b); c.selectByIndex(5);
			 */

			// one line code after declaring common methods
			// Select DropDown By Index
			common_Methods.selectDropdown(spo.NumberOfeEmployees(), 5);

			// Language Dropdown
			/*
			 * WebElement e = spo.CompanyLanguage(); Select d = new Select(e);
			 * d.selectByIndex(3);
			 */

			// Select DropDown By visible Text
			common_Methods.selectDropdownByVisibleText(spo.CompanyLanguage(), "English");

			spo.agreementCheck().click();

			common_Methods.verifyAssertions(spo.signupConfirmaion(), Constants_Data.expectedSighnupMeassage,
					Constants_Data.signupErrorMessage);

		}

	}
}
