package stepdefinition.transaction;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.transaction.TransactionHistoryPD;

public class TransactionhistorySteps {

    @Steps
    TransactionHistoryPD transactionHistoryPD;

    @When("I click riwayat transaksi")
    public void ClickTransactionHistory(){
        transactionHistoryPD.ClickTansactionHistory();
    }

    @And("I choose paket data")
    public void ChoosePaketData(){
        transactionHistoryPD.Choose();
        transactionHistoryPD.ChoosePaketData();
    }

    @Then("I can view list transactio history of paket data")
    public void ViewListPDTransaction(){
        transactionHistoryPD.ViewListPD();
    }
}
