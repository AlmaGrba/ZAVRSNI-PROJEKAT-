package allTests;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import allObjects.LogInAboutUs;
import allObjects.Notifications;
import allObjects.Settings;

public class TestNotifications {
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(priority = 0)
	public void testLogIn() {
			driver.navigate().to(Settings.URL);
			driver.manage().window().maximize();
			
			LogInAboutUs.logIn(driver);

			String current = driver.getCurrentUrl();
			String expected = "https://www.humanity.com/app/";

			Assert.assertEquals(current, expected); }
			
	 @Test(priority = 1)
		public void testSettings() throws Exception {
				driver.navigate().to(Settings.URL1);
				driver.manage().window().maximize();
				
				Notifications.disableNotifications(driver);

				String current = driver.getCurrentUrl();
				String expected = Notifications.NOTIFICATIONS_URL;

				Assert.assertEquals(current, expected);
				driver.quit();
		} 

}

