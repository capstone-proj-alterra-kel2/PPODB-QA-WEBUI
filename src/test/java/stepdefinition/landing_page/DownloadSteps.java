package stepdefinition.landing_page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pages.landing_page.LandingPage;

public class DownloadSteps {

    @Steps
    LandingPage landingPage;

    @And("I click download aplikasi")
    public void ClickDownload(){
        landingPage.ClickDownload();
    }

    @Then("I vew mycuan app download")
    public void ViewDownload(){
        landingPage.ViewDownload();
    }
}
