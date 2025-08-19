package stepdefination;

import actions.AdvanceSearchItem;
import actions.CommonActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class EbayAdvanceSearch {

//
//    CommonActions commonActions = new CommonActions();
//    AdvanceSearchItem advanceSearchItem = new AdvanceSearchItem(commonActions.getDriver());
    private final CommonActions commonActions;
    private final AdvanceSearchItem advanceSearchItem;

    public EbayAdvanceSearch(CommonActions commonActions) {
        this.commonActions = commonActions;
        this.advanceSearchItem = new AdvanceSearchItem(commonActions.getDriver());
    }

//    @Given("I am on the eBay homepage")
//    public void i_am_on_the_e_bay_homepage() {
//        commonActions.NavigateToEbay();
//
//    }
    @When("I click on the Advanced link")
    public void iClickOnTheAdvancedLink() {
        advanceSearchItem.clickOnAdvaceSearch();
    }

    @Then("I should be redirected to the Advanced Search page")
    public void i_should_be_redirected_to_the_advanced_search_page() {
        String currentUrl = commonActions.getCurrentUrl();
        Assert.assertTrue("Redirection to advanced search page failed", currentUrl.contains("advsearch"));
        commonActions.closeBrowser();
    }

}
