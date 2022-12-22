package pages.manage_user;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class AddUserPage extends PageObject {

    private By clickTambahPengguna(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[1]/div[2]/div[2]");
    }

    private By inputName(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[3]/div/div/div[1]/div[3]/div/input");
    }

    private By inputemail(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[3]/div/div/div[1]/div[4]/div/input");
    }

    private By inputPhoneNumber(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[3]/div/div/div[1]/div[5]/div/input");
    }

    private By inputPassword(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[3]/div/div/div[1]/div[6]/div/input");
    }

    private By clickSimpan(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[3]/div/div/div[2]/button[2]");
    }

    private By ErrorADD(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[3]/div/div/div[1]/div[1]/img");
    }

    @Step
    public void ClickTambahPengguna(){
        $(clickTambahPengguna()).click();
    }

    @Step
    public void InputName(String name){
        $(inputName()).type(name);
    }

    @Step
    public void InputEmail(String email){
        $(inputemail()).type(email);
    }

    @Step
    public void InputPhoneNumber(String number){
        $(inputPhoneNumber()).type(number);
    }

    @Step
    public void InputPassword(String password){
        $(inputPassword()).type(password);
    }

    @Step
    public void ClickSimpan(){
        $(clickSimpan()).click();
    }

    @Step
    public void Error(){
        $(ErrorADD()).isDisplayed();
    }
}
