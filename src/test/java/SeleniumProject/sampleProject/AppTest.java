package SeleniumProject.sampleProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumProject.pages.Cart;
import SeleniumProject.pages.CheckOut;
import SeleniumProject.pages.FinalPage;
import SeleniumProject.pages.LoginPage;
import SeleniumProject.pages.Overview;
import SeleniumProject.pages.Products;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
	WebDriver driver;
	LoginPage login;
	Products products;
	Cart cart;
	CheckOut checkOut;
	Overview overview;
	FinalPage finalPage;
	
	@BeforeTest
	public void Setup() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\H P\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		login = new LoginPage(driver);
		products = new Products(driver);
		cart = new Cart(driver);
		checkOut = new CheckOut(driver);
		overview = new Overview(driver);
		finalPage = new FinalPage(driver);
		driver.get("https://www.saucedemo.com/");
		// driver.get("https://www.w3schools.com/");
	}
	
	
	
	@Test
	public void AddToCart() {
		
		// To scroll the site
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0, 1000)");
		
		//System.out.println("Running");
		try {
			
		// To login to the site
		login.login();
		Thread.sleep(3000);
		
		// To add Item
		products.addItemsToCart();
		Thread.sleep(2000);
		// Go to cart
		products.goToCart();
		Thread.sleep(2000);
		// CheckOut
		cart.checkOut();
		Thread.sleep(2000);
		//Enter details
		checkOut.enterCheckOutDetails();
		Thread.sleep(2000);
		// Go to overview
		checkOut.goToOverviewPage();
		Thread.sleep(2000);
		// Go to finish page
		overview.goToFinish();
		Thread.sleep(2000);
		
		finalPage.checkOrderStatus();
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	

}
