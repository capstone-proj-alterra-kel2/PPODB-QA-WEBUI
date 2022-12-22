package stepdefinition.landing_page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pages.landing_page.LandingPage;

public class KotakSteps {

    @Steps
    LandingPage landingPage;

    @And("I click kontak")
    public void ClickKontak(){
        landingPage.ClickKontak();
    }

    @Then("I view mycuan contact person")
    public void ViewKontak(){
        landingPage.ViewKontak();
    }
}
