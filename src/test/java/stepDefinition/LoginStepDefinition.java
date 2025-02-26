package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
    @Given("user on login page")
    public void userOnLoginPage() {
    }

    @When("user input valid <userEmail> <password> and confirm")
    public void userInputValidUserEmailPasswordAndConfirm() {
    }

    @And("admin user input valid <adminEmail> <adminPassword> and confirm")
    public void adminUserInputValidAdminEmailAdminPasswordAndConfirm() {
    }

    @Then("perform login with invalid <invalidEmail> <invalidPassword>")
    public void performLoginWithInvalidInvalidEmailInvalidPassword() {
    }
}
