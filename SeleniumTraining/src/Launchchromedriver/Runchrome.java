package Launchchromedriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runchrome {

	/*
	 * This class runs the chrome browser
	 * 07-10-2015
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\Launchchromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Serach Data");
		Thread.sleep(5000l);
		driver.navigate().back();
		driver.navigate().forward();

	}

}
