package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setup() {
        // *** IMPORTANT: UPDATE THIS PATH ***
//        System.setProperty("webdriver.chrome.driver", "/path/to/your/chromedriver"); 
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    
        
        driver.get("https://www.flipkart.com/");
        
        // Handle pop-up
      
    }

    @AfterTest
    public void tearDown() {
       
            driver.quit();
        
    }
}
