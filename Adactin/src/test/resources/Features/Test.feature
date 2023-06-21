

  Feature: Login Functionality

    Scenario: Navigate to Adactin page
      Given I have navigated to Adactin Login Page
      When I Enter credentials as user "InvalidDetails" and click on login button
      And I Enter credentials as user "ValidDetails" and click on login button



