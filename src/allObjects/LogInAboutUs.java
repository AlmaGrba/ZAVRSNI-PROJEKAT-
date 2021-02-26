package allObjects;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LogInAboutUs {
	public static final String URL = "https://www.humanity.com/";
	public static final String ABOUTUS_URL = "https://www.humanity.com/about";
	public static final String ANNOUNCMENT_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	public static final String DENY_COOKIES_XPATH = "//*[@id=\"cf-root\"]/div/div/div/div[2]/div[2]/div[2]/button";
	public static final String HOVERING_ABOUTUS_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a";
	public static final String ABOUTUS_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[1]";
	public static final String LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	public static final String LOGIN_EMAIL_XPATH = "//*[@id=\"email\"]";
	public static final String LOGIN_PASS_XPATH = "//*[@id=\"password\"]";
	public static final String LOGIN_BUTTON_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	
	public static void aboutUs(WebDriver driver) {
		
		driver.findElement(By.xpath(ANNOUNCMENT_XPATH)).click();
		driver.findElement(By.xpath(DENY_COOKIES_XPATH)).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(HOVERING_ABOUTUS_XPATH)).click();
		driver.findElement(By.xpath(ABOUTUS_XPATH)).click();
	}
	
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
}
