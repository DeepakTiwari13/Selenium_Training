package SelectFrames;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Switchtoframes {
	
	/*
	 * Using this class user can switch to frames
	 * 07-10-2015
	 * 
	 */

	public static void main(String[] args) {
		// Path to firefox exe
		File path = new File(
				"C:\\Users\\deepakt\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary Binary = new FirefoxBinary(path);
		FirefoxProfile pro = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(Binary, pro);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/* <iframe frameborder="0"
		style="border: 0px none; width: 100%; height: 356px; min-width: 0px; min-height: 0px; overflow: auto;"
		dojoattachpoint="frame" title="Fill Quote"
		src="https://tssstrpms501.corp.trelleborg.com:12001/teamworks/process.lsw?zWorkflowState=1&zTaskId=4581&zResetContext=true&coachDebugTrace=none">
		*/ 
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Fill Quote']")));
		driver.switchTo().frame(1); // pass frame number as parameter.
		driver.switchTo().frame("String");// pass frame name as parameter.
		driver.switchTo().frame("WebElement");
		driver.switchTo().defaultContent();

	}

}
