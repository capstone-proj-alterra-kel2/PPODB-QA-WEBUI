package pages.pd_telkomsel;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DeletePDTsel extends PageObject {

    private By clickDelete(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/button");
    }

    private By clickConfirm(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div[2]/div/div/div[3]/button[2]");
    }

    @Step
    public void ClickDelete(){
        $(clickDelete()).click();
    }

    @Step
    public void ClickConfirm(){
        $(clickConfirm()).click();
    }
}
