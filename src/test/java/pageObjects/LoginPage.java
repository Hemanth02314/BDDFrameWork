package pageObjects;

import browserControl.webConnector;

public class LoginPage extends webConnector {



    public void setSwagUsername(String username) {


        String usernameFieldXpath = "//input[@id='user-name']";
        BasePage.findElementByXpath(10, usernameFieldXpath).clear();
        BasePage.findElementByXpath(10, usernameFieldXpath).sendKeys(username);

    }

    /***set swag password***/
    public void setSwagPassword(String password){
        String passwordFieldXpath = "//input[@id='password']";
        BasePage.findElementByXpath(10, passwordFieldXpath).clear();
        BasePage.findElementByXpath(10, passwordFieldXpath).sendKeys(password);

    }
    /** click login **/

    public void clickSwagLoginButton(){

        String loginButtonXpath = "//input[@id='login-button']";
        BasePage.findElementByXpath(10, loginButtonXpath).click();

    }

}
