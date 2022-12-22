package pages.manage_admin;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class AddAdminPage extends PageObject {

    private  By inputPassword(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[3]/div/div/div[1]/div[5]/div/input");
    }
    private By clickTambahAdmin(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[1]/div[2]/div[2]");
    }

    private By verifyInAdmin(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[3]/div/div/div[1]/div[1]/img");
    }


    @Step
    public void InputPassword(String password){
        $(inputPassword()).type(password);
    }
    @Step
    public void ClickTambahAdmin(){
        $(clickTambahAdmin()).click();
    }

    @Step
    public void VerifyInAdmin(){
        $(verifyInAdmin()).isDisplayed();
    }
}
