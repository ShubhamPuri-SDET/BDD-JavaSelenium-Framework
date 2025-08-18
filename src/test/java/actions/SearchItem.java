package actions;


import hooks.TaggedHooks;
import com.ebay.framework.utility.drivers.driversetup;
import elements.HomePageElements;
import org.openqa.selenium.WebDriver;

public class SearchItem {

    HomePageElements homePageElements;
    private WebDriver driver;

    public SearchItem(driversetup driversetup){
        this.driver = TaggedHooks.getDriver();
        homePageElements = new HomePageElements(driver);

    }

    public void searddchitem(){

    }
}