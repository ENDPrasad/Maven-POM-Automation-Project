package SeleniumProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FinalPage {
	
	
	WebDriver driver;
	
	// Constructor
	public FinalPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(how=How.XPATH, using="//button[text()='Back Home']")
	private WebElement backToHome;
	
	@FindBy(how=How.CLASS_NAME, using="complete-header")
	private WebElement completedStatus;
	
	public void checkOrderStatus() {
		Assert.assertEquals(completedStatus.getText(), "Thank you for your order!");
	}
	

}
