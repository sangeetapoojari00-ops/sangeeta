package ok;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FlipkartHomePage {

    private WebDriver driver;

    // Locators
    private By searchInput = By.xpath("//input[@placeholder='Search for Products, Brands and More']");
    private By firstFilterLowToHigh = By.xpath("//div[text()='Price -- Low to High']");
    // ... (Add all other locators here)

    public FlipkartHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void searchProduct(String productName) {
        driver.findElement(searchInput).sendKeys(productName + Keys.ENTER);
    }
    
    public void clickLowToHighFilter() throws InterruptedException {
        Thread.sleep(3000); 
        driver.findElement(firstFilterLowToHigh).click();
    }
   
    // ... (Add all other action methods here)
    
    public boolean isSearchResultsDisplayed() {
        return driver.getTitle().contains("doll");
    }

//	public void navigateToLogin() {
//		driver.findElement(By.xpath(""))
		// TODO Auto-generated method stub
		
	


}