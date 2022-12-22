package stepdefinition.manage_user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.manage_user.EditUserPage;

public class EditUserSteps {

    @Steps
    EditUserPage editUserPage;

    @Then("I click edit")
    public void ClickEdit(){
        editUserPage.ClickEdit();
    }

    @And("I edit name")
    public void EditName(){
        editUserPage.InputName("User Edit 3");
    }

    @And("I edit correct email")
    public void EditEmail(){
        editUserPage.InputEmail("useredit3@gmail.com");
    }

    @And("I edit correct phone number")
    public void EditPhoneNumber(){
        editUserPage.InputPhone("082113456789");
    }

    @When("I click simpan edit")
    public void ClickSimpanEdit(){
        editUserPage.ClickSimpan();
    }

    @And("I edit incorrect email")
    public void EditIncorrectEmail(){
        editUserPage.InputEmail("user.gmail.com");
    }

    @And("I edit incorrect phone number")
    public void EditInccorectPhoneNumber(){
        editUserPage.InputPhone("abcdefgh");
    }
}
