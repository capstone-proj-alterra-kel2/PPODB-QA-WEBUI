package pages.manage_user;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DeleteUserPage extends PageObject {

    private By clickDelete(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[2]/div[1]/div[2]/button[2]");
    }

    private By confirm(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[3]/div/div/div[3]/button[2]");
    }

    @Step
    public void ClickDelete(){
        $(clickDelete()).click();
    }

    @Step
    public void Confirm(){
        $(confirm()).click();
    }
}
