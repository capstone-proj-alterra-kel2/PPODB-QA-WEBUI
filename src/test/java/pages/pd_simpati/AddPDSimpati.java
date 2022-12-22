package pages.pd_simpati;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;

public class AddPDSimpati extends PageObject {

    private By pilihSimpati(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div/div[3]/div/select/option[4]");
    }

    @Step
    public void PilihSimpati(){
        $(pilihSimpati()).click();
    }
}
