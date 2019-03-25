package seleniumtask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BookStore {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);

		ChromeOptions option=new ChromeOptions();
        option.addArguments("--disable-notifications");
        option.addArguments("--disable-infobars");
        option.merge(caps);

		
		driver.get("https://www.barnesandnoble.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to(driver.getCurrentUrl());
		
//		driver.findElement(By.xpath("//div[@class='bx-creative bx-creative-937613']//div[@id='bx-element-937613-AGprEkq']//button")).click();
	Thread.sleep(2000);
	
		Actions act= new Actions(driver);
		WebElement m=driver.findElement(By.xpath("//ul[@id='nav']//li[1]"));
		act.moveToElement(m).build().perform();
		
	}

}
