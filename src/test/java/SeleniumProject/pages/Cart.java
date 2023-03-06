package SeleniumProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	WebDriver driver;
	
	// Constructor
	public Cart(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(how=How.XPATH, using="//button[text()='Remove']")
	private WebElement remove;
	
	@FindBy(how=How.ID, using="checkout")
	private WebElement checkOut;
	
	public void removeItem() {
		remove.click();
	}
	
	public void checkOut() {
		checkOut.click();
	}

}
