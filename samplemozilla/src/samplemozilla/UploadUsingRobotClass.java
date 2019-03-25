package samplemozilla;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadUsingRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		Robot robot= new Robot();

		//System.setProperty("webdriver.gecko.driver","D:\\sedrivermozilla\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='imagesrc']")).click();
		
		robot.setAutoDelay(2000);
		
		StringSelection ss=new StringSelection("C:\\Users\\Dinesh\\Desktop\\OOPS.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		robot.setAutoDelay(2000);

			robot.keyPress(KeyEvent.VK_CONTROL);
		
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);

			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);


			


		

	}

}
