package stepdefinition.pd_simpati;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pages.pd_simpati.ListPDSimpati;

public class ListPDSimpatiSteps {

    @Steps
    ListPDSimpati listPDSimpati;
    @And("I click simpati")
    public void ClickSimpati(){
        listPDSimpati.ClickSimpati();
    }

    @Then("I can view list paket data simpati")
    public void ViewListPDSimpati(){
        listPDSimpati.ViewListPDSimpati();
    }
}
