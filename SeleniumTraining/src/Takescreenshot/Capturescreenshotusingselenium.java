package Takescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Capturescreenshotusingselenium {
	
	/*
	 * 
	 * This class is used to capture the screenshot
	 * 07-10-2015
	 */

	static WebDriver driver = null;

	public static void main(String[] args) throws IOException {

		File path = new File(
				"C:\\Users\\deepakt\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary Binary = new FirefoxBinary(path);
		FirefoxProfile pro = new FirefoxProfile();
		driver = new FirefoxDriver(Binary, pro);
		driver.get("http://www.licindia.in/");
		takescreenshot("DeepakLic");

	}

	public static void takescreenshot(String name) throws IOException {

		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(
				"E:\\Liquid compass\\WorkSpace\\TrainingDay5\\src\\Screenshot\\"
						+ name + ".jpg"));

	}

}
