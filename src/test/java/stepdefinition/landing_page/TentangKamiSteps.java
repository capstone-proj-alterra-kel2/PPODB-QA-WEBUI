package stepdefinition.landing_page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.landing_page.LandingPage;

public class TentangKamiSteps {

    @Steps
    LandingPage landingPage;

    @When("I click landing")
    public void ClickLanding(){
        landingPage.ClickLanding();
    }

    @Then("I navigated to landing page")
    public void NavigatedLanding(){
        landingPage.NavigateLanding();
    }

    @And("I click tentang kami")
    public void ClickTentangKami(){
        landingPage.ClickTentangKami();
    }

    @Then("I view mycuan description")
    public void ViewTentangKami(){
        landingPage.ViewTentangKami();
    }
}
