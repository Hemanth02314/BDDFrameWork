package pageObjects;

import browserControl.webConnector;

public class LoginPage extends webConnector {

    /***Locators**/
    private String usernameFieldXpath = "//input[@id='user-name']";
    private String passwordFieldXpath ="//input[@id='password']";
    private String loginButtonXpath   ="//input[@id='login-button']";




    /*** Getters and setters*****/
    /***Set usernamefield****/

    public void setSwagUsername(String username) {

        BasePage.findElementByXpath(10, usernameFieldXpath).clear();
        BasePage.findElementByXpath(10, usernameFieldXpath).sendKeys(username);

    }

    /***set swag password***/
    public void setSwagPassword(String password){
        BasePage.findElementByXpath(10, passwordFieldXpath).clear();
        BasePage.findElementByXpath(10, passwordFieldXpath).sendKeys(password);

    }
    /** click login **/

    public void clickSwagLoginButton(){

        BasePage.findElementByXpath(10, loginButtonXpath).click();

    }

}
