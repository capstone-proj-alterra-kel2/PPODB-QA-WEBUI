package stepdefinition.manage_admin;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import pages.manage_admin.EditAdminPage;

public class EditAddminSteps {

    @Steps
    EditAdminPage editAdminPage;

    @And("I click kembali")
    public void ClickKembali(){
        editAdminPage.ClickBtnKembali();
    }
}
