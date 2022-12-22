package pages.manage_admin;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class EditAdminPage extends PageObject {

    private By clickKembali(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[3]/div/div/div[2]/button[1]");
    }

    @Step
    public void ClickBtnKembali(){
        $(clickKembali()).click();
    }
}
