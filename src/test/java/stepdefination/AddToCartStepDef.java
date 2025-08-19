package stepdefination;

import actions.AddToCart;
import actions.CommonActions;
import elements.AddToCartElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDef {

    private final CommonActions commonActions;
    private final AddToCart addToCart;

    public AddToCartStepDef(CommonActions commonActions) {
        this.commonActions = commonActions;
        this.addToCart = new AddToCart(commonActions.getDriver());
    }

    @When("I search for {string}")
    public void i_search_for(String itemname) {
        addToCart.searchbar(itemname);
        addToCart.searchCTAclick();
    }

    @And("I select the first product from the results")
    public void i_select_the_first_product_from_the_results() {
        addToCart.selectProduct();
    }

    @And("I add the product to the cart")
    public void i_add_the_product_to_the_cart() {
        addToCart.addToCart();
    }

    @Then("the product should be added to the cart successfully")
    public void the_product_should_be_added_to_the_cart_successfully() {
        addToCart.validateCart();
    }
}
