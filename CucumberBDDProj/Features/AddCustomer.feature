Feature: Add Customer

	@sanity @Regression
  Scenario: Add Customer successfully
    Given Browser launched
    When URL entered "https://admin-demo.nopcommerce.com/login"
    And Enter credentials "admin@yourstore.com" and "admin"
    And Click on Login button
    Then Dashboard page title should be "Dashboard / nopCommerce administration"
    When User clicks on Customers dropdown
    And User clicks on Customers option
    And User clicks on Add new button
    Then User can view Add new Customer page
    When user enter customer info
    And User clicks save button
    Then user can view confirmation message "The new customer has been added successfully."
    And Closes browser