package com.Adactin.page.objects;

import com.Adactin.utilities.BaseClass;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage extends BaseClass {
    public WebDriver driver;

    public BookingConfirmPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "hotel_name")
    private WebElement hotelName;

    @FindBy(id="location")
    private WebElement location1;

    @FindBy(id="room_type")
    private WebElement roomType;

    @FindBy(id="arrival_date")
    private WebElement arrivalDate;

    @FindBy(id="departure_text")
    private WebElement departureDate;

    @FindBy(id="total_rooms")
    private WebElement totalRooms;

    @FindBy(id="adults_room")
    private WebElement adultsRoom;

    @FindBy(id="children_room")
    private WebElement childRoom;

    @FindBy(id="price_night")
    private WebElement PricePerNight;

    @FindBy(id="total_price")
    private WebElement totalPrice;

    @FindBy(id="gst")
    private WebElement gst;

    @FindBy(id="final_price")
    private WebElement finalPrice;

    @FindBy(id="first_name")
    private WebElement firstName;

    @FindBy(id="last_name")
    private WebElement lastname;

    @FindBy(id="address")
    private WebElement address;

    @FindBy(id="order_no")
    private WebElement orderNumber;

    @FindBy(id="search_hotel")
    private WebElement searchHotelButton;

    @FindBy(id="my_itinerary")
    private WebElement goToItinerary;

    @FindBy(id="logout")
    private WebElement logOut;

    @FindBy(className = "login_title")
    private WebElement loginTitle;



    public String getHotelName(){
        return getAttribute(hotelName, "value");
    }

    public String getLocation(){
        return getAttribute(location1,"value");
    }

    public String getRoomType(){
        return getAttribute(roomType,"value");
    }

    public String getArrivalDate(){
        return getAttribute(arrivalDate,"value");

    }
    public String getDepartureDate(){
        return getAttribute(departureDate,"value");
    }

    public String getTotalRooms(){
        return getAttribute(totalRooms,"value");
    }

    public String getAdultRoom(){
        return getAttribute(adultsRoom,"value");
    }

    public String getChildRoom(){
        return getAttribute(childRoom,"value");
    }

    public String getPricePerNight(){
        return getAttribute(PricePerNight,"value");
    }

    public String getTotalPrice(){
        return getAttribute(totalPrice,"value");
    }

    public String getGst(){
        return getAttribute(gst,"value");
    }

    public String getFinalPrice(){
        return getAttribute(finalPrice,"value");
    }

    public String getFirstName(){
        return getAttribute(firstName, "value");
    }

    public String getLastName(){
        return getAttribute(lastname,"value");
    }

    public String getAddress(){
        return getAttribute(address,"value");
    }

    public String getOrderNumber(){
        return getAttribute(orderNumber,"value");
    }

    public String getScreenTitle(){
        return getElementText(loginTitle);
    }

    public void clickMyItinerary() { clickOnElement(goToItinerary);

    }

    public void clickLogout(){ clickOnElement(logOut);}

}
