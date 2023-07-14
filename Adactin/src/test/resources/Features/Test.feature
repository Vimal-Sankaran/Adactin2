

  Feature: Login Functionality

    Scenario: Navigate to Adactin page
      Given I have navigated to Adactin Login Page
      When I Enter username " ",password " " and click on Login button
      And I validate the error message "Invalid Login details or Your Password might have expired. Click here to reset your password"
      And I Enter credentials as user "ValidDetails" and click on login button



