package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class testclasfactory {
  private Object initElements;

@Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\abhishek.m.s\\Downloads\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  PageClassfactory locateelements=PageFactory.initElements(driver,PageClassfactory.class);
	  locateelements.loginMethod("aravind.guggilla57@gmail.com","aravind");
	 
  }
}
