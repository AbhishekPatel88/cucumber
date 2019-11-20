package practice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class practice3 {
	WebDriver driver=null;
	
	@Given("User opens the application")
	public void user_opens_the_application() {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\abhishek.m.s\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   // throw new cucumber.api.PendingException();
	}

	@When("User clicks on login link")
	public void user_clicks_on_login_link() {
		 driver.findElement(By.linkText("SignIn")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //throw new cucumber.api.PendingException();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		 
	    
	    //throw new cucumber.api.PendingException();
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		 driver.findElement(By.name("Login")).click();
	    //throw new cucumber.api.PendingException();
	}

}
