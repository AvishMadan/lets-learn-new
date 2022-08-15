package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	
	public WebDriver driver;
	
	By email=By.cssSelector("[id='user_email']");
	By sendMeInstructions=By.cssSelector("[type='submit']");
	
	
	
	
	
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	public WebElement getEmail()
	{
		return driver.findElement(email);
		System.out.println("My Name is Avish");
		System.out.println("My Name is Avish");
		System.out.println("My Name is Avish");
		System.out.println("My Name is Avish");
		System.out.println("My Name is Navish");
		System.out.println("My Name is dev");
		System.out.println("My Name is dev1");
		System.out.println("My Name is dev2");
		System.out.println("Taking latest code from master");
		System.out.println("Taking latest code from master");
	
	
	}
	
	
	public WebElement sendMeInstructions()
	{
		return driver.findElement(sendMeInstructions);
	}
	
	

	
	
}
