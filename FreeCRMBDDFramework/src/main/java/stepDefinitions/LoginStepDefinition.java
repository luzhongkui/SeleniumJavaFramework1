package stepDefinitions;
 
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import org.testng.annotations.Test;

//@Scenario("Free CRM Login Test Scenario")

public class LoginStepDefinition {
	@Before
	public void SetUp() {
		System.out.println("Initializing the test");
		
	}
	
	@After
	public void tearDown() {
		System.out.println("Finish the test");
		
	}
	
	@Before("@First")
	public void SetUp1() {
		System.out.println("Initializing the test");
		
	}
	
	@After("@First")
	public void tearDown1() {
		System.out.println("Finish the test");
		
	}
	
	WebDriver driver ;
	@Given("on login page")
	public void on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\luzhongk\\Selenium\\Web Driver\\chromedriver.exe");
		                    
		/*ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		DesiredCapabilities caps = DesiredCapabilities.chrome(); 
		caps.setCapability(ChromeOptions.CAPABILITY, options); 
		driver = new RemoteWebDriver(caps);*/
		
		ChromeOptions options = new ChromeOptions(); 
		//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		driver = new ChromeDriver(); 
		
		//driver = new InternetExplorerDriver(); 
		
		 
		driver.get("https://classic.freecrm.com/index.html?e=1");
	 
		driver.manage().window().maximize();
	 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		
	}
	@When("title is Free CRM")
	//   \"(.*)\"
	public void title_is_Free_CRM () {
		String title =driver.getTitle();
		System.out.println("Window's Title is :" + title);
		title = title.substring(0, 3);
		System.out.println("Window's Title is :" + title);
		Assert.assertEquals("CRM says…", title); 
	}
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password (String username,String password) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys(username);
	 
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
	@Then("quit from application")
	public void quit_from_application ()   {
		driver.quit();
		
	}
}
