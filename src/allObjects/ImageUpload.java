package allObjects;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImageUpload {

	public static final String URL = "https://www.humanity.com/";
	public static final String URL1 = "https://kucicaodcokolade.humanity.com/app/dashboard/";
	public static final String EMPLOYEE_URL = "https://kucicaodcokolade.humanity.com/app/staff/edit/6081211/"; 
	public static final String LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	public static final String LOGIN_EMAIL_XPATH = "//*[@id=\"email\"]";
	public static final String LOGIN_PASS_XPATH = "//*[@id=\"password\"]";
	public static final String LOGIN_BUTTON_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	public static final String MENU_ARROW_XPATH = "//*[@id=\"wrap_us_menu\"]/i";
	public static final String PROFILE_BUTTON_XPATH = "/html/body/table/tbody/tr/td/div[4]/div/a[1]";
	public static final String EDIT_DETAILS_BUTTON_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String UPLOAD_IMAGE_BUTTON_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/span[1]/input";
	public static final String SAVE_EMPLOYEE_BUTTON_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[42]/td/input";
	
public static void logIn(WebDriver driver) {
		
		driver.get(URL);
		driver.findElement(By.xpath(LOGIN_XPATH)).click();
		driver.findElement(By.xpath(LOGIN_EMAIL_XPATH)).sendKeys("ivica.marica@maceha.com"); 
		driver.findElement(By.xpath(LOGIN_PASS_XPATH)).sendKeys("mrzimlozinke"); 
		driver.findElement(By.xpath(LOGIN_BUTTON_XPATH)).click();
	}
	
	public static void imageUpload(WebDriver driver) {

		driver.get(URL1);
		driver.findElement(By.xpath(MENU_ARROW_XPATH)).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(PROFILE_BUTTON_XPATH)).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(EDIT_DETAILS_BUTTON_XPATH)).click();
	
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(UPLOAD_IMAGE_BUTTON_XPATH)).sendKeys("C:\\Users\\Lenovo\\Desktop\\deda.jpg");
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(SAVE_EMPLOYEE_BUTTON_XPATH)).click();
}
}

