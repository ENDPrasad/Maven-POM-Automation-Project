package SeleniumProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Overview {
WebDriver driver;
	
	// Constructor
	public Overview(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(how=How.ID, using="finish")
	private WebElement finish;
	

	public void goToFinish() {
		finish.click();
	}

}
