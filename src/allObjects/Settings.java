package allObjects;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Settings {
	
	public static final String URL = "https://www.humanity.com/";
	public static final String URL1 = "https://kucicaodcokolade.humanity.com/app/dashboard/";
	public static final String SETTINGS_URL = "https://kucicaodcokolade.humanity.com/app/admin/settings/";
	public static final String SETTINGS_XPATH = "//*[@id=\"sn_admin\"]/span"; 
	public static final String LANGUAGE_BOX_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select"; 
	public static final String SETTINGS_BUTTON_XPATH = "//*[@id=\"sn_admin\"]/span";
	public static final String SAVE_SETTINGS_BUTTON_XPATH = "//*[@id=\"_save_settings_button\"]"; 
	public static final String REFRESH_BUTTON_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[1]/label/a";
	public static final String LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	public static final String LOGIN_EMAIL_XPATH = "//*[@id=\"email\"]";
	public static final String LOGIN_PASS_XPATH = "//*[@id=\"password\"]";
	public static final String LOGIN_BUTTON_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	
	
public static void logIn(WebDriver driver) {
		
		driver.get(URL);
		driver.findElement(By.xpath(LOGIN_XPATH)).click();
		driver.findElement(By.xpath(LOGIN_EMAIL_XPATH)).sendKeys("ivica.marica@maceha.com"); 
		driver.findElement(By.xpath(LOGIN_PASS_XPATH)).sendKeys("mrzimlozinke"); 
		driver.findElement(By.xpath(LOGIN_BUTTON_XPATH)).click();
	}
	
	public static void setLanguage(WebDriver driver) {

		driver.get(URL1);
		driver.findElement(By.xpath(SETTINGS_XPATH)).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Select lang = new Select(driver.findElement(By.name("language")));
		driver.findElement(By.xpath(LANGUAGE_BOX_XPATH)).sendKeys("Croatian (machine)");
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(SAVE_SETTINGS_BUTTON_XPATH)).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(SETTINGS_BUTTON_XPATH)).click();
		
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}

		driver.findElement(By.xpath(REFRESH_BUTTON_XPATH)).click();
		
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}

	}			

}
