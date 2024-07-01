package stepDefinations;

import browserControl.webConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.LoginPage;
import utilities.ConstantUtils;


public class LoginStepDefinitions extends webConnector {
    LoginPage loginpage= new LoginPage();

    @Given("the user navigate to home page")
    public void the_User_Navigate_To_Page() {
        driver.get(ConstantUtils.BASE_URL);
    }


    @When("the user login with {string} username and {string} password")
    public void the_User_Log_in_With_Username_And_Password(String username, String password) {
        loginpage.setUsername(username);
        loginpage.setPassword(password);
    }


    @And("the user click on login button")
    public void the_User_Click_On_Login_Button() {
        loginpage.clickLoginButton();

    }



    @Then("the user should see {string}")
    public void the_User_Should_See(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }




}