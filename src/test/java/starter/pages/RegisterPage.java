package starter.pages;

import net.serenitybdd.core.pages.ResolvableElement;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    private By FirstnameLastnameField(){
        return By.id("Name");
    }

    private By UserNameField(){
        return By.id("userName");
    }

    private By PasswordField(){
        return By.id("password-wrapper");
    }

    private static By RegisterButton(){
        return By.id("register");
    }



    @Step
    public static OpenUrl url (String  targetUrl) {
        return new OpenUrl("https://demoqa.com/register");
    }

    @Step
    public boolean ValidateOnRegisterPage() {
        return $(RegisterButton()).isDisplayed();
    }

    @Step
    public void inputFirstnameLastname(String Name) {
        $(FirstnameLastnameField()).type(Name);
    }


    @Step
    public void inputValidUserName(String userName) {
        $(UserNameField()).type(userName);
    }

    @Step
    public void inputValidPassword(String password) {
        $(UserNameField()).type(password);
    }

    @Step
    public void clickRegisterButton() {
        $(RegisterButton()).click();
    }



}
