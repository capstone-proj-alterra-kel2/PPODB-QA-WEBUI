package pages.pd_simpati;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ListPDSimpati extends PageObject {
    private By clickSimpati(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div/a[3]");
    }

    private By viewListPDSimpati(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div[1]/div[1]/div[1]/div");
    }

    @Step
    public void ClickSimpati(){
        $(clickSimpati()).click();
    }

    @Step
    public void ViewListPDSimpati(){
        $(viewListPDSimpati()).isDisplayed();
    }
}
