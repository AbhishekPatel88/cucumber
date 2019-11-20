package practice4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tagpractice {
	WebDriver driver=null;
	@When("user enters lalitha as username")
	public void user_enters_lalitha_as_username() {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\abhishek.m.s\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.findElement(By.linkText("SignIn"));
		 driver.findElement(By.className("form-control input-lg error")).sendKeys("safgklnbjsnbh");
		    driver.findElement(By.id("password")).sendKeys("password123"); 
		  //throw new cucumber.api.PendingException();
	}

	@Then("user will   Finds a testmeapp homepage")
	public void user_will_Finds_a_testmeapp_homepage() {
		 driver.findElement(By.name("Login")).click();
	    //throw new cucumber.api.PendingException();
	}

}
