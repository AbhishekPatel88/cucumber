package cucumberpractice1;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class demo1 {
	WebDriver driver=null;
	
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\abhishek.m.s\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		    driver.findElement(By.linkText("SignIn")).click();
	   // throw new cucumber.api.PendingException();
	}

	@When("when user enters lalitha as username")
	public void when_user_enters_lalitha_as_username() {
		  
		driver.findElement(By.id("userName")).sendKeys("lalitha");
	  //  throw new cucumber.api.PendingException();
	}

	@When("user enters password{int} as password")
	public void user_enters_password_as_password(Integer int1) {
	    driver.findElement(By.id("password")).sendKeys("password123");
	   // throw new cucumber.api.PendingException();
	}

	@Then("user will finds a TestMeApp homepage")
	public void user_will_finds_a_TestMeApp_homepage() {
	    driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	    System.out.println("The page title is"+driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Home"));
	    
	    
	   // throw new cucumber.api.PendingException();
	    
	   
	}

}
