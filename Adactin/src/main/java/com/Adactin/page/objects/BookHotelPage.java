package com.Adactin.page.objects;

import com.Adactin.utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
    public WebDriver driver;

    //Constructor for this class
    public BookHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Declaring Elements

    @FindBy(id= "hotel_name_dis")
    private WebElement hotelName;

    @FindBy(id="location_dis")
    private WebElement location1;

    @FindBy(id="room_type_dis")
    private WebElement roomType;

    @FindBy(id="room_num_dis")
    private WebElement roomCount;

    @FindBy(id="total_days_dis")
    private WebElement totalDays;

    @FindBy(id="price_night_dis")
    private WebElement priceADay;

    @FindBy(id="total_price_dis")
    private WebElement totalPrice;

    @FindBy(id="gst_dis")
    private WebElement gstPrice;

    @FindBy(id="final_price_dis")
    private WebElement finalPrice;

    @FindBy(id = "first_name")
    private WebElement firstName;

    @FindBy(id = "last_name")
    private WebElement lastName;

    @FindBy(id= "address")
    private WebElement custAddress;

    @FindBy(id="cc_num")
    private WebElement creditCard;

    @FindBy(id="cc_type")
    private WebElement creditCardType;

    @FindBy(id="cc_exp_month")
    private WebElement ccExpMonth;

    @FindBy(id="cc_exp_year")
    private WebElement ccExpYear;

    @FindBy(id="cc_cvv")
    private WebElement ccVerification;

    @FindBy(id="book_now")
    private WebElement bookNow;

    @FindBy(id="cancel")
    private WebElement cancelButton;

    /*
    Getting Element values for different Attributes
    */

    public String getHotelNameValue()
    {
        return getTextBoxValue(hotelName);
    }

    public String getLocationValue()
    {
        return getTextBoxValue(location1);
    }

    public String getRoomTypeValue()
    {
        return getTextBoxValue(roomType);
    }

    public String getRoomCount()
    {
        return getTextBoxValue(roomCount);
    }

    public String getTotalDays()
    {
        return getTextBoxValue(totalDays);
    }

    public String getPriceADay()
    {
        return getTextBoxValue(priceADay);
    }

    public String getTotalPrice() {
        return getTextBoxValue(totalPrice);
    }

    public String getGstPrice() {
        return getTextBoxValue(gstPrice);
    }

    public String getFinalPrice() {
        return getTextBoxValue(finalPrice);
    }

    public void setFirstNameText(String firstNameValue)
    {
        sendValueToTextBox(firstName,firstNameValue);
    }
    public void setLastNameText(String lastNameValue)
    {
        sendValueToTextBox(lastName,lastNameValue);
    }

    public void setCustAddress(String custAddressValue) {
        sendValueToTextBox(custAddress,custAddressValue);
    }

    public void setCreditCard(String creditCardValue)
    {
        sendValueToTextBox(creditCard,creditCardValue);
    }

    public void setCreditCardType(String creditCardTypeValue)
    {
        selectDropDownByText(creditCardType,creditCardTypeValue);
    }

    public void setCcExpMonth(String ccExpMonthValue)
    {
        selectDropDownByText(ccExpMonth,ccExpMonthValue);
    }

    public void setCcExpYear(String ccExpYearValue)
    {
        selectDropDownByText(ccExpYear,ccExpYearValue);
    }

    public void setCcVerification(String ccVerificationValue)
    {
        sendValueToTextBox(ccVerification,ccVerificationValue);
    }

    public void clickBookNow()
    {
        clickOnElement(bookNow);
    }

    public void clickCancel() { clickOnElement(cancelButton);}

}

