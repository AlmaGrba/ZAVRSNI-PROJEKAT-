package allTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import allObjects.LogInAboutUs;
import allObjects.ProfileSettings;

public class TestProfileSettings {
	
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeClass
	public void loggingIn() {
		
		driver.navigate().to(LogInAboutUs.URL);
		driver.manage().window().maximize();

		LogInAboutUs.logIn(driver);
	}

	@Test(priority = 0)
	public void changeOfFirstParameter() {
		
		ProfileSettings.changeOfFirstParameter(driver);
		String current = driver.getCurrentUrl();
		String expected = ProfileSettings.URL;
		Assert.assertEquals(current, expected);
	}

	@Test(priority = 1)
	public void changeOfSecondParameter() {
		
		ProfileSettings.changeOfSecondParameter(driver);
		String current = driver.getCurrentUrl();
		String expected = ProfileSettings.URL;
		Assert.assertEquals(current, expected);
		
		driver.quit();
	}

}
