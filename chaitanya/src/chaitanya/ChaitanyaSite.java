package chaitanya;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChaitanyaSite {

	public static void main(String[] args) throws InterruptedException
	
	{

		   System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		   driver.manage().window().maximize();
		   
	        /* USING LIST ELEMENTS
	       
			        List <WebElement> elements = driver.findElements(By.xpath("//select[@id='programming-languages']"));
					//System.out.println(elements.size());
					for(int i=0;i<elements.size();i++)
					{
						System.out.println(elements.get(i).getText());
					}*/
				   
			Thread.sleep(2000);
			
			// USING SELECT CLASS
			
			
				Select s1= new Select(driver.findElement(By.xpath("//select[@id='programming-languages']")));
				List <WebElement> l1=s1.getOptions();
						
						for(int i=0;i<l1.size();i++)
						{
						   if(l1.get(i).getText().equals("JavaScript"))
							 {
							   l1.get(i).click();
							}
			            }
						
						
			   System.out.println("---------------------------");
			   Thread.sleep(2000);

			
			    Select s = new Select(driver.findElement(By.xpath("//select[@id='selenium_suite']")));
			    List <WebElement> element2 =s.getOptions();
			    
			    		for(int i=0;i<element2.size();i++)
			    		{
			    			System.out.println(element2.get(i).getText());
				
			    		}
			    Thread.sleep(2000);

		   
		    //Selecting Multiple Elements
		    
			    s.selectByVisibleText("Selenium IDE");
			    s.selectByVisibleText("Selenium RC");
			    s.selectByVisibleText("Limitations");
			    
			    
				Thread.sleep(2000);

		    //USING CHECK BOXES
		    
			    driver.findElement(By.xpath("//div[@id='twoWheelVehicles']//input[@value='Bicycle']")).click();
			    driver.findElement(By.xpath("//input[@value='Sedan']")).click();
				Thread.sleep(2000);


		    
		    //USING RADIO BUTTONS
				
			    driver.findElement(By.xpath("//input[@value='Novels']")).click();
		  
		    //USING BUTTON
			    
			    //ALERT BUTTON
			   driver.findElement(By.xpath("//button[@id='alertBox']")).click();
				Thread.sleep(2000);

				//CONFIRM BOX
			  //  driver.findElement(By.xpath("//button[@id='confirmBox']")).sendKeys(Keys.ENTER);
				
				//USING TABLE DATAS
				
				driver.findElement(By.xpath("//table[@class='table table-bordered']//td[contains(text(),'Selenium')]")).click();

			  
             /*	        Alert myAlert = driver.switchTo().alert();

	        // Accept the Alert

	        myAlert.accept();

 */
		    
		  

		    
	       

	}

}
