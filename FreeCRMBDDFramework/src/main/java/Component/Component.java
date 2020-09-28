package Component;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Component {
	public String broswerName ;
	public String broswerDriver;
	public WebDriver openPageChrome(String inbroswerName,String inbroswerDriver) {
		System.setProperty(inbroswerName,inbroswerDriver);
		ChromeOptions options = new ChromeOptions(); 
		//options.addArguments("disable-infobars"); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		WebDriver driver = new ChromeDriver(options) ;
		driver.get("https://demo.suiteondemand.com/index.php?module=Users&action=Login");
		return driver ;
	}
	public WebDriver openPageIE(String inbroswerName,String inbroswerDriver) {
		System.setProperty(inbroswerName,inbroswerDriver);
		 
		 
		WebDriver driver = new InternetExplorerDriver( ) ;
		//driver.get("https://demo.suiteondemand.com/index.php?module=Users&action=Login");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://demo.suiteondemand.com/index.php?module=Users&action=Login");
		return driver ;
	}
	
	public WebDriver openPageFirefox(String inbroswerName,String inbroswerDriver) {
		System.setProperty(inbroswerName,inbroswerDriver);
		 
		 
		WebDriver driver = new   FirefoxDriver( ) ;
		//driver.get("https://demo.suiteondemand.com/index.php?module=Users&action=Login");
		driver.get("https://demo.suiteondemand.com/index.php?module=Users&action=Login");
		return driver ;
	}
	public WebDriver openPageEdge(String inbroswerName,String inbroswerDriver) {
		System.setProperty(inbroswerName,inbroswerDriver);
		EdgeOptions options = new EdgeOptions(); 
		//options.addArguments("disable-infobars"); 
		//options.se setExperimentalOption("useAutomationExtension", false);
		//options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setCapability("ignore-certificate-errors" , true);
		WebDriver driver = new EdgeDriver (options);
		driver.get("https://demo.suiteondemand.com/index.php?module=Users&action=Login");
		return driver ;
		
		 
	 

		
		
		
	}
	public void closepage(WebDriver driver) throws InterruptedException, Exception{
		Robot robot = new Robot() ;
		robot.mouseMove(1500, 80);
		Thread.sleep(1000); 
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 1 = left button ,3 =right button
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000); 
	 
		
		robot.mouseMove(1500, 110);
		Thread.sleep(1000); 
		robot.mouseMove(1500, 260);
		Thread.sleep(1000);
		//driver.findElement(By.id("logout_link")).click();
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 1 = left button ,3 =right button
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000);
		
		robot.mouseMove(1500, 150);
		Thread.sleep(1000); 
		robot.mouseMove(1500, 300);
		Thread.sleep(1000);
		//driver.findElement(By.id("logout_link")).click();
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);// 1 = left button ,3 =right button
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		
		driver.quit();		 
	}
    public WebElement username(WebDriver driver) {
    	   WebElement username = driver.findElement(By.name("user_name"));
    	   return username ;
    }
    public WebElement password(WebDriver driver) {
    	 
    	WebElement password = driver.findElement(By.name("username_password"));
 	    return password ;
 	   
    }
    public WebElement submit (WebDriver driver) {
 	   WebElement submit = driver.findElement(By.xpath("//input[@id='bigbutton']")) ;
 	   return submit ;
    }
    public WebElement userprofile (WebDriver driver) {
  	   WebElement userprofile = driver.findElement(By.xpath("//span[@class='suitepicon suitepicon-action-current-user']")) ;
  	   return userprofile ;
     }
 
} 

