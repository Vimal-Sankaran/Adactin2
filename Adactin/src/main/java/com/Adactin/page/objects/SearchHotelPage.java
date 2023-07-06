package com.Adactin.page.objects;

import com.Adactin.utilities.BaseClass;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class SearchHotelPage extends BaseClass {

    public WebDriver driver;

    public SearchHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="location")
    private WebElement location1;

    @FindBy(id="hotels")
    private WebElement hotels;

    @FindBy(id="room_type")
    private WebElement roomType;

    @FindBy(id="room_nos")
    private WebElement roomNum;

    @FindBy(id="datepick_in")
    private WebElement datePickIn;

    @FindBy(id="datepick_out")
    private WebElement datePickOut;

    @FindBy(id="adult_room")
    private WebElement adultRoom;

    @FindBy(id="child_room")
    private WebElement childRoom;

    @FindBy(id="Submit")
    private WebElement submit;

    @FindBy(id="Reset")
    private WebElement reset;

    public void setLocation(String city)
    {selectDropDownByValue(location1,city);}

    public void setHotels(String hotelType)
    {selectDropDownByText(hotels,hotelType);}

    public void setRoomType(String room)
    {selectDropDownByText(roomType,room);}

    public void setRoomNum(String roomNo)
    {selectDropDownByText(roomNum,roomNo);}

    public void setAdultRoom(String adultRoom1)
    {selectDropDownByText(adultRoom,adultRoom1);}

    public void setChildRoom(String childRoom1)
    {selectDropDownByText(childRoom,childRoom1);}

    public void setDatePickIn(String dateIn)
    {sendValueToTextBox(datePickIn,dateIn);}

    public void setDatePickOut(String dateOut)
    {sendValueToTextBox(datePickOut,dateOut);}

    public void submitHotelDetails()
    {clickOnElement(submit);}

    public void resetDetails()
    {clickOnElement(reset);}
}