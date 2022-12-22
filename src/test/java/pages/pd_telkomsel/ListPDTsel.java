package pages.pd_telkomsel;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ListPDTsel extends PageObject {

    private By clickProduk(){
        return By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div[1]/a[2]");
    }

    private By clickPaketData(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[1]/div/a[2]");
    }

    private By clickTelkomsel(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div/a[1]");
    }

    private By viewListPDTsel(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div[1]/div[1]/div[1]/div");
    }

    @Step
    public void ClickProduk(){
        $(clickProduk()).click();
    }

    @Step
    public void ClickPaketData(){
        $(clickPaketData()).click();
    }

    @Step
    public void ClickTelkomsel(){
        $(clickTelkomsel()).click();
    }

    @Step
    public void ViewListPDTsel(){
        $(viewListPDTsel()).isDisplayed();
    }
}
