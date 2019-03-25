package seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxhandlings {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.xpath("//input[@value='red']"));
		element.click();
		if(element.isEnabled())
		{
			System.out.println("red check box is enabled"); 
			
		}
		WebElement element2=driver.findElement(By.xpath("//input[@value='yellow']"));
		if(element2.isSelected())
		{
			System.out.println("yellow check box is enabled"); 

		}else 			
			{
			System.out.println("yellow check box is disabled"); 
		
			}
	}

	}


