Feature: Add product to cart

  @AddToCart
  Scenario: Search for a product and add it to the cart
    Given I am on the eBay homepage
    When I search for "laptop"
    And I select the first product from the results
    And I add the product to the cart
    Then the product should be added to the cart successfully
