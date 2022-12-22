package stepdefinition.landing_page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pages.landing_page.LandingPage;

public class ProdukKamiSteps {

    @Steps
    LandingPage landingPage;

    @And("I click produk kami")
    public void ClickProdukKami(){
        landingPage.ClickProduct();
    }

    @Then("I view mycuan product")
    public void ViewProduct(){
        landingPage.ViewProduct();
    }
}
