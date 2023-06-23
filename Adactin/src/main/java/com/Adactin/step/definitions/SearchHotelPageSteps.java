package com.Adactin.step.definitions;

import com.Adactin.helpers.EntityHelper;
import com.Adactin.page.objects.SearchHotelPage;
import com.Adactin.utilities.BaseClass;
import com.fasterxml.jackson.core.*;
import io.cucumber.java.en.Given;

public class SearchHotelPageSteps extends BaseClass {
    private final SearchHotelPage searchHotel = new SearchHotelPage(driver);
    EntityHelper entityHelper=new EntityHelper();

    public SearchHotelPageSteps() throws JsonProcessingException {
    }

    /**
     * Entering the details in the search hotel page using the details in Json file
     * @param id
     */
    @Given("I have entered the details in Search Hotel page {string}")
    public void searchForHotel(String id){
        searchHotel.setLocation(entityHelper.getCustomerDataById(id).getLocation());
        searchHotel.setHotels(entityHelper.getCustomerDataById(id).getHotelName());
        searchHotel.setRoomType(entityHelper.getCustomerDataById(id).getRoomtype());
        searchHotel.setRoomNum(entityHelper.getCustomerDataById(id).getNoOfRoom());
        searchHotel.setDatePickIn(entityHelper.getCustomerDataById(id).getDateIn());
        searchHotel.setDatePickOut(entityHelper.getCustomerDataById(id).getDateOut());
        searchHotel.setAdultRoom(entityHelper.getCustomerDataById(id).getAdults());
        searchHotel.setChildRoom(entityHelper.getCustomerDataById(id).getChild());
        //searchHotel.resetDetails();
        searchHotel.submitHotelDetails();
    }
    @Given("I select location from dropdown as user {string}")
    public void selectLocationJson(String id) {
        searchHotel.setLocation(entityHelper.getCustomerDataById(id).getLocation());
    }
    @Given("I select location {string} from location dropdown in Search hotel page")
    public void selectLocation(String location) {
        searchHotel.setLocation(location);
    }

    @Given("I select hotel details from the dropdown as user {string}")
    public void selectHotelsJson(String id){
        searchHotel.setHotels(entityHelper.getCustomerDataById(id).getHotelName());
           }
    @Given("I select hotels {string} from the hotels dropdown in Search hotel page")
    public void selectHotels(String hotels){
        searchHotel.setHotels(hotels);
    }

    @Given("I select room type from the dropdown as user {string}")
    public void selectRoomTypeJson(String id)
    {
        searchHotel.setRoomType(entityHelper.getCustomerDataById(id).getRoomtype());
    }
    @Given("I select room type {string} from the room type drop down")
    public void selectRoomType(String roomType)
    {
        searchHotel.setRoomType(roomType);
    }
    @Given("I select number of rooms from the dropdown for the user {}")
    public void selectNoOfRoomsJson(String id)
    {
        searchHotel.setRoomNum(entityHelper.getCustomerDataById(id).getNoOfRoom());
    }
    @Given("I select number of rooms {string} from the drop down")
    public void selectNoOfRoom(String noOfRoom)
    {
        searchHotel.setRoomNum(noOfRoom);
    }
    @Given("I select number of adults in the room for the user {string}")
    public void selectAdultsJson(String id)
    {
        searchHotel.setAdultRoom(entityHelper.getCustomerDataById(id).getAdults());
    }
    @Given("I select number of adults {string} from the drop down")
    public void selectAdult(String adult)
    {
        searchHotel.setAdultRoom(adult);
    }
    @Given("I select the number of children in the room for user {string}")
    public void selectChildJson(String id)
    {
        searchHotel.setChildRoom(entityHelper.getCustomerDataById(id).getChild());
    }
    @Given("I select number of children {string} from the drop down")
    public void selectChild(String child)
    {
        searchHotel.setChildRoom(child);
    }
    @Given("I select the pick in date for user {string}")
    public void selectDateInJson(String id)
    {
        searchHotel.setDatePickIn(entityHelper.getCustomerDataById(id).getDateIn());
    }
    @Given("I select pick in date {string} from the calender")
    public void selectDateIn(String dateIn)
    {
        searchHotel.setDatePickIn(dateIn);
    }
    @Given("I select the pick out date for user {string}")
    public void selectDateOutJson(String id)
    {
        searchHotel.setDatePickOut(entityHelper.getCustomerDataById(id).getDateOut());
    }
    @Given("I select pick out date {string} from the calender")
    public void selectDateOut(String dateOut)
    {
        searchHotel.setDatePickOut(dateOut);
    }
}
