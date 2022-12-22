package pages.manage_admin;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;

public class ListAdminPage extends PageObject {

    private By clickAdmin(){
        return By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div[1]/a[4]");
    }

    private By viewListAdmin(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[1]/div[1]/div");
    }

    @Step
    public void ClickAdmin(){
        $(clickAdmin()).click();
    }

    @Step
    public void ViewListAdmin(){
        $(viewListAdmin()).isDisplayed();
    }
}
