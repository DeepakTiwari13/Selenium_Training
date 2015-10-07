package Listofelements;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Listing {
	
	/*
	 * 
	 * This class is used to store multiple links together
	 * This class is used to clink on each link one by one
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
		driver.get("http://synerzip.com//");
		driver.findElement(By.xpath("//*[@id='menu-item-20']/a")).click();

		WebElement outerbox = driver.findElement(By
				.xpath("//ul[@id='menu-we-are-making-headlines']/li"));
		List<WebElement> Innerlinks = outerbox.findElements(By.tagName("a"));

		for (int i = 1; i < Innerlinks.size(); i++) {
			System.out.println("Total links name are "
					+ Innerlinks.get(i).getText());

		}

		for (int j = 1; j < Innerlinks.size(); j++) {
			WebElement outerbox1 = driver.findElement(By
					.xpath("//ul[@id='menu-we-are-making-headlines']/li"));
			List<WebElement> Innerlinks1 = outerbox1.findElements(By
					.tagName("a"));
			Innerlinks1.get(j).click();
			System.out.println("Current page " + driver.getTitle());
			driver.get("http://synerzip.com//");
			driver.findElement(By.xpath("//*[@id='menu-item-20']/a")).click();

		}

	}

}
