package stepdefinition.manage_admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pages.manage_admin.DeleteAdminPage;

public class DeleteAdminSteps {

    @Steps
    DeleteAdminPage deleteAdminPage;

    @Then("I click delete admin")
    public void ClickDelete(){
        deleteAdminPage.ClickDelete();
    }

    @And("I confirm delete admin")
    public void ConfirmDelete(){
        deleteAdminPage.Confirm();
    }
}
