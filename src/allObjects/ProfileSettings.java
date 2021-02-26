package allObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfileSettings {
	public static final String URL = "https://kucicaodcokolade.humanity.com/app/staff/edit/6081211/";
	private static final String WRAP_US_MENU_XPATH = "//*[@id=\"wrap_us_menu\"]/i";
	private static final String SETTINGS_XPATH = "//*[@id=\"userm\"]/div/a[2]";
	private static final String FIRST_NAME_XPATH = "//*[@id=\"first_name\"]";
	private static final String LAST_NAME_XPATH = "//*[@id=\"last_name\"]";
	private static final String SAVE_EMPLOYEE_XPATH = "//*[@id=\"act_primary\"]";
	private static final String REFRESH_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[4]/td[2]/div/a";

	public static void changeOfFirstParameter(WebDriver driver) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(WRAP_US_MENU_XPATH)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(SETTINGS_XPATH)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(FIRST_NAME_XPATH)).click();
		driver.findElement(By.xpath(FIRST_NAME_XPATH)).clear();
		driver.findElement(By.xpath(FIRST_NAME_XPATH)).sendKeys("Ben");

	}

	public static void changeOfSecondParameter(WebDriver driver) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(LAST_NAME_XPATH)).click();
		driver.findElement(By.xpath(LAST_NAME_XPATH)).clear();
		driver.findElement(By.xpath(LAST_NAME_XPATH)).sendKeys("Jerry");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(SAVE_EMPLOYEE_XPATH)).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(REFRESH_XPATH)).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}












