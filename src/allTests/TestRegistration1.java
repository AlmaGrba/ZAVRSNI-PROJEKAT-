package allTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import allObjects.Registration1;

public class TestRegistration1 {
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(priority = 1)
	public void testNewUser2() {
		driver.navigate().to(Registration1.URL);
		driver.manage().window().maximize();
		Registration1.newUser2(driver);

		String current = driver.getCurrentUrl();
		String expected = "https://www.humanity.com/wizard-setup2/";

		Assert.assertEquals(current, expected);
	}

}
