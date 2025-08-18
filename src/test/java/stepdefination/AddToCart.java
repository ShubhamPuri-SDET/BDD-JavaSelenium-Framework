package stepdefination;

import actions.CommonActions;
import elements.AddToCartElements;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class AddToCart {

    CommonActions commonActions = new CommonActions();
    AddToCartElements addToCartElements = new AddToCartElements(commonActions.getDriver());

    @Given("I am on the eBay homepage")
    public void i_am_on_the_e_bay_homepage() {
        commonActions.NavigateToEbay("https://www.ebay.com");

    }

    @When("I search for {string}")
    public void i_search_for(String string) {

    }

    @And("I select the first product from the results")
    public void i_select_the_first_product_from_the_results() {

    }

    @And("I add the product to the cart")
    public void i_add_the_product_to_the_cart() {

    }

    @Then("the product should be added to the cart successfully")
    public void the_product_should_be_added_to_the_cart_successfully() {

    }
}
