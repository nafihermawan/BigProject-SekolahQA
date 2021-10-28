package step_definition;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver webDriver;

	@Before
	
	public void openBrowser() throws MalformedURLException {
		System.out.println("Called openBrowser");
		
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--disable-extensions");
		chromeOptions.addArguments("--disable-popup-blocking");
		chromeOptions.addArguments("--profile-directory=Default");
		chromeOptions.addArguments("--ignore-certificate-errors");
		chromeOptions.addArguments("--disable-plugins-discovery");

		chromeOptions.addArguments("user_agent=DN");
		chromeOptions.addArguments("user-data-dir=C:\\Users\\nafih_000\\AppData\\Local\\Google\\Chrome\\User Data");	
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		webDriver = new ChromeDriver(chromeOptions);
		
//		System.out.println(" Test");
		webDriver.manage().window().maximize();
		webDriver.get("https://staging.cicle.app/");
	}

	@After

	public void afterTest() {
		System.out.println("After Test");
		webDriver.close();
	}
}