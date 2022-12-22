package stepdefinition.manage_admin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.manage_admin.ListAdminPage;

public class ListAdminSteps {

    @Steps
    ListAdminPage listAdminPage;
    @When("I click Akun Admin")
    public void ClickAdmin(){
        listAdminPage.ClickAdmin();
    }

    @Then("I can view list admins")
    public void ViewListAdmin(){
        listAdminPage.ViewListAdmin();
    }
}
