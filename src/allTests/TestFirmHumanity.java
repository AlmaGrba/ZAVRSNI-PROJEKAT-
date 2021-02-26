package allTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import allObjects.LogInAboutUs;
import allObjects.FirmHumanity;

public class TestFirmHumanity {
	
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
	public void dashboardOption() {

		FirmHumanity.dashboardClick(driver);
		String current = driver.getCurrentUrl();
		String expected = "https://kucicaodcokolade.humanity.com/app/dashboard/"; 
		Assert.assertEquals(current, expected);
	}

	@Test(priority = 1)
	public void shiftPlanningOption() {
		
		FirmHumanity.shiftplanningClick(driver);
		String current = driver.getCurrentUrl();
		String expected = "https://kucicaodcokolade.humanity.com/app/schedule/employee/week/overview/overview/26%2c1%2c2021/";
		Assert.assertEquals(current, expected);
	}

	@Test(priority = 2)
	public void timeClockOption() {
		
		FirmHumanity.timeclockClick(driver);
		String current = driver.getCurrentUrl();
		String expected = "https://kucicaodcokolade.humanity.com/app/timeclock/";
		Assert.assertEquals(current, expected);
	}

	@Test(priority = 3)
	public void leaveOption() {
		
		FirmHumanity.leaveClick(driver);
		String current = driver.getCurrentUrl();
		String expected = "https://kucicaodcokolade.humanity.com/app/requests/vacation/";
		Assert.assertEquals(current, expected);
	}

	@Test(priority = 4)
	public void trainingOption() {
		
		FirmHumanity.trainingClick(driver);
		String current = driver.getCurrentUrl();
		String expected = "https://kucicaodcokolade.humanity.com/app/training/";
		Assert.assertEquals(current, expected);
	}

	@Test(priority = 5)
	public void staffOption() {
		
		FirmHumanity.staffClick(driver);
		String current = driver.getCurrentUrl();
		String expected = "https://kucicaodcokolade.humanity.com/app/staff/list/load/true/";
	}

	@Test(priority = 6)
	public void availabilityOption() {
		
		FirmHumanity.availabilityClick(driver);
		String current = driver.getCurrentUrl();
		String expected = "https://kucicaodcokolade.humanity.com/fe/availability/#/requests/week/2021-02-21/1";
		//String expected = "https://kucicaodcokolade.humanity.com/fe/availability/";
		Assert.assertEquals(current, expected);
	}

	@Test(priority = 7)
	public void payrollOption() {
		
		FirmHumanity.payrollClick(driver);
		String current = driver.getCurrentUrl();
		String expected = "https://kucicaodcokolade.humanity.com/app/payroll/scheduled-hours/";
		Assert.assertEquals(current, expected);
	}

	@Test(priority = 8)
	public void reportsOption() {
		
		FirmHumanity.reportsClick(driver);
		String current = driver.getCurrentUrl();
		String expected = "https://kucicaodcokolade.humanity.com/app/reports/dashboard/";
		Assert.assertEquals(current, expected);
	}

	@Test(priority = 9)
	public void addEmployees() {
		
		driver.navigate().to("https://kucicaodcokolade.humanity.com/app/staff/list/load/true/");
		FirmHumanity.addEmployee(driver);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 10)
	public void changeName() {
		
		driver.navigate().to("https://kucicaodcokolade.humanity.com/app/staff/list/load/true/");
		FirmHumanity.changeName(driver);
		String current = driver.getCurrentUrl();
		String expected = "https://kucicaodcokolade.humanity.com/app/staff/list/load/true/";
		Assert.assertEquals(current, expected);
		driver.quit();

	}

}


