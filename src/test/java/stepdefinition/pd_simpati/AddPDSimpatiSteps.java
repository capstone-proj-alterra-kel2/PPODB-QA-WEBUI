package stepdefinition.pd_simpati;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import pages.pd_simpati.AddPDSimpati;
import pages.pd_telkomsel.AddPDTsel;

public class AddPDSimpatiSteps {
    @Steps
    AddPDTsel addPDTsel;

    @Steps
    AddPDSimpati addPDSimpati;

    @And("I input provider simpati")
    public void InputProvider(){
        addPDTsel.InputProvider();
        addPDSimpati.PilihSimpati();
    }
}
