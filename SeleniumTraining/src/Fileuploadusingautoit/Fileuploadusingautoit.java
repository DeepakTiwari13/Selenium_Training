package Fileuploadusingautoit;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Fileuploadusingautoit {
	
	/*
	 * This class is used to upload files in browse dialog using send keys
	 * This class is used to upload files in browse dialog of windows using AUTOIT tool
	 * 07-10-2015
	 * 
	 * 
	 */

	public static void main(String[] args) throws IOException {
		File path = new File(
				"C:\\Users\\deepakt\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary Binary = new FirefoxBinary(path);
		FirefoxProfile pro = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(Binary, pro);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://postimage.org/");
		driver.findElement(By.xpath("//input[@class='uploadifive-file']"))
				.sendKeys("E:\\Liquid compass\\IDBI data.txt");
		System.out
				.println("=============================================================================");

		driver.get("http://picpaste.com/");
		WebElement dialog = driver.findElement(By
				.xpath("//input[@type='file']"));
		dialog.sendKeys(Keys.ENTER);
		Process process = Runtime.getRuntime().exec(
				"E:\\Liquid compass\\Uploadfile.exe");
		System.out.println("File uploaded");

	}

}
