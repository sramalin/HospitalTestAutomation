package main.java.Resources.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by sramalin on 17/09/15.
 */
public class LoginPage extends Basepage {

    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public HomePage doLogin(String username, String pwd){

        webDriver.findElement(By.id("auth_user_username")).sendKeys(username);
        webDriver.findElement(By.id("auth_user_password")).sendKeys(pwd);
        webDriver.findElement(By.className("btn")).click();
        return new HomePage(webDriver);

    }
}
