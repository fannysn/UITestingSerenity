package starter.pages;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class LoginPage extends PageObject {

    private By UserNameField(){
        return By.id("userName");
    }

    private By PasswordField(){
        return By.id("password-wrapper");
    }

    private static By loginButton(){
        return By.id("login");
    }

    private By errorMessage() {
        return By.xpath("//div[@class='Invalid username or password!']");
    }


    @Step
    public static OpenUrl url (String  targetUrl) {
        return new OpenUrl("https://demoqa.com/login");
    }

    @Step
    public boolean ValidateOnLoginPage() {
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUserName(String userName) {
        $(UserNameField()).type(userName);
    }

    @Step
    public void inputPassword(String password) {
        $(UserNameField()).type(password);
    }

    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }

    @Step
    public void InputInvalidUsername(String userName) {
        $(UserNameField()).type(userName);
    }

    @Step
    public boolean validateErrorMessage()
    {
        return $ (errorMessage()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessage(String message)
    {
        return $ (errorMessage()).getText().equalsIgnoreCase(message);
    }






















    public static void openUrl() {
    }
}
