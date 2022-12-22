package stepdefinition.manage_admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.manage_admin.AddAdminPage;

public class AddAdminSteps {

    @Steps
    AddAdminPage addAdminPage;

    @And("I input password admin")
    public void InputPassword(){
        addAdminPage.InputPassword("admin");
    }

    @Then("I click tambah admin")
    public void ClickTambahAdmin(){
        addAdminPage.ClickTambahAdmin();
    }

    @Then("I still in add admin page")
    public void VerifyInAdmin(){
        addAdminPage.VerifyInAdmin();
    }

}
