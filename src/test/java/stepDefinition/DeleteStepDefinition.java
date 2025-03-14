package stepDefinition;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.HomePage;


public class DeleteStepDefinition {
    static WebDriver driver;

    HomePage homePage;

    @And("user delete a task")
    public void userDeleteATask() {
        homePage = new HomePage(driver);
        homePage.setBtn_delete();

    }
}
