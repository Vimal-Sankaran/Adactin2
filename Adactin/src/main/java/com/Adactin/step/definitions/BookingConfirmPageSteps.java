package com.Adactin.step.definitions;

import com.Adactin.helpers.EntityHelper;
import com.Adactin.page.objects.BookingConfirmPage;
import com.Adactin.page.objects.LoginPage;
import com.Adactin.utilities.BaseClass;
import com.Adactin.utilities.FileReaderManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class BookingConfirmPageSteps extends BaseClass{
    BookingConfirmPage bookingConfirmation= new BookingConfirmPage(driver);

    private final LoginPage loginPage = new LoginPage(driver);

    public static FileReaderManager frm = new FileReaderManager();

    public static EntityHelper entityHelper = new EntityHelper();

    /*
    @Given("I validate the fields in booking confirmation screen")
    public void submitConfirmValidation(){
        assertTrue(bookingConfirmation.);
    }*/
    @Given("I navigate to confirmation screen and validate the screen name {string}")
    public void submitConfirmation(String screenName){
        assertTrue(bookingConfirmation.getScreenTitle(),screenName,"Booking Confirmation Validated");
    }

    @Then("I validate the details in confirmation screen")
    public void validateBookingConfirmation(){
        assertTrue(bookingConfirmation.getScreenTitle(),"Booking Confirmation","Booking Confirmation Validated");
    }



}
