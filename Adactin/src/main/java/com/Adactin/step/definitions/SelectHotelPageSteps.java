package com.Adactin.step.definitions;

import com.Adactin.helpers.EntityHelper;
import com.Adactin.page.objects.SelectHotelPage;
import com.Adactin.utilities.BaseClass;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class SelectHotelPageSteps extends BaseClass {
    private final SelectHotelPage selectHotelPage =new SelectHotelPage(driver);
    EntityHelper entityHelper=new EntityHelper();

  @Given("I have selected the hotel details by clicking on the radio button {string}")
  public void selectHotelDetails(String id)
  {
      String temp;
      selectHotelPage.assertTrue(selectHotelPage.getHotelName(),entityHelper.getCustomerDataById(id).getHotelName(),"HotelName from Select Hotel is Validated");
      selectHotelPage.assertTrue(selectHotelPage.getLocation(),entityHelper.getCustomerDataById(id).getLocation(),"Location from Select Hotel is Validated");
      temp=entityHelper.getCustomerDataById(id).getNoOfRoom().substring(0,1);
      selectHotelPage.assertTrue(selectHotelPage.getRooms(),temp+ " Rooms","Number of Rooms from Select Hotel is Validated");
      selectHotelPage.assertTrue(selectHotelPage.getRoomtype(),entityHelper.getCustomerDataById(id).getRoomtype(),"RoomType from Select Hotel is Validated");
      selectHotelPage.assertTrue(selectHotelPage.getArrivalDate(),entityHelper.getCustomerDataById(id).getDateIn(),"ArrivalDate from Select Hotel is Validated");
      selectHotelPage.assertTrue(selectHotelPage.getDepartureDate(),entityHelper.getCustomerDataById(id).getDateOut(),"Departure Date from Select Hotel is Validated");
      selectHotelPage.selectHotelDetails();
  }
}
