package com.Adactin.step.definitions;

import com.Adactin.helpers.EntityHelper;
import com.Adactin.page.objects.LoginPage;
import com.Adactin.utilities.BaseClass;
import com.Adactin.utilities.FileReaderManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginPageSteps extends BaseClass {

    public static WebDriver driver = setChromeBrowser();
    private final LoginPage loginPage = new LoginPage(driver);

    public static FileReaderManager frm = new FileReaderManager();

    public static EntityHelper entityHelper = new EntityHelper();

    /**
     * To navigate to the Adactin Login Page
     */
    @Given("I have navigated to Adactin Login Page")
    public void navigateToLogin() throws IOException {
        loadURL(frm.getPropertyValue("url"));
    }

    /**
     * To enter credentials for login
     * @param id - id to define customer from json
     */
    @Given("I Enter credentials as user {string} and click on login button")
    public void login(String id) {
       loginPage.setUsername(entityHelper.getCustomerDataById(id).getUsername());
       loginPage.setPassword(entityHelper.getCustomerDataById(id).getPassword());
       loginPage.clickLogin();
    }
    @Given("I Enter username {string},password {string} and click on Login button")
    public void loginSteps(String username, String password){
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }
    @Then("I validate the error message {string}")
    public void validateErrorMessage(String errorMessage){
        assertTrue(loginPage.getMessage(),errorMessage,"Invalid Login details or Your Password might have expired");
    }
    
}
