package pages.manage_user;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ListUserPage extends PageObject {

    private By clickPengguna(){
        return By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div[1]/a[1]");
    }

    private By viewListUser(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[1]/div[1]/div");
    }

    @Step
    public void ClickPengguna(){
        $(clickPengguna()).click();
    }

    @Step
    public void ViewPengguna(){
        $(viewListUser()).isDisplayed();
    }
}
