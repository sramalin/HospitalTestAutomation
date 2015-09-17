
package main.java.Resources.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by sramalin on 17/09/15.
 */
public class Basepage {

     WebDriver webDriver;
     String hostURL = "http://localhost:8000/aspire";


    public LoginPage launchApp(){


        System.setProperty("webdriver.chrome.driver", "../hospitaltestautomation/src/chromedriver/chromedriverMAC");
        // System.setProperty("webdriver.chrome.driver", "../hospitaltestautomation/src/chromedriver/chromedriver_win32/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.navigate().to(hostURL);
        return new LoginPage(webDriver);



    }
}
