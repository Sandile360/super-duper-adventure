package stepDefinition;

import driverFacrory.DriverFactory;
import hooks.Hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDefinition {
    static WebDriver driver;
    Hooks hooks;
    LoginPage loginPage;
    HomePage homePage;

    @Before
    public void setHooks(){
        hooks = new Hooks(driver);
        driver = hooks.setUp();
    }

//    @After
    public void tearHooks(){
        hooks.tearDown();
    }

    @Given("user on login page")
    public void userOnLoginPage() {
        Assert.assertEquals(driver.getCurrentUrl(),"http://kali/apps/login.php");

    }

    @When("^user input valid (.+) (.+) and confirm$")
    public void userInputValidUserEmailPasswordAndConfirm(String email, String password) {
        loginPage =  new LoginPage(driver);
        loginPage.positiveLogin(email,password);
    }

    @And("click logout")
    public void logout() {
        homePage.performLogout();
    }

    @When("^admin user input valid (.+) (.+) and confirm$")
    public void adminUserInputValidUserEmailPasswordAndConfirm(String email, String password ) {
        loginPage.positiveLogin(email,password);
    }

    @Then("^perform login with invalid (.+) (.+)$")
    public void performLoginWithInvalidInvalidEmailInvalidPassword(String email, String password) {
        loginPage.negativeLogin(email,password);
    }

}
