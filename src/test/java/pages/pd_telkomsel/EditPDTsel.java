package pages.pd_telkomsel;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class EditPDTsel extends PageObject {
    private By clickEdit(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/a");
    }

    private By EditNama(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div/div[1]/input");
    }

    private By EditStock(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div/div[2]/input");
    }

    private  By EditHarga(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div/div[2]/input");
    }

    private By editStatus(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div/div[4]/div/input[1]");
    }

    private By InEdit(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/h1");
    }

    private By clickTambahkan(){
        return By.xpath("/html/body/div/div/div/div[2]/div[3]/div/div/div/div[5]/button[2]");
    }

    @Step
    public void ClickTambahkan(){
        $(clickTambahkan()).click();
    }

    @Step
    public void ClickEdit(){
        $(clickEdit()).click();
    }

    @Step
    public void EditNama(String nama){
        $(EditNama()).type(nama);
    }

    @Step
    public void EditStock(String stock){
        $(EditStock()).type(stock);
    }

    @Step
    public void EditHarga(String harga){
        $(EditHarga()).type(harga);
    }

    @Step
    public void EditStatus(){
        $(editStatus()).click();
    }

    @Step
    public void InEditProduk(){
        $(InEdit()).isDisplayed();
    }
}
