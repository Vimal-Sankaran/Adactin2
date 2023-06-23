

  Feature: Login Functionality

    Scenario: Navigate to Adactin page
      Given I have navigated to Adactin Login Page
      When I Enter credentials as user "InvalidDetails" and click on login button
      And I Enter credentials as user "ValidDetails" and click on login button
      And I have entered the details in Search Hotel page "ValidDetails"
      And I have selected the hotel details by clicking on the radio button



