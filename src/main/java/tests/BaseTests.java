package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.SubscribePage;

public class BaseTests {
    protected WebDriver driver;
    protected SubscribePage subscribePage;
    @BeforeClass
    public void Setup(){
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        // Create a new instance of the Chrome driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public void TearDown(){
        driver.quit();
    }
}
