package stepdefinition.auth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.auth.LoginPage;
import pages.auth.LogoutPage;

public class LogoutSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    LogoutPage logoutPage;

    @Given("I have login on MYCUAN")
    public void VerifyLoggedIn(){
        loginPage.openUrlLogin();
        loginPage.VerifyLogin();
        loginPage.InputEmail("admin@gmail.com");
        loginPage.InputPassword("admin");
        loginPage.ClickLogin();
        loginPage.VerifyOnDashboard();
    }

    @When("I click logout button")
    public void ClickLogout(){
        logoutPage.ClickLogout();
    }

    @Then("I will go to login page")
    public void NavigatedToLogin(){
        loginPage.VerifyLogin();
    }
}
