package stepdefinition.manage_user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.manage_user.AddUserPage;

public class AddUserSteps {

    @Steps
    AddUserPage addUserPage;

    @Then("I click tambah pengguna")
    public void ClickTambahPengguna(){
        addUserPage.ClickTambahPengguna();
    }

    @And("I input name")
    public void InputName(){
        addUserPage.InputName("User tes 3");
    }

    @And("I input correct email")
    public void InputCorrectEmail(){
        addUserPage.InputEmail("use3@gmail.com");
    }

    @And("I input correct phone number")
    public void InputCorrectPhoneNumber(){
        addUserPage.InputPhoneNumber("081123456789");
    }

    @And("I input password")
    public void InputPassword(){
        addUserPage.InputPassword("user");
    }

    @When("I click simpan")
    public void ClickSimpan(){
        addUserPage.ClickSimpan();
    }

    @Then("I still in add user page")
    public void ErroeAdd(){
        addUserPage.Error();
    }

    @And("I input incorrect email")
    public void InputIncorrectEmail(){
        addUserPage.InputEmail("user.email.com");
    }

    @And("I input incorrect phone number")
    public void InputIncorrectPhoneNumber(){
        addUserPage.InputPhoneNumber("abcdefgh");
    }
}
