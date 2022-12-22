package stepdefinition.manage_user;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.manage_user.ListUserPage;

import javax.swing.text.View;

public class ListUserSteps {

    @Steps
    ListUserPage listUserPage;

    @When("I click Pengguna")
    public void ClickPengguna(){
        listUserPage.ClickPengguna();
    }

    @Then("I can view list user")
    public void ViewPengguna(){
        listUserPage.ViewPengguna();
    }
}
