package stepDefinition;

import hooks.Hooks;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;


public class DeleteStepDefinition {
    static WebDriver driver;
    Hooks hooks;
    LoginPage loginPage;
    HomePage homePage;

    @Before
    public void setHooks(){
        hooks = new Hooks(driver);
        driver = hooks.setUp();
    }

    @And("user delete a task")
    public void userDeleteATask() {
        homePage = new HomePage(driver);
        homePage.setBtn_delete();

    }

    @When("verify task deleted")
    public void verifyTaskDeleted() {

    }

}
