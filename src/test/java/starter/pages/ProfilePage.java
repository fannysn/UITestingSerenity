package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class ProfilePage extends PageObject {

    private By tittle(){
        return By.className("tittle");
    }

    @Step
    public void validateOnProfilePage() {
        $(tittle()).isDisplayed();
    }

}
