package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Base_Class {

	public WebDriver driver;
	public Properties prop;

	public void Driver_Intialisation() throws IOException {
// To read the data from data.properties file

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");

		// To access the properties from the file
		// Properties prop = new Properties(); declare global at the top to access in
		// other method
		prop = new Properties();
		prop.load(fs); //
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Select proper browser");
		}
	}

	@BeforeMethod
	public void Launch_Browser_URL() throws IOException {
		Driver_Intialisation();
		driver.get(prop.getProperty("url"));
	}
}
