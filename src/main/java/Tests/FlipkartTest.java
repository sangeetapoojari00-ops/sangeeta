package Tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import ok.FlipkartHomePage;

// Extends BaseTest to inherit the driver setup and teardown methods
public class FlipkartTest extends BaseTest {
    
    @Test
    public void performFlipkartFlow() throws InterruptedException {
        
        // Initialize the Page Object
        FlipkartHomePage homePage = new FlipkartHomePage(driver);
        homepage.searchproduct;
//        String product = "doll";
//        String phoneNumber = "7483246160";
//
//        // Execution Flow (Your original code translated to POM actions)
//        homePage.searchProduct(product);
//        Assert.assertTrue(homePage.isSearchResultsDisplayed(), "Search failed.");
//
//        homePage.clickLowToHighFilter();
        // homePage.clickNewestFirstFilter(); // Assuming you add this method
//
//        homePage.navigateToLogin();
//        homePage.loginByPhone(phoneNumber); 

        // homePage.clickNavigationLink6(); // Assuming you add this method
        // homePage.clickNavigationLink5(); // Assuming you add this method
    }
}