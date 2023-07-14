package com.Adactin.step.definitions;

import com.Adactin.helpers.EntityHelper;
import com.Adactin.page.objects.BookHotelPage;
import com.Adactin.utilities.BaseClass;
import com.Adactin.utilities.FileReaderManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Set;

public class BookHotelSteps extends BaseClass {

    //Declaring object for BookHotelPage class objects
    private final BookHotelPage bookhotelpage = new BookHotelPage(driver);

    public static FileReaderManager frm = new FileReaderManager();

    public static EntityHelper entityHelper = new EntityHelper();

    /**
     * I am entering all details to Book Hotel using the Jason file
     */
    @Given("I am entering the details in BookHotelPage {string}")
    public void EnteringTheDetailsInBookHotelPage(String id) {

        Assert.assertTrue(bookhotelpage.getHotelNameValue(),entityHelper.getCustomerDataById(id).getHotelName(),"HotelName from Select Hotel is Validated");
        Assert.assertTrue(bookhotelpage.getLocationValue(),entityHelper.getCustomerDataById(id).getLocation(),"Location from Select Hotel is Validated");
        Assert.assertTrue(bookhotelpage.getRoomTypeValue(),entityHelper.getCustomerDataById(id).getRoomtype(),"RoomType from Select Hotel is Validated");
        bookhotelpage.setFirstNameText(entityHelper.getCustomerDataById(id).getFirstname());
        bookhotelpage.setLastNameText(entityHelper.getCustomerDataById(id).getLastname());
        bookhotelpage.setCustAddress(entityHelper.getCustomerDataById(id).getAddress());
        bookhotelpage.setCreditCard(entityHelper.getCustomerDataById(id).getCardnum());
        bookhotelpage.setCreditCardType(entityHelper.getCustomerDataById(id).getCardtype());
        bookhotelpage.setCcExpMonth(entityHelper.getCustomerDataById(id).getExpmonth());
        bookhotelpage.setCcExpYear(entityHelper.getCustomerDataById(id).getExpyear());
        bookhotelpage.setCcVerification(entityHelper.getCustomerDataById(id).getVerification());
        bookhotelpage.clickBookNow();
         }

    /**
     * Entering Details of Firstname(Booking person) to BookHotel using the json file
     * @param id
     */
    @Given("I am entering firstName as a text as user {string}")
    public void firstNameText(String id) {
        bookhotelpage.setFirstNameText(entityHelper.getCustomerDataById(id).getFirstname());
    }

    /**
     * Entering Details of Lastname(Booking person) to BookHotel using the json file
     * @param id
     */
    @Given("I am entering lastName as a text as user {string}")
    public void lastNameText(String id) {
        bookhotelpage.setLastNameText(entityHelper.getCustomerDataById(id).getLastname());
    }

    /**
     * Entering Details of CustAddress(Booking person) to BookHotel using the json file
     * @param id
     */
    @Given("I am entering custAddress as a text  {string}")
    public void custAddressText(String id) {
        bookhotelpage.setCustAddress(entityHelper.getCustomerDataById(id).getAddress());
    }

    /**
     * Entering Details of creditCardNumber(Booking person) to BookHotel using the json file
     * @param id
     */
    @Given("I am entering creditCard as a text  {string}")
    public void creditCard(String id) {
        bookhotelpage.setCreditCard(entityHelper.getCustomerDataById(id).getCardnum());
    }

    /**
     * Selecting Details of creditCardExpiryMonth(Booking person) to BookHotel using the json file
     * @param id
     */
    @Given("I am selecting ccExpiryMonth value {string}")
    public void ccExpiryMonth(String id) {
        bookhotelpage.setCcExpMonth(entityHelper.getCustomerDataById(id).getExpmonth());
    }


    /**
     * Selecting Details of creditCardYear(Booking person) to BookHotel using the json file
     * @param id
     */
    @Given("I am selecting ccExpiryYear value {string}")
    public void ccExpiryYear(String id) {
        bookhotelpage.setCcExpYear(entityHelper.getCustomerDataById(id).getExpmonth());
    }

    /**
     * Selecting Details of creditCardVerification(Booking person) to BookHotel using the json file
     * @param id
     */
    @Given("I am selecting ccVerification value {string}")
    public void ccVerification(String id) {
        bookhotelpage.setCcVerification(entityHelper.getCustomerDataById(id).getVerification());
    }
}

