package stepdefinition.pd_telkomsel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.pd_telkomsel.ListPDTsel;

public class ListPDTselSteps {

    @Steps
    ListPDTsel listPDTsel;

    @When("I click Produk Kami")
    public void ClickProduk(){
        listPDTsel.ClickProduk();
    }

    @And("I click paket data")
    public void ClickPaketData(){
        listPDTsel.ClickPaketData();
    }

    @And("I click telkomsel")
    public void ClickTelkomsel(){
        listPDTsel.ClickTelkomsel();
    }

    @Then("I can view list paket data telkomsel")
    public void ViewListPDTsel(){
        listPDTsel.ViewListPDTsel();
    }
}
