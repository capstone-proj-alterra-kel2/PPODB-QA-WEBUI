package pages.manage_user;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class EditUserPage extends PageObject {

    private By clickEdit(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[2]/div[1]/div[2]/button[1]");
    }

    private By inputName(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[3]/div/div/div[1]/div[3]/div/input");
    }

    private By inputEmail(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[3]/div/div/div[1]/div[4]/div/input");
    }

    private By inputPhone(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[3]/div/div/div[1]/div[5]/div/input");
    }

    private By clickSimpan(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[3]/div/div/div[2]/button[2]");
    }

    @Step
    public void ClickEdit(){
        $(clickEdit()).click();
    }

    @Step
    public void InputName(String name){
        $(inputName()).type(name);
    }

    @Step
    public void InputEmail(String email){
        $(inputEmail()).type(email);
    }

    @Step
    public void InputPhone(String number){
        $(inputPhone()).type(number);
    }

    @Step
    public void ClickSimpan(){
        $(clickSimpan()).click();
    }
}
