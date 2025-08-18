Feature: eBay Homepage Scenarios

  @Navigation
  Scenario: Verify Advanced Search Navigation
    Given I am on the eBay homepage
    When I click on the Advanced link
    Then I should be redirected to the Advanced Search page

  @TitleMetaValidation
  Scenario Outline: Validate homepage link navigation and titles
    Given I am on the eBay homepage
    When I click on the homepage link '<TextLink>'
    Then I navigated to '<URL>'
    And the page title should contain '<Title>'

    Examples:
      | Text links    | url                                                          | Title         |
      | Motors        | https://www.ebay.com/b/Auto-Parts-Accessories/6028/bn_569479 | eBay Motors   |
      | Toys          | https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497           | Toys          |
      | Home & Garden | https://www.ebay.com/b/Home-Garden/11700/bn_1853126          | Home & Garden |
