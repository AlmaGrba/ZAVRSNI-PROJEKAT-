package allTests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import allObjects.AddNewEmployee;
import allObjects.FirmHumanity;
import allObjects.LogInAboutUs;

public class TestAddNewEmployee {
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(priority = 0)
	public void testLogIn() {
			driver.navigate().to(LogInAboutUs.URL);
			driver.manage().window().maximize();
			
			LogInAboutUs.logIn(driver);

			String current = driver.getCurrentUrl();
			String expected = "https://www.humanity.com/app/";

			Assert.assertEquals(current, expected);
}
	
	@Test(priority = 1)
	public void addNewEmployees() {
		driver.navigate().to("https://kucicaodcokolade.humanity.com/app/staff/list/load/true/");
		
		AddNewEmployee.fiveEmployeesInput(driver);
		
	}

}
