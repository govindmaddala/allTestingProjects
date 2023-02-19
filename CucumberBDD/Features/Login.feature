Feature: Login

Scenario: Successful Login with valid credentials
  	Given Chrome browser launched
    When URL is entered "https://admin-demo.nopcommerce.com/login"
    And Click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User clicked on logout
    Then Page title should be "Your store. Login"
    And Close browser


Scenario Outline: Successful Login with valid credentials
  	Given Chrome browser launched
    When URL is entered "<url>"
    And Click on Login
    Then Page title should be "<adminPageTitle>"
    When User clicked on logout
    Then Page title should be "<loginPageTitle>"
    And Close browser

Examples:
		|url|adminPageTitle|loginPageTitle|
		|https://admin-demo.nopcommerce.com/login|Dashboard / nopCommerce administration|Your store. Login|
		|https://admin-demo.nopcommerce.com/login|Dashboard / nopCommerce administration|Your store. Log  |
		
