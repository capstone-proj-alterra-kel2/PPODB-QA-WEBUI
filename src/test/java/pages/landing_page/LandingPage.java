package pages.landing_page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LandingPage extends PageObject {
    private By clickLanding(){
        return By.xpath("/html/body/div/div/div/a");
    }

    private By navigateLanding(){
        return By.xpath("/html/body/div/div/div/nav/div[2]/span");
    }

    private By clickTentangKami(){
        return By.xpath("/html/body/div/div/div/nav/div[1]/ul/li[1]/a");
    }

    private By viewTentangKami(){
        return By.xpath("/html/body/div/div/div/div[8]/div[1]/p");
    }

    private By clickProdukKami(){
        return By.xpath("/html/body/div/div/div/nav/div[1]/ul/li[2]/a");
    }

    private By viewProduct(){
        return By.xpath("/html/body/div/div/div/div[8]/div[2]/p/b");
    }

    private By clickDownload(){
        return By.xpath("/html/body/div/div/div/nav/div[3]/ul/li[1]/a");
    }

    private By viewDownload(){
        return By.xpath("/html/body/div/div/div/div[13]/div[1]/p");
    }

    private By clickKontak(){
        return By.xpath("/html/body/div/div/div/nav/div[3]/ul/li[2]/a");
    }

    private By viewKontak(){
        return By.xpath("/html/body/div/div/div/div[14]/div/div[1]/div[2]");
    }

    @Step
    public void ClickKontak(){
        $(clickKontak()).click();
    }

    @Step
    public void ViewKontak(){
        $(viewKontak()).isDisplayed();
    }

    @Step
    public void ClickDownload(){
        $(clickDownload()).click();
    }

    @Step
    public void ViewDownload(){
        $(viewDownload()).isDisplayed();
    }

    @Step
    public void ClickProduct(){
        $(clickProdukKami()).click();
    }

    @Step
    public void ViewProduct(){
        $(viewProduct()).isDisplayed();
    }
    @Step
    public void ClickLanding(){
        $(clickLanding()).click();
    }

    @Step
    public void NavigateLanding(){
        $(navigateLanding()).isDisplayed();
    }

    @Step
    public void ClickTentangKami(){
        $(clickTentangKami()).click();
    }

    @Step
    public void ViewTentangKami(){
        $(viewTentangKami()).isDisplayed();
    }
}
