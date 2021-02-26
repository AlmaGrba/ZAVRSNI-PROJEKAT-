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
import allObjects.StatusEmployee;

public class TestStatusEmployee {
	
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
	public void checkNewEmployees1() {
		driver.navigate().to(StatusEmployee.URL);
		StatusEmployee.checkAddedEmployee1(driver);
		String current = driver.getCurrentUrl();
		String expected = "https://kucicaodcokolade.humanity.com/app/staff/detail/6090507/";
		Assert.assertEquals(current, expected);
	}
	
	@Test(priority = 2)
	public void checkNewEmployees2() {
		driver.navigate().to(StatusEmployee.URL);
		StatusEmployee.checkAddedEmployee2(driver);
		String current = driver.getCurrentUrl();
		String expected = "https://kucicaodcokolade.humanity.com/app/staff/detail/6090509/";
		Assert.assertEquals(current, expected);
	}
	@Test(priority = 3)
	public void checkNewEmployees3() {
		driver.navigate().to(StatusEmployee.URL);
		StatusEmployee.checkAddedEmployee3(driver);
		String current = driver.getCurrentUrl();
		String expected = "https://kucicaodcokolade.humanity.com/app/staff/detail/6090511/";
		Assert.assertEquals(current, expected);
	}
	
	@Test(priority = 4)
	public void checkNewEmployees4() {
		driver.navigate().to(StatusEmployee.URL);
		StatusEmployee.checkAddedEmployee4(driver);
		String current = driver.getCurrentUrl();
		String expected = "https://kucicaodcokolade.humanity.com/app/staff/detail/6090513/";
		Assert.assertEquals(current, expected);
	}
	
	@Test(priority = 5)
	public void checkNewEmployees5() {
		driver.navigate().to(StatusEmployee.URL);
		StatusEmployee.checkAddedEmployee5(driver);
		String current = driver.getCurrentUrl();
		String expected = "https://kucicaodcokolade.humanity.com/app/staff/detail/6090514/";
		Assert.assertEquals(current, expected);
	}
}
