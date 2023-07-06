package com.Adactin.page.objects;

import com.Adactin.utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
    public WebDriver driver;

    public SelectHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="radiobutton_0")
    private WebElement radioButton;

    @FindBy(id="hotel_name_0")
    private WebElement hotelName;

    @FindBy(id="location_0")
    private WebElement location;

    @FindBy(id="rooms_0")
    private WebElement rooms;

    @FindBy(id="arr_date_0")
    private WebElement arrivalDate;

    @FindBy(id="dep_date_0")
    private WebElement depDate;

    @FindBy(id="no_days_0")
    private WebElement noDays;

    @FindBy(id="room_type_0")
    private WebElement roomType;
    @FindBy(id="continue")
    private WebElement continueSearch;

    @FindBy(id="cancel")
    private WebElement cancelDetails;

    public void selectHotelDetails()
    {clickOnElement(radioButton);
    clickOnElement(continueSearch);}
}