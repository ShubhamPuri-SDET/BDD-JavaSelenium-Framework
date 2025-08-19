package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {
    @FindBy(linkText = "Advanced")
    public WebElement advancesearch;
    @FindBy(xpath = "//input[@id='_nkw']")
    public WebElement searchproduct;
    @FindBy(xpath = "//input[@id='_ex_kw']")
    public WebElement excludeproduct;
    @FindBy(xpath = "//fieldset[@class='adv-fieldset__price']//span[2]//span[1]//input[1]")
    public WebElement minprice;
    @FindBy(xpath = "(//input[@id='s0-1-19-5[2]-@range-comp[]-@range-textbox[]_1-textbox'])[1]")
    public WebElement maxprice;
    @FindBy(xpath = "//span[@class='gh-search-button__label']")
    public WebElement searchbutton;
    @FindBy(xpath = "//a[@class='gh-logo']//*[name()='svg']")
    public WebElement ebayLogo;
    @FindBy(xpath = "//input[@id='gh-ac']")
    public WebElement searchbox;
    @FindBy(xpath = "//button[contains(@class,'gh-search-button btn btn--primary')]")
    public WebElement search;
    private final WebDriver driver;


    public HomePageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

}
