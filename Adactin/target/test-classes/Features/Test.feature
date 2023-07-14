

  Feature: Login Functionality

    Scenario: Navigate to Adactin page
      Given I have navigated to Adactin Login Page
      When I Enter username " ",password " " and click on Login button
      And I validate the error message "Invalid Login details or Your Password might have expired. Click here to reset your password"
      And I Enter credentials as user "ValidDetails" and click on login button
      And I have entered the details in Search Hotel page "ValidDetails"
      And I have selected the hotel details by clicking on the radio button "ValidDetails"
      And I am entering the details in BookHotelPage "ValidDetails"



