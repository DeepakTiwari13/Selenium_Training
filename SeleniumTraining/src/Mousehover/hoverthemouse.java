package Mousehover;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class hoverthemouse {
	
	/*
	 * 
	 * This class is used to hover the mouse
	 * 07-10-2015
	 * 
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
		driver.get("http://www.naukri.com/");

		Actions act = new Actions(driver);
		WebElement e1 = driver.findElement(By.xpath("//div[@class='mTxt']"));
		act.moveToElement(e1).build().perform();
		// act.dragAndDrop(source, target).build().perform();

	}

}
