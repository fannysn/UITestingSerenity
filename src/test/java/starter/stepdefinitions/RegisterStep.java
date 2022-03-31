package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProfilePage;
import starter.pages.RegisterPage;
import starter.pages.LoginPage;

public class RegisterStep {

    @Steps
    LoginPage LoginPage;

    @Steps
    RegisterPage RegisterPage;

    @Given("I am on the Register Page")
    public void iAmOnTheRegisterPage() {
        RegisterPage.openUrl("https://demoqa.com/register");
        RegisterPage.ValidateOnRegisterPage();
    }

    @When("I input firstname & lastname")
    public void inputFirstnameLastname(){
        RegisterPage.inputFirstnameLastname("Fanny Septi Nurcahyani");
    }

    @And("I input valid username")
    public void inputValidUsername(){
        RegisterPage.inputValidUserName("Fanny279");
    }

    @And("I input valid password")
    public void inputValidPassword(){
        RegisterPage.inputValidPassword("Fanny279!");
    }

    @And("click button register")
    public void clickButtonRegister(){
        RegisterPage.clickRegisterButton();
    }

    @Then("I am on the Login Page")
    public void onTheLoginPage(){
        LoginPage.ValidateOnLoginPage();
    }

}
