package pageObjects;

import browserControl.webConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends webConnector {

    public static WebElement findElementByXpath(int time, String xpath) {
        return new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }


    }
