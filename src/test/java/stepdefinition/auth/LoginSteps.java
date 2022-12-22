package stepdefinition.auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.auth.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Given("I am on the login page")
    public void VerifyOnLogin(){
        loginPage.openUrlLogin();
        loginPage.VerifyLogin();
    }

    @When("I input valid email")
    public void InputValidEmail(){
        loginPage.InputEmail("admin@gmail.com");
    }

    @And("I input valid password")
    public void InputValidPassword(){
        loginPage.InputPassword("admin");
    }

    @And("I click Login button")
    public void ClickLogin(){
        loginPage.ClickLogin();
    }

    @Then("I navigated to MYCUAN dashboard")
    public void NavigatedDashboard(){
        loginPage.VerifyOnDashboard();
    }

    @And("I input invalid password")
    public void InputInvalidPassword(){
        loginPage.InputPassword("admin123");
    }

    @And("I input invalid email")
    public void InputInvalisEmail(){
        loginPage.InputEmail("admin2@gmail.com");
    }

    @Then("I will get invalid message")
    public void ErrorMessage(){
        loginPage.ErrorMessage();
    }
}
