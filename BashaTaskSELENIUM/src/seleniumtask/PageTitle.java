package seleniumtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {
      
	public static void main(String[] args) throws InterruptedException {

		
		
		for(int i=0;i<5;i++)
		{
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");

		    driver=new ChromeDriver();

			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			String title=driver.getTitle();
			System.out.println(title);
			driver.close();

		}
		
		
			
}
	}
