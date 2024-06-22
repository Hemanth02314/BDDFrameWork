package browserControl;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static browserControl.webConnector.closeBrowser;
import static browserControl.webConnector.openBrowser;


    public class CucumberHooks extends webConnector {


    @Before
    public void setup() {
        openBrowser();
    }

    @After
    public void teardown() {
        closeBrowser();
    }

}
