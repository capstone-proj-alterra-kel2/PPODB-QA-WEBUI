package stepdefinition.pd_telkomsel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.pd_telkomsel.DeletePDTsel;

public class DeletePDTselSteps {

    @Steps
    DeletePDTsel deletePDTsel;

    @When("I click delete produk")
    public void ClickDelete(){
        deletePDTsel.ClickDelete();
    }

    @And("I click confirm")
    public void CLickConfirm(){
        deletePDTsel.ClickConfirm();
    }
}
