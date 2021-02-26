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

public class TestAboutUs {
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	
	 @Test
		public void testAboutUs() throws Exception {
				driver.navigate().to(LogInAboutUs.URL);
				driver.manage().window().maximize();
				
				LogInAboutUs.aboutUs(driver);
				TakesScreenshot scr = ((TakesScreenshot)driver);
				File file = scr.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(file, new File("./SCNSHT/aboutUs.png"));

				String current = driver.getCurrentUrl();
				String expected = LogInAboutUs.ABOUTUS_URL;

				Assert.assertEquals(current, expected);
				driver.quit();
		} 
}
