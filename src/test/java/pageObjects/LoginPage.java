package pageObjects;

import browserControl.webConnector;


public class LoginPage extends webConnector {

    /***** Locators*****/
    private String usernameFieldXpath = "//input[@id='user-name']";
    private String passwordFieldXpath = "//input[@id= 'password']";
    private String loginButtonXpath = "//input[@id='login-button']";
    // private String logoutButtonXpath = "//a[@id='logout_sidebar_link']";



    public void setUsername (String username){
        BasePage.findElementByXpath(10, usernameFieldXpath).clear();
        BasePage.findElementByXpath(10, usernameFieldXpath).sendKeys(username);
    }

    public void setPassword (String password){
        BasePage.findElementByXpath(10, passwordFieldXpath).clear();
        BasePage.findElementByXpath(10, passwordFieldXpath).sendKeys(password);
    }
    /**
     * click on login button
     */
    public void clickLoginButton () {
        BasePage.findElementByXpath(10, loginButtonXpath).click();
    }


    }
/**
 * click logout button
 *
 */
//public void clickLogoutButton(){
    //       BasePage.findElementByXpath(10, logoutButtonXpath).click();
//}
