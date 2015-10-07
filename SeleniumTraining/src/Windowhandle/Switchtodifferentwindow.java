package Windowhandle;


import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class Switchtodifferentwindow {
	
	/*
	 *This class is used to handle multiple popups 
	 * 
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
		
		//=====================================================================================//
	
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()){
		String Mainwindow = it.next();
		System.out.println("Main window handle "+Mainwindow);
		String FirstWindows = it.next();
		System.out.println("First window handle "+FirstWindows);
		String SecondWindow = it.next();
		driver.switchTo().window(Mainwindow);
		System.out.println("Second window handle "+SecondWindow);
		//perform actions on new window
		driver.switchTo().window(FirstWindows);
		System.out.println("Printing first window title "+driver.getTitle());
		System.out.println("Closing first window");
		driver.close();
		driver.switchTo().window(SecondWindow);
		System.out.println("Printing second window title "+driver.getTitle());
		System.out.println("Closing second window");
		driver.close();
		driver.switchTo().window(Mainwindow);
		System.out.println("Printing main window title "+driver.getTitle());
		System.out.println("Closing main window");
		driver.close();
		}
		//====================================================================================//
		
		// Handle alerts
		/*
		Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.dismiss();
        alert.getText();
        alert.sendKeys("Data");*/
        

       
}
}
