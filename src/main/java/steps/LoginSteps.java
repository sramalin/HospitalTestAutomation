package main.java.steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.java.Resources.Pages.Basepage;
import main.java.Resources.Pages.LoginPage;
import main.java.Resources.Pages.HomePage;




/**
 * Created by sramalin on 07/09/15.
 */
public class LoginSteps {


    protected LoginPage loginPage;
    protected HomePage homePage;

    @cucumber.api.java.en.Given("^I launch the app$")
    public void I_launch_the_app() throws Throwable {
        Basepage basepage = new Basepage();
        loginPage = basepage.launchApp();
        // Express the Regexp above with the code you wish you had

    }

    @When("^I login with user name \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void I_login_with_user_name_and_password(String username, String pwd) throws Throwable {
        // Express the Regexp above with the code you wish you had
        homePage = loginPage.doLogin(username, pwd);

    }

    @Then("^Home page should be loaded$")
    public void Home_page_should_be_loaded() throws Throwable {
        // Express the Regexp above with the code you wish you had
        System.out.println("TODO : Validation for home page");

        //webDriver.findElement(By.className("dropdown-toggle")).getText()
    }
}
