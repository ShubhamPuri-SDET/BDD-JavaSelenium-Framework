package actions;

import hooks.TaggedHooks;
import elements.HomePageElements;
import org.openqa.selenium.WebDriver;

public class AdvanceSearchItem {

    private final WebDriver driver;
    CommonActions commonActions;
    HomePageElements homePageElements;

    public AdvanceSearchItem(WebDriver driver) {
        this.driver = TaggedHooks.getDriver();
        this.homePageElements = new HomePageElements(driver);
    }

    public void clickOnAdvaceSearch() {
        homePageElements.advancesearch.click();
    }

    public void EnterItemName(String itemname) {
        homePageElements.searchproduct.sendKeys(itemname);
    }

    public void EnterExcludeCategory(String exclude) {
        homePageElements.excludeproduct.sendKeys(exclude);
    }

    public void EnterMinPrice(String minprice) {
        homePageElements.minprice.sendKeys(minprice);
    }

    public void EnterMaxPrice(String maxprice) {
        homePageElements.maxprice.sendKeys(maxprice);
    }

}
