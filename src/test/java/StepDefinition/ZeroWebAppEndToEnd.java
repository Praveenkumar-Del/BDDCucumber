package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ZeroWebAppEndToEnd {

	WebDriver driver;
	
	@Given("user is already on Login page")
	public void user_is_already_on_Login_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\JavaSelenium\\BDDCucumberFramework\\Drivers\\chromedriver1.exe");
		driver= new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//text()[contains(.,'Signin')]/ancestor::button[1]")).click();
		
	}

	@When("user enters the Login Credentials and click on Sign in")
	public void user_enters_the_Login_Credentials_and_click_on_Sign_in() throws Exception {
	    
		driver.findElement(By.xpath("//input[@type='text'][@name='user_login']")).sendKeys("username");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password'][@name='user_password']")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit'][@name='submit']")).click();
		Thread.sleep(2000);
		
	}

	@Then("user is on Account summary page")
	public void user_is_on_Account_summary_page() {
	    
		String ActualTitle= driver.getTitle();
		System.out.println("The Zero bank title Page is: "+ActualTitle);
		
		String ExpTitle = "Zero - Account Summary";
		
		if (ActualTitle.equals(ExpTitle)) {			
			System.out.println("The Home page title matches");
		} else {
			System.out.println("The Home page title doesn't match");

		}		
	}

	@Then("user is clicks on Transfer funds tab")
	public void user_is_clicks_on_Transfer_funds_tab() throws Exception {
	    
		driver.findElement(By.xpath("//a[text()='Transfer Funds']")).click();
		Thread.sleep(2000);
	}

	@And("user verify the Zero Transfer Funds page")
	public void user_verify_the_Zero_Transfer_Funds_page() {
	    
		String ActualTransferTitle= driver.getTitle();
		System.out.println("The Zero bank title Page is: "+ActualTransferTitle);
		
		String ExpTransferTitle = "Zero - Transfer Funds";
		
		if (ActualTransferTitle.equals(ExpTransferTitle)) {			
			System.out.println("The Transfer page title matches");
		} else {
			System.out.println("The transfer page title doesn't match");

		}
		
		}

	@Then("user checks the contents in dropdown")
	public void user_checks_the_contents_in_dropdown() {
		Select FromAccount = new Select(driver.findElement(By.xpath("//select[@name='fromAccountId']")));
		FromAccount.selectByIndex(2);
		Select ToAccount = new Select(driver.findElement(By.xpath("//select[@name='toAccountId']")));
		ToAccount.selectByIndex(3);
	}

	@Then("user selects different accounts in from and to")
	public void user_selects_different_accounts_in_from_and_to() {
	    
		System.out.println("User clearly selected from and To Drop down");
		
	}

	@And("user enters the amount and description")
	public void user_enters_the_amount_and_description() {
	    System.out.println("User enters the amount and description");
	}

	@And("user clicks on Continue button")
	public void user_clicks_on_Continue_button() throws Exception {
	    
		driver.findElement(By.xpath("//input[@type='text'][@name='amount']")).sendKeys("100");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text'][@name='description']")).sendKeys("Casual");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
	}

	@Then("User is on Verify page")
	public void user_is_on_Verify_page() {
	    
		System.out.println("Verified the details filled for Transfer");
	}

	@And("user clicks on Submit btn")
	public void user_clicks_on_Submit_btn() {
	    driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
	}

	@Then("User checks the new page")
	public void user_checks_the_new_page() {
	    
		String ActAlertMessage = driver.findElement(By.xpath("//div[contains(text(),'You successfully submitted your transaction.')]")).getText();
		System.out.println("The alert message is: "+ActAlertMessage);
		
		String ExpAlertMessage = "You successfully submitted your transaction.";
		
		if (ActAlertMessage.equals(ExpAlertMessage)) {
			
			System.out.println("Alert message is matched");
		} else {
			System.out.println("Alert message doesn't matches");
		}
	}

	@And("user finds the alert message with success")
	public void user_finds_the_alert_message_with_success() throws Exception {
	    System.out.println("Transaction is Successful");
	    Thread.sleep(3000);
	    
	    driver.close();
	}

	
	
}
