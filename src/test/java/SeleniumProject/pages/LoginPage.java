package SeleniumProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
//	LoginPage login;
	
	// Constructor
	public LoginPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}
	
	By userName2 = By.xpath("//input[@id='user-name']");
	
	@FindBy(how=How.XPATH, using="//input[@id='user-name']")
	private WebElement userName;
	
	@FindBy(how=How.XPATH, using="//input[@id='password']")
	private WebElement password;
	
	public void login() {
		
		try {
			
			// Using By
			// driver.findElement(userName2).sendKeys("standard_user");;
			
			// Using FindBy
			userName.sendKeys("standard_user");
			Thread.sleep(2000);
			password.sendKeys("secret_sauce"+Keys.ENTER);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
