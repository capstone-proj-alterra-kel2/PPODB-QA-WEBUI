package pages.auth;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {
    private By clickLogout(){
        return By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div[2]/button");
    }

    @Step
    public void ClickLogout(){
        $(clickLogout()).click();
    }
}
