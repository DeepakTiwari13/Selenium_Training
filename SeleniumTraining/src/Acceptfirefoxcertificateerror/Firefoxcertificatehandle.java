package Acceptfirefoxcertificateerror;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefoxcertificatehandle {
	
	/*
	 * 
	 * This class is used to accept the untrusted certificate using firefox
	 * 07-10-2015
	 * 
	 * 
	 */

	public static void main(String[] args) {

		File path = new File(
				"C:\\Users\\deepakt\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary Binary = new FirefoxBinary(path);
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("default");
		myprofile.setAcceptUntrustedCertificates(true);
		myprofile.setAssumeUntrustedCertificateIssuer(true);
		WebDriver driver = new FirefoxDriver(Binary, myprofile);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
