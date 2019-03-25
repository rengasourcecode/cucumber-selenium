package seleniumtask;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultipleBrowsers {
	static WebDriver driver1,driver2,driver3;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		
		driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		System.setProperty("webdriver.gecko.driver","D:\\sedrivermozilla\\geckodriver.exe");
		driver2 = new FirefoxDriver();
		driver2.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		System.setProperty("webdriver.ie.driver","D:\\sedriverInternetExplorer\\IEDriverServer.exe");
		driver3 = new InternetExplorerDriver();
		driver3.get("https://www.facebook.com/");
		Thread.sleep(2000);


		
	
	}

}
