package allTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import allObjects.Registration2;

public class TestRegistration2 {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(priority = 0)
	public void testNewUser() {
		
		driver.navigate().to(Registration2.URL);
		driver.manage().window().maximize();
		Registration2.newUser(driver);

		String current = driver.getCurrentUrl();
		String expected = "https://www.humanity.com/wizard-setup2/";

		Assert.assertEquals(current, expected);
	}

}




