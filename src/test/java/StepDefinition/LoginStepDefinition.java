package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;

	@Given("user is already on Login Page")
	public void user_is_already_on_Login_Page() {
	
		System.setProperty("webdriver.chrome.driver", "E:\\JavaSelenium\\BDDCucumberFramework\\Drivers\\chromedriver1.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@When("title of the login pgae is OrangeHRM")
	public void title_of_the_login_page_is_OrangeHRM() {
		
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("OrangeHRM", title);		
	}
	
	@Then("user enters username and Password")
	public void user_enters_username_and_Password() throws Exception {
		
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("admin123");
	    Thread.sleep(3000);
	}
	
	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
		
		driver.findElement(By.xpath("//input[@type='submit'][@name='Submit']")).click();
			   
	}
	@Then("user is on home page")
	public void user_is_on_home_page() {
		String HomeTitle=driver.getTitle();
		System.out.println("Home page title is: " +HomeTitle);
	}

	@Then("user clicks on Forgot your password")
	public void user_clicks_on_Forgot_your_password() throws Exception {
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(3000);
}
/*
 * @Then("user is on HR management Page") public void
 * user_is_on_HR_management_Page() {
 * 
 * String ForgotPageTitle = driver.getTitle();
 * System.out.println("The HR MAnagement page is: "+ForgotPageTitle); }
 */
	@Given("user is on Home Page")
	public void user_is_on_Home_Page() throws Exception {
	   
		System.setProperty("webdriver.chrome.driver", "E:\\JavaSelenium\\BDDCucumberFramework\\Drivers\\chromedriver1.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("OrangeHRM", title);
		driver.findElement(By.xpath("//input[@type='text'][@name='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("admin123");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@type='submit'][@name='Submit']")).click();
		
	}

	@Then("user make mouse hover on Welcome Admin")
	public void user_make_mouse_hover_on_Welcome_Admin() {
	  
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement admin = driver.findElement(By.xpath("//b[text()='Admin']"));
		act.moveToElement(admin).build().perform();
		
		WebElement pim = driver.findElement(By.xpath("//b[text()='PIM']"));
		act.moveToElement(pim).build().perform();
		
		WebElement leave = driver.findElement(By.xpath("//b[text()='Leave']"));
		act.moveToElement(leave).build().perform();
		
		WebElement time = driver.findElement(By.xpath("//b[text()='Time']"));
		act.moveToElement(time).build().perform();
		
		
		
		WebElement recruitment = driver.findElement(By.xpath("//b[text()='Recruitment']"));
		act.moveToElement(recruitment).build().perform();
		
		WebElement performance = driver.findElement(By.xpath("//b[text()='Performance']"));
		WebElement configure= driver.findElement(By.xpath("//a[text()='Configure']"));
		WebElement trackers= driver.findElement(By.xpath("//a[text()='Trackers']"));
		act.moveToElement(performance).moveToElement(configure).moveToElement(trackers).click().build().perform();
		
		WebElement target = driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
		act.moveToElement(target).click().build().perform();
		
	}

	@Then("user clicks on Logout")
	public void user_clicks_on_Logout() {

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		System.out.println("User clicks on Logout button");
	}
	
	
	
	@Then("user enters the Username")
	public void user_enters_the_Username() throws Exception {  
		driver.findElement(By.xpath("//input[@type='text'][@name='securityAuthentication[userName]']")).sendKeys("Praveen");
		Thread.sleep(2000);
	}
	
	@Then("user clicks on Reset Password")
	public void user_clicks_on_Reset_Password() throws Exception {
	  
		driver.findElement(By.xpath("//input[@type='submit'][@name='button']")).click();
		Thread.sleep(2000);
	}
	@Then("user clicks on Cancel")
	public void user_clicks_on_Cancel() {
	   driver.findElement(By.xpath("//input[@type='button'][@name='button']")).click();
		
	}
}
	
	

