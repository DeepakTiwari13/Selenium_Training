package Webdriverwait;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitlywait {

		/*
		 * This class is used to handle wait for a particular element in web page
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
			driver.get("https://www.facebook.com/login/");

			 WebDriverWait wait1 = new WebDriverWait(driver,30);
			 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='u_0_2']")));
			 
			 Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
					 .withTimeout(30,TimeUnit.SECONDS)
					 .pollingEvery(5, TimeUnit.SECONDS)
					 .ignoring(NoSuchElementException.class);
			 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='u_0_2']")));

	}

}
