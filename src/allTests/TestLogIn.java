package allTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import allObjects.LogInAboutUs;

public class TestLogIn {
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	
	 @Test
		public void testLogIn() {
				driver.navigate().to(LogInAboutUs.URL);
				driver.manage().window().maximize();
				
				LogInAboutUs.logIn(driver);

				String current = driver.getCurrentUrl();
				String expected = "https://www.humanity.com/app/";

				Assert.assertEquals(current, expected);
}

}
