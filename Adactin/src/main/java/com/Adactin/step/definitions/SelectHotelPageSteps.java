package com.Adactin.step.definitions;

import com.Adactin.helpers.EntityHelper;
import com.Adactin.page.objects.SelectHotelPage;
import com.Adactin.utilities.BaseClass;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;

public class SelectHotelPageSteps extends BaseClass {
    private final SelectHotelPage selectHotelPage =new SelectHotelPage(driver);
    EntityHelper entityHelper=new EntityHelper();

  @Given("I have selected the hotel details by clicking on the radio button")
  public void selectHotelDetails()
  {
      selectHotelPage.selectHotelDetails();
  }
}
