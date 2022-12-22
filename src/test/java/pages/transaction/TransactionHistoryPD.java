package pages.transaction;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class TransactionHistoryPD extends PageObject {
    private By clickTansactionHistory(){
        return By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div[1]/a[3]");
    }

    private By choose(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div[2]/select");
    }

    private  By choosePaketData(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div[2]/select/option[3]");
    }

    private By viewListPDtransaction(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div[2]/div/div[2]/div[1]");
    }

    @Step
    public void Choose(){
        $(choose()).click();
    }

    @Step
    public void ClickTansactionHistory(){
        $(clickTansactionHistory()).click();
    }

    @Step
    public void ChoosePaketData(){
        $(choosePaketData()).click();
    }

    @Step
    public void ViewListPD(){
        $(viewListPDtransaction()).isDisplayed();
    }
}
