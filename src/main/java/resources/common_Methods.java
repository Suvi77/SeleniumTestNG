package resources;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.ui.Select;

public class common_Methods {

	// used parameters which are dynamics which are different for each dropdown
	public static void selectDropdown(WebElement element, int index) {

		WebElement e = element;
		Select s = new Select(e);
		s.selectByIndex(index);

	}

	public static void selectDropdownByVisibleText(WebElement element, String VisibleText) {
		WebElement e = element;
		Select s = new Select(e);
		s.selectByVisibleText(VisibleText);
	}

	public static void verifyAssertions(WebElement actual, String expectedText, String message) {

		WebElement a = actual;
		String actualText = a.getText();
		String ExpectedText = expectedText;

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualText, ExpectedText, message);
		sa.assertAll();
	}
}
