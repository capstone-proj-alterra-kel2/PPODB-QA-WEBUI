package pages.auth;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By verifyOnLogin(){
        return By.xpath("/html/body/div/div/div/div/div/h1");
    }

    private By inputEmail(){
        return By.xpath("/html/body/div/div/div/div/form/div[1]/input");
    }

    private By inputPassword() {
        return By.xpath("/html/body/div/div/div/div/form/div[2]/input");
    }

    private By clickLogin(){
        return By.xpath("/html/body/div/div/div/div/form/div[3]/button");
    }

    private  By errorMessage(){
        return By.xpath("/html/body/div/div/div/div/form/p");
    }

    private By verifyOnDashboard(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div[1]/div[1]/div");
    }

    public void openUrlLogin() {
        openAt("/");
    }

    @Step
    public void VerifyLogin(){
        $(verifyOnLogin()).isDisplayed();
    }

    @Step
    public void InputEmail(String email){
        $(inputEmail()).type(email);
    }

    @Step
    public void InputPassword(String password){
        $(inputPassword()).type(password);
    }

    @Step
    public void ClickLogin(){
        $(clickLogin()).click();
    }

    @Step
    public void ErrorMessage(){
        $(errorMessage()).isDisplayed();
    }

    @Step
    public void VerifyOnDashboard(){
        $(verifyOnDashboard()).isDisplayed();
    }
}
