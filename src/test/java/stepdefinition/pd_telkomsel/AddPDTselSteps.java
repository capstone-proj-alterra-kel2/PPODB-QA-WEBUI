package stepdefinition.pd_telkomsel;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pages.pd_telkomsel.AddPDTsel;


public class AddPDTselSteps {

    @Steps
    AddPDTsel addPDTsel;

    @Then("I click tambah produk")
    public void ClickTambahProduk(){
        addPDTsel.ClickTambahProduk();
    }

    @And("I input nama produk")
    public void InputNama(){
        addPDTsel.InputName("Paket Keluarga 2");
    }

    @And("I input stock produk")
    public void InputStock(){
        addPDTsel.InputStock("50");
    }

    @And("I input provider telkomsel")
    public void InputProvider(){
        addPDTsel.InputProvider();
        addPDTsel.PilihTelkomsel();
    }

    @And("I input harga produk")
    public void InputHarga(){
        addPDTsel.InputHarga("15000");
    }

    @Then("I choose status harga")
    public void ChooseStatus(){
        addPDTsel.ChooseStatus();
    }

    @And("I click tambahkan")
    public void ClickTambahkan(){
        addPDTsel.ClickTambahkan();
        addPDTsel.ClickTambahkan();
    }

    @Then("I still in add produk")
    public void InAddProduk(){
        addPDTsel.InAddProduk();
    }
}
