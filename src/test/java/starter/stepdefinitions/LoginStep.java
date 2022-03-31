package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProfilePage;
import starter.pages.LoginPage;

public class LoginStep {

    @Steps
    LoginPage LoginPage;

    @Steps
    ProfilePage ProfilePage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        LoginPage.openUrl();
        LoginPage.ValidateOnLoginPage();
    }

    @When("I input valid Username")
    public void iInputValidUsername() {
        LoginPage.inputUserName("Fanny279");
    }

    @And("I input valid Password")
    public void InputValidPassword() {
        LoginPage.inputPassword("Fanny279!");
    }
    @And("click button login")
    public void clickLoginButton() {
        LoginPage.clickLoginButton();
    }
    @Then("I am on the ProfilePage")
    public void OnTheProfilePage() {
        ProfilePage.validateOnProfilePage();
    }

    @When("I input invalid Username")
    public void InputInvalidUsername() {
        LoginPage.InputInvalidUsername("Fanny");
    }

    @Then("I can see error message {string}")
    public void errorMessage(String message)
    {
        LoginPage.validateErrorMessage();
        LoginPage.validateEqualErrorMessage(message);
    }
}
