package stepdefinition.pd_telkomsel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.pd_telkomsel.EditPDTsel;

public class EditPDTselSteps {

    @Steps
    EditPDTsel editPDTsel;


    @Then("I click edit produk")
    public void ClickEditProduk(){
        editPDTsel.ClickEdit();
    }

    @And("I edit nama produk")
    public void EditNamaProduk(){
        editPDTsel.EditNama("Paket Family 1");
    }

    @And("I edit stock produk")
    public void EditStockProduk(){
        editPDTsel.EditStock("10");
    }

    @And("I edit harga produk")
    public void EditHargaProduk(){
        editPDTsel.EditHarga("45000");
    }

    @And("I edit status harga")
    public void EditStatusHarga(){
        editPDTsel.EditStatus();
    }

    @When("I click tambahkan edit")
    public void ClickTambah(){
        editPDTsel.ClickTambahkan();
    }

    @Then("I still in edit produk")
    public void InEditProduk(){
        editPDTsel.InEditProduk();
    }
}
