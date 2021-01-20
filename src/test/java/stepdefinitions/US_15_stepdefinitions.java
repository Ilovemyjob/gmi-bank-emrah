package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CustomerPageOmer;
import pages.SignInOmer;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_15_stepdefinitions {
    SignInOmer omer = new SignInOmer();
    CustomerPageOmer customerPageOmer = new CustomerPageOmer();

    @Given("go to log in page")
    public void go_to_log_in_page() {
        Driver.getDriver().get("http://www.gmibank.com/login");
        ReusableMethods.waitFor(3);

    }


    @Then("enter username {string}")
    public void enterUsername(String username) {
        omer.username.sendKeys(username);

    }

    @Then("enter password {string}")
    public void enterPassword(String password) {
        omer.password.sendKeys(password);
    }

    @Then("click on Sign in")
    public void click_on_sign_in() {
        omer.sign_in.click();
        ReusableMethods.waitFor(3);
    }

    @Then("click on My operations")
    public void click_on_my_operations() {
        customerPageOmer.My_Operations.click();
        ReusableMethods.waitFor(2);
    }

    @Then("click on My Accounts")
    public void click_on_my_accounts() {
        customerPageOmer.My_Accounts.click();
        ReusableMethods.waitFor(2);
    }

    @Then("verify if account able to see all accounts")
    public void verify_if_account_able_to_see_all_accounts() {
        Assert.assertTrue(customerPageOmer.View_Transaction1.isDisplayed());

    }

    @Then("check if View Transaction is click able")
    public void check_if_view_transaction_is_click_able() {
        Assert.assertTrue(customerPageOmer.View_Transaction1.isDisplayed());
    }


}
