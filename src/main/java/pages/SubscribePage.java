package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.ArrayList;
import java.util.List;

public class SubscribePage extends BasePages {
    //region constructor
    public SubscribePage(WebDriver driver) {super(driver); }
    //endregion

    //region Variables
    final String baseURL = "https://subscribe.stctv.com/";
    final String saudiArabiaURL = "sa-ar";
    final String BahrainURL = "bh-ar";
    final String kuwaitiURL = "kw-ar";
    private final By plansNamesListIdentifier = By.xpath("//strong[@class='plan-title']");
    private final By litePackage = By.id("name-لايت");
    private final By basicPackage = By.id("name-الأساسية");
    private final By premiumPackage = By.id("name-بريميوم");
    private final By liteCurrency = By.id("currency-لايت");
    private final By basicCurrency = By.id("currency-الأساسية");
    private final By premiumCurrency = By.id("currency-بريميوم");
    public List<String> PlansNamesList = new ArrayList<>();
    public List<String> PlansCurrenciesList = new ArrayList<>();

    //endregion

    private void waitForPageToBeLoaded(){
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(plansNamesListIdentifier)));
    }

    public void OpenSaudiArabiaSubscriptionPage(){
        driver.get(baseURL + saudiArabiaURL);
        waitForPageToBeLoaded();
    }
    public void OpenBahrainSubscriptionPage(){
        driver.get(baseURL + BahrainURL);
        waitForPageToBeLoaded();
    }
    public void OpenkuwaitSubscriptionPage(){
        driver.get(baseURL + kuwaitiURL);
        waitForPageToBeLoaded();
    }
    public List<String> getPackagesPricesList(){
        PlansCurrenciesList.add(driver.findElement(liteCurrency).getText());
        PlansCurrenciesList.add(driver.findElement(basicCurrency).getText());
        PlansCurrenciesList.add(driver.findElement(premiumCurrency).getText());
        return PlansCurrenciesList;
    }
    public List<String> getPackagesNamesList(){
        PlansNamesList.add(driver.findElement(litePackage).getText());
        PlansNamesList.add(driver.findElement(basicPackage).getText());
        PlansNamesList.add(driver.findElement(premiumPackage).getText());
        return PlansNamesList;
    }


}
