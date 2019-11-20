package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhishek.m.s\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		PageClass PObject=new PageClass(driver);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		PObject.clicklink();
		String username=null;
		PObject.typename(username);
		String password=null;
		PObject.typepassword(password);
		PObject.clickonloginlyn();
		System.out.println("title of page is"+driver.getTitle());

	}

}
