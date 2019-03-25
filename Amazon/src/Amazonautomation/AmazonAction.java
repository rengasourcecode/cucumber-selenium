package Amazonautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		   
		Actions act= new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-shopall']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Amazon Prime Video')]"))).build().perform();
        driver.findElement(By.xpath("//div//a[2]//span[1][contains(text(),'Movies')and @class='nav-text']")).click();

		
	}

}
