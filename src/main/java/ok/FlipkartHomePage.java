package ok;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FlipkartHomePage {

    private WebDriver driver;

    // Locators
   By searchInput = By.xpath("//input[@placeholder='Search for Products, Brands and More']");
   By firstFilterLowToHigh = By.xpath("//div[text()='Price -- Low to High']");
    // ... (Add all other locators here)

    public FlipkartHomePage(WebDriver driver) {
        this.driver = driver;
    }

        public void searchProduct() {
        driver.findElement(searchInput).sendKeys("doll" + Keys.ENTER);
    }
    
    public void clickLowToHighFilter() throws InterruptedException {
        Thread.sleep(3000); 
        driver.findElement(firstFilterLowToHigh).click();
    }
   

    
    public boolean isSearchResultsDisplayed() {
        return driver.getTitle().contains("doll");
    }

}