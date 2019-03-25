package seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("how to include a timestamp along with the name of screenshot. If u don’t include a time-stamp, all the screenshots will be overwritten. ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
	}

}
