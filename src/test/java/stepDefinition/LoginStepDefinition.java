package stepDefinition;

import driverFacrory.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginStepDefinition {
    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setUp(){
        driver = DriverFactory.getDriver("gecko");

    }

    @Given("user on login page")
    public void userOnLoginPage() {
        driver.navigate().to("http://kali/apps/login.php");

    }

    @When("^user input valid (.+) (.+) and confirm$")
    public void userInputValidUserEmailPasswordAndConfirm(String email, String password) {
        loginPage = new LoginPage(driver);
        loginPage.positiveLogin(email,password);
        loginPage.performLogout();
    }

    @And("^admin user input valid (.+) (.+) and confirm$")
    public void adminUserInputValidUserEmailPasswordAndConfirm(String email, String password ) {
        loginPage.positiveLogin(email,password);
        loginPage.performLogout();
    }

    @Then("^perform login with invalid (.+) (.+)$")
    public void performLoginWithInvalidInvalidEmailInvalidPassword(String email, String password) {
        loginPage.negativeLogin(email,password);


    }

//    @After
//    public void tearDown(){
//        driver.quit();
//    }
}
