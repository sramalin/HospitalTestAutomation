package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by sramalin on 07/09/15.
 */
public class MyStepdefs {
    @cucumber.api.java.en.Given("^I launch the app$")
    public void I_launch_the_app() throws Throwable {
        // Express the Regexp above with the code you wish you had
        //System.setProperty("webdriver.chrome.driver", "../hospitaltestautomation/src/chromedriver/chromedriverMAC");
        System.setProperty("webdriver.chrome.driver", "../hospitaltestautomation/src/chromedriver/chromedriver_win32/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("http://localhost:8000/aspire");
    }
}
