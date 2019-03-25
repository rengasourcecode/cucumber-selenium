package seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberofEmails {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("cnt2dinesh@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("DINESHFEB19");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(2000);
      /*  driver.findElement(By.xpath("//div[contains(text(),'Get a verification code at')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("idvPin")).sendKeys("423861");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Done')]")).click();
        Thread.sleep(2000); */
        String inbox=driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/u/0/#inbox']")).getText();
        System.out.println(inbox);
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[@class='gb_ya gbii']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
	}

}
