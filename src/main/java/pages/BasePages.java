package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePages {
    protected WebDriver driver;
    public WebDriverWait wait;
    public Wrapper wrapper;

    public BasePages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.wrapper = new Wrapper(driver);
    }
}
