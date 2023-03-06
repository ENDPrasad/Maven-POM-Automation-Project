package SeleniumProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
WebDriver driver;
	
	// Constructor
	public CheckOut(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(how=How.ID, using="first-name")
	private WebElement firstName;
	
	@FindBy(how=How.ID, using="last-name")
	private WebElement lastName;
	
	@FindBy(how=How.ID, using="postal-code")
	private WebElement zipcode;
	
	@FindBy(how=How.ID, using="continue")
	private WebElement overViewPage;
	
	
	
	
	public void enterCheckOutDetails() {
		firstName.sendKeys("Newman");
		lastName.sendKeys("Old");
		zipcode.sendKeys("123445");
	}
	
	public void goToOverviewPage() {
		overViewPage.click();
	}

}
