package stepdefinition.manage_user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pages.manage_user.DeleteUserPage;

public class DeleteUserSteps {

    @Steps
    DeleteUserPage deleteUserPage;

    @Then("I click delete pengguna")
    public void ClickDelete(){
        deleteUserPage.ClickDelete();
    }

    @And("I confirm delete pengguna")
    public void ConfirmDelete(){
        deleteUserPage.Confirm();
    }
}
