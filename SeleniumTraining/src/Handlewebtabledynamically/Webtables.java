package Handlewebtabledynamically;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Webtables {
	
	/*
	 * This class is used to handle webtable 
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
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		driver.findElement(By.xpath("//div[@id='main']/table[1]/tbody"));

		List<WebElement> rows = driver.findElements(By
				.xpath("//div[@id='main']/table[1]/tbody/tr"));

		List<WebElement> column = driver.findElements(By
				.xpath("//div[@id='main']/table[1]/tbody/tr[2]/td"));

		List<WebElement> completetable = driver.findElements(By
				.xpath("//div[@id='main']/table[1]/tbody/tr/td"));

		List<WebElement> Anysinglecolumn = driver.findElements(By
				.xpath("//div[@id='main']/table[1]/tbody/tr/td[2]"));

		List<WebElement> Anysinglerows = driver.findElements(By
				.xpath("//div[@id='main']/table[1]/tbody/tr[2]"));

		System.out.println("Total number of rows " + rows.size());

		System.out.println("========================================");

		System.out.println("Total number of Column " + column.size());

		System.out.println("========================================");

		for (int i = 0; i < rows.size(); i++) {
			System.out.println("Rows data  "+ rows.get(i).getText());
		}
		System.out.println("========================================");
		for (int j = 0; j < column.size(); j++) {
			System.out.println("Column data  "+ column.get(j).getText());
		}

		System.out.println("========================================");

		for (int k = 0; k < completetable.size(); k++) {
			System.out.println("Total table data "
					+ completetable.get(k).getText());
		}
		System.out.println("========================================");

		for (int l = 0; l < Anysinglecolumn.size(); l++) {
			System.out.println("Any single column "
					+ Anysinglecolumn.get(l).getText());
		}
		System.out.println("========================================");

		for (int l = 0; l < Anysinglerows.size(); l++) {
			System.out.println("Any single row "
					+ Anysinglerows.get(l).getText());
		}

		driver.quit();

	}

}
