package pages.pd_telkomsel;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class AddPDTsel extends PageObject {

    private By clickTambahProduk(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div[1]/div[1]/div[2]/a");
    }

    private By inputNama(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div/div[1]/div/input");
    }

    private By inputStock(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div/div[2]/div/input");
    }

    private By inputProvider(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div/div[3]/div/select");
    }

    private By pilihTelkomsel(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div/div[3]/div/select/option[2]");
    }

    private By inputHarga(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div/div[4]/div/input");
    }

    private By chooseStatus(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div/div[5]/div/input[1]");
    }

    private By clickTambahkan(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div/div[6]/button[2]");
    }

    private By inAddProduk(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/h1");
    }

    @Step
    public void ClickTambahProduk(){
        $(clickTambahProduk()).click();
    }

    @Step
    public void InputName(String name){
        $(inputNama()).type(name);
    }

    @Step
    public void InputStock(String stock){
        $(inputStock()).type(stock);
    }

    @Step
    public void InputProvider(){
        $(inputProvider()).click();
    }

    @Step
    public void PilihTelkomsel(){
        $(pilihTelkomsel()).click();
    }

    @Step
    public void InputHarga(String harga){
        $(inputHarga()).type(harga);
    }

    @Step
    public void ChooseStatus(){
        $(chooseStatus()).click();
    }

    @Step
    public void ClickTambahkan(){
        $(clickTambahkan()).click();
    }

    @Step
    public void InAddProduk(){
        $(inAddProduk()).isDisplayed();
    }
}
