package allObjects;

import java.io.File;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class StatusEmployee {
	
	public static final String URL = "https://kucicaodcokolade.humanity.com/app/dashboard/";
	private static final String DASHBOARD_XPATH = "//*[@id=\"sn_dashboard\"]/span";
	private static final String SHIFTPLANNING_XPATH = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[2]/a/span";
	private static final String TIMECLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span";
	private static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span";
	private static final String TRAINING_XPATH = "//*[@id=\"sn_training\"]/span";
	private static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span";
	private static final String AVAILABILITY_XPATH = "//*[@id=\"sn_availability\"]/span";
	private static final String PAYROLL_XPATH = "//*[@id=\"root\"]/div[2]/div/div/div[1]/div/div/div[2]/div[8]/a";
	private static final String REPORTS_XPATH = "//*[@id=\"sn_reports\"]/span";
	private static final String ADD_EMPLOYEES_XPATH = "//*[@id=\"act_primary\"]";
	private static final String ADD_FIRSTNAME_XPATH = "//*[@id=\"_asf1\"]";
	private static final String ADD_LASTNAME_XPATH = "//*[@id=\"_asl1\"]";
	private static final String ADD_EMAIL_XPATH = "//*[@id=\"_ase1\"]";
	private static final String SAVE_NEW_EMPLOYEE_XPATH = "//*[@id=\"_as_save_multiple\"]";
	private static final String ADDED_EMPLOYEE_XPATH = "//*[@id=\"7\"]/a";
	private static final String ADDED_EMPLOYEE_EDIT_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	private static final String ADDED_EMPLOYEE_NAME_XPATH = "//*[@id=\"first_name\"]";
	private static final String SAVE_CHANGES_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[39]/td/input";
	public static final String LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	public static final String LOGIN_EMAIL_XPATH = "//*[@id=\"email\"]";
	public static final String LOGIN_PASS_XPATH = "//*[@id=\"password\"]";
	public static final String LOGIN_BUTTON_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	public static final String ANNOUNCMENT_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	public static final String DENY_COOKIES_XPATH = "//*[@id=\"cf-root\"]/div/div/div/div[2]/div[2]/div[2]/button";

public static void logIn(WebDriver driver) {
		
		driver.findElement(By.xpath(ANNOUNCMENT_XPATH)).click();
		driver.findElement(By.xpath(DENY_COOKIES_XPATH)).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(LOGIN_XPATH)).click();
		driver.findElement(By.xpath(LOGIN_EMAIL_XPATH)).sendKeys("ivica.marica@maceha.com"); 
		driver.findElement(By.xpath(LOGIN_PASS_XPATH)).sendKeys("mrzimlozinke"); 
		driver.findElement(By.xpath(LOGIN_BUTTON_XPATH)).click();
	}

	public static void checkAddedEmployee1(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Lord Garmadon")).click();
	}
	public static void checkAddedEmployee2(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Jay Ninjago")).click();
	}
	public static void checkAddedEmployee3(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Nia Ninjago")).click();
	}
	public static void checkAddedEmployee4(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Kay Ninjago")).click();
	}
	public static void checkAddedEmployee5(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Zain Ninjago")).click();
	}
}
