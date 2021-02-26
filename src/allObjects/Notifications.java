package allObjects;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Notifications {
	public static final String URL = "https://www.humanity.com/";
	public static final String URL1 = "https://kucicaodcokolade.humanity.com/app/dashboard/";
	public static final String NOTIFICATIONS_URL = "https://kucicaodcokolade.humanity.com/app/staff/notifications/"; 
	public static final String LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	public static final String LOGIN_EMAIL_XPATH = "//*[@id=\"email\"]";
	public static final String LOGIN_PASS_XPATH = "//*[@id=\"password\"]";
	public static final String LOGIN_BUTTON_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	public static final String MENU_ARROW_XPATH = "//*[@id=\"wrap_us_menu\"]/i";
	public static final String PROFILE_BUTTON_XPATH = "/html/body/table/tbody/tr/td/div[4]/div/a[1]";
	public static final String NOTIFICATIONS_BUTTON_XPATH = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[1]/a[6]";
	public static final String EMAIL_BUTTON_XPATH = "//*[@id=\"email[pref]\"]"; 
	public static final String SMS_BUTTON_XPATH = "//*[@id=\"sms[pref]\"]";
	public static final String MOBILEPUSH_BUTTON_XPATH = "//*[@id=\"mobile_push[pref]\"]";
	public static final String SAVE_NOTIFICATIONS_BUTTON_XPATH = "//*[@id=\"notif-settings\"]";
	
public static void logIn(WebDriver driver) {
		
		driver.get(URL);
		driver.findElement(By.xpath(LOGIN_XPATH)).click();
		driver.findElement(By.xpath(LOGIN_EMAIL_XPATH)).sendKeys("ivica.marica@maceha.com"); 
		driver.findElement(By.xpath(LOGIN_PASS_XPATH)).sendKeys("mrzimlozinke"); 
		driver.findElement(By.xpath(LOGIN_BUTTON_XPATH)).click();
	}
	
	public static void disableNotifications(WebDriver driver) {

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
		
		driver.findElement(By.xpath(NOTIFICATIONS_BUTTON_XPATH)).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(EMAIL_BUTTON_XPATH)).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(SMS_BUTTON_XPATH)).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(MOBILEPUSH_BUTTON_XPATH)).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(SAVE_NOTIFICATIONS_BUTTON_XPATH)).click();
		
	}			

}

