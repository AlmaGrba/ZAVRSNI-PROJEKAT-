package allObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FirmHumanity {

	private static final String DASHBOARD_XPATH = "//*[@id=\"sn_dashboard\"]/span";
	private static final String SHIFTPLANNING_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[2]/a/span";
	private static final String TIMECLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span";
	private static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span";
	private static final String TRAINING_XPATH = "//*[@id=\"sn_training\"]/span";
	private static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span";
	private static final String AVAILABILITY_XPATH = "//*[@id=\"sn_availability\"]/span";
	private static final String PAYROLL_XPATH = "//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div/div[2]/div[8]/a/p";
	private static final String REPORTS_XPATH = "//*[@id=\"sn_reports\"]/span/p";
	private static final String ADD_EMPLOYEES_XPATH = "//*[@id=\"act_primary\"]";
	private static final String ADD_FIRSTNAME_XPATH = "//*[@id=\"_asf1\"]";
	private static final String ADD_LASTNAME_XPATH = "//*[@id=\"_asl1\"]";
	private static final String ADD_EMAIL_XPATH = "//*[@id=\"_ase1\"]";
	private static final String SAVE_NEW_EMPLOYEE_XPATH = "//*[@id=\"_as_save_multiple\"]";
	private static final String ADDED_EMPLOYEE_XPATH = "//*[@id=\"7\"]/a";
	private static final String ADDED_EMPLOYEE_EDIT_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	private static final String ADDED_EMPLOYEE_NAME_XPATH = "//*[@id=\"first_name\"]";
	private static final String SAVE_CHANGES_XPATH = "//*[@id=\"act_primary\"]";
	private static final String FIND_LAST_ADDED_EMPLOYEE_XPATH = "//*[@id=\"7\"]/a";
	private static final String EDIT_DETAILS_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	private static final String CHANGE_EMPLOYEE_NAME_XPATH = "//*[@id=\"first_name\"]";
	private static final String SAVE_NEW_EMPLOYEE_NAME_XPATH = "/html/body/table/tbody/tr/td/div[5]/button[3]";

	public static void dashboardClick(WebDriver driver) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(DASHBOARD_XPATH)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void shiftplanningClick(WebDriver driver) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(SHIFTPLANNING_XPATH)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void timeclockClick(WebDriver driver) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(TIMECLOCK_XPATH)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void leaveClick(WebDriver driver) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(LEAVE_XPATH)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void trainingClick(WebDriver driver) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(TRAINING_XPATH)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void staffClick(WebDriver driver) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(STAFF_XPATH)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void availabilityClick(WebDriver driver) {
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(AVAILABILITY_XPATH)).click();
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void payrollClick(WebDriver driver) {
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(PAYROLL_XPATH)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void reportsClick(WebDriver driver) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(REPORTS_XPATH)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void addEmployee(WebDriver driver) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(ADD_EMPLOYEES_XPATH)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(ADD_FIRSTNAME_XPATH)).sendKeys("Oliva");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(ADD_LASTNAME_XPATH)).sendKeys("Popajeva");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(ADD_EMAIL_XPATH)).sendKeys("popajeva.o@gmail.com");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(SAVE_NEW_EMPLOYEE_XPATH)).click();
	}

	public static void changeName(WebDriver driver) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(FIND_LAST_ADDED_EMPLOYEE_XPATH)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(ADDED_EMPLOYEE_EDIT_XPATH)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(CHANGE_EMPLOYEE_NAME_XPATH)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(CHANGE_EMPLOYEE_NAME_XPATH)).clear();
		
		driver.findElement(By.xpath(CHANGE_EMPLOYEE_NAME_XPATH)).sendKeys("Popi");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(SAVE_NEW_EMPLOYEE_NAME_XPATH)).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(STAFF_XPATH)).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
