package seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEsample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	//driver.close();
	//Thread.sleep(5);
	//driver.quit();
	//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("dinesh");
	driver.findElement(By.id("search")).sendKeys("dinesh");
	
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();

	
	
	}

}
