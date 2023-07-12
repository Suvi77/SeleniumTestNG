package page_ObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup_Page_Objects {

	public WebDriver driver;

	private By firstname = By.xpath("//input[@name='UserFirstName']");
	private By lastnamne = By.xpath("//input[@name='UserLastName']");
	private By jobtitle = By.xpath("//input[@name='UserTitle']");
	private By nextButton = By.xpath("(//a[@role='button'])[2]");

	private By enterPhone = By.xpath("//input[@name='UserPhone']");
	private By email = By.xpath("//input[@name='UserEmail']");
	private By country = By.xpath("//select[@name='CompanyCountry']");
	private By NextButton = By.xpath("//span[contains(text(),'Next')]");

	private By companyName = By.xpath("//input[@name='CompanyName']");
	private By employee = By.xpath("//select[@name='CompanyEmployees']");
	private By Language = By.xpath("//select[@name='CompanyLanguage']");
	private By agreement = By.xpath("//div[@class='checkbox-ui']");
	private By signupConfirmtionMessge = By.xpath("//h3[@id='answer-3-more-questions-and-well-get-you-into-your-free-trial']");

	public Signup_Page_Objects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement enterFirstName() {
		return driver.findElement(firstname);
	}

	public WebElement enterLastName() {
		return driver.findElement(lastnamne);
	}

	public WebElement enterJobTitle() {
		return driver.findElement(jobtitle);
	}

	public WebElement clickOnNextButton() {
		return driver.findElement(nextButton);
	}

	public WebElement enterPhoneNumber() {
		return driver.findElement(enterPhone);
	}

	public WebElement enterEmail() {
		return driver.findElement(email);
	}

	public WebElement selectCountry() {
		return driver.findElement(country);
	}

	public WebElement CLICKOnNextButton1() {
		return driver.findElement(NextButton);
	}

	public WebElement EnterCompanyName() {
		return driver.findElement(companyName);
	}

	public WebElement NumberOfeEmployees() {
		return driver.findElement(employee);
	}

	public WebElement CompanyLanguage() {
		return driver.findElement(Language);
	}

	public WebElement agreementCheck() {
		return driver.findElement(agreement);
	}

	public WebElement signupConfirmaion() {
		return driver.findElement(signupConfirmtionMessge);
	}
}

