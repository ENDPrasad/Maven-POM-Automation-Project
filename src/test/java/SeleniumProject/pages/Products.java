package SeleniumProject.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Products {
	
	WebDriver driver;
	
	// Constructor
	public Products(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(how=How.XPATH, using="//button[text()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(how=How.ID, using="shopping_cart_container")
	private WebElement cart;
	
	
	
	
	
	public void addItemsToCart() {
		addToCart.click();	
	}
	
	public void goToCart() {
		cart.click();
	}

}
