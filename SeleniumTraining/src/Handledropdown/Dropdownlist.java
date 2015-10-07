package Handledropdown;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {
	
	/*
	 * This class is used to select the values in drop down using select class of selenium
	 * 07-10-2015
	 * 
	 */

	public static void main(String[] args) {
		File path = new File(
				"C:\\Users\\deepakt\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary Binary = new FirefoxBinary(path);
		FirefoxProfile pro = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(Binary, pro);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.amazon.in/");
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']"))
				.click();

		WebElement dropdown = driver.findElement(By
				.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(dropdown);
		select.selectByIndex(3);
		driver.findElement(By.xpath("//input[@class='nav-input']")).sendKeys(
				Keys.ENTER);

	}

}
